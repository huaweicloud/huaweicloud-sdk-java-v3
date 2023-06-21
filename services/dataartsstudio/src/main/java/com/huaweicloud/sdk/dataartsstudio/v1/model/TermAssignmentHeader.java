package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 关联标签详情
 */
public class TermAssignmentHeader {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Integer confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steward")

    private String steward;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression")

    private String expression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_text")

    private String displayText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "term_guid")

    private String termGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_guid")

    private String relationGuid;

    public TermAssignmentHeader withConfidence(Integer confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 信任id
     * @return confidence
     */
    public Integer getConfidence() {
        return confidence;
    }

    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    public TermAssignmentHeader withSteward(String steward) {
        this.steward = steward;
        return this;
    }

    /**
     * 管理员
     * @return steward
     */
    public String getSteward() {
        return steward;
    }

    public void setSteward(String steward) {
        this.steward = steward;
    }

    public TermAssignmentHeader withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 来源
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public TermAssignmentHeader withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态 枚举值：DISCOVERED、PROPOSED、IMPORTED、VALIDATED、DEPRECATED、OBSOLETE、OTHER
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TermAssignmentHeader withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建人
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public TermAssignmentHeader withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * 表达式
     * @return expression
     */
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public TermAssignmentHeader withDisplayText(String displayText) {
        this.displayText = displayText;
        return this;
    }

    /**
     * 展示信息
     * @return displayText
     */
    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public TermAssignmentHeader withTermGuid(String termGuid) {
        this.termGuid = termGuid;
        return this;
    }

    /**
     * 标签guid
     * @return termGuid
     */
    public String getTermGuid() {
        return termGuid;
    }

    public void setTermGuid(String termGuid) {
        this.termGuid = termGuid;
    }

    public TermAssignmentHeader withRelationGuid(String relationGuid) {
        this.relationGuid = relationGuid;
        return this;
    }

    /**
     * 关联guid
     * @return relationGuid
     */
    public String getRelationGuid() {
        return relationGuid;
    }

    public void setRelationGuid(String relationGuid) {
        this.relationGuid = relationGuid;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TermAssignmentHeader termAssignmentHeader = (TermAssignmentHeader) o;
        return Objects.equals(this.confidence, termAssignmentHeader.confidence)
            && Objects.equals(this.steward, termAssignmentHeader.steward)
            && Objects.equals(this.source, termAssignmentHeader.source)
            && Objects.equals(this.status, termAssignmentHeader.status)
            && Objects.equals(this.createUser, termAssignmentHeader.createUser)
            && Objects.equals(this.expression, termAssignmentHeader.expression)
            && Objects.equals(this.displayText, termAssignmentHeader.displayText)
            && Objects.equals(this.termGuid, termAssignmentHeader.termGuid)
            && Objects.equals(this.relationGuid, termAssignmentHeader.relationGuid);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(confidence, steward, source, status, createUser, expression, displayText, termGuid, relationGuid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TermAssignmentHeader {\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    steward: ").append(toIndentedString(steward)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    displayText: ").append(toIndentedString(displayText)).append("\n");
        sb.append("    termGuid: ").append(toIndentedString(termGuid)).append("\n");
        sb.append("    relationGuid: ").append(toIndentedString(relationGuid)).append("\n");
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
