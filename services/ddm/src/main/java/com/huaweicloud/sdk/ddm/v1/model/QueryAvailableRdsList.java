package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QueryAvailableRdsList。
 */
public class QueryAvailableRdsList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectId")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engineName")

    private String engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engineSoftwareVersion")

    private String engineSoftwareVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privateIp")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "azCode")

    private String azCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeZone")

    private String timeZone;

    public QueryAvailableRdsList withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据库实例 ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QueryAvailableRdsList withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 数据库实例所在租户在某一region下的project ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public QueryAvailableRdsList withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 数据库实例状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public QueryAvailableRdsList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据库实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QueryAvailableRdsList withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * 数据库实例引擎名称。
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public QueryAvailableRdsList withEngineSoftwareVersion(String engineSoftwareVersion) {
        this.engineSoftwareVersion = engineSoftwareVersion;
        return this;
    }

    /**
     * 数据库实例引擎版本。
     * @return engineSoftwareVersion
     */
    public String getEngineSoftwareVersion() {
        return engineSoftwareVersion;
    }

    public void setEngineSoftwareVersion(String engineSoftwareVersion) {
        this.engineSoftwareVersion = engineSoftwareVersion;
    }

    public QueryAvailableRdsList withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 数据库实例内网连接地址。
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public QueryAvailableRdsList withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 数据库实例类型（主备或单机）。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public QueryAvailableRdsList withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 数据库实例端口。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public QueryAvailableRdsList withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /**
     * 可用区。
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    public QueryAvailableRdsList withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryAvailableRdsList that = (QueryAvailableRdsList) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.name, that.name)
            && Objects.equals(this.engineName, that.engineName)
            && Objects.equals(this.engineSoftwareVersion, that.engineSoftwareVersion)
            && Objects.equals(this.privateIp, that.privateIp) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.port, that.port) && Objects.equals(this.azCode, that.azCode)
            && Objects.equals(this.timeZone, that.timeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            status,
            name,
            engineName,
            engineSoftwareVersion,
            privateIp,
            mode,
            port,
            azCode,
            timeZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryAvailableRdsList {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    engineSoftwareVersion: ").append(toIndentedString(engineSoftwareVersion)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
