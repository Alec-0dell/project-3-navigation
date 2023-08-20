package org.overlake.mat803.navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import org.overlake.mat803.navigation.databinding.FragmentYesBinding;

public class YesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentYesBinding binding = FragmentYesBinding.inflate(inflater);
        NavController controller = NavHostFragment.findNavController(this);
        binding.yes.setOnClickListener(view -> {
            controller.navigate(R.id.action_yesFragment_to_landerFragment);
        });
        return binding.getRoot();
    }
}
