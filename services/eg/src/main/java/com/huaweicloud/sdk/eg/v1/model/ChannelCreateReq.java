package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ChannelCreateReq
 */
public class ChannelCreateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_id")

    private String epsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_account")

    private Boolean crossAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private Map<String, ChannelCreateReqPolicy> policy = null;

    public ChannelCreateReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 通道名称，租户下唯一，由字母，数字，点，下划线和中划线组成，必须字母或数字开头，不能是default
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChannelCreateReq withDescription(String description) {
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

    public ChannelCreateReq withEpsId(String epsId) {
        this.epsId = epsId;
        return this;
    }

    /**
     * 企业项目id
     * @return epsId
     */
    public String getEpsId() {
        return epsId;
    }

    public void setEpsId(String epsId) {
        this.epsId = epsId;
    }

    public ChannelCreateReq withCrossAccount(Boolean crossAccount) {
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

    public ChannelCreateReq withPolicy(Map<String, ChannelCreateReqPolicy> policy) {
        this.policy = policy;
        return this;
    }

    public ChannelCreateReq putPolicyItem(String key, ChannelCreateReqPolicy policyItem) {
        if (this.policy == null) {
            this.policy = new HashMap<>();
        }
        this.policy.put(key, policyItem);
        return this;
    }

    public ChannelCreateReq withPolicy(Consumer<Map<String, ChannelCreateReqPolicy>> policySetter) {
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
        ChannelCreateReq that = (ChannelCreateReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.epsId, that.epsId) && Objects.equals(this.crossAccount, that.crossAccount)
            && Objects.equals(this.policy, that.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, epsId, crossAccount, policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChannelCreateReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    epsId: ").append(toIndentedString(epsId)).append("\n");
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
