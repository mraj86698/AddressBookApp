package com.example.demo.Utility;

import org.springframework.stereotype.Component;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.JWT;

@Component
public class AddressBookUtility {
	 private static final String SECRET="Mohan";
	    public String createToken(int empId)
	    {
	        String token= JWT.create().withClaim("id",empId).sign(Algorithm.HMAC256(SECRET));
	        return token;
	    }

	    public int decodeJWT(String jwt)
	    {
	        int id=0;
	        if(jwt!=null)
	        {
	            id=JWT.require(Algorithm.HMAC256(SECRET)).build().verify(jwt).getClaim("id").asInt();
	        }
	        return id;
	    }

}
