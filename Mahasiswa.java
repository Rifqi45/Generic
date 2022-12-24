/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generic;

/**
 *
 * @author Kii
 */

class Mahasiswa<A,B,C> {
    private A nim;
    private B name;
    private C clas;

    public A getNim() {
        return nim;
    }

    public void setNim(A nim) {
        this.nim = nim;
    }

    public B getName() {
        return name;
    }

    public void setName(B name) {
        this.name = name;
    }

    public C getClas() {
        return clas;
    }

    public void setClas(C clas) {
        this.clas = clas;
    }
    
}
