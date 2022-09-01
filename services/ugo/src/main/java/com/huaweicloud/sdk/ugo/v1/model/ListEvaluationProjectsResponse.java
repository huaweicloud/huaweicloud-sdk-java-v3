package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListEvaluationProjectsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    @JacksonXmlProperty(localName = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_projects")

    @JacksonXmlProperty(localName = "evaluation_projects")

    private List<EvaluationProject> evaluationProjects = null;

    public ListEvaluationProjectsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 评估项目总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListEvaluationProjectsResponse withEvaluationProjects(List<EvaluationProject> evaluationProjects) {
        this.evaluationProjects = evaluationProjects;
        return this;
    }

    public ListEvaluationProjectsResponse addEvaluationProjectsItem(EvaluationProject evaluationProjectsItem) {
        if (this.evaluationProjects == null) {
            this.evaluationProjects = new ArrayList<>();
        }
        this.evaluationProjects.add(evaluationProjectsItem);
        return this;
    }

    public ListEvaluationProjectsResponse withEvaluationProjects(
        Consumer<List<EvaluationProject>> evaluationProjectsSetter) {
        if (this.evaluationProjects == null) {
            this.evaluationProjects = new ArrayList<>();
        }
        evaluationProjectsSetter.accept(this.evaluationProjects);
        return this;
    }

    /**
     * 当前页的评估项目列表。
     * @return evaluationProjects
     */
    public List<EvaluationProject> getEvaluationProjects() {
        return evaluationProjects;
    }

    public void setEvaluationProjects(List<EvaluationProject> evaluationProjects) {
        this.evaluationProjects = evaluationProjects;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEvaluationProjectsResponse listEvaluationProjectsResponse = (ListEvaluationProjectsResponse) o;
        return Objects.equals(this.totalCount, listEvaluationProjectsResponse.totalCount)
            && Objects.equals(this.evaluationProjects, listEvaluationProjectsResponse.evaluationProjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, evaluationProjects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEvaluationProjectsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    evaluationProjects: ").append(toIndentedString(evaluationProjects)).append("\n");
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
