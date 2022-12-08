package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数说明**：即时事件的内容。
 */
public class ImmediateEventDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_stamp")

    private OffsetDateTime timeStamp;

    /**
     * **参数说明**：事件类型，参照附录[《国标交通事件及标志列表》](https://support.huaweicloud.com/api-v2x/v2x_04_0101.html)文件。当填写event_type时，event_class为必选。
     */
    public static final class EventClassEnum {

        /**
         * Enum ABNORMAL_TRAFFIC for value: "abnormal traffic"
         */
        public static final EventClassEnum ABNORMAL_TRAFFIC = new EventClassEnum("abnormal traffic");

        /**
         * Enum ADVERSE_WEATHER for value: "adverse weather"
         */
        public static final EventClassEnum ADVERSE_WEATHER = new EventClassEnum("adverse weather");

        /**
         * Enum ABNORMAL_VEHICLE for value: "abnormal vehicle"
         */
        public static final EventClassEnum ABNORMAL_VEHICLE = new EventClassEnum("abnormal vehicle");

        /**
         * Enum TRAFFIC_SIGN for value: "traffic sign"
         */
        public static final EventClassEnum TRAFFIC_SIGN = new EventClassEnum("traffic sign");

        private static final Map<String, EventClassEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventClassEnum> createStaticFields() {
            Map<String, EventClassEnum> map = new HashMap<>();
            map.put("abnormal traffic", ABNORMAL_TRAFFIC);
            map.put("adverse weather", ADVERSE_WEATHER);
            map.put("abnormal vehicle", ABNORMAL_VEHICLE);
            map.put("traffic sign", TRAFFIC_SIGN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EventClassEnum(String value) {
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
        public static EventClassEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            EventClassEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EventClassEnum(value);
            }
            return result;
        }

        public static EventClassEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            EventClassEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EventClassEnum) {
                return this.value.equals(((EventClassEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_class")

    private EventClassEnum eventClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private Integer eventType;

    /**
     * **参数说明**：事件来源类型列表,支持事件来源。  **取值范围**：  - unknown：未知数据  - police：警方数据  - government：政府数据  - meteorological：气象数据  - internet：互联网数据  - detection：检测器检测到的数据  - v2xServer：平台上报数据  - rsu：RSU上报数据  - obu：车载终端上报数据
     */
    public static final class EventSourceEnum {

        /**
         * Enum UNKNOWN for value: "unknown"
         */
        public static final EventSourceEnum UNKNOWN = new EventSourceEnum("unknown");

        /**
         * Enum POLICE for value: "police"
         */
        public static final EventSourceEnum POLICE = new EventSourceEnum("police");

        /**
         * Enum GOVERNMENT for value: "government"
         */
        public static final EventSourceEnum GOVERNMENT = new EventSourceEnum("government");

        /**
         * Enum METEOROLOGICAL for value: "meteorological"
         */
        public static final EventSourceEnum METEOROLOGICAL = new EventSourceEnum("meteorological");

        /**
         * Enum INTERNET for value: "internet"
         */
        public static final EventSourceEnum INTERNET = new EventSourceEnum("internet");

        /**
         * Enum DETECTION for value: "detection"
         */
        public static final EventSourceEnum DETECTION = new EventSourceEnum("detection");

        /**
         * Enum V2XSERVER for value: "v2xServer"
         */
        public static final EventSourceEnum V2XSERVER = new EventSourceEnum("v2xServer");

        /**
         * Enum RSU for value: "rsu"
         */
        public static final EventSourceEnum RSU = new EventSourceEnum("rsu");

        /**
         * Enum OBU for value: "obu"
         */
        public static final EventSourceEnum OBU = new EventSourceEnum("obu");

        private static final Map<String, EventSourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventSourceEnum> createStaticFields() {
            Map<String, EventSourceEnum> map = new HashMap<>();
            map.put("unknown", UNKNOWN);
            map.put("police", POLICE);
            map.put("government", GOVERNMENT);
            map.put("meteorological", METEOROLOGICAL);
            map.put("internet", INTERNET);
            map.put("detection", DETECTION);
            map.put("v2xServer", V2XSERVER);
            map.put("rsu", RSU);
            map.put("obu", OBU);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EventSourceEnum(String value) {
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
        public static EventSourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            EventSourceEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EventSourceEnum(value);
            }
            return result;
        }

        public static EventSourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            EventSourceEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EventSourceEnum) {
                return this.value.equals(((EventSourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_source")

    private EventSourceEnum eventSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_source_id")

    private String eventSourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_confidence")

    private Integer eventConfidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_position")

    private ImmediateEventPosition3D eventPosition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_radius")

    private Integer eventRadius;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_description")

    private String eventDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_priority")

    private Integer eventPriority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reference_paths")

    private List<ImmediateEventReferencePath> referencePaths = null;

    public ImmediateEventDTO withTimeStamp(OffsetDateTime timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    /**
     * **参数说明**：事件发生时间，毫秒级。  格式：yyyy-MM-dd''T''HH:mm:ss.SSS''Z''  例如 2015-12-12T12:12:12.356Z。
     * @return timeStamp
     */
    public OffsetDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(OffsetDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public ImmediateEventDTO withEventClass(EventClassEnum eventClass) {
        this.eventClass = eventClass;
        return this;
    }

    /**
     * **参数说明**：事件类型，参照附录[《国标交通事件及标志列表》](https://support.huaweicloud.com/api-v2x/v2x_04_0101.html)文件。当填写event_type时，event_class为必选。
     * @return eventClass
     */
    public EventClassEnum getEventClass() {
        return eventClass;
    }

    public void setEventClass(EventClassEnum eventClass) {
        this.eventClass = eventClass;
    }

    public ImmediateEventDTO withEventType(Integer eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * **参数说明**：事件类型，参照附录[《国标交通事件及标志列表》](https://support.huaweicloud.com/api-v2x/v2x_04_0101.html)文件。
     * minimum: 0
     * maximum: 65535
     * @return eventType
     */
    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public ImmediateEventDTO withEventSource(EventSourceEnum eventSource) {
        this.eventSource = eventSource;
        return this;
    }

    /**
     * **参数说明**：事件来源类型列表,支持事件来源。  **取值范围**：  - unknown：未知数据  - police：警方数据  - government：政府数据  - meteorological：气象数据  - internet：互联网数据  - detection：检测器检测到的数据  - v2xServer：平台上报数据  - rsu：RSU上报数据  - obu：车载终端上报数据
     * @return eventSource
     */
    public EventSourceEnum getEventSource() {
        return eventSource;
    }

    public void setEventSource(EventSourceEnum eventSource) {
        this.eventSource = eventSource;
    }

    public ImmediateEventDTO withEventSourceId(String eventSourceId) {
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

    public ImmediateEventDTO withEventConfidence(Integer eventConfidence) {
        this.eventConfidence = eventConfidence;
        return this;
    }

    /**
     * **参数说明**：道路交通事件的信息来源提供的事件置信度水平，帮助接收端判断是否相信该事件信息，可选。
     * minimum: 0
     * maximum: 200
     * @return eventConfidence
     */
    public Integer getEventConfidence() {
        return eventConfidence;
    }

    public void setEventConfidence(Integer eventConfidence) {
        this.eventConfidence = eventConfidence;
    }

    public ImmediateEventDTO withEventPosition(ImmediateEventPosition3D eventPosition) {
        this.eventPosition = eventPosition;
        return this;
    }

    public ImmediateEventDTO withEventPosition(Consumer<ImmediateEventPosition3D> eventPositionSetter) {
        if (this.eventPosition == null) {
            this.eventPosition = new ImmediateEventPosition3D();
            eventPositionSetter.accept(this.eventPosition);
        }

        return this;
    }

    /**
     * Get eventPosition
     * @return eventPosition
     */
    public ImmediateEventPosition3D getEventPosition() {
        return eventPosition;
    }

    public void setEventPosition(ImmediateEventPosition3D eventPosition) {
        this.eventPosition = eventPosition;
    }

    public ImmediateEventDTO withEventRadius(Integer eventRadius) {
        this.eventRadius = eventRadius;
        return this;
    }

    /**
     * **参数说明**：事件的发生区域半径，单位为分米。
     * minimum: 0
     * maximum: 65535
     * @return eventRadius
     */
    public Integer getEventRadius() {
        return eventRadius;
    }

    public void setEventRadius(Integer eventRadius) {
        this.eventRadius = eventRadius;
    }

    public ImmediateEventDTO withEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
        return this;
    }

    /**
     * **参数说明**：事件的文本描述信息,可自行扩展需传递的信息。
     * @return eventDescription
     */
    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public ImmediateEventDTO withEventPriority(Integer eventPriority) {
        this.eventPriority = eventPriority;
        return this;
    }

    /**
     * **参数说明**：事件优先级，0-7，数字越大，级别越高。
     * minimum: 0
     * maximum: 7
     * @return eventPriority
     */
    public Integer getEventPriority() {
        return eventPriority;
    }

    public void setEventPriority(Integer eventPriority) {
        this.eventPriority = eventPriority;
    }

    public ImmediateEventDTO withReferencePaths(List<ImmediateEventReferencePath> referencePaths) {
        this.referencePaths = referencePaths;
        return this;
    }

    public ImmediateEventDTO addReferencePathsItem(ImmediateEventReferencePath referencePathsItem) {
        if (this.referencePaths == null) {
            this.referencePaths = new ArrayList<>();
        }
        this.referencePaths.add(referencePathsItem);
        return this;
    }

    public ImmediateEventDTO withReferencePaths(Consumer<List<ImmediateEventReferencePath>> referencePathsSetter) {
        if (this.referencePaths == null) {
            this.referencePaths = new ArrayList<>();
        }
        referencePathsSetter.accept(this.referencePaths);
        return this;
    }

    /**
     * **参数说明**：事件生效的关联路径。
     * @return referencePaths
     */
    public List<ImmediateEventReferencePath> getReferencePaths() {
        return referencePaths;
    }

    public void setReferencePaths(List<ImmediateEventReferencePath> referencePaths) {
        this.referencePaths = referencePaths;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImmediateEventDTO immediateEventDTO = (ImmediateEventDTO) o;
        return Objects.equals(this.timeStamp, immediateEventDTO.timeStamp)
            && Objects.equals(this.eventClass, immediateEventDTO.eventClass)
            && Objects.equals(this.eventType, immediateEventDTO.eventType)
            && Objects.equals(this.eventSource, immediateEventDTO.eventSource)
            && Objects.equals(this.eventSourceId, immediateEventDTO.eventSourceId)
            && Objects.equals(this.eventConfidence, immediateEventDTO.eventConfidence)
            && Objects.equals(this.eventPosition, immediateEventDTO.eventPosition)
            && Objects.equals(this.eventRadius, immediateEventDTO.eventRadius)
            && Objects.equals(this.eventDescription, immediateEventDTO.eventDescription)
            && Objects.equals(this.eventPriority, immediateEventDTO.eventPriority)
            && Objects.equals(this.referencePaths, immediateEventDTO.referencePaths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeStamp,
            eventClass,
            eventType,
            eventSource,
            eventSourceId,
            eventConfidence,
            eventPosition,
            eventRadius,
            eventDescription,
            eventPriority,
            referencePaths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImmediateEventDTO {\n");
        sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
        sb.append("    eventClass: ").append(toIndentedString(eventClass)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
        sb.append("    eventSourceId: ").append(toIndentedString(eventSourceId)).append("\n");
        sb.append("    eventConfidence: ").append(toIndentedString(eventConfidence)).append("\n");
        sb.append("    eventPosition: ").append(toIndentedString(eventPosition)).append("\n");
        sb.append("    eventRadius: ").append(toIndentedString(eventRadius)).append("\n");
        sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
        sb.append("    eventPriority: ").append(toIndentedString(eventPriority)).append("\n");
        sb.append("    referencePaths: ").append(toIndentedString(referencePaths)).append("\n");
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
