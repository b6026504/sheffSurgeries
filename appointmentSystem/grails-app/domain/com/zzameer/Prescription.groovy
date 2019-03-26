package com.zzameer

class Prescription {

	String pharmacyName
	int prescripNumber
	String medicineName
	double totalCost
	Date dateIssued
	Boolean patientPaid
	int daysSupply

	static hasMany=[doctors:Doctor, patients:Patient]
	static belongsTo=[Doctor, Patient]	
	
	String toString(){
	return prescripNumber
	}

    static constraints = {

	pharmacyName nullable:false, blank:false
	prescripNumber nullable:false, blank:false, size:7, unique:true
	medicineName nullable:false, blank:false
	totalCost nullable:false, blank:false, scale:2
	dateIssued nullable:false, blank:false, date:true
	patientPaid nullable:false, blank:false
	daysSupply nullable:false, blank:false

    }
}
