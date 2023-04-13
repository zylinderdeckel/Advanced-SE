package test.java.play;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import main.java.alles.HandleInput;
import main.java.play.Computer;
import main.java.play.Person;
import main.java.play.SchereSteinPapier;
import main.java.play.User;

public class TestSSP {
	private InputStream inputStream;
	private User person = new Person();
	private User computer = new Computer();
	private HashMap<String, String> gameMap = new HashMap<String, String>();

	@Before
	public void setGameMap() {
		this.gameMap.put("SCHERE", "schere");
		this.gameMap.put("STEIN", "stein");
		this.gameMap.put("PAPIER", "papier");
	}

	@Test
	public void testCompareDraw() {
		String computer = this.computer.getChoice();
		String person = computer; 
		var compare = new SchereSteinPapier();
		assertEquals("1", compare.compare(computer, person));		
	}
	
	@Test
	public void testCompareWin() {
		String computer = this.computer.getChoice();
		String person = computer; 
		var compare = new SchereSteinPapier();
		assertEquals("2", compare.compare("schere", "stein"));		
	}
	
	@Test
	public void testCompareLose() {
		var compare = new SchereSteinPapier();
		assertEquals("0", compare.compare("stein", "schere"));		
	}
	
	@Test
	public void testComputerGetChoice() {
		
		String choice = this.computer.getChoice();
		
		if(choice.equals("schere")) {
			assertEquals("schere", choice);		
		} else if(choice.equals("stein")) {
			assertEquals("stein", choice);		

		}else if(choice.equals("papier")) {
			assertEquals("papier", choice);		

		} else {
			assertEquals(0, 0);
			System.out.println("Fehler bei der Computer Choice");
		}
	}

	@Test
	public void testValidateFinalResultFehler() {
		int computerPunkte = 2;
		int personPunkte = 2;
		assertEquals("Fehler", new SchereSteinPapier().validateFinalResult(computerPunkte, personPunkte));
	}
	
	@Test
	public void testValidateFinalResultSieg() {
		int computerPunkte = 1;
		int personPunkte = 2;
		assertEquals("Glueckwunsch zum Sieg!", new SchereSteinPapier().validateFinalResult(personPunkte, computerPunkte));
	}
	
	@Test
	public void testValidateFinalResultNiederlage() {
		int computerPunkte = 2;
		int personPunkte = 1;
		assertEquals("Schade, vielleicht beim naechsten Spiel!", new SchereSteinPapier().validateFinalResult(personPunkte, computerPunkte));
	}
	
	@Test
	public void testIncrementUserPoints() {
		this.person.setPoints(1);
//		int oldPoints = this.person.getUserPoints();
		this.person.incrementPoints();
		
		assertEquals(2, this.person.getPoints());
	}
	
	@Test
	public void testGetUserPoints() {
		this.computer.setPoints(1);
		int points = this.computer.getPoints();
		assertEquals(1, points);
	}
	
	@Test
	public void testSetUserPoints() {
		this.computer.setPoints(1);
		assertEquals(1, this.computer.getPoints());
	}
}
