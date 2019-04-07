package com.zzameer

class DoctorController {

    def scaffold = Doctor

def login(){

}

def validate(){

def user = Doctor.findBydoctorEmail(params.username)

if(user && user.doctorPassword == paramas.password){

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
