/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalsystem;

import java.io.File;

/**
 *
 * @author lenovo
 */
public interface IfileManger {
    public void add(File myFile);
    public void edit();
    public void delete();
    public void display();
    public void search();
}
