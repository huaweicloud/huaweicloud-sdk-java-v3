package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowAccessoryLimitsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessory_limit")

    private AccessoryLimitVo accessoryLimit;

    public ShowAccessoryLimitsResponse withAccessoryLimit(AccessoryLimitVo accessoryLimit) {
        this.accessoryLimit = accessoryLimit;
        return this;
    }

    public ShowAccessoryLimitsResponse withAccessoryLimit(Consumer<AccessoryLimitVo> accessoryLimitSetter) {
        if (this.accessoryLimit == null) {
            this.accessoryLimit = new AccessoryLimitVo();
            accessoryLimitSetter.accept(this.accessoryLimit);
        }

        return this;
    }

    /** Get accessoryLimit
     * 
     * @return accessoryLimit */
    public AccessoryLimitVo getAccessoryLimit() {
        return accessoryLimit;
    }

    public void setAccessoryLimit(AccessoryLimitVo accessoryLimit) {
        this.accessoryLimit = accessoryLimit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAccessoryLimitsResponse showAccessoryLimitsResponse = (ShowAccessoryLimitsResponse) o;
        return Objects.equals(this.accessoryLimit, showAccessoryLimitsResponse.accessoryLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessoryLimit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAccessoryLimitsResponse {\n");
        sb.append("    accessoryLimit: ").append(toIndentedString(accessoryLimit)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
