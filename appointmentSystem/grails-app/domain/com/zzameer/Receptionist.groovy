package com.zzameer

class Receptionist {

	String recepFirstname
	String recepLastname
	String recepEmail
	String recepUsername
	String recepPassword
	String recepPhone

    static constraints = {

	recepFirstname nullable:false, blank:false
	recepLastname nullable:false, blank:false
	recepEmail nullable:false, blank:false, email:true, unique:true
	recepUsername nullable:false, blank:false, unique:true
	recepPassword nullable:false, blank:false
	recepPhone nullable:false, blank:false, unique:true

    }
}
