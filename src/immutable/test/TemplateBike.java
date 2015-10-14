package immutable.test;

import java.util.Date;

public class TemplateBike {
String name;
float mass;
int wheels;
Date dateOfManufacturing;
Object object;

    public TemplateBike(String name, float mass, int wheels, Date dateOfManufacturing){
    	this.name = name;
    	this.mass = mass;
    	this.wheels = wheels;
    	this.dateOfManufacturing = dateOfManufacturing;
    			//new Date(dateOfManufacturing.getTime());
    }
    
    public TemplateBike(String name, int wheels, Date dateOfManufacturing){
    	this.name = name;
    	this.wheels = wheels;
    	this.dateOfManufacturing = dateOfManufacturing;
    			//new Date(dateOfManufacturing.getTime());
    }
    
    public boolean TemplateBike(String name, float mass, int wheels, Date dateOfManufacturing){
    	this.name = name;
    	this.mass = mass;
    	this.wheels = wheels;
    	this.dateOfManufacturing = dateOfManufacturing;
    	return true;
    			//new Date(dateOfManufacturing.getTime());
    }
    
    public void changeObject(String name, float mass, int wheels, Date dateOfManufacturing){
    	//this.name = name;
    	this.wheels = wheels;
    	this.dateOfManufacturing = dateOfManufacturing;
    }
    
    public String getName(){
    	return this.name;
    }
    
    public Date getDateOfManufacturing(){
    	return this.dateOfManufacturing;
    }

}