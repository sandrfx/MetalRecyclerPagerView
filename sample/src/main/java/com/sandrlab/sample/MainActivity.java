/*
 * Copyright (C) 2017. Alexander Bilchuk <a.bilchuk@sandrlab.com>
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
package com.sandrlab.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;

import com.sandrlab.widgets.MetalRecyclerViewPager;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics metrics = getDisplayMetrics();
        List<String> metalList = Arrays.asList("\\m/", "\\m/", "\\m/");
        FullMetalAdapter fullMetalAdapter = new FullMetalAdapter(metrics, metalList);

        MetalRecyclerViewPager viewPager = (MetalRecyclerViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(fullMetalAdapter);
    }

    private DisplayMetrics getDisplayMetrics() {
        Display display = getWindowManager().getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);

        return metrics;
    }
}
