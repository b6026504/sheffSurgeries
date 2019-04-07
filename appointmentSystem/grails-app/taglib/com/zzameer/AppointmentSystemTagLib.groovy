package com.zzameer

class AppointmentSystemTagLib {
    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

def doctorToggle = {

	out << "<div style='margin: 20px 0 40px;'>"
	if (request.getSession(false) && session.user){
	out << "<span style='float:left; margin-left:20px'>"
	out << "Welcome ${session.user}."
	out << "</span><span style='float:right; margin-right:20px'>"
	out << "<a href='${createLink(controller:'doctor', action:'logout')}'>"
	out << "Logout </a></span>"

}

else{
	
	out << "<span style='float:right; margin-right:15px'>"
	out << "<a href='${createLink(controller:'doctor', action:'login')}'>"
	out << "Login </a></span>"
	
	}

	out << "</div><br/>"

def recepToggle = {

	out << "<div style='margin: 20px 0 40px;'>"
	if (request.getSession(false) && session.user){
	out << "<span style='float:left; margin-left:20px'>"
	out << "Welcome ${session.user}."
	out << "</span><span style='float:right; margin-right:20px'>"
	out << "<a href='${createLink(controller:'receptionist', action:'logout')}'>"
	out << "Logout </a></span>"

}

else{
	
	out << "<span style='float:right; margin-right:15px'>"
	out << "<a href='${createLink(controller:'receptionist', action:'login')}'>"
	out << "Login </a></span>"
	
	}

	out << "</div><br/>"

}
}
