package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配置检测策略关键信息
 */
public class SecurityCheckPolicyGroupInfoResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_num")

    private Integer checkRuleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletable")

    private Boolean deletable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_group")

    private Boolean defaultGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_os")

    private String supportOs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_info")

    private SecurityCheckPolicyInfoResponseInfo policyInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weak_pwd_policy_info")

    private SecurityCheckPolicyInfoResponseInfo weakPwdPolicyInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id_list")

    private List<String> agentIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_condition")

    private SecurityCheckTaskCondition taskCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detection_period")

    private String detectionPeriod;

    public SecurityCheckPolicyGroupInfoResponseInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释** 策略组ID **取值范围** 字符长度1-64位 
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public SecurityCheckPolicyGroupInfoResponseInfo withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释** 策略组名称 **取值范围** 字符长度1-256位 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public SecurityCheckPolicyGroupInfoResponseInfo withCheckRuleNum(Integer checkRuleNum) {
        this.checkRuleNum = checkRuleNum;
        return this;
    }

    /**
     * **参数解释** 基线检测项（检测规则）数量 **取值范围** 取值1-10000 
     * minimum: 1
     * maximum: 10000
     * @return checkRuleNum
     */
    public Integer getCheckRuleNum() {
        return checkRuleNum;
    }

    public void setCheckRuleNum(Integer checkRuleNum) {
        this.checkRuleNum = checkRuleNum;
    }

    public SecurityCheckPolicyGroupInfoResponseInfo withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * **参数解释** 应用服务器数量 **取值范围** 取值0-1000000 
     * minimum: 0
     * maximum: 1000000
     * @return hostNum
     */
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    public SecurityCheckPolicyGroupInfoResponseInfo withDeletable(Boolean deletable) {
        this.deletable = deletable;
        return this;
    }

    /**
     * **参数解释** 是否支持删除 **取值范围** - true：支持 - false：不支持 
     * @return deletable
     */
    public Boolean getDeletable() {
        return deletable;
    }

    public void setDeletable(Boolean deletable) {
        this.deletable = deletable;
    }

    public SecurityCheckPolicyGroupInfoResponseInfo withDefaultGroup(Boolean defaultGroup) {
        this.defaultGroup = defaultGroup;
        return this;
    }

    /**
     * **参数解释** 是否默认策略组 **取值范围** - true：是 - false：否 
     * @return defaultGroup
     */
    public Boolean getDefaultGroup() {
        return defaultGroup;
    }

    public void setDefaultGroup(Boolean defaultGroup) {
        this.defaultGroup = defaultGroup;
    }

    public SecurityCheckPolicyGroupInfoResponseInfo withSupportOs(String supportOs) {
        this.supportOs = supportOs;
        return this;
    }

    /**
     * **参数解释** 策略支持的操作系统类型 **取值范围** - Linux：linux系统 - Windows：windows系统 
     * @return supportOs
     */
    public String getSupportOs() {
        return supportOs;
    }

    public void setSupportOs(String supportOs) {
        this.supportOs = supportOs;
    }

    public SecurityCheckPolicyGroupInfoResponseInfo withPolicyInfo(SecurityCheckPolicyInfoResponseInfo policyInfo) {
        this.policyInfo = policyInfo;
        return this;
    }

    public SecurityCheckPolicyGroupInfoResponseInfo withPolicyInfo(
        Consumer<SecurityCheckPolicyInfoResponseInfo> policyInfoSetter) {
        if (this.policyInfo == null) {
            this.policyInfo = new SecurityCheckPolicyInfoResponseInfo();
            policyInfoSetter.accept(this.policyInfo);
        }

        return this;
    }

    /**
     * Get policyInfo
     * @return policyInfo
     */
    public SecurityCheckPolicyInfoResponseInfo getPolicyInfo() {
        return policyInfo;
    }

    public void setPolicyInfo(SecurityCheckPolicyInfoResponseInfo policyInfo) {
        this.policyInfo = policyInfo;
    }

    public SecurityCheckPolicyGroupInfoResponseInfo withWeakPwdPolicyInfo(
        SecurityCheckPolicyInfoResponseInfo weakPwdPolicyInfo) {
        this.weakPwdPolicyInfo = weakPwdPolicyInfo;
        return this;
    }

    public SecurityCheckPolicyGroupInfoResponseInfo withWeakPwdPolicyInfo(
        Consumer<SecurityCheckPolicyInfoResponseInfo> weakPwdPolicyInfoSetter) {
        if (this.weakPwdPolicyInfo == null) {
            this.weakPwdPolicyInfo = new SecurityCheckPolicyInfoResponseInfo();
            weakPwdPolicyInfoSetter.accept(this.weakPwdPolicyInfo);
        }

        return this;
    }

    /**
     * Get weakPwdPolicyInfo
     * @return weakPwdPolicyInfo
     */
    public SecurityCheckPolicyInfoResponseInfo getWeakPwdPolicyInfo() {
        return weakPwdPolicyInfo;
    }

    public void setWeakPwdPolicyInfo(SecurityCheckPolicyInfoResponseInfo weakPwdPolicyInfo) {
        this.weakPwdPolicyInfo = weakPwdPolicyInfo;
    }

    public SecurityCheckPolicyGroupInfoResponseInfo withAgentIdList(List<String> agentIdList) {
        this.agentIdList = agentIdList;
        return this;
    }

    public SecurityCheckPolicyGroupInfoResponseInfo addAgentIdListItem(String agentIdListItem) {
        if (this.agentIdList == null) {
            this.agentIdList = new ArrayList<>();
        }
        this.agentIdList.add(agentIdListItem);
        return this;
    }

    public SecurityCheckPolicyGroupInfoResponseInfo withAgentIdList(Consumer<List<String>> agentIdListSetter) {
        if (this.agentIdList == null) {
            this.agentIdList = new ArrayList<>();
        }
        agentIdListSetter.accept(this.agentIdList);
        return this;
    }

    /**
     * **参数解释** 应用的主机的agentID列表 **取值范围** 字符串大小范围20-64 
     * @return agentIdList
     */
    public List<String> getAgentIdList() {
        return agentIdList;
    }

    public void setAgentIdList(List<String> agentIdList) {
        this.agentIdList = agentIdList;
    }

    public SecurityCheckPolicyGroupInfoResponseInfo withTaskCondition(SecurityCheckTaskCondition taskCondition) {
        this.taskCondition = taskCondition;
        return this;
    }

    public SecurityCheckPolicyGroupInfoResponseInfo withTaskCondition(
        Consumer<SecurityCheckTaskCondition> taskConditionSetter) {
        if (this.taskCondition == null) {
            this.taskCondition = new SecurityCheckTaskCondition();
            taskConditionSetter.accept(this.taskCondition);
        }

        return this;
    }

    /**
     * Get taskCondition
     * @return taskCondition
     */
    public SecurityCheckTaskCondition getTaskCondition() {
        return taskCondition;
    }

    public void setTaskCondition(SecurityCheckTaskCondition taskCondition) {
        this.taskCondition = taskCondition;
    }

    public SecurityCheckPolicyGroupInfoResponseInfo withDetectionPeriod(String detectionPeriod) {
        this.detectionPeriod = detectionPeriod;
        return this;
    }

    /**
     * **参数解释** 检测周期 **取值范围** 字符串大小范围1-128 
     * @return detectionPeriod
     */
    public String getDetectionPeriod() {
        return detectionPeriod;
    }

    public void setDetectionPeriod(String detectionPeriod) {
        this.detectionPeriod = detectionPeriod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityCheckPolicyGroupInfoResponseInfo that = (SecurityCheckPolicyGroupInfoResponseInfo) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.checkRuleNum, that.checkRuleNum) && Objects.equals(this.hostNum, that.hostNum)
            && Objects.equals(this.deletable, that.deletable) && Objects.equals(this.defaultGroup, that.defaultGroup)
            && Objects.equals(this.supportOs, that.supportOs) && Objects.equals(this.policyInfo, that.policyInfo)
            && Objects.equals(this.weakPwdPolicyInfo, that.weakPwdPolicyInfo)
            && Objects.equals(this.agentIdList, that.agentIdList)
            && Objects.equals(this.taskCondition, that.taskCondition)
            && Objects.equals(this.detectionPeriod, that.detectionPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId,
            groupName,
            checkRuleNum,
            hostNum,
            deletable,
            defaultGroup,
            supportOs,
            policyInfo,
            weakPwdPolicyInfo,
            agentIdList,
            taskCondition,
            detectionPeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityCheckPolicyGroupInfoResponseInfo {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    checkRuleNum: ").append(toIndentedString(checkRuleNum)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    deletable: ").append(toIndentedString(deletable)).append("\n");
        sb.append("    defaultGroup: ").append(toIndentedString(defaultGroup)).append("\n");
        sb.append("    supportOs: ").append(toIndentedString(supportOs)).append("\n");
        sb.append("    policyInfo: ").append(toIndentedString(policyInfo)).append("\n");
        sb.append("    weakPwdPolicyInfo: ").append(toIndentedString(weakPwdPolicyInfo)).append("\n");
        sb.append("    agentIdList: ").append(toIndentedString(agentIdList)).append("\n");
        sb.append("    taskCondition: ").append(toIndentedString(taskCondition)).append("\n");
        sb.append("    detectionPeriod: ").append(toIndentedString(detectionPeriod)).append("\n");
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
