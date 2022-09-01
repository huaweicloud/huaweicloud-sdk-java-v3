package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 预检查信息体
 */
public class PreCheckInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    @JacksonXmlProperty(localName = "job_id")

    private String jobId;

    /**
     * 预检查模式
     */
    public static final class PrecheckModeEnum {

        /**
         * Enum FORSTARTJOB for value: "forStartJob"
         */
        public static final PrecheckModeEnum FORSTARTJOB = new PrecheckModeEnum("forStartJob");

        private static final Map<String, PrecheckModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PrecheckModeEnum> createStaticFields() {
            Map<String, PrecheckModeEnum> map = new HashMap<>();
            map.put("forStartJob", FORSTARTJOB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PrecheckModeEnum(String value) {
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
        public static PrecheckModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PrecheckModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PrecheckModeEnum(value);
            }
            return result;
        }

        public static PrecheckModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PrecheckModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PrecheckModeEnum) {
                return this.value.equals(((PrecheckModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precheck_mode")

    @JacksonXmlProperty(localName = "precheck_mode")

    private PrecheckModeEnum precheckMode;

    public PreCheckInfo withJobId(String jobId) {
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

    public PreCheckInfo withPrecheckMode(PrecheckModeEnum precheckMode) {
        this.precheckMode = precheckMode;
        return this;
    }

    /**
     * 预检查模式
     * @return precheckMode
     */
    public PrecheckModeEnum getPrecheckMode() {
        return precheckMode;
    }

    public void setPrecheckMode(PrecheckModeEnum precheckMode) {
        this.precheckMode = precheckMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PreCheckInfo preCheckInfo = (PreCheckInfo) o;
        return Objects.equals(this.jobId, preCheckInfo.jobId)
            && Objects.equals(this.precheckMode, preCheckInfo.precheckMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, precheckMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreCheckInfo {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    precheckMode: ").append(toIndentedString(precheckMode)).append("\n");
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
