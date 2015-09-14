/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diit.info.user.db;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class User {
    String uname, password, email;
   Date registeredon;

    public User() {
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegisteredon() {
        return registeredon;
    }

    public void setRegisteredon(Date registeredon) {
        this.registeredon = registeredon;
    }

    @Override
    public String toString() {
        return "User{" + "uname=" + uname + ", password=" + password + ", email=" + email + ", registeredon=" + registeredon + '}';
    }
   
   
}
