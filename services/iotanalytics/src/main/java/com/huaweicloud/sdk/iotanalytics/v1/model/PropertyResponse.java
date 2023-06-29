package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PropertyResponse
 */
public class PropertyResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_id")

    private String propertyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private String sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_schema")

    private DataSchema dataSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Object value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_tag")

    private Boolean isTag;

    public PropertyResponse withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 设备ID
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public PropertyResponse withPropertyId(String propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    /**
     * 属性ID
     * @return propertyId
     */
    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public PropertyResponse withName(String name) {
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

    public PropertyResponse withDisplayName(String displayName) {
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

    public PropertyResponse withSourceType(String sourceType) {
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

    public PropertyResponse withDataSchema(DataSchema dataSchema) {
        this.dataSchema = dataSchema;
        return this;
    }

    public PropertyResponse withDataSchema(Consumer<DataSchema> dataSchemaSetter) {
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

    public PropertyResponse withUnit(String unit) {
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

    public PropertyResponse withValue(Object value) {
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

    public PropertyResponse withIsTag(Boolean isTag) {
        this.isTag = isTag;
        return this;
    }

    /**
     * 属性是否为标签。资产ID、标签属性、时间戳三者组成属性数据唯一键，两条唯一键相同性数据以覆盖方式存储；一个模型中只能配置三个属性为标签，标签配置后标签不能删除，配置标签性也不能删除；只有integer、double、string类型的属性可以被配置为标签。示例： 资产ID asset1上依次上报如下六组数据： 资产ID 属性A（标签） 属性B    属性C 时间戳 asset1 valueA_1     valueB_1  valueC_1 T1 asset1 valueA_1     valueB_2  valueC_2 T2 asset1 valueA_2     valueB_3  valueC_3 T2 asset1 valueA_2     valueB_4  valueC_4 T2 asset1              valueB_5  valueC_5 T3 asset1              valueB_6  valueC_6 T3 根据唯一键规则最终存储为如下四组数据： 资产ID 属性A（标签） 属性B    属性C 时间戳 asset1 valueA_1     valueB_1  valueC_1 T1 asset1 valueA_1     valueB_2  valueC_2 T2 asset1 valueA_2     valueB_4  valueC_4 T2 asset1              valueB_6  valueC_6 T3
     * @return isTag
     */
    public Boolean getIsTag() {
        return isTag;
    }

    public void setIsTag(Boolean isTag) {
        this.isTag = isTag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PropertyResponse that = (PropertyResponse) obj;
        return Objects.equals(this.deviceId, that.deviceId) && Objects.equals(this.propertyId, that.propertyId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.sourceType, that.sourceType) && Objects.equals(this.dataSchema, that.dataSchema)
            && Objects.equals(this.unit, that.unit) && Objects.equals(this.value, that.value)
            && Objects.equals(this.isTag, that.isTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, propertyId, name, displayName, sourceType, dataSchema, unit, value, isTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PropertyResponse {\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
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
