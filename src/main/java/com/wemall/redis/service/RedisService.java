package com.wemall.redis.service;

import org.springframework.data.redis.core.RedisTemplate;

public interface RedisService {
	public RedisTemplate<String, String> getRedisTemplate();
}
