package com.example.adminpage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Handler;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ImageActivity extends AppCompatActivity {
private TextView textView;
private ImageView imageView;
private TextView imageName;
private Button button;
private int currentImageIndex=0;
    private int[] images = {
            R.drawable.product_image_1,
            R.drawable.product_image_2,
            R.drawable.proudct_image_3,
            R.drawable.product_image_4
    };
    private String[] imageNames = {
            "Foundation",
            "Facepowder",
            "Blush",
            "Lipstick"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        textView=findViewById(R.id.textView);
        imageView=findViewById(R.id.imageView);
        imageName = findViewById(R.id.imageName);
        button=findViewById(R.id.btn_change_product);
        imageView.setImageResource(images[currentImageIndex]);
        imageName.setText(imageNames[currentImageIndex]);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            currentImageIndex++;
                if (currentImageIndex >= images.length) {
                    currentImageIndex=0;
                }
                imageView.setImageResource(images[currentImageIndex]);
                imageName.setText(imageNames[currentImageIndex]);
                Toast.makeText(ImageActivity.this, "Product changed", Toast.LENGTH_SHORT).show();
            }
        });


    }
}