package com.huaweicloud.sdk.servicestage.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.CommitsCommits;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListCommitsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="commits")
    
    private List<CommitsCommits> commits = null;
    
    public ListCommitsResponse withCommits(List<CommitsCommits> commits) {
        this.commits = commits;
        return this;
    }

    
    public ListCommitsResponse addCommitsItem(CommitsCommits commitsItem) {
        this.commits.add(commitsItem);
        return this;
    }

    public ListCommitsResponse withCommits(Consumer<List<CommitsCommits>> commitsSetter) {
        if(this.commits == null ){
            this.commits = new ArrayList<>();
        }
        commitsSetter.accept(this.commits);
        return this;
    }

    /**
     * 提交记录列表。
     * @return commits
     */
    public List<CommitsCommits> getCommits() {
        return commits;
    }

    public void setCommits(List<CommitsCommits> commits) {
        this.commits = commits;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCommitsResponse listCommitsResponse = (ListCommitsResponse) o;
        return Objects.equals(this.commits, listCommitsResponse.commits);
    }
    @Override
    public int hashCode() {
        return Objects.hash(commits);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCommitsResponse {\n");
        sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
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

