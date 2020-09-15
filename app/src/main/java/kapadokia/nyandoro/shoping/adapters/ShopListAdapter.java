package kapadokia.nyandoro.shoping.adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import kapadokia.nyandoro.shoping.models.Product;

public class ShopListAdapter extends ListAdapter<Product, ShopListAdapter.ShopViewHolder> {


    public ShopListAdapter() {
        super(Product.itemCallback);
    }

    class ShopViewHolder extends RecyclerView.ViewHolder{
        public ShopViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ShopViewHolder holder, int position) {

    }

    public interface ShopInterface{
        void addItem(Product product);
        void onItemClick(Product product);
    }

}
