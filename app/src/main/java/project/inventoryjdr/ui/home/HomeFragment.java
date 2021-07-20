package project.inventoryjdr.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import project.inventoryjdr.MainActivity;
import project.inventoryjdr.R;
import project.inventoryjdr.characterClass.Character;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        homeViewModel.getText().observe(getViewLifecycleOwner(), s -> {
        });
        EditText nameCharacter=(EditText) root.findViewById(R.id.name_character_input);
        EditText surnameCharacter=(EditText) root.findViewById(R.id.surname_character_input);
        EditText podsNumber=(EditText) root.findViewById(R.id.max_pods_input);
        Button button = root.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Character character=new Character(155, nameCharacter.getText().toString(), surnameCharacter.getText().toString(), Integer.parseInt(podsNumber.getText().toString()), 150);
                Log.i("character", character.getFirstName());
            }
        });
        return root;

    }
}