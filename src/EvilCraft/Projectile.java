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

import BridgePattern.ICanvasDevice;

/**
 *
 * @author csc190
 */
public abstract class Projectile extends Sprite{
    //-----------DATA OPERATIONS ------------
    protected int destx, desty; //destination coordinates, should explode there
    private boolean bHasRequestedDamage = false;
    //----------------------------------------
    
    public Projectile(Team team, int x, int y, int w, int h, int lifepoints, int altitude, int block_score, int destx, int desty) {
        super(team, x, y, w, h, lifepoints, altitude, block_score);
        this.destx = destx;
        this.desty = desty;
    }
    
    public boolean hasRequestedDamage(){
        return this.bHasRequestedDamage;
    }
    
    public void setHasRequestedDamage(){
        this.bHasRequestedDamage = true;
    }
    
   
    /**
     * If (x,y) is close to (destx,desty) return true;
     * @return 
     */
    public boolean isTimeToExplode(){
        throw new UnsupportedOperationException("not implemented yet");
    }
    
    /**
     * Read about sequence diagram #2 in D1 wiki pages.
     * (1) check if isTimeToExplode()
     * (2) If yes, submit request to GameEngine.requestDamage(this)
     */
    public void applyDamage(){
        throw new UnsupportedOperationException("not implemented yet");
    }
    

  
}
