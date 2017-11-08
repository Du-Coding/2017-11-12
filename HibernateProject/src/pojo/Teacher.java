package pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author ∂≈“„
 * @date 2017/11/7
 * @main ∂‡∂‘∂‡bean
 *
 */

public class Teacher {
    private int tid;
    private String tname;
    private Set<Course> course = new HashSet<Course>();
    
    public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Set<Course> getCourse() {
		return course;
	}
	public void setCourse(Set<Course> course) {
		this.course = course;
	}
	
}
