package com.zzameer

class Doctor {
	
	String docLastname
	String docFirstname
	String qualification
	String position
	String doctorEmail
	String doctorPassword
	String doctorOffice
	String doctorPhone
	String bio

	static hasMany=[prescriptions:Prescription, surgerys:Surgery, appointments:Appointment, nurses:Nurse, patients:Patient]
	static belongsTo=[Patient, Surgery]

	String toString(){
	return docLastname
	}

    static constraints = {

	docFirstname nullable:false, blank:false
	docLastname nullable:false, blank:false
	qualification nullable:false, blank:false
	position nullable:false, blank:false, inList:["GP", "Surgeon"]
	doctorEmail nullable:false, blank:false, email:true, unique:true
	doctorPassword nullable:false, blank:false
	doctorOffice nullable:false, blank:false, size:4..6
	doctorPhone nullable:false, blank:false, unique:true
	bio nullable:false, blank:false, maxsize:5000

    }
}
