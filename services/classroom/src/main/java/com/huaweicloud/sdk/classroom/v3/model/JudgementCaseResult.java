package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 用例运行结果信息
 */
public class JudgementCaseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private String output;

    /**
     * 用例运行结果状态： judgeout判题类型对应：pass（用例比对成功）、failed（用例比对失败）； caseout判题类型对应：success（用例运行成功）、error（用例运行失败）；run_timeout（用例运行超时）
     */
    public static final class CaseStatusEnum {

        /**
         * Enum PASS for value: "pass"
         */
        public static final CaseStatusEnum PASS = new CaseStatusEnum("pass");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final CaseStatusEnum FAILED = new CaseStatusEnum("failed");

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final CaseStatusEnum SUCCESS = new CaseStatusEnum("success");

        /**
         * Enum ERROR for value: "error"
         */
        public static final CaseStatusEnum ERROR = new CaseStatusEnum("error");

        /**
         * Enum RUN_TIMEOUT for value: "run_timeout"
         */
        public static final CaseStatusEnum RUN_TIMEOUT = new CaseStatusEnum("run_timeout");

        private static final Map<String, CaseStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CaseStatusEnum> createStaticFields() {
            Map<String, CaseStatusEnum> map = new HashMap<>();
            map.put("pass", PASS);
            map.put("failed", FAILED);
            map.put("success", SUCCESS);
            map.put("error", ERROR);
            map.put("run_timeout", RUN_TIMEOUT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CaseStatusEnum(String value) {
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
        public static CaseStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CaseStatusEnum(value));
        }

        public static CaseStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CaseStatusEnum) {
                return this.value.equals(((CaseStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_status")

    private CaseStatusEnum caseStatus;

    public JudgementCaseResult withOutput(String output) {
        this.output = output;
        return this;
    }

    /**
     * 用例实际运行结果输出
     * @return output
     */
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public JudgementCaseResult withCaseStatus(CaseStatusEnum caseStatus) {
        this.caseStatus = caseStatus;
        return this;
    }

    /**
     * 用例运行结果状态： judgeout判题类型对应：pass（用例比对成功）、failed（用例比对失败）； caseout判题类型对应：success（用例运行成功）、error（用例运行失败）；run_timeout（用例运行超时）
     * @return caseStatus
     */
    public CaseStatusEnum getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(CaseStatusEnum caseStatus) {
        this.caseStatus = caseStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JudgementCaseResult that = (JudgementCaseResult) obj;
        return Objects.equals(this.output, that.output) && Objects.equals(this.caseStatus, that.caseStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(output, caseStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JudgementCaseResult {\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    caseStatus: ").append(toIndentedString(caseStatus)).append("\n");
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
