package com.huaweicloud.sdk.as.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteScalingGroupRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_group_id")
    
    private String scalingGroupId;
    /**
     * 是否强制删除伸缩组。默认为no；可选值为yes或no。
     */
    public static final class ForceDeleteEnum {

        
        /**
         * Enum YES for value: "yes"
         */
        public static final ForceDeleteEnum YES = new ForceDeleteEnum("yes");
        
        /**
         * Enum NO for value: "no"
         */
        public static final ForceDeleteEnum NO = new ForceDeleteEnum("no");
        

        private static final Map<String, ForceDeleteEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ForceDeleteEnum> createStaticFields() {
            Map<String, ForceDeleteEnum> map = new HashMap<>();
            map.put("yes", YES);
            map.put("no", NO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ForceDeleteEnum(String value) {
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
        public static ForceDeleteEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ForceDeleteEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ForceDeleteEnum(value);
            }
            return result;
        }

        public static ForceDeleteEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ForceDeleteEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ForceDeleteEnum) {
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
     * 伸缩组ID。
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
     * 是否强制删除伸缩组。默认为no；可选值为yes或no。
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

