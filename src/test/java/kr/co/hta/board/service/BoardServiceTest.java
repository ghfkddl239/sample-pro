package kr.co.hta.board.service;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Assert.*;
import org.hamcrest.CoreMatchers.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import kr.co.hta.board.vo.Board;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/META-INF/spring/test-root-context.xml")
@Transactional
public class BoardServiceTest {

	@Autowired
	BoardService boardService;
	
	@Test
	public void testConfig() {
		assertThat(boardService, notNullValue());
	}
	
	@Test
	public void getAllBoard() {
		assertThat(boardService.getAllBoards(), notNullValue());
	}
	@Test
	public void addNewBoard() {
		Board board = new Board();
		board.setTitle("테스트");
		board.setNick("hong");
		board.setContents("테스트1테스트2테스트3테스트4...");
		
		boardService.addNewBoard(board);
	}
}
