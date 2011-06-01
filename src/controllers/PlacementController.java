package controllers;

import models.ShipType;

// TODO do we need a mathmodel and constraint?
// TODO add any constructors as @initially

/**
 * A controller for Ship placement for use in battleship. The user of this
 * interface has control over what Ship placements are legal.
 * 
 * @author Group c421aa06
 */
public interface PlacementController {

	/**
	 * Places a Ship, starting at the given x,y coordinate.
	 * 
	 * @param t
	 *            the type of the Ship to place.
	 * @param x
	 *            the x-coordinate of the position of the head of the Ship.
	 * @param y
	 *            the y-coordinate of the position of the head of the Ship.
	 * @param orient
	 *            the orientation of the Ship where {@code true} corresponds to
	 *            alignment along the x-axis, and {@code false} corresponds to
	 *            alignment along the y-axis.
	 * @return {@code true} if the placement is a legitimate placement, and the
	 *         Ship is placed, {@code false} if the Ship cannot be placed where
	 *         attempted.
	 */
	boolean setShipPos(ShipType t, int x, int y, boolean orient);

	/**
	 * Sets the type of the Ship currently selected for placement.
	 * 
	 * @param type
	 *            the ShipType of the Ship being placed.
	 */
	void setSelectedShipType(ShipType type);

	/**
	 * Makes the selected ShipType unavailable for future selection.
	 */
	void disableSelectedShipType();

	/**
	 * Registers the ShipTypeSelector with the PlacementController.
	 * 
	 * @param selector
	 *            the ShipTypeSelector to be used.
	 */
	void registerShipTypeSelector(ShipTypeSelector selector);

	/**
	 * Changes the orientation of the selected Ship.
	 */
	void rotateShip();
}
