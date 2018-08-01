/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.model;

/**
 *
 * @author Stephen
 */
public enum SceneType {
    
    BushLand("Dry. Sucumbs easily to wildfire"),
    Plains("Beautiful Grasses with herds of Bison"),
    Forest("Tall trees and woodland animals"),
    Jungle("Difficult to pass through dense undergrowth"),
    Canyon("Perilous passage for wagons. Beware of rattlesnakes"),
    RedForest("Red rocks and Pinion Pines. Water Springs are hard to find."),
    River("Fishing here is the native's way of life."),
    Lake("Take rest in the shade and water your animals here."),
    Waterfall("This beautiful place may have hidden dangers."),
    Tundra("A cold wasteland with little resources."),
    Sparse("Be prepared for hard times."),
    CrackedEarth("There has been no rain here for many months."),
    Arid("Hot and dry conditions to be expected."),
    Desert("Although dry, you might find rabbits or other small animals."),
    Hills("Stony paths but plentiful with deer."),
    Mountain("Difficult terrain expected for wagons and animals"),
    Stream("Take your time here to replenish your supply of water."),
    Town("There may be opportunities for trade in this bustling metropolis."),
    Village("Inhabitants are wary, but often willing to trade for goods."),
    Encampment("Fellow travelers are often very good company"),
    IndianCamp("Someimtes friendly, sometimes not. Be careful what you say."),
    Caves("Perfect shelter for windy or rainy nights."),
    Swamp("Best find your way around this swampy mess"),
    DryRiver("This place has little to offer."),
    Flooded("Wagons and oxen might need leverage in this location."),
    MuddyPath("Be prepared for a slow journey"),
    Zion("Perfect place to raise a family");
    
    private String description;
    
    SceneType(String description) {
        this.description = description;
    }

    public String description() {
        return description;
    }
}
