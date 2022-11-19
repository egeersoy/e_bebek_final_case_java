package e_bebek_final;

import java.util.ArrayList;
import java.util.List;

public class PatikaStore {
    private String name;

    private List<NoteBook> noteBooks;

    private List<MobilePhone> mobilePhones;

    public PatikaStore (String name){
        this.name = name;
        noteBooks = new ArrayList<>();
        mobilePhones = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NoteBook> getNoteBooks() {
        return noteBooks;
    }

    public void setNoteBooks(List<NoteBook> noteBooks) {
        this.noteBooks = noteBooks;
    }

    public List<MobilePhone> getMobilePhones() {
        return mobilePhones;
    }

    public void setMobilePhones(List<MobilePhone> mobilePhones) {
        this.mobilePhones = mobilePhones;
    }
}
