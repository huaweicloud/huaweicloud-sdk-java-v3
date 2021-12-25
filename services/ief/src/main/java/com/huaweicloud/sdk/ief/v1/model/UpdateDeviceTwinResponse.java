package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class UpdateDeviceTwinResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_visitors")

    private ValueInPropertyVisitors propertyVisitors;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "twin")

    private ValueInTwinResponse twin;

    public UpdateDeviceTwinResponse withPropertyVisitors(ValueInPropertyVisitors propertyVisitors) {
        this.propertyVisitors = propertyVisitors;
        return this;
    }

    public UpdateDeviceTwinResponse withPropertyVisitors(Consumer<ValueInPropertyVisitors> propertyVisitorsSetter) {
        if (this.propertyVisitors == null) {
            this.propertyVisitors = new ValueInPropertyVisitors();
            propertyVisitorsSetter.accept(this.propertyVisitors);
        }

        return this;
    }

    /** Get propertyVisitors
     * 
     * @return propertyVisitors */
    public ValueInPropertyVisitors getPropertyVisitors() {
        return propertyVisitors;
    }

    public void setPropertyVisitors(ValueInPropertyVisitors propertyVisitors) {
        this.propertyVisitors = propertyVisitors;
    }

    public UpdateDeviceTwinResponse withTwin(ValueInTwinResponse twin) {
        this.twin = twin;
        return this;
    }

    public UpdateDeviceTwinResponse withTwin(Consumer<ValueInTwinResponse> twinSetter) {
        if (this.twin == null) {
            this.twin = new ValueInTwinResponse();
            twinSetter.accept(this.twin);
        }

        return this;
    }

    /** Get twin
     * 
     * @return twin */
    public ValueInTwinResponse getTwin() {
        return twin;
    }

    public void setTwin(ValueInTwinResponse twin) {
        this.twin = twin;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDeviceTwinResponse updateDeviceTwinResponse = (UpdateDeviceTwinResponse) o;
        return Objects.equals(this.propertyVisitors, updateDeviceTwinResponse.propertyVisitors)
            && Objects.equals(this.twin, updateDeviceTwinResponse.twin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyVisitors, twin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDeviceTwinResponse {\n");
        sb.append("    propertyVisitors: ").append(toIndentedString(propertyVisitors)).append("\n");
        sb.append("    twin: ").append(toIndentedString(twin)).append("\n");
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
