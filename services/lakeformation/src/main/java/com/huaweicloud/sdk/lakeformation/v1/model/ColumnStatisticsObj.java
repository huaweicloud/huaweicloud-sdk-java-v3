package com.huaweicloud.sdk.lakeformation.v1.model;

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
 * ColumnStatisticsObj
 */
public class ColumnStatisticsObj {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_type")

    private String columnType;

    /**
     * 统计信息类型
     */
    public static final class DataTypeEnum {

        /**
         * Enum BINARYSTATS for value: "binaryStats"
         */
        public static final DataTypeEnum BINARYSTATS = new DataTypeEnum("binaryStats");

        /**
         * Enum BOOLEANSTATS for value: "booleanStats"
         */
        public static final DataTypeEnum BOOLEANSTATS = new DataTypeEnum("booleanStats");

        /**
         * Enum DATESTATS for value: "dateStats"
         */
        public static final DataTypeEnum DATESTATS = new DataTypeEnum("dateStats");

        /**
         * Enum DECIMALSTATS for value: "decimalStats"
         */
        public static final DataTypeEnum DECIMALSTATS = new DataTypeEnum("decimalStats");

        /**
         * Enum DOUBLESTATS for value: "doubleStats"
         */
        public static final DataTypeEnum DOUBLESTATS = new DataTypeEnum("doubleStats");

        /**
         * Enum LONGSTATS for value: "longStats"
         */
        public static final DataTypeEnum LONGSTATS = new DataTypeEnum("longStats");

        /**
         * Enum STRINGSTATS for value: "stringStats"
         */
        public static final DataTypeEnum STRINGSTATS = new DataTypeEnum("stringStats");

        private static final Map<String, DataTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DataTypeEnum> createStaticFields() {
            Map<String, DataTypeEnum> map = new HashMap<>();
            map.put("binaryStats", BINARYSTATS);
            map.put("booleanStats", BOOLEANSTATS);
            map.put("dateStats", DATESTATS);
            map.put("decimalStats", DECIMALSTATS);
            map.put("doubleStats", DOUBLESTATS);
            map.put("longStats", LONGSTATS);
            map.put("stringStats", STRINGSTATS);
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
    @JsonProperty(value = "binary_statistics_data")

    private BinaryColumnStatisticsData binaryStatisticsData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_statistics_data")

    private LongColumnStatisticsData longStatisticsData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "decimal_statistics_data")

    private DecimalColumnStatisticsData decimalStatisticsData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "string_statistics_data")

    private StringColumnStatisticsData stringStatisticsData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "double_statistics_data")

    private DoubleColumnStatisticsData doubleStatisticsData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_statistics_data")

    private DateColumnStatisticsData dateStatisticsData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "boolean_statistics_data")

    private BooleanColumnStatisticsData booleanStatisticsData;

    public ColumnStatisticsObj withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 数据列名
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public ColumnStatisticsObj withColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }

    /**
     * 数据类型，字段类型包括array bigint binary boolean char date decimal double float int interval map set smallint string struct timestamp tinyint union varchar
     * @return columnType
     */
    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public ColumnStatisticsObj withDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 统计信息类型
     * @return dataType
     */
    public DataTypeEnum getDataType() {
        return dataType;
    }

    public void setDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
    }

    public ColumnStatisticsObj withBinaryStatisticsData(BinaryColumnStatisticsData binaryStatisticsData) {
        this.binaryStatisticsData = binaryStatisticsData;
        return this;
    }

    public ColumnStatisticsObj withBinaryStatisticsData(
        Consumer<BinaryColumnStatisticsData> binaryStatisticsDataSetter) {
        if (this.binaryStatisticsData == null) {
            this.binaryStatisticsData = new BinaryColumnStatisticsData();
            binaryStatisticsDataSetter.accept(this.binaryStatisticsData);
        }

        return this;
    }

    /**
     * Get binaryStatisticsData
     * @return binaryStatisticsData
     */
    public BinaryColumnStatisticsData getBinaryStatisticsData() {
        return binaryStatisticsData;
    }

    public void setBinaryStatisticsData(BinaryColumnStatisticsData binaryStatisticsData) {
        this.binaryStatisticsData = binaryStatisticsData;
    }

    public ColumnStatisticsObj withLongStatisticsData(LongColumnStatisticsData longStatisticsData) {
        this.longStatisticsData = longStatisticsData;
        return this;
    }

    public ColumnStatisticsObj withLongStatisticsData(Consumer<LongColumnStatisticsData> longStatisticsDataSetter) {
        if (this.longStatisticsData == null) {
            this.longStatisticsData = new LongColumnStatisticsData();
            longStatisticsDataSetter.accept(this.longStatisticsData);
        }

        return this;
    }

    /**
     * Get longStatisticsData
     * @return longStatisticsData
     */
    public LongColumnStatisticsData getLongStatisticsData() {
        return longStatisticsData;
    }

    public void setLongStatisticsData(LongColumnStatisticsData longStatisticsData) {
        this.longStatisticsData = longStatisticsData;
    }

    public ColumnStatisticsObj withDecimalStatisticsData(DecimalColumnStatisticsData decimalStatisticsData) {
        this.decimalStatisticsData = decimalStatisticsData;
        return this;
    }

    public ColumnStatisticsObj withDecimalStatisticsData(
        Consumer<DecimalColumnStatisticsData> decimalStatisticsDataSetter) {
        if (this.decimalStatisticsData == null) {
            this.decimalStatisticsData = new DecimalColumnStatisticsData();
            decimalStatisticsDataSetter.accept(this.decimalStatisticsData);
        }

        return this;
    }

    /**
     * Get decimalStatisticsData
     * @return decimalStatisticsData
     */
    public DecimalColumnStatisticsData getDecimalStatisticsData() {
        return decimalStatisticsData;
    }

    public void setDecimalStatisticsData(DecimalColumnStatisticsData decimalStatisticsData) {
        this.decimalStatisticsData = decimalStatisticsData;
    }

    public ColumnStatisticsObj withStringStatisticsData(StringColumnStatisticsData stringStatisticsData) {
        this.stringStatisticsData = stringStatisticsData;
        return this;
    }

    public ColumnStatisticsObj withStringStatisticsData(
        Consumer<StringColumnStatisticsData> stringStatisticsDataSetter) {
        if (this.stringStatisticsData == null) {
            this.stringStatisticsData = new StringColumnStatisticsData();
            stringStatisticsDataSetter.accept(this.stringStatisticsData);
        }

        return this;
    }

    /**
     * Get stringStatisticsData
     * @return stringStatisticsData
     */
    public StringColumnStatisticsData getStringStatisticsData() {
        return stringStatisticsData;
    }

    public void setStringStatisticsData(StringColumnStatisticsData stringStatisticsData) {
        this.stringStatisticsData = stringStatisticsData;
    }

    public ColumnStatisticsObj withDoubleStatisticsData(DoubleColumnStatisticsData doubleStatisticsData) {
        this.doubleStatisticsData = doubleStatisticsData;
        return this;
    }

    public ColumnStatisticsObj withDoubleStatisticsData(
        Consumer<DoubleColumnStatisticsData> doubleStatisticsDataSetter) {
        if (this.doubleStatisticsData == null) {
            this.doubleStatisticsData = new DoubleColumnStatisticsData();
            doubleStatisticsDataSetter.accept(this.doubleStatisticsData);
        }

        return this;
    }

    /**
     * Get doubleStatisticsData
     * @return doubleStatisticsData
     */
    public DoubleColumnStatisticsData getDoubleStatisticsData() {
        return doubleStatisticsData;
    }

    public void setDoubleStatisticsData(DoubleColumnStatisticsData doubleStatisticsData) {
        this.doubleStatisticsData = doubleStatisticsData;
    }

    public ColumnStatisticsObj withDateStatisticsData(DateColumnStatisticsData dateStatisticsData) {
        this.dateStatisticsData = dateStatisticsData;
        return this;
    }

    public ColumnStatisticsObj withDateStatisticsData(Consumer<DateColumnStatisticsData> dateStatisticsDataSetter) {
        if (this.dateStatisticsData == null) {
            this.dateStatisticsData = new DateColumnStatisticsData();
            dateStatisticsDataSetter.accept(this.dateStatisticsData);
        }

        return this;
    }

    /**
     * Get dateStatisticsData
     * @return dateStatisticsData
     */
    public DateColumnStatisticsData getDateStatisticsData() {
        return dateStatisticsData;
    }

    public void setDateStatisticsData(DateColumnStatisticsData dateStatisticsData) {
        this.dateStatisticsData = dateStatisticsData;
    }

    public ColumnStatisticsObj withBooleanStatisticsData(BooleanColumnStatisticsData booleanStatisticsData) {
        this.booleanStatisticsData = booleanStatisticsData;
        return this;
    }

    public ColumnStatisticsObj withBooleanStatisticsData(
        Consumer<BooleanColumnStatisticsData> booleanStatisticsDataSetter) {
        if (this.booleanStatisticsData == null) {
            this.booleanStatisticsData = new BooleanColumnStatisticsData();
            booleanStatisticsDataSetter.accept(this.booleanStatisticsData);
        }

        return this;
    }

    /**
     * Get booleanStatisticsData
     * @return booleanStatisticsData
     */
    public BooleanColumnStatisticsData getBooleanStatisticsData() {
        return booleanStatisticsData;
    }

    public void setBooleanStatisticsData(BooleanColumnStatisticsData booleanStatisticsData) {
        this.booleanStatisticsData = booleanStatisticsData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColumnStatisticsObj that = (ColumnStatisticsObj) obj;
        return Objects.equals(this.columnName, that.columnName) && Objects.equals(this.columnType, that.columnType)
            && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.binaryStatisticsData, that.binaryStatisticsData)
            && Objects.equals(this.longStatisticsData, that.longStatisticsData)
            && Objects.equals(this.decimalStatisticsData, that.decimalStatisticsData)
            && Objects.equals(this.stringStatisticsData, that.stringStatisticsData)
            && Objects.equals(this.doubleStatisticsData, that.doubleStatisticsData)
            && Objects.equals(this.dateStatisticsData, that.dateStatisticsData)
            && Objects.equals(this.booleanStatisticsData, that.booleanStatisticsData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName,
            columnType,
            dataType,
            binaryStatisticsData,
            longStatisticsData,
            decimalStatisticsData,
            stringStatisticsData,
            doubleStatisticsData,
            dateStatisticsData,
            booleanStatisticsData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColumnStatisticsObj {\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    binaryStatisticsData: ").append(toIndentedString(binaryStatisticsData)).append("\n");
        sb.append("    longStatisticsData: ").append(toIndentedString(longStatisticsData)).append("\n");
        sb.append("    decimalStatisticsData: ").append(toIndentedString(decimalStatisticsData)).append("\n");
        sb.append("    stringStatisticsData: ").append(toIndentedString(stringStatisticsData)).append("\n");
        sb.append("    doubleStatisticsData: ").append(toIndentedString(doubleStatisticsData)).append("\n");
        sb.append("    dateStatisticsData: ").append(toIndentedString(dateStatisticsData)).append("\n");
        sb.append("    booleanStatisticsData: ").append(toIndentedString(booleanStatisticsData)).append("\n");
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
