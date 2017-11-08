package com.lad.junit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lad.ifood.to.IOrder;
import com.lad.tippz.to.TItem;
import com.lad.util.UtilLadIfood;

import junit.framework.TestCase;

public class Test extends TestCase {

	@org.junit.Test
	public void test_jsonToObjectIfood() {

		try {
			String json = "{\"id\": \"ff8080815e4c7930015e4e1b8e4c4c20\",\"reference\": \"1234567890123456\",\"shortReference\": \"1234\",\"createdAt\": \"2017-09-04T18:16:21Z\",\"type\": \"DELIVERY\",\"merchant\": {\"id\": \"123456\",\"name\": \"Restaurante iFood\",\"phones\": [\"(11) 12345679\"],\"address\": {\"country\": \"BR\",\"state\": \"SP\",\"city\": \"SAO PAULO\",\"neighborhood\": \"OUTROS\",\"streetName\": \"R Teste\",\"streetNumber\": \"100\",\"postalCode\": \"12345679\"}},\"payments\": [{\"name\": \"DINHEIRO\",\"code\": \"DIN\",\"value\": 71.04,\"prepaid\": false,\"externalCode\": \"2\",\"changeFor\": 71.04}],\"customer\": {\"id\": \"1751813\",\"name\": \"Cliente\",\"phone\": \"11 - 123456789\",\"email\": \"CLIENTE@TESTE.COM.BR\"},\"items\": [{\"name\": \"Refrigerante Laranja 2 LT\",\"quantity\": 1,\"price\": 7.5,\"subItemsPrice\": 0,\"totalPrice\": 7.5,\"discount\": 0,\"externalCode\": \"050017\"},{\"name\": \"GRANDE 2 SABORES\",\"quantity\": 1,\"price\": 0,\"subItemsPrice\": 44.44,\"totalPrice\": 44.44,\"discount\": 0,\"subItems\": [{\"name\": \"1/2 VEGETARIANA\",\"quantity\": 1,\"price\": 16.67,\"totalPrice\": 16.67,\"discount\": 0},{\"name\": \"1/2 ALHO\",\"quantity\": 1,\"price\": 27.77,\"totalPrice\": 27.77,\"discount\": 0},{\"name\": \"TRADICIONAL\",\"quantity\": 1,\"price\": 0,\"totalPrice\": 0,\"discount\": 0}]}],\"subTotal\": 51.94,\"totalPrice\": 59.94,\"deliveryFee\": 8,\"deliveryAddress\": {\"formattedAddress\": \"R TESTE, 987\",\"country\": \"BR\",\"state\": \"SP\",\"city\": \"SAO PAULO\",\"coordinates\": {\"latitude\": -23.550618,\"longitude\": -46.632906},\"neighborhood\": \"OUTROS\",\"streetName\": \"R TESTE\",\"streetNumber\": \"987\",\"postalCode\": \"12345678\",\"reference\": \"Proximo a Padaria\",\"complement\": \"casa X\"},\"deliveryDateTime\": \"2017-09-04T18:16:21.76Z\"}";
			Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();
			IOrder order = gson.fromJson(json, IOrder.class);

			assertEquals(UtilLadIfood.formataDataAtualComT(order.getCreatedAt()), order.getCreatedAtDate());

			assertNotNull(order.getId());
			assertTrue(true);
		} catch (Exception e) {
			assertTrue(false);
			e.printStackTrace();
			System.out.println(e.fillInStackTrace());
		}
	}

	@org.junit.Test
	public void test_jsonToObjectTippz() {

		try {
			String json = "";
			Gson gson = new GsonBuilder().create();
			TItem item = gson.fromJson(json, TItem.class);

			assertTrue(true);
		} catch (Exception e) {
			assertTrue(false);
			e.printStackTrace();
			System.out.println(e.fillInStackTrace());
		}
	}

}
