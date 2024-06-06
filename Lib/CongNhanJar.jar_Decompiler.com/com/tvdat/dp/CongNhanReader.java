/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.tvdat.dp;

import com.tvdat.dp.CongNhan;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class CongNhanReader {
    public static List<CongNhan> readFromFile(String filename) throws IOException {
        String line;
        ArrayList<CongNhan> lst = new ArrayList<CongNhan>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        while ((line = br.readLine()) != null) {
            String[] info = line.split(",");
            if (info.length < 2) continue;
            String hoTen = info[0];
            String ngayBatDauLamViec = info[1];
            CongNhan x = new CongNhan(hoTen, Date.valueOf(ngayBatDauLamViec));
            lst.add(x);
        }
        br.close();
        return lst;
    }
}

