package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateL7PolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7policy")

    private L7Policy l7policy;

    public UpdateL7PolicyResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**：请求ID。  **取值范围**：由数字、小写字母和中划线（-）组成的字符串，自动生成。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UpdateL7PolicyResponse withL7policy(L7Policy l7policy) {
        this.l7policy = l7policy;
        return this;
    }

    public UpdateL7PolicyResponse withL7policy(Consumer<L7Policy> l7policySetter) {
        if (this.l7policy == null) {
            this.l7policy = new L7Policy();
            l7policySetter.accept(this.l7policy);
        }

        return this;
    }

    /**
     * Get l7policy
     * @return l7policy
     */
    public L7Policy getL7policy() {
        return l7policy;
    }

    public void setL7policy(L7Policy l7policy) {
        this.l7policy = l7policy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateL7PolicyResponse that = (UpdateL7PolicyResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.l7policy, that.l7policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, l7policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateL7PolicyResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    l7policy: ").append(toIndentedString(l7policy)).append("\n");
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
