package com.fengshanjian.friendforlove.repo.model;

public class MemberWithBLOBs extends Member {
    private byte[] dring;

    private byte[] smoking;

    public byte[] getDring() {
        return dring;
    }

    public void setDring(byte[] dring) {
        this.dring = dring;
    }

    public byte[] getSmoking() {
        return smoking;
    }

    public void setSmoking(byte[] smoking) {
        this.smoking = smoking;
    }
}