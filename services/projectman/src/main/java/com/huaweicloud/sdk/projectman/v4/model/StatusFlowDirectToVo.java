package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class StatusFlowDirectToVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_name")

    private String parentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_type")

    private String parentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_id")

    private String statusId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_type")

    private String statusType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    public StatusFlowDirectToVo withParentName(String parentName) {
        this.parentName = parentName;
        return this;
    }

    /**
     *  父状态的名称
     * @return parentName
     */
    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public StatusFlowDirectToVo withParentType(String parentType) {
        this.parentType = parentType;
        return this;
    }

    /**
     * 父状态的类型
     * @return parentType
     */
    public String getParentType() {
        return parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public StatusFlowDirectToVo withStatusId(String statusId) {
        this.statusId = statusId;
        return this;
    }

    /**
     * 状态id
     * @return statusId
     */
    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public StatusFlowDirectToVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 状态名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusFlowDirectToVo withStatusType(String statusType) {
        this.statusType = statusType;
        return this;
    }

    /**
     * 状态类型
     * @return statusType
     */
    public String getStatusType() {
        return statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    public StatusFlowDirectToVo withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否已开启状态流转， true： 开启, false 没开启
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public StatusFlowDirectToVo withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父状态的uuid
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatusFlowDirectToVo statusFlowDirectToVo = (StatusFlowDirectToVo) o;
        return Objects.equals(this.parentName, statusFlowDirectToVo.parentName)
            && Objects.equals(this.parentType, statusFlowDirectToVo.parentType)
            && Objects.equals(this.statusId, statusFlowDirectToVo.statusId)
            && Objects.equals(this.name, statusFlowDirectToVo.name)
            && Objects.equals(this.statusType, statusFlowDirectToVo.statusType)
            && Objects.equals(this.enabled, statusFlowDirectToVo.enabled)
            && Objects.equals(this.parentId, statusFlowDirectToVo.parentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentName, parentType, statusId, name, statusType, enabled, parentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatusFlowDirectToVo {\n");
        sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
        sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
        sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    statusType: ").append(toIndentedString(statusType)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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
