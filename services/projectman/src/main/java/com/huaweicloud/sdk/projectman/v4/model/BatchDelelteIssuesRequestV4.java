package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDelelteIssuesRequestV4
 */
public class BatchDelelteIssuesRequestV4 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_ids")

    private List<Integer> issueIds = null;

    public BatchDelelteIssuesRequestV4 withIssueIds(List<Integer> issueIds) {
        this.issueIds = issueIds;
        return this;
    }

    public BatchDelelteIssuesRequestV4 addIssueIdsItem(Integer issueIdsItem) {
        if (this.issueIds == null) {
            this.issueIds = new ArrayList<>();
        }
        this.issueIds.add(issueIdsItem);
        return this;
    }

    public BatchDelelteIssuesRequestV4 withIssueIds(Consumer<List<Integer>> issueIdsSetter) {
        if (this.issueIds == null) {
            this.issueIds = new ArrayList<>();
        }
        issueIdsSetter.accept(this.issueIds);
        return this;
    }

    /**
     * 工作项的id
     * @return issueIds
     */
    public List<Integer> getIssueIds() {
        return issueIds;
    }

    public void setIssueIds(List<Integer> issueIds) {
        this.issueIds = issueIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDelelteIssuesRequestV4 that = (BatchDelelteIssuesRequestV4) obj;
        return Objects.equals(this.issueIds, that.issueIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDelelteIssuesRequestV4 {\n");
        sb.append("    issueIds: ").append(toIndentedString(issueIds)).append("\n");
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
