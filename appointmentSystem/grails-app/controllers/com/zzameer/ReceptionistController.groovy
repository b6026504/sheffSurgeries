package com.zzameer

class ReceptionistController {

    def scaffold = Receptionist

def login(){

}

def validate(){

def user = Receptionist.findByrecepUsername(params.username)

if(user && user.recepPassword == paramas.password){

session.user=user

render view:'home'

}

else{

flash.message = "invalid username and password."

render view:'login'

}

}

def logout={

session.user = null

redirect(uri:'/)

}

}
