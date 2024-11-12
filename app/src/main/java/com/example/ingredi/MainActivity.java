package com.example.ingredi;

import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.ingredi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Get the bottom navigation view
        BottomNavigationView navView = findViewById(R.id.nav_view);

        // Set up the app bar configuration with the fragment destinations
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_grocery_list, R.id.navigation_recipes, R.id.navigation_settings)
                .build();

        // Get the NavController from the NavHostFragment
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);

        // Set up the ActionBar with NavController
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        // Link the BottomNavigationView to the NavController
        NavigationUI.setupWithNavController(binding.navView, navController);
    }
}
