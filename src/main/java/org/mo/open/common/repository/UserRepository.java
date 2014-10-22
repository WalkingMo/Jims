package org.mo.open.common.repository;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mo.open.common.entity.User;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends BaseRepository<User, String> {
	
	/**
	 * 获取当前时间
	 * 
	 * @return
	 */
	public java.sql.Date getCurrentTime();
	
	public int countAll(@Param("account") String account,
			@Param("username") String username);

	public List<User> selectAll(@Param("account") String account,
			@Param("username") String username, @Param("offset") int offset,
			@Param("size") int size);

	public User selectUserByAccountAndPassword(@Param("account")String account, @Param("password")String password);

}
