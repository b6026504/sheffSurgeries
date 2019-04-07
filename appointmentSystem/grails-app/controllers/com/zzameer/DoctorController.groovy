package com.zzameer

class DoctorController {

    def scaffold = Doctor

def login(){

}

def validate(){

def user = Doctor.findByDoctorEmail(params.username)

if(user && user.doctorPassword == params.password){

session.user=user

render view:'home'

}

else{

flash.message = "invalid email and/or password."

render view:'login'

}

}

def logout={

session.user = null

redirect(uri:'/')

}

}
