package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateFunctionTriggerRequestBody
 */
public class CreateFunctionTriggerRequestBody {

    /**
     * 触发器类型。  - TIMER: 定时触发器。 - APIG: APIGW触发器。 - CTS: 云审计触发器，需要先开通云审计服务。 - DDS: 文档数据库触发器，需要开启函数vpc。 - DMS: 分布式消息服务触发器，需要配置dms委托。 - DIS: 数据接入服务触发器，需要配置dis委托。 - LTS: 云审计日志服务触发器，需要配置lts委托。 - OBS: 对象存储服务触发器。 - KAFKA: 专享版本kafka触发器。
     */
    public static final class TriggerTypeCodeEnum {

        /**
         * Enum TIMER for value: "TIMER"
         */
        public static final TriggerTypeCodeEnum TIMER = new TriggerTypeCodeEnum("TIMER");

        /**
         * Enum APIG for value: "APIG"
         */
        public static final TriggerTypeCodeEnum APIG = new TriggerTypeCodeEnum("APIG");

        /**
         * Enum CTS for value: "CTS"
         */
        public static final TriggerTypeCodeEnum CTS = new TriggerTypeCodeEnum("CTS");

        /**
         * Enum DDS for value: "DDS"
         */
        public static final TriggerTypeCodeEnum DDS = new TriggerTypeCodeEnum("DDS");

        /**
         * Enum DMS for value: "DMS"
         */
        public static final TriggerTypeCodeEnum DMS = new TriggerTypeCodeEnum("DMS");

        /**
         * Enum DIS for value: "DIS"
         */
        public static final TriggerTypeCodeEnum DIS = new TriggerTypeCodeEnum("DIS");

        /**
         * Enum LTS for value: "LTS"
         */
        public static final TriggerTypeCodeEnum LTS = new TriggerTypeCodeEnum("LTS");

        /**
         * Enum OBS for value: "OBS"
         */
        public static final TriggerTypeCodeEnum OBS = new TriggerTypeCodeEnum("OBS");

        /**
         * Enum SMN for value: "SMN"
         */
        public static final TriggerTypeCodeEnum SMN = new TriggerTypeCodeEnum("SMN");

        /**
         * Enum KAFKA for value: "KAFKA"
         */
        public static final TriggerTypeCodeEnum KAFKA = new TriggerTypeCodeEnum("KAFKA");

        /**
         * Enum RABBITMQ for value: "RABBITMQ"
         */
        public static final TriggerTypeCodeEnum RABBITMQ = new TriggerTypeCodeEnum("RABBITMQ");

        /**
         * Enum DEDICATEDGATEWAY for value: "DEDICATEDGATEWAY"
         */
        public static final TriggerTypeCodeEnum DEDICATEDGATEWAY = new TriggerTypeCodeEnum("DEDICATEDGATEWAY");

        /**
         * Enum OPENSOURCEKAFKA for value: "OPENSOURCEKAFKA"
         */
        public static final TriggerTypeCodeEnum OPENSOURCEKAFKA = new TriggerTypeCodeEnum("OPENSOURCEKAFKA");

        /**
         * Enum APIC for value: "APIC"
         */
        public static final TriggerTypeCodeEnum APIC = new TriggerTypeCodeEnum("APIC");

        /**
         * Enum GAUSSMONGO for value: "GAUSSMONGO"
         */
        public static final TriggerTypeCodeEnum GAUSSMONGO = new TriggerTypeCodeEnum("GAUSSMONGO");

        /**
         * Enum EVENTGRID for value: "EVENTGRID"
         */
        public static final TriggerTypeCodeEnum EVENTGRID = new TriggerTypeCodeEnum("EVENTGRID");

        private static final Map<String, TriggerTypeCodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TriggerTypeCodeEnum> createStaticFields() {
            Map<String, TriggerTypeCodeEnum> map = new HashMap<>();
            map.put("TIMER", TIMER);
            map.put("APIG", APIG);
            map.put("CTS", CTS);
            map.put("DDS", DDS);
            map.put("DMS", DMS);
            map.put("DIS", DIS);
            map.put("LTS", LTS);
            map.put("OBS", OBS);
            map.put("SMN", SMN);
            map.put("KAFKA", KAFKA);
            map.put("RABBITMQ", RABBITMQ);
            map.put("DEDICATEDGATEWAY", DEDICATEDGATEWAY);
            map.put("OPENSOURCEKAFKA", OPENSOURCEKAFKA);
            map.put("APIC", APIC);
            map.put("GAUSSMONGO", GAUSSMONGO);
            map.put("EVENTGRID", EVENTGRID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TriggerTypeCodeEnum(String value) {
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
        public static TriggerTypeCodeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TriggerTypeCodeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TriggerTypeCodeEnum(value);
            }
            return result;
        }

        public static TriggerTypeCodeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TriggerTypeCodeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TriggerTypeCodeEnum) {
                return this.value.equals(((TriggerTypeCodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type_code")

    @JacksonXmlProperty(localName = "trigger_type_code")

    private TriggerTypeCodeEnum triggerTypeCode;

    /**
     * 触发器状态，取值为ACTIVE,DISABLED。
     */
    public static final class TriggerStatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final TriggerStatusEnum ACTIVE = new TriggerStatusEnum("ACTIVE");

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final TriggerStatusEnum DISABLED = new TriggerStatusEnum("DISABLED");

        private static final Map<String, TriggerStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TriggerStatusEnum> createStaticFields() {
            Map<String, TriggerStatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("DISABLED", DISABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TriggerStatusEnum(String value) {
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
        public static TriggerStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TriggerStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TriggerStatusEnum(value);
            }
            return result;
        }

        public static TriggerStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TriggerStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TriggerStatusEnum) {
                return this.value.equals(((TriggerStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_status")

    @JacksonXmlProperty(localName = "trigger_status")

    private TriggerStatusEnum triggerStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type_code")

    @JacksonXmlProperty(localName = "event_type_code")

    private String eventTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_data")

    @JacksonXmlProperty(localName = "event_data")

    private Map<String, String> eventData = null;

    public CreateFunctionTriggerRequestBody withTriggerTypeCode(TriggerTypeCodeEnum triggerTypeCode) {
        this.triggerTypeCode = triggerTypeCode;
        return this;
    }

    /**
     * 触发器类型。  - TIMER: 定时触发器。 - APIG: APIGW触发器。 - CTS: 云审计触发器，需要先开通云审计服务。 - DDS: 文档数据库触发器，需要开启函数vpc。 - DMS: 分布式消息服务触发器，需要配置dms委托。 - DIS: 数据接入服务触发器，需要配置dis委托。 - LTS: 云审计日志服务触发器，需要配置lts委托。 - OBS: 对象存储服务触发器。 - KAFKA: 专享版本kafka触发器。
     * @return triggerTypeCode
     */
    public TriggerTypeCodeEnum getTriggerTypeCode() {
        return triggerTypeCode;
    }

    public void setTriggerTypeCode(TriggerTypeCodeEnum triggerTypeCode) {
        this.triggerTypeCode = triggerTypeCode;
    }

    public CreateFunctionTriggerRequestBody withTriggerStatus(TriggerStatusEnum triggerStatus) {
        this.triggerStatus = triggerStatus;
        return this;
    }

    /**
     * 触发器状态，取值为ACTIVE,DISABLED。
     * @return triggerStatus
     */
    public TriggerStatusEnum getTriggerStatus() {
        return triggerStatus;
    }

    public void setTriggerStatus(TriggerStatusEnum triggerStatus) {
        this.triggerStatus = triggerStatus;
    }

    public CreateFunctionTriggerRequestBody withEventTypeCode(String eventTypeCode) {
        this.eventTypeCode = eventTypeCode;
        return this;
    }

    /**
     * 消息代码。
     * @return eventTypeCode
     */
    public String getEventTypeCode() {
        return eventTypeCode;
    }

    public void setEventTypeCode(String eventTypeCode) {
        this.eventTypeCode = eventTypeCode;
    }

    public CreateFunctionTriggerRequestBody withEventData(Map<String, String> eventData) {
        this.eventData = eventData;
        return this;
    }

    public CreateFunctionTriggerRequestBody putEventDataItem(String key, String eventDataItem) {
        if (this.eventData == null) {
            this.eventData = new HashMap<>();
        }
        this.eventData.put(key, eventDataItem);
        return this;
    }

    public CreateFunctionTriggerRequestBody withEventData(Consumer<Map<String, String>> eventDataSetter) {
        if (this.eventData == null) {
            this.eventData = new HashMap<>();
        }
        eventDataSetter.accept(this.eventData);
        return this;
    }

    /**
     * 事件结构体。
     * @return eventData
     */
    public Map<String, String> getEventData() {
        return eventData;
    }

    public void setEventData(Map<String, String> eventData) {
        this.eventData = eventData;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFunctionTriggerRequestBody createFunctionTriggerRequestBody = (CreateFunctionTriggerRequestBody) o;
        return Objects.equals(this.triggerTypeCode, createFunctionTriggerRequestBody.triggerTypeCode)
            && Objects.equals(this.triggerStatus, createFunctionTriggerRequestBody.triggerStatus)
            && Objects.equals(this.eventTypeCode, createFunctionTriggerRequestBody.eventTypeCode)
            && Objects.equals(this.eventData, createFunctionTriggerRequestBody.eventData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(triggerTypeCode, triggerStatus, eventTypeCode, eventData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFunctionTriggerRequestBody {\n");
        sb.append("    triggerTypeCode: ").append(toIndentedString(triggerTypeCode)).append("\n");
        sb.append("    triggerStatus: ").append(toIndentedString(triggerStatus)).append("\n");
        sb.append("    eventTypeCode: ").append(toIndentedString(eventTypeCode)).append("\n");
        sb.append("    eventData: ").append(toIndentedString(eventData)).append("\n");
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
