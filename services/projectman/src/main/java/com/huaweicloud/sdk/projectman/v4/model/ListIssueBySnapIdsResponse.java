package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListIssueBySnapIdsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issues")

    private List<IssueVO> issues = null;

    public ListIssueBySnapIdsResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 请求返回的结果信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListIssueBySnapIdsResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 请求状态码。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ListIssueBySnapIdsResponse withIssues(List<IssueVO> issues) {
        this.issues = issues;
        return this;
    }

    public ListIssueBySnapIdsResponse addIssuesItem(IssueVO issuesItem) {
        if (this.issues == null) {
            this.issues = new ArrayList<>();
        }
        this.issues.add(issuesItem);
        return this;
    }

    public ListIssueBySnapIdsResponse withIssues(Consumer<List<IssueVO>> issuesSetter) {
        if (this.issues == null) {
            this.issues = new ArrayList<>();
        }
        issuesSetter.accept(this.issues);
        return this;
    }

    /**
     * 快照对应的工作项信息。
     * @return issues
     */
    public List<IssueVO> getIssues() {
        return issues;
    }

    public void setIssues(List<IssueVO> issues) {
        this.issues = issues;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListIssueBySnapIdsResponse that = (ListIssueBySnapIdsResponse) obj;
        return Objects.equals(this.message, that.message) && Objects.equals(this.code, that.code)
            && Objects.equals(this.issues, that.issues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, code, issues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIssueBySnapIdsResponse {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
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
