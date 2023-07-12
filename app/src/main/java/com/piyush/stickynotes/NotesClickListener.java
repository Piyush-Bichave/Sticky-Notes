package com.piyush.stickynotes;

import androidx.cardview.widget.CardView;

import com.piyush.stickynotes.Models.Notes;

public interface NotesClickListener {
    void onclick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
