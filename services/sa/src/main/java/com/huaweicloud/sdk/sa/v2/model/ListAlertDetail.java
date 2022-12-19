package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListAlertDetail
 */
public class ListAlertDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_object")

    private ListAlertRsp dataObject;

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
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format_version")

    private Integer formatVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_ref")

    private ShowAlertDetailDataclassRef dataclassRef;

    public ListAlertDetail withDataObject(ListAlertRsp dataObject) {
        this.dataObject = dataObject;
        return this;
    }

    public ListAlertDetail withDataObject(Consumer<ListAlertRsp> dataObjectSetter) {
        if (this.dataObject == null) {
            this.dataObject = new ListAlertRsp();
            dataObjectSetter.accept(this.dataObject);
        }

        return this;
    }

    /**
     * Get dataObject
     * @return dataObject
     */
    public ListAlertRsp getDataObject() {
        return dataObject;
    }

    public void setDataObject(ListAlertRsp dataObject) {
        this.dataObject = dataObject;
    }

    public ListAlertDetail withCreateTime(String createTime) {
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

    public ListAlertDetail withUpdateTime(String updateTime) {
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

    public ListAlertDetail withProjectId(String projectId) {
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

    public ListAlertDetail withWorkspaceId(String workspaceId) {
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

    public ListAlertDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The name, display only
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListAlertDetail withType(String type) {
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

    public ListAlertDetail withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * The name, display only
     * minimum: 0
     * maximum: 1024
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public ListAlertDetail withFormatVersion(Integer formatVersion) {
        this.formatVersion = formatVersion;
        return this;
    }

    /**
     * The name, display only
     * minimum: 0
     * maximum: 1024
     * @return formatVersion
     */
    public Integer getFormatVersion() {
        return formatVersion;
    }

    public void setFormatVersion(Integer formatVersion) {
        this.formatVersion = formatVersion;
    }

    public ListAlertDetail withDataclassRef(ShowAlertDetailDataclassRef dataclassRef) {
        this.dataclassRef = dataclassRef;
        return this;
    }

    public ListAlertDetail withDataclassRef(Consumer<ShowAlertDetailDataclassRef> dataclassRefSetter) {
        if (this.dataclassRef == null) {
            this.dataclassRef = new ShowAlertDetailDataclassRef();
            dataclassRefSetter.accept(this.dataclassRef);
        }

        return this;
    }

    /**
     * Get dataclassRef
     * @return dataclassRef
     */
    public ShowAlertDetailDataclassRef getDataclassRef() {
        return dataclassRef;
    }

    public void setDataclassRef(ShowAlertDetailDataclassRef dataclassRef) {
        this.dataclassRef = dataclassRef;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAlertDetail listAlertDetail = (ListAlertDetail) o;
        return Objects.equals(this.dataObject, listAlertDetail.dataObject)
            && Objects.equals(this.createTime, listAlertDetail.createTime)
            && Objects.equals(this.updateTime, listAlertDetail.updateTime)
            && Objects.equals(this.projectId, listAlertDetail.projectId)
            && Objects.equals(this.workspaceId, listAlertDetail.workspaceId)
            && Objects.equals(this.id, listAlertDetail.id) && Objects.equals(this.type, listAlertDetail.type)
            && Objects.equals(this.version, listAlertDetail.version)
            && Objects.equals(this.formatVersion, listAlertDetail.formatVersion)
            && Objects.equals(this.dataclassRef, listAlertDetail.dataclassRef);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataObject,
            createTime,
            updateTime,
            projectId,
            workspaceId,
            id,
            type,
            version,
            formatVersion,
            dataclassRef);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlertDetail {\n");
        sb.append("    dataObject: ").append(toIndentedString(dataObject)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    formatVersion: ").append(toIndentedString(formatVersion)).append("\n");
        sb.append("    dataclassRef: ").append(toIndentedString(dataclassRef)).append("\n");
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
