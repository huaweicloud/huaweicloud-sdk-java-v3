package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CreateExportTaskReq
 */
public class CreateExportTaskReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_at")

    private Long startAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at")

    private Long endAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    /**
     * 排序字段。 - collectTime 收集时间 - occurrenceTime 发生时间 - lastSec 事务持续时间 - waitLockStructCount 持有锁数量 - holdLockStructCount 等待锁数量
     */
    public static final class OrderEnum {

        /**
         * Enum COLLECTTIME for value: "collectTime"
         */
        public static final OrderEnum COLLECTTIME = new OrderEnum("collectTime");

        /**
         * Enum OCCURRENCETIME for value: "occurrenceTime"
         */
        public static final OrderEnum OCCURRENCETIME = new OrderEnum("occurrenceTime");

        /**
         * Enum LASTSEC for value: "lastSec"
         */
        public static final OrderEnum LASTSEC = new OrderEnum("lastSec");

        /**
         * Enum WAITLOCKSTRUCTCOUNT for value: "waitLockStructCount"
         */
        public static final OrderEnum WAITLOCKSTRUCTCOUNT = new OrderEnum("waitLockStructCount");

        /**
         * Enum HOLDLOCKSTRUCTCOUNT for value: "holdLockStructCount"
         */
        public static final OrderEnum HOLDLOCKSTRUCTCOUNT = new OrderEnum("holdLockStructCount");

        private static final Map<String, OrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderEnum> createStaticFields() {
            Map<String, OrderEnum> map = new HashMap<>();
            map.put("collectTime", COLLECTTIME);
            map.put("occurrenceTime", OCCURRENCETIME);
            map.put("lastSec", LASTSEC);
            map.put("waitLockStructCount", WAITLOCKSTRUCTCOUNT);
            map.put("holdLockStructCount", HOLDLOCKSTRUCTCOUNT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderEnum(String value) {
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
        public static OrderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrderEnum(value));
        }

        public static OrderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderEnum) {
                return this.value.equals(((OrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private OrderEnum order;

    /**
     * 排序规则。 - asc 升序 - desc 降序
     */
    public static final class OrderByEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final OrderByEnum ASC = new OrderByEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final OrderByEnum DESC = new OrderByEnum("desc");

        private static final Map<String, OrderByEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderByEnum> createStaticFields() {
            Map<String, OrderByEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderByEnum(String value) {
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
        public static OrderByEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrderByEnum(value));
        }

        public static OrderByEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderByEnum) {
                return this.value.equals(((OrderByEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private OrderByEnum orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_sec_min")

    private Long lastSecMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_sec_max")

    private Long lastSecMax;

    public CreateExportTaskReq withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * OBS桶名
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public CreateExportTaskReq withStartAt(Long startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * 开始时间(Unix timestamp),单位:毫秒。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startAt
     */
    public Long getStartAt() {
        return startAt;
    }

    public void setStartAt(Long startAt) {
        this.startAt = startAt;
    }

    public CreateExportTaskReq withEndAt(Long endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * 结束时间(Unix timestamp),单位:毫秒。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return endAt
     */
    public Long getEndAt() {
        return endAt;
    }

    public void setEndAt(Long endAt) {
        this.endAt = endAt;
    }

    public CreateExportTaskReq withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * OBS文件目录
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public CreateExportTaskReq withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public CreateExportTaskReq withOrder(OrderEnum order) {
        this.order = order;
        return this;
    }

    /**
     * 排序字段。 - collectTime 收集时间 - occurrenceTime 发生时间 - lastSec 事务持续时间 - waitLockStructCount 持有锁数量 - holdLockStructCount 等待锁数量
     * @return order
     */
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    public CreateExportTaskReq withOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 排序规则。 - asc 升序 - desc 降序
     * @return orderBy
     */
    public OrderByEnum getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
    }

    public CreateExportTaskReq withLastSecMin(Long lastSecMin) {
        this.lastSecMin = lastSecMin;
        return this;
    }

    /**
     * 持续时间下限
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lastSecMin
     */
    public Long getLastSecMin() {
        return lastSecMin;
    }

    public void setLastSecMin(Long lastSecMin) {
        this.lastSecMin = lastSecMin;
    }

    public CreateExportTaskReq withLastSecMax(Long lastSecMax) {
        this.lastSecMax = lastSecMax;
        return this;
    }

    /**
     * 持续时间上限
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lastSecMax
     */
    public Long getLastSecMax() {
        return lastSecMax;
    }

    public void setLastSecMax(Long lastSecMax) {
        this.lastSecMax = lastSecMax;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateExportTaskReq that = (CreateExportTaskReq) obj;
        return Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.startAt, that.startAt)
            && Objects.equals(this.endAt, that.endAt) && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.timeZone, that.timeZone) && Objects.equals(this.order, that.order)
            && Objects.equals(this.orderBy, that.orderBy) && Objects.equals(this.lastSecMin, that.lastSecMin)
            && Objects.equals(this.lastSecMax, that.lastSecMax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName, startAt, endAt, filePath, timeZone, order, orderBy, lastSecMin, lastSecMax);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateExportTaskReq {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    lastSecMin: ").append(toIndentedString(lastSecMin)).append("\n");
        sb.append("    lastSecMax: ").append(toIndentedString(lastSecMax)).append("\n");
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
