package kapadokia.nyandoro.shoping.views;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kapadokia.nyandoro.shoping.R;
import kapadokia.nyandoro.shoping.databinding.FragmentShopBinding;


public class ShopFragment extends Fragment {

    FragmentShopBinding binding;

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
}