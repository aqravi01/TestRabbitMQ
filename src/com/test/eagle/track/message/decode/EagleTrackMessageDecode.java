package com.test.eagle.track.message.decode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class EagleTrackMessageDecode {

	public static void main(String[] args) {
		decode("$GPRMC,045630.000,A,1257.9794,N,07744.3124,E,3.18,160.92,200817,,,A*66");
	}
	
	
	public static void decode(String string) {
		
		List<String> a = Arrays.asList(string.split(","));
		String Time = a.get(1);
		String Status = a.get(2);
		String latitude = a.get(3);
		String n_s = a.get(4);
		String longitude = a.get(5);
		String e_w = a.get(6);
		String SpeedOverGround = a.get(7);
		String TrackMade = a.get(8);
		String date = a.get(9);
		String MagneticVariation = a.get(10);
		String CheckSum = a.get(12);
		
		System.out.println("Time : "+Time +", Status : "+Status+", latitude: "+latitude+", North/South : "+n_s+", longitude"+ longitude+ ", East/West : "+e_w+", SpeedOverGround : "+SpeedOverGround+
			", TrackMade: "+TrackMade + ", Date : "+ date+", MagneticVariation : "+MagneticVariation+", CheckSum : "+CheckSum
				);
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HHmmss.SSS");
		LocalTime lt = LocalTime.parse(Time, formatter1);
		
		System.out.println("Time:"+lt);
		
		
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("ddMMyy");
		LocalDate ld = LocalDate.parse(date, formatter2);
		
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime dt = LocalDateTime.parse(ld+" "+lt, formatter3);
		System.out.println("Date Time : "+dt );
		
	}

}
