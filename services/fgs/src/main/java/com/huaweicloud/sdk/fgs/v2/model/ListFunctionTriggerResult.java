package com.huaweicloud.sdk.fgs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * ListFunctionTriggerResult
 */
public class ListFunctionTriggerResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trigger_id")
    
    private String triggerId;
    /**
     * 触发器类型。  - TIMER: \"定时触发器。\" - APIG: \"APIG触发器。\" - CTS: \"云审计服务触发器。\" - DDS: \"文档数据库服务触发器。\" - DMS: \"分布式服务触发器。\" - DIS: \"数据接入服务触发器。\" - LTS: \"云日志服务触发器。\" - OBS: \"对象存储触发器。\" - SMN: \"消息通知服务触发器。\" - KAFKA: \"专享版消息通知服务触发器。\"
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
         * Enum SMN for value: "SMN"
         */
        public static final TriggerTypeCodeEnum SMN = new TriggerTypeCodeEnum("SMN");

        
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
                        put("SMN", SMN);
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
     * \"触发器状态\"  - ACTIVE: 启用状态。 - DISABLE: 禁用状态。
     */
    public static class TriggerStatusEnum {

        
        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final TriggerStatusEnum ACTIVE = new TriggerStatusEnum("ACTIVE");

        
        /**
         * Enum DISABLE for value: "DISABLE"
         */
        public static final TriggerStatusEnum DISABLE = new TriggerStatusEnum("DISABLE");

        

        public static Map<String, TriggerStatusEnum> staticFields =
                new HashMap<String, TriggerStatusEnum>() {
                    { 
                        put("ACTIVE", ACTIVE);
                        put("DISABLE", DISABLE);
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
    @JsonProperty(value="event_data")
    
    private Object eventData = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_updated_time")
    
    private OffsetDateTime lastUpdatedTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_time")
    
    private OffsetDateTime createdTime = null;

    public ListFunctionTriggerResult withTriggerId(String triggerId) {
        this.triggerId = triggerId;
        return this;
    }

    


    /**
     * 触发器ID。
     * @return triggerId
     */
    public String getTriggerId() {
        return triggerId;
    }

    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }

    public ListFunctionTriggerResult withTriggerTypeCode(TriggerTypeCodeEnum triggerTypeCode) {
        this.triggerTypeCode = triggerTypeCode;
        return this;
    }

    


    /**
     * 触发器类型。  - TIMER: \"定时触发器。\" - APIG: \"APIG触发器。\" - CTS: \"云审计服务触发器。\" - DDS: \"文档数据库服务触发器。\" - DMS: \"分布式服务触发器。\" - DIS: \"数据接入服务触发器。\" - LTS: \"云日志服务触发器。\" - OBS: \"对象存储触发器。\" - SMN: \"消息通知服务触发器。\" - KAFKA: \"专享版消息通知服务触发器。\"
     * @return triggerTypeCode
     */
    public TriggerTypeCodeEnum getTriggerTypeCode() {
        return triggerTypeCode;
    }

    public void setTriggerTypeCode(TriggerTypeCodeEnum triggerTypeCode) {
        this.triggerTypeCode = triggerTypeCode;
    }

    public ListFunctionTriggerResult withTriggerStatus(TriggerStatusEnum triggerStatus) {
        this.triggerStatus = triggerStatus;
        return this;
    }

    


    /**
     * \"触发器状态\"  - ACTIVE: 启用状态。 - DISABLE: 禁用状态。
     * @return triggerStatus
     */
    public TriggerStatusEnum getTriggerStatus() {
        return triggerStatus;
    }

    public void setTriggerStatus(TriggerStatusEnum triggerStatus) {
        this.triggerStatus = triggerStatus;
    }

    public ListFunctionTriggerResult withEventData(Object eventData) {
        this.eventData = eventData;
        return this;
    }

    


    /**
     * 触发器源事件。
     * @return eventData
     */
    public Object getEventData() {
        return eventData;
    }

    public void setEventData(Object eventData) {
        this.eventData = eventData;
    }

    public ListFunctionTriggerResult withLastUpdatedTime(OffsetDateTime lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    


    /**
     * 最后更新时间。
     * @return lastUpdatedTime
     */
    public OffsetDateTime getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(OffsetDateTime lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public ListFunctionTriggerResult withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    


    /**
     * 触发器创建时间。
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
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
        ListFunctionTriggerResult listFunctionTriggerResult = (ListFunctionTriggerResult) o;
        return Objects.equals(this.triggerId, listFunctionTriggerResult.triggerId) &&
            Objects.equals(this.triggerTypeCode, listFunctionTriggerResult.triggerTypeCode) &&
            Objects.equals(this.triggerStatus, listFunctionTriggerResult.triggerStatus) &&
            Objects.equals(this.eventData, listFunctionTriggerResult.eventData) &&
            Objects.equals(this.lastUpdatedTime, listFunctionTriggerResult.lastUpdatedTime) &&
            Objects.equals(this.createdTime, listFunctionTriggerResult.createdTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(triggerId, triggerTypeCode, triggerStatus, eventData, lastUpdatedTime, createdTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionTriggerResult {\n");
            sb.append("    triggerId: ").append(toIndentedString(triggerId)).append("\n");
            sb.append("    triggerTypeCode: ").append(toIndentedString(triggerTypeCode)).append("\n");
            sb.append("    triggerStatus: ").append(toIndentedString(triggerStatus)).append("\n");
            sb.append("    eventData: ").append(toIndentedString(eventData)).append("\n");
            sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
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

