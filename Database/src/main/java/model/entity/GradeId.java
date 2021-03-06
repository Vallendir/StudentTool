package model.entity;
// Generated 2016-12-08 01:23:57 by Hibernate Tools 5.1.0.Alpha1

/**
 * GradeId generated by hbm2java
 */
public class GradeId extends Entity {
	private static final long serialVersionUID = 7770627585379915104L;
	private int gradeId;
	private int studentId;
	private int courseId;

	public GradeId() {
	}

	public GradeId(int gradeId, int studentId, int courseId) {
		this.gradeId = gradeId;
		this.studentId = studentId;
		this.courseId = courseId;
	}

	public int getGradeId() {
		return this.gradeId;
	}

	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}

	public int getStudentId() {
		return this.studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCourseId() {
		return this.courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GradeId))
			return false;
		GradeId castOther = (GradeId) other;

		return (this.getGradeId() == castOther.getGradeId()) && (this.getStudentId() == castOther.getStudentId())
				&& (this.getCourseId() == castOther.getCourseId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getGradeId();
		result = 37 * result + this.getStudentId();
		result = 37 * result + this.getCourseId();
		return result;
	}
}