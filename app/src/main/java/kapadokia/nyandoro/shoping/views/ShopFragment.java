package kapadokia.nyandoro.shoping.views;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kapadokia.nyandoro.shoping.R;
import kapadokia.nyandoro.shoping.adapters.ShopListAdapter;
import kapadokia.nyandoro.shoping.databinding.FragmentShopBinding;
import kapadokia.nyandoro.shoping.models.Product;


public class ShopFragment extends Fragment implements ShopListAdapter.ShopInterface {

    FragmentShopBinding binding;
    private ShopListAdapter shopListAdapter;
    public ShopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentShopBinding.inflate(inflater,container,false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        shopListAdapter = new ShopListAdapter();
        binding.shopRecyclerView.setAdapter(shopListAdapter);
    }

    @Override
    public void addItem(Product product) {
        
    }

    @Override
    public void onItemClick(Product product) {

    }
}