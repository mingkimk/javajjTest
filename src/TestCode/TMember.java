package TestCode;



import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import MainSrc.Member;

public class TMember {
	Member newMember;
	Member oldMember;
	@Test
	public void test1(){
//		System.out.println(newMember);
//		System.out.println(oldMember);
//		assertEquals(newMember, oldMember);
		//assertNull(newMember);
	//	assertNotNull(newMember);
		//a��ü��  null �̸� ���� null�� �ƴϸ� ����
		//assertSame(newMember,oldMember);
		if(newMember==null) {
			System.out.println("ok");
		}
		assertTrue(newMember==null);// fail
	}
	
	
	
	
	@Before
	public void test2() {
		newMember= new Member();
		oldMember=new Member();
	}
	
	
	
	//������ ���� �׽��� �ϱ� ���ؼ��� ���̺귯��(JUnit)�� �߰� �Ѵ�.
	//JUnit �̶�
	// ������ ���� �׽�Ʈ�� ������ �ִ� �����ӿ�ũ(framework)� �Ͽ� ���� �Ǵ��̳� ���� ������ ���� Ʋ.
	// ���Ǵ� ������̼�
	
	/**
	 * @Test // @Test �� ����� �޼ҵ� �׽�Ʈ�� �����Ѵ�.
	 * @Ignore//�׽��� �������� �ʴ´�.
	 * @before//@Test��  ����� �޼ҵ尡 ����Ǳ� ���� ����
	 */
	
	/**
	 * sysout ���δ�  �ֿܼ� ������ ��� ������
	 *  ���� �޼ҵ� (assert)�� ����Ʈ ��� �Ǻ��Ѵ�.
	 * ������� asserEquals(����,������)
	 * ����  ���� �޼ҵ�� ���󰪰� �������� ��ġ �ϸ� ����
	 * ��ġ ���� ������ ����
	 */
	
	/**
	 * jUnit �޼���
	 * assertEquals(a,b)-��ü �Ǵ� ���� ��ġ �ϴ°�
	 * assertArrayEquals(a,b)-�迭�� ���� ��ġ �ϴ°�
	 * assertSame(a,b)-���� ��ü �ΰ�
	 * assertTrue(a)-��ü ������ ������
	 * assertNotNull(a)- ��ü�� null �� �ƴѰ�
	 * assertNull(a)- ��ü�� null �ΰ�
	 */
	
	
}
