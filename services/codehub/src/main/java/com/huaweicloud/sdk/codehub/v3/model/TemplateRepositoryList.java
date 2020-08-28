package com.huaweicloud.sdk.codehub.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.codehub.v3.model.TemplateRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TemplateRepositoryList
 */
public class TemplateRepositoryList  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="commits")
    
    private List<TemplateRepository> commits = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public TemplateRepositoryList withCommits(List<TemplateRepository> commits) {
        this.commits = commits;
        return this;
    }

    
    public TemplateRepositoryList addCommitsItem(TemplateRepository commitsItem) {
        if (this.commits == null) {
            this.commits = new ArrayList<>();
        }
        this.commits.add(commitsItem);
        return this;
    }

    public TemplateRepositoryList withCommits(Consumer<List<TemplateRepository>> commitsSetter) {
        if(this.commits == null ){
            this.commits = new ArrayList<>();
        }
        commitsSetter.accept(this.commits);
        return this;
    }

    /**
     * 模板列表
     * @return commits
     */
    public List<TemplateRepository> getCommits() {
        return commits;
    }

    public void setCommits(List<TemplateRepository> commits) {
        this.commits = commits;
    }

    public TemplateRepositoryList withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 模板总数
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
        TemplateRepositoryList templateRepositoryList = (TemplateRepositoryList) o;
        return Objects.equals(this.commits, templateRepositoryList.commits) &&
            Objects.equals(this.total, templateRepositoryList.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(commits, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateRepositoryList {\n");
        sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
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

