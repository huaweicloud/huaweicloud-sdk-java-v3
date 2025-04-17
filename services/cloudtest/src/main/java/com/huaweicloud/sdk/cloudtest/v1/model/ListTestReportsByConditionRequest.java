package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListTestReportsByConditionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Long pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private String pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_word")

    private String keyWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "own")

    private Boolean own;

    public ListTestReportsByConditionRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID，固定长度32位字符（字母和数字）。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListTestReportsByConditionRequest withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页显示的条目数量,最大支持200条
     * minimum: 1
     * maximum: 200
     * @return pageSize
     */
    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public ListTestReportsByConditionRequest withPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 当前页数
     * @return pageNo
     */
    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public ListTestReportsByConditionRequest withKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }

    /**
     * 名称关键词
     * @return keyWord
     */
    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public ListTestReportsByConditionRequest withOwn(Boolean own) {
        this.own = own;
        return this;
    }

    /**
     * 是否是我的测试报告
     * @return own
     */
    public Boolean getOwn() {
        return own;
    }

    public void setOwn(Boolean own) {
        this.own = own;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTestReportsByConditionRequest that = (ListTestReportsByConditionRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.pageNo, that.pageNo) && Objects.equals(this.keyWord, that.keyWord)
            && Objects.equals(this.own, that.own);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, pageSize, pageNo, keyWord, own);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTestReportsByConditionRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    keyWord: ").append(toIndentedString(keyWord)).append("\n");
        sb.append("    own: ").append(toIndentedString(own)).append("\n");
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
