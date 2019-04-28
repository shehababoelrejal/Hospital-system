/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalsystem;

/**
 *
 * @author lenovo
 */
public interface ISignup 
{
    public boolean checkCode();
    public void saveUser();
    public void savePass();
}
