package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建合并请求检视意见请求体
 */
public class CreateMergeRequestNoteDto {

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

    /**
     * **参数解释：** 检视意见所在行类型(代码行评论需要)。
     */
    public static final class LineTypesEnum {

        /**
         * Enum NEW for value: "new"
         */
        public static final LineTypesEnum NEW = new LineTypesEnum("new");

        /**
         * Enum OLD for value: "old"
         */
        public static final LineTypesEnum OLD = new LineTypesEnum("old");

        private static final Map<String, LineTypesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LineTypesEnum> createStaticFields() {
            Map<String, LineTypesEnum> map = new HashMap<>();
            map.put("new", NEW);
            map.put("old", OLD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LineTypesEnum(String value) {
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
        public static LineTypesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LineTypesEnum(value));
        }

        public static LineTypesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LineTypesEnum) {
                return this.value.equals(((LineTypesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_types")

    private LineTypesEnum lineTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private PositionDto position;

    public CreateMergeRequestNoteDto withBody(String body) {
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

    public CreateMergeRequestNoteDto withSeverity(SeverityEnum severity) {
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

    public CreateMergeRequestNoteDto withAssigneeId(String assigneeId) {
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

    public CreateMergeRequestNoteDto withReviewCategories(String reviewCategories) {
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

    public CreateMergeRequestNoteDto withReviewModules(String reviewModules) {
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

    public CreateMergeRequestNoteDto withProposerId(String proposerId) {
        this.proposerId = proposerId;
        return this;
    }

    /**
     * **参数解释：** 检视人。
     * @return proposerId
     */
    public String getProposerId() {
        return proposerId;
    }

    public void setProposerId(String proposerId) {
        this.proposerId = proposerId;
    }

    public CreateMergeRequestNoteDto withLineTypes(LineTypesEnum lineTypes) {
        this.lineTypes = lineTypes;
        return this;
    }

    /**
     * **参数解释：** 检视意见所在行类型(代码行评论需要)。
     * @return lineTypes
     */
    public LineTypesEnum getLineTypes() {
        return lineTypes;
    }

    public void setLineTypes(LineTypesEnum lineTypes) {
        this.lineTypes = lineTypes;
    }

    public CreateMergeRequestNoteDto withPosition(PositionDto position) {
        this.position = position;
        return this;
    }

    public CreateMergeRequestNoteDto withPosition(Consumer<PositionDto> positionSetter) {
        if (this.position == null) {
            this.position = new PositionDto();
            positionSetter.accept(this.position);
        }

        return this;
    }

    /**
     * Get position
     * @return position
     */
    public PositionDto getPosition() {
        return position;
    }

    public void setPosition(PositionDto position) {
        this.position = position;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMergeRequestNoteDto that = (CreateMergeRequestNoteDto) obj;
        return Objects.equals(this.body, that.body) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.assigneeId, that.assigneeId)
            && Objects.equals(this.reviewCategories, that.reviewCategories)
            && Objects.equals(this.reviewModules, that.reviewModules)
            && Objects.equals(this.proposerId, that.proposerId) && Objects.equals(this.lineTypes, that.lineTypes)
            && Objects.equals(this.position, that.position);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(body, severity, assigneeId, reviewCategories, reviewModules, proposerId, lineTypes, position);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMergeRequestNoteDto {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
        sb.append("    reviewCategories: ").append(toIndentedString(reviewCategories)).append("\n");
        sb.append("    reviewModules: ").append(toIndentedString(reviewModules)).append("\n");
        sb.append("    proposerId: ").append(toIndentedString(proposerId)).append("\n");
        sb.append("    lineTypes: ").append(toIndentedString(lineTypes)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
