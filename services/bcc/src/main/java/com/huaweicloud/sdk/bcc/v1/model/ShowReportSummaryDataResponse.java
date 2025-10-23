package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowReportSummaryDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_item_name")

    private String dataItemName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_length")

    private Integer dataLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_name")

    private String dimensionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_data")

    private List<String> dimensionData = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_name")

    private List<String> valueName = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_data")

    private List<List<Double>> valueData = null;

    public ShowReportSummaryDataResponse withDataItemName(String dataItemName) {
        this.dataItemName = dataItemName;
        return this;
    }

    /**
     * 数据项名称，例如task-status-pie
     * @return dataItemName
     */
    public String getDataItemName() {
        return dataItemName;
    }

    public void setDataItemName(String dataItemName) {
        this.dataItemName = dataItemName;
    }

    public ShowReportSummaryDataResponse withDataLength(Integer dataLength) {
        this.dataLength = dataLength;
        return this;
    }

    /**
     * 数据点个数，例如10
     * @return dataLength
     */
    public Integer getDataLength() {
        return dataLength;
    }

    public void setDataLength(Integer dataLength) {
        this.dataLength = dataLength;
    }

    public ShowReportSummaryDataResponse withDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
        return this;
    }

    /**
     * 数据维度名称，例如区域、日期、任务类型、资源类型
     * @return dimensionName
     */
    public String getDimensionName() {
        return dimensionName;
    }

    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }

    public ShowReportSummaryDataResponse withDimensionData(List<String> dimensionData) {
        this.dimensionData = dimensionData;
        return this;
    }

    public ShowReportSummaryDataResponse addDimensionDataItem(String dimensionDataItem) {
        if (this.dimensionData == null) {
            this.dimensionData = new ArrayList<>();
        }
        this.dimensionData.add(dimensionDataItem);
        return this;
    }

    public ShowReportSummaryDataResponse withDimensionData(Consumer<List<String>> dimensionDataSetter) {
        if (this.dimensionData == null) {
            this.dimensionData = new ArrayList<>();
        }
        dimensionDataSetter.accept(this.dimensionData);
        return this;
    }

    /**
     * 数据维度取值，长度等于data_length，例如[\"success\",\"failed\",\"skipped\"]，[\"202401\",\"202402\",\"202403']
     * @return dimensionData
     */
    public List<String> getDimensionData() {
        return dimensionData;
    }

    public void setDimensionData(List<String> dimensionData) {
        this.dimensionData = dimensionData;
    }

    public ShowReportSummaryDataResponse withValueName(List<String> valueName) {
        this.valueName = valueName;
        return this;
    }

    public ShowReportSummaryDataResponse addValueNameItem(String valueNameItem) {
        if (this.valueName == null) {
            this.valueName = new ArrayList<>();
        }
        this.valueName.add(valueNameItem);
        return this;
    }

    public ShowReportSummaryDataResponse withValueName(Consumer<List<String>> valueNameSetter) {
        if (this.valueName == null) {
            this.valueName = new ArrayList<>();
        }
        valueNameSetter.accept(this.valueName);
        return this;
    }

    /**
     * 数据取值名称，例如[任务数量、任务成功率，资源数量、资源保护率、资源合规率
     * @return valueName
     */
    public List<String> getValueName() {
        return valueName;
    }

    public void setValueName(List<String> valueName) {
        this.valueName = valueName;
    }

    public ShowReportSummaryDataResponse withValueData(List<List<Double>> valueData) {
        this.valueData = valueData;
        return this;
    }

    public ShowReportSummaryDataResponse addValueDataItem(List<Double> valueDataItem) {
        if (this.valueData == null) {
            this.valueData = new ArrayList<>();
        }
        this.valueData.add(valueDataItem);
        return this;
    }

    public ShowReportSummaryDataResponse withValueData(Consumer<List<List<Double>>> valueDataSetter) {
        if (this.valueData == null) {
            this.valueData = new ArrayList<>();
        }
        valueDataSetter.accept(this.valueData);
        return this;
    }

    /**
     * 数据取值，和value_name相对应，可以是多组数据，例如[[100,0.98,0.97],[99,0.98.0.99]]
     * @return valueData
     */
    public List<List<Double>> getValueData() {
        return valueData;
    }

    public void setValueData(List<List<Double>> valueData) {
        this.valueData = valueData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowReportSummaryDataResponse that = (ShowReportSummaryDataResponse) obj;
        return Objects.equals(this.dataItemName, that.dataItemName) && Objects.equals(this.dataLength, that.dataLength)
            && Objects.equals(this.dimensionName, that.dimensionName)
            && Objects.equals(this.dimensionData, that.dimensionData) && Objects.equals(this.valueName, that.valueName)
            && Objects.equals(this.valueData, that.valueData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataItemName, dataLength, dimensionName, dimensionData, valueName, valueData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReportSummaryDataResponse {\n");
        sb.append("    dataItemName: ").append(toIndentedString(dataItemName)).append("\n");
        sb.append("    dataLength: ").append(toIndentedString(dataLength)).append("\n");
        sb.append("    dimensionName: ").append(toIndentedString(dimensionName)).append("\n");
        sb.append("    dimensionData: ").append(toIndentedString(dimensionData)).append("\n");
        sb.append("    valueName: ").append(toIndentedString(valueName)).append("\n");
        sb.append("    valueData: ").append(toIndentedString(valueData)).append("\n");
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
