package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VOD 打包信息，包括DRM resourceID和转封装模板ID，模板ID通过VOD查询
 */
public class VodPackageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packaging_group_id")

    private String packagingGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    public VodPackageInfo withPackagingGroupId(String packagingGroupId) {
        this.packagingGroupId = packagingGroupId;
        return this;
    }

    /**
     * VOD 打包信息，转封装模板ID，模板ID通过VOD查询
     * @return packagingGroupId
     */
    public String getPackagingGroupId() {
        return packagingGroupId;
    }

    public void setPackagingGroupId(String packagingGroupId) {
        this.packagingGroupId = packagingGroupId;
    }

    public VodPackageInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * DRM resourceID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VodPackageInfo that = (VodPackageInfo) obj;
        return Objects.equals(this.packagingGroupId, that.packagingGroupId)
            && Objects.equals(this.resourceId, that.resourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packagingGroupId, resourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VodPackageInfo {\n");
        sb.append("    packagingGroupId: ").append(toIndentedString(packagingGroupId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
