package main.java.com.model;

import main.java.com.utility.Position;

/**
 * A game entity that can be eaten by the snake (e.g. the apple)
 *
 */
public interface EatableEntity extends GameEntity {

    /**
     * Sets the position of the entity.
     * @param pos
     */
    void setPosition(Position pos);

    /**
     * 
     * @return the number of times this entity has been eaten;
     */
    int getTimesEaten();

    /**
     * Resets the times the apple has been eaten.
     */
    void resetTimesEaten();

    /**
     * Increment the number of times this entity has been eaten.
     */
    void incrementEatenCounter();

    /**
     * 
     * @return how many points the apple values.
     */
    int getPointsValue();
}