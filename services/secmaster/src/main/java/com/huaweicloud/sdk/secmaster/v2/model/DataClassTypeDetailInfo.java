package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Info of Dataclass Type
 */
public class DataClassTypeDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_name")

    private String parentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_business_code")

    private String parentBusinessCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_code")

    private String businessCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_built_in")

    private Boolean isBuiltIn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_id")

    private String layoutId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_name")

    private String layoutName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_id")

    private String dataclassId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla")

    private Integer sla;

    public DataClassTypeDetailInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Id value
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DataClassTypeDetailInfo withParentName(String parentName) {
        this.parentName = parentName;
        return this;
    }

    /**
     * The name, display only
     * @return parentName
     */
    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public DataClassTypeDetailInfo withParentBusinessCode(String parentBusinessCode) {
        this.parentBusinessCode = parentBusinessCode;
        return this;
    }

    /**
     * 类型标识码
     * @return parentBusinessCode
     */
    public String getParentBusinessCode() {
        return parentBusinessCode;
    }

    public void setParentBusinessCode(String parentBusinessCode) {
        this.parentBusinessCode = parentBusinessCode;
    }

    public DataClassTypeDetailInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name, display only
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataClassTypeDetailInfo withBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }

    /**
     * 类型标识码
     * @return businessCode
     */
    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public DataClassTypeDetailInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The description, display only
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DataClassTypeDetailInfo withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * workspace id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public DataClassTypeDetailInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Project id value
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public DataClassTypeDetailInfo withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * If is enabled, false for disenabled, true for enabled
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public DataClassTypeDetailInfo withIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
        return this;
    }

    /**
     * 是否内置
     * @return isBuiltIn
     */
    public Boolean getIsBuiltIn() {
        return isBuiltIn;
    }

    public void setIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
    }

    public DataClassTypeDetailInfo withLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }

    /**
     * 布局ID
     * @return layoutId
     */
    public String getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(String layoutId) {
        this.layoutId = layoutId;
    }

    public DataClassTypeDetailInfo withLayoutName(String layoutName) {
        this.layoutName = layoutName;
        return this;
    }

    /**
     * The name, display only
     * @return layoutName
     */
    public String getLayoutName() {
        return layoutName;
    }

    public void setLayoutName(String layoutName) {
        this.layoutName = layoutName;
    }

    public DataClassTypeDetailInfo withDataclassId(String dataclassId) {
        this.dataclassId = dataclassId;
        return this;
    }

    /**
     * dataclass id.
     * @return dataclassId
     */
    public String getDataclassId() {
        return dataclassId;
    }

    public void setDataclassId(String dataclassId) {
        this.dataclassId = dataclassId;
    }

    public DataClassTypeDetailInfo withSla(Integer sla) {
        this.sla = sla;
        return this;
    }

    /**
     * sla
     * minimum: -1
     * maximum: 999999999999
     * @return sla
     */
    public Integer getSla() {
        return sla;
    }

    public void setSla(Integer sla) {
        this.sla = sla;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataClassTypeDetailInfo dataClassTypeDetailInfo = (DataClassTypeDetailInfo) o;
        return Objects.equals(this.id, dataClassTypeDetailInfo.id)
            && Objects.equals(this.parentName, dataClassTypeDetailInfo.parentName)
            && Objects.equals(this.parentBusinessCode, dataClassTypeDetailInfo.parentBusinessCode)
            && Objects.equals(this.name, dataClassTypeDetailInfo.name)
            && Objects.equals(this.businessCode, dataClassTypeDetailInfo.businessCode)
            && Objects.equals(this.description, dataClassTypeDetailInfo.description)
            && Objects.equals(this.workspaceId, dataClassTypeDetailInfo.workspaceId)
            && Objects.equals(this.projectId, dataClassTypeDetailInfo.projectId)
            && Objects.equals(this.enabled, dataClassTypeDetailInfo.enabled)
            && Objects.equals(this.isBuiltIn, dataClassTypeDetailInfo.isBuiltIn)
            && Objects.equals(this.layoutId, dataClassTypeDetailInfo.layoutId)
            && Objects.equals(this.layoutName, dataClassTypeDetailInfo.layoutName)
            && Objects.equals(this.dataclassId, dataClassTypeDetailInfo.dataclassId)
            && Objects.equals(this.sla, dataClassTypeDetailInfo.sla);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            parentName,
            parentBusinessCode,
            name,
            businessCode,
            description,
            workspaceId,
            projectId,
            enabled,
            isBuiltIn,
            layoutId,
            layoutName,
            dataclassId,
            sla);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataClassTypeDetailInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
        sb.append("    parentBusinessCode: ").append(toIndentedString(parentBusinessCode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    businessCode: ").append(toIndentedString(businessCode)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    isBuiltIn: ").append(toIndentedString(isBuiltIn)).append("\n");
        sb.append("    layoutId: ").append(toIndentedString(layoutId)).append("\n");
        sb.append("    layoutName: ").append(toIndentedString(layoutName)).append("\n");
        sb.append("    dataclassId: ").append(toIndentedString(dataclassId)).append("\n");
        sb.append("    sla: ").append(toIndentedString(sla)).append("\n");
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
