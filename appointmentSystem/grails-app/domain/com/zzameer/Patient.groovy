package com.zzameer

class Patient {

	String patientFirstname
	String patientLastname
	String patientAddress
	String patientResidence
	Date patientDob
	int patientID
	Date dateRegistered
	int patientPhone

    static constraints = {

	patientFirstname nullable:false, blank:false
	patientLastname nullable:false, blank:false
	patientAddress nullable:false, blank:false
	patientResidence nullable:false, blank:false
	patientDob nullable:false, blank:false, date:true
	patientID nullable:false, blank:false, size:6, unique:true
	dateRegistered nullable:false, blank:false, date:true
	patientPhone nullable:false, blank:false, size:11

    }
}
