/**
 * 
 */
package com.raidentrance.jedis;

import redis.clients.jedis.Jedis;

/**
 * @author raidentrance
 *
 */
public class JedisTest {
	public static void main(String[] args) {
		Jedis client = new Jedis("localhost");
		client.set("mykey", "value");
		String value = client.get("mykey");
		System.out.println(value);
		client.close();
	}
}
