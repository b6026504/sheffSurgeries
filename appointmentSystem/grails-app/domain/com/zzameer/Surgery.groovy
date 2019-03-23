package com.zzameer

class Surgery {

	String surgeryName
	String surgeryAddress
	String surgeryPostcode
	String surgeryTelephone
	int numberOfPatients
	String surgeryDescription
	Float openingTime
	Float closingTime

	static hasMany=[doctors:Doctor, receptionists:Receptionist, nurses:Nurse, patients:Patient, appointments:Appointment]
	String toString(){
	return surgeryName
	}
	

    static constraints = {

	surgeryName nullable:false, blank:false
	surgeryAddress nullable:false, blank:false
	surgeryPostcode nullable:false, blank:false, minsize:6, maxsize:7
	surgeryTelephone nullable:false, blank:false, unique:true
	numberOfPatients nullable:false, blank:false
	surgeryDescription nullable:false, blank:false, maxsize:5000
	openingTime nullable:false, blank:false, scale:2, min:9.00F, max:11.00F
	closingTime nullable:false, blank:false, scale:2, min:15.00F, max:17.00F
    }
}
