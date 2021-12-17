package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListHistoryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamps")

    private List<String> timestamps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private List<HistoryValues> properties = null;

    public ListHistoryResponse withTimestamps(List<String> timestamps) {
        this.timestamps = timestamps;
        return this;
    }

    public ListHistoryResponse addTimestampsItem(String timestampsItem) {
        if (this.timestamps == null) {
            this.timestamps = new ArrayList<>();
        }
        this.timestamps.add(timestampsItem);
        return this;
    }

    public ListHistoryResponse withTimestamps(Consumer<List<String>> timestampsSetter) {
        if (this.timestamps == null) {
            this.timestamps = new ArrayList<>();
        }
        timestampsSetter.accept(this.timestamps);
        return this;
    }

    /** 时间序列
     * 
     * @return timestamps */
    public List<String> getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(List<String> timestamps) {
        this.timestamps = timestamps;
    }

    public ListHistoryResponse withProperties(List<HistoryValues> properties) {
        this.properties = properties;
        return this;
    }

    public ListHistoryResponse addPropertiesItem(HistoryValues propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    public ListHistoryResponse withProperties(Consumer<List<HistoryValues>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /** 查询设备的属性值
     * 
     * @return properties */
    public List<HistoryValues> getProperties() {
        return properties;
    }

    public void setProperties(List<HistoryValues> properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHistoryResponse listHistoryResponse = (ListHistoryResponse) o;
        return Objects.equals(this.timestamps, listHistoryResponse.timestamps)
            && Objects.equals(this.properties, listHistoryResponse.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamps, properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHistoryResponse {\n");
        sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
