package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 更新合并请求检视意见请求体
 */
public class UpdateMergeRequestNoteDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private String body;

    /**
     * **参数解释：** 检视意见严重程度。
     */
    public static final class SeverityEnum {

        /**
         * Enum SUGGESTION for value: "suggestion"
         */
        public static final SeverityEnum SUGGESTION = new SeverityEnum("suggestion");

        /**
         * Enum MINOR for value: "minor"
         */
        public static final SeverityEnum MINOR = new SeverityEnum("minor");

        /**
         * Enum MAJOR for value: "major"
         */
        public static final SeverityEnum MAJOR = new SeverityEnum("major");

        /**
         * Enum FATAL for value: "fatal"
         */
        public static final SeverityEnum FATAL = new SeverityEnum("fatal");

        private static final Map<String, SeverityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SeverityEnum> createStaticFields() {
            Map<String, SeverityEnum> map = new HashMap<>();
            map.put("suggestion", SUGGESTION);
            map.put("minor", MINOR);
            map.put("major", MAJOR);
            map.put("fatal", FATAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SeverityEnum(String value) {
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
        public static SeverityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SeverityEnum(value));
        }

        public static SeverityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SeverityEnum) {
                return this.value.equals(((SeverityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private SeverityEnum severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee_id")

    private String assigneeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_categories")

    private String reviewCategories;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_modules")

    private String reviewModules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proposer_id")

    private String proposerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolved")

    private Boolean resolved;

    public UpdateMergeRequestNoteDto withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * **参数解释：** 评论内容。  
     * @return body
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public UpdateMergeRequestNoteDto withSeverity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释：** 检视意见严重程度。
     * @return severity
     */
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public UpdateMergeRequestNoteDto withAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
        return this;
    }

    /**
     * **参数解释：** 检视意见指派人id。
     * @return assigneeId
     */
    public String getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
    }

    public UpdateMergeRequestNoteDto withReviewCategories(String reviewCategories) {
        this.reviewCategories = reviewCategories;
        return this;
    }

    /**
     * **参数解释：** 检视意见分类。
     * @return reviewCategories
     */
    public String getReviewCategories() {
        return reviewCategories;
    }

    public void setReviewCategories(String reviewCategories) {
        this.reviewCategories = reviewCategories;
    }

    public UpdateMergeRequestNoteDto withReviewModules(String reviewModules) {
        this.reviewModules = reviewModules;
        return this;
    }

    /**
     * **参数解释：** 检视意见模块。
     * @return reviewModules
     */
    public String getReviewModules() {
        return reviewModules;
    }

    public void setReviewModules(String reviewModules) {
        this.reviewModules = reviewModules;
    }

    public UpdateMergeRequestNoteDto withProposerId(String proposerId) {
        this.proposerId = proposerId;
        return this;
    }

    /**
     * **参数解释：** 检视意见检视人id。
     * @return proposerId
     */
    public String getProposerId() {
        return proposerId;
    }

    public void setProposerId(String proposerId) {
        this.proposerId = proposerId;
    }

    public UpdateMergeRequestNoteDto withResolved(Boolean resolved) {
        this.resolved = resolved;
        return this;
    }

    /**
     * **参数解释：** 解决或取消解决检视意见(使用时需仅传此参数)。
     * @return resolved
     */
    public Boolean getResolved() {
        return resolved;
    }

    public void setResolved(Boolean resolved) {
        this.resolved = resolved;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateMergeRequestNoteDto that = (UpdateMergeRequestNoteDto) obj;
        return Objects.equals(this.body, that.body) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.assigneeId, that.assigneeId)
            && Objects.equals(this.reviewCategories, that.reviewCategories)
            && Objects.equals(this.reviewModules, that.reviewModules)
            && Objects.equals(this.proposerId, that.proposerId) && Objects.equals(this.resolved, that.resolved);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, severity, assigneeId, reviewCategories, reviewModules, proposerId, resolved);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMergeRequestNoteDto {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
        sb.append("    reviewCategories: ").append(toIndentedString(reviewCategories)).append("\n");
        sb.append("    reviewModules: ").append(toIndentedString(reviewModules)).append("\n");
        sb.append("    proposerId: ").append(toIndentedString(proposerId)).append("\n");
        sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
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
