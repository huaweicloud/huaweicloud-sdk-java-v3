package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据源信息
 */
public class ExtDataSource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_info")

    private String connectInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configure_status")

    private String configureStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source_id")

    private String dataSourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source_updated")

    private String dataSourceUpdated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_properties")

    private Object extendProperties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    public ExtDataSource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExtDataSource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据源名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExtDataSource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ExtDataSource withConnectInfo(String connectInfo) {
        this.connectInfo = connectInfo;
        return this;
    }

    /**
     * 数据库。
     * @return connectInfo
     */
    public String getConnectInfo() {
        return connectInfo;
    }

    public void setConnectInfo(String connectInfo) {
        this.connectInfo = connectInfo;
    }

    public ExtDataSource withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ExtDataSource withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ExtDataSource withConfigureStatus(String configureStatus) {
        this.configureStatus = configureStatus;
        return this;
    }

    /**
     * 配置状态。
     * @return configureStatus
     */
    public String getConfigureStatus() {
        return configureStatus;
    }

    public void setConfigureStatus(String configureStatus) {
        this.configureStatus = configureStatus;
    }

    public ExtDataSource withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ExtDataSource withDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /**
     * 数据源id。
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public ExtDataSource withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 创建时间。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ExtDataSource withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 更新时间。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ExtDataSource withDataSourceUpdated(String dataSourceUpdated) {
        this.dataSourceUpdated = dataSourceUpdated;
        return this;
    }

    /**
     * 数据源更新时间。
     * @return dataSourceUpdated
     */
    public String getDataSourceUpdated() {
        return dataSourceUpdated;
    }

    public void setDataSourceUpdated(String dataSourceUpdated) {
        this.dataSourceUpdated = dataSourceUpdated;
    }

    public ExtDataSource withExtendProperties(Object extendProperties) {
        this.extendProperties = extendProperties;
        return this;
    }

    /**
     * 扩展信息。
     * @return extendProperties
     */
    public Object getExtendProperties() {
        return extendProperties;
    }

    public void setExtendProperties(Object extendProperties) {
        this.extendProperties = extendProperties;
    }

    public ExtDataSource withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExtDataSource withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 失败原因。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtDataSource extDataSource = (ExtDataSource) o;
        return Objects.equals(this.id, extDataSource.id) && Objects.equals(this.name, extDataSource.name)
            && Objects.equals(this.type, extDataSource.type)
            && Objects.equals(this.connectInfo, extDataSource.connectInfo)
            && Objects.equals(this.userName, extDataSource.userName)
            && Objects.equals(this.version, extDataSource.version)
            && Objects.equals(this.configureStatus, extDataSource.configureStatus)
            && Objects.equals(this.status, extDataSource.status)
            && Objects.equals(this.dataSourceId, extDataSource.dataSourceId)
            && Objects.equals(this.created, extDataSource.created)
            && Objects.equals(this.updated, extDataSource.updated)
            && Objects.equals(this.dataSourceUpdated, extDataSource.dataSourceUpdated)
            && Objects.equals(this.extendProperties, extDataSource.extendProperties)
            && Objects.equals(this.description, extDataSource.description)
            && Objects.equals(this.failReason, extDataSource.failReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            type,
            connectInfo,
            userName,
            version,
            configureStatus,
            status,
            dataSourceId,
            created,
            updated,
            dataSourceUpdated,
            extendProperties,
            description,
            failReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtDataSource {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    connectInfo: ").append(toIndentedString(connectInfo)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    configureStatus: ").append(toIndentedString(configureStatus)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    dataSourceId: ").append(toIndentedString(dataSourceId)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    dataSourceUpdated: ").append(toIndentedString(dataSourceUpdated)).append("\n");
        sb.append("    extendProperties: ").append(toIndentedString(extendProperties)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
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
