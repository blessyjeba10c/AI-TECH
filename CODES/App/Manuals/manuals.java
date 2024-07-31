// ManualService.java (using Retrofit)
public interface ManualService {
    @GET("manuals")
    Call<List<Manual>> getManuals();
}
