package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateFirewallRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Client-Token")

    private String xClientToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateFirewallReq body;

    public CreateFirewallRequest withXClientToken(String xClientToken) {
        this.xClientToken = xClientToken;
        return this;
    }

    /**
     * 保证客户端请求幂等性的标识。  该标识为32位UUID格式，由客户端生成，且需确保不同请求之间该标识具有唯一性。
     * @return xClientToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Client-Token")
    public String getXClientToken() {
        return xClientToken;
    }

    public void setXClientToken(String xClientToken) {
        this.xClientToken = xClientToken;
    }

    public CreateFirewallRequest withBody(CreateFirewallReq body) {
        this.body = body;
        return this;
    }

    public CreateFirewallRequest withBody(Consumer<CreateFirewallReq> bodySetter) {
        if (this.body == null) {
            this.body = new CreateFirewallReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateFirewallReq getBody() {
        return body;
    }

    public void setBody(CreateFirewallReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFirewallRequest that = (CreateFirewallRequest) obj;
        return Objects.equals(this.xClientToken, that.xClientToken) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xClientToken, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFirewallRequest {\n");
        sb.append("    xClientToken: ").append(toIndentedString(xClientToken)).append("\n");
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
