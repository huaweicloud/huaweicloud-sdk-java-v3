package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 策略组详情
 */
public class PolicyGroupResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_group")

    private Boolean defaultGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletable")

    private Boolean deletable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_os")

    private String supportOs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_version")

    private String supportVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_mode")

    private String protectMode;

    public PolicyGroupResponseInfo withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**: 策略组名称 **取值范围**: 字符长度1-256位 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public PolicyGroupResponseInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**: 策略组ID **取值范围**: 字符长度1-256位 
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public PolicyGroupResponseInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 策略组描述 **取值范围**: 字符长度0-64位 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PolicyGroupResponseInfo withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * **参数解释**: 关联服务器数 **取值范围**: 取值0-1000000 
     * minimum: 0
     * maximum: 2147483647
     * @return hostNum
     */
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    public PolicyGroupResponseInfo withDefaultGroup(Boolean defaultGroup) {
        this.defaultGroup = defaultGroup;
        return this;
    }

    /**
     * **参数解释**: 是否是默认策略组 **取值范围**: - true: 是默认策略组 - false: 不是默认策略组 
     * @return defaultGroup
     */
    public Boolean getDefaultGroup() {
        return defaultGroup;
    }

    public void setDefaultGroup(Boolean defaultGroup) {
        this.defaultGroup = defaultGroup;
    }

    public PolicyGroupResponseInfo withDeletable(Boolean deletable) {
        this.deletable = deletable;
        return this;
    }

    /**
     * **参数解释**: 是否可以删除，只有default_group为false且host_num为1时可以删除 **取值范围**: - true: 支持删除 - false: 不支持删除 
     * @return deletable
     */
    public Boolean getDeletable() {
        return deletable;
    }

    public void setDeletable(Boolean deletable) {
        this.deletable = deletable;
    }

    public PolicyGroupResponseInfo withSupportOs(String supportOs) {
        this.supportOs = supportOs;
        return this;
    }

    /**
     * **参数解释**: 支持的操作系统 **取值范围**: - Linux: 支持Linux操作系统 - Windows: 支持Windows操作系统 
     * @return supportOs
     */
    public String getSupportOs() {
        return supportOs;
    }

    public void setSupportOs(String supportOs) {
        this.supportOs = supportOs;
    }

    public PolicyGroupResponseInfo withSupportVersion(String supportVersion) {
        this.supportVersion = supportVersion;
        return this;
    }

    /**
     * **参数解释**: 支持的版本 **取值范围**: - hss.version.advanced: 专业版 - hss.version.enterprise: 企业版 - hss.version.premium: 旗舰版 - hss.version.wtp: 网页防篡改版 - hss.version.container.enterprise: 容器版 
     * @return supportVersion
     */
    public String getSupportVersion() {
        return supportVersion;
    }

    public void setSupportVersion(String supportVersion) {
        this.supportVersion = supportVersion;
    }

    public PolicyGroupResponseInfo withProtectMode(String protectMode) {
        this.protectMode = protectMode;
        return this;
    }

    /**
     * **参数解释**: 防护模式 **取值范围**: - high_detection: 高检出模式 - equalization: 均衡模式 
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
        PolicyGroupResponseInfo that = (PolicyGroupResponseInfo) obj;
        return Objects.equals(this.groupName, that.groupName) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.hostNum, that.hostNum)
            && Objects.equals(this.defaultGroup, that.defaultGroup) && Objects.equals(this.deletable, that.deletable)
            && Objects.equals(this.supportOs, that.supportOs)
            && Objects.equals(this.supportVersion, that.supportVersion)
            && Objects.equals(this.protectMode, that.protectMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName,
            groupId,
            description,
            hostNum,
            defaultGroup,
            deletable,
            supportOs,
            supportVersion,
            protectMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyGroupResponseInfo {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    defaultGroup: ").append(toIndentedString(defaultGroup)).append("\n");
        sb.append("    deletable: ").append(toIndentedString(deletable)).append("\n");
        sb.append("    supportOs: ").append(toIndentedString(supportOs)).append("\n");
        sb.append("    supportVersion: ").append(toIndentedString(supportVersion)).append("\n");
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
