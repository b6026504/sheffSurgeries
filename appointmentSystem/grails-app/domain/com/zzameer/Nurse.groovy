package com.zzameer

class Nurse {

	String nurseLastname
	String nurseFirstname
	String qualifications
	String nurseEmail
	String nurseOffice
	String nursePhone

	static hasMany=[surgerys:Surgery, doctors:Doctor]
	static belongsTo=[Surgery, Doctor]

	String toString(){
	return nurseLastname 
	}
	
    static constraints = {

	nurseFirstname nullable:false, blank:false
	nurseLastname nullable:false, blank:false
	qualifications nullable:false, blank:false
	nurseEmail nullable:false, blank:false, email:true, unique:true
	nurseOffice nullable:false, blank:false, size:4..6
	nursePhone nullable:false, blank:false, unique:true

    }
}
