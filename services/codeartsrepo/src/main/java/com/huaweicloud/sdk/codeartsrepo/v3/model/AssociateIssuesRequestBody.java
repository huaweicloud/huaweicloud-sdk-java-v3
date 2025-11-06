package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AssociateIssuesRequestBody
 */
public class AssociateIssuesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_id")

    private List<String> relatedId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_id")

    private String repoId;

    public AssociateIssuesRequestBody withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * 分支名
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public AssociateIssuesRequestBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID，获取方式请参见[获取项目ID](codehub_api_0014.xml)。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AssociateIssuesRequestBody withRelatedId(List<String> relatedId) {
        this.relatedId = relatedId;
        return this;
    }

    public AssociateIssuesRequestBody addRelatedIdItem(String relatedIdItem) {
        if (this.relatedId == null) {
            this.relatedId = new ArrayList<>();
        }
        this.relatedId.add(relatedIdItem);
        return this;
    }

    public AssociateIssuesRequestBody withRelatedId(Consumer<List<String>> relatedIdSetter) {
        if (this.relatedId == null) {
            this.relatedId = new ArrayList<>();
        }
        relatedIdSetter.accept(this.relatedId);
        return this;
    }

    /**
     * 工作项集合
     * @return relatedId
     */
    public List<String> getRelatedId() {
        return relatedId;
    }

    public void setRelatedId(List<String> relatedId) {
        this.relatedId = relatedId;
    }

    public AssociateIssuesRequestBody withRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }

    /**
     * 仓库id
     * @return repoId
     */
    public String getRepoId() {
        return repoId;
    }

    public void setRepoId(String repoId) {
        this.repoId = repoId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateIssuesRequestBody that = (AssociateIssuesRequestBody) obj;
        return Objects.equals(this.branch, that.branch) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.relatedId, that.relatedId) && Objects.equals(this.repoId, that.repoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branch, projectId, relatedId, repoId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateIssuesRequestBody {\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    relatedId: ").append(toIndentedString(relatedId)).append("\n");
        sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
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
