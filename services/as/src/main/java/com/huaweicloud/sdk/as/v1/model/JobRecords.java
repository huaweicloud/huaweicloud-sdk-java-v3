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
 * 策略执行动作包含的具体任务
 */
public class JobRecords  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_name")
    
    private String jobName;
    /**
     * 记录类型。API：接口调用类型。MEG：消息类型。
     */
    public static final class RecordTypeEnum {

        
        /**
         * Enum API for value: "API"
         */
        public static final RecordTypeEnum API = new RecordTypeEnum("API");
        
        /**
         * Enum MEG for value: "MEG"
         */
        public static final RecordTypeEnum MEG = new RecordTypeEnum("MEG");
        

        private static final Map<String, RecordTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecordTypeEnum> createStaticFields() {
            Map<String, RecordTypeEnum> map = new HashMap<>();
            map.put("API", API);
            map.put("MEG", MEG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecordTypeEnum(String value) {
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
        public static RecordTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RecordTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RecordTypeEnum(value);
            }
            return result;
        }

        public static RecordTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RecordTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RecordTypeEnum) {
                return this.value.equals(((RecordTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="record_type")
    
    private RecordTypeEnum recordType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="record_time")
    
    private String recordTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request")
    
    private String request;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="response")
    
    private String response;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code")
    
    private String code;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message")
    
    private String message;
    /**
     * job执行状态：SUCCESS：成功。FAIL：失败。
     */
    public static final class JobStatusEnum {

        
        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final JobStatusEnum SUCCESS = new JobStatusEnum("SUCCESS");
        
        /**
         * Enum FAIL for value: "FAIL"
         */
        public static final JobStatusEnum FAIL = new JobStatusEnum("FAIL");
        

        private static final Map<String, JobStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobStatusEnum> createStaticFields() {
            Map<String, JobStatusEnum> map = new HashMap<>();
            map.put("SUCCESS", SUCCESS);
            map.put("FAIL", FAIL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobStatusEnum(String value) {
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
        public static JobStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            JobStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new JobStatusEnum(value);
            }
            return result;
        }

        public static JobStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            JobStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobStatusEnum) {
                return this.value.equals(((JobStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_status")
    
    private JobStatusEnum jobStatus;

    public JobRecords withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    


    /**
     * 任务名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    

    public JobRecords withRecordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
        return this;
    }

    


    /**
     * 记录类型。API：接口调用类型。MEG：消息类型。
     * @return recordType
     */
    public RecordTypeEnum getRecordType() {
        return recordType;
    }

    public void setRecordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
    }

    

    public JobRecords withRecordTime(String recordTime) {
        this.recordTime = recordTime;
        return this;
    }

    


    /**
     * 记录时间。
     * @return recordTime
     */
    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime;
    }

    

    public JobRecords withRequest(String request) {
        this.request = request;
        return this;
    }

    


    /**
     * 请求体，仅当record_type为API时有效
     * @return request
     */
    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    

    public JobRecords withResponse(String response) {
        this.response = response;
        return this;
    }

    


    /**
     * 返回体，仅当record_type为API时有效
     * @return response
     */
    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    

    public JobRecords withCode(String code) {
        this.code = code;
        return this;
    }

    


    /**
     * 返回码，仅当record_type为API时有效
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    

    public JobRecords withMessage(String message) {
        this.message = message;
        return this;
    }

    


    /**
     * 消息，仅当record_type为MEG时有效
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    

    public JobRecords withJobStatus(JobStatusEnum jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    


    /**
     * job执行状态：SUCCESS：成功。FAIL：失败。
     * @return jobStatus
     */
    public JobStatusEnum getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(JobStatusEnum jobStatus) {
        this.jobStatus = jobStatus;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobRecords jobRecords = (JobRecords) o;
        return Objects.equals(this.jobName, jobRecords.jobName) &&
            Objects.equals(this.recordType, jobRecords.recordType) &&
            Objects.equals(this.recordTime, jobRecords.recordTime) &&
            Objects.equals(this.request, jobRecords.request) &&
            Objects.equals(this.response, jobRecords.response) &&
            Objects.equals(this.code, jobRecords.code) &&
            Objects.equals(this.message, jobRecords.message) &&
            Objects.equals(this.jobStatus, jobRecords.jobStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobName, recordType, recordTime, request, response, code, message, jobStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobRecords {\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
        sb.append("    recordTime: ").append(toIndentedString(recordTime)).append("\n");
        sb.append("    request: ").append(toIndentedString(request)).append("\n");
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
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

