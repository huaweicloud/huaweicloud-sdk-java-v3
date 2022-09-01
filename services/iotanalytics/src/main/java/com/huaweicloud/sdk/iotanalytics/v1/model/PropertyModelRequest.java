package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PropertyModelRequest
 */
public class PropertyModelRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    @JacksonXmlProperty(localName = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    @JacksonXmlProperty(localName = "source_type")

    private String sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_schema")

    @JacksonXmlProperty(localName = "data_schema")

    private DataSchema dataSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    @JacksonXmlProperty(localName = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    @JacksonXmlProperty(localName = "value")

    private Object value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_tag")

    @JacksonXmlProperty(localName = "is_tag")

    private Boolean isTag;

    public PropertyModelRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 属性名称，正则：\"^[a-zA-Z0-9_]{1,64}$\"
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PropertyModelRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 属性显示名称，正则：\"^[\\\\u4E00-\\\\u9FA5A-Za-z0-9_@#.-]{1,64}$\"
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public PropertyModelRequest withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 属性类别，静态配置（static）、测量数据（measurement）、分析任务（analysis）
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public PropertyModelRequest withDataSchema(DataSchema dataSchema) {
        this.dataSchema = dataSchema;
        return this;
    }

    public PropertyModelRequest withDataSchema(Consumer<DataSchema> dataSchemaSetter) {
        if (this.dataSchema == null) {
            this.dataSchema = new DataSchema();
            dataSchemaSetter.accept(this.dataSchema);
        }

        return this;
    }

    /**
     * Get dataSchema
     * @return dataSchema
     */
    public DataSchema getDataSchema() {
        return dataSchema;
    }

    public void setDataSchema(DataSchema dataSchema) {
        this.dataSchema = dataSchema;
    }

    public PropertyModelRequest withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 单位
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public PropertyModelRequest withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * 静态属性的值，如：1 1.1 \"value\" {\"name\":\"value\"}
     * @return value
     */
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public PropertyModelRequest withIsTag(Boolean isTag) {
        this.isTag = isTag;
        return this;
    }

    /**
     * 属性是否为标签。资产ID、标签属性、时间戳三者组成属性数据唯一键，两条唯一键相同的属性数据以覆盖方式存储；一个模型中只能配置三个属性为标签，标签配置后标签不能删除，配置标签的属性也不能删除；只有integer、double、string类型的属性可以被配置为标签。示例： 资产ID asset1上依次上报如下六组数据： 资产ID 属性A（标签） 属性B    属性C 时间戳 asset1 valueA_1     valueB_1  valueC_1 T1 asset1 valueA_1     valueB_2  valueC_2 T2 asset1 valueA_2     valueB_3  valueC_3 T2 asset1 valueA_2     valueB_4  valueC_4 T2 asset1              valueB_5  valueC_5 T3 asset1              valueB_6  valueC_6 T3 根据唯一键规则最终存储为如下四组数据： 资产ID 属性A（标签） 属性B    属性C 时间戳 asset1 valueA_1     valueB_1  valueC_1 T1 asset1 valueA_1     valueB_2  valueC_2 T2 asset1 valueA_2     valueB_4  valueC_4 T2 asset1              valueB_6  valueC_6 T3
     * @return isTag
     */
    public Boolean getIsTag() {
        return isTag;
    }

    public void setIsTag(Boolean isTag) {
        this.isTag = isTag;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PropertyModelRequest propertyModelRequest = (PropertyModelRequest) o;
        return Objects.equals(this.name, propertyModelRequest.name)
            && Objects.equals(this.displayName, propertyModelRequest.displayName)
            && Objects.equals(this.sourceType, propertyModelRequest.sourceType)
            && Objects.equals(this.dataSchema, propertyModelRequest.dataSchema)
            && Objects.equals(this.unit, propertyModelRequest.unit)
            && Objects.equals(this.value, propertyModelRequest.value)
            && Objects.equals(this.isTag, propertyModelRequest.isTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, displayName, sourceType, dataSchema, unit, value, isTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PropertyModelRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    dataSchema: ").append(toIndentedString(dataSchema)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    isTag: ").append(toIndentedString(isTag)).append("\n");
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
