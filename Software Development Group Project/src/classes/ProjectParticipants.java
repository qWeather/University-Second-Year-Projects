/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Turgay Ozgun - w1713054
 */
//Turgay Ozgun
public class ProjectParticipants{
    private int participants;
    private String country;

    public ProjectParticipants(int participants, String country) {
        this.participants = participants;
        this.country = country;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "ProjectParticipants{" + "participants=" + participants + ", country=" + country + '}';
    }
    
}
