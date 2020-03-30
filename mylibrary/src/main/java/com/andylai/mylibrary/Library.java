package com.andylai.mylibrary;

import com.andylai.libraryone.Library1;
import com.andylai.librarythree.Library3;
import com.andylai.librarytwo.Library2;

public class Library {
    public void lib1() {
        Library1 l = new Library1();
        l.show();
    }
    public void lib2() {
        new Library2().show();
    }
    public void lib3() {
        new Library3().show();
    }
}
