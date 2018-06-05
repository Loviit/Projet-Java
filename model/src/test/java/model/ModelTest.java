package model;

import static org.junit.Assert.*;

import java.awt.Image;

import javax.swing.ImageIcon;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * <h1>The test for all Model.</h1>
 * 
 * @author Alyssa BINARD
 * @version 1.0
 * @see assertEquals
 * @see After
 * @see AfterClass
 * @see Before
 * @see BeforeClass
 * @see Test
 * @see Image
 * @see ImageIcon
 */
public class ModelTest {

	/**
	 * (non-javadoc) setUpBeforeClass
	 * 
	 * @throws Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * (non-javadoc) tearDownAfterClass
	 * 
	 * @throws Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * (non-javadoc) setUp
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * (non-javadoc) tearDown
	 * 
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test Bone H.
	 */
	@Test
	public void testBone_H() {
		int expected = 1;
		Bone_H bone_H = new Bone_H(expected, expected);
		assertEquals(expected, bone_H.getX());
		assertEquals(expected, bone_H.getY());
		ImageIcon img = new ImageIcon("../sprite/horizontal_bone.png");
		Image imgBH = img.getImage();
		assertEquals(imgBH, bone_H.getImage());
	}

	/**
	 * Test Bone V.
	 */
	@Test
	public void testBone_V() {
		int expected = 1;
		Bone_V bone_V = new Bone_V(expected, expected);
		assertEquals(expected, bone_V.getX());
		assertEquals(expected, bone_V.getY());
		ImageIcon img = new ImageIcon("../sprite/vertical_bone.png");
		Image imgBH = img.getImage();
		assertEquals(imgBH, bone_V.getImage());
	}

	/**
	 * Test Bone.
	 */
	@Test
	public void testBone() {
		int expected = 1;
		Bone bone = new Bone(expected, expected);
		assertEquals(expected, bone.getX());
		assertEquals(expected, bone.getY());
		ImageIcon img = new ImageIcon("../sprite/bone.png");
		Image imgBH = img.getImage();
		assertEquals(imgBH, bone.getImage());
	}

	/**
	 * Test Crystal Ball.
	 */
	@Test
	public void testCrystal_Ball() {
		int expected = 1;
		Crystal_Ball crystal_Ball = new Crystal_Ball(expected, expected);
		assertEquals(expected, crystal_Ball.getX());
		assertEquals(expected, crystal_Ball.getY());
		ImageIcon img = new ImageIcon("../sprite/crystal_ball.png");
		Image imgBH = img.getImage();
		assertEquals(imgBH, crystal_Ball.getImage());
	}

	/**
	 * Test Monster_1.
	 */
	@Test
	public void testMonster_1() {
		int expected = 0;
		Monster_1 monster1 = new Monster_1(expected, expected);
		assertEquals(expected, monster1.getX());
		assertEquals(expected, monster1.getY());
		ImageIcon img = new ImageIcon("../sprite/monster_1.png");
		Image imgM1 = img.getImage();
		assertEquals(imgM1, img.getImage());
	}

	/**
	 * Test Monster_2.
	 */
	@Test
	public void testMonster_2() {
		int expected = 0;
		Monster_2 monster2 = new Monster_2(expected, expected);
		assertEquals(expected, monster2.getX());
		assertEquals(expected, monster2.getY());
		ImageIcon img = new ImageIcon("../sprite/monster_2.png");
		Image imgM2 = img.getImage();
		assertEquals(imgM2, monster2.getImage());
	}

	/**
	 * Test Monster_3.
	 */
	@Test
	public void testMonster_3() {
		int expected = 0;
		Monster_3 monster3 = new Monster_3(expected, expected);
		assertEquals(expected, monster3.getX());
		assertEquals(expected, monster3.getY());
		ImageIcon img = new ImageIcon("../sprite/monster_3.png");
		Image imgM3 = img.getImage();
		assertEquals(imgM3, monster3.getImage());
	}

	/**
	 * Test Monster_4.
	 */
	@Test
	public void testMonster_4() {
		int expected = 0;
		Monster_4 monster4 = new Monster_4(expected, expected);
		assertEquals(expected, monster4.getX());
		assertEquals(expected, monster4.getY());
		ImageIcon img = new ImageIcon("../sprite/monster_4.png");
		Image imgM4 = img.getImage();
		assertEquals(imgM4, monster4.getImage());
	}

	/**
	 * Test walls.
	 */
	@Test
	public void testWalls() {
		int expected = 0;
		Walls wall = new Walls();
		assertEquals(expected, wall.getX());
		assertEquals(expected, wall.getY());
	}

	/**
	 * Test uncrossable.
	 */
	@Test
	public void testUncrossable() {
		int expected = 0;
		Uncrossable noCross = new Uncrossable();
		assertEquals(expected, noCross.getX());
		assertEquals(expected, noCross.getY());
	}

}
