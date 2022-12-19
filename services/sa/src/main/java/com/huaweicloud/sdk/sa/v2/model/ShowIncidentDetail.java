package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowIncidentDetail
 */
public class ShowIncidentDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_object")

    private ShowIncident dataObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_id")

    private String dataclassId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_id")

    private String layoutId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass")

    private ShowAlertDetailDataclassRef dataclass;

    public ShowIncidentDetail withDataObject(ShowIncident dataObject) {
        this.dataObject = dataObject;
        return this;
    }

    public ShowIncidentDetail withDataObject(Consumer<ShowIncident> dataObjectSetter) {
        if (this.dataObject == null) {
            this.dataObject = new ShowIncident();
            dataObjectSetter.accept(this.dataObject);
        }

        return this;
    }

    /**
     * Get dataObject
     * @return dataObject
     */
    public ShowIncident getDataObject() {
        return dataObject;
    }

    public void setDataObject(ShowIncident dataObject) {
        this.dataObject = dataObject;
    }

    public ShowIncidentDetail withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Create time
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowIncidentDetail withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Update time
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowIncidentDetail withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Id value
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowIncidentDetail withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Id value
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ShowIncidentDetail withDataclassId(String dataclassId) {
        this.dataclassId = dataclassId;
        return this;
    }

    /**
     * Id value
     * @return dataclassId
     */
    public String getDataclassId() {
        return dataclassId;
    }

    public void setDataclassId(String dataclassId) {
        this.dataclassId = dataclassId;
    }

    public ShowIncidentDetail withLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }

    /**
     * Id value
     * @return layoutId
     */
    public String getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(String layoutId) {
        this.layoutId = layoutId;
    }

    public ShowIncidentDetail withName(String name) {
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

    public ShowIncidentDetail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The name, display only
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowIncidentDetail withDataclass(ShowAlertDetailDataclassRef dataclass) {
        this.dataclass = dataclass;
        return this;
    }

    public ShowIncidentDetail withDataclass(Consumer<ShowAlertDetailDataclassRef> dataclassSetter) {
        if (this.dataclass == null) {
            this.dataclass = new ShowAlertDetailDataclassRef();
            dataclassSetter.accept(this.dataclass);
        }

        return this;
    }

    /**
     * Get dataclass
     * @return dataclass
     */
    public ShowAlertDetailDataclassRef getDataclass() {
        return dataclass;
    }

    public void setDataclass(ShowAlertDetailDataclassRef dataclass) {
        this.dataclass = dataclass;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowIncidentDetail showIncidentDetail = (ShowIncidentDetail) o;
        return Objects.equals(this.dataObject, showIncidentDetail.dataObject)
            && Objects.equals(this.createTime, showIncidentDetail.createTime)
            && Objects.equals(this.updateTime, showIncidentDetail.updateTime)
            && Objects.equals(this.projectId, showIncidentDetail.projectId)
            && Objects.equals(this.workspaceId, showIncidentDetail.workspaceId)
            && Objects.equals(this.dataclassId, showIncidentDetail.dataclassId)
            && Objects.equals(this.layoutId, showIncidentDetail.layoutId)
            && Objects.equals(this.name, showIncidentDetail.name) && Objects.equals(this.type, showIncidentDetail.type)
            && Objects.equals(this.dataclass, showIncidentDetail.dataclass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataObject,
            createTime,
            updateTime,
            projectId,
            workspaceId,
            dataclassId,
            layoutId,
            name,
            type,
            dataclass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIncidentDetail {\n");
        sb.append("    dataObject: ").append(toIndentedString(dataObject)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    dataclassId: ").append(toIndentedString(dataclassId)).append("\n");
        sb.append("    layoutId: ").append(toIndentedString(layoutId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    dataclass: ").append(toIndentedString(dataclass)).append("\n");
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
