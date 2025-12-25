package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 数据源信息。 **取值范围**： 不涉及。
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
     * **参数解释**： 数据源ID。 **取值范围**： 不涉及。
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
     * **参数解释**： 数据源名称。 **取值范围**： 不涉及。
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
     * **参数解释**： 外部数据源类型。 **取值范围**： - OBS: obs数据源。 - LAKE_FORMATION: lake_formation数据源。 - MRS: mrs数据源。
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
     * **参数解释**： 数据库。 **取值范围**： 不涉及。
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
     * **参数解释**： 用户名。 **取值范围**： 不涉及。
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
     * **参数解释**： 版本。 **取值范围**： 不涉及。
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
     * **参数解释**： 配置状态。 **取值范围**： - 100: CREATING，创建中。 - 200: ACTIVE，已可用。 - 300: FAILED，已失败。 - 400: DELETED，已删除。 - 401: DELETING，删除中。 - 500: UPDATING，更新中。 - 600: PENDING_REBOOT，待重启。
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
     * **参数解释**： 状态。 **取值范围**： - 100: CREATING, 创建中。 - 200: AVAILABLE, 可用。 - 300: FAILED, 失败。 - 303: CREATE_FAILED, 创建失败。 - 400: DELETED, 已删除。 - 304: DELETING, 删除中。 - 302: DELETE_FAILED, 删除失败。 - 800: FROZEN, 冻结。 - 801: POLICE_FROZEN, 警方冻结。 - 910: STOPPING, 停止中。 - 900: STOPPED, 已停止。 - 920: STARTING, 启动中。
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
     * **参数解释**： 外部数据源ID。 **取值范围**： 不涉及。
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
     * **参数解释**： 创建时间。 **取值范围**： 不涉及。
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
     * **参数解释**： 更新时间。 **取值范围**： 不涉及。
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
     * **参数解释**： 数据源更新时间。 **取值范围**： 不涉及。
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
     * **参数解释**： 扩展信息。 **取值范围**： 不涉及。
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
     * **参数解释**： 描述。 **取值范围**： 不涉及。
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
     * **参数解释**： 失败原因。 **取值范围**： 不涉及。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtDataSource that = (ExtDataSource) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.connectInfo, that.connectInfo)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.version, that.version)
            && Objects.equals(this.configureStatus, that.configureStatus) && Objects.equals(this.status, that.status)
            && Objects.equals(this.dataSourceId, that.dataSourceId) && Objects.equals(this.created, that.created)
            && Objects.equals(this.updated, that.updated)
            && Objects.equals(this.dataSourceUpdated, that.dataSourceUpdated)
            && Objects.equals(this.extendProperties, that.extendProperties)
            && Objects.equals(this.description, that.description) && Objects.equals(this.failReason, that.failReason);
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
