package com.zzameer

class Receptionist {

	String recepLastname
	String recepFirstname
	String recepEmail
	String recepUsername
	String recepPassword
	String recepPhone

	static hasMany=[surgerys:Surgery]
	static belongsTo=[Surgery]
	
	String toString(){
	return recepFirstname
	}

    static constraints = {

	recepFirstname nullable:false, blank:false
	recepLastname nullable:false, blank:false
	recepEmail nullable:false, blank:false, email:true, unique:true
	recepUsername nullable:false, blank:false, unique:true
	recepPassword nullable:false, blank:false
	recepPhone nullable:false, blank:false, unique:true

    }
}
