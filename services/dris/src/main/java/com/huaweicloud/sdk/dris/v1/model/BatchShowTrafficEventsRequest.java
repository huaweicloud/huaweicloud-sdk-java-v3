package com.huaweicloud.sdk.dris.v1.model;

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
 * Request Object
 */
public class BatchShowTrafficEventsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Instance-Id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_code")

    private Integer areaCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private Integer eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_source_type")

    private List<String> eventSourceType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_class")

    private String eventClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    private String eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_time")

    private String fromTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_time")

    private String toTime;

    /**
     * **参数说明**：按照哪一个字段排序,默认按事件开始时间。
     */
    public static final class SortKeyEnum {

        /**
         * Enum START_TIME for value: "start_time"
         */
        public static final SortKeyEnum START_TIME = new SortKeyEnum("start_time");

        /**
         * Enum END_TIME for value: "end_time"
         */
        public static final SortKeyEnum END_TIME = new SortKeyEnum("end_time");

        /**
         * Enum CREATED_TIME for value: "created_time"
         */
        public static final SortKeyEnum CREATED_TIME = new SortKeyEnum("created_time");

        /**
         * Enum LAST_MODIFIED_TIME for value: "last_modified_time"
         */
        public static final SortKeyEnum LAST_MODIFIED_TIME = new SortKeyEnum("last_modified_time");

        private static final Map<String, SortKeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortKeyEnum> createStaticFields() {
            Map<String, SortKeyEnum> map = new HashMap<>();
            map.put("start_time", START_TIME);
            map.put("end_time", END_TIME);
            map.put("created_time", CREATED_TIME);
            map.put("last_modified_time", LAST_MODIFIED_TIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortKeyEnum(String value) {
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
        public static SortKeyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SortKeyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortKeyEnum(value);
            }
            return result;
        }

        public static SortKeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SortKeyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortKeyEnum) {
                return this.value.equals(((SortKeyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private SortKeyEnum sortKey;

    /**
     * **参数说明**：升序或降序，升序为ASC, 降序为DESC，默认降序。
     */
    public static final class SortDirEnum {

        /**
         * Enum ASC for value: "ASC"
         */
        public static final SortDirEnum ASC = new SortDirEnum("ASC");

        /**
         * Enum DESC for value: "DESC"
         */
        public static final SortDirEnum DESC = new SortDirEnum("DESC");

        private static final Map<String, SortDirEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortDirEnum> createStaticFields() {
            Map<String, SortDirEnum> map = new HashMap<>();
            map.put("ASC", ASC);
            map.put("DESC", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortDirEnum(String value) {
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
        public static SortDirEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortDirEnum(value);
            }
            return result;
        }

        public static SortDirEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortDirEnum) {
                return this.value.equals(((SortDirEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private SortDirEnum sortDir;

    public BatchShowTrafficEventsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * \"**参数说明**：实例ID。dris物理实例的唯一标识。获取方法参见[获取Instance-Id](https://support.huaweicloud.com/api-v2x/v2x_04_0030.html)。  **取值范围**：仅支持数字，小写字母和横杠（-）的组合，长度36。\"
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public BatchShowTrafficEventsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数说明**：查询事件列表的页码。
     * minimum: 0
     * maximum: 100
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public BatchShowTrafficEventsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数说明**：查询时每页显示的记录数。
     * minimum: 1
     * maximum: 20
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public BatchShowTrafficEventsRequest withAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    /**
     * **参数说明**：区域码，参考[区域码查询](http://xzqh.mca.gov.cn/map)。
     * minimum: 0
     * maximum: 999999
     * @return areaCode
     */
    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public BatchShowTrafficEventsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     *  **参数说明**：事件状态。  **取值范围**：  - Invalid：为过期事件，事件结束时间（end_time）在当前时间之前。  - Active：为活动事件，事件开始时间（start_time）在当前时间之前，并且事件结束时间（end_time）在当前时间之后。  - Future：为未来事件，事件开始时间（start_time）在当前时间之前。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BatchShowTrafficEventsRequest withEventType(Integer eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * **参数说明**：事件类型，参照附录[《国标交通事件及标志列表》](https://support.huaweicloud.com/api-v2x/v2x_04_0101.html)文件。当填写event_type时，event_class为必选。
     * minimum: 0
     * maximum: 1000
     * @return eventType
     */
    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public BatchShowTrafficEventsRequest withEventSourceType(List<String> eventSourceType) {
        this.eventSourceType = eventSourceType;
        return this;
    }

    public BatchShowTrafficEventsRequest addEventSourceTypeItem(String eventSourceTypeItem) {
        if (this.eventSourceType == null) {
            this.eventSourceType = new ArrayList<>();
        }
        this.eventSourceType.add(eventSourceTypeItem);
        return this;
    }

    public BatchShowTrafficEventsRequest withEventSourceType(Consumer<List<String>> eventSourceTypeSetter) {
        if (this.eventSourceType == null) {
            this.eventSourceType = new ArrayList<>();
        }
        eventSourceTypeSetter.accept(this.eventSourceType);
        return this;
    }

    /**
     *  **参数说明**：事件来源类型列表,支持事件来源。  **取值范围**：  - unknown：未知数据  - police：警方数据  - government：政府数据  - meteorological：气象数据  - internet：互联网数据  - detection：检测器检测到的数据  - v2xServer：平台上报数据  - rsu：RSU上报数据  - obu：车载终端上报数据 
     * @return eventSourceType
     */
    public List<String> getEventSourceType() {
        return eventSourceType;
    }

    public void setEventSourceType(List<String> eventSourceType) {
        this.eventSourceType = eventSourceType;
    }

    public BatchShowTrafficEventsRequest withEventClass(String eventClass) {
        this.eventClass = eventClass;
        return this;
    }

    /**
     * **参数说明**：事件类型，参照附录[《国标交通事件及标志列表》](https://support.huaweicloud.com/api-v2x/v2x_04_0101.html)文件。当填写event_type时，event_class为必选。
     * @return eventClass
     */
    public String getEventClass() {
        return eventClass;
    }

    public void setEventClass(String eventClass) {
        this.eventClass = eventClass;
    }

    public BatchShowTrafficEventsRequest withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * **参数说明**：事件ID，创建事件后获得。方法参见 [新增交通事件](https://support.huaweicloud.com/api-v2x/v2x_04_0048.html)。
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public BatchShowTrafficEventsRequest withFromTime(String fromTime) {
        this.fromTime = fromTime;
        return this;
    }

    /**
     * **参数说明**：查询事件开始时间段的起始时间。  格式：yyyy-MM-dd'T'HH:mm:ss'Z'。  例如 2020-09-01T01:37:01Z。 
     * @return fromTime
     */
    public String getFromTime() {
        return fromTime;
    }

    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    public BatchShowTrafficEventsRequest withToTime(String toTime) {
        this.toTime = toTime;
        return this;
    }

    /**
     * **参数说明**：查询事件开始时间段的结束时间。  格式：yyyy-MM-dd'T'HH:mm:ss'Z'。  例如 2020-09-01T01:37:01Z。 
     * @return toTime
     */
    public String getToTime() {
        return toTime;
    }

    public void setToTime(String toTime) {
        this.toTime = toTime;
    }

    public BatchShowTrafficEventsRequest withSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * **参数说明**：按照哪一个字段排序,默认按事件开始时间。
     * @return sortKey
     */
    public SortKeyEnum getSortKey() {
        return sortKey;
    }

    public void setSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
    }

    public BatchShowTrafficEventsRequest withSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * **参数说明**：升序或降序，升序为ASC, 降序为DESC，默认降序。
     * @return sortDir
     */
    public SortDirEnum getSortDir() {
        return sortDir;
    }

    public void setSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchShowTrafficEventsRequest batchShowTrafficEventsRequest = (BatchShowTrafficEventsRequest) o;
        return Objects.equals(this.instanceId, batchShowTrafficEventsRequest.instanceId)
            && Objects.equals(this.offset, batchShowTrafficEventsRequest.offset)
            && Objects.equals(this.limit, batchShowTrafficEventsRequest.limit)
            && Objects.equals(this.areaCode, batchShowTrafficEventsRequest.areaCode)
            && Objects.equals(this.status, batchShowTrafficEventsRequest.status)
            && Objects.equals(this.eventType, batchShowTrafficEventsRequest.eventType)
            && Objects.equals(this.eventSourceType, batchShowTrafficEventsRequest.eventSourceType)
            && Objects.equals(this.eventClass, batchShowTrafficEventsRequest.eventClass)
            && Objects.equals(this.eventId, batchShowTrafficEventsRequest.eventId)
            && Objects.equals(this.fromTime, batchShowTrafficEventsRequest.fromTime)
            && Objects.equals(this.toTime, batchShowTrafficEventsRequest.toTime)
            && Objects.equals(this.sortKey, batchShowTrafficEventsRequest.sortKey)
            && Objects.equals(this.sortDir, batchShowTrafficEventsRequest.sortDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            offset,
            limit,
            areaCode,
            status,
            eventType,
            eventSourceType,
            eventClass,
            eventId,
            fromTime,
            toTime,
            sortKey,
            sortDir);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchShowTrafficEventsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    eventSourceType: ").append(toIndentedString(eventSourceType)).append("\n");
        sb.append("    eventClass: ").append(toIndentedString(eventClass)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
        sb.append("    toTime: ").append(toIndentedString(toTime)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
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
