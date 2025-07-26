package model;

public class Position {
    private int positionId;
    private String  positionName;
    private String descriptin;

    public Position(){}
    public Position(int positionId, String positionName, String descriptin) {
        this.positionId = positionId;
        this.positionName = positionName;
        this.descriptin = descriptin;
    }
    public String getDescriptin() {
        return descriptin;
    }

    public void setDescriptin(String descriptin) {
        this.descriptin = descriptin;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

}
