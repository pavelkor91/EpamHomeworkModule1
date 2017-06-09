package task6;

/**
 * Main function for testing classes.
 */
public class Main {

    public static void main(String[] args) {

        Notepad np = new Notepad();
        np.addNote("asf","fasf");
        np.addNote("asf","fasf");
        np.addNote("asf","fasf");
        np.addNote("asf","fasf");
        np.addNote("f","asf");
        System.out.println("Notes in notepad: " + np.getSize());
        System.out.println("Capacity of notepad: " + np.getCapacity());
        np.showNotes();
        np.removeNote(2);
        System.out.println("Notes in notepad: " + np.getSize());
        System.out.println("Capacity of notepad: " + np.getCapacity());
        np.showNotes();
        np.removeNote(3);
        np.showNotes();
    }
}
