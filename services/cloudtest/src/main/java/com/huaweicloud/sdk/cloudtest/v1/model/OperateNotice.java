package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OperateNotice
 */
public class OperateNotice {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_channel")

    private String alertChannel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private String enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<AlertGroup> groups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operateTypes")

    private List<String> operateTypes = null;

    public OperateNotice withAlertChannel(String alertChannel) {
        this.alertChannel = alertChannel;
        return this;
    }

    /**
     * 发送告警渠道
     * @return alertChannel
     */
    public String getAlertChannel() {
        return alertChannel;
    }

    public void setAlertChannel(String alertChannel) {
        this.alertChannel = alertChannel;
    }

    public OperateNotice withEnable(String enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 操作通知 0 关闭 1开启
     * @return enable
     */
    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public OperateNotice withGroups(List<AlertGroup> groups) {
        this.groups = groups;
        return this;
    }

    public OperateNotice addGroupsItem(AlertGroup groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public OperateNotice withGroups(Consumer<List<AlertGroup>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * 通知组列表
     * @return groups
     */
    public List<AlertGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<AlertGroup> groups) {
        this.groups = groups;
    }

    public OperateNotice withOperateTypes(List<String> operateTypes) {
        this.operateTypes = operateTypes;
        return this;
    }

    public OperateNotice addOperateTypesItem(String operateTypesItem) {
        if (this.operateTypes == null) {
            this.operateTypes = new ArrayList<>();
        }
        this.operateTypes.add(operateTypesItem);
        return this;
    }

    public OperateNotice withOperateTypes(Consumer<List<String>> operateTypesSetter) {
        if (this.operateTypes == null) {
            this.operateTypes = new ArrayList<>();
        }
        operateTypesSetter.accept(this.operateTypes);
        return this;
    }

    /**
     * 通知类型列表
     * @return operateTypes
     */
    public List<String> getOperateTypes() {
        return operateTypes;
    }

    public void setOperateTypes(List<String> operateTypes) {
        this.operateTypes = operateTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperateNotice that = (OperateNotice) obj;
        return Objects.equals(this.alertChannel, that.alertChannel) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.groups, that.groups) && Objects.equals(this.operateTypes, that.operateTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alertChannel, enable, groups, operateTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateNotice {\n");
        sb.append("    alertChannel: ").append(toIndentedString(alertChannel)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    operateTypes: ").append(toIndentedString(operateTypes)).append("\n");
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
