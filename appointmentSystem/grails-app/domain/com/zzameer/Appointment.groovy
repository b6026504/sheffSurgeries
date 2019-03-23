package com.zzameer

class Appointment {

	Date appDate
	String roomNumber
	Float appTime
	int appDuration

    static constraints = {

	appDate nullable:false, blank:false
	roomNumber nullable:false, blank:false, size:4..6
	appTime nullable:false, blank:false, scale:2, min:9.00F, max:16.45F
	appDuration nullable:false, blank:false, inList:[15, 30, 45, 60]
	
    }
}
