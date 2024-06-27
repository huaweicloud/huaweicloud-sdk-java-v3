package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询迭代的需求树Body
 */
public class IssueTreeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private String issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_word")

    private String keyWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration_id")

    private String iterationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_id")

    private String severityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_id")

    private String statusId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_id")

    private String moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_ids")

    private String statusIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_ids")

    private String moduleIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pi_filter")

    private List<IssueListPiFilterInfo> piFilter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_names")

    private List<String> statusNames = null;

    public IssueTreeInfo withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 过滤条件：处理人
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public IssueTreeInfo withIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * 需求ID
     * @return issueId
     */
    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public IssueTreeInfo withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 页码
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public IssueTreeInfo withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页展示条数
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public IssueTreeInfo withKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }

    /**
     * 关键字
     * @return keyWord
     */
    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public IssueTreeInfo withIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }

    /**
     * 过滤条件：迭代ID
     * @return iterationId
     */
    public String getIterationId() {
        return iterationId;
    }

    public void setIterationId(String iterationId) {
        this.iterationId = iterationId;
    }

    public IssueTreeInfo withSeverityId(String severityId) {
        this.severityId = severityId;
        return this;
    }

    /**
     * 过滤条件：重要程度ID
     * @return severityId
     */
    public String getSeverityId() {
        return severityId;
    }

    public void setSeverityId(String severityId) {
        this.severityId = severityId;
    }

    public IssueTreeInfo withStatusId(String statusId) {
        this.statusId = statusId;
        return this;
    }

    /**
     * 过滤条件：状态ID
     * @return statusId
     */
    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public IssueTreeInfo withModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * 过滤条件：模块ID
     * @return moduleId
     */
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public IssueTreeInfo withStatusIds(String statusIds) {
        this.statusIds = statusIds;
        return this;
    }

    /**
     * 过滤条件：状态ID多个条件，每个条件取或，-2代表搜索未设置
     * @return statusIds
     */
    public String getStatusIds() {
        return statusIds;
    }

    public void setStatusIds(String statusIds) {
        this.statusIds = statusIds;
    }

    public IssueTreeInfo withModuleIds(String moduleIds) {
        this.moduleIds = moduleIds;
        return this;
    }

    /**
     * 过滤条件：模块ID多个，每个条件取或，-2代表搜索未设置
     * @return moduleIds
     */
    public String getModuleIds() {
        return moduleIds;
    }

    public void setModuleIds(String moduleIds) {
        this.moduleIds = moduleIds;
    }

    public IssueTreeInfo withPiFilter(List<IssueListPiFilterInfo> piFilter) {
        this.piFilter = piFilter;
        return this;
    }

    public IssueTreeInfo addPiFilterItem(IssueListPiFilterInfo piFilterItem) {
        if (this.piFilter == null) {
            this.piFilter = new ArrayList<>();
        }
        this.piFilter.add(piFilterItem);
        return this;
    }

    public IssueTreeInfo withPiFilter(Consumer<List<IssueListPiFilterInfo>> piFilterSetter) {
        if (this.piFilter == null) {
            this.piFilter = new ArrayList<>();
        }
        piFilterSetter.accept(this.piFilter);
        return this;
    }

    /**
     * 迭代、pi过滤条件
     * @return piFilter
     */
    public List<IssueListPiFilterInfo> getPiFilter() {
        return piFilter;
    }

    public void setPiFilter(List<IssueListPiFilterInfo> piFilter) {
        this.piFilter = piFilter;
    }

    public IssueTreeInfo withStatusNames(List<String> statusNames) {
        this.statusNames = statusNames;
        return this;
    }

    public IssueTreeInfo addStatusNamesItem(String statusNamesItem) {
        if (this.statusNames == null) {
            this.statusNames = new ArrayList<>();
        }
        this.statusNames.add(statusNamesItem);
        return this;
    }

    public IssueTreeInfo withStatusNames(Consumer<List<String>> statusNamesSetter) {
        if (this.statusNames == null) {
            this.statusNames = new ArrayList<>();
        }
        statusNamesSetter.accept(this.statusNames);
        return this;
    }

    /**
     * 状态名称列表
     * @return statusNames
     */
    public List<String> getStatusNames() {
        return statusNames;
    }

    public void setStatusNames(List<String> statusNames) {
        this.statusNames = statusNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueTreeInfo that = (IssueTreeInfo) obj;
        return Objects.equals(this.owner, that.owner) && Objects.equals(this.issueId, that.issueId)
            && Objects.equals(this.pageNo, that.pageNo) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.keyWord, that.keyWord) && Objects.equals(this.iterationId, that.iterationId)
            && Objects.equals(this.severityId, that.severityId) && Objects.equals(this.statusId, that.statusId)
            && Objects.equals(this.moduleId, that.moduleId) && Objects.equals(this.statusIds, that.statusIds)
            && Objects.equals(this.moduleIds, that.moduleIds) && Objects.equals(this.piFilter, that.piFilter)
            && Objects.equals(this.statusNames, that.statusNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner,
            issueId,
            pageNo,
            pageSize,
            keyWord,
            iterationId,
            severityId,
            statusId,
            moduleId,
            statusIds,
            moduleIds,
            piFilter,
            statusNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueTreeInfo {\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    keyWord: ").append(toIndentedString(keyWord)).append("\n");
        sb.append("    iterationId: ").append(toIndentedString(iterationId)).append("\n");
        sb.append("    severityId: ").append(toIndentedString(severityId)).append("\n");
        sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    statusIds: ").append(toIndentedString(statusIds)).append("\n");
        sb.append("    moduleIds: ").append(toIndentedString(moduleIds)).append("\n");
        sb.append("    piFilter: ").append(toIndentedString(piFilter)).append("\n");
        sb.append("    statusNames: ").append(toIndentedString(statusNames)).append("\n");
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
