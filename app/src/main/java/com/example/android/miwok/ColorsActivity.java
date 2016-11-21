/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an array of words
        ArrayList<word> words = new ArrayList<word>();

        //words.add("one");

        words.add(new word("red", "wetetti", R.drawable.color_red));
        words.add(new word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));
        words.add(new word("dusty yellow", "topiisә", R.drawable.color_dusty_yellow));
        words.add(new word("green", "chokokki", R.drawable.color_green));
        words.add(new word("brown", "takaakki", R.drawable.color_brown));
        words.add(new word("gray", "topoppi", R.drawable.color_gray));
        words.add(new word("black", "kululli", R.drawable.color_black));
        words.add(new word("white", "kelelli", R.drawable.color_white));



        // Create an {@link ArrayAdapter}, whose data source is a list of Strings.
        // The adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@Link TextView}, which th adapter will set to
        // display a single word

        wordAdapter adapter = new wordAdapter(this, words, R.color.category_colors);

        // Find the {@link ListView} object in the view hierachy of the {@Link Activity}
        // There should be a {@link ListView} with the view ID called list, which is declared in
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }
}