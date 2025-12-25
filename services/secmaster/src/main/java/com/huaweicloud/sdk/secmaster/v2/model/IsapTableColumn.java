package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IsapTableColumn
 */
public class IsapTableColumn {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    /**
     * **参数解释**: 列字段类型 - PHYSICAL 物理字段 - METADATA 元数据字段 - VIRTUAL_METADATA 虚拟元数据字段 - COMPUTED 计算字段  **约束限制** 不涉及  **取值范围**: - PHYSICAL - METADATA - VIRTUAL_METADATA - COMPUTED  **默认值** 不涉及
     */
    public static final class ColumnTypeEnum {

        /**
         * Enum PHYSICAL for value: "PHYSICAL"
         */
        public static final ColumnTypeEnum PHYSICAL = new ColumnTypeEnum("PHYSICAL");

        /**
         * Enum METADATA for value: "METADATA"
         */
        public static final ColumnTypeEnum METADATA = new ColumnTypeEnum("METADATA");

        /**
         * Enum VIRTUAL_METADATA for value: "VIRTUAL_METADATA"
         */
        public static final ColumnTypeEnum VIRTUAL_METADATA = new ColumnTypeEnum("VIRTUAL_METADATA");

        /**
         * Enum COMPUTED for value: "COMPUTED"
         */
        public static final ColumnTypeEnum COMPUTED = new ColumnTypeEnum("COMPUTED");

        private static final Map<String, ColumnTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ColumnTypeEnum> createStaticFields() {
            Map<String, ColumnTypeEnum> map = new HashMap<>();
            map.put("PHYSICAL", PHYSICAL);
            map.put("METADATA", METADATA);
            map.put("VIRTUAL_METADATA", VIRTUAL_METADATA);
            map.put("COMPUTED", COMPUTED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ColumnTypeEnum(String value) {
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
        public static ColumnTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ColumnTypeEnum(value));
        }

        public static ColumnTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ColumnTypeEnum) {
                return this.value.equals(((ColumnTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_type")

    private ColumnTypeEnum columnType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_type_setting")

    private String columnTypeSetting;

    /**
     * **参数解释**: 列字段数据类型 - ROW 行类型 - MAP_STRING 字符串映射类型 - MAP_DECIMAL 小数映射类型 - TINYINT 微整型 - SMALLINT 小整型 - INT 整型 - BIGINT 长整型 - DECIMAL 精确小数类型 - FLOAT 单精度浮点数 - DOUBLE 双精度浮点数 - CHAR 定长字符串 - VARCHAR 不定长字符串 - STRING 字符串类型 - KEYWORD 关键字类型 - BOOLEAN 布尔类型 - DATE 日期类型 - TIME 时间类型 - TIMESTAMP 时间戳类型 - TIMESTAMP_LTZ 本地时间戳类型  **约束限制** 不涉及  **取值范围**: - ROW - MAP_STRING - MAP_DECIMAL - TINYINT - SMALLINT - INT - BIGINT - DECIMAL - FLOAT - DOUBLE - CHAR - VARCHAR - STRING - KEYWORD - BOOLEAN - DATE - TIME - TIMESTAMP - TIMESTAMP_LTZ  **默认值** 不涉及    
     */
    public static final class ColumnDataTypeEnum {

        /**
         * Enum ROW for value: "ROW"
         */
        public static final ColumnDataTypeEnum ROW = new ColumnDataTypeEnum("ROW");

        /**
         * Enum MAP_STRING for value: "MAP_STRING"
         */
        public static final ColumnDataTypeEnum MAP_STRING = new ColumnDataTypeEnum("MAP_STRING");

        /**
         * Enum MAP_DECIMAL for value: "MAP_DECIMAL"
         */
        public static final ColumnDataTypeEnum MAP_DECIMAL = new ColumnDataTypeEnum("MAP_DECIMAL");

        /**
         * Enum TINYINT for value: "TINYINT"
         */
        public static final ColumnDataTypeEnum TINYINT = new ColumnDataTypeEnum("TINYINT");

        /**
         * Enum SMALLINT for value: "SMALLINT"
         */
        public static final ColumnDataTypeEnum SMALLINT = new ColumnDataTypeEnum("SMALLINT");

        /**
         * Enum INT for value: "INT"
         */
        public static final ColumnDataTypeEnum INT = new ColumnDataTypeEnum("INT");

        /**
         * Enum BIGINT for value: "BIGINT"
         */
        public static final ColumnDataTypeEnum BIGINT = new ColumnDataTypeEnum("BIGINT");

        /**
         * Enum DECIMAL for value: "DECIMAL"
         */
        public static final ColumnDataTypeEnum DECIMAL = new ColumnDataTypeEnum("DECIMAL");

        /**
         * Enum FLOAT for value: "FLOAT"
         */
        public static final ColumnDataTypeEnum FLOAT = new ColumnDataTypeEnum("FLOAT");

        /**
         * Enum DOUBLE for value: "DOUBLE"
         */
        public static final ColumnDataTypeEnum DOUBLE = new ColumnDataTypeEnum("DOUBLE");

        /**
         * Enum CHAR for value: "CHAR"
         */
        public static final ColumnDataTypeEnum CHAR = new ColumnDataTypeEnum("CHAR");

        /**
         * Enum VARCHAR for value: "VARCHAR"
         */
        public static final ColumnDataTypeEnum VARCHAR = new ColumnDataTypeEnum("VARCHAR");

        /**
         * Enum STRING for value: "STRING"
         */
        public static final ColumnDataTypeEnum STRING = new ColumnDataTypeEnum("STRING");

        /**
         * Enum KEYWORD for value: "KEYWORD"
         */
        public static final ColumnDataTypeEnum KEYWORD = new ColumnDataTypeEnum("KEYWORD");

        /**
         * Enum BOOLEAN for value: "BOOLEAN"
         */
        public static final ColumnDataTypeEnum BOOLEAN = new ColumnDataTypeEnum("BOOLEAN");

        /**
         * Enum DATE for value: "DATE"
         */
        public static final ColumnDataTypeEnum DATE = new ColumnDataTypeEnum("DATE");

        /**
         * Enum TIME for value: "TIME"
         */
        public static final ColumnDataTypeEnum TIME = new ColumnDataTypeEnum("TIME");

        /**
         * Enum TIMESTAMP for value: "TIMESTAMP"
         */
        public static final ColumnDataTypeEnum TIMESTAMP = new ColumnDataTypeEnum("TIMESTAMP");

        /**
         * Enum TIMESTAMP_LTZ for value: "TIMESTAMP_LTZ"
         */
        public static final ColumnDataTypeEnum TIMESTAMP_LTZ = new ColumnDataTypeEnum("TIMESTAMP_LTZ");

        private static final Map<String, ColumnDataTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ColumnDataTypeEnum> createStaticFields() {
            Map<String, ColumnDataTypeEnum> map = new HashMap<>();
            map.put("ROW", ROW);
            map.put("MAP_STRING", MAP_STRING);
            map.put("MAP_DECIMAL", MAP_DECIMAL);
            map.put("TINYINT", TINYINT);
            map.put("SMALLINT", SMALLINT);
            map.put("INT", INT);
            map.put("BIGINT", BIGINT);
            map.put("DECIMAL", DECIMAL);
            map.put("FLOAT", FLOAT);
            map.put("DOUBLE", DOUBLE);
            map.put("CHAR", CHAR);
            map.put("VARCHAR", VARCHAR);
            map.put("STRING", STRING);
            map.put("KEYWORD", KEYWORD);
            map.put("BOOLEAN", BOOLEAN);
            map.put("DATE", DATE);
            map.put("TIME", TIME);
            map.put("TIMESTAMP", TIMESTAMP);
            map.put("TIMESTAMP_LTZ", TIMESTAMP_LTZ);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ColumnDataTypeEnum(String value) {
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
        public static ColumnDataTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ColumnDataTypeEnum(value));
        }

        public static ColumnDataTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ColumnDataTypeEnum) {
                return this.value.equals(((ColumnDataTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_data_type")

    private ColumnDataTypeEnum columnDataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_data_type_setting")

    private String columnDataTypeSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nullable")

    private Boolean nullable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "array")

    private Boolean array;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depth")

    private Integer depth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_name")

    private String parentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "own_name")

    private String ownName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_display_setting")

    private ColumnDisplaySetting columnDisplaySetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_sequence_number")

    private Integer columnSequenceNumber;

    public IsapTableColumn withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 表格列名称
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public IsapTableColumn withColumnType(ColumnTypeEnum columnType) {
        this.columnType = columnType;
        return this;
    }

    /**
     * **参数解释**: 列字段类型 - PHYSICAL 物理字段 - METADATA 元数据字段 - VIRTUAL_METADATA 虚拟元数据字段 - COMPUTED 计算字段  **约束限制** 不涉及  **取值范围**: - PHYSICAL - METADATA - VIRTUAL_METADATA - COMPUTED  **默认值** 不涉及
     * @return columnType
     */
    public ColumnTypeEnum getColumnType() {
        return columnType;
    }

    public void setColumnType(ColumnTypeEnum columnType) {
        this.columnType = columnType;
    }

    public IsapTableColumn withColumnTypeSetting(String columnTypeSetting) {
        this.columnTypeSetting = columnTypeSetting;
        return this;
    }

    /**
     * 表格列类型设置
     * @return columnTypeSetting
     */
    public String getColumnTypeSetting() {
        return columnTypeSetting;
    }

    public void setColumnTypeSetting(String columnTypeSetting) {
        this.columnTypeSetting = columnTypeSetting;
    }

    public IsapTableColumn withColumnDataType(ColumnDataTypeEnum columnDataType) {
        this.columnDataType = columnDataType;
        return this;
    }

    /**
     * **参数解释**: 列字段数据类型 - ROW 行类型 - MAP_STRING 字符串映射类型 - MAP_DECIMAL 小数映射类型 - TINYINT 微整型 - SMALLINT 小整型 - INT 整型 - BIGINT 长整型 - DECIMAL 精确小数类型 - FLOAT 单精度浮点数 - DOUBLE 双精度浮点数 - CHAR 定长字符串 - VARCHAR 不定长字符串 - STRING 字符串类型 - KEYWORD 关键字类型 - BOOLEAN 布尔类型 - DATE 日期类型 - TIME 时间类型 - TIMESTAMP 时间戳类型 - TIMESTAMP_LTZ 本地时间戳类型  **约束限制** 不涉及  **取值范围**: - ROW - MAP_STRING - MAP_DECIMAL - TINYINT - SMALLINT - INT - BIGINT - DECIMAL - FLOAT - DOUBLE - CHAR - VARCHAR - STRING - KEYWORD - BOOLEAN - DATE - TIME - TIMESTAMP - TIMESTAMP_LTZ  **默认值** 不涉及    
     * @return columnDataType
     */
    public ColumnDataTypeEnum getColumnDataType() {
        return columnDataType;
    }

    public void setColumnDataType(ColumnDataTypeEnum columnDataType) {
        this.columnDataType = columnDataType;
    }

    public IsapTableColumn withColumnDataTypeSetting(String columnDataTypeSetting) {
        this.columnDataTypeSetting = columnDataTypeSetting;
        return this;
    }

    /**
     * 表格列数据类型设置
     * @return columnDataTypeSetting
     */
    public String getColumnDataTypeSetting() {
        return columnDataTypeSetting;
    }

    public void setColumnDataTypeSetting(String columnDataTypeSetting) {
        this.columnDataTypeSetting = columnDataTypeSetting;
    }

    public IsapTableColumn withNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }

    /**
     * 是否为空
     * @return nullable
     */
    public Boolean getNullable() {
        return nullable;
    }

    public void setNullable(Boolean nullable) {
        this.nullable = nullable;
    }

    public IsapTableColumn withArray(Boolean array) {
        this.array = array;
        return this;
    }

    /**
     * 是否为数组
     * @return array
     */
    public Boolean getArray() {
        return array;
    }

    public void setArray(Boolean array) {
        this.array = array;
    }

    public IsapTableColumn withDepth(Integer depth) {
        this.depth = depth;
        return this;
    }

    /**
     * 深度
     * minimum: 0
     * maximum: 4
     * @return depth
     */
    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public IsapTableColumn withParentName(String parentName) {
        this.parentName = parentName;
        return this;
    }

    /**
     * 父级名称
     * @return parentName
     */
    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public IsapTableColumn withOwnName(String ownName) {
        this.ownName = ownName;
        return this;
    }

    /**
     * 所属名称
     * @return ownName
     */
    public String getOwnName() {
        return ownName;
    }

    public void setOwnName(String ownName) {
        this.ownName = ownName;
    }

    public IsapTableColumn withColumnDisplaySetting(ColumnDisplaySetting columnDisplaySetting) {
        this.columnDisplaySetting = columnDisplaySetting;
        return this;
    }

    public IsapTableColumn withColumnDisplaySetting(Consumer<ColumnDisplaySetting> columnDisplaySettingSetter) {
        if (this.columnDisplaySetting == null) {
            this.columnDisplaySetting = new ColumnDisplaySetting();
            columnDisplaySettingSetter.accept(this.columnDisplaySetting);
        }

        return this;
    }

    /**
     * Get columnDisplaySetting
     * @return columnDisplaySetting
     */
    public ColumnDisplaySetting getColumnDisplaySetting() {
        return columnDisplaySetting;
    }

    public void setColumnDisplaySetting(ColumnDisplaySetting columnDisplaySetting) {
        this.columnDisplaySetting = columnDisplaySetting;
    }

    public IsapTableColumn withColumnSequenceNumber(Integer columnSequenceNumber) {
        this.columnSequenceNumber = columnSequenceNumber;
        return this;
    }

    /**
     * 列序号
     * minimum: 0
     * maximum: 100
     * @return columnSequenceNumber
     */
    public Integer getColumnSequenceNumber() {
        return columnSequenceNumber;
    }

    public void setColumnSequenceNumber(Integer columnSequenceNumber) {
        this.columnSequenceNumber = columnSequenceNumber;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IsapTableColumn that = (IsapTableColumn) obj;
        return Objects.equals(this.columnName, that.columnName) && Objects.equals(this.columnType, that.columnType)
            && Objects.equals(this.columnTypeSetting, that.columnTypeSetting)
            && Objects.equals(this.columnDataType, that.columnDataType)
            && Objects.equals(this.columnDataTypeSetting, that.columnDataTypeSetting)
            && Objects.equals(this.nullable, that.nullable) && Objects.equals(this.array, that.array)
            && Objects.equals(this.depth, that.depth) && Objects.equals(this.parentName, that.parentName)
            && Objects.equals(this.ownName, that.ownName)
            && Objects.equals(this.columnDisplaySetting, that.columnDisplaySetting)
            && Objects.equals(this.columnSequenceNumber, that.columnSequenceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName,
            columnType,
            columnTypeSetting,
            columnDataType,
            columnDataTypeSetting,
            nullable,
            array,
            depth,
            parentName,
            ownName,
            columnDisplaySetting,
            columnSequenceNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IsapTableColumn {\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
        sb.append("    columnTypeSetting: ").append(toIndentedString(columnTypeSetting)).append("\n");
        sb.append("    columnDataType: ").append(toIndentedString(columnDataType)).append("\n");
        sb.append("    columnDataTypeSetting: ").append(toIndentedString(columnDataTypeSetting)).append("\n");
        sb.append("    nullable: ").append(toIndentedString(nullable)).append("\n");
        sb.append("    array: ").append(toIndentedString(array)).append("\n");
        sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
        sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
        sb.append("    ownName: ").append(toIndentedString(ownName)).append("\n");
        sb.append("    columnDisplaySetting: ").append(toIndentedString(columnDisplaySetting)).append("\n");
        sb.append("    columnSequenceNumber: ").append(toIndentedString(columnSequenceNumber)).append("\n");
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
