package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListSyncTaskStatisticRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_task_id")

    private String syncTaskId;

    /**
     * 统计数据类型： 多类型查询用‘,’分隔； REQUEST：接收同步请求对象数 SUCCESS：同步成功对象数 FAILURE：同步失败对象数 SKIP：同步跳过对象数 SIZE：同步成功对象容量(Byte)
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
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ListSyncTaskStatisticRequest withSyncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
        return this;
    }

    /**
     * 同步任务ID。
     * @return syncTaskId
     */
    public String getSyncTaskId() {
        return syncTaskId;
    }

    public void setSyncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
    }

    public ListSyncTaskStatisticRequest withDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 统计数据类型： 多类型查询用‘,’分隔； REQUEST：接收同步请求对象数 SUCCESS：同步成功对象数 FAILURE：同步失败对象数 SKIP：同步跳过对象数 SIZE：同步成功对象容量(Byte)
     * @return dataType
     */
    public DataTypeEnum getDataType() {
        return dataType;
    }

    public void setDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
    }

    public ListSyncTaskStatisticRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListSyncTaskStatisticRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSyncTaskStatisticRequest that = (ListSyncTaskStatisticRequest) obj;
        return Objects.equals(this.syncTaskId, that.syncTaskId) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(syncTaskId, dataType, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSyncTaskStatisticRequest {\n");
        sb.append("    syncTaskId: ").append(toIndentedString(syncTaskId)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
