package bearerTokenGenerate;

import static io.restassured.RestAssured.given;

import allCommonData.AllCommonVariables;
import io.restassured.response.Response;

public class MethodsBearerTokenGenerate {
	public static Response methodBearerToken() {
		Response responseOrderFlowGenerateBearerToken =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Content-Type",AllCommonVariables.varContentTypeHeader)
	            	.body(RequestPayloadsBearerTokenGenerate.rTPBearerToken)
	            .when()
	            	.post("user/client/token");
		
		if (responseOrderFlowGenerateBearerToken.statusCode() == 200) {
			VarBearerTokenGenerate.varBearerTokenValue = responseOrderFlowGenerateBearerToken.jsonPath().getString("payload.access_token");
			VarBearerTokenGenerate.varBearerTokenValue = "Bearer " + VarBearerTokenGenerate.varBearerTokenValue;
        }
		return responseOrderFlowGenerateBearerToken;
	}
}
