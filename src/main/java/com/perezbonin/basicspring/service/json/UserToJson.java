package com.perezbonin.basicspring.service.json;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.perezbonin.basicspring.model.User;

public class UserToJson {

	public static String objectListJson(List<User> users) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		String arrayToJson = mapper.writeValueAsString(users);

		return arrayToJson;
	}

}
