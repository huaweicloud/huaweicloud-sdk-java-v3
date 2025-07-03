package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据库检查结果
 */
public class DBCheckDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "documentation_link")

    private String documentationLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detected_problems")

    private List<DetectedProblem> detectedProblems = null;

    public DBCheckDetail withDocumentationLink(String documentationLink) {
        this.documentationLink = documentationLink;
        return this;
    }

    /**
     * 检查说明链接
     * @return documentationLink
     */
    public String getDocumentationLink() {
        return documentationLink;
    }

    public void setDocumentationLink(String documentationLink) {
        this.documentationLink = documentationLink;
    }

    public DBCheckDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 检查项描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DBCheckDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 检查项id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DBCheckDetail withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 检查项标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DBCheckDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 检查状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DBCheckDetail withDetectedProblems(List<DetectedProblem> detectedProblems) {
        this.detectedProblems = detectedProblems;
        return this;
    }

    public DBCheckDetail addDetectedProblemsItem(DetectedProblem detectedProblemsItem) {
        if (this.detectedProblems == null) {
            this.detectedProblems = new ArrayList<>();
        }
        this.detectedProblems.add(detectedProblemsItem);
        return this;
    }

    public DBCheckDetail withDetectedProblems(Consumer<List<DetectedProblem>> detectedProblemsSetter) {
        if (this.detectedProblems == null) {
            this.detectedProblems = new ArrayList<>();
        }
        detectedProblemsSetter.accept(this.detectedProblems);
        return this;
    }

    /**
     * 各项检查项检测到的问题
     * @return detectedProblems
     */
    public List<DetectedProblem> getDetectedProblems() {
        return detectedProblems;
    }

    public void setDetectedProblems(List<DetectedProblem> detectedProblems) {
        this.detectedProblems = detectedProblems;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DBCheckDetail that = (DBCheckDetail) obj;
        return Objects.equals(this.documentationLink, that.documentationLink)
            && Objects.equals(this.description, that.description) && Objects.equals(this.id, that.id)
            && Objects.equals(this.title, that.title) && Objects.equals(this.status, that.status)
            && Objects.equals(this.detectedProblems, that.detectedProblems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentationLink, description, id, title, status, detectedProblems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DBCheckDetail {\n");
        sb.append("    documentationLink: ").append(toIndentedString(documentationLink)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    detectedProblems: ").append(toIndentedString(detectedProblems)).append("\n");
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
