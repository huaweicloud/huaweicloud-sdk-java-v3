package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 过滤条件
 */
public class IssueListFilterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration_ids")

    private List<String> iterationIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pi_sprints")

    private List<IssueListPiFilterInfo> piSprints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_id")

    private String moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_id")

    private String statusId;

    public IssueListFilterInfo withIterationIds(List<String> iterationIds) {
        this.iterationIds = iterationIds;
        return this;
    }

    public IssueListFilterInfo addIterationIdsItem(String iterationIdsItem) {
        if (this.iterationIds == null) {
            this.iterationIds = new ArrayList<>();
        }
        this.iterationIds.add(iterationIdsItem);
        return this;
    }

    public IssueListFilterInfo withIterationIds(Consumer<List<String>> iterationIdsSetter) {
        if (this.iterationIds == null) {
            this.iterationIds = new ArrayList<>();
        }
        iterationIdsSetter.accept(this.iterationIds);
        return this;
    }

    /**
     * 迭代id列表
     * @return iterationIds
     */
    public List<String> getIterationIds() {
        return iterationIds;
    }

    public void setIterationIds(List<String> iterationIds) {
        this.iterationIds = iterationIds;
    }

    public IssueListFilterInfo withPiSprints(List<IssueListPiFilterInfo> piSprints) {
        this.piSprints = piSprints;
        return this;
    }

    public IssueListFilterInfo addPiSprintsItem(IssueListPiFilterInfo piSprintsItem) {
        if (this.piSprints == null) {
            this.piSprints = new ArrayList<>();
        }
        this.piSprints.add(piSprintsItem);
        return this;
    }

    public IssueListFilterInfo withPiSprints(Consumer<List<IssueListPiFilterInfo>> piSprintsSetter) {
        if (this.piSprints == null) {
            this.piSprints = new ArrayList<>();
        }
        piSprintsSetter.accept(this.piSprints);
        return this;
    }

    /**
     * pi过滤条件
     * @return piSprints
     */
    public List<IssueListPiFilterInfo> getPiSprints() {
        return piSprints;
    }

    public void setPiSprints(List<IssueListPiFilterInfo> piSprints) {
        this.piSprints = piSprints;
    }

    public IssueListFilterInfo withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 需求名
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public IssueListFilterInfo withModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * 模块id
     * @return moduleId
     */
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public IssueListFilterInfo withStatusId(String statusId) {
        this.statusId = statusId;
        return this;
    }

    /**
     * 需求状态id
     * @return statusId
     */
    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueListFilterInfo that = (IssueListFilterInfo) obj;
        return Objects.equals(this.iterationIds, that.iterationIds) && Objects.equals(this.piSprints, that.piSprints)
            && Objects.equals(this.subject, that.subject) && Objects.equals(this.moduleId, that.moduleId)
            && Objects.equals(this.statusId, that.statusId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iterationIds, piSprints, subject, moduleId, statusId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueListFilterInfo {\n");
        sb.append("    iterationIds: ").append(toIndentedString(iterationIds)).append("\n");
        sb.append("    piSprints: ").append(toIndentedString(piSprints)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
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
