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
import BridgePattern.IGameEngine;
import BridgePattern.ISoundDevice;

/**
 *
 * @author csc190
 */
public class GameEngine implements IGameEngine{
    // -------------- DATA MEBERS ------------------
    protected String mapPath;
    protected ICanvasDevice mainview;
    protected ICanvasDevice minimap;
    protected ISoundDevice soundDevice;
    protected ICanvasDevice factoryPanel;
    protected static GameEngine ge_instance = null;
    //---------------- OPERATIONS ------------------
    /**
     * Constructor.
     * An evil craft game engine has 3 canvases: main view, mini map and a panel for manufacturing units
     * @param mapPath
     * @param mainview
     * @param minimap
     * @param factoryPanel
     * @param sound 
     */
    public GameEngine(String mapPath, ICanvasDevice mainview, ICanvasDevice minimap, ICanvasDevice factoryPanel, ISoundDevice sound){
        this.mapPath = mapPath;
        this.mainview = mainview;
        this.minimap = minimap;
        this.soundDevice = soundDevice;
        ge_instance = this;
    }
    
    public static GameEngine getInstance(){
        return ge_instance;
    }

    @Override
    public void init() {
        //DON'T KILL THE following line
        ge_instance  = this;
        //DON'T KILL THE ABOVE LINE
    }

    @Override
    public void onTick() {
        
    }

    @Override
    public void onRightClick(ICanvasDevice canvas, int x, int y) {
        
    }

    @Override
    public void onLeftClick(ICanvasDevice canvas, int x, int y) {
        
    }

    @Override
    public void onRegionSelected(ICanvasDevice canvas, int x1, int y1, int x2, int y2) {
        
    }
    
}
