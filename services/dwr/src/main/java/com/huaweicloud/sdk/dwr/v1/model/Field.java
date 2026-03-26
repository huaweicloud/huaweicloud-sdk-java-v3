package com.huaweicloud.sdk.dwr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 给一个collection设置的field字段
 */
public class Field {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_name")

    private String fieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "element_data_type")

    private String elementDataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "element_type_params")

    private Map<String, Object> elementTypeParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_key")

    private Boolean partitionKey;

    public Field withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * **参数解释：** 要在集合中创建的字段名称。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return fieldName
     */
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Field withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * **参数解释：** 字段的数据类型。 **约束限制：** 不涉及。 **取值范围：** “Bool”,“Int8”,“Int16”,“Int32”,“Int64”,“Float”,“String”,“Array”,“JSON”,\"FloatVector\", \"SparseFloatVector\"。 **默认取值:** 不涉及。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Field withElementDataType(String elementDataType) {
        this.elementDataType = elementDataType;
        return this;
    }

    /**
     * **参数解释：** 数组内部的数据类型。 **约束限制：** 在data_type是Array时生效。 **取值范围：** “Bool”,“Int8”,“Int16”,“Int32”,“Int64”,“Float”,“String”。 **默认取值:** 不涉及。
     * @return elementDataType
     */
    public String getElementDataType() {
        return elementDataType;
    }

    public void setElementDataType(String elementDataType) {
        this.elementDataType = elementDataType;
    }

    public Field withElementTypeParams(Map<String, Object> elementTypeParams) {
        this.elementTypeParams = elementTypeParams;
        return this;
    }

    public Field putElementTypeParamsItem(String key, Object elementTypeParamsItem) {
        if (this.elementTypeParams == null) {
            this.elementTypeParams = new HashMap<>();
        }
        this.elementTypeParams.put(key, elementTypeParamsItem);
        return this;
    }

    public Field withElementTypeParams(Consumer<Map<String, Object>> elementTypeParamsSetter) {
        if (this.elementTypeParams == null) {
            this.elementTypeParams = new HashMap<>();
        }
        elementTypeParamsSetter.accept(this.elementTypeParams);
        return this;
    }

    /**
     * **参数解释：** 每个field列的参数。 **约束限制：** 如果field为FloatVector类型向量字段，则必须设定维度参数dim； 如果field为String类型字段或Array 元素类型为String类型，则可设定字段值最大长度max_length； 如果field为Array类型字段，则可设定数组最大容量max_capacity。 **取值范围：** 如果field为FloatVector类型向量字段时，参数dim的有效取值范围是[2-32768]; 如果field为String类型字段或Array 元素类型为String类型, 参数max_length的有效取值范围是[1-65535]; 如果field为Array类型字段，参数max_capacity的有效取值范围是[1-32768] **默认取值:** 如果field为String类型字段或Array 元素类型为String类型, 参数max_length的默认值是256 如果field为Array类型字段，参数max_capacity的默认值是32。
     * @return elementTypeParams
     */
    public Map<String, Object> getElementTypeParams() {
        return elementTypeParams;
    }

    public void setElementTypeParams(Map<String, Object> elementTypeParams) {
        this.elementTypeParams = elementTypeParams;
    }

    public Field withPartitionKey(Boolean partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    /**
     * **参数解释：** 是否将这个filed列设置为分区键。 **约束限制：** 1.只能在数据类型为String与Int64的field列上设置分区键； 2.最多只能设置1个field为分区键。 **取值范围：** true：表示该列将被用作分区键。 false：表示该列不作为分区键。 **默认取值:** false。
     * @return partitionKey
     */
    public Boolean getPartitionKey() {
        return partitionKey;
    }

    public void setPartitionKey(Boolean partitionKey) {
        this.partitionKey = partitionKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Field that = (Field) obj;
        return Objects.equals(this.fieldName, that.fieldName) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.elementDataType, that.elementDataType)
            && Objects.equals(this.elementTypeParams, that.elementTypeParams)
            && Objects.equals(this.partitionKey, that.partitionKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldName, dataType, elementDataType, elementTypeParams, partitionKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Field {\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    elementDataType: ").append(toIndentedString(elementDataType)).append("\n");
        sb.append("    elementTypeParams: ").append(toIndentedString(elementTypeParams)).append("\n");
        sb.append("    partitionKey: ").append(toIndentedString(partitionKey)).append("\n");
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
