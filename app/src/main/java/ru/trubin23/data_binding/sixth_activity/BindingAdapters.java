package ru.trubin23.data_binding.sixth_activity;

import android.databinding.BindingAdapter;
import android.databinding.BindingConversion;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class BindingAdapters {

    @BindingAdapter({"app:url", "app:errorImage"})
    public static void loadImage(ImageView view, String url, Drawable errorImage) {
        Picasso.get().load(url).error(errorImage).into(view);
    }

    @BindingConversion
    public static String convertHobbiesToString(List<Hobby> hobbies){
        StringBuilder stringBuilder = new StringBuilder();

        for (Hobby hobby : hobbies){
            if (stringBuilder.length() > 0){
                stringBuilder.append(", ");
            }
            stringBuilder.append(hobby.toString());
        }

        return stringBuilder.toString();
    }
}
