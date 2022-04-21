package com.huaweicloud.sdk.ies.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateEdgeSite
 */
public class CreateEdgeSite {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private CreateLocation location;

    public CreateEdgeSite withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 边缘小站名称，最大支持长度为64个字节。只包含中文字符、英文字母（a-z、A-Z）、数字（0-9）、下划线（_）、中划线（-）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateEdgeSite withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 边缘小站所属区域ID，最大长度为64个字节。只包含英文字母（a-z、A-Z）、数字（0-9）、下划线（_）、中划线（-）
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public CreateEdgeSite withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 边缘小站描述，最大支持长度为255个字节，不允许包含<>
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateEdgeSite withLocation(CreateLocation location) {
        this.location = location;
        return this;
    }

    public CreateEdgeSite withLocation(Consumer<CreateLocation> locationSetter) {
        if (this.location == null) {
            this.location = new CreateLocation();
            locationSetter.accept(this.location);
        }

        return this;
    }

    /**
     * Get location
     * @return location
     */
    public CreateLocation getLocation() {
        return location;
    }

    public void setLocation(CreateLocation location) {
        this.location = location;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateEdgeSite createEdgeSite = (CreateEdgeSite) o;
        return Objects.equals(this.name, createEdgeSite.name) && Objects.equals(this.regionId, createEdgeSite.regionId)
            && Objects.equals(this.description, createEdgeSite.description)
            && Objects.equals(this.location, createEdgeSite.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, regionId, description, location);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEdgeSite {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
