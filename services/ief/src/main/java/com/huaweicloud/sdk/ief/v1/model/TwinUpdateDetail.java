package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新终端设备孪生参数配置
 */
public class TwinUpdateDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "twin")

    @JacksonXmlProperty(localName = "twin")

    private Map<String, ValueInTwin> twin = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_visitors")

    @JacksonXmlProperty(localName = "property_visitors")

    private Map<String, ValueInPropertyVisitors> propertyVisitors = null;

    public TwinUpdateDetail withTwin(Map<String, ValueInTwin> twin) {
        this.twin = twin;
        return this;
    }

    public TwinUpdateDetail putTwinItem(String key, ValueInTwin twinItem) {
        if (this.twin == null) {
            this.twin = new HashMap<>();
        }
        this.twin.put(key, twinItem);
        return this;
    }

    public TwinUpdateDetail withTwin(Consumer<Map<String, ValueInTwin>> twinSetter) {
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
    public Map<String, ValueInTwin> getTwin() {
        return twin;
    }

    public void setTwin(Map<String, ValueInTwin> twin) {
        this.twin = twin;
    }

    public TwinUpdateDetail withPropertyVisitors(Map<String, ValueInPropertyVisitors> propertyVisitors) {
        this.propertyVisitors = propertyVisitors;
        return this;
    }

    public TwinUpdateDetail putPropertyVisitorsItem(String key, ValueInPropertyVisitors propertyVisitorsItem) {
        if (this.propertyVisitors == null) {
            this.propertyVisitors = new HashMap<>();
        }
        this.propertyVisitors.put(key, propertyVisitorsItem);
        return this;
    }

    public TwinUpdateDetail withPropertyVisitors(
        Consumer<Map<String, ValueInPropertyVisitors>> propertyVisitorsSetter) {
        if (this.propertyVisitors == null) {
            this.propertyVisitors = new HashMap<>();
        }
        propertyVisitorsSetter.accept(this.propertyVisitors);
        return this;
    }

    /**
     * 孪生属性配置，与access_protocol关联。
     * @return propertyVisitors
     */
    public Map<String, ValueInPropertyVisitors> getPropertyVisitors() {
        return propertyVisitors;
    }

    public void setPropertyVisitors(Map<String, ValueInPropertyVisitors> propertyVisitors) {
        this.propertyVisitors = propertyVisitors;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TwinUpdateDetail twinUpdateDetail = (TwinUpdateDetail) o;
        return Objects.equals(this.twin, twinUpdateDetail.twin)
            && Objects.equals(this.propertyVisitors, twinUpdateDetail.propertyVisitors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(twin, propertyVisitors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TwinUpdateDetail {\n");
        sb.append("    twin: ").append(toIndentedString(twin)).append("\n");
        sb.append("    propertyVisitors: ").append(toIndentedString(propertyVisitors)).append("\n");
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
