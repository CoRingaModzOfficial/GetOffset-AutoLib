// ----- ----- Class 1: LibMy----- -----

package com.cmods.exec;

public class LibMy {
	public final static int EOF = -1;
}


// ----- ----- Class 1 CMODsDM ----- -----

package com.cmods.exec;

import static com.cmods.exec.LibMy.EOF;
import java.io.IOException;
import java.io.RandomAccessFile;


public class CMODsDM {
	public static void main(String[] args) throws IOException {
		byte ch;
		String CMODscr = s8("\127\376\377\312");
		RandomAccessFile FileLocal = new RandomAccessFile("/data/data/com.dts.freefireth/lib/libil2cpp.so", "r");
		int i = 0, j = 0;
		while((ch = (byte)CMODscr.read()) != EOF) {
			if(ch == CMODscr.get(j)) {
				if(j == CMODscr.length() - 1) {
					System.out.printf("Wall Stone \nOffset : 0x%x", i - CMODscr.length() + 1);
					break;
				}
				j++;
			} else {
				j = 0;
			}
			i++;
		}
		FileLocal.close();
	}
}
/*
2022
By CMODs
Telegram @CoRingaModzYT

This Code is a Base , Use it Your Way , it may contain error depending on its form


Este Código é uma Base , Use do Seu Jeito , pode conter erro dependendo de sua forma
*/
