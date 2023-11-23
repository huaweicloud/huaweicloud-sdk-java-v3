package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询同步任务统计结果
 */
public class StatisticTypeData {

    /**
     * 统计数据类型： REQUEST：请求对象数 SUCCESS：成功对象数 FAILURE：失败对象数 SKIP：跳过对象数 SIZE：对象容量(Byte)
     */
    public static final class DataTypeEnum {

        /**
         * Enum REQUEST for value: "REQUEST"
         */
        public static final DataTypeEnum REQUEST = new DataTypeEnum("REQUEST");

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final DataTypeEnum SUCCESS = new DataTypeEnum("SUCCESS");

        /**
         * Enum FAILURE for value: "FAILURE"
         */
        public static final DataTypeEnum FAILURE = new DataTypeEnum("FAILURE");

        /**
         * Enum SKIP for value: "SKIP"
         */
        public static final DataTypeEnum SKIP = new DataTypeEnum("SKIP");

        /**
         * Enum SIZE for value: "SIZE"
         */
        public static final DataTypeEnum SIZE = new DataTypeEnum("SIZE");

        private static final Map<String, DataTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DataTypeEnum> createStaticFields() {
            Map<String, DataTypeEnum> map = new HashMap<>();
            map.put("REQUEST", REQUEST);
            map.put("SUCCESS", SUCCESS);
            map.put("FAILURE", FAILURE);
            map.put("SKIP", SKIP);
            map.put("SIZE", SIZE);
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
    @JsonProperty(value = "data")

    private List<StatisticData> data = null;

    public StatisticTypeData withDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 统计数据类型： REQUEST：请求对象数 SUCCESS：成功对象数 FAILURE：失败对象数 SKIP：跳过对象数 SIZE：对象容量(Byte)
     * @return dataType
     */
    public DataTypeEnum getDataType() {
        return dataType;
    }

    public void setDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
    }

    public StatisticTypeData withData(List<StatisticData> data) {
        this.data = data;
        return this;
    }

    public StatisticTypeData addDataItem(StatisticData dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public StatisticTypeData withData(Consumer<List<StatisticData>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 查询的同步任务统计结果集
     * @return data
     */
    public List<StatisticData> getData() {
        return data;
    }

    public void setData(List<StatisticData> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatisticTypeData that = (StatisticTypeData) obj;
        return Objects.equals(this.dataType, that.dataType) && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataType, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticTypeData {\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
