// ManualRepository.java
public class ManualRepository {
    private ManualService manualService;

    public ManualRepository() {
        // Initialize Retrofit and manualService
    }

    public LiveData<List<Manual>> getManuals() {
        MutableLiveData<List<Manual>> manualsLiveData = new MutableLiveData<>();

        manualService.getManuals().enqueue(new Callback<List<Manual>>() {
            @Override
            public void onResponse(Call<List<Manual>> call, Response<List<Manual>> response) {
                if (response.isSuccessful()) {
                    manualsLiveData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<Manual>> call, Throwable t) {
                // Handle failure
            }
        });

        return manualsLiveData;
    }
}
