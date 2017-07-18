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

import android.support.annotation.NonNull;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sandrlab.widgets.MetalRecyclerViewPager;

import java.util.List;

public class FullMetalAdapter extends MetalRecyclerViewPager.MetalAdapter<FullMetalAdapter.FullMetalViewHolder> {

    private final List<String> metalList;

    public FullMetalAdapter(@NonNull DisplayMetrics metrics, @NonNull List<String> metalList) {
        super(metrics);
        this.metalList = metalList;
    }

    @Override
    public FullMetalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewItem = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pager_item, parent, false);
        return new FullMetalViewHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(FullMetalViewHolder holder, int position) {
        // don't forget about calling supper.onBindViewHolder!
        super.onBindViewHolder(holder, position);
        holder.metalText.setText(metalList.get(position));
    }

    @Override
    public int getItemCount() {
        return metalList.size();
    }

    static class FullMetalViewHolder extends MetalRecyclerViewPager.MetalViewHolder {

        TextView metalText;

        public FullMetalViewHolder(View itemView) {
            super(itemView);
            metalText = (TextView) itemView.findViewById(R.id.metal_text);
        }
    }
}
