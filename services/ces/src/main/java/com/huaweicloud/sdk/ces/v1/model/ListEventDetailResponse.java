package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListEventDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    @JacksonXmlProperty(localName = "event_name")

    private String eventName;

    /**
     * 事件类型，值为EVENT.SYS或EVENT.CUSTOM，EVENT.SYS表示系统事件，EVENT.CUSTOM表示自定义事件。
     */
    public static final class EventTypeEnum {

        /**
         * Enum EVENT_SYS for value: "EVENT.SYS"
         */
        public static final EventTypeEnum EVENT_SYS = new EventTypeEnum("EVENT.SYS");

        /**
         * Enum EVENT_CUSTOM for value: "EVENT.CUSTOM"
         */
        public static final EventTypeEnum EVENT_CUSTOM = new EventTypeEnum("EVENT.CUSTOM");

        private static final Map<String, EventTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventTypeEnum> createStaticFields() {
            Map<String, EventTypeEnum> map = new HashMap<>();
            map.put("EVENT.SYS", EVENT_SYS);
            map.put("EVENT.CUSTOM", EVENT_CUSTOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EventTypeEnum(String value) {
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
        public static EventTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            EventTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EventTypeEnum(value);
            }
            return result;
        }

        public static EventTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            EventTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EventTypeEnum) {
                return this.value.equals(((EventTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    @JacksonXmlProperty(localName = "event_type")

    private EventTypeEnum eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_users")

    @JacksonXmlProperty(localName = "event_users")

    private List<String> eventUsers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_sources")

    @JacksonXmlProperty(localName = "event_sources")

    private List<String> eventSources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_info")

    @JacksonXmlProperty(localName = "event_info")

    private List<EventInfoDetail> eventInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data")

    @JacksonXmlProperty(localName = "meta_data")

    private TotalMetaData metaData;

    public ListEventDetailResponse withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * 事件名称，值为系统产生的事件名称，或用户自定义上报的事件名称。
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public ListEventDetailResponse withEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型，值为EVENT.SYS或EVENT.CUSTOM，EVENT.SYS表示系统事件，EVENT.CUSTOM表示自定义事件。
     * @return eventType
     */
    public EventTypeEnum getEventType() {
        return eventType;
    }

    public void setEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
    }

    public ListEventDetailResponse withEventUsers(List<String> eventUsers) {
        this.eventUsers = eventUsers;
        return this;
    }

    public ListEventDetailResponse addEventUsersItem(String eventUsersItem) {
        if (this.eventUsers == null) {
            this.eventUsers = new ArrayList<>();
        }
        this.eventUsers.add(eventUsersItem);
        return this;
    }

    public ListEventDetailResponse withEventUsers(Consumer<List<String>> eventUsersSetter) {
        if (this.eventUsers == null) {
            this.eventUsers = new ArrayList<>();
        }
        eventUsersSetter.accept(this.eventUsers);
        return this;
    }

    /**
     * 上报事件时用户的名称，也可能为projectID。
     * @return eventUsers
     */
    public List<String> getEventUsers() {
        return eventUsers;
    }

    public void setEventUsers(List<String> eventUsers) {
        this.eventUsers = eventUsers;
    }

    public ListEventDetailResponse withEventSources(List<String> eventSources) {
        this.eventSources = eventSources;
        return this;
    }

    public ListEventDetailResponse addEventSourcesItem(String eventSourcesItem) {
        if (this.eventSources == null) {
            this.eventSources = new ArrayList<>();
        }
        this.eventSources.add(eventSourcesItem);
        return this;
    }

    public ListEventDetailResponse withEventSources(Consumer<List<String>> eventSourcesSetter) {
        if (this.eventSources == null) {
            this.eventSources = new ArrayList<>();
        }
        eventSourcesSetter.accept(this.eventSources);
        return this;
    }

    /**
     * 事件来源，如果是系统事件则值为各服务的命名空间，各服务的命名空间可查看：“[服务命名空间](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”；如果是自定义事件，则为用户自定义上报定义。
     * @return eventSources
     */
    public List<String> getEventSources() {
        return eventSources;
    }

    public void setEventSources(List<String> eventSources) {
        this.eventSources = eventSources;
    }

    public ListEventDetailResponse withEventInfo(List<EventInfoDetail> eventInfo) {
        this.eventInfo = eventInfo;
        return this;
    }

    public ListEventDetailResponse addEventInfoItem(EventInfoDetail eventInfoItem) {
        if (this.eventInfo == null) {
            this.eventInfo = new ArrayList<>();
        }
        this.eventInfo.add(eventInfoItem);
        return this;
    }

    public ListEventDetailResponse withEventInfo(Consumer<List<EventInfoDetail>> eventInfoSetter) {
        if (this.eventInfo == null) {
            this.eventInfo = new ArrayList<>();
        }
        eventInfoSetter.accept(this.eventInfo);
        return this;
    }

    /**
     * 一条或者多条事件详细信息。
     * @return eventInfo
     */
    public List<EventInfoDetail> getEventInfo() {
        return eventInfo;
    }

    public void setEventInfo(List<EventInfoDetail> eventInfo) {
        this.eventInfo = eventInfo;
    }

    public ListEventDetailResponse withMetaData(TotalMetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public ListEventDetailResponse withMetaData(Consumer<TotalMetaData> metaDataSetter) {
        if (this.metaData == null) {
            this.metaData = new TotalMetaData();
            metaDataSetter.accept(this.metaData);
        }

        return this;
    }

    /**
     * Get metaData
     * @return metaData
     */
    public TotalMetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(TotalMetaData metaData) {
        this.metaData = metaData;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEventDetailResponse listEventDetailResponse = (ListEventDetailResponse) o;
        return Objects.equals(this.eventName, listEventDetailResponse.eventName)
            && Objects.equals(this.eventType, listEventDetailResponse.eventType)
            && Objects.equals(this.eventUsers, listEventDetailResponse.eventUsers)
            && Objects.equals(this.eventSources, listEventDetailResponse.eventSources)
            && Objects.equals(this.eventInfo, listEventDetailResponse.eventInfo)
            && Objects.equals(this.metaData, listEventDetailResponse.metaData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName, eventType, eventUsers, eventSources, eventInfo, metaData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventDetailResponse {\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    eventUsers: ").append(toIndentedString(eventUsers)).append("\n");
        sb.append("    eventSources: ").append(toIndentedString(eventSources)).append("\n");
        sb.append("    eventInfo: ").append(toIndentedString(eventInfo)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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
