package com.zzameer

class Surgery {

	String surgeryName
	String surgeryAddress
	String surgeryPostcode
	int surgeryTelephone
	int numberOfPatients
	String surgeryDescription
	Float openingHours

    static constraints = {

	surgeryName nullable:false, blank:false
	surgeryAddress nullable:false, blank:false
	surgeryPostcode nullable:false, blank:false, minsize:6, maxsize:7
	surgeryTelephone nullable:false, blank:false, size:11, unique:true
	numberOfPatients nullable:false, blank:false
	surgeryDescription nullable:false, blank:false, maxsize:5000
	openingHours nullable:false, blank:false, scale:2, min:9.00F, max:17.00F
    }
}
