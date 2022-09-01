package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 迁移错误信息
 */
public class MigrationErrors {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_json")

    @JacksonXmlProperty(localName = "error_json")

    private String errorJson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    @JacksonXmlProperty(localName = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    @JacksonXmlProperty(localName = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_ip")

    @JacksonXmlProperty(localName = "source_ip")

    private String sourceIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_ip")

    @JacksonXmlProperty(localName = "target_ip")

    private String targetIp;

    public MigrationErrors withErrorJson(String errorJson) {
        this.errorJson = errorJson;
        return this;
    }

    /**
     * 保存错误信息的json字符串
     * @return errorJson
     */
    public String getErrorJson() {
        return errorJson;
    }

    public void setErrorJson(String errorJson) {
        this.errorJson = errorJson;
    }

    public MigrationErrors withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 主机名称（从用户系统获取，可能为空）
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public MigrationErrors withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 源端在主机迁移服务中的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MigrationErrors withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 源端服务器id
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public MigrationErrors withSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }

    /**
     * 源端服务器的ip
     * @return sourceIp
     */
    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public MigrationErrors withTargetIp(String targetIp) {
        this.targetIp = targetIp;
        return this;
    }

    /**
     * 目的端服务器的ip 
     * @return targetIp
     */
    public String getTargetIp() {
        return targetIp;
    }

    public void setTargetIp(String targetIp) {
        this.targetIp = targetIp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrationErrors migrationErrors = (MigrationErrors) o;
        return Objects.equals(this.errorJson, migrationErrors.errorJson)
            && Objects.equals(this.hostName, migrationErrors.hostName)
            && Objects.equals(this.name, migrationErrors.name)
            && Objects.equals(this.sourceId, migrationErrors.sourceId)
            && Objects.equals(this.sourceIp, migrationErrors.sourceIp)
            && Objects.equals(this.targetIp, migrationErrors.targetIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorJson, hostName, name, sourceId, sourceIp, targetIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationErrors {\n");
        sb.append("    errorJson: ").append(toIndentedString(errorJson)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
        sb.append("    targetIp: ").append(toIndentedString(targetIp)).append("\n");
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
