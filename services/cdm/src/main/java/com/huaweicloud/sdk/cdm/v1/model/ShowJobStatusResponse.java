package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowJobStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submissions")

    private List<Submission> submissions = null;

    public ShowJobStatusResponse withSubmissions(List<Submission> submissions) {
        this.submissions = submissions;
        return this;
    }

    public ShowJobStatusResponse addSubmissionsItem(Submission submissionsItem) {
        if (this.submissions == null) {
            this.submissions = new ArrayList<>();
        }
        this.submissions.add(submissionsItem);
        return this;
    }

    public ShowJobStatusResponse withSubmissions(Consumer<List<Submission>> submissionsSetter) {
        if (this.submissions == null) {
            this.submissions = new ArrayList<>();
        }
        submissionsSetter.accept(this.submissions);
        return this;
    }

    /** 作业运行信息，详见submissions参数说明。
     * 
     * @return submissions */
    public List<Submission> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(List<Submission> submissions) {
        this.submissions = submissions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobStatusResponse showJobStatusResponse = (ShowJobStatusResponse) o;
        return Objects.equals(this.submissions, showJobStatusResponse.submissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(submissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobStatusResponse {\n");
        sb.append("    submissions: ").append(toIndentedString(submissions)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
