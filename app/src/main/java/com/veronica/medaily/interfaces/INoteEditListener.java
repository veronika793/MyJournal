package com.veronica.medaily.interfaces;
import com.veronica.medaily.dbmodels.Note;

/**
 * Created by Veronica on 10/11/2016.
 */
public interface INoteEditListener {
    void noteEdited(Note note, int position);
}
