package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 流计算输出映射
 */
public class StreamOutput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_property")

    private String outputProperty;

    public StreamOutput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 输出参数名称，必须是接收数据类型为资产数据的实时分析作业中已定义的
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StreamOutput withOutputProperty(String outputProperty) {
        this.outputProperty = outputProperty;
        return this;
    }

    /**
     * 输出属性名，必须是本模型分析任务类别的属性的属性名
     * @return outputProperty
     */
    public String getOutputProperty() {
        return outputProperty;
    }

    public void setOutputProperty(String outputProperty) {
        this.outputProperty = outputProperty;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StreamOutput that = (StreamOutput) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.outputProperty, that.outputProperty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, outputProperty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StreamOutput {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    outputProperty: ").append(toIndentedString(outputProperty)).append("\n");
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
