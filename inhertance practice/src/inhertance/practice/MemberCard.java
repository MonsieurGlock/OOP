/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inhertance.practice;

/**
 *
 * @author User
 */
public class MemberCard {
    private String id , firstName , lastName;

    public MemberCard() {
    }
    public double discout(double cost){
        return cost * 0.5;
    }
}
