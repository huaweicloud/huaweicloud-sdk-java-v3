package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AiPolicyGroupInfo
 */
public class AiPolicyGroupInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_type")

    private Integer groupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_object")

    private String protectionObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private Integer objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_num")

    private Integer objectNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Boolean isDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_exclusive")

    private Boolean isExclusive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_is_used")

    private Boolean detailIsUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_list")

    private List<AiPolicyList> policyList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id_list")

    private List<String> agentIdList = null;

    public AiPolicyGroupInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**： 策略组ID **取值范围**： 字符长度1-20位 
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public AiPolicyGroupInfo withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**: 策略组名称 **取值范围**: 字符长度1-128位 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public AiPolicyGroupInfo withGroupType(Integer groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * **参数解释**： 策略组ID **取值范围**： 最小值0，最大值2147483647 
     * @return groupType
     */
    public Integer getGroupType() {
        return groupType;
    }

    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }

    public AiPolicyGroupInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AiPolicyGroupInfo withProtectionObject(String protectionObject) {
        this.protectionObject = protectionObject;
        return this;
    }

    /**
     * **参数解释**： 防护对象 **取值范围**： 字符长度1-128位 
     * @return protectionObject
     */
    public String getProtectionObject() {
        return protectionObject;
    }

    public void setProtectionObject(String protectionObject) {
        this.protectionObject = protectionObject;
    }

    public AiPolicyGroupInfo withObjectType(Integer objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * **参数解释**: 防护对象类型 **取值范围**: - 0：云服务 - 1：三方 
     * @return objectType
     */
    public Integer getObjectType() {
        return objectType;
    }

    public void setObjectType(Integer objectType) {
        this.objectType = objectType;
    }

    public AiPolicyGroupInfo withObjectNum(Integer objectNum) {
        this.objectNum = objectNum;
        return this;
    }

    /**
     * **参数解释**: 防护对象个数 **取值范围**: 取值0-100000 
     * @return objectNum
     */
    public Integer getObjectNum() {
        return objectNum;
    }

    public void setObjectNum(Integer objectNum) {
        this.objectNum = objectNum;
    }

    public AiPolicyGroupInfo withIsDefault(Boolean isDefault) {
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

    public AiPolicyGroupInfo withIsExclusive(Boolean isExclusive) {
        this.isExclusive = isExclusive;
        return this;
    }

    /**
     * **参数解释**: 是否是默认策略 **取值范围**: - false：否 - true：是 
     * @return isExclusive
     */
    public Boolean getIsExclusive() {
        return isExclusive;
    }

    public void setIsExclusive(Boolean isExclusive) {
        this.isExclusive = isExclusive;
    }

    public AiPolicyGroupInfo withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**: 是否启用 **取值范围**: - false：否 - true：是 
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public AiPolicyGroupInfo withDetailIsUsed(Boolean detailIsUsed) {
        this.detailIsUsed = detailIsUsed;
        return this;
    }

    /**
     * **参数解释**: 是否启用 **取值范围**: - false：否 - true：是 
     * @return detailIsUsed
     */
    public Boolean getDetailIsUsed() {
        return detailIsUsed;
    }

    public void setDetailIsUsed(Boolean detailIsUsed) {
        this.detailIsUsed = detailIsUsed;
    }

    public AiPolicyGroupInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 描述 **取值范围**: 字符长度0-256位 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AiPolicyGroupInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 创建时间 **取值范围**： 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public AiPolicyGroupInfo withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 创建时间 **取值范围**： 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public AiPolicyGroupInfo withPolicyList(List<AiPolicyList> policyList) {
        this.policyList = policyList;
        return this;
    }

    public AiPolicyGroupInfo addPolicyListItem(AiPolicyList policyListItem) {
        if (this.policyList == null) {
            this.policyList = new ArrayList<>();
        }
        this.policyList.add(policyListItem);
        return this;
    }

    public AiPolicyGroupInfo withPolicyList(Consumer<List<AiPolicyList>> policyListSetter) {
        if (this.policyList == null) {
            this.policyList = new ArrayList<>();
        }
        policyListSetter.accept(this.policyList);
        return this;
    }

    /**
     * **参数解释**: 策略列表 **取值范围**: 不涉及 
     * @return policyList
     */
    public List<AiPolicyList> getPolicyList() {
        return policyList;
    }

    public void setPolicyList(List<AiPolicyList> policyList) {
        this.policyList = policyList;
    }

    public AiPolicyGroupInfo withAgentIdList(List<String> agentIdList) {
        this.agentIdList = agentIdList;
        return this;
    }

    public AiPolicyGroupInfo addAgentIdListItem(String agentIdListItem) {
        if (this.agentIdList == null) {
            this.agentIdList = new ArrayList<>();
        }
        this.agentIdList.add(agentIdListItem);
        return this;
    }

    public AiPolicyGroupInfo withAgentIdList(Consumer<List<String>> agentIdListSetter) {
        if (this.agentIdList == null) {
            this.agentIdList = new ArrayList<>();
        }
        agentIdListSetter.accept(this.agentIdList);
        return this;
    }

    /**
     * **参数解释**: 智能体列表 **取值范围**: 不涉及 
     * @return agentIdList
     */
    public List<String> getAgentIdList() {
        return agentIdList;
    }

    public void setAgentIdList(List<String> agentIdList) {
        this.agentIdList = agentIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AiPolicyGroupInfo that = (AiPolicyGroupInfo) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.groupType, that.groupType) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.protectionObject, that.protectionObject)
            && Objects.equals(this.objectType, that.objectType) && Objects.equals(this.objectNum, that.objectNum)
            && Objects.equals(this.isDefault, that.isDefault) && Objects.equals(this.isExclusive, that.isExclusive)
            && Objects.equals(this.enabled, that.enabled) && Objects.equals(this.detailIsUsed, that.detailIsUsed)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.policyList, that.policyList)
            && Objects.equals(this.agentIdList, that.agentIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId,
            groupName,
            groupType,
            projectId,
            protectionObject,
            objectType,
            objectNum,
            isDefault,
            isExclusive,
            enabled,
            detailIsUsed,
            description,
            createTime,
            updateTime,
            policyList,
            agentIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AiPolicyGroupInfo {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    protectionObject: ").append(toIndentedString(protectionObject)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    objectNum: ").append(toIndentedString(objectNum)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    isExclusive: ").append(toIndentedString(isExclusive)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    detailIsUsed: ").append(toIndentedString(detailIsUsed)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    policyList: ").append(toIndentedString(policyList)).append("\n");
        sb.append("    agentIdList: ").append(toIndentedString(agentIdList)).append("\n");
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
