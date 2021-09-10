package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class StartJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submissions")

    private List<StartJobSubmission> submissions = null;

    public StartJobResponse withSubmissions(List<StartJobSubmission> submissions) {
        this.submissions = submissions;
        return this;
    }

    public StartJobResponse addSubmissionsItem(StartJobSubmission submissionsItem) {
        if (this.submissions == null) {
            this.submissions = new ArrayList<>();
        }
        this.submissions.add(submissionsItem);
        return this;
    }

    public StartJobResponse withSubmissions(Consumer<List<StartJobSubmission>> submissionsSetter) {
        if (this.submissions == null) {
            this.submissions = new ArrayList<>();
        }
        submissionsSetter.accept(this.submissions);
        return this;
    }

    /** 作业运行信息，请参见submission参数说明
     * 
     * @return submissions */
    public List<StartJobSubmission> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(List<StartJobSubmission> submissions) {
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
        StartJobResponse startJobResponse = (StartJobResponse) o;
        return Objects.equals(this.submissions, startJobResponse.submissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(submissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartJobResponse {\n");
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
