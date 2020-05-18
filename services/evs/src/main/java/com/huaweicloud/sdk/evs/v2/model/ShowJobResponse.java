package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.JobEntities;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ShowJobResponse extends SdkResponse {

    /**
     * job的状态。SUCCESS：成功。RUNNING：运行中。FAIL：失败。INIT：正在初始化。
     */
    public static class StatusEnum {

        
        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("SUCCESS");

        
        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

        
        /**
         * Enum FAIL for value: "FAIL"
         */
        public static final StatusEnum FAIL = new StatusEnum("FAIL");

        
        /**
         * Enum INIT for value: "INIT"
         */
        public static final StatusEnum INIT = new StatusEnum("INIT");

        

        public static Map<String, StatusEnum> staticFields =
                new HashMap<String, StatusEnum>() {
                    { 
                        put("SUCCESS", SUCCESS);
                        put("RUNNING", RUNNING);
                        put("FAIL", FAIL);
                        put("INIT", INIT);
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
    @JsonProperty(value="entities")
    
    private JobEntities entities = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_type")
    
    private String jobType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="begin_time")
    
    private String beginTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fail_reason")
    
    private String failReason;

    public ShowJobResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * job的状态。SUCCESS：成功。RUNNING：运行中。FAIL：失败。INIT：正在初始化。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowJobResponse withEntities(JobEntities entities) {
        this.entities = entities;
        return this;
    }

    public ShowJobResponse withEntities(Consumer<JobEntities> entitiesSetter) {
        if(this.entities == null ){
            this.entities = new JobEntities();
        }
        entitiesSetter.accept(this.entities);
        return this;
    }


    /**
     * Get entities
     * @return entities
     */
    public JobEntities getEntities() {
        return entities;
    }

    public void setEntities(JobEntities entities) {
        this.entities = entities;
    }

    public ShowJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * job的ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowJobResponse withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    


    /**
     * job的类型。createVolume：创建单个云硬盘。batchCreateVolume：批量创建云硬盘。deleteVolume：删除单个云硬盘。extendVolume：扩容云硬盘。bulkDeleteVolume：批量删除云硬盘。deleteSingleVolume：批量删除时逐个删除单个云硬盘。retypeVolume：对云硬盘做硬盘类型变更。
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public ShowJobResponse withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    


    /**
     * 开始时间。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ShowJobResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowJobResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * job执行失败时的错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ShowJobResponse withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    


    /**
     * job执行失败时的错误原因。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobResponse showJobResponse = (ShowJobResponse) o;
        return Objects.equals(this.status, showJobResponse.status) &&
            Objects.equals(this.entities, showJobResponse.entities) &&
            Objects.equals(this.jobId, showJobResponse.jobId) &&
            Objects.equals(this.jobType, showJobResponse.jobType) &&
            Objects.equals(this.beginTime, showJobResponse.beginTime) &&
            Objects.equals(this.endTime, showJobResponse.endTime) &&
            Objects.equals(this.errorCode, showJobResponse.errorCode) &&
            Objects.equals(this.failReason, showJobResponse.failReason);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status, entities, jobId, jobType, beginTime, endTime, errorCode, failReason);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobResponse {\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
            sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
            sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
            sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
            sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
            sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
            sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
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

