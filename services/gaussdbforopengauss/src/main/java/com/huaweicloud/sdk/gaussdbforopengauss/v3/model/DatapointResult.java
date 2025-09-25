package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DatapointResult
 */
public class DatapointResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datapoint_name")

    private String datapointName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datapoint_values")

    private List<String> datapointValues = null;

    public DatapointResult withDatapointName(String datapointName) {
        this.datapointName = datapointName;
        return this;
    }

    /**
     * **参数解释**: 指标项名，实例指标用实例ID、节点指标用节点名称、组件指标用组件名称。 **取值范围**: 不涉及。
     * @return datapointName
     */
    public String getDatapointName() {
        return datapointName;
    }

    public void setDatapointName(String datapointName) {
        this.datapointName = datapointName;
    }

    public DatapointResult withDatapointValues(List<String> datapointValues) {
        this.datapointValues = datapointValues;
        return this;
    }

    public DatapointResult addDatapointValuesItem(String datapointValuesItem) {
        if (this.datapointValues == null) {
            this.datapointValues = new ArrayList<>();
        }
        this.datapointValues.add(datapointValuesItem);
        return this;
    }

    public DatapointResult withDatapointValues(Consumer<List<String>> datapointValuesSetter) {
        if (this.datapointValues == null) {
            this.datapointValues = new ArrayList<>();
        }
        datapointValuesSetter.accept(this.datapointValues);
        return this;
    }

    /**
     * **参数解释**: 指标值集合。
     * @return datapointValues
     */
    public List<String> getDatapointValues() {
        return datapointValues;
    }

    public void setDatapointValues(List<String> datapointValues) {
        this.datapointValues = datapointValues;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatapointResult that = (DatapointResult) obj;
        return Objects.equals(this.datapointName, that.datapointName)
            && Objects.equals(this.datapointValues, that.datapointValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datapointName, datapointValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatapointResult {\n");
        sb.append("    datapointName: ").append(toIndentedString(datapointName)).append("\n");
        sb.append("    datapointValues: ").append(toIndentedString(datapointValues)).append("\n");
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
