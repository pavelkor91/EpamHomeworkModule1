package task6;


import lombok.Getter;

public class Notepad {

    @Getter
    private int capacity = 2;

    private Note[] notes = new Note[capacity];

    @Getter
    private int size = 0;

    public void addNote(final String title, final String message){
        if(size == capacity - 1){
            capacity = (capacity * 3) / 2 + 1;
            resize(capacity);
        }
        notes[size++] = new Note(title,message);
    }

    private void resize(final int capacity){
        Note[] newNotes = new Note[capacity];
        System.arraycopy(notes, 0, newNotes, 0, size);
        notes = newNotes;
    }

    public void edit(final int pointer, final String title, final String message){
        notes[pointer].setTitle(title);
        notes[pointer].setMessage(message);
    }

    public void showNotes(){
        for(int i = 0; i < size; i++)
            System.out.printf("Title = %s, Message = %s \n", notes[i].getTitle(), notes[i].getMessage());
    }
    public void removeNote(final int id){
        System.arraycopy(notes, id + 1, notes, id, size - id);
        size--;
    }
}
