package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateObsTargetPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private String targetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private ObsDataRepositoryPolicy policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public UpdateObsTargetPolicyResponse withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 绑定关系ID
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public UpdateObsTargetPolicyResponse withPolicy(ObsDataRepositoryPolicy policy) {
        this.policy = policy;
        return this;
    }

    public UpdateObsTargetPolicyResponse withPolicy(Consumer<ObsDataRepositoryPolicy> policySetter) {
        if (this.policy == null) {
            this.policy = new ObsDataRepositoryPolicy();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    public ObsDataRepositoryPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(ObsDataRepositoryPolicy policy) {
        this.policy = policy;
    }

    public UpdateObsTargetPolicyResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateObsTargetPolicyResponse that = (UpdateObsTargetPolicyResponse) obj;
        return Objects.equals(this.targetId, that.targetId) && Objects.equals(this.policy, that.policy)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetId, policy, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateObsTargetPolicyResponse {\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
