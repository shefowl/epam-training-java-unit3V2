package by.epam.unit3.сounter;

import java.util.Objects;

public class Counter {
    private int count;
    private int leftRange;
    private int rightRange;

    public Counter() {
        this.count = 0;
        this.leftRange = 0;
        this.rightRange = 100;
    }

    public Counter(int count, int leftRange, int rightRange) {
        this.count = count;
        this.leftRange = leftRange;
        this.rightRange = rightRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if(o == null){
            return false;
        }

        if(this.getClass() != o.getClass()){
            return false;
        }

        Counter counter = (Counter) o;
        return getCount() == counter.getCount() &&
                getLeftRange() == counter.getLeftRange() &&
                getRightRange() == counter.getRightRange();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCount(), getLeftRange(), getRightRange());
    }

    public boolean isOnLeftBound(){
        if( count == leftRange){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isOnRightBound(){
        if( count == rightRange){
            return true;
        }
        else{
            return false;
        }
    }

    public void countUp(){
        if(count != rightRange){
            count++;
        }
        else{
            return;
        }
    }

    public void countDown(){
        if(count != leftRange){
            count--;
        }
        else{
            return;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLeftRange() {
        return leftRange;
    }

    public void setLeftRange(int leftRange) {
        this.leftRange = leftRange;
    }

    public int getRightRange() {
        return rightRange;
    }

    public void setRightRange(int rightRange) {
        this.rightRange = rightRange;
    }
}
