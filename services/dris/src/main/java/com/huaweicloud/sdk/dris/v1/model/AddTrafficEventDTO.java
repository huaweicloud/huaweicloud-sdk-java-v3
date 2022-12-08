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
 * AddTrafficEventDTO
 */
public class AddTrafficEventDTO {

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

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "note")

    private String note;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_confidence")

    private Integer eventConfidence;

    public AddTrafficEventDTO withEventSourceType(String eventSourceType) {
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

    public AddTrafficEventDTO withEventSourceId(String eventSourceId) {
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

    public AddTrafficEventDTO withEventClass(String eventClass) {
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

    public AddTrafficEventDTO withEventType(Integer eventType) {
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

    public AddTrafficEventDTO withAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    /**
     * **参数说明**：区域码，参考[区域码查询](http://xzqh.mca.gov.cn/map)。
     * minimum: 100000
     * maximum: 999999
     * @return areaCode
     */
    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public AddTrafficEventDTO withEventLevel(Integer eventLevel) {
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

    public AddTrafficEventDTO withEventParams(Map<String, String> eventParams) {
        this.eventParams = eventParams;
        return this;
    }

    public AddTrafficEventDTO putEventParamsItem(String key, String eventParamsItem) {
        if (this.eventParams == null) {
            this.eventParams = new HashMap<>();
        }
        this.eventParams.put(key, eventParamsItem);
        return this;
    }

    public AddTrafficEventDTO withEventParams(Consumer<Map<String, String>> eventParamsSetter) {
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

    public AddTrafficEventDTO withEventPosition(EventLocation eventPosition) {
        this.eventPosition = eventPosition;
        return this;
    }

    public AddTrafficEventDTO withEventPosition(Consumer<EventLocation> eventPositionSetter) {
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

    public AddTrafficEventDTO withEventDescription(String eventDescription) {
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

    public AddTrafficEventDTO withReferencePaths(List<EventReferencePath> referencePaths) {
        this.referencePaths = referencePaths;
        return this;
    }

    public AddTrafficEventDTO addReferencePathsItem(EventReferencePath referencePathsItem) {
        if (this.referencePaths == null) {
            this.referencePaths = new ArrayList<>();
        }
        this.referencePaths.add(referencePathsItem);
        return this;
    }

    public AddTrafficEventDTO withReferencePaths(Consumer<List<EventReferencePath>> referencePathsSetter) {
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

    public AddTrafficEventDTO withEventPositionName(String eventPositionName) {
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

    public AddTrafficEventDTO withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数说明**：开始时间。  格式：yyyy-MM-dd''T''HH:mm:ss''Z''。  例如 2020-09-01T01:37:01Z。 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public AddTrafficEventDTO withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数说明**：结束时间。  格式：yyyy-MM-dd''T''HH:mm:ss''Z''。  例如 2020-09-01T01:37:01Z。 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public AddTrafficEventDTO withNote(String note) {
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

    public AddTrafficEventDTO withEventConfidence(Integer eventConfidence) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddTrafficEventDTO addTrafficEventDTO = (AddTrafficEventDTO) o;
        return Objects.equals(this.eventSourceType, addTrafficEventDTO.eventSourceType)
            && Objects.equals(this.eventSourceId, addTrafficEventDTO.eventSourceId)
            && Objects.equals(this.eventClass, addTrafficEventDTO.eventClass)
            && Objects.equals(this.eventType, addTrafficEventDTO.eventType)
            && Objects.equals(this.areaCode, addTrafficEventDTO.areaCode)
            && Objects.equals(this.eventLevel, addTrafficEventDTO.eventLevel)
            && Objects.equals(this.eventParams, addTrafficEventDTO.eventParams)
            && Objects.equals(this.eventPosition, addTrafficEventDTO.eventPosition)
            && Objects.equals(this.eventDescription, addTrafficEventDTO.eventDescription)
            && Objects.equals(this.referencePaths, addTrafficEventDTO.referencePaths)
            && Objects.equals(this.eventPositionName, addTrafficEventDTO.eventPositionName)
            && Objects.equals(this.startTime, addTrafficEventDTO.startTime)
            && Objects.equals(this.endTime, addTrafficEventDTO.endTime)
            && Objects.equals(this.note, addTrafficEventDTO.note)
            && Objects.equals(this.eventConfidence, addTrafficEventDTO.eventConfidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventSourceType,
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
            eventConfidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddTrafficEventDTO {\n");
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
