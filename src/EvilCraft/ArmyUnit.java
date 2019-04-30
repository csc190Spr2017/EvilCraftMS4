/*
 * Copyright (C) 2019 csc190
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package EvilCraft;

/**
 * Base class of Tank, Infantry and Airplane
 * @author csc190
 */
public abstract class ArmyUnit extends Sprite{
    protected SpriteInfo attackGoal = null;
    protected Point navigationGoal = null;
    private int coolTicksNeeded = 0;

    public ArmyUnit(Team team, int x, int y, int w, int h, int lifepoints, int altitude, int block_score) {
        super(team, x, y, w, h, lifepoints, altitude, block_score);
    }
    /**
     * Set the long term navigation goal to pt
     * @param pt 
     */
    public void setNavigationGoal(Point pt){
        this.navigationGoal = pt;
    }
    
    /**
     * Set the PRIORITY attack goal. If sp is in the range, it should be attacked first.
     * @param sp 
     */
    public void setAttackGoal(SpriteInfo sp){
        this.attackGoal = sp;
    }
    
    /**
     * Decrease coolTicksNeeded
     */
    public void cooldown(){
        this.coolTicksNeeded--;
        if(this.coolTicksNeeded<0){
            this.coolTicksNeeded = 0;
        }
    }
    
    /**
     * When ticks needed reaches 0, return true
     * @return 
     */
    public boolean isCooledDown(){
        return this.coolTicksNeeded<=0;
    }
    
    /**
     * Set the coolTicksNeeded to the specified value
     * @param val 
     */
    public void setCoolTicksNeeded(int val){
        //only allow set when it's already 0
        if(this.coolTicksNeeded==0){
            this.coolTicksNeeded = val;
        }
    }
    
    /**
     * Needs to override. Call setCoolTicksNeeded. Find the right number
     * to set in Chart of D1.
     */
    public abstract void resetCoolRate();
    /**
     * Check sequence diagram 1 of D1.
     * (1) get the goal of fire
     * (2) call cooldown()
     * (3) check if gun is pointing at goal and if it's already cooled down
     * (4) fire at enemy or rotate gun
     * 
     */
    public void setFireAction(){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    /**
     * Check Sequence Diagram 1 in D1 for details.
     * Ask GameEngine.getArrSprites for enemy units in the shooting range.
     * If attackGoal is there, it's the priority goal.
     * Otherwise, pick one enemy unit in the range.
     * @return 
     */
    public abstract SpriteInfo getFiringGoal();
    
    /**
     * Return true if gun heading points to goal. Implementation
     * is similar to isFacing()
     * @param goal 
     */
    public abstract boolean isGunFacing(Point goal);
    
    /**
     * Adjust gun heading so that it's pointing to goal
     * @param goal 
     */
    public abstract void adjustGunHeading(Point goal);
    
    /**
     * Basically this is to create a Projectile at the destination locatoin pt
     * @param pt 
     */
    public abstract void fireAt(Point pt);
    
    
    
   
    
    
}
