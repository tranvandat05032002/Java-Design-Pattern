/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.tvdat.dp;

import java.sql.Date;

public class CongNhan {
    private String hoTen;
    private Date ngayBatDauLamViec;

    public CongNhan(String hoTen, Date ngayBatDauLamViec) {
        this.hoTen = hoTen;
        this.ngayBatDauLamViec = ngayBatDauLamViec;
    }

    public CongNhan() {
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public Date getNgayBatDauLamViec() {
        return this.ngayBatDauLamViec;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgayBatDauLamViec(Date ngayBatDauLamViec) {
        this.ngayBatDauLamViec = ngayBatDauLamViec;
    }
}

