package xyz.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import xyz.itwill.dto.MyComment1;
import xyz.itwill.dto.MyComment2;
import xyz.itwill.dto.MyComment3;
import xyz.itwill.dto.MyCommentReply;
import xyz.itwill.dto.MyCommentReplyUser;
import xyz.itwill.dto.MyCommentUser1;
import xyz.itwill.dto.MyCommentUser2;
import xyz.itwill.dto.MyReply;
import xyz.itwill.mapper.MyCommentMapper;

public class MyCommentDAO extends AbstractSession {
	private static MyCommentDAO _dao;
	
	private MyCommentDAO() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		_dao=new MyCommentDAO();
	}
	
	public static MyCommentDAO getDAO() {
		return _dao;
	}
	
	public int insertComment(MyComment1 comment) {
		SqlSession sqlSession=getSqlSessionFactory().openSession(true);
		try {
			return sqlSession.getMapper(MyCommentMapper.class).insertComment(comment);
		} finally {
			sqlSession.close();
		}
	}
	
	public List<MyComment1> selectCommentList1() {
		SqlSession sqlSession=getSqlSessionFactory().openSession(true);
		try {
			return sqlSession.getMapper(MyCommentMapper.class).selectCommentList1();
		} finally {
			sqlSession.close();
		}
	}
	
	public List<MyComment2> selectCommentList2() {
		SqlSession sqlSession=getSqlSessionFactory().openSession(true);
		try {
			return sqlSession.getMapper(MyCommentMapper.class).selectCommentList2();
		} finally {
			sqlSession.close();
		}
	}
	
	public List<MyComment3> selectCommentList3() {
		SqlSession sqlSession=getSqlSessionFactory().openSession(true);
		try {
			return sqlSession.getMapper(MyCommentMapper.class).selectCommentList3();
		} finally {
			sqlSession.close();
		}
	}
	
	public List<MyCommentUser1> selectCommentUserList1() {
		SqlSession sqlSession=getSqlSessionFactory().openSession(true);
		try {
			return sqlSession.getMapper(MyCommentMapper.class).selectCommentUserList1();
		} finally {
			sqlSession.close();
		}
	}
	
	public List<MyCommentUser2> selectCommentUserList2() {
		SqlSession sqlSession=getSqlSessionFactory().openSession(true);
		try {
			return sqlSession.getMapper(MyCommentMapper.class).selectCommentUserList2();
		} finally {
			sqlSession.close();
		}
	}
	
	public MyComment1 selectComment(int commentNo) {
		SqlSession sqlSession=getSqlSessionFactory().openSession(true);
		try {
			return sqlSession.getMapper(MyCommentMapper.class).selectComment(commentNo);
		} finally {
			sqlSession.close();
		}
	}

	public List<MyReply> selectCommentNoReplyList(int replyCommentNo) {
		SqlSession sqlSession=getSqlSessionFactory().openSession(true);
		try {
			return sqlSession.getMapper(MyCommentMapper.class).selectCommentNoReplyList(replyCommentNo);
		} finally {
			sqlSession.close();
		}
	}
	
	public MyCommentReply selectCommentReply(int commentNo) {
		SqlSession sqlSession=getSqlSessionFactory().openSession(true);
		try {
			return sqlSession.getMapper(MyCommentMapper.class).selectCommentReply(commentNo);
		} finally {
			sqlSession.close();
		}
	}
	
	public MyCommentReplyUser selectCommentReplyUser(int commentNo) {
		SqlSession sqlSession=getSqlSessionFactory().openSession(true);
		try {
			return sqlSession.getMapper(MyCommentMapper.class).selectCommentReplyUser(commentNo);
		} finally {
			sqlSession.close();
		}
	}
}
