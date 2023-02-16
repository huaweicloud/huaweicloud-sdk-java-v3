package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HistoryTrafficEventDTO
 */
public class HistoryTrafficEventDTO {

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
    @JsonProperty(value = "esn")

    private String esn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_code")

    private Integer areaCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_class")

    private String eventClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private Integer eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_id")

    private String crossId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_description")

    private String eventDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_level")

    private Integer eventLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_params")

    private Map<String, String> eventParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_position")

    private Position3D eventPosition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_position_name")

    private String eventPositionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reference_paths")

    private List<ReferencePath> referencePaths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "note")

    private String note;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_status")

    private String eventStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_confidence")

    private Integer eventConfidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_ex_info")

    private EventExInfo eventExInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rsu_id")

    private List<String> rsuId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    public HistoryTrafficEventDTO withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * **参数说明**：事件ID，由平台生成。
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public HistoryTrafficEventDTO withEventSourceType(String eventSourceType) {
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

    public HistoryTrafficEventDTO withEventSourceId(String eventSourceId) {
        this.eventSourceId = eventSourceId;
        return this;
    }

    /**
     * **参数说明**：事件来源ID。
     * @return eventSourceId
     */
    public String getEventSourceId() {
        return eventSourceId;
    }

    public void setEventSourceId(String eventSourceId) {
        this.eventSourceId = eventSourceId;
    }

    public HistoryTrafficEventDTO withEsn(String esn) {
        this.esn = esn;
        return this;
    }

    /**
     * **参数说明**：设备编码。 **取值范围**：长度不超过64，只允许字母、数字、以及_等字符的组合。 
     * @return esn
     */
    public String getEsn() {
        return esn;
    }

    public void setEsn(String esn) {
        this.esn = esn;
    }

    public HistoryTrafficEventDTO withAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    /**
     * **参数说明**：区域码。
     * minimum: 0
     * maximum: 2147483647
     * @return areaCode
     */
    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public HistoryTrafficEventDTO withEventClass(String eventClass) {
        this.eventClass = eventClass;
        return this;
    }

    /**
     * **参数说明**：事件的分类。  **取值范围**：  - AbnormalTraffic：异常路况  - AbnormalVehicle：异常车况  - AdverseWeather：恶劣天气  - TrafficSign：标志标牌 
     * @return eventClass
     */
    public String getEventClass() {
        return eventClass;
    }

    public void setEventClass(String eventClass) {
        this.eventClass = eventClass;
    }

    public HistoryTrafficEventDTO withEventType(Integer eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * **参数说明**：事件类型，参照附录[《国标交通事件及标志列表》](https://support.huaweicloud.com/api-v2x/v2x_04_0101.html)文件。
     * minimum: 0
     * maximum: 2147483647
     * @return eventType
     */
    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public HistoryTrafficEventDTO withCrossId(String crossId) {
        this.crossId = crossId;
        return this;
    }

    /**
     * **参数说明**：路口id，对应到一组雷视拟合设备，检测一个特定的路口或者路段。
     * @return crossId
     */
    public String getCrossId() {
        return crossId;
    }

    public void setCrossId(String crossId) {
        this.crossId = crossId;
    }

    public HistoryTrafficEventDTO withEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
        return this;
    }

    /**
     * **参数说明**：交通事件描述。
     * @return eventDescription
     */
    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public HistoryTrafficEventDTO withEventLevel(Integer eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }

    /**
     * **参数说明**：事件级别(1-5) 由低到高的事件严重程度。
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

    public HistoryTrafficEventDTO withEventParams(Map<String, String> eventParams) {
        this.eventParams = eventParams;
        return this;
    }

    public HistoryTrafficEventDTO putEventParamsItem(String key, String eventParamsItem) {
        if (this.eventParams == null) {
            this.eventParams = new HashMap<>();
        }
        this.eventParams.put(key, eventParamsItem);
        return this;
    }

    public HistoryTrafficEventDTO withEventParams(Consumer<Map<String, String>> eventParamsSetter) {
        if (this.eventParams == null) {
            this.eventParams = new HashMap<>();
        }
        eventParamsSetter.accept(this.eventParams);
        return this;
    }

    /**
     * **参数说明**：事件参数，用户自定义。
     * @return eventParams
     */
    public Map<String, String> getEventParams() {
        return eventParams;
    }

    public void setEventParams(Map<String, String> eventParams) {
        this.eventParams = eventParams;
    }

    public HistoryTrafficEventDTO withEventPosition(Position3D eventPosition) {
        this.eventPosition = eventPosition;
        return this;
    }

    public HistoryTrafficEventDTO withEventPosition(Consumer<Position3D> eventPositionSetter) {
        if (this.eventPosition == null) {
            this.eventPosition = new Position3D();
            eventPositionSetter.accept(this.eventPosition);
        }

        return this;
    }

    /**
     * Get eventPosition
     * @return eventPosition
     */
    public Position3D getEventPosition() {
        return eventPosition;
    }

    public void setEventPosition(Position3D eventPosition) {
        this.eventPosition = eventPosition;
    }

    public HistoryTrafficEventDTO withEventPositionName(String eventPositionName) {
        this.eventPositionName = eventPositionName;
        return this;
    }

    /**
     * **参数说明**：事件位置名称。
     * @return eventPositionName
     */
    public String getEventPositionName() {
        return eventPositionName;
    }

    public void setEventPositionName(String eventPositionName) {
        this.eventPositionName = eventPositionName;
    }

    public HistoryTrafficEventDTO withReferencePaths(List<ReferencePath> referencePaths) {
        this.referencePaths = referencePaths;
        return this;
    }

    public HistoryTrafficEventDTO addReferencePathsItem(ReferencePath referencePathsItem) {
        if (this.referencePaths == null) {
            this.referencePaths = new ArrayList<>();
        }
        this.referencePaths.add(referencePathsItem);
        return this;
    }

    public HistoryTrafficEventDTO withReferencePaths(Consumer<List<ReferencePath>> referencePathsSetter) {
        if (this.referencePaths == null) {
            this.referencePaths = new ArrayList<>();
        }
        referencePathsSetter.accept(this.referencePaths);
        return this;
    }

    /**
     * **参数说明**：事件的关联路径。
     * @return referencePaths
     */
    public List<ReferencePath> getReferencePaths() {
        return referencePaths;
    }

    public void setReferencePaths(List<ReferencePath> referencePaths) {
        this.referencePaths = referencePaths;
    }

    public HistoryTrafficEventDTO withNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * **参数说明**：用户备注信息。
     * @return note
     */
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public HistoryTrafficEventDTO withEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
        return this;
    }

    /**
     * **参数说明**：事件的状态。  **取值范围**：  - Invalid：过期事件，事件发生的时间段在当前时间之前。  - Active：活动事件，事件正在发生，当前时间处于事件发生时间段内。  - Future：未来事件，在当前时间之后才会发生的事件。 
     * @return eventStatus
     */
    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    public HistoryTrafficEventDTO withEventConfidence(Integer eventConfidence) {
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

    public HistoryTrafficEventDTO withEventExInfo(EventExInfo eventExInfo) {
        this.eventExInfo = eventExInfo;
        return this;
    }

    public HistoryTrafficEventDTO withEventExInfo(Consumer<EventExInfo> eventExInfoSetter) {
        if (this.eventExInfo == null) {
            this.eventExInfo = new EventExInfo();
            eventExInfoSetter.accept(this.eventExInfo);
        }

        return this;
    }

    /**
     * Get eventExInfo
     * @return eventExInfo
     */
    public EventExInfo getEventExInfo() {
        return eventExInfo;
    }

    public void setEventExInfo(EventExInfo eventExInfo) {
        this.eventExInfo = eventExInfo;
    }

    public HistoryTrafficEventDTO withRsuId(List<String> rsuId) {
        this.rsuId = rsuId;
        return this;
    }

    public HistoryTrafficEventDTO addRsuIdItem(String rsuIdItem) {
        if (this.rsuId == null) {
            this.rsuId = new ArrayList<>();
        }
        this.rsuId.add(rsuIdItem);
        return this;
    }

    public HistoryTrafficEventDTO withRsuId(Consumer<List<String>> rsuIdSetter) {
        if (this.rsuId == null) {
            this.rsuId = new ArrayList<>();
        }
        rsuIdSetter.accept(this.rsuId);
        return this;
    }

    /**
     * **参数说明**：事件关联的rsuID。
     * @return rsuId
     */
    public List<String> getRsuId() {
        return rsuId;
    }

    public void setRsuId(List<String> rsuId) {
        this.rsuId = rsuId;
    }

    public HistoryTrafficEventDTO withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数说明**：事件的开始时间。  格式：yyyy-MM-dd''T''HH:mm:ss''Z''。  例如 2020-09-01T01:37:01Z。 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public HistoryTrafficEventDTO withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数说明**：事件的结束时间。  格式：yyyy-MM-dd''T''HH:mm:ss''Z''。  例如 2020-09-01T01:37:01Z。 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public HistoryTrafficEventDTO withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * **参数说明**：事件的创建时间。  格式：yyyy-MM-dd''T''HH:mm:ss''Z''。  例如 2020-09-01T01:37:01Z。 
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HistoryTrafficEventDTO historyTrafficEventDTO = (HistoryTrafficEventDTO) o;
        return Objects.equals(this.eventId, historyTrafficEventDTO.eventId)
            && Objects.equals(this.eventSourceType, historyTrafficEventDTO.eventSourceType)
            && Objects.equals(this.eventSourceId, historyTrafficEventDTO.eventSourceId)
            && Objects.equals(this.esn, historyTrafficEventDTO.esn)
            && Objects.equals(this.areaCode, historyTrafficEventDTO.areaCode)
            && Objects.equals(this.eventClass, historyTrafficEventDTO.eventClass)
            && Objects.equals(this.eventType, historyTrafficEventDTO.eventType)
            && Objects.equals(this.crossId, historyTrafficEventDTO.crossId)
            && Objects.equals(this.eventDescription, historyTrafficEventDTO.eventDescription)
            && Objects.equals(this.eventLevel, historyTrafficEventDTO.eventLevel)
            && Objects.equals(this.eventParams, historyTrafficEventDTO.eventParams)
            && Objects.equals(this.eventPosition, historyTrafficEventDTO.eventPosition)
            && Objects.equals(this.eventPositionName, historyTrafficEventDTO.eventPositionName)
            && Objects.equals(this.referencePaths, historyTrafficEventDTO.referencePaths)
            && Objects.equals(this.note, historyTrafficEventDTO.note)
            && Objects.equals(this.eventStatus, historyTrafficEventDTO.eventStatus)
            && Objects.equals(this.eventConfidence, historyTrafficEventDTO.eventConfidence)
            && Objects.equals(this.eventExInfo, historyTrafficEventDTO.eventExInfo)
            && Objects.equals(this.rsuId, historyTrafficEventDTO.rsuId)
            && Objects.equals(this.startTime, historyTrafficEventDTO.startTime)
            && Objects.equals(this.endTime, historyTrafficEventDTO.endTime)
            && Objects.equals(this.createdTime, historyTrafficEventDTO.createdTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId,
            eventSourceType,
            eventSourceId,
            esn,
            areaCode,
            eventClass,
            eventType,
            crossId,
            eventDescription,
            eventLevel,
            eventParams,
            eventPosition,
            eventPositionName,
            referencePaths,
            note,
            eventStatus,
            eventConfidence,
            eventExInfo,
            rsuId,
            startTime,
            endTime,
            createdTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistoryTrafficEventDTO {\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    eventSourceType: ").append(toIndentedString(eventSourceType)).append("\n");
        sb.append("    eventSourceId: ").append(toIndentedString(eventSourceId)).append("\n");
        sb.append("    esn: ").append(toIndentedString(esn)).append("\n");
        sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
        sb.append("    eventClass: ").append(toIndentedString(eventClass)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    crossId: ").append(toIndentedString(crossId)).append("\n");
        sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
        sb.append("    eventLevel: ").append(toIndentedString(eventLevel)).append("\n");
        sb.append("    eventParams: ").append(toIndentedString(eventParams)).append("\n");
        sb.append("    eventPosition: ").append(toIndentedString(eventPosition)).append("\n");
        sb.append("    eventPositionName: ").append(toIndentedString(eventPositionName)).append("\n");
        sb.append("    referencePaths: ").append(toIndentedString(referencePaths)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    eventStatus: ").append(toIndentedString(eventStatus)).append("\n");
        sb.append("    eventConfidence: ").append(toIndentedString(eventConfidence)).append("\n");
        sb.append("    eventExInfo: ").append(toIndentedString(eventExInfo)).append("\n");
        sb.append("    rsuId: ").append(toIndentedString(rsuId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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
