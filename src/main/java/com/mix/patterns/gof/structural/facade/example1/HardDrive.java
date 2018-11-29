package com.mix.patterns.gof.structural.facade.example1;

public class HardDrive {

    public byte[] read(long lba, int size) {
        System.out.println("HardDrive#read");
        return new byte[]{};
    }
}
