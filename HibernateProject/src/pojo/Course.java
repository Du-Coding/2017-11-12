package pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author ����
 * @date 2017/11/7
 * @main ��Զ�bean��Course��
 *
 */

public class Course {
    private int cid;
    private String cname;
    private Set<Teacher> teacher = new HashSet<Teacher>();
    
    public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Set<Teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(Set<Teacher> teacher) {
		this.teacher = teacher;
	}
	
}
