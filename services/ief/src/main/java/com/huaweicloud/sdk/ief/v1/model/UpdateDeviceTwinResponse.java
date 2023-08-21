package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateDeviceTwinResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_visitors")

    private Map<String, ValueInPropertyVisitors> propertyVisitors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "twin")

    private Map<String, ValueInTwinResponse> twin = null;

    public UpdateDeviceTwinResponse withPropertyVisitors(Map<String, ValueInPropertyVisitors> propertyVisitors) {
        this.propertyVisitors = propertyVisitors;
        return this;
    }

    public UpdateDeviceTwinResponse putPropertyVisitorsItem(String key, ValueInPropertyVisitors propertyVisitorsItem) {
        if (this.propertyVisitors == null) {
            this.propertyVisitors = new HashMap<>();
        }
        this.propertyVisitors.put(key, propertyVisitorsItem);
        return this;
    }

    public UpdateDeviceTwinResponse withPropertyVisitors(
        Consumer<Map<String, ValueInPropertyVisitors>> propertyVisitorsSetter) {
        if (this.propertyVisitors == null) {
            this.propertyVisitors = new HashMap<>();
        }
        propertyVisitorsSetter.accept(this.propertyVisitors);
        return this;
    }

    /**
     * 孪生属性配置
     * @return propertyVisitors
     */
    public Map<String, ValueInPropertyVisitors> getPropertyVisitors() {
        return propertyVisitors;
    }

    public void setPropertyVisitors(Map<String, ValueInPropertyVisitors> propertyVisitors) {
        this.propertyVisitors = propertyVisitors;
    }

    public UpdateDeviceTwinResponse withTwin(Map<String, ValueInTwinResponse> twin) {
        this.twin = twin;
        return this;
    }

    public UpdateDeviceTwinResponse putTwinItem(String key, ValueInTwinResponse twinItem) {
        if (this.twin == null) {
            this.twin = new HashMap<>();
        }
        this.twin.put(key, twinItem);
        return this;
    }

    public UpdateDeviceTwinResponse withTwin(Consumer<Map<String, ValueInTwinResponse>> twinSetter) {
        if (this.twin == null) {
            this.twin = new HashMap<>();
        }
        twinSetter.accept(this.twin);
        return this;
    }

    /**
     * 终端设备动态属性
     * @return twin
     */
    public Map<String, ValueInTwinResponse> getTwin() {
        return twin;
    }

    public void setTwin(Map<String, ValueInTwinResponse> twin) {
        this.twin = twin;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDeviceTwinResponse that = (UpdateDeviceTwinResponse) obj;
        return Objects.equals(this.propertyVisitors, that.propertyVisitors) && Objects.equals(this.twin, that.twin);
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
