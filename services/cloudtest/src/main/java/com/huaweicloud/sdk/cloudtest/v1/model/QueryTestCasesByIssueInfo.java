package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryTestCasesByIssueInfo
 */
public class QueryTestCasesByIssueInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private String sortField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_type")

    private String sortType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uri")

    private String versionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relate_type")

    private String relateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_word")

    private String keyWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank_ids")

    private List<String> rankIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_codes")

    private List<String> resultCodes = null;

    public QueryTestCasesByIssueInfo withPageNo(Integer pageNo) {
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

    public QueryTestCasesByIssueInfo withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页数量
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public QueryTestCasesByIssueInfo withSortField(String sortField) {
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

    public QueryTestCasesByIssueInfo withSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }

    /**
     * 排序类型
     * @return sortType
     */
    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public QueryTestCasesByIssueInfo withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /**
     * 版本uri
     * @return versionUri
     */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    public QueryTestCasesByIssueInfo withRelateType(String relateType) {
        this.relateType = relateType;
        return this;
    }

    /**
     * 关联关系类型
     * @return relateType
     */
    public String getRelateType() {
        return relateType;
    }

    public void setRelateType(String relateType) {
        this.relateType = relateType;
    }

    public QueryTestCasesByIssueInfo withKeyWord(String keyWord) {
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

    public QueryTestCasesByIssueInfo withRankIds(List<String> rankIds) {
        this.rankIds = rankIds;
        return this;
    }

    public QueryTestCasesByIssueInfo addRankIdsItem(String rankIdsItem) {
        if (this.rankIds == null) {
            this.rankIds = new ArrayList<>();
        }
        this.rankIds.add(rankIdsItem);
        return this;
    }

    public QueryTestCasesByIssueInfo withRankIds(Consumer<List<String>> rankIdsSetter) {
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
    public List<String> getRankIds() {
        return rankIds;
    }

    public void setRankIds(List<String> rankIds) {
        this.rankIds = rankIds;
    }

    public QueryTestCasesByIssueInfo withResultCodes(List<String> resultCodes) {
        this.resultCodes = resultCodes;
        return this;
    }

    public QueryTestCasesByIssueInfo addResultCodesItem(String resultCodesItem) {
        if (this.resultCodes == null) {
            this.resultCodes = new ArrayList<>();
        }
        this.resultCodes.add(resultCodesItem);
        return this;
    }

    public QueryTestCasesByIssueInfo withResultCodes(Consumer<List<String>> resultCodesSetter) {
        if (this.resultCodes == null) {
            this.resultCodes = new ArrayList<>();
        }
        resultCodesSetter.accept(this.resultCodes);
        return this;
    }

    /**
     * 结果Code集合
     * @return resultCodes
     */
    public List<String> getResultCodes() {
        return resultCodes;
    }

    public void setResultCodes(List<String> resultCodes) {
        this.resultCodes = resultCodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryTestCasesByIssueInfo that = (QueryTestCasesByIssueInfo) obj;
        return Objects.equals(this.pageNo, that.pageNo) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.sortField, that.sortField) && Objects.equals(this.sortType, that.sortType)
            && Objects.equals(this.versionUri, that.versionUri) && Objects.equals(this.relateType, that.relateType)
            && Objects.equals(this.keyWord, that.keyWord) && Objects.equals(this.rankIds, that.rankIds)
            && Objects.equals(this.resultCodes, that.resultCodes);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(pageNo, pageSize, sortField, sortType, versionUri, relateType, keyWord, rankIds, resultCodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryTestCasesByIssueInfo {\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
        sb.append("    relateType: ").append(toIndentedString(relateType)).append("\n");
        sb.append("    keyWord: ").append(toIndentedString(keyWord)).append("\n");
        sb.append("    rankIds: ").append(toIndentedString(rankIds)).append("\n");
        sb.append("    resultCodes: ").append(toIndentedString(resultCodes)).append("\n");
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
