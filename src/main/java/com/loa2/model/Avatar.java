package com.loa2.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by zacharywasserman on 10/31/16.
 */
@Entity
@Table(name="avatar")
@Component
public class Avatar
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String password;
    private int health;
    private int strength;
    private int stamina;
    private int speed;
    private int intelligence;
    private int charisma;
    private int wisdom;
    private int dexterity;
    //private int level;

    public Avatar(){}

//    public Avatar(String username, int strength, int stamina, int speed, int intelligence, int charisma, int wisdom, int dexterity) {
//        this.username = username;
//        this.strength = strength;
//        this.stamina = stamina;
//        this.speed = speed;
//        this.intelligence = intelligence;
//        this.charisma = charisma;
//        this.wisdom = wisdom;
//        this.dexterity = dexterity;
//
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
