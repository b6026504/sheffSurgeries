package com.zzameer

class Patient {

	String patientLastname
	String patientFirstname
	String patientAddress
	String patientResidence
	Date patientDob
	int patientID
	Date dateRegistered
	String patientPhone

	static hasMany=[prescriptions:Prescription, doctors:Doctor, surgerys:Surgery]
	static belongsTo=[Surgery, Doctor]
	
	String toString(){
	return patientLastname
	}

    static constraints = {

	patientFirstname nullable:false, blank:false
	patientLastname nullable:false, blank:false
	patientAddress nullable:false, blank:false
	patientResidence nullable:false, blank:false
	patientDob nullable:false, blank:false, date:true
	patientID nullable:false, blank:false, size:6, unique:true
	dateRegistered nullable:false, blank:false, date:true
	patientPhone nullable:false, blank:false

    }
}
