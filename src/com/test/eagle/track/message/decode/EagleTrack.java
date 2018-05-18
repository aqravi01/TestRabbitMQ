package com.test.eagle.track.message.decode;

import java.time.LocalDateTime;

public class EagleTrack {
	
	private LocalDateTime dateTime;
	private String status;
	private String latitude;
	private String northSouth;
	private String longitude;
	private String eastWest;
	private String speedOverGround;
	private String trackMade;
	private String MagneticVariation;
	private String CheckSum;
	
	
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getNorthSouth() {
		return northSouth;
	}
	public void setNorthSouth(String northSouth) {
		this.northSouth = northSouth;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getEastWest() {
		return eastWest;
	}
	public void setEastWest(String eastWest) {
		this.eastWest = eastWest;
	}
	public String getSpeedOverGround() {
		return speedOverGround;
	}
	public void setSpeedOverGround(String speedOverGround) {
		this.speedOverGround = speedOverGround;
	}
	public String getTrackMade() {
		return trackMade;
	}
	public void setTrackMade(String trackMade) {
		this.trackMade = trackMade;
	}
	public String getMagneticVariation() {
		return MagneticVariation;
	}
	public void setMagneticVariation(String magneticVariation) {
		MagneticVariation = magneticVariation;
	}
	public String getCheckSum() {
		return CheckSum;
	}
	public void setCheckSum(String checkSum) {
		CheckSum = checkSum;
	}

}
