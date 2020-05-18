package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.JobEntities;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ShowJobResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="begin_time")
    
    private OffsetDateTime beginTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code")
    
    private String code;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private OffsetDateTime endTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="entities")
    
    private JobEntities entities = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fail_reason")
    
    private String failReason;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_type")
    
    private String jobType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message")
    
    private String message;
    /**
     * Job的状态。  - SUCCESS：成功。  - RUNNING：运行中。  - FAIL：失败。  - INIT：正在初始化。
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

    public ShowJobResponse withBeginTime(OffsetDateTime beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    


    /**
     * 开始时间。
     * @return beginTime
     */
    public OffsetDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(OffsetDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public ShowJobResponse withCode(String code) {
        this.code = code;
        return this;
    }

    


    /**
     * 查询Job的API请求出现错误时，返回的错误码。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ShowJobResponse withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 结束时间。
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
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

    public ShowJobResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * Job执行失败时的错误码。  Job执行成功后，该值为null。
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
     * Job执行失败时的错误原因。  Job执行成功后，该值为null。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public ShowJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 异步请求的任务ID。
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
     * 异步请求的任务类型。
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public ShowJobResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    


    /**
     * 查询Job的API请求出现错误时，返回的错误消息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowJobResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * Job的状态。  - SUCCESS：成功。  - RUNNING：运行中。  - FAIL：失败。  - INIT：正在初始化。
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
        ShowJobResponse showJobResponse = (ShowJobResponse) o;
        return Objects.equals(this.beginTime, showJobResponse.beginTime) &&
            Objects.equals(this.code, showJobResponse.code) &&
            Objects.equals(this.endTime, showJobResponse.endTime) &&
            Objects.equals(this.entities, showJobResponse.entities) &&
            Objects.equals(this.errorCode, showJobResponse.errorCode) &&
            Objects.equals(this.failReason, showJobResponse.failReason) &&
            Objects.equals(this.jobId, showJobResponse.jobId) &&
            Objects.equals(this.jobType, showJobResponse.jobType) &&
            Objects.equals(this.message, showJobResponse.message) &&
            Objects.equals(this.status, showJobResponse.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(beginTime, code, endTime, entities, errorCode, failReason, jobId, jobType, message, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobResponse {\n");
            sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
            sb.append("    code: ").append(toIndentedString(code)).append("\n");
            sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
            sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
            sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
            sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
            sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
            sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
            sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

