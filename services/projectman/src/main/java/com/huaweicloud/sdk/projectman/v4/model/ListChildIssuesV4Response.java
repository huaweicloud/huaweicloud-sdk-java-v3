package com.huaweicloud.sdk.projectman.v4.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.projectman.v4.model.IssueResponseV4;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListChildIssuesV4Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="issues")
    
    private List<IssueResponseV4> issues = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ListChildIssuesV4Response withIssues(List<IssueResponseV4> issues) {
        this.issues = issues;
        return this;
    }

    
    public ListChildIssuesV4Response addIssuesItem(IssueResponseV4 issuesItem) {
        this.issues.add(issuesItem);
        return this;
    }

    public ListChildIssuesV4Response withIssues(Consumer<List<IssueResponseV4>> issuesSetter) {
        if(this.issues == null ){
            this.issues = new ArrayList<>();
        }
        issuesSetter.accept(this.issues);
        return this;
    }

    /**
     * 工作项列表
     * @return issues
     */
    public List<IssueResponseV4> getIssues() {
        return issues;
    }

    public void setIssues(List<IssueResponseV4> issues) {
        this.issues = issues;
    }

    

    public ListChildIssuesV4Response withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListChildIssuesV4Response listChildIssuesV4Response = (ListChildIssuesV4Response) o;
        return Objects.equals(this.issues, listChildIssuesV4Response.issues) &&
            Objects.equals(this.total, listChildIssuesV4Response.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(issues, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListChildIssuesV4Response {\n");
        sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

