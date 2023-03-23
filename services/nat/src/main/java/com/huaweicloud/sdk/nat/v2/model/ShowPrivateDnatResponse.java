package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPrivateDnatResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dnat_rule")

    private PrivateDnat dnatRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ShowPrivateDnatResponse withDnatRule(PrivateDnat dnatRule) {
        this.dnatRule = dnatRule;
        return this;
    }

    public ShowPrivateDnatResponse withDnatRule(Consumer<PrivateDnat> dnatRuleSetter) {
        if (this.dnatRule == null) {
            this.dnatRule = new PrivateDnat();
            dnatRuleSetter.accept(this.dnatRule);
        }

        return this;
    }

    /**
     * Get dnatRule
     * @return dnatRule
     */
    public PrivateDnat getDnatRule() {
        return dnatRule;
    }

    public void setDnatRule(PrivateDnat dnatRule) {
        this.dnatRule = dnatRule;
    }

    public ShowPrivateDnatResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPrivateDnatResponse showPrivateDnatResponse = (ShowPrivateDnatResponse) o;
        return Objects.equals(this.dnatRule, showPrivateDnatResponse.dnatRule)
            && Objects.equals(this.requestId, showPrivateDnatResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnatRule, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPrivateDnatResponse {\n");
        sb.append("    dnatRule: ").append(toIndentedString(dnatRule)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
