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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        //Create an array of words
        ArrayList<word> words = new ArrayList<word>();


        //words.add("one");

        words.add(new word("Where are you going?", "minto wuksus?", R.drawable.family_father));
        words.add(new word("What is your name?", "tinnә oyaase'nә?", R.drawable.family_mother));
        words.add(new word("My name is...", "oyaaset...", R.drawable.family_son));
        words.add(new word("How are you feeling?", "michәksәs?", R.drawable.family_daughter));
        words.add(new word("I'm feeling good", "kuchi achit", R.drawable.family_older_brother));
        words.add(new word("Are you coming?", "әәnәs'aa?", R.drawable.family_younger_brother));
        words.add(new word("Yes, I'm coming", "hәә' әәnәm", R.drawable.family_older_sister));
        words.add(new word("grandmother", "ama", R.drawable.family_grandmother));
        words.add(new word("grandfather", "paapa", R.drawable.family_grandfather));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings.
        // The adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@Link TextView}, which th adapter will set to
        // display a single word

        wordAdapter adapter = new wordAdapter(this, words, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierachy of the {@Link Activity}
        // There should be a {@link ListView} with the view ID called list, which is declared in
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.phrases);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }
}


