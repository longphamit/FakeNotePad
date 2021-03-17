/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Asus
 */
public class Pos {

    private String data;
    private Pos next;
    private Pos previos;

    public Pos(String data, Pos next, Pos previos) {
        this.data = data;
        this.next = next;
        this.previos = previos;
    }
    
}
