package com.huaweicloud.sdk.fgs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class DeleteFunctionTriggerRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="function_urn")
    
    private String functionUrn;
    /**
     * Gets or Sets triggerTypeCode
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="triggerId")
    
    private String triggerId;

    public DeleteFunctionTriggerRequest withFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
        return this;
    }

    


    /**
     * Get functionUrn
     * @return functionUrn
     */
    public String getFunctionUrn() {
        return functionUrn;
    }

    public void setFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
    }

    public DeleteFunctionTriggerRequest withTriggerTypeCode(TriggerTypeCodeEnum triggerTypeCode) {
        this.triggerTypeCode = triggerTypeCode;
        return this;
    }

    


    /**
     * Get triggerTypeCode
     * @return triggerTypeCode
     */
    public TriggerTypeCodeEnum getTriggerTypeCode() {
        return triggerTypeCode;
    }

    public void setTriggerTypeCode(TriggerTypeCodeEnum triggerTypeCode) {
        this.triggerTypeCode = triggerTypeCode;
    }

    public DeleteFunctionTriggerRequest withTriggerId(String triggerId) {
        this.triggerId = triggerId;
        return this;
    }

    


    /**
     * Get triggerId
     * @return triggerId
     */
    public String getTriggerId() {
        return triggerId;
    }

    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteFunctionTriggerRequest deleteFunctionTriggerRequest = (DeleteFunctionTriggerRequest) o;
        return Objects.equals(this.functionUrn, deleteFunctionTriggerRequest.functionUrn) &&
            Objects.equals(this.triggerTypeCode, deleteFunctionTriggerRequest.triggerTypeCode) &&
            Objects.equals(this.triggerId, deleteFunctionTriggerRequest.triggerId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(functionUrn, triggerTypeCode, triggerId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteFunctionTriggerRequest {\n");
            sb.append("    functionUrn: ").append(toIndentedString(functionUrn)).append("\n");
            sb.append("    triggerTypeCode: ").append(toIndentedString(triggerTypeCode)).append("\n");
            sb.append("    triggerId: ").append(toIndentedString(triggerId)).append("\n");
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

