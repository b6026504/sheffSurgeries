package com.zzameer

class BootStrap {

    def init = { servletContext ->

	def Heeley = new Surgery(
	surgeryName: 'Heeley Surgery',
	surgeryAddress: '10 Richards Road, Sheffield',
	surgeryPostcode: 'S2 3DT',
	surgeryTelephone: '01149512346', 
	numberOfPatients: 55,
	surgeryDescription: 'Lorem Ipsum',
	openingTime: 9.00,
	closingTime: 17.00
	).save()

	def doctor1 = new Doctor(	
	docFirstname: 'Tonderai',
	docLastname: 'Maswera',
	qualification: 'MBChB (Sheffield)',
	position: 'Surgeon',
	doctorEmail: 't.maswera@doctor.com', 
	doctorPassword: 'password',
	doctorOffice: 'A-1234',
	doctorPhone: '01144632598',
	bio: 'Lorem Ipsum'
	).save()

	def patient1 = new Patient(
	patientFirstname: 'Ben',
	patientLastname: 'Yardley',
	patientAddress: '79 Peg Road, Sheffield, S11 9PL',
	patientResidence: 'Sheffield',
	patientDob: new Date('14/09/1999'),
	patientID: 000001,
	dateRegistered: new Date('23/03/2019'),
	patientPhone: '01141238543'
	).save()
    }
    def destroy = {
    }
}
