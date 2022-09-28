package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 导入应用响应体
 */
public class ImportAppRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_app_id")

    private String sourceAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_app_id")

    private String destinationAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_app_name")

    private String destinationAppName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ImportAppRsp withSourceAppId(String sourceAppId) {
        this.sourceAppId = sourceAppId;
        return this;
    }

    /**
     * 源应用id
     * @return sourceAppId
     */
    public String getSourceAppId() {
        return sourceAppId;
    }

    public void setSourceAppId(String sourceAppId) {
        this.sourceAppId = sourceAppId;
    }

    public ImportAppRsp withDestinationAppId(String destinationAppId) {
        this.destinationAppId = destinationAppId;
        return this;
    }

    /**
     * 目标应用id
     * @return destinationAppId
     */
    public String getDestinationAppId() {
        return destinationAppId;
    }

    public void setDestinationAppId(String destinationAppId) {
        this.destinationAppId = destinationAppId;
    }

    public ImportAppRsp withDestinationAppName(String destinationAppName) {
        this.destinationAppName = destinationAppName;
        return this;
    }

    /**
     * 目标应用名称
     * @return destinationAppName
     */
    public String getDestinationAppName() {
        return destinationAppName;
    }

    public void setDestinationAppName(String destinationAppName) {
        this.destinationAppName = destinationAppName;
    }

    public ImportAppRsp withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 应用版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ImportAppRsp withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 导入结果信息，仅在导入失败时会返回
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ImportAppRsp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 导入结果状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportAppRsp importAppRsp = (ImportAppRsp) o;
        return Objects.equals(this.sourceAppId, importAppRsp.sourceAppId)
            && Objects.equals(this.destinationAppId, importAppRsp.destinationAppId)
            && Objects.equals(this.destinationAppName, importAppRsp.destinationAppName)
            && Objects.equals(this.version, importAppRsp.version) && Objects.equals(this.message, importAppRsp.message)
            && Objects.equals(this.status, importAppRsp.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceAppId, destinationAppId, destinationAppName, version, message, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportAppRsp {\n");
        sb.append("    sourceAppId: ").append(toIndentedString(sourceAppId)).append("\n");
        sb.append("    destinationAppId: ").append(toIndentedString(destinationAppId)).append("\n");
        sb.append("    destinationAppName: ").append(toIndentedString(destinationAppName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
