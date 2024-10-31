package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateHttpBlockTrustIpRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    private String addr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white")

    private Integer white;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "followed_action_id")

    private String followedActionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_group")

    private HttpIpGroup ipGroup;

    public UpdateHttpBlockTrustIpRuleResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规则id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateHttpBlockTrustIpRuleResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateHttpBlockTrustIpRuleResponse withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 规则所在策略id
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public UpdateHttpBlockTrustIpRuleResponse withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 规则所在策略名称
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public UpdateHttpBlockTrustIpRuleResponse withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 创建规则时间戳
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public UpdateHttpBlockTrustIpRuleResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateHttpBlockTrustIpRuleResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 规则开关： - 0：关闭 - 1：开启 
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public UpdateHttpBlockTrustIpRuleResponse withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * ip地址/地址段
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public UpdateHttpBlockTrustIpRuleResponse withWhite(Integer white) {
        this.white = white;
        return this;
    }

    /**
     * - 0：拦截 - 1：放行 - 2：仅记录 
     * @return white
     */
    public Integer getWhite() {
        return white;
    }

    public void setWhite(Integer white) {
        this.white = white;
    }

    public UpdateHttpBlockTrustIpRuleResponse withFollowedActionId(String followedActionId) {
        this.followedActionId = followedActionId;
        return this;
    }

    /**
     * 攻击惩罚规则id
     * @return followedActionId
     */
    public String getFollowedActionId() {
        return followedActionId;
    }

    public void setFollowedActionId(String followedActionId) {
        this.followedActionId = followedActionId;
    }

    public UpdateHttpBlockTrustIpRuleResponse withIpGroup(HttpIpGroup ipGroup) {
        this.ipGroup = ipGroup;
        return this;
    }

    public UpdateHttpBlockTrustIpRuleResponse withIpGroup(Consumer<HttpIpGroup> ipGroupSetter) {
        if (this.ipGroup == null) {
            this.ipGroup = new HttpIpGroup();
            ipGroupSetter.accept(this.ipGroup);
        }

        return this;
    }

    /**
     * Get ipGroup
     * @return ipGroup
     */
    public HttpIpGroup getIpGroup() {
        return ipGroup;
    }

    public void setIpGroup(HttpIpGroup ipGroup) {
        this.ipGroup = ipGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateHttpBlockTrustIpRuleResponse that = (UpdateHttpBlockTrustIpRuleResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.policyId, that.policyId) && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.description, that.description)
            && Objects.equals(this.status, that.status) && Objects.equals(this.addr, that.addr)
            && Objects.equals(this.white, that.white) && Objects.equals(this.followedActionId, that.followedActionId)
            && Objects.equals(this.ipGroup, that.ipGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            policyId,
            policyName,
            timestamp,
            description,
            status,
            addr,
            white,
            followedActionId,
            ipGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHttpBlockTrustIpRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    white: ").append(toIndentedString(white)).append("\n");
        sb.append("    followedActionId: ").append(toIndentedString(followedActionId)).append("\n");
        sb.append("    ipGroup: ").append(toIndentedString(ipGroup)).append("\n");
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
