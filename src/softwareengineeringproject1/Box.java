/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareengineeringproject1;

/**
 *
 * @author mille
 */
public class Box {
    
    private int height, width;
    private int xcoord, ycoord;
    
    public Box(int xcoord, int ycoord, int width, int height){
        this.xcoord = xcoord;
        this.ycoord = ycoord;
        this.width = width;
        this.height = height;
    }
}