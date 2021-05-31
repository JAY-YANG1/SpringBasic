package jaemukyang.spring.annotation;

import org.springframework.stereotype.Repository;

import jaemukyang.spring.sungjuk.SungJuk;
import jaemukyang.spring.sungjuk.SungJukDAO;

@Repository("sdao")
public class SungJukDAOImpl implements SungJukDAO {

	@Override
	public void insertSungJuk(SungJuk sj) {
		System.out.println("성적 추가됨!");
	}

}
