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
import java.util.ArrayList;

/**
 *
 * @author csc190
 */
public class GameEngine implements IGameEngine{
    // -------------- DATA MEBERS ------------------
    protected String mapPath;
    protected Map map;
    protected ICanvasDevice mainview;
    protected ICanvasDevice minimap;
    protected ISoundDevice soundDevice;
    protected ICanvasDevice buttonCanvas;
    protected static GameEngine ge_instance = null;
    protected ArrayList<Sprite> arrSprites = new ArrayList<Sprite>(); //moving objects
    protected ArrayList<StaticObject> arrMapTiles = new ArrayList<StaticObject>();
    protected ArrayList<Team> arrTeams = new ArrayList<Team>();
    protected ArrayList<Sprite> arrSelected = null; //set by Drag operations and released by left click
    protected MouseSprite mouseSprite;
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
        this.buttonCanvas = factoryPanel;
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
        this.mouseSprite = new MouseSprite(mainview, minimap, map);
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
    
    /**
     * Load map tils and load them into the arrMapTiles of the GameEngine.
     * Also create the Map object
     * @param mapPath 
     */
    public void loadGameMap(String mapPath){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    /**
     * Return the left top corner of a free space close to (x,y)
     * The requested free space's dimension is (w,h)
     * @param x
     * @param y
     * @param w
     * @param h
     * @return 
     */
    public Point getFreeSpace(int x, int y, int w, int h){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    public void addSprite(Sprite s){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    public void removeSprite(Sprite s){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    /**
     * return null if no winner
     * @return 
     */
    public Team CheckWinner(){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    /**
     * Display the message correspondingly
     * @param winner 
     */
    public void endGame(Team winner){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    /**
     * Translates the (x1,y1) in canvas into the coordinates in Map
     * @param canvas
     * @param x1
     * @param y1
     * @return 
     */
    public Point getGlobalCoordinates(ICanvasDevice canvas, int x1, int y1, Map map){
        throw new UnsupportedOperationException("not implemented yet");
    }
    
    /**
     * Return the new left-top corner of mainview so that center point is now
     * located at the center of the mainview
     * @param center
     * @param mainview
     * @return 
     */
    public Point getNewLeftTopCoordinates(Point center, ICanvasDevice mainview){
        throw new UnsupportedOperationException("not implemented yet");
    }
    /**
     * 
     * @return human player team (by default it's arrTeams[0])
     */
    public Team getPlayerTeam(){
        throw new UnsupportedOperationException("not implemented yet");
    
    }
    
    /**
     * 
     * @return computer team (by default it's arrTeams[1])
     */
    public Team getAITeam(){
         throw new UnsupportedOperationException("not implemented yet");
    }
    
    /**
     * Get the units (including base but not map tiles) in between pt1 and pt2 that
     * belongs to the given team. If team is null, then both team's units will be 
     * included. Suggestion: use some advanced data storage to guarantee quick response!
     * @param pt1
     * @param pt2
     * @param team
     * @return 
     */
    public ArrayList<Sprite> getArrSprites(Point pt1, Point pt2, Team team){
         throw new UnsupportedOperationException("not implemented yet");
    }

    @Override
    public void onMouseMoved(ICanvasDevice canvas, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Create a background WritableImage for the MiniMap.
     * Implementation idea: draw all maptiles as colored squares on the mini maps
     * canvas and take a snapshot and save it as a WritableImage. Later you can simply
     * draw that image in the minimap's canvas.
     * Note: call canvas.takeSnapshot function.
     */
    public void createBackground(){
        throw new UnsupportedOperationException("not implemented");
    }
    
    /**
     * Take the previously saved snapshot of Minimap background and draw it.
     */
    public void drawBackgroundOfMiniMap(){
        throw new UnsupportedOperationException("not impelemented");
    }
    
    /**
     * Return the team info of the opponent team
     * @param myteam
     * @return 
     */
    public TeamInfo getEnemyTeamInfo(Team myteam){
        throw new UnsupportedOperationException("not implemented yet");
    }
    
    /**
     * Approve if to allow propser to move to rectangle. Lefttop and width and height are provided
     * Algorithm: call getArrSprites to get all colliding with rectangle, and then get the altitude and blocking score to decide.
     * @param proposer
     * @param lefttop_corner
     * @param w
     * @param y
     * @return 
     */
    public boolean approveNextMove(Sprite proposer, Point lefttop_corner, int width, int height){
        throw new UnsupportedOperationException("not implemented yet");
    }
    
    /**
     * The int[][] cost matrix is generated in onRightClick() and saved into a hashmap.
     * Now simply retrieve it from hashmap
     * @param dest
     * @return 
     */
    public int [][] getBFSMap(Point dest){
        throw new UnsupportedOperationException("not implemented yet");
    }
    
    /**
     * Check sequence diagram (2) in D1
     * (1) check if projectile has requested damage before
     * (2) if not, use getArrSprites to get the list of victimes
     * (3) call reducelifepoints for victimes
     * @param projectile 
     */
    public void requestDamage(Projectile projectile){
        throw new UnsupportedOperationException("not implemented yet");
    }
    
}
