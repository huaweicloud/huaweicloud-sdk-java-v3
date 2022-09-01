package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * MetricRequestV2DividendCustomFields
 */
public class MetricRequestV2DividendCustomFields {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    @JacksonXmlProperty(localName = "options")

    private String options;

    public MetricRequestV2DividendCustomFields withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 自定义字段名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MetricRequestV2DividendCustomFields withOptions(String options) {
        this.options = options;
        return this;
    }

    /**
     * 自定义字段取值，逗号分隔
     * @return options
     */
    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetricRequestV2DividendCustomFields metricRequestV2DividendCustomFields =
            (MetricRequestV2DividendCustomFields) o;
        return Objects.equals(this.name, metricRequestV2DividendCustomFields.name)
            && Objects.equals(this.options, metricRequestV2DividendCustomFields.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricRequestV2DividendCustomFields {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
