package com.veronica.medaily.listeners;

import com.veronica.medaily.dbmodels.Category;

/**
 * Created by Veronica on 10/11/2016.
 */
public interface ICategoryEditedListener {
    void categoryEdited(Category category,int position);
}
