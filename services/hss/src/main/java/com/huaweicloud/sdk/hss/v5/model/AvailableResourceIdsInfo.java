package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AvailableResourceIdsInfo
 */
public class AvailableResourceIdsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_time")

    private String currentTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_quota")

    private String sharedQuota;

    public AvailableResourceIdsInfo withResourceId(String resourceId) {
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

    public AvailableResourceIdsInfo withCurrentTime(String currentTime) {
        this.currentTime = currentTime;
        return this;
    }

    /**
     * 当前时间
     * @return currentTime
     */
    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public AvailableResourceIdsInfo withSharedQuota(String sharedQuota) {
        this.sharedQuota = sharedQuota;
        return this;
    }

    /**
     * 是否共享配额   - shared：共享的   - unshared：非共享的
     * @return sharedQuota
     */
    public String getSharedQuota() {
        return sharedQuota;
    }

    public void setSharedQuota(String sharedQuota) {
        this.sharedQuota = sharedQuota;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AvailableResourceIdsInfo that = (AvailableResourceIdsInfo) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.currentTime, that.currentTime)
            && Objects.equals(this.sharedQuota, that.sharedQuota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, currentTime, sharedQuota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailableResourceIdsInfo {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    currentTime: ").append(toIndentedString(currentTime)).append("\n");
        sb.append("    sharedQuota: ").append(toIndentedString(sharedQuota)).append("\n");
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
