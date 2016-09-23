/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.games.pathfinding;

import com.badlogic.gdx.ai.pfa.Heuristic;

/**
 *
 * @author Aluno
 */
public class HeuristicNula implements Heuristic<TileNode>{
    //public HeuristicNula(){
        
    //}
    @Override 
            public float estimate(TileNode n1, TileNode n2) { 
                /*throw new UnsupportedOperationException("Deveria ter retornado "
                        + "um valor para a heurística no arquivo "
                        + "Agent.java:107, mas o professor resolveu explodir "
                        + "o programa e deixar você consertar ;)"); */
               return 0;
            }
    
}
