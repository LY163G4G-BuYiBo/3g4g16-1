package cn.qhit.test;

import java.util.List;
import cn.qhit.dao.DeptDao;
import cn.qhit.model.Dept;

public class Test {
	public static void main(String[] args) {
		DeptDao d=new DeptDao();
//		List<Dept> list=d.select1();
//		for (Dept dept : list) {
//			System.out.print(dept.getDid()+"\t");
//			System.out.print(dept.getDname()+"\t");
//			System.out.print(dept.getTel()+"\t");
//			System.out.println(dept.getRess());
//		}
		
//		Dept dept=d.select2(2);
//		System.out.println(dept.getDname());
		
//		
//		dept.setDid(5);
//		dept.setDname("���ز�");
//		dept.setTel("55555");
//		dept.setRess("��ݸ");
//		d.insert(dept);
		
//		d.delete(5);
		
		Dept dept=new Dept();
		dept.setDid(4);
		dept.setDname("ѧϰ��");
		dept.setTel("66666");
		dept.setRess("����");
		d.update(dept);
	}
}
