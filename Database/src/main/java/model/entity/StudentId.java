package model.entity;
// Generated 2016-12-09 16:03:21 by Hibernate Tools 5.1.0.Alpha1

/**
 * StudentId generated by hbm2java
 */
public class StudentId implements java.io.Serializable {
	private static final long serialVersionUID = -2876400998358585559L;
	private int studentId;
	private int userId;

	
	public StudentId() {}
	public StudentId(int studentId, int userId) {
		this.studentId = studentId;
		this.userId = userId;
	}

	
	public int getStudentId() {
		return this.studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getUserId() {
		return this.userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StudentId))
			return false;
		StudentId castOther = (StudentId) other;

		return (this.getStudentId() == castOther.getStudentId()) && (this.getUserId() == castOther.getUserId());
	}
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getStudentId();
		result = 37 * result + this.getUserId();
		return result;
	}
}