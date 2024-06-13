package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryTaskTestCasesInfo
 */
public class QueryTaskTestCasesInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_index")

    private Integer startIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_index")

    private Integer endIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_word")

    private String keyWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_uris")

    private List<String> testCaseUris = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iterator_uri")

    private String iteratorUri;

    public QueryTaskTestCasesInfo withPageNo(Integer pageNo) {
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

    public QueryTaskTestCasesInfo withPageSize(Integer pageSize) {
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

    public QueryTaskTestCasesInfo withStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    /**
     * 起始位
     * @return startIndex
     */
    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public QueryTaskTestCasesInfo withEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
        return this;
    }

    /**
     * 结束位
     * @return endIndex
     */
    public Integer getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }

    public QueryTaskTestCasesInfo withKeyWord(String keyWord) {
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

    public QueryTaskTestCasesInfo withTestCaseUris(List<String> testCaseUris) {
        this.testCaseUris = testCaseUris;
        return this;
    }

    public QueryTaskTestCasesInfo addTestCaseUrisItem(String testCaseUrisItem) {
        if (this.testCaseUris == null) {
            this.testCaseUris = new ArrayList<>();
        }
        this.testCaseUris.add(testCaseUrisItem);
        return this;
    }

    public QueryTaskTestCasesInfo withTestCaseUris(Consumer<List<String>> testCaseUrisSetter) {
        if (this.testCaseUris == null) {
            this.testCaseUris = new ArrayList<>();
        }
        testCaseUrisSetter.accept(this.testCaseUris);
        return this;
    }

    /**
     * 用例uri列表
     * @return testCaseUris
     */
    public List<String> getTestCaseUris() {
        return testCaseUris;
    }

    public void setTestCaseUris(List<String> testCaseUris) {
        this.testCaseUris = testCaseUris;
    }

    public QueryTaskTestCasesInfo withIteratorUri(String iteratorUri) {
        this.iteratorUri = iteratorUri;
        return this;
    }

    /**
     * 测试计划uri
     * @return iteratorUri
     */
    public String getIteratorUri() {
        return iteratorUri;
    }

    public void setIteratorUri(String iteratorUri) {
        this.iteratorUri = iteratorUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryTaskTestCasesInfo that = (QueryTaskTestCasesInfo) obj;
        return Objects.equals(this.pageNo, that.pageNo) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.startIndex, that.startIndex) && Objects.equals(this.endIndex, that.endIndex)
            && Objects.equals(this.keyWord, that.keyWord) && Objects.equals(this.testCaseUris, that.testCaseUris)
            && Objects.equals(this.iteratorUri, that.iteratorUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageNo, pageSize, startIndex, endIndex, keyWord, testCaseUris, iteratorUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryTaskTestCasesInfo {\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
        sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
        sb.append("    keyWord: ").append(toIndentedString(keyWord)).append("\n");
        sb.append("    testCaseUris: ").append(toIndentedString(testCaseUris)).append("\n");
        sb.append("    iteratorUri: ").append(toIndentedString(iteratorUri)).append("\n");
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
