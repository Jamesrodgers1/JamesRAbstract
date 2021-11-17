package com.dkit.oop;
//TODO
// change Rectangle declaration so that Rectangle inherits from Shape

public abstract class Rectangle extends Shape {

    //TODO
    // Rectangle requires fields 'width' and 'height'.
    // implement toString() and getters/setters.
    // area() must be implemented.

        private int width;
        private int height;

        public Rectangle(int x, int y, int height, int width) {
            super(x,y);
            this.width = width;
            this.height = height;
        }

    @Override
    public double area(){

            return this.height * this.width;
    }



    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }


    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        // call superclass toString method to get Shape details
        return super.toString() + "[height=" + this.height + "]" + "[width=" + this.width + "]";
    }


}
