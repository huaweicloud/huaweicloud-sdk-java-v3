package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateDatabaseWaterMarkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marked_data")

    private List<Map<String, Object>> markedData = null;

    public CreateDatabaseWaterMarkResponse withMarkedData(List<Map<String, Object>> markedData) {
        this.markedData = markedData;
        return this;
    }

    public CreateDatabaseWaterMarkResponse addMarkedDataItem(Map<String, Object> markedDataItem) {
        if (this.markedData == null) {
            this.markedData = new ArrayList<>();
        }
        this.markedData.add(markedDataItem);
        return this;
    }

    public CreateDatabaseWaterMarkResponse withMarkedData(Consumer<List<Map<String, Object>>> markedDataSetter) {
        if (this.markedData == null) {
            this.markedData = new ArrayList<>();
        }
        markedDataSetter.accept(this.markedData);
        return this;
    }

    /**
     * 嵌入水印后的数据
     * @return markedData
     */
    public List<Map<String, Object>> getMarkedData() {
        return markedData;
    }

    public void setMarkedData(List<Map<String, Object>> markedData) {
        this.markedData = markedData;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDatabaseWaterMarkResponse createDatabaseWaterMarkResponse = (CreateDatabaseWaterMarkResponse) o;
        return Objects.equals(this.markedData, createDatabaseWaterMarkResponse.markedData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(markedData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatabaseWaterMarkResponse {\n");
        sb.append("    markedData: ").append(toIndentedString(markedData)).append("\n");
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
