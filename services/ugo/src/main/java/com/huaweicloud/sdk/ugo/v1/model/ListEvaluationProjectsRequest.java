package com.huaweicloud.sdk.ugo.v1.model;

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
 * Request Object
 */
public class ListEvaluationProjectsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_project_name")

    @JacksonXmlProperty(localName = "evaluation_project_name")

    private String evaluationProjectName;

    /**
     * 评估项目状态。
     */
    public static final class EvaluationProjectStatusEnum {

        /**
         * Enum COMPLETED for value: "COMPLETED"
         */
        public static final EvaluationProjectStatusEnum COMPLETED = new EvaluationProjectStatusEnum("COMPLETED");

        /**
         * Enum PENDING for value: "PENDING"
         */
        public static final EvaluationProjectStatusEnum PENDING = new EvaluationProjectStatusEnum("PENDING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final EvaluationProjectStatusEnum FAILED = new EvaluationProjectStatusEnum("FAILED");

        /**
         * Enum STOPPED for value: "STOPPED"
         */
        public static final EvaluationProjectStatusEnum STOPPED = new EvaluationProjectStatusEnum("STOPPED");

        private static final Map<String, EvaluationProjectStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EvaluationProjectStatusEnum> createStaticFields() {
            Map<String, EvaluationProjectStatusEnum> map = new HashMap<>();
            map.put("COMPLETED", COMPLETED);
            map.put("PENDING", PENDING);
            map.put("FAILED", FAILED);
            map.put("STOPPED", STOPPED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EvaluationProjectStatusEnum(String value) {
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
        public static EvaluationProjectStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            EvaluationProjectStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EvaluationProjectStatusEnum(value);
            }
            return result;
        }

        public static EvaluationProjectStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            EvaluationProjectStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EvaluationProjectStatusEnum) {
                return this.value.equals(((EvaluationProjectStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_project_status")

    @JacksonXmlProperty(localName = "evaluation_project_status")

    private EvaluationProjectStatusEnum evaluationProjectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    public ListEvaluationProjectsRequest withEvaluationProjectName(String evaluationProjectName) {
        this.evaluationProjectName = evaluationProjectName;
        return this;
    }

    /**
     * 评估项目名称（模糊搜索）。
     * @return evaluationProjectName
     */
    public String getEvaluationProjectName() {
        return evaluationProjectName;
    }

    public void setEvaluationProjectName(String evaluationProjectName) {
        this.evaluationProjectName = evaluationProjectName;
    }

    public ListEvaluationProjectsRequest withEvaluationProjectStatus(
        EvaluationProjectStatusEnum evaluationProjectStatus) {
        this.evaluationProjectStatus = evaluationProjectStatus;
        return this;
    }

    /**
     * 评估项目状态。
     * @return evaluationProjectStatus
     */
    public EvaluationProjectStatusEnum getEvaluationProjectStatus() {
        return evaluationProjectStatus;
    }

    public void setEvaluationProjectStatus(EvaluationProjectStatusEnum evaluationProjectStatus) {
        this.evaluationProjectStatus = evaluationProjectStatus;
    }

    public ListEvaluationProjectsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页查询的偏移量。
     * minimum: 0
     * maximum: 99
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListEvaluationProjectsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEvaluationProjectsRequest listEvaluationProjectsRequest = (ListEvaluationProjectsRequest) o;
        return Objects.equals(this.evaluationProjectName, listEvaluationProjectsRequest.evaluationProjectName)
            && Objects.equals(this.evaluationProjectStatus, listEvaluationProjectsRequest.evaluationProjectStatus)
            && Objects.equals(this.offset, listEvaluationProjectsRequest.offset)
            && Objects.equals(this.limit, listEvaluationProjectsRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluationProjectName, evaluationProjectStatus, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEvaluationProjectsRequest {\n");
        sb.append("    evaluationProjectName: ").append(toIndentedString(evaluationProjectName)).append("\n");
        sb.append("    evaluationProjectStatus: ").append(toIndentedString(evaluationProjectStatus)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
