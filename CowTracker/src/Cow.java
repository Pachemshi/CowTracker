/*CowTrack is a simple program to Register a herd;
It was designed to register dairy cows, but can be easily modified to Beef cattle,
or flocks of sheep.
Author: Eduardo Pachemshi A. Silva; Last Update: February 01,2021.
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cow {

    private String breed;
    private String name;
    private String siren;
    private String dam;
    private String id;
    private boolean bred;
    private byte births;
    private byte age;
    private int weight;
    private int milkProduction;
    private double score;
    private String mod;

    Cow(String breed, String name, String siren, String dam){
        this.breed = breed;
        this.name = name;
        this.siren = siren;
        this.dam = dam;

    }

    public String getBreed(){
        return breed;
    }

    public String getName(){
        return name;
    }

    public String getSiren(){
        return siren;
    }

    public String getDam(){
        return dam;
    }

    public String getId() {
        return id;
    }

    public boolean getBred() {
        return bred;
    }

    public byte getBirths() {
        return births;
    }

    public byte getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getMilkProduction() {
        return milkProduction;
    }

    public double getScore() {
        return score;
    }

    public String getMod(){
        return mod;
    }

    public void setBreed(String newBreed){
        breed = newBreed;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSiren(String newSiren){
        siren = newSiren;
    }

    public void setDam(String newDam){
        dam = newDam;
    }

    public void setId(String newId) {
        id = newId;
    }

    public void setBred(boolean newBred ){
        bred = newBred;
    }

    public void setBirths(byte newBirth){
        births = newBirth;
    }

    public void setAge(byte newAge){
        age = newAge;
    }

    public void setWeight(int newWeight){
        weight = newWeight;
    }

    public void setMilkProduction(int newMilk){
        milkProduction = newMilk;
    }

    public void setScore(double newScore){
        score = newScore;
    }

    public void setRecordMods(){

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Date date = new Date();
        mod = dateFormat.format(date);
    }
}