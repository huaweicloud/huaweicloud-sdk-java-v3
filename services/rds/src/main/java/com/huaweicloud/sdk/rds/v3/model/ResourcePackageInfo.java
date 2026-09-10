package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResourcePackageInfo
 */
public class ResourcePackageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private String engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_quota")

    private Integer usedQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_quota")

    private Integer totalQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ResourcePackageInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源包ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ResourcePackageInfo withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * 引擎名称。
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public ResourcePackageInfo withUsedQuota(Integer usedQuota) {
        this.usedQuota = usedQuota;
        return this;
    }

    /**
     * 已使用配额。
     * @return usedQuota
     */
    public Integer getUsedQuota() {
        return usedQuota;
    }

    public void setUsedQuota(Integer usedQuota) {
        this.usedQuota = usedQuota;
    }

    public ResourcePackageInfo withTotalQuota(Integer totalQuota) {
        this.totalQuota = totalQuota;
        return this;
    }

    /**
     * 总配额。
     * @return totalQuota
     */
    public Integer getTotalQuota() {
        return totalQuota;
    }

    public void setTotalQuota(Integer totalQuota) {
        this.totalQuota = totalQuota;
    }

    public ResourcePackageInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 资源包状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourcePackageInfo that = (ResourcePackageInfo) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.engineName, that.engineName)
            && Objects.equals(this.usedQuota, that.usedQuota) && Objects.equals(this.totalQuota, that.totalQuota)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, engineName, usedQuota, totalQuota, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourcePackageInfo {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    usedQuota: ").append(toIndentedString(usedQuota)).append("\n");
        sb.append("    totalQuota: ").append(toIndentedString(totalQuota)).append("\n");
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
