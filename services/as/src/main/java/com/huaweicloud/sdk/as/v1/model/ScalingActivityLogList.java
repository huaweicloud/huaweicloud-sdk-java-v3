package com.huaweicloud.sdk.as.v1.model;

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
 * 伸缩活动日志列表。
 */
public class ScalingActivityLogList  {

    /**
     * 伸缩活动状态：SUCCESS：成功。FAIL：失败。DOING：伸缩过程中。
     */
    public static class StatusEnum {

        
        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("SUCCESS");

        
        /**
         * Enum FAIL for value: "FAIL"
         */
        public static final StatusEnum FAIL = new StatusEnum("FAIL");

        
        /**
         * Enum DING for value: "DING"
         */
        public static final StatusEnum DING = new StatusEnum("DING");

        

        public static Map<String, StatusEnum> staticFields =
                new HashMap<String, StatusEnum>() {
                    { 
                        put("SUCCESS", SUCCESS);
                        put("FAIL", FAIL);
                        put("DING", DING);
                    }
                };

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new StatusEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private OffsetDateTime startTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private OffsetDateTime endTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_removed_list")
    
    private String instanceRemovedList;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_deleted_list")
    
    private String instanceDeletedList;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_added_list")
    
    private String instanceAddedList;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_value")
    
    private String scalingValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_value")
    
    private Integer instanceValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="desire_value")
    
    private Integer desireValue;

    public ScalingActivityLogList withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 伸缩活动状态：SUCCESS：成功。FAIL：失败。DOING：伸缩过程中。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ScalingActivityLogList withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 伸缩活动触发时间，遵循UTC时间。
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public ScalingActivityLogList withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 伸缩活动结束时间，遵循UTC时间。
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public ScalingActivityLogList withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 伸缩活动日志ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScalingActivityLogList withInstanceRemovedList(String instanceRemovedList) {
        this.instanceRemovedList = instanceRemovedList;
        return this;
    }

    


    /**
     * 完成伸缩活动且只被移出弹性伸缩组的云服务器名称列表，云服务器名之间以逗号分隔。
     * @return instanceRemovedList
     */
    public String getInstanceRemovedList() {
        return instanceRemovedList;
    }

    public void setInstanceRemovedList(String instanceRemovedList) {
        this.instanceRemovedList = instanceRemovedList;
    }

    public ScalingActivityLogList withInstanceDeletedList(String instanceDeletedList) {
        this.instanceDeletedList = instanceDeletedList;
        return this;
    }

    


    /**
     * 完成伸缩活动且被移出弹性伸缩组并删除的云服务器名称列表，云服务器名之间以逗号分隔。
     * @return instanceDeletedList
     */
    public String getInstanceDeletedList() {
        return instanceDeletedList;
    }

    public void setInstanceDeletedList(String instanceDeletedList) {
        this.instanceDeletedList = instanceDeletedList;
    }

    public ScalingActivityLogList withInstanceAddedList(String instanceAddedList) {
        this.instanceAddedList = instanceAddedList;
        return this;
    }

    


    /**
     * 完成伸缩活动且被加入弹性伸缩组的云服务器名称列表，云服务器名之间以逗号分割。
     * @return instanceAddedList
     */
    public String getInstanceAddedList() {
        return instanceAddedList;
    }

    public void setInstanceAddedList(String instanceAddedList) {
        this.instanceAddedList = instanceAddedList;
    }

    public ScalingActivityLogList withScalingValue(String scalingValue) {
        this.scalingValue = scalingValue;
        return this;
    }

    


    /**
     * 伸缩活动中变化（增加或减少）的云服务器数量。
     * @return scalingValue
     */
    public String getScalingValue() {
        return scalingValue;
    }

    public void setScalingValue(String scalingValue) {
        this.scalingValue = scalingValue;
    }

    public ScalingActivityLogList withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 伸缩活动的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ScalingActivityLogList withInstanceValue(Integer instanceValue) {
        this.instanceValue = instanceValue;
        return this;
    }

    


    /**
     * 伸缩组当前instance值。
     * @return instanceValue
     */
    public Integer getInstanceValue() {
        return instanceValue;
    }

    public void setInstanceValue(Integer instanceValue) {
        this.instanceValue = instanceValue;
    }

    public ScalingActivityLogList withDesireValue(Integer desireValue) {
        this.desireValue = desireValue;
        return this;
    }

    


    /**
     * 伸缩活动最终desire值。
     * @return desireValue
     */
    public Integer getDesireValue() {
        return desireValue;
    }

    public void setDesireValue(Integer desireValue) {
        this.desireValue = desireValue;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScalingActivityLogList scalingActivityLogList = (ScalingActivityLogList) o;
        return Objects.equals(this.status, scalingActivityLogList.status) &&
            Objects.equals(this.startTime, scalingActivityLogList.startTime) &&
            Objects.equals(this.endTime, scalingActivityLogList.endTime) &&
            Objects.equals(this.id, scalingActivityLogList.id) &&
            Objects.equals(this.instanceRemovedList, scalingActivityLogList.instanceRemovedList) &&
            Objects.equals(this.instanceDeletedList, scalingActivityLogList.instanceDeletedList) &&
            Objects.equals(this.instanceAddedList, scalingActivityLogList.instanceAddedList) &&
            Objects.equals(this.scalingValue, scalingActivityLogList.scalingValue) &&
            Objects.equals(this.description, scalingActivityLogList.description) &&
            Objects.equals(this.instanceValue, scalingActivityLogList.instanceValue) &&
            Objects.equals(this.desireValue, scalingActivityLogList.desireValue);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status, startTime, endTime, id, instanceRemovedList, instanceDeletedList, instanceAddedList, scalingValue, description, instanceValue, desireValue);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScalingActivityLogList {\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
            sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    instanceRemovedList: ").append(toIndentedString(instanceRemovedList)).append("\n");
            sb.append("    instanceDeletedList: ").append(toIndentedString(instanceDeletedList)).append("\n");
            sb.append("    instanceAddedList: ").append(toIndentedString(instanceAddedList)).append("\n");
            sb.append("    scalingValue: ").append(toIndentedString(scalingValue)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    instanceValue: ").append(toIndentedString(instanceValue)).append("\n");
            sb.append("    desireValue: ").append(toIndentedString(desireValue)).append("\n");
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

