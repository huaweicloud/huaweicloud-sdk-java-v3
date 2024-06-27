package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryTaskAssignCasesInfo
 */
public class QueryTaskAssignCasesInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage")

    private Integer stage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owners")

    private List<String> owners = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private List<String> results = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private List<String> status = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uri")

    private String versionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_dev")

    private String releaseDev;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private String sortField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_type")

    private String sortType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_uri")

    private String featureUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_result_uri")

    private String taskResultUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank_ids")

    private List<Integer> rankIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_word")

    private String keyWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private String issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_issue")

    private Boolean associatedIssue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "select_all_pages")

    private Boolean selectAllPages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_available")

    private Boolean isAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_script_exist")

    private Boolean isScriptExist;

    public QueryTaskAssignCasesInfo withStage(Integer stage) {
        this.stage = stage;
        return this;
    }

    /**
     * 测试用例在任务中的阶段
     * @return stage
     */
    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    public QueryTaskAssignCasesInfo withOwners(List<String> owners) {
        this.owners = owners;
        return this;
    }

    public QueryTaskAssignCasesInfo addOwnersItem(String ownersItem) {
        if (this.owners == null) {
            this.owners = new ArrayList<>();
        }
        this.owners.add(ownersItem);
        return this;
    }

    public QueryTaskAssignCasesInfo withOwners(Consumer<List<String>> ownersSetter) {
        if (this.owners == null) {
            this.owners = new ArrayList<>();
        }
        ownersSetter.accept(this.owners);
        return this;
    }

    /**
     * 处理人过滤数组
     * @return owners
     */
    public List<String> getOwners() {
        return owners;
    }

    public void setOwners(List<String> owners) {
        this.owners = owners;
    }

    public QueryTaskAssignCasesInfo withPageNo(Integer pageNo) {
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

    public QueryTaskAssignCasesInfo withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 页数量
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public QueryTaskAssignCasesInfo withResults(List<String> results) {
        this.results = results;
        return this;
    }

    public QueryTaskAssignCasesInfo addResultsItem(String resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public QueryTaskAssignCasesInfo withResults(Consumer<List<String>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * 结果过滤
     * @return results
     */
    public List<String> getResults() {
        return results;
    }

    public void setResults(List<String> results) {
        this.results = results;
    }

    public QueryTaskAssignCasesInfo withStatus(List<String> status) {
        this.status = status;
        return this;
    }

    public QueryTaskAssignCasesInfo addStatusItem(String statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public QueryTaskAssignCasesInfo withStatus(Consumer<List<String>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * 状态过滤
     * @return status
     */
    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }

    public QueryTaskAssignCasesInfo withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /**
     * 分支/迭代uri
     * @return versionUri
     */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    public QueryTaskAssignCasesInfo withReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
        return this;
    }

    /**
     * 任务版本过滤条件，影响关联任务的结果查询，查询当前任务版本下的用例最新结果
     * @return releaseDev
     */
    public String getReleaseDev() {
        return releaseDev;
    }

    public void setReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
    }

    public QueryTaskAssignCasesInfo withSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 排序字段
     * @return sortField
     */
    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public QueryTaskAssignCasesInfo withSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }

    /**
     * 排序方法
     * @return sortType
     */
    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public QueryTaskAssignCasesInfo withFeatureUri(String featureUri) {
        this.featureUri = featureUri;
        return this;
    }

    /**
     * 特性目录URI
     * @return featureUri
     */
    public String getFeatureUri() {
        return featureUri;
    }

    public void setFeatureUri(String featureUri) {
        this.featureUri = featureUri;
    }

    public QueryTaskAssignCasesInfo withTaskResultUri(String taskResultUri) {
        this.taskResultUri = taskResultUri;
        return this;
    }

    /**
     * 测试套结果uri
     * @return taskResultUri
     */
    public String getTaskResultUri() {
        return taskResultUri;
    }

    public void setTaskResultUri(String taskResultUri) {
        this.taskResultUri = taskResultUri;
    }

    public QueryTaskAssignCasesInfo withRankIds(List<Integer> rankIds) {
        this.rankIds = rankIds;
        return this;
    }

    public QueryTaskAssignCasesInfo addRankIdsItem(Integer rankIdsItem) {
        if (this.rankIds == null) {
            this.rankIds = new ArrayList<>();
        }
        this.rankIds.add(rankIdsItem);
        return this;
    }

    public QueryTaskAssignCasesInfo withRankIds(Consumer<List<Integer>> rankIdsSetter) {
        if (this.rankIds == null) {
            this.rankIds = new ArrayList<>();
        }
        rankIdsSetter.accept(this.rankIds);
        return this;
    }

    /**
     * 用例等级ID集合
     * @return rankIds
     */
    public List<Integer> getRankIds() {
        return rankIds;
    }

    public void setRankIds(List<Integer> rankIds) {
        this.rankIds = rankIds;
    }

    public QueryTaskAssignCasesInfo withKeyWord(String keyWord) {
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

    public QueryTaskAssignCasesInfo withIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * 需求id
     * @return issueId
     */
    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public QueryTaskAssignCasesInfo withAssociatedIssue(Boolean associatedIssue) {
        this.associatedIssue = associatedIssue;
        return this;
    }

    /**
     * 是否关联需求（null：不限，false：未关联，true：已关联）
     * @return associatedIssue
     */
    public Boolean getAssociatedIssue() {
        return associatedIssue;
    }

    public void setAssociatedIssue(Boolean associatedIssue) {
        this.associatedIssue = associatedIssue;
    }

    public QueryTaskAssignCasesInfo withSelectAllPages(Boolean selectAllPages) {
        this.selectAllPages = selectAllPages;
        return this;
    }

    /**
     * 是否全选所有页（null：不全选，false：不全选，true：全选），用于任务批量执行结果功能，只返回用例uri，不返回其他信息
     * @return selectAllPages
     */
    public Boolean getSelectAllPages() {
        return selectAllPages;
    }

    public void setSelectAllPages(Boolean selectAllPages) {
        this.selectAllPages = selectAllPages;
    }

    public QueryTaskAssignCasesInfo withIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }

    /**
     * 用例是否可用
     * @return isAvailable
     */
    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public QueryTaskAssignCasesInfo withIsScriptExist(Boolean isScriptExist) {
        this.isScriptExist = isScriptExist;
        return this;
    }

    /**
     * 用例脚本字段是否有值
     * @return isScriptExist
     */
    public Boolean getIsScriptExist() {
        return isScriptExist;
    }

    public void setIsScriptExist(Boolean isScriptExist) {
        this.isScriptExist = isScriptExist;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryTaskAssignCasesInfo that = (QueryTaskAssignCasesInfo) obj;
        return Objects.equals(this.stage, that.stage) && Objects.equals(this.owners, that.owners)
            && Objects.equals(this.pageNo, that.pageNo) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.results, that.results) && Objects.equals(this.status, that.status)
            && Objects.equals(this.versionUri, that.versionUri) && Objects.equals(this.releaseDev, that.releaseDev)
            && Objects.equals(this.sortField, that.sortField) && Objects.equals(this.sortType, that.sortType)
            && Objects.equals(this.featureUri, that.featureUri)
            && Objects.equals(this.taskResultUri, that.taskResultUri) && Objects.equals(this.rankIds, that.rankIds)
            && Objects.equals(this.keyWord, that.keyWord) && Objects.equals(this.issueId, that.issueId)
            && Objects.equals(this.associatedIssue, that.associatedIssue)
            && Objects.equals(this.selectAllPages, that.selectAllPages)
            && Objects.equals(this.isAvailable, that.isAvailable)
            && Objects.equals(this.isScriptExist, that.isScriptExist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stage,
            owners,
            pageNo,
            pageSize,
            results,
            status,
            versionUri,
            releaseDev,
            sortField,
            sortType,
            featureUri,
            taskResultUri,
            rankIds,
            keyWord,
            issueId,
            associatedIssue,
            selectAllPages,
            isAvailable,
            isScriptExist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryTaskAssignCasesInfo {\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
        sb.append("    releaseDev: ").append(toIndentedString(releaseDev)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
        sb.append("    featureUri: ").append(toIndentedString(featureUri)).append("\n");
        sb.append("    taskResultUri: ").append(toIndentedString(taskResultUri)).append("\n");
        sb.append("    rankIds: ").append(toIndentedString(rankIds)).append("\n");
        sb.append("    keyWord: ").append(toIndentedString(keyWord)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    associatedIssue: ").append(toIndentedString(associatedIssue)).append("\n");
        sb.append("    selectAllPages: ").append(toIndentedString(selectAllPages)).append("\n");
        sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
        sb.append("    isScriptExist: ").append(toIndentedString(isScriptExist)).append("\n");
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
