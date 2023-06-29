package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class ProtectableAgentStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private Integer code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installed")

    private Boolean installed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_old")

    private Boolean isOld;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public ProtectableAgentStatus withCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * agent无法连接的错误码
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ProtectableAgentStatus withInstalled(Boolean installed) {
        this.installed = installed;
        return this;
    }

    /**
     * agent是否安装
     * @return installed
     */
    public Boolean getInstalled() {
        return installed;
    }

    public void setInstalled(Boolean installed) {
        this.installed = installed;
    }

    public ProtectableAgentStatus withIsOld(Boolean isOld) {
        this.isOld = isOld;
        return this;
    }

    /**
     * agent是否为老版本
     * @return isOld
     */
    public Boolean getIsOld() {
        return isOld;
    }

    public void setIsOld(Boolean isOld) {
        this.isOld = isOld;
    }

    public ProtectableAgentStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * agent无法连接的错误信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ProtectableAgentStatus withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ProtectableAgentStatus withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * agent版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtectableAgentStatus that = (ProtectableAgentStatus) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.installed, that.installed)
            && Objects.equals(this.isOld, that.isOld) && Objects.equals(this.message, that.message)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, installed, isOld, message, resourceId, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectableAgentStatus {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    installed: ").append(toIndentedString(installed)).append("\n");
        sb.append("    isOld: ").append(toIndentedString(isOld)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
