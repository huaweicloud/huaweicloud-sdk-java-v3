package com.huaweicloud.sdk.drs.v3.model;




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
 * 暂停任务请求参数
 */
public class PauseInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    private String jobId;
    /**
     * 暂停类型
     */
    public static final class PauseModeEnum {

        
        /**
         * Enum SOURCE_ for value: "source:停日志抓取"
         */
        public static final PauseModeEnum SOURCE_ = new PauseModeEnum("source:停日志抓取");
        
        /**
         * Enum TARGET_ for value: "target:停回放"
         */
        public static final PauseModeEnum TARGET_ = new PauseModeEnum("target:停回放");
        
        /**
         * Enum ALL_ for value: "all:停日志抓取和回放"
         */
        public static final PauseModeEnum ALL_ = new PauseModeEnum("all:停日志抓取和回放");
        

        private static final Map<String, PauseModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PauseModeEnum> createStaticFields() {
            Map<String, PauseModeEnum> map = new HashMap<>();
            map.put("source:停日志抓取", SOURCE_);
            map.put("target:停回放", TARGET_);
            map.put("all:停日志抓取和回放", ALL_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PauseModeEnum(String value) {
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
        public static PauseModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            PauseModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PauseModeEnum(value);
            }
            return result;
        }

        public static PauseModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            PauseModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof PauseModeEnum) {
                return this.value.equals(((PauseModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pause_mode")
    
    private PauseModeEnum pauseMode;

    public PauseInfo withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 任务id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public PauseInfo withPauseMode(PauseModeEnum pauseMode) {
        this.pauseMode = pauseMode;
        return this;
    }

    


    /**
     * 暂停类型
     * @return pauseMode
     */
    public PauseModeEnum getPauseMode() {
        return pauseMode;
    }

    public void setPauseMode(PauseModeEnum pauseMode) {
        this.pauseMode = pauseMode;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PauseInfo pauseInfo = (PauseInfo) o;
        return Objects.equals(this.jobId, pauseInfo.jobId) &&
            Objects.equals(this.pauseMode, pauseInfo.pauseMode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, pauseMode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PauseInfo {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    pauseMode: ").append(toIndentedString(pauseMode)).append("\n");
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

