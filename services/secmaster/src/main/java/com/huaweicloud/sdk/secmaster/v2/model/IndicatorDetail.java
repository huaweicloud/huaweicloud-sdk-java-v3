package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 情报详情信息
 */
public class IndicatorDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_object")

    private IndicatorDataObjectDetail dataObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_ref")

    private DataClassRefPojo dataclassRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public IndicatorDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 威胁情报ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IndicatorDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 威胁情报名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IndicatorDetail withDataObject(IndicatorDataObjectDetail dataObject) {
        this.dataObject = dataObject;
        return this;
    }

    public IndicatorDetail withDataObject(Consumer<IndicatorDataObjectDetail> dataObjectSetter) {
        if (this.dataObject == null) {
            this.dataObject = new IndicatorDataObjectDetail();
            dataObjectSetter.accept(this.dataObject);
        }

        return this;
    }

    /**
     * Get dataObject
     * @return dataObject
     */
    public IndicatorDataObjectDetail getDataObject() {
        return dataObject;
    }

    public void setDataObject(IndicatorDataObjectDetail dataObject) {
        this.dataObject = dataObject;
    }

    public IndicatorDetail withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public IndicatorDetail withProjectId(String projectId) {
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

    public IndicatorDetail withDataclassRef(DataClassRefPojo dataclassRef) {
        this.dataclassRef = dataclassRef;
        return this;
    }

    public IndicatorDetail withDataclassRef(Consumer<DataClassRefPojo> dataclassRefSetter) {
        if (this.dataclassRef == null) {
            this.dataclassRef = new DataClassRefPojo();
            dataclassRefSetter.accept(this.dataclassRef);
        }

        return this;
    }

    /**
     * Get dataclassRef
     * @return dataclassRef
     */
    public DataClassRefPojo getDataclassRef() {
        return dataclassRef;
    }

    public void setDataclassRef(DataClassRefPojo dataclassRef) {
        this.dataclassRef = dataclassRef;
    }

    public IndicatorDetail withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public IndicatorDetail withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IndicatorDetail that = (IndicatorDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.dataObject, that.dataObject) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.dataclassRef, that.dataclassRef)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dataObject, workspaceId, projectId, dataclassRef, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndicatorDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dataObject: ").append(toIndentedString(dataObject)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    dataclassRef: ").append(toIndentedString(dataclassRef)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
