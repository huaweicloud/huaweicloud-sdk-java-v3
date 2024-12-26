package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ChannelUpdateReq
 */
public class ChannelUpdateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_account")

    private Boolean crossAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private Map<String, ChannelCreateReqPolicy> policy = null;

    public ChannelUpdateReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 通道描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ChannelUpdateReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ChannelUpdateReq withCrossAccount(Boolean crossAccount) {
        this.crossAccount = crossAccount;
        return this;
    }

    /**
     * 跨账号开关
     * @return crossAccount
     */
    public Boolean getCrossAccount() {
        return crossAccount;
    }

    public void setCrossAccount(Boolean crossAccount) {
        this.crossAccount = crossAccount;
    }

    public ChannelUpdateReq withPolicy(Map<String, ChannelCreateReqPolicy> policy) {
        this.policy = policy;
        return this;
    }

    public ChannelUpdateReq putPolicyItem(String key, ChannelCreateReqPolicy policyItem) {
        if (this.policy == null) {
            this.policy = new HashMap<>();
        }
        this.policy.put(key, policyItem);
        return this;
    }

    public ChannelUpdateReq withPolicy(Consumer<Map<String, ChannelCreateReqPolicy>> policySetter) {
        if (this.policy == null) {
            this.policy = new HashMap<>();
        }
        policySetter.accept(this.policy);
        return this;
    }

    /**
     * 策略
     * @return policy
     */
    public Map<String, ChannelCreateReqPolicy> getPolicy() {
        return policy;
    }

    public void setPolicy(Map<String, ChannelCreateReqPolicy> policy) {
        this.policy = policy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChannelUpdateReq that = (ChannelUpdateReq) obj;
        return Objects.equals(this.description, that.description)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.crossAccount, that.crossAccount) && Objects.equals(this.policy, that.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, enterpriseProjectId, crossAccount, policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChannelUpdateReq {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    crossAccount: ").append(toIndentedString(crossAccount)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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
