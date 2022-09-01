package com.huaweicloud.sdk.ies.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateEdgeSite
 */
public class UpdateEdgeSite {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    @JacksonXmlProperty(localName = "location")

    private UpdateLocation location;

    public UpdateEdgeSite withDescription(String description) {
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

    public UpdateEdgeSite withLocation(UpdateLocation location) {
        this.location = location;
        return this;
    }

    public UpdateEdgeSite withLocation(Consumer<UpdateLocation> locationSetter) {
        if (this.location == null) {
            this.location = new UpdateLocation();
            locationSetter.accept(this.location);
        }

        return this;
    }

    /**
     * Get location
     * @return location
     */
    public UpdateLocation getLocation() {
        return location;
    }

    public void setLocation(UpdateLocation location) {
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
        UpdateEdgeSite updateEdgeSite = (UpdateEdgeSite) o;
        return Objects.equals(this.description, updateEdgeSite.description)
            && Objects.equals(this.location, updateEdgeSite.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, location);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEdgeSite {\n");
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
