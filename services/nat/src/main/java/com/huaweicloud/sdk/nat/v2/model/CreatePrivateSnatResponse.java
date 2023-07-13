package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreatePrivateSnatResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snat_rule")

    private PrivateSnat snatRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public CreatePrivateSnatResponse withSnatRule(PrivateSnat snatRule) {
        this.snatRule = snatRule;
        return this;
    }

    public CreatePrivateSnatResponse withSnatRule(Consumer<PrivateSnat> snatRuleSetter) {
        if (this.snatRule == null) {
            this.snatRule = new PrivateSnat();
            snatRuleSetter.accept(this.snatRule);
        }

        return this;
    }

    /**
     * Get snatRule
     * @return snatRule
     */
    public PrivateSnat getSnatRule() {
        return snatRule;
    }

    public void setSnatRule(PrivateSnat snatRule) {
        this.snatRule = snatRule;
    }

    public CreatePrivateSnatResponse withRequestId(String requestId) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePrivateSnatResponse that = (CreatePrivateSnatResponse) obj;
        return Objects.equals(this.snatRule, that.snatRule) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snatRule, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrivateSnatResponse {\n");
        sb.append("    snatRule: ").append(toIndentedString(snatRule)).append("\n");
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
