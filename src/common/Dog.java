/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package common;

/**
 *
 * @author instlogin
 */
public class Dog {
    private String name;
    private int rabiesId;

    public Dog() {
    }

    public Dog(String name, int rabiesId) {
        this.name = name;
        this.rabiesId = rabiesId;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRabiesId() {
        return rabiesId;
    }

    public void setRabiesId(int rabiesId) {
        this.rabiesId = rabiesId;
    }

    @Override
    public String toString() {
        return "Dog {" + "name = " + name + ", rabiesId = " + rabiesId + '}';
    }

    

}
