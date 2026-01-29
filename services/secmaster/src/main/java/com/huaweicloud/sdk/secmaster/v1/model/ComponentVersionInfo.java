package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 插件版本信息
 */
public class ComponentVersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_num")

    private String versionNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_desc")

    private String versionDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_name")

    private String packageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_attachment_id")

    private String componentAttachmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_version_id")

    private String subVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_config")

    private String connectionConfig;

    public ComponentVersionInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 版本ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ComponentVersionInfo withVersionNum(String versionNum) {
        this.versionNum = versionNum;
        return this;
    }

    /**
     * 版本号
     * @return versionNum
     */
    public String getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum;
    }

    public ComponentVersionInfo withVersionDesc(String versionDesc) {
        this.versionDesc = versionDesc;
        return this;
    }

    /**
     * 版本描述
     * @return versionDesc
     */
    public String getVersionDesc() {
        return versionDesc;
    }

    public void setVersionDesc(String versionDesc) {
        this.versionDesc = versionDesc;
    }

    public ComponentVersionInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ComponentVersionInfo withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * 插件所属包
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public ComponentVersionInfo withComponentAttachmentId(String componentAttachmentId) {
        this.componentAttachmentId = componentAttachmentId;
        return this;
    }

    /**
     * 插件的附件id
     * @return componentAttachmentId
     */
    public String getComponentAttachmentId() {
        return componentAttachmentId;
    }

    public void setComponentAttachmentId(String componentAttachmentId) {
        this.componentAttachmentId = componentAttachmentId;
    }

    public ComponentVersionInfo withSubVersionId(String subVersionId) {
        this.subVersionId = subVersionId;
        return this;
    }

    /**
     * 订阅版本id
     * @return subVersionId
     */
    public String getSubVersionId() {
        return subVersionId;
    }

    public void setSubVersionId(String subVersionId) {
        this.subVersionId = subVersionId;
    }

    public ComponentVersionInfo withConnectionConfig(String connectionConfig) {
        this.connectionConfig = connectionConfig;
        return this;
    }

    /**
     * 操作连接配置List
     * @return connectionConfig
     */
    public String getConnectionConfig() {
        return connectionConfig;
    }

    public void setConnectionConfig(String connectionConfig) {
        this.connectionConfig = connectionConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentVersionInfo that = (ComponentVersionInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.versionNum, that.versionNum)
            && Objects.equals(this.versionDesc, that.versionDesc) && Objects.equals(this.status, that.status)
            && Objects.equals(this.packageName, that.packageName)
            && Objects.equals(this.componentAttachmentId, that.componentAttachmentId)
            && Objects.equals(this.subVersionId, that.subVersionId)
            && Objects.equals(this.connectionConfig, that.connectionConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            versionNum,
            versionDesc,
            status,
            packageName,
            componentAttachmentId,
            subVersionId,
            connectionConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentVersionInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    versionNum: ").append(toIndentedString(versionNum)).append("\n");
        sb.append("    versionDesc: ").append(toIndentedString(versionDesc)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    componentAttachmentId: ").append(toIndentedString(componentAttachmentId)).append("\n");
        sb.append("    subVersionId: ").append(toIndentedString(subVersionId)).append("\n");
        sb.append("    connectionConfig: ").append(toIndentedString(connectionConfig)).append("\n");
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
