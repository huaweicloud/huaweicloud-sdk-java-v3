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
public class DeleteScalingInstanceRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;
    /**
     * Gets or Sets instanceDelete
     */
    public static class InstanceDeleteEnum {

        
        /**
         * Enum YES for value: "yes"
         */
        public static final InstanceDeleteEnum YES = new InstanceDeleteEnum("yes");

        
        /**
         * Enum NO for value: "no"
         */
        public static final InstanceDeleteEnum NO = new InstanceDeleteEnum("no");

        

        public static Map<String, InstanceDeleteEnum> staticFields =
                new HashMap<String, InstanceDeleteEnum>() {
                    { 
                        put("yes", YES);
                        put("no", NO);
                    }
                };

        private String value;

        InstanceDeleteEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static InstanceDeleteEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            InstanceDeleteEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new InstanceDeleteEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static InstanceDeleteEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            InstanceDeleteEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof InstanceDeleteEnum) {
                return this.value.equals(((InstanceDeleteEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_delete")
    
    private InstanceDeleteEnum instanceDelete;

    public DeleteScalingInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DeleteScalingInstanceRequest withInstanceDelete(InstanceDeleteEnum instanceDelete) {
        this.instanceDelete = instanceDelete;
        return this;
    }

    


    /**
     * Get instanceDelete
     * @return instanceDelete
     */
    public InstanceDeleteEnum getInstanceDelete() {
        return instanceDelete;
    }

    public void setInstanceDelete(InstanceDeleteEnum instanceDelete) {
        this.instanceDelete = instanceDelete;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteScalingInstanceRequest deleteScalingInstanceRequest = (DeleteScalingInstanceRequest) o;
        return Objects.equals(this.instanceId, deleteScalingInstanceRequest.instanceId) &&
            Objects.equals(this.instanceDelete, deleteScalingInstanceRequest.instanceDelete);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, instanceDelete);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteScalingInstanceRequest {\n");
            sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
            sb.append("    instanceDelete: ").append(toIndentedString(instanceDelete)).append("\n");
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

