package com.zzameer

class Doctor {
	
	String docFirstname
	String docLastname
	String qualification
	String position
	String doctorEmail
	String doctorPassword
	String doctorOffice
	String doctorPhone
	String bio

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
