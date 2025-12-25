package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListConnectionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_name")

    private String componentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier_name")

    private String modifierName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_start_time")

    private String createStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_end_time")

    private String createEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_start_time")

    private String updateStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_end_time")

    private String updateEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_defense_type")

    private Boolean isDefenseType;

    public ListConnectionsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**: 工作空间ID **取值范围**: 不涉及
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListConnectionsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 偏移量 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * minimum: 0
     * maximum: 999999999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListConnectionsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 数据量 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListConnectionsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 连接名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListConnectionsRequest withComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    /**
     * 插件名称
     * @return componentName
     */
    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public ListConnectionsRequest withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建人
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public ListConnectionsRequest withModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }

    /**
     * 修改人
     * @return modifierName
     */
    public String getModifierName() {
        return modifierName;
    }

    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    public ListConnectionsRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListConnectionsRequest withCreateStartTime(String createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }

    /**
     * 创建起始时间
     * @return createStartTime
     */
    public String getCreateStartTime() {
        return createStartTime;
    }

    public void setCreateStartTime(String createStartTime) {
        this.createStartTime = createStartTime;
    }

    public ListConnectionsRequest withCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }

    /**
     * 创建结束时间
     * @return createEndTime
     */
    public String getCreateEndTime() {
        return createEndTime;
    }

    public void setCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
    }

    public ListConnectionsRequest withUpdateStartTime(String updateStartTime) {
        this.updateStartTime = updateStartTime;
        return this;
    }

    /**
     * 修改起始时间
     * @return updateStartTime
     */
    public String getUpdateStartTime() {
        return updateStartTime;
    }

    public void setUpdateStartTime(String updateStartTime) {
        this.updateStartTime = updateStartTime;
    }

    public ListConnectionsRequest withUpdateEndTime(String updateEndTime) {
        this.updateEndTime = updateEndTime;
        return this;
    }

    /**
     * 修改结束时间
     * @return updateEndTime
     */
    public String getUpdateEndTime() {
        return updateEndTime;
    }

    public void setUpdateEndTime(String updateEndTime) {
        this.updateEndTime = updateEndTime;
    }

    public ListConnectionsRequest withIsDefenseType(Boolean isDefenseType) {
        this.isDefenseType = isDefenseType;
        return this;
    }

    /**
     * 是否用于应急策略的操作连接
     * @return isDefenseType
     */
    public Boolean getIsDefenseType() {
        return isDefenseType;
    }

    public void setIsDefenseType(Boolean isDefenseType) {
        this.isDefenseType = isDefenseType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConnectionsRequest that = (ListConnectionsRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.name, that.name)
            && Objects.equals(this.componentName, that.componentName)
            && Objects.equals(this.creatorName, that.creatorName)
            && Objects.equals(this.modifierName, that.modifierName)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.createStartTime, that.createStartTime)
            && Objects.equals(this.createEndTime, that.createEndTime)
            && Objects.equals(this.updateStartTime, that.updateStartTime)
            && Objects.equals(this.updateEndTime, that.updateEndTime)
            && Objects.equals(this.isDefenseType, that.isDefenseType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId,
            offset,
            limit,
            name,
            componentName,
            creatorName,
            modifierName,
            description,
            createStartTime,
            createEndTime,
            updateStartTime,
            updateEndTime,
            isDefenseType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConnectionsRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    modifierName: ").append(toIndentedString(modifierName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createStartTime: ").append(toIndentedString(createStartTime)).append("\n");
        sb.append("    createEndTime: ").append(toIndentedString(createEndTime)).append("\n");
        sb.append("    updateStartTime: ").append(toIndentedString(updateStartTime)).append("\n");
        sb.append("    updateEndTime: ").append(toIndentedString(updateEndTime)).append("\n");
        sb.append("    isDefenseType: ").append(toIndentedString(isDefenseType)).append("\n");
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
