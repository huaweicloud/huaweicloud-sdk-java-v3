package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AddWafWhiteIpRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AddWafWhiteIpRuleV2RequestBody body;

    public AddWafWhiteIpRuleRequest withBody(AddWafWhiteIpRuleV2RequestBody body) {
        this.body = body;
        return this;
    }

    public AddWafWhiteIpRuleRequest withBody(Consumer<AddWafWhiteIpRuleV2RequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new AddWafWhiteIpRuleV2RequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AddWafWhiteIpRuleV2RequestBody getBody() {
        return body;
    }

    public void setBody(AddWafWhiteIpRuleV2RequestBody body) {
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
        AddWafWhiteIpRuleRequest that = (AddWafWhiteIpRuleRequest) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddWafWhiteIpRuleRequest {\n");
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
