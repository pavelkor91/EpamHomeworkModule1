package task6;


import lombok.Getter;
/**
 * Notepad class for collect Notes.
 * @autor Pavel Korchagin
 * @version 1.0
 */
public class Notepad {

    /**default capacity of Notepad */
    @Getter
    private int capacity = 16;

    private Note[] notes = new Note[capacity];

    /** Count of Notes in one Notepad*/
    @Getter
    private int size = 0;

    /**
     *Add new Note int Notepad
     * @param title - Title of Note
     * @param message - Message of Note
     */
    public void addNote(final String title, final String message){
        if(size == capacity - 1){
            capacity = (capacity * 3) / 2 + 1;
            resize(capacity);
        }
        notes[size++] = new Note(title,message);
    }

    /**
     * This function make resize of out Notepad if currently size is not enough
     * for create new Note. New size = (currentlyCapacity * 3) / 2 + 1 (default formula
     * for ArrayList).
     * @param capacity - new capacity for notes array.
     */
    private void resize(final int capacity){
        Note[] newNotes = new Note[capacity];
        System.arraycopy(notes, 0, newNotes, 0, size);
        notes = newNotes;
    }

    /**
     * Edit exist note.
     * @param pointer - ID of note int Notepad which need to edit
     * @param title - New title for note
     * @param message = new message for note
     */
    public void edit(final int pointer, final String title, final String message){
        notes[pointer].setTitle(title);
        notes[pointer].setMessage(message);
    }

    /**
     * This method shows all notes in notepad.
     */
    public void showNotes(){
        for(int i = 0; i < size; i++)
            System.out.printf("Title = %s, Message = %s \n", notes[i].getTitle(), notes[i].getMessage());
    }

    /**
     * This method remove note from notepad by ID.
     * @param id - Number of note which need to delete.
     */
    public void removeNote(final int id){
        System.arraycopy(notes, id + 1, notes, id, size - id);
        size--;
    }
}
