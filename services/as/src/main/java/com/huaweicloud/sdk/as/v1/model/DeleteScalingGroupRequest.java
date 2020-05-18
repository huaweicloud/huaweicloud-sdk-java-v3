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
public class DeleteScalingGroupRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_group_id")
    
    private String scalingGroupId;
    /**
     * Gets or Sets forceDelete
     */
    public static class ForceDeleteEnum {

        
        /**
         * Enum TRUE for value: "true"
         */
        public static final ForceDeleteEnum TRUE = new ForceDeleteEnum("true");

        
        /**
         * Enum FALSE for value: "false"
         */
        public static final ForceDeleteEnum FALSE = new ForceDeleteEnum("false");

        

        public static Map<String, ForceDeleteEnum> staticFields =
                new HashMap<String, ForceDeleteEnum>() {
                    { 
                        put("true", TRUE);
                        put("false", FALSE);
                    }
                };

        private String value;

        ForceDeleteEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ForceDeleteEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            ForceDeleteEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ForceDeleteEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ForceDeleteEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ForceDeleteEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ForceDeleteEnum) {
                return this.value.equals(((ForceDeleteEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="force_delete")
    
    private ForceDeleteEnum forceDelete;

    public DeleteScalingGroupRequest withScalingGroupId(String scalingGroupId) {
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

    public DeleteScalingGroupRequest withForceDelete(ForceDeleteEnum forceDelete) {
        this.forceDelete = forceDelete;
        return this;
    }

    


    /**
     * Get forceDelete
     * @return forceDelete
     */
    public ForceDeleteEnum getForceDelete() {
        return forceDelete;
    }

    public void setForceDelete(ForceDeleteEnum forceDelete) {
        this.forceDelete = forceDelete;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteScalingGroupRequest deleteScalingGroupRequest = (DeleteScalingGroupRequest) o;
        return Objects.equals(this.scalingGroupId, deleteScalingGroupRequest.scalingGroupId) &&
            Objects.equals(this.forceDelete, deleteScalingGroupRequest.forceDelete);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scalingGroupId, forceDelete);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteScalingGroupRequest {\n");
            sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
            sb.append("    forceDelete: ").append(toIndentedString(forceDelete)).append("\n");
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

