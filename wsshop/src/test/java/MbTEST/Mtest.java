package MbTEST;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dzkj.mapper.UserMapper;
import com.dzkj.pojo.Users;

public class Mtest {
	@Autowired
	UserMapper um;
	@Test
	public void demo1() {
		List<Users> list = um.select(null);
	}

}
