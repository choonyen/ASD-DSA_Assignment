/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Choonyen
 */
public class Size {
    private char sizeCode;
    private double size;
    private double fee;

    public Size(char sizeCode, double size, double fee) {
        this.sizeCode = sizeCode;
        this.size = size;
        this.fee = fee;
    }

    public char getSizeCode() {
        return sizeCode;
    }

    public void setSizeCode(char sizeCode) {
        this.sizeCode = sizeCode;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
