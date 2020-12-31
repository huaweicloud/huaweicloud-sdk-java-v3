package com.huaweicloud.sdk.drs.v3.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.EndpointVO;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 主备倒换响应体
 */
public class SwitchoverResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    private String updatedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_db")
    
    private EndpointVO sourceDb = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_db")
    
    private EndpointVO targetDb = null;
    /**
     * 任务方向。
     */
    public static final class JobDirectionEnum {

        
        /**
         * Enum UP_ for value: "up 入云 灾备场景时对应本云为备"
         */
        public static final JobDirectionEnum UP_ = new JobDirectionEnum("up 入云 灾备场景时对应本云为备");
        
        /**
         * Enum DOWN_ for value: "down 出云 灾备场景时对应本云为主"
         */
        public static final JobDirectionEnum DOWN_ = new JobDirectionEnum("down 出云 灾备场景时对应本云为主");
        
        /**
         * Enum NON_DBS_ for value: "non-dbs 自建"
         */
        public static final JobDirectionEnum NON_DBS_ = new JobDirectionEnum("non-dbs 自建");
        

        private static final Map<String, JobDirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobDirectionEnum> createStaticFields() {
            Map<String, JobDirectionEnum> map = new HashMap<>();
            map.put("up 入云 灾备场景时对应本云为备", UP_);
            map.put("down 出云 灾备场景时对应本云为主", DOWN_);
            map.put("non-dbs 自建", NON_DBS_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobDirectionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static JobDirectionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            JobDirectionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new JobDirectionEnum(value);
            }
            return result;
        }

        public static JobDirectionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            JobDirectionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof JobDirectionEnum) {
                return this.value.equals(((JobDirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_direction")
    
    private JobDirectionEnum jobDirection;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_target_readonly")
    
    private Boolean isTargetReadonly;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    
    private String errorMsg;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    private String errorCode;

    public SwitchoverResp withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public SwitchoverResp withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 更新时间，格式yyyy-MM-dd'T'HH:mm:ss'Z'
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public SwitchoverResp withSourceDb(EndpointVO sourceDb) {
        this.sourceDb = sourceDb;
        return this;
    }

    public SwitchoverResp withSourceDb(Consumer<EndpointVO> sourceDbSetter) {
        if(this.sourceDb == null ){
            this.sourceDb = new EndpointVO();
            sourceDbSetter.accept(this.sourceDb);
        }
        
        return this;
    }


    /**
     * Get sourceDb
     * @return sourceDb
     */
    public EndpointVO getSourceDb() {
        return sourceDb;
    }

    public void setSourceDb(EndpointVO sourceDb) {
        this.sourceDb = sourceDb;
    }

    public SwitchoverResp withTargetDb(EndpointVO targetDb) {
        this.targetDb = targetDb;
        return this;
    }

    public SwitchoverResp withTargetDb(Consumer<EndpointVO> targetDbSetter) {
        if(this.targetDb == null ){
            this.targetDb = new EndpointVO();
            targetDbSetter.accept(this.targetDb);
        }
        
        return this;
    }


    /**
     * Get targetDb
     * @return targetDb
     */
    public EndpointVO getTargetDb() {
        return targetDb;
    }

    public void setTargetDb(EndpointVO targetDb) {
        this.targetDb = targetDb;
    }

    public SwitchoverResp withJobDirection(JobDirectionEnum jobDirection) {
        this.jobDirection = jobDirection;
        return this;
    }

    


    /**
     * 任务方向。
     * @return jobDirection
     */
    public JobDirectionEnum getJobDirection() {
        return jobDirection;
    }

    public void setJobDirection(JobDirectionEnum jobDirection) {
        this.jobDirection = jobDirection;
    }

    public SwitchoverResp withIsTargetReadonly(Boolean isTargetReadonly) {
        this.isTargetReadonly = isTargetReadonly;
        return this;
    }

    


    /**
     * 目标库是否只读。
     * @return isTargetReadonly
     */
    public Boolean getIsTargetReadonly() {
        return isTargetReadonly;
    }

    public void setIsTargetReadonly(Boolean isTargetReadonly) {
        this.isTargetReadonly = isTargetReadonly;
    }

    public SwitchoverResp withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    


    /**
     * 错误信息。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public SwitchoverResp withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SwitchoverResp switchoverResp = (SwitchoverResp) o;
        return Objects.equals(this.jobId, switchoverResp.jobId) &&
            Objects.equals(this.updatedAt, switchoverResp.updatedAt) &&
            Objects.equals(this.sourceDb, switchoverResp.sourceDb) &&
            Objects.equals(this.targetDb, switchoverResp.targetDb) &&
            Objects.equals(this.jobDirection, switchoverResp.jobDirection) &&
            Objects.equals(this.isTargetReadonly, switchoverResp.isTargetReadonly) &&
            Objects.equals(this.errorMsg, switchoverResp.errorMsg) &&
            Objects.equals(this.errorCode, switchoverResp.errorCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, updatedAt, sourceDb, targetDb, jobDirection, isTargetReadonly, errorMsg, errorCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchoverResp {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    sourceDb: ").append(toIndentedString(sourceDb)).append("\n");
        sb.append("    targetDb: ").append(toIndentedString(targetDb)).append("\n");
        sb.append("    jobDirection: ").append(toIndentedString(jobDirection)).append("\n");
        sb.append("    isTargetReadonly: ").append(toIndentedString(isTargetReadonly)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

