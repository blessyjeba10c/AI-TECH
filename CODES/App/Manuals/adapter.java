// ManualAdapter.java
public class ManualAdapter extends RecyclerView.Adapter<ManualAdapter.ViewHolder> {
    private List<Manual> manuals = new ArrayList<>();

    // ViewHolder class

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate layout for each item
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Manual manual = manuals.get(position);
        holder.titleTextView.setText(manual.getTitle());
        holder.descriptionTextView.setText(manual.getDescription());

        holder.itemView.setOnClickListener(v -> {
            // Open the manual URL in a browser or a PDF viewer
        });
    }

    @Override
    public int getItemCount() {
        return manuals.size();
    }

    public void setManuals(List<Manual> manuals) {
        this.manuals = manuals;
        notifyDataSetChanged();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        TextView descriptionTextView;

        ViewHolder(View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
        }
    }
}
