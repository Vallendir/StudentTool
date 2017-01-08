package model.entity;
// Generated 2016-12-08 01:23:57 by Hibernate Tools 5.1.0.Alpha1

/**
 * Institute generated by hbm2java
 */
public class Institute extends Entity {
	private static final long serialVersionUID = -8315572852208047487L;
	private Integer instituteId;
	private String instituteName;
	private String instituteDescription;
	private Integer departmentId;

	
	public Institute() {}
	public Institute(String instituteName, String instituteDescription, Integer departmentId) {
		this.instituteName = instituteName;
		this.instituteDescription = instituteDescription;
		this.departmentId = departmentId;
	}

	
	public Integer getInstituteId() {
		return this.instituteId;
	}
	public void setInstituteId(Integer instituteId) {
		this.instituteId = instituteId;
	}
	public String getInstituteName() {
		return this.instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getInstituteDescription() {
		return this.instituteDescription;
	}
	public void setInstituteDescription(String instituteDescription) {
		this.instituteDescription = instituteDescription;
	}
	public Integer getDepartmentId() {
		return this.departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
}