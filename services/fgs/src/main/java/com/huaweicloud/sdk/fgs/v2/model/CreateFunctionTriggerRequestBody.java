package com.huaweicloud.sdk.fgs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * CreateFunctionTriggerRequestBody
 */
public class CreateFunctionTriggerRequestBody  {

    /**
     * 触发器类型。  - TIMER: 定时触发器。 - APIG: APIGW触发器。 - CTS: 云审计触发器，需要先开通云审计服务。 - DDS: 文档数据库触发器，需要开启函数vpc。 - DMS: 分布式消息服务触发器，需要配置dms委托。 - DIS: 数据接入服务触发器，需要配置dis委托。 - LTS: 云审计日志服务触发器，需要配置lts委托。 - OBS: 对象存储服务触发器。 - KAFKA: 专享版本kafka触发器。
     */
    public static class TriggerTypeCodeEnum {

        
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
         * Enum KAFKA for value: "KAFKA"
         */
        public static final TriggerTypeCodeEnum KAFKA = new TriggerTypeCodeEnum("KAFKA");

        

        public static Map<String, TriggerTypeCodeEnum> staticFields =
                new HashMap<String, TriggerTypeCodeEnum>() {
                    { 
                        put("TIMER", TIMER);
                        put("APIG", APIG);
                        put("CTS", CTS);
                        put("DDS", DDS);
                        put("DMS", DMS);
                        put("DIS", DIS);
                        put("LTS", LTS);
                        put("OBS", OBS);
                        put("KAFKA", KAFKA);
                    }
                };

        private String value;

        TriggerTypeCodeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TriggerTypeCodeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            TriggerTypeCodeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new TriggerTypeCodeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static TriggerTypeCodeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TriggerTypeCodeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TriggerTypeCodeEnum) {
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
    @JsonProperty(value="trigger_type_code")
    
    private TriggerTypeCodeEnum triggerTypeCode;
    /**
     * 触发器状态，取值为ACTIVE,DISABLED。
     */
    public static class TriggerStatusEnum {

        
        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final TriggerStatusEnum ACTIVE = new TriggerStatusEnum("ACTIVE");

        
        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final TriggerStatusEnum DISABLED = new TriggerStatusEnum("DISABLED");

        

        public static Map<String, TriggerStatusEnum> staticFields =
                new HashMap<String, TriggerStatusEnum>() {
                    { 
                        put("ACTIVE", ACTIVE);
                        put("DISABLED", DISABLED);
                    }
                };

        private String value;

        TriggerStatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TriggerStatusEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            TriggerStatusEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new TriggerStatusEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static TriggerStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TriggerStatusEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TriggerStatusEnum) {
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
    @JsonProperty(value="trigger_status")
    
    private TriggerStatusEnum triggerStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event_type_code")
    
    private String eventTypeCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event_data")
    
    private Map<String, String> eventData = new HashMap<>();
    
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
        this.eventData.put(key, eventDataItem);
        return this;
    }

    public CreateFunctionTriggerRequestBody withEventData(Consumer<Map<String, String>> eventDataSetter) {
        if(this.eventData == null ){
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
        return Objects.equals(this.triggerTypeCode, createFunctionTriggerRequestBody.triggerTypeCode) &&
            Objects.equals(this.triggerStatus, createFunctionTriggerRequestBody.triggerStatus) &&
            Objects.equals(this.eventTypeCode, createFunctionTriggerRequestBody.eventTypeCode) &&
            Objects.equals(this.eventData, createFunctionTriggerRequestBody.eventData);
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

