package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 添加收藏请求体。
 */
public class CreateFavoriteReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_info")

    private String displayInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location_info")

    private String locationInfo;

    public CreateFavoriteReq withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 收藏类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateFavoriteReq withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 收藏的资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public CreateFavoriteReq withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 收藏的资源名称，正则匹配中文，英文字母和数字及下划线。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public CreateFavoriteReq withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 收藏的资源类型，正则匹配英文字母和数字及下划线。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public CreateFavoriteReq withDisplayInfo(String displayInfo) {
        this.displayInfo = displayInfo;
        return this;
    }

    /**
     * 展示信息。
     * @return displayInfo
     */
    public String getDisplayInfo() {
        return displayInfo;
    }

    public void setDisplayInfo(String displayInfo) {
        this.displayInfo = displayInfo;
    }

    public CreateFavoriteReq withLocationInfo(String locationInfo) {
        this.locationInfo = locationInfo;
        return this;
    }

    /**
     * 定位信息。
     * @return locationInfo
     */
    public String getLocationInfo() {
        return locationInfo;
    }

    public void setLocationInfo(String locationInfo) {
        this.locationInfo = locationInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFavoriteReq that = (CreateFavoriteReq) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.displayInfo, that.displayInfo)
            && Objects.equals(this.locationInfo, that.locationInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, resourceId, resourceName, resourceType, displayInfo, locationInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFavoriteReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    displayInfo: ").append(toIndentedString(displayInfo)).append("\n");
        sb.append("    locationInfo: ").append(toIndentedString(locationInfo)).append("\n");
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
