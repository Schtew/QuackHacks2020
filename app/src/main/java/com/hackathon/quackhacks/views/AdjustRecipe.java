package com.hackathon.quackhacks.views;

import android.content.Context;
import android.widget.EditText;

import com.hackathon.quackhacks.MainActivity;
import com.hackathon.quackhacks.R;

import static java.lang.Integer.parseInt;

public class AdjustRecipe extends BaseView {
    public AdjustRecipe(Context context, String recipeName) {
        super(context);
        activity.setContentView(R.layout.adjust_recipe);

        activity.findViewById(R.id.button4).setOnClickListener( onclick -> {
            EditText ingredient = activity.findViewById(R.id.editTextTextPersonName2);
            EditText quantity = activity.findViewById(R.id.editTextNumber);
            EditText unit = activity.findViewById(R.id.unit);

            if(ingredient.toString().isEmpty())
            {
                ingredient.setError("Please enter an ingredient");
            }
            if(quantity.toString().isEmpty())
            {
                quantity.setError("Please enter a quantity");
            }
            if(unit.toString().isEmpty())
            {
                unit.setError("Please enter a unit");
            }
            

            activity.getProfile().adjustRecipe((MainActivity) context, recipeName, ingredient.toString(), parseInt(quantity.toString()), unit.toString());
        });
    }
}