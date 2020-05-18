package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.JobRecords;
import com.huaweicloud.sdk.as.v1.model.MetaData;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 伸缩策略执行日志列表
 */
public class ScalingPolicyExecuteLogList  {

    /**
     * 策略执行状态：SUCCESS：成功。FAIL：失败。EXECUTING：执行中
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
         * Enum EXECUTING for value: "EXECUTING"
         */
        public static final StatusEnum EXECUTING = new StatusEnum("EXECUTING");

        

        public static Map<String, StatusEnum> staticFields =
                new HashMap<String, StatusEnum>() {
                    { 
                        put("SUCCESS", SUCCESS);
                        put("FAIL", FAIL);
                        put("EXECUTING", EXECUTING);
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
    @JsonProperty(value="failed_reason")
    
    private String failedReason;
    /**
     * 策略执行类型：SCHEDULE：自动触发（定时）。RECURRENCE：自动触发（周期）。ALARM：自动警告（告警）。MANUAL：手动触发
     */
    public static class ExecuteTypeEnum {

        
        /**
         * Enum SCHEDULE for value: "SCHEDULE"
         */
        public static final ExecuteTypeEnum SCHEDULE = new ExecuteTypeEnum("SCHEDULE");

        
        /**
         * Enum RECURRENCE for value: "RECURRENCE"
         */
        public static final ExecuteTypeEnum RECURRENCE = new ExecuteTypeEnum("RECURRENCE");

        
        /**
         * Enum ALARM for value: "ALARM"
         */
        public static final ExecuteTypeEnum ALARM = new ExecuteTypeEnum("ALARM");

        
        /**
         * Enum MANUAL for value: "MANUAL"
         */
        public static final ExecuteTypeEnum MANUAL = new ExecuteTypeEnum("MANUAL");

        

        public static Map<String, ExecuteTypeEnum> staticFields =
                new HashMap<String, ExecuteTypeEnum>() {
                    { 
                        put("SCHEDULE", SCHEDULE);
                        put("RECURRENCE", RECURRENCE);
                        put("ALARM", ALARM);
                        put("MANUAL", MANUAL);
                    }
                };

        private String value;

        ExecuteTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ExecuteTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            ExecuteTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ExecuteTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ExecuteTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ExecuteTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ExecuteTypeEnum) {
                return this.value.equals(((ExecuteTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execute_type")
    
    private ExecuteTypeEnum executeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execute_time")
    
    private OffsetDateTime executeTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_policy_id")
    
    private String scalingPolicyId;
    /**
     * 伸缩资源类型：伸缩组：SCALING_GROUP 带宽：BANDWIDTH
     */
    public static class ScalingResourceTypeEnum {

        
        /**
         * Enum SCALING_GROUP for value: "SCALING_GROUP"
         */
        public static final ScalingResourceTypeEnum SCALING_GROUP = new ScalingResourceTypeEnum("SCALING_GROUP");

        
        /**
         * Enum BANDWIDTH for value: "BANDWIDTH"
         */
        public static final ScalingResourceTypeEnum BANDWIDTH = new ScalingResourceTypeEnum("BANDWIDTH");

        

        public static Map<String, ScalingResourceTypeEnum> staticFields =
                new HashMap<String, ScalingResourceTypeEnum>() {
                    { 
                        put("SCALING_GROUP", SCALING_GROUP);
                        put("BANDWIDTH", BANDWIDTH);
                    }
                };

        private String value;

        ScalingResourceTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ScalingResourceTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            ScalingResourceTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ScalingResourceTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ScalingResourceTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ScalingResourceTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ScalingResourceTypeEnum) {
                return this.value.equals(((ScalingResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_resource_type")
    
    private ScalingResourceTypeEnum scalingResourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_resource_id")
    
    private String scalingResourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="old_value")
    
    private String oldValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="desire_value")
    
    private String desireValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit_value")
    
    private Integer limitValue;
    /**
     * 策略执行任务类型。ADD：添加。REMOVE：减少。SET：设置为
     */
    public static class TypeEnum {

        
        /**
         * Enum ADD for value: "ADD"
         */
        public static final TypeEnum ADD = new TypeEnum("ADD");

        
        /**
         * Enum REMOVE for value: "REMOVE"
         */
        public static final TypeEnum REMOVE = new TypeEnum("REMOVE");

        
        /**
         * Enum SET for value: "SET"
         */
        public static final TypeEnum SET = new TypeEnum("SET");

        

        public static Map<String, TypeEnum> staticFields =
                new HashMap<String, TypeEnum>() {
                    { 
                        put("ADD", ADD);
                        put("REMOVE", REMOVE);
                        put("SET", SET);
                    }
                };

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            TypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new TypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TypeEnum) {
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_records")
    
    private List<JobRecords> jobRecords = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="meta_data")
    
    private MetaData metaData = null;

    public ScalingPolicyExecuteLogList withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 策略执行状态：SUCCESS：成功。FAIL：失败。EXECUTING：执行中
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ScalingPolicyExecuteLogList withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    


    /**
     * 策略执行失败原因。
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public ScalingPolicyExecuteLogList withExecuteType(ExecuteTypeEnum executeType) {
        this.executeType = executeType;
        return this;
    }

    


    /**
     * 策略执行类型：SCHEDULE：自动触发（定时）。RECURRENCE：自动触发（周期）。ALARM：自动警告（告警）。MANUAL：手动触发
     * @return executeType
     */
    public ExecuteTypeEnum getExecuteType() {
        return executeType;
    }

    public void setExecuteType(ExecuteTypeEnum executeType) {
        this.executeType = executeType;
    }

    public ScalingPolicyExecuteLogList withExecuteTime(OffsetDateTime executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    


    /**
     * 策略执行时间，遵循UTC时间。
     * @return executeTime
     */
    public OffsetDateTime getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(OffsetDateTime executeTime) {
        this.executeTime = executeTime;
    }

    public ScalingPolicyExecuteLogList withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 策略执行日志ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScalingPolicyExecuteLogList withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 租户id。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ScalingPolicyExecuteLogList withScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
        return this;
    }

    


    /**
     * 伸缩策略ID。
     * @return scalingPolicyId
     */
    public String getScalingPolicyId() {
        return scalingPolicyId;
    }

    public void setScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
    }

    public ScalingPolicyExecuteLogList withScalingResourceType(ScalingResourceTypeEnum scalingResourceType) {
        this.scalingResourceType = scalingResourceType;
        return this;
    }

    


    /**
     * 伸缩资源类型：伸缩组：SCALING_GROUP 带宽：BANDWIDTH
     * @return scalingResourceType
     */
    public ScalingResourceTypeEnum getScalingResourceType() {
        return scalingResourceType;
    }

    public void setScalingResourceType(ScalingResourceTypeEnum scalingResourceType) {
        this.scalingResourceType = scalingResourceType;
    }

    public ScalingPolicyExecuteLogList withScalingResourceId(String scalingResourceId) {
        this.scalingResourceId = scalingResourceId;
        return this;
    }

    


    /**
     * 伸缩资源ID。
     * @return scalingResourceId
     */
    public String getScalingResourceId() {
        return scalingResourceId;
    }

    public void setScalingResourceId(String scalingResourceId) {
        this.scalingResourceId = scalingResourceId;
    }

    public ScalingPolicyExecuteLogList withOldValue(String oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    


    /**
     * 伸缩原始值。
     * @return oldValue
     */
    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public ScalingPolicyExecuteLogList withDesireValue(String desireValue) {
        this.desireValue = desireValue;
        return this;
    }

    


    /**
     * 伸缩目标值。
     * @return desireValue
     */
    public String getDesireValue() {
        return desireValue;
    }

    public void setDesireValue(String desireValue) {
        this.desireValue = desireValue;
    }

    public ScalingPolicyExecuteLogList withLimitValue(Integer limitValue) {
        this.limitValue = limitValue;
        return this;
    }

    


    /**
     * 操作限制。当scaling_resource_type为BANDWIDTH时，且operation不为SET时，limit_value生效，单位为Mbit/s。此时，当operation为ADD时，limit_value表示最高带宽限制；当operation为REDUCE时，limit_value表示最低带宽限制。
     * minimum: 0
     * maximum: 32768
     * @return limitValue
     */
    public Integer getLimitValue() {
        return limitValue;
    }

    public void setLimitValue(Integer limitValue) {
        this.limitValue = limitValue;
    }

    public ScalingPolicyExecuteLogList withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 策略执行任务类型。ADD：添加。REMOVE：减少。SET：设置为
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ScalingPolicyExecuteLogList withJobRecords(List<JobRecords> jobRecords) {
        this.jobRecords = jobRecords;
        return this;
    }

    
    public ScalingPolicyExecuteLogList addJobRecordsItem(JobRecords jobRecordsItem) {
        if (this.jobRecords == null) {
            this.jobRecords = new ArrayList<>();
        }
        this.jobRecords.add(jobRecordsItem);
        return this;
    }

    public ScalingPolicyExecuteLogList withJobRecords(Consumer<List<JobRecords>> jobRecordsSetter) {
        if(this.jobRecords == null ){
            this.jobRecords = new ArrayList<>();
        }
        jobRecordsSetter.accept(this.jobRecords);
        return this;
    }

    /**
     * 策略执行动作包含的具体任务
     * @return jobRecords
     */
    public List<JobRecords> getJobRecords() {
        return jobRecords;
    }

    public void setJobRecords(List<JobRecords> jobRecords) {
        this.jobRecords = jobRecords;
    }

    public ScalingPolicyExecuteLogList withMetaData(MetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public ScalingPolicyExecuteLogList withMetaData(Consumer<MetaData> metaDataSetter) {
        if(this.metaData == null ){
            this.metaData = new MetaData();
        }
        metaDataSetter.accept(this.metaData);
        return this;
    }


    /**
     * Get metaData
     * @return metaData
     */
    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScalingPolicyExecuteLogList scalingPolicyExecuteLogList = (ScalingPolicyExecuteLogList) o;
        return Objects.equals(this.status, scalingPolicyExecuteLogList.status) &&
            Objects.equals(this.failedReason, scalingPolicyExecuteLogList.failedReason) &&
            Objects.equals(this.executeType, scalingPolicyExecuteLogList.executeType) &&
            Objects.equals(this.executeTime, scalingPolicyExecuteLogList.executeTime) &&
            Objects.equals(this.id, scalingPolicyExecuteLogList.id) &&
            Objects.equals(this.projectId, scalingPolicyExecuteLogList.projectId) &&
            Objects.equals(this.scalingPolicyId, scalingPolicyExecuteLogList.scalingPolicyId) &&
            Objects.equals(this.scalingResourceType, scalingPolicyExecuteLogList.scalingResourceType) &&
            Objects.equals(this.scalingResourceId, scalingPolicyExecuteLogList.scalingResourceId) &&
            Objects.equals(this.oldValue, scalingPolicyExecuteLogList.oldValue) &&
            Objects.equals(this.desireValue, scalingPolicyExecuteLogList.desireValue) &&
            Objects.equals(this.limitValue, scalingPolicyExecuteLogList.limitValue) &&
            Objects.equals(this.type, scalingPolicyExecuteLogList.type) &&
            Objects.equals(this.jobRecords, scalingPolicyExecuteLogList.jobRecords) &&
            Objects.equals(this.metaData, scalingPolicyExecuteLogList.metaData);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status, failedReason, executeType, executeTime, id, projectId, scalingPolicyId, scalingResourceType, scalingResourceId, oldValue, desireValue, limitValue, type, jobRecords, metaData);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScalingPolicyExecuteLogList {\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
            sb.append("    executeType: ").append(toIndentedString(executeType)).append("\n");
            sb.append("    executeTime: ").append(toIndentedString(executeTime)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
            sb.append("    scalingPolicyId: ").append(toIndentedString(scalingPolicyId)).append("\n");
            sb.append("    scalingResourceType: ").append(toIndentedString(scalingResourceType)).append("\n");
            sb.append("    scalingResourceId: ").append(toIndentedString(scalingResourceId)).append("\n");
            sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
            sb.append("    desireValue: ").append(toIndentedString(desireValue)).append("\n");
            sb.append("    limitValue: ").append(toIndentedString(limitValue)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    jobRecords: ").append(toIndentedString(jobRecords)).append("\n");
            sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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

