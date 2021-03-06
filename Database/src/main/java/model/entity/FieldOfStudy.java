package model.entity;
// Generated 2016-12-08 01:23:57 by Hibernate Tools 5.1.0.Alpha1

/**
 * FieldOfStudy generated by hbm2java
 */
public class FieldOfStudy extends Entity {
	private static final long serialVersionUID = 7274468450377865878L;
	private Integer fieldOfStudyId;
	private String fieldOfStudyName;
	private Integer departmentId;

	public FieldOfStudy() {
	}

	public FieldOfStudy(String fieldOfStudyName, Integer departmentId) {
		this.fieldOfStudyName = fieldOfStudyName;
		this.departmentId = departmentId;
	}

	public Integer getFieldOfStudyId() {
		return this.fieldOfStudyId;
	}

	public void setFieldOfStudyId(Integer fieldOfStudyId) {
		this.fieldOfStudyId = fieldOfStudyId;
	}

	public String getFieldOfStudyName() {
		return this.fieldOfStudyName;
	}

	public void setFieldOfStudyName(String fieldOfStudyName) {
		this.fieldOfStudyName = fieldOfStudyName;
	}

	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
}