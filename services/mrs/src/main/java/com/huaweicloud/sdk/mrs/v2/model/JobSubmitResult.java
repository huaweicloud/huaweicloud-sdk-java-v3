package com.huaweicloud.sdk.mrs.v2.model;




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
 * JobSubmitResult
 */
public class JobSubmitResult  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    

    private String jobId;
    /**
     * 作业提交状态。 枚举值： - COMPLETE：作业提交完成。 - FAILED：作业提交失败。
     */
    public static final class StateEnum {

        
        /**
         * Enum COMPLETE for value: "COMPLETE"
         */
        public static final StateEnum COMPLETE = new StateEnum("COMPLETE");
        
        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StateEnum FAILED = new StateEnum("FAILED");
        

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("COMPLETE", COMPLETE);
            map.put("FAILED", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StateEnum(value);
            }
            return result;
        }

        public static StateEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    

    private StateEnum state;

    public JobSubmitResult withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 作业ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    public JobSubmitResult withState(StateEnum state) {
        this.state = state;
        return this;
    }

    


    /**
     * 作业提交状态。 枚举值： - COMPLETE：作业提交完成。 - FAILED：作业提交失败。
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobSubmitResult jobSubmitResult = (JobSubmitResult) o;
        return Objects.equals(this.jobId, jobSubmitResult.jobId) &&
            Objects.equals(this.state, jobSubmitResult.state);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, state);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobSubmitResult {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

