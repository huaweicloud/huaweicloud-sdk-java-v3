package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateKeyPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private UpdateKeyPolicyResponseBodyPolicy policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modify_time")

    private String lastModifyTime;

    public UpdateKeyPolicyResponse withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数解释：** 密钥策略ID **取值范围：** 不涉及
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public UpdateKeyPolicyResponse withPolicy(UpdateKeyPolicyResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }

    public UpdateKeyPolicyResponse withPolicy(Consumer<UpdateKeyPolicyResponseBodyPolicy> policySetter) {
        if (this.policy == null) {
            this.policy = new UpdateKeyPolicyResponseBodyPolicy();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    public UpdateKeyPolicyResponseBodyPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(UpdateKeyPolicyResponseBodyPolicy policy) {
        this.policy = policy;
    }

    public UpdateKeyPolicyResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 密钥策略描述信息 **取值范围：** 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateKeyPolicyResponse withLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }

    /**
     * **参数解释：** 密钥策略最近更新时间 **取值范围：** 不涉及
     * @return lastModifyTime
     */
    public String getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateKeyPolicyResponse that = (UpdateKeyPolicyResponse) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.policy, that.policy)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.lastModifyTime, that.lastModifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, policy, description, lastModifyTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKeyPolicyResponse {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    lastModifyTime: ").append(toIndentedString(lastModifyTime)).append("\n");
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
