package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DiagnoseResourceVo
 */
public class DiagnoseResourceVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fault")

    private String fault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessIPv4")

    private String accessIPv4;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessIPv6")

    private String accessIPv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenantId")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userId")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Object metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostId")

    private String hostId;

    public DiagnoseResourceVo withFault(String fault) {
        this.fault = fault;
        return this;
    }

    /**
     * ID 
     * @return fault
     */
    public String getFault() {
        return fault;
    }

    public void setFault(String fault) {
        this.fault = fault;
    }

    public DiagnoseResourceVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 状态
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DiagnoseResourceVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DiagnoseResourceVo withAccessIPv4(String accessIPv4) {
        this.accessIPv4 = accessIPv4;
        return this;
    }

    /**
     * ip4地址
     * @return accessIPv4
     */
    public String getAccessIPv4() {
        return accessIPv4;
    }

    public void setAccessIPv4(String accessIPv4) {
        this.accessIPv4 = accessIPv4;
    }

    public DiagnoseResourceVo withAccessIPv6(String accessIPv6) {
        this.accessIPv6 = accessIPv6;
        return this;
    }

    /**
     * ip6地址
     * @return accessIPv6
     */
    public String getAccessIPv6() {
        return accessIPv6;
    }

    public void setAccessIPv6(String accessIPv6) {
        this.accessIPv6 = accessIPv6;
    }

    public DiagnoseResourceVo withStatus(String status) {
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

    public DiagnoseResourceVo withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 进度
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public DiagnoseResourceVo withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 前端id
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public DiagnoseResourceVo withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public DiagnoseResourceVo withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * 资源元数据
     * @return metadata
     */
    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public DiagnoseResourceVo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机id
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiagnoseResourceVo diagnoseResourceVo = (DiagnoseResourceVo) o;
        return Objects.equals(this.fault, diagnoseResourceVo.fault) && Objects.equals(this.id, diagnoseResourceVo.id)
            && Objects.equals(this.name, diagnoseResourceVo.name)
            && Objects.equals(this.accessIPv4, diagnoseResourceVo.accessIPv4)
            && Objects.equals(this.accessIPv6, diagnoseResourceVo.accessIPv6)
            && Objects.equals(this.status, diagnoseResourceVo.status)
            && Objects.equals(this.progress, diagnoseResourceVo.progress)
            && Objects.equals(this.tenantId, diagnoseResourceVo.tenantId)
            && Objects.equals(this.userId, diagnoseResourceVo.userId)
            && Objects.equals(this.metadata, diagnoseResourceVo.metadata)
            && Objects.equals(this.hostId, diagnoseResourceVo.hostId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(fault, id, name, accessIPv4, accessIPv6, status, progress, tenantId, userId, metadata, hostId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiagnoseResourceVo {\n");
        sb.append("    fault: ").append(toIndentedString(fault)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    accessIPv4: ").append(toIndentedString(accessIPv4)).append("\n");
        sb.append("    accessIPv6: ").append(toIndentedString(accessIPv6)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
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
