package com.huaweicloud.sdk.dwr.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 给一个collection设置的field字段
 */
public class FieldData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_name")

    private String fieldName;

    /**
     * **参数解释：** 字段的数据类型。 **约束限制：** 不涉及。 **取值范围：** “Bool”,“Int8”,“Int16”,“Int32”,“Int64”,“Float”,“String”,“Array”,“JSON”,\"FloatVector\", \"SparseFloatVector\"。 **默认取值:** 不涉及。
     */
    public static final class DataTypeEnum {

        /**
         * Enum _BOOL_ for value: "“Bool”"
         */
        public static final DataTypeEnum _BOOL_ = new DataTypeEnum("“Bool”");

        /**
         * Enum _INT8_ for value: "“Int8”"
         */
        public static final DataTypeEnum _INT8_ = new DataTypeEnum("“Int8”");

        /**
         * Enum _INT16_ for value: "“Int16”"
         */
        public static final DataTypeEnum _INT16_ = new DataTypeEnum("“Int16”");

        /**
         * Enum _INT32_ for value: "“Int32”"
         */
        public static final DataTypeEnum _INT32_ = new DataTypeEnum("“Int32”");

        /**
         * Enum _INT64_ for value: "“Int64”"
         */
        public static final DataTypeEnum _INT64_ = new DataTypeEnum("“Int64”");

        /**
         * Enum _FLOAT_ for value: "“Float”"
         */
        public static final DataTypeEnum _FLOAT_ = new DataTypeEnum("“Float”");

        /**
         * Enum _STRING_ for value: "“String”"
         */
        public static final DataTypeEnum _STRING_ = new DataTypeEnum("“String”");

        /**
         * Enum _ARRAY_ for value: "\"Array\""
         */
        public static final DataTypeEnum _ARRAY_ = new DataTypeEnum("\"Array\"");

        /**
         * Enum _MAP_ for value: "\"Map\""
         */
        public static final DataTypeEnum _MAP_ = new DataTypeEnum("\"Map\"");

        private static final Map<String, DataTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DataTypeEnum> createStaticFields() {
            Map<String, DataTypeEnum> map = new HashMap<>();
            map.put("“Bool”", _BOOL_);
            map.put("“Int8”", _INT8_);
            map.put("“Int16”", _INT16_);
            map.put("“Int32”", _INT32_);
            map.put("“Int64”", _INT64_);
            map.put("“Float”", _FLOAT_);
            map.put("“String”", _STRING_);
            map.put("\"Array\"", _ARRAY_);
            map.put("\"Map\"", _MAP_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DataTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DataTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DataTypeEnum(value));
        }

        public static DataTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DataTypeEnum) {
                return this.value.equals(((DataTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private DataTypeEnum dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_key")

    private Boolean primaryKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_key")

    private Boolean partitionKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim")

    private String dim;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_length")

    private String maxLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_capacity")

    private String maxCapacity;

    public FieldData withFieldName(String fieldName) {
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

    public FieldData withDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * **参数解释：** 字段的数据类型。 **约束限制：** 不涉及。 **取值范围：** “Bool”,“Int8”,“Int16”,“Int32”,“Int64”,“Float”,“String”,“Array”,“JSON”,\"FloatVector\", \"SparseFloatVector\"。 **默认取值:** 不涉及。
     * @return dataType
     */
    public DataTypeEnum getDataType() {
        return dataType;
    }

    public void setDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
    }

    public FieldData withPrimaryKey(Boolean primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * **参数解释：** 是否是主键字段。 **约束限制：** 不涉及。 **取值范围：** true：表示该列将被用作主键。 false：表示该列不作为主键。 **默认取值:** 不涉及。
     * @return primaryKey
     */
    public Boolean getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(Boolean primaryKey) {
        this.primaryKey = primaryKey;
    }

    public FieldData withPartitionKey(Boolean partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    /**
     * **参数解释：** 是否是partition key。 **约束限制：** 不涉及。 **取值范围：** true：表示该列将被用作分区键。 false：表示该列不作为分区键。 **默认取值:** 不涉及。
     * @return partitionKey
     */
    public Boolean getPartitionKey() {
        return partitionKey;
    }

    public void setPartitionKey(Boolean partitionKey) {
        this.partitionKey = partitionKey;
    }

    public FieldData withDim(String dim) {
        this.dim = dim;
        return this;
    }

    /**
     * **参数解释：** 向量列的维度值。 **约束限制：** field的数据类型是FloatVector, SparseFloatVector时生效。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return dim
     */
    public String getDim() {
        return dim;
    }

    public void setDim(String dim) {
        this.dim = dim;
    }

    public FieldData withMaxLength(String maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * **参数解释：** 字符串列设置的最大长度值。 **约束限制：** field的数据类型是String或者 Array 元素类型为String类型时生效。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return maxLength
     */
    public String getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(String maxLength) {
        this.maxLength = maxLength;
    }

    public FieldData withMaxCapacity(String maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    /**
     * **参数解释：** 数组列设置的最大容量值。 **约束限制：** field的数据类型是 Array 类型时生效。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return maxCapacity
     */
    public String getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(String maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FieldData that = (FieldData) obj;
        return Objects.equals(this.fieldName, that.fieldName) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.primaryKey, that.primaryKey) && Objects.equals(this.partitionKey, that.partitionKey)
            && Objects.equals(this.dim, that.dim) && Objects.equals(this.maxLength, that.maxLength)
            && Objects.equals(this.maxCapacity, that.maxCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldName, dataType, primaryKey, partitionKey, dim, maxLength, maxCapacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FieldData {\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
        sb.append("    partitionKey: ").append(toIndentedString(partitionKey)).append("\n");
        sb.append("    dim: ").append(toIndentedString(dim)).append("\n");
        sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
        sb.append("    maxCapacity: ").append(toIndentedString(maxCapacity)).append("\n");
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
