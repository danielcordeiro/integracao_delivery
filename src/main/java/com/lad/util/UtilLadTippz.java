package com.lad.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilLadTippz {

	public static Date formataDataAtualComT(String data) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		try {
			data = data.replace(" ", "T");
			Date date = formatter.parse(data);
			return date;
		} catch (ParseException e) {
		}
		return null;
	}
}
