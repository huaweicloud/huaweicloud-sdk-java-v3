package com.huaweicloud.sdk.as.v1.model;

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
public class ListScalingGroupsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_group_name")
    
    private String scalingGroupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_configuration_id")
    
    private String scalingConfigurationId;
    /**
     * Gets or Sets scalingGroupStatus
     */
    public static class ScalingGroupStatusEnum {

        
        /**
         * Enum INSERVICE for value: "INSERVICE"
         */
        public static final ScalingGroupStatusEnum INSERVICE = new ScalingGroupStatusEnum("INSERVICE");

        
        /**
         * Enum PAUSED for value: "PAUSED"
         */
        public static final ScalingGroupStatusEnum PAUSED = new ScalingGroupStatusEnum("PAUSED");

        
        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final ScalingGroupStatusEnum ERROR = new ScalingGroupStatusEnum("ERROR");

        
        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final ScalingGroupStatusEnum DELETING = new ScalingGroupStatusEnum("DELETING");

        

        public static Map<String, ScalingGroupStatusEnum> staticFields =
                new HashMap<String, ScalingGroupStatusEnum>() {
                    { 
                        put("INSERVICE", INSERVICE);
                        put("PAUSED", PAUSED);
                        put("ERROR", ERROR);
                        put("DELETING", DELETING);
                    }
                };

        private String value;

        ScalingGroupStatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ScalingGroupStatusEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            ScalingGroupStatusEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ScalingGroupStatusEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ScalingGroupStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ScalingGroupStatusEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ScalingGroupStatusEnum) {
                return this.value.equals(((ScalingGroupStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_group_status")
    
    private ScalingGroupStatusEnum scalingGroupStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_number")
    
    private Integer startNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;

    public ListScalingGroupsRequest withScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
        return this;
    }

    


    /**
     * Get scalingGroupName
     * @return scalingGroupName
     */
    public String getScalingGroupName() {
        return scalingGroupName;
    }

    public void setScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
    }

    public ListScalingGroupsRequest withScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }

    


    /**
     * Get scalingConfigurationId
     * @return scalingConfigurationId
     */
    public String getScalingConfigurationId() {
        return scalingConfigurationId;
    }

    public void setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
    }

    public ListScalingGroupsRequest withScalingGroupStatus(ScalingGroupStatusEnum scalingGroupStatus) {
        this.scalingGroupStatus = scalingGroupStatus;
        return this;
    }

    


    /**
     * Get scalingGroupStatus
     * @return scalingGroupStatus
     */
    public ScalingGroupStatusEnum getScalingGroupStatus() {
        return scalingGroupStatus;
    }

    public void setScalingGroupStatus(ScalingGroupStatusEnum scalingGroupStatus) {
        this.scalingGroupStatus = scalingGroupStatus;
    }

    public ListScalingGroupsRequest withStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
        return this;
    }

    


    /**
     * Get startNumber
     * @return startNumber
     */
    public Integer getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
    }

    public ListScalingGroupsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListScalingGroupsRequest listScalingGroupsRequest = (ListScalingGroupsRequest) o;
        return Objects.equals(this.scalingGroupName, listScalingGroupsRequest.scalingGroupName) &&
            Objects.equals(this.scalingConfigurationId, listScalingGroupsRequest.scalingConfigurationId) &&
            Objects.equals(this.scalingGroupStatus, listScalingGroupsRequest.scalingGroupStatus) &&
            Objects.equals(this.startNumber, listScalingGroupsRequest.startNumber) &&
            Objects.equals(this.limit, listScalingGroupsRequest.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scalingGroupName, scalingConfigurationId, scalingGroupStatus, startNumber, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScalingGroupsRequest {\n");
            sb.append("    scalingGroupName: ").append(toIndentedString(scalingGroupName)).append("\n");
            sb.append("    scalingConfigurationId: ").append(toIndentedString(scalingConfigurationId)).append("\n");
            sb.append("    scalingGroupStatus: ").append(toIndentedString(scalingGroupStatus)).append("\n");
            sb.append("    startNumber: ").append(toIndentedString(startNumber)).append("\n");
            sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

