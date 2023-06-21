package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 习题详细内容
 */
public class ExerciseCodeResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "polymeric_resource_id")

    private String polymericResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_answer")

    private String codeAnswer;

    public ExerciseCodeResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 习题内容存储id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExerciseCodeResource withPolymericResourceId(String polymericResourceId) {
        this.polymericResourceId = polymericResourceId;
        return this;
    }

    /**
     * 资源聚合id
     * @return polymericResourceId
     */
    public String getPolymericResourceId() {
        return polymericResourceId;
    }

    public void setPolymericResourceId(String polymericResourceId) {
        this.polymericResourceId = polymericResourceId;
    }

    public ExerciseCodeResource withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 习题内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ExerciseCodeResource withCodeAnswer(String codeAnswer) {
        this.codeAnswer = codeAnswer;
        return this;
    }

    /**
     * 参考答案
     * @return codeAnswer
     */
    public String getCodeAnswer() {
        return codeAnswer;
    }

    public void setCodeAnswer(String codeAnswer) {
        this.codeAnswer = codeAnswer;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExerciseCodeResource exerciseCodeResource = (ExerciseCodeResource) o;
        return Objects.equals(this.id, exerciseCodeResource.id)
            && Objects.equals(this.polymericResourceId, exerciseCodeResource.polymericResourceId)
            && Objects.equals(this.content, exerciseCodeResource.content)
            && Objects.equals(this.codeAnswer, exerciseCodeResource.codeAnswer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, polymericResourceId, content, codeAnswer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExerciseCodeResource {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    polymericResourceId: ").append(toIndentedString(polymericResourceId)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    codeAnswer: ").append(toIndentedString(codeAnswer)).append("\n");
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
