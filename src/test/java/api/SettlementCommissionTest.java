package api;

import api.pojo.OrderReq;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

public class SettlementCommissionTest {

    @Test
    public void restTest() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        OrderReq orderReq = new OrderReq();

        orderReq.setSenderBankId(10400);
        orderReq.setRecipientBankId(null);
        orderReq.setCountryCode("ARM");
        orderReq.setAcceptedCurrency("RUB");
        orderReq.setWithdrawCurrency("AMD");
        orderReq.setAmount(1000.00);
        orderReq.setOperationType(null);
        orderReq.setAmountType(null);
        orderReq.setAmountType(null);
        orderReq.setValues(null);

        String resultJson = objectMapper.writeValueAsString(orderReq);

        RestAssured
                .given()
                .log().all()
                .when()
                .contentType(ContentType.JSON)
                .body(resultJson)
                .post("https://slt-test.info.api.unistream.com/api/v1/transfer/calculate")
                .then()
                .log().all();

    }
}
