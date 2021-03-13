/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

/**
 *
 * @author User
 */
public class Status{
    private int status;
    final int FRESHMAN = 1;
    final int SOPHOMORE = 2;
    final int JUNIOR = 3;
    final int SENIOR = 4;

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
    
    
}
