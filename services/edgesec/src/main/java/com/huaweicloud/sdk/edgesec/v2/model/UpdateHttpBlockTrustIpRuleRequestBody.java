package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateHttpBlockTrustIpRuleRequestBody
 */
public class UpdateHttpBlockTrustIpRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

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
    @JsonProperty(value = "ip_group_id")

    private String ipGroupId;

    public UpdateHttpBlockTrustIpRuleRequestBody withName(String name) {
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

    public UpdateHttpBlockTrustIpRuleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述，最长512字符
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateHttpBlockTrustIpRuleRequestBody withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * ip地址/地址段；ip地址/地址段或者ip地址组id至少有一个
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public UpdateHttpBlockTrustIpRuleRequestBody withWhite(Integer white) {
        this.white = white;
        return this;
    }

    /**
     * - 0：拦截 - 1：放行 - 2：仅记录 
     * minimum: 0
     * maximum: 2
     * @return white
     */
    public Integer getWhite() {
        return white;
    }

    public void setWhite(Integer white) {
        this.white = white;
    }

    public UpdateHttpBlockTrustIpRuleRequestBody withFollowedActionId(String followedActionId) {
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

    public UpdateHttpBlockTrustIpRuleRequestBody withIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

    /**
     * ip地址组id；ip地址/地址段或者ip地址组id至少有一个
     * @return ipGroupId
     */
    public String getIpGroupId() {
        return ipGroupId;
    }

    public void setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateHttpBlockTrustIpRuleRequestBody that = (UpdateHttpBlockTrustIpRuleRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.addr, that.addr) && Objects.equals(this.white, that.white)
            && Objects.equals(this.followedActionId, that.followedActionId)
            && Objects.equals(this.ipGroupId, that.ipGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, addr, white, followedActionId, ipGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHttpBlockTrustIpRuleRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    white: ").append(toIndentedString(white)).append("\n");
        sb.append("    followedActionId: ").append(toIndentedString(followedActionId)).append("\n");
        sb.append("    ipGroupId: ").append(toIndentedString(ipGroupId)).append("\n");
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
