package org.overlake.mat803.navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import org.overlake.mat803.navigation.databinding.FragmentLanderBinding;

public class LanderFragment extends Fragment implements View.OnClickListener {

    private NavController mController;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentLanderBinding binding = FragmentLanderBinding.inflate(inflater);
        mController = NavHostFragment.findNavController(this);
        binding.buttonNo.setOnClickListener(this);
        binding.buttonYes.setOnClickListener(this);
        return binding.getRoot();
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button_yes){
            mController.navigate(R.id.action_landerFragment_to_yesFragment);
        } else if(view.getId() == R.id.button_no){
            mController.navigate(R.id.action_landerFragment_to_noFragment);
        }

    }
}
