package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateTrafficEventResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    private String eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_source_type")

    private String eventSourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_source_id")

    private String eventSourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_class")

    private String eventClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private Integer eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_code")

    private Integer areaCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_level")

    private Integer eventLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_params")

    private Map<String, String> eventParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_position")

    private EventLocation eventPosition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_description")

    private String eventDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reference_paths")

    private List<EventReferencePath> referencePaths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_position_name")

    private String eventPositionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "note")

    private String note;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_confidence")

    private Integer eventConfidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_time")

    private OffsetDateTime lastModifiedTime;

    public CreateTrafficEventResponse withStatus(String status) {
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

    public CreateTrafficEventResponse withEventId(String eventId) {
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

    public CreateTrafficEventResponse withEventSourceType(String eventSourceType) {
        this.eventSourceType = eventSourceType;
        return this;
    }

    /**
     *  **参数说明**：事件来源类型列表,支持事件来源。  **取值范围**：  - unknown：未知数据  - police：警方数据  - government：政府数据  - meteorological：气象数据  - internet：互联网数据  - detection：检测器检测到的数据  - v2xServer：平台上报数据  - rsu：RSU上报数据  - obu：车载终端上报数据 
     * @return eventSourceType
     */
    public String getEventSourceType() {
        return eventSourceType;
    }

    public void setEventSourceType(String eventSourceType) {
        this.eventSourceType = eventSourceType;
    }

    public CreateTrafficEventResponse withEventSourceId(String eventSourceId) {
        this.eventSourceId = eventSourceId;
        return this;
    }

    /**
     * **参数说明**：事件来源的ID，由用户自定义。
     * @return eventSourceId
     */
    public String getEventSourceId() {
        return eventSourceId;
    }

    public void setEventSourceId(String eventSourceId) {
        this.eventSourceId = eventSourceId;
    }

    public CreateTrafficEventResponse withEventClass(String eventClass) {
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

    public CreateTrafficEventResponse withEventType(Integer eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * **参数说明**：事件类型，参照附录[《国标交通事件及标志列表》](https://support.huaweicloud.com/api-v2x/v2x_04_0101.html)文件。
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

    public CreateTrafficEventResponse withAreaCode(Integer areaCode) {
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

    public CreateTrafficEventResponse withEventLevel(Integer eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }

    /**
     * **参数说明**：事件优先级，0-7越大优先级越高。
     * minimum: 0
     * maximum: 7
     * @return eventLevel
     */
    public Integer getEventLevel() {
        return eventLevel;
    }

    public void setEventLevel(Integer eventLevel) {
        this.eventLevel = eventLevel;
    }

    public CreateTrafficEventResponse withEventParams(Map<String, String> eventParams) {
        this.eventParams = eventParams;
        return this;
    }

    public CreateTrafficEventResponse putEventParamsItem(String key, String eventParamsItem) {
        if (this.eventParams == null) {
            this.eventParams = new HashMap<>();
        }
        this.eventParams.put(key, eventParamsItem);
        return this;
    }

    public CreateTrafficEventResponse withEventParams(Consumer<Map<String, String>> eventParamsSetter) {
        if (this.eventParams == null) {
            this.eventParams = new HashMap<>();
        }
        eventParamsSetter.accept(this.eventParams);
        return this;
    }

    /**
     *  **参数说明**：事件附加信息。  事件类型为如下数据时生效：  - 道路最高限：必选，设置最高限速（整数值）km/h  - 道路最低限速：必选，设置最低限速（整数值）km/h  - 建议速度：必选，建议速度（整数值）km/h  - 急弯路：可选，建议最高限速（整数值）km/h  - 雨：可选，请输入1~4：1-细雨，2-小雨，3-中雨，4-大雨  - 雪：可选，请输入1~4：1-小雪，2-中雪，3-大雪，4-暴雪  - 风：可选，设置风速值（整数值）km/h  - 雾：可选，请输入1或2：1-薄雾，2-浓雾  - 路面湿滑：可选，设置湿滑系数（0~1）  - 路面结冰：可选，请设置冰层厚度（整数值）mm  建议填写方式为：user_defined_param1: \"xx\" 
     * @return eventParams
     */
    public Map<String, String> getEventParams() {
        return eventParams;
    }

    public void setEventParams(Map<String, String> eventParams) {
        this.eventParams = eventParams;
    }

    public CreateTrafficEventResponse withEventPosition(EventLocation eventPosition) {
        this.eventPosition = eventPosition;
        return this;
    }

    public CreateTrafficEventResponse withEventPosition(Consumer<EventLocation> eventPositionSetter) {
        if (this.eventPosition == null) {
            this.eventPosition = new EventLocation();
            eventPositionSetter.accept(this.eventPosition);
        }

        return this;
    }

    /**
     * Get eventPosition
     * @return eventPosition
     */
    public EventLocation getEventPosition() {
        return eventPosition;
    }

    public void setEventPosition(EventLocation eventPosition) {
        this.eventPosition = eventPosition;
    }

    public CreateTrafficEventResponse withEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
        return this;
    }

    /**
     * **参数说明**：事件描述。支持英文字母、数字、下划线、斜杠、中文及中文常用字符：。 ？ ！ ， 、 ； ： “ ”
     * @return eventDescription
     */
    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public CreateTrafficEventResponse withReferencePaths(List<EventReferencePath> referencePaths) {
        this.referencePaths = referencePaths;
        return this;
    }

    public CreateTrafficEventResponse addReferencePathsItem(EventReferencePath referencePathsItem) {
        if (this.referencePaths == null) {
            this.referencePaths = new ArrayList<>();
        }
        this.referencePaths.add(referencePathsItem);
        return this;
    }

    public CreateTrafficEventResponse withReferencePaths(Consumer<List<EventReferencePath>> referencePathsSetter) {
        if (this.referencePaths == null) {
            this.referencePaths = new ArrayList<>();
        }
        referencePathsSetter.accept(this.referencePaths);
        return this;
    }

    /**
     * **参数说明**：事件生效的关联路径，至少需写入起始和终止位置的两个坐标点。
     * @return referencePaths
     */
    public List<EventReferencePath> getReferencePaths() {
        return referencePaths;
    }

    public void setReferencePaths(List<EventReferencePath> referencePaths) {
        this.referencePaths = referencePaths;
    }

    public CreateTrafficEventResponse withEventPositionName(String eventPositionName) {
        this.eventPositionName = eventPositionName;
        return this;
    }

    /**
     * **参数说明**：事件所在位置。
     * @return eventPositionName
     */
    public String getEventPositionName() {
        return eventPositionName;
    }

    public void setEventPositionName(String eventPositionName) {
        this.eventPositionName = eventPositionName;
    }

    public CreateTrafficEventResponse withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数说明**：开始时间。  格式：yyyy-MM-dd''T''HH:mm:ss''Z''。  例如 2020-09-01T01:37:01Z。 
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public CreateTrafficEventResponse withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数说明**：结束时间。  格式：yyyy-MM-dd''T''HH:mm:ss''Z''。  例如 2020-09-01T01:37:01Z。 
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public CreateTrafficEventResponse withNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * **参数说明**：备注。
     * @return note
     */
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public CreateTrafficEventResponse withEventConfidence(Integer eventConfidence) {
        this.eventConfidence = eventConfidence;
        return this;
    }

    /**
     * **参数说明**：事件可信度。
     * minimum: 0
     * maximum: 1000
     * @return eventConfidence
     */
    public Integer getEventConfidence() {
        return eventConfidence;
    }

    public void setEventConfidence(Integer eventConfidence) {
        this.eventConfidence = eventConfidence;
    }

    public CreateTrafficEventResponse withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * '**参数说明**：创建时间。  格式：yyyy-MM-dd''T''HH:mm:ss''Z''。  例如 2020-09-01T01:37:01Z。 
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public CreateTrafficEventResponse withLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * **参数说明**：最后修改的时间。  格式：yyyy-MM-dd''T''HH:mm:ss''Z''。  例如 2020-09-01T01:37:01Z。 
     * @return lastModifiedTime
     */
    public OffsetDateTime getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTrafficEventResponse that = (CreateTrafficEventResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.eventId, that.eventId)
            && Objects.equals(this.eventSourceType, that.eventSourceType)
            && Objects.equals(this.eventSourceId, that.eventSourceId)
            && Objects.equals(this.eventClass, that.eventClass) && Objects.equals(this.eventType, that.eventType)
            && Objects.equals(this.areaCode, that.areaCode) && Objects.equals(this.eventLevel, that.eventLevel)
            && Objects.equals(this.eventParams, that.eventParams)
            && Objects.equals(this.eventPosition, that.eventPosition)
            && Objects.equals(this.eventDescription, that.eventDescription)
            && Objects.equals(this.referencePaths, that.referencePaths)
            && Objects.equals(this.eventPositionName, that.eventPositionName)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.note, that.note) && Objects.equals(this.eventConfidence, that.eventConfidence)
            && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.lastModifiedTime, that.lastModifiedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status,
            eventId,
            eventSourceType,
            eventSourceId,
            eventClass,
            eventType,
            areaCode,
            eventLevel,
            eventParams,
            eventPosition,
            eventDescription,
            referencePaths,
            eventPositionName,
            startTime,
            endTime,
            note,
            eventConfidence,
            createdTime,
            lastModifiedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTrafficEventResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    eventSourceType: ").append(toIndentedString(eventSourceType)).append("\n");
        sb.append("    eventSourceId: ").append(toIndentedString(eventSourceId)).append("\n");
        sb.append("    eventClass: ").append(toIndentedString(eventClass)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
        sb.append("    eventLevel: ").append(toIndentedString(eventLevel)).append("\n");
        sb.append("    eventParams: ").append(toIndentedString(eventParams)).append("\n");
        sb.append("    eventPosition: ").append(toIndentedString(eventPosition)).append("\n");
        sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
        sb.append("    referencePaths: ").append(toIndentedString(referencePaths)).append("\n");
        sb.append("    eventPositionName: ").append(toIndentedString(eventPositionName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    eventConfidence: ").append(toIndentedString(eventConfidence)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
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
