package com.huaweicloud.sdk.as.v1.model;




import java.util.Collections;

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
public class ListScalingActivityV2LogsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_group_id")
    
    private String scalingGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_id")
    
    private String logId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_number")
    
    private Integer startNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;
    /**
     * 查询的伸缩活动类型（查询多类型使用逗号分隔）：NORMAL：普通伸缩活动；MANNUAL_REMOVE：从伸缩组手动移除实例；MANNUAL_DELETE：从伸缩组手动移除实例并删除实例；ELB_CHECK_DELETE：ELB检查移除并删除实例；DIFF：期望实例数与实际实例 不一致；MODIFY_ELB：LB迁移
     */
    public static final class TypeEnum {

        
        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final TypeEnum NORMAL = new TypeEnum("NORMAL");
        
        /**
         * Enum MANNUAL_REMOVE for value: "MANNUAL_REMOVE"
         */
        public static final TypeEnum MANNUAL_REMOVE = new TypeEnum("MANNUAL_REMOVE");
        
        /**
         * Enum MANNUAL_DELETE for value: "MANNUAL_DELETE"
         */
        public static final TypeEnum MANNUAL_DELETE = new TypeEnum("MANNUAL_DELETE");
        
        /**
         * Enum MANNUAL_ADD for value: "MANNUAL_ADD"
         */
        public static final TypeEnum MANNUAL_ADD = new TypeEnum("MANNUAL_ADD");
        
        /**
         * Enum ELB_CHECK_DELETE for value: "ELB_CHECK_DELETE"
         */
        public static final TypeEnum ELB_CHECK_DELETE = new TypeEnum("ELB_CHECK_DELETE");
        
        /**
         * Enum AUDIT_CHECK_DELETE for value: "AUDIT_CHECK_DELETE"
         */
        public static final TypeEnum AUDIT_CHECK_DELETE = new TypeEnum("AUDIT_CHECK_DELETE");
        
        /**
         * Enum MODIFY_ELB for value: "MODIFY_ELB"
         */
        public static final TypeEnum MODIFY_ELB = new TypeEnum("MODIFY_ELB");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("NORMAL", NORMAL);
            map.put("MANNUAL_REMOVE", MANNUAL_REMOVE);
            map.put("MANNUAL_DELETE", MANNUAL_DELETE);
            map.put("MANNUAL_ADD", MANNUAL_ADD);
            map.put("ELB_CHECK_DELETE", ELB_CHECK_DELETE);
            map.put("AUDIT_CHECK_DELETE", AUDIT_CHECK_DELETE);
            map.put("MODIFY_ELB", MODIFY_ELB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private TypeEnum type;
    /**
     * 查询的伸缩活动状态：SUCCESS：成功；FAIL：失败；DOING：伸缩中
     */
    public static final class StatusEnum {

        
        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("SUCCESS");
        
        /**
         * Enum FAIL for value: "FAIL"
         */
        public static final StatusEnum FAIL = new StatusEnum("FAIL");
        
        /**
         * Enum DOING for value: "DOING"
         */
        public static final StatusEnum DOING = new StatusEnum("DOING");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("SUCCESS", SUCCESS);
            map.put("FAIL", FAIL);
            map.put("DOING", DOING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;

    public ListScalingActivityV2LogsRequest withScalingGroupId(String scalingGroupId) {
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

    

    public ListScalingActivityV2LogsRequest withLogId(String logId) {
        this.logId = logId;
        return this;
    }

    


    /**
     * 伸缩活动日志ID
     * @return logId
     */
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    

    public ListScalingActivityV2LogsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 查询的起始时间，格式是“yyyy-MM-ddThh:mm:ssZ”。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public ListScalingActivityV2LogsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 查询的截止时间，格式是“yyyy-MM-ddThh:mm:ssZ”。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public ListScalingActivityV2LogsRequest withStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
        return this;
    }

    


    /**
     * 查询的起始行号，默认为0。
     * maximum: 32768
     * @return startNumber
     */
    public Integer getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
    }

    

    public ListScalingActivityV2LogsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询记录数，默认20，最大100。
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListScalingActivityV2LogsRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 查询的伸缩活动类型（查询多类型使用逗号分隔）：NORMAL：普通伸缩活动；MANNUAL_REMOVE：从伸缩组手动移除实例；MANNUAL_DELETE：从伸缩组手动移除实例并删除实例；ELB_CHECK_DELETE：ELB检查移除并删除实例；DIFF：期望实例数与实际实例 不一致；MODIFY_ELB：LB迁移
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public ListScalingActivityV2LogsRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 查询的伸缩活动状态：SUCCESS：成功；FAIL：失败；DOING：伸缩中
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListScalingActivityV2LogsRequest listScalingActivityV2LogsRequest = (ListScalingActivityV2LogsRequest) o;
        return Objects.equals(this.scalingGroupId, listScalingActivityV2LogsRequest.scalingGroupId) &&
            Objects.equals(this.logId, listScalingActivityV2LogsRequest.logId) &&
            Objects.equals(this.startTime, listScalingActivityV2LogsRequest.startTime) &&
            Objects.equals(this.endTime, listScalingActivityV2LogsRequest.endTime) &&
            Objects.equals(this.startNumber, listScalingActivityV2LogsRequest.startNumber) &&
            Objects.equals(this.limit, listScalingActivityV2LogsRequest.limit) &&
            Objects.equals(this.type, listScalingActivityV2LogsRequest.type) &&
            Objects.equals(this.status, listScalingActivityV2LogsRequest.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scalingGroupId, logId, startTime, endTime, startNumber, limit, type, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScalingActivityV2LogsRequest {\n");
        sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
        sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    startNumber: ").append(toIndentedString(startNumber)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

