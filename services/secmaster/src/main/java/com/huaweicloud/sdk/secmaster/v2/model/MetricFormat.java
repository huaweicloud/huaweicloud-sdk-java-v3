package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MetricFormat
 */
public class MetricFormat {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private String data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display")

    private String display;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_param")

    private Map<String, String> displayParam = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_param")

    private Map<String, String> dataParam = null;

    public MetricFormat withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * 数据格式
     * @return data
     */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public MetricFormat withDisplay(String display) {
        this.display = display;
        return this;
    }

    /**
     * 显示格式
     * @return display
     */
    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public MetricFormat withDisplayParam(Map<String, String> displayParam) {
        this.displayParam = displayParam;
        return this;
    }

    public MetricFormat putDisplayParamItem(String key, String displayParamItem) {
        if (this.displayParam == null) {
            this.displayParam = new HashMap<>();
        }
        this.displayParam.put(key, displayParamItem);
        return this;
    }

    public MetricFormat withDisplayParam(Consumer<Map<String, String>> displayParamSetter) {
        if (this.displayParam == null) {
            this.displayParam = new HashMap<>();
        }
        displayParamSetter.accept(this.displayParam);
        return this;
    }

    /**
     * 显示参数
     * @return displayParam
     */
    public Map<String, String> getDisplayParam() {
        return displayParam;
    }

    public void setDisplayParam(Map<String, String> displayParam) {
        this.displayParam = displayParam;
    }

    public MetricFormat withDataParam(Map<String, String> dataParam) {
        this.dataParam = dataParam;
        return this;
    }

    public MetricFormat putDataParamItem(String key, String dataParamItem) {
        if (this.dataParam == null) {
            this.dataParam = new HashMap<>();
        }
        this.dataParam.put(key, dataParamItem);
        return this;
    }

    public MetricFormat withDataParam(Consumer<Map<String, String>> dataParamSetter) {
        if (this.dataParam == null) {
            this.dataParam = new HashMap<>();
        }
        dataParamSetter.accept(this.dataParam);
        return this;
    }

    /**
     * 数据参数
     * @return dataParam
     */
    public Map<String, String> getDataParam() {
        return dataParam;
    }

    public void setDataParam(Map<String, String> dataParam) {
        this.dataParam = dataParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricFormat that = (MetricFormat) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.display, that.display)
            && Objects.equals(this.displayParam, that.displayParam) && Objects.equals(this.dataParam, that.dataParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, display, displayParam, dataParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricFormat {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    displayParam: ").append(toIndentedString(displayParam)).append("\n");
        sb.append("    dataParam: ").append(toIndentedString(dataParam)).append("\n");
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
