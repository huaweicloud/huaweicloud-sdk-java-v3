package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询AI实例绑定策略
 */
public class AiAgentPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group_name")

    private String policyGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group_id")

    private String policyGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group_type")

    private Integer policyGroupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group_enabled")

    private Boolean policyGroupEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Boolean isDefault;

    public AiAgentPolicy withPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
        return this;
    }

    /**
     * **参数解释**: 策略组名称 **取值范围**: 字符长度1-128位 
     * @return policyGroupName
     */
    public String getPolicyGroupName() {
        return policyGroupName;
    }

    public void setPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
    }

    public AiAgentPolicy withPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }

    /**
     * **参数解释**： 策略组ID **取值范围**： 字符长度1-20位 
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return policyGroupId;
    }

    public void setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
    }

    public AiAgentPolicy withPolicyGroupType(Integer policyGroupType) {
        this.policyGroupType = policyGroupType;
        return this;
    }

    /**
     * **参数解释**： 策略组类型 **取值范围**： - 0：Agent运行时防护-OfficeAce - 1：Agent行为轨迹检测-OfficeAce - 2：Agent角色限定 - 3：Agent运行时防护-AgentArts - 4：Agent行为轨迹检测-AgentArts - 5：Agent运行时防护-OpenClaw - 6：Agent运行时防护-其他三方Claw 
     * @return policyGroupType
     */
    public Integer getPolicyGroupType() {
        return policyGroupType;
    }

    public void setPolicyGroupType(Integer policyGroupType) {
        this.policyGroupType = policyGroupType;
    }

    public AiAgentPolicy withPolicyGroupEnabled(Boolean policyGroupEnabled) {
        this.policyGroupEnabled = policyGroupEnabled;
        return this;
    }

    /**
     * **参数解释**: 策略组是否启用 **取值范围**: - true：已启用 - false：未启用 
     * @return policyGroupEnabled
     */
    public Boolean getPolicyGroupEnabled() {
        return policyGroupEnabled;
    }

    public void setPolicyGroupEnabled(Boolean policyGroupEnabled) {
        this.policyGroupEnabled = policyGroupEnabled;
    }

    public AiAgentPolicy withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * **参数解释**: 是否是默认策略 **取值范围**: - false：否 - true：是 
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AiAgentPolicy that = (AiAgentPolicy) obj;
        return Objects.equals(this.policyGroupName, that.policyGroupName)
            && Objects.equals(this.policyGroupId, that.policyGroupId)
            && Objects.equals(this.policyGroupType, that.policyGroupType)
            && Objects.equals(this.policyGroupEnabled, that.policyGroupEnabled)
            && Objects.equals(this.isDefault, that.isDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyGroupName, policyGroupId, policyGroupType, policyGroupEnabled, isDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AiAgentPolicy {\n");
        sb.append("    policyGroupName: ").append(toIndentedString(policyGroupName)).append("\n");
        sb.append("    policyGroupId: ").append(toIndentedString(policyGroupId)).append("\n");
        sb.append("    policyGroupType: ").append(toIndentedString(policyGroupType)).append("\n");
        sb.append("    policyGroupEnabled: ").append(toIndentedString(policyGroupEnabled)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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
