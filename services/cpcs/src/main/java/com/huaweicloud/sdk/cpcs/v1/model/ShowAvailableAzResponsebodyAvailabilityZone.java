package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowAvailableAzResponsebodyAvailabilityZone
 */
public class ShowAvailableAzResponsebodyAvailabilityZone {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locales")

    private ShowAvailableAzResponsebodyLocales locales;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ShowAvailableAzResponsebodyAvailabilityZone withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 可用区ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowAvailableAzResponsebodyAvailabilityZone withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 显示名称
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ShowAvailableAzResponsebodyAvailabilityZone withLocales(ShowAvailableAzResponsebodyLocales locales) {
        this.locales = locales;
        return this;
    }

    public ShowAvailableAzResponsebodyAvailabilityZone withLocales(
        Consumer<ShowAvailableAzResponsebodyLocales> localesSetter) {
        if (this.locales == null) {
            this.locales = new ShowAvailableAzResponsebodyLocales();
            localesSetter.accept(this.locales);
        }

        return this;
    }

    /**
     * Get locales
     * @return locales
     */
    public ShowAvailableAzResponsebodyLocales getLocales() {
        return locales;
    }

    public void setLocales(ShowAvailableAzResponsebodyLocales locales) {
        this.locales = locales;
    }

    public ShowAvailableAzResponsebodyAvailabilityZone withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowAvailableAzResponsebodyAvailabilityZone withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 局点ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ShowAvailableAzResponsebodyAvailabilityZone withStatus(String status) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAvailableAzResponsebodyAvailabilityZone that = (ShowAvailableAzResponsebodyAvailabilityZone) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.locales, that.locales) && Objects.equals(this.type, that.type)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, displayName, locales, type, regionId, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAvailableAzResponsebodyAvailabilityZone {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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
