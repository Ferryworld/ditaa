/**
 * ditaa - Diagrams Through Ascii Art
 * 
 * Copyright (C) 2004-2011 Efstathios Sideris
 *
 * ditaa is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * ditaa is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with ditaa.  If not, see <http://www.gnu.org/licenses/>.
 *   
 */
package org.stathissideris.ascii2image.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.stathissideris.ascii2image.text.CellSet;
import org.stathissideris.ascii2image.text.TextGrid;

public class CellSetTest {
	
	TextGrid g = new TextGrid();
	CellSet set = new CellSet();
	
	@Before public void setUp() {
		set.add(g.new Cell(10, 20));
		set.add(g.new Cell(10, 60));
		set.add(g.new Cell(10, 30));
		set.add(g.new Cell(60, 20));		
	}
	
	@Test public void testContains() {
		TextGrid.Cell cell1 = g.new Cell(10, 20);
		TextGrid.Cell cell2 = g.new Cell(10, 20);

		assertTrue(cell1.equals(cell2));
		assertTrue(set.contains(cell1));
	}
}
