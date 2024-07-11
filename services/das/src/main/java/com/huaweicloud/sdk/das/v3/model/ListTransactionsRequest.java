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
 * Request Object
 */
public class ListTransactionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * 数据库类型。仅支持MySQL
     */
    public static final class DatastoreTypeEnum {

        /**
         * Enum MYSQL for value: "MySQL"
         */
        public static final DatastoreTypeEnum MYSQL = new DatastoreTypeEnum("MySQL");

        private static final Map<String, DatastoreTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatastoreTypeEnum> createStaticFields() {
            Map<String, DatastoreTypeEnum> map = new HashMap<>();
            map.put("MySQL", MYSQL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DatastoreTypeEnum(String value) {
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
        public static DatastoreTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DatastoreTypeEnum(value));
        }

        public static DatastoreTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DatastoreTypeEnum) {
                return this.value.equals(((DatastoreTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private DatastoreTypeEnum datastoreType;

    /**
     * 语言
     */
    public static final class XLanguageEnum {

        /**
         * Enum ZH_CN for value: "zh-cn"
         */
        public static final XLanguageEnum ZH_CN = new XLanguageEnum("zh-cn");

        /**
         * Enum EN_US for value: "en-us"
         */
        public static final XLanguageEnum EN_US = new XLanguageEnum("en-us");

        private static final Map<String, XLanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XLanguageEnum> createStaticFields() {
            Map<String, XLanguageEnum> map = new HashMap<>();
            map.put("zh-cn", ZH_CN);
            map.put("en-us", EN_US);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XLanguageEnum(String value) {
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
        public static XLanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new XLanguageEnum(value));
        }

        public static XLanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XLanguageEnum) {
                return this.value.equals(((XLanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private XLanguageEnum xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_at")

    private Long startAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at")

    private Long endAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_num")

    private Integer pageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    /**
     * 排序字段
     */
    public static final class OrderEnum {

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

        /**
         * Enum COLLECTTIME for value: "collectTime"
         */
        public static final OrderEnum COLLECTTIME = new OrderEnum("collectTime");

        private static final Map<String, OrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderEnum> createStaticFields() {
            Map<String, OrderEnum> map = new HashMap<>();
            map.put("occurrenceTime", OCCURRENCETIME);
            map.put("lastSec", LASTSEC);
            map.put("waitLockStructCount", WAITLOCKSTRUCTCOUNT);
            map.put("holdLockStructCount", HOLDLOCKSTRUCTCOUNT);
            map.put("collectTime", COLLECTTIME);
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
     * 升序|降序
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

    public ListTransactionsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListTransactionsRequest withDatastoreType(DatastoreTypeEnum datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * 数据库类型。仅支持MySQL
     * @return datastoreType
     */
    public DatastoreTypeEnum getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(DatastoreTypeEnum datastoreType) {
        this.datastoreType = datastoreType;
    }

    public ListTransactionsRequest withXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public XLanguageEnum getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListTransactionsRequest withStartAt(Long startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * 采集开始时间（Unix timestamp），单位：毫秒。
     * @return startAt
     */
    public Long getStartAt() {
        return startAt;
    }

    public void setStartAt(Long startAt) {
        this.startAt = startAt;
    }

    public ListTransactionsRequest withEndAt(Long endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * 采集结束时间（Unix timestamp），单位：毫秒。
     * @return endAt
     */
    public Long getEndAt() {
        return endAt;
    }

    public void setEndAt(Long endAt) {
        this.endAt = endAt;
    }

    public ListTransactionsRequest withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * 页数
     * @return pageNum
     */
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public ListTransactionsRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 页大小
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListTransactionsRequest withOrder(OrderEnum order) {
        this.order = order;
        return this;
    }

    /**
     * 排序字段
     * @return order
     */
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    public ListTransactionsRequest withOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 升序|降序
     * @return orderBy
     */
    public OrderByEnum getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
    }

    public ListTransactionsRequest withLastSecMin(Long lastSecMin) {
        this.lastSecMin = lastSecMin;
        return this;
    }

    /**
     * 持续时间下限
     * @return lastSecMin
     */
    public Long getLastSecMin() {
        return lastSecMin;
    }

    public void setLastSecMin(Long lastSecMin) {
        this.lastSecMin = lastSecMin;
    }

    public ListTransactionsRequest withLastSecMax(Long lastSecMax) {
        this.lastSecMax = lastSecMax;
        return this;
    }

    /**
     * 持续时间上限
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
        ListTransactionsRequest that = (ListTransactionsRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.datastoreType, that.datastoreType) && Objects.equals(this.xLanguage, that.xLanguage)
            && Objects.equals(this.startAt, that.startAt) && Objects.equals(this.endAt, that.endAt)
            && Objects.equals(this.pageNum, that.pageNum) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.order, that.order) && Objects.equals(this.orderBy, that.orderBy)
            && Objects.equals(this.lastSecMin, that.lastSecMin) && Objects.equals(this.lastSecMax, that.lastSecMax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            datastoreType,
            xLanguage,
            startAt,
            endAt,
            pageNum,
            pageSize,
            order,
            orderBy,
            lastSecMin,
            lastSecMax);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTransactionsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
