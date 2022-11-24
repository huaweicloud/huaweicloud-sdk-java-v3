package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddProtectRequest
 */
public class AddProtectRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_level")

    private AddProtectAccessLevel accessLevel;

    public AddProtectRequest withAccessLevel(AddProtectAccessLevel accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }

    public AddProtectRequest withAccessLevel(Consumer<AddProtectAccessLevel> accessLevelSetter) {
        if (this.accessLevel == null) {
            this.accessLevel = new AddProtectAccessLevel();
            accessLevelSetter.accept(this.accessLevel);
        }

        return this;
    }

    /**
     * Get accessLevel
     * @return accessLevel
     */
    public AddProtectAccessLevel getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(AddProtectAccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddProtectRequest addProtectRequest = (AddProtectRequest) o;
        return Objects.equals(this.accessLevel, addProtectRequest.accessLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddProtectRequest {\n");
        sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
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
