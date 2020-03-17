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
		//a객체가  null 이면 실패 null이 아니면 성공
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
	
	
	
	//독립된 단위 테스를 하기 위해서는 라이브러리(JUnit)을 추가 한다.
	//JUnit 이란
	// 독립된 단위 테스트를 지원해 주는 프레임워크(framework)어떤 일에 대한 판단이나 결정 따위를 위한 틀.
	// 사용되는 어노테이션
	
	/**
	 * @Test // @Test 가 선언된 메소드 테스트를 수행한다.
	 * @Ignore//테스를 실행하지 않는다.
	 * @before//@Test가  선언된 메소드가 실행되기 전에 수행
	 */
	
	/**
	 * sysout 으로는  콘솔에 걀과를 출력 하지만
	 *  단정 메소드 (assert)로 데스트 결과 판별한다.
	 * 예를들어 asserEquals(예상값,실제값)
	 * 위의  단정 메소드는 예상값과 실제값이 일치 하면 성공
	 * 일치 하지 않으면 실패
	 */
	
	/**
	 * jUnit 메서드
	 * assertEquals(a,b)-객체 또는 값이 일치 하는가
	 * assertArrayEquals(a,b)-배열의 값이 일치 하는가
	 * assertSame(a,b)-같은 객체 인가
	 * assertTrue(a)-객체 조건이 참인지
	 * assertNotNull(a)- 객체가 null 이 아닌가
	 * assertNull(a)- 객체가 null 인가
	 */
	
	
}
