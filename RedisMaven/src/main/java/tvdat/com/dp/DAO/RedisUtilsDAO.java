package tvdat.com.dp.DAO;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

final class RedisConnection {
	private Jedis jedis = null;
	private static RedisConnection _instance = null;
	private JedisPool pool = null;
	public Jedis getJedisConnection() {
        return this.jedis;
    }
	private RedisConnection() {
		this.pool = new JedisPool("localhost", 6379);
		this.jedis = pool.getResource();
	}
	public static RedisConnection  getInstance() {
        if (_instance == null) {
            _instance = new RedisConnection();
        }
        return _instance;
    }
	
}