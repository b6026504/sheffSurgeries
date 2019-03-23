package com.zzameer

class BootStrap {

    def init = { servletContext ->

	def surgery1 = new Surgery(
	surgeryName: 'Heeley Surgery',
	surgeryAddress: '10 Richards Road, Sheffield',
	surgeryPostcode: 'S2 3DT',
	surgeryTelephone: '01149512346', 
	numberOfPatients: 55,
	surgeryDescription: 'Lorem Ipsum',
	openingTime: 9.00,
	closingTime: 17.00
	).save()

	def surgery2 = new Surgery(
	surgeryName: 'Centre Surgery',
	surgeryAddress: '119 Centre Road, Sheffield',
	surgeryPostcode: 'S1 3DT',
	surgeryTelephone: '01147513116', 
	numberOfPatients: 100,
	surgeryDescription: 'Lorem Ipsum',
	openingTime: 9.00,
	closingTime: 18.30
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

	def doctor2 = new Doctor(	
	docFirstname: 'Bill',
	docLastname: 'Ding',
	qualification: 'MBChB (Sheffield)',
	position: 'GP',
	doctorEmail: 'b.ding@doctor.com', 
	doctorPassword: 'password',
	doctorOffice: 'A-1232',
	doctorPhone: '01144631116',
	bio: 'Lorem Ipsum'
	).save()

	def patient1 = new Patient(
	patientFirstname: 'Ben',
	patientLastname: 'Yardley',
	patientAddress: '79 Peg Road, Sheffield, S11 9PL',
	patientResidence: 'Sheffield',
	patientDob: new Date('14/09/1999'),
	patientID: 000001,
	dateRegistered: new Date('23/01/2019'),
	patientPhone: '01141238543'
	).save()

	def patient2 = new Patient(
	patientFirstname: 'Robbie',
	patientLastname: 'Williams',
	patientAddress: '1 Candy Road, Sheffield, S11 9PL',
	patientResidence: 'Sheffield',
	patientDob: new Date('16/12/1988'),
	patientID: 102134,
	dateRegistered: new Date('25/01/2019'),
	patientPhone: '01141234445'
	).save()

	def receptionist1 = new Receptionist(
	recepFirstname: 'Kevin',
	recepLastname: 'Galaxy',
	recepEmail: 'k.galaxy@receptionist.com',
	recepUsername: 'k.galaxy',
	recepPassword: 'password',
	recepPhone: '01144896325'
	).save()

	def receptionist2 = new Receptionist(
	recepFirstname: 'Peter',
	recepLastname: 'Kay',
	recepEmail: 'k.peter@receptionist.com',
	recepUsername: 'k.peter',
	recepPassword: 'password',
	recepPhone: '01144896333'
	).save()
	
	def nurse1 = new Nurse(
	nurseFirstname: 'Ryan',
	nurseLastname: 'Limb',
	qualifications: 'Registered General Nurse',
	nurseEmail: 'r.limb@nurse.com',
	nurseOffice: 'B-5678',
	nursePhone: '01145434477'
	).save()

	def nurse2 = new Nurse(
	nurseFirstname: 'Debbie',
	nurseLastname: 'Smith',
	qualifications: 'Registered General Nurse',
	nurseEmail: 'd.smith@nurse.com',
	nurseOffice: 'B-5678',
	nursePhone: '01145439967'
	).save()

	def appointment1 = new Appointment(
	appDate: new Date('23/03/2019'),
	roomNumber: 'C-1234',
	appTime: 13.30,
	appDuration: 30
	).save()

	def appointment2 = new Appointment(
	appDate: new Date('13/03/2019'),
	roomNumber: 'C-1001',
	appTime: 11.10,
	appDuration: 45
	).save()

	def prescription1 = new Prescription(
	pharmacyName: 'Heeley Pharmacy',
	prescripNumber: 0001246,
	medicineName: 'Propaderm',
	totalCost: 10.80,
	dateIssued: new Date('10/05/2019'),
	patientPaid: true,
	daysSupply: 13
	).save()

	def prescription2 = new Prescription(
	pharmacyName: 'Centre Pharmacy',
	prescripNumber: 1004576,
	medicineName: 'Some drug',
	totalCost: 15.75,
	dateIssued: new Date('9/11/2018'),
	patientPaid: false,
	daysSupply: 99
	).save()

    }
    def destroy = {
    }
}
