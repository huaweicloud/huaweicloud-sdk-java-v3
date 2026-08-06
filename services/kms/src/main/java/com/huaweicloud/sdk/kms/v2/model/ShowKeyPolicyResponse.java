package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowKeyPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyspace_id")

    private String keyspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private ShowKeyPolicyResponseBodyPolicy policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modify_time")

    private String lastModifyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_access_time")

    private String lastAccessTime;

    public ShowKeyPolicyResponse withPolicyId(String policyId) {
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

    public ShowKeyPolicyResponse withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * **参数解释：** 密钥策略名称 **取值范围：** 不涉及
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public ShowKeyPolicyResponse withKeyspaceId(String keyspaceId) {
        this.keyspaceId = keyspaceId;
        return this;
    }

    /**
     * **参数解释：** 密钥空间ID **取值范围：** 不涉及
     * @return keyspaceId
     */
    public String getKeyspaceId() {
        return keyspaceId;
    }

    public void setKeyspaceId(String keyspaceId) {
        this.keyspaceId = keyspaceId;
    }

    public ShowKeyPolicyResponse withPolicy(ShowKeyPolicyResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }

    public ShowKeyPolicyResponse withPolicy(Consumer<ShowKeyPolicyResponseBodyPolicy> policySetter) {
        if (this.policy == null) {
            this.policy = new ShowKeyPolicyResponseBodyPolicy();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    public ShowKeyPolicyResponseBodyPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(ShowKeyPolicyResponseBodyPolicy policy) {
        this.policy = policy;
    }

    public ShowKeyPolicyResponse withDescription(String description) {
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

    public ShowKeyPolicyResponse withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * **参数解释：** 密钥策略创建人 **取值范围：** 不涉及
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ShowKeyPolicyResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 密钥策略创建时间 **取值范围：** 不涉及
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowKeyPolicyResponse withLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }

    /**
     * **参数解释：** 密钥策略最近修改时间 **取值范围：** 不涉及
     * @return lastModifyTime
     */
    public String getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public ShowKeyPolicyResponse withLastAccessTime(String lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }

    /**
     * **参数解释：** 密钥策略最近访问时间 **取值范围：** 不涉及
     * @return lastAccessTime
     */
    public String getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(String lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKeyPolicyResponse that = (ShowKeyPolicyResponse) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.keyspaceId, that.keyspaceId) && Objects.equals(this.policy, that.policy)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastModifyTime, that.lastModifyTime)
            && Objects.equals(this.lastAccessTime, that.lastAccessTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId,
            policyName,
            keyspaceId,
            policy,
            description,
            createdBy,
            createTime,
            lastModifyTime,
            lastAccessTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKeyPolicyResponse {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    keyspaceId: ").append(toIndentedString(keyspaceId)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastModifyTime: ").append(toIndentedString(lastModifyTime)).append("\n");
        sb.append("    lastAccessTime: ").append(toIndentedString(lastAccessTime)).append("\n");
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
