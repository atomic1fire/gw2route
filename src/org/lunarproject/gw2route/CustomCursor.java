package org.lunarproject.gw2route;

/**
 * CustomCursor.java for cross-class use of custom cursors. Java cursors do not
 * support transparency level so those pixels will appear as black.
 */
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class CustomCursor {
	
	Cursor NORMAL;
	Cursor POINTER;
	Cursor RESIZE_N;
	Cursor RESIZE_NE;
	Cursor RESIZE_E;
	Cursor RESIZE_SE;
	Cursor RESIZE_S;
	Cursor RESIZE_SW;
	Cursor RESIZE_W;
	Cursor RESIZE_NW;
	Point pointStandard;
	Point pointCenter;
	
	public CustomCursor()
	{
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		pointStandard = new Point(0, 0);
		pointCenter = new Point(16, 16);
		
		NORMAL = toolkit.createCustomCursor(
			new ImageIcon(this.getClass().getResource("/cursor/normal.png")).getImage(),
			pointStandard, null);
		POINTER = toolkit.createCustomCursor(
			new ImageIcon(this.getClass().getResource("/cursor/pointer.png")).getImage(),
			pointStandard, null);
		
		RESIZE_N = toolkit.createCustomCursor(
			new ImageIcon(this.getClass().getResource("/cursor/vertical.png")).getImage(),
			pointCenter, null);
		RESIZE_NE = toolkit.createCustomCursor(
			new ImageIcon(this.getClass().getResource("/cursor/diagonal_right.png")).getImage(),
			pointCenter, null);
		RESIZE_E = toolkit.createCustomCursor(
			new ImageIcon(this.getClass().getResource("/cursor/horizontal.png")).getImage(),
			pointCenter, null);
		RESIZE_SE = toolkit.createCustomCursor(
			new ImageIcon(this.getClass().getResource("/cursor/diagonal_left.png")).getImage(),
			pointCenter, null);
		RESIZE_S = toolkit.createCustomCursor(
			new ImageIcon(this.getClass().getResource("/cursor/vertical.png")).getImage(),
			pointCenter, null);
		RESIZE_SW = toolkit.createCustomCursor(
			new ImageIcon(this.getClass().getResource("/cursor/diagonal_right.png")).getImage(),
			pointCenter, null);
		RESIZE_W = toolkit.createCustomCursor(
			new ImageIcon(this.getClass().getResource("/cursor/horizontal.png")).getImage(),
			pointCenter, null);
		RESIZE_NW = toolkit.createCustomCursor(
			new ImageIcon(this.getClass().getResource("/cursor/diagonal_left.png")).getImage(),
			pointCenter, null);
	}
}
