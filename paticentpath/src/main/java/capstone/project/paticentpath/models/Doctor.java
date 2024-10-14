package capstone.project.paticentpath.models;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="doctor")

public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String doctorName;

	private String doctorSpilist;

	private String hospitalName;

	private boolean doctor_avilable;

public Doctor(int id, String doctorName, String doctorSpilist, String hospitalName, boolean doctor_avilable) {
		super();
		this.id = id;
		this.doctorName = doctorName;
		this.doctorSpilist = doctorSpilist;
		this.hospitalName = hospitalName;
		this.doctor_avilable = doctor_avilable;
	}

public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getDoctorName() {
	return doctorName;
}

public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}

public String getDoctorSpilist() {
	return doctorSpilist;
}

public void setDoctorSpilist(String doctorSpilist) {
	this.doctorSpilist = doctorSpilist;
}

public String getHospitalName() {
	return hospitalName;
}

public void setHospitalName(String hospitalName) {
	this.hospitalName = hospitalName;
}

public boolean isDoctor_avilable() {
	return doctor_avilable;
}

public void setDoctor_avilable(boolean doctor_avilable) {
	this.doctor_avilable = doctor_avilable;
}




}
