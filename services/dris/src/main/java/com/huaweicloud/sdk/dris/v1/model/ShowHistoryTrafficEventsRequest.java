package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowHistoryTrafficEventsRequest {

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
    @JsonProperty(value = "from_date")

    private Long fromDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_date")

    private Long toDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    private String eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_class")

    private String eventClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_source")

    private String eventSource;

    public ShowHistoryTrafficEventsRequest withInstanceId(String instanceId) {
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

    public ShowHistoryTrafficEventsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数说明**：分页查询时的页码。
     * minimum: 0
     * maximum: 199
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowHistoryTrafficEventsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数说明**：分页查询时每页显示的记录数。
     * minimum: 1
     * maximum: 50
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowHistoryTrafficEventsRequest withFromDate(Long fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * **参数说明**：查询此时间后达到平台的消息，十位Unix时间戳，秒级，例如：1575446506。
     * @return fromDate
     */
    public Long getFromDate() {
        return fromDate;
    }

    public void setFromDate(Long fromDate) {
        this.fromDate = fromDate;
    }

    public ShowHistoryTrafficEventsRequest withToDate(Long toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * **参数说明**：查询此时间前达到平台的消息，十位Unix时间戳，秒级，例如：1576396905。
     * @return toDate
     */
    public Long getToDate() {
        return toDate;
    }

    public void setToDate(Long toDate) {
        this.toDate = toDate;
    }

    public ShowHistoryTrafficEventsRequest withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * **参数说明**：事件id
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public ShowHistoryTrafficEventsRequest withEventClass(String eventClass) {
        this.eventClass = eventClass;
        return this;
    }

    /**
     * **参数说明**：事件的分类，event_type存在时，event_class必选。  **取值范围**：  - AbnormalTraffic：异常路况  - AbnormalVehicle：异常车况  - AdverseWeather：恶劣天气  - TrafficSign：标志标牌 
     * @return eventClass
     */
    public String getEventClass() {
        return eventClass;
    }

    public void setEventClass(String eventClass) {
        this.eventClass = eventClass;
    }

    public ShowHistoryTrafficEventsRequest withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * **参数说明**：事件类型，参照附录[《国标交通事件及标志列表》](https://support.huaweicloud.com/api-v2x/v2x_04_0101.html)文件。
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public ShowHistoryTrafficEventsRequest withEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }

    /**
     * **参数说明**：事件来源，默认值v2xServer。  **取值范围**：  - v2xServer：来源为通过Console下发的事件  - detection：来源为边缘edge上报的RSI  - rsu：来源为通过MQTT接入的RSU上报的RSI 
     * @return eventSource
     */
    public String getEventSource() {
        return eventSource;
    }

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowHistoryTrafficEventsRequest showHistoryTrafficEventsRequest = (ShowHistoryTrafficEventsRequest) o;
        return Objects.equals(this.instanceId, showHistoryTrafficEventsRequest.instanceId)
            && Objects.equals(this.offset, showHistoryTrafficEventsRequest.offset)
            && Objects.equals(this.limit, showHistoryTrafficEventsRequest.limit)
            && Objects.equals(this.fromDate, showHistoryTrafficEventsRequest.fromDate)
            && Objects.equals(this.toDate, showHistoryTrafficEventsRequest.toDate)
            && Objects.equals(this.eventId, showHistoryTrafficEventsRequest.eventId)
            && Objects.equals(this.eventClass, showHistoryTrafficEventsRequest.eventClass)
            && Objects.equals(this.eventType, showHistoryTrafficEventsRequest.eventType)
            && Objects.equals(this.eventSource, showHistoryTrafficEventsRequest.eventSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, offset, limit, fromDate, toDate, eventId, eventClass, eventType, eventSource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHistoryTrafficEventsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
        sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    eventClass: ").append(toIndentedString(eventClass)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
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
