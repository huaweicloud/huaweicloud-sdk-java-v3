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
public class ListScalingInstancesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_group_id")
    
    private String scalingGroupId;
    /**
     * Gets or Sets lifeCycleState
     */
    public static class LifeCycleStateEnum {

        
        /**
         * Enum INSERVICE for value: "INSERVICE"
         */
        public static final LifeCycleStateEnum INSERVICE = new LifeCycleStateEnum("INSERVICE");

        
        /**
         * Enum PENDING for value: "PENDING"
         */
        public static final LifeCycleStateEnum PENDING = new LifeCycleStateEnum("PENDING");

        
        /**
         * Enum REMOVING for value: "REMOVING"
         */
        public static final LifeCycleStateEnum REMOVING = new LifeCycleStateEnum("REMOVING");

        
        /**
         * Enum PENDING_WAIT for value: "PENDING_WAIT"
         */
        public static final LifeCycleStateEnum PENDING_WAIT = new LifeCycleStateEnum("PENDING_WAIT");

        
        /**
         * Enum REMOVING_WAIT for value: "REMOVING_WAIT"
         */
        public static final LifeCycleStateEnum REMOVING_WAIT = new LifeCycleStateEnum("REMOVING_WAIT");

        
        /**
         * Enum STANDBY for value: "STANDBY"
         */
        public static final LifeCycleStateEnum STANDBY = new LifeCycleStateEnum("STANDBY");

        
        /**
         * Enum ENTERING_STANDBY for value: "ENTERING_STANDBY"
         */
        public static final LifeCycleStateEnum ENTERING_STANDBY = new LifeCycleStateEnum("ENTERING_STANDBY");

        

        public static Map<String, LifeCycleStateEnum> staticFields =
                new HashMap<String, LifeCycleStateEnum>() {
                    { 
                        put("INSERVICE", INSERVICE);
                        put("PENDING", PENDING);
                        put("REMOVING", REMOVING);
                        put("PENDING_WAIT", PENDING_WAIT);
                        put("REMOVING_WAIT", REMOVING_WAIT);
                        put("STANDBY", STANDBY);
                        put("ENTERING_STANDBY", ENTERING_STANDBY);
                    }
                };

        private String value;

        LifeCycleStateEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LifeCycleStateEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            LifeCycleStateEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new LifeCycleStateEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static LifeCycleStateEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            LifeCycleStateEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof LifeCycleStateEnum) {
                return this.value.equals(((LifeCycleStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="life_cycle_state")
    
    private LifeCycleStateEnum lifeCycleState;
    /**
     * Gets or Sets healthStatus
     */
    public static class HealthStatusEnum {

        
        /**
         * Enum INITIALIZING for value: "INITIALIZING"
         */
        public static final HealthStatusEnum INITIALIZING = new HealthStatusEnum("INITIALIZING");

        
        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final HealthStatusEnum NORMAL = new HealthStatusEnum("NORMAL");

        
        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final HealthStatusEnum ERROR = new HealthStatusEnum("ERROR");

        

        public static Map<String, HealthStatusEnum> staticFields =
                new HashMap<String, HealthStatusEnum>() {
                    { 
                        put("INITIALIZING", INITIALIZING);
                        put("NORMAL", NORMAL);
                        put("ERROR", ERROR);
                    }
                };

        private String value;

        HealthStatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static HealthStatusEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            HealthStatusEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new HealthStatusEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static HealthStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            HealthStatusEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof HealthStatusEnum) {
                return this.value.equals(((HealthStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="health_status")
    
    private HealthStatusEnum healthStatus;
    /**
     * Gets or Sets protectFromScalingDown
     */
    public static class ProtectFromScalingDownEnum {

        
        /**
         * Enum TRUE for value: "true"
         */
        public static final ProtectFromScalingDownEnum TRUE = new ProtectFromScalingDownEnum("true");

        
        /**
         * Enum FALSE for value: "false"
         */
        public static final ProtectFromScalingDownEnum FALSE = new ProtectFromScalingDownEnum("false");

        

        public static Map<String, ProtectFromScalingDownEnum> staticFields =
                new HashMap<String, ProtectFromScalingDownEnum>() {
                    { 
                        put("true", TRUE);
                        put("false", FALSE);
                    }
                };

        private String value;

        ProtectFromScalingDownEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProtectFromScalingDownEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            ProtectFromScalingDownEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ProtectFromScalingDownEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ProtectFromScalingDownEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ProtectFromScalingDownEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ProtectFromScalingDownEnum) {
                return this.value.equals(((ProtectFromScalingDownEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protect_from_scaling_down")
    
    private ProtectFromScalingDownEnum protectFromScalingDown;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_number")
    
    private Integer startNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;

    public ListScalingInstancesRequest withScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }

    


    /**
     * Get scalingGroupId
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return scalingGroupId;
    }

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    public ListScalingInstancesRequest withLifeCycleState(LifeCycleStateEnum lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
        return this;
    }

    


    /**
     * Get lifeCycleState
     * @return lifeCycleState
     */
    public LifeCycleStateEnum getLifeCycleState() {
        return lifeCycleState;
    }

    public void setLifeCycleState(LifeCycleStateEnum lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
    }

    public ListScalingInstancesRequest withHealthStatus(HealthStatusEnum healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    


    /**
     * Get healthStatus
     * @return healthStatus
     */
    public HealthStatusEnum getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(HealthStatusEnum healthStatus) {
        this.healthStatus = healthStatus;
    }

    public ListScalingInstancesRequest withProtectFromScalingDown(ProtectFromScalingDownEnum protectFromScalingDown) {
        this.protectFromScalingDown = protectFromScalingDown;
        return this;
    }

    


    /**
     * Get protectFromScalingDown
     * @return protectFromScalingDown
     */
    public ProtectFromScalingDownEnum getProtectFromScalingDown() {
        return protectFromScalingDown;
    }

    public void setProtectFromScalingDown(ProtectFromScalingDownEnum protectFromScalingDown) {
        this.protectFromScalingDown = protectFromScalingDown;
    }

    public ListScalingInstancesRequest withStartNumber(Integer startNumber) {
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

    public ListScalingInstancesRequest withLimit(Integer limit) {
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
        ListScalingInstancesRequest listScalingInstancesRequest = (ListScalingInstancesRequest) o;
        return Objects.equals(this.scalingGroupId, listScalingInstancesRequest.scalingGroupId) &&
            Objects.equals(this.lifeCycleState, listScalingInstancesRequest.lifeCycleState) &&
            Objects.equals(this.healthStatus, listScalingInstancesRequest.healthStatus) &&
            Objects.equals(this.protectFromScalingDown, listScalingInstancesRequest.protectFromScalingDown) &&
            Objects.equals(this.startNumber, listScalingInstancesRequest.startNumber) &&
            Objects.equals(this.limit, listScalingInstancesRequest.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scalingGroupId, lifeCycleState, healthStatus, protectFromScalingDown, startNumber, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScalingInstancesRequest {\n");
            sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
            sb.append("    lifeCycleState: ").append(toIndentedString(lifeCycleState)).append("\n");
            sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
            sb.append("    protectFromScalingDown: ").append(toIndentedString(protectFromScalingDown)).append("\n");
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

