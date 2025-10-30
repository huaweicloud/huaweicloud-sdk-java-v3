package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ChangePolicyGroupRequestInfo
 */
public class ChangePolicyGroupRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_mode")

    private String protectMode;

    public ChangePolicyGroupRequestInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**: 需要修改的策略组ID **约束限制**: 需要使用 ListPolicyGroup 接口查询策略组ID，在 ListPolicyGroup 接口的响应体中返回的 group_id 是可以被修改的策略组ID **取值范围**: 字符长度36-64 **默认取值**: 不涉及
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ChangePolicyGroupRequestInfo withProtectMode(String protectMode) {
        this.protectMode = protectMode;
        return this;
    }

    /**
     * **参数解释**: 防护模式 **约束限制**: 不涉及 **取值范围**: - high_detection: 高检出模式。 - equalization: 均衡模式。  **默认取值**: 不涉及 
     * @return protectMode
     */
    public String getProtectMode() {
        return protectMode;
    }

    public void setProtectMode(String protectMode) {
        this.protectMode = protectMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangePolicyGroupRequestInfo that = (ChangePolicyGroupRequestInfo) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.protectMode, that.protectMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, protectMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangePolicyGroupRequestInfo {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    protectMode: ").append(toIndentedString(protectMode)).append("\n");
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
