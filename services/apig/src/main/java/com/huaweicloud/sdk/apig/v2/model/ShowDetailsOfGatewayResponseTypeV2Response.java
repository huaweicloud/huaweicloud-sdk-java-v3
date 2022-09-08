package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDetailsOfGatewayResponseTypeV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private Map<String, ResponseInfoResp> body = null;

    public ShowDetailsOfGatewayResponseTypeV2Response withBody(Map<String, ResponseInfoResp> body) {
        this.body = body;
        return this;
    }

    public ShowDetailsOfGatewayResponseTypeV2Response putBodyItem(String key, ResponseInfoResp bodyItem) {
        if (this.body == null) {
            this.body = new HashMap<>();
        }
        this.body.put(key, bodyItem);
        return this;
    }

    public ShowDetailsOfGatewayResponseTypeV2Response withBody(Consumer<Map<String, ResponseInfoResp>> bodySetter) {
        if (this.body == null) {
            this.body = new HashMap<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    public Map<String, ResponseInfoResp> getBody() {
        return body;
    }

    public void setBody(Map<String, ResponseInfoResp> body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDetailsOfGatewayResponseTypeV2Response showDetailsOfGatewayResponseTypeV2Response =
            (ShowDetailsOfGatewayResponseTypeV2Response) o;
        return Objects.equals(this.body, showDetailsOfGatewayResponseTypeV2Response.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDetailsOfGatewayResponseTypeV2Response {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
