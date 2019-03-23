package com.zzameer

class Receptionist {

	String recepName
	String recepEmail
	String recepUsername
	String recepPassword
	int recepPhone

    static constraints = {

	recepName nullable:false, blank:false
	recepEmail nullable:false, blank:false, email:true, unique:true
	recepUsername nullable:false, blank:false, unique:true
	recepPassword nullable:false, blank:false
	recepPhone nullable:false, blank:false, size:11, unique:true

    }
}
