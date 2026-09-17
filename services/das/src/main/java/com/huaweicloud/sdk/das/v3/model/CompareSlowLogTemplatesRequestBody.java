package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 对比慢日志模板列表请求体
 */
public class CompareSlowLogTemplatesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cur_page")

    private Integer curPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_page")

    private Integer perPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comparative_start_time")

    private Long comparativeStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comparative_end_time")

    private Long comparativeEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_line_start_time")

    private Long baseLineStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_line_end_time")

    private Long baseLineEndTime;

    public CompareSlowLogTemplatesRequestBody withCurPage(Integer curPage) {
        this.curPage = curPage;
        return this;
    }

    /**
     * 页码
     * @return curPage
     */
    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public CompareSlowLogTemplatesRequestBody withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * 每页记录数
     * @return perPage
     */
    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public CompareSlowLogTemplatesRequestBody withComparativeStartTime(Long comparativeStartTime) {
        this.comparativeStartTime = comparativeStartTime;
        return this;
    }

    /**
     * 对比日期开始时间（Unix timestamp），单位：毫秒
     * @return comparativeStartTime
     */
    public Long getComparativeStartTime() {
        return comparativeStartTime;
    }

    public void setComparativeStartTime(Long comparativeStartTime) {
        this.comparativeStartTime = comparativeStartTime;
    }

    public CompareSlowLogTemplatesRequestBody withComparativeEndTime(Long comparativeEndTime) {
        this.comparativeEndTime = comparativeEndTime;
        return this;
    }

    /**
     * 对比日期结束时间（Unix timestamp），单位：毫秒
     * @return comparativeEndTime
     */
    public Long getComparativeEndTime() {
        return comparativeEndTime;
    }

    public void setComparativeEndTime(Long comparativeEndTime) {
        this.comparativeEndTime = comparativeEndTime;
    }

    public CompareSlowLogTemplatesRequestBody withBaseLineStartTime(Long baseLineStartTime) {
        this.baseLineStartTime = baseLineStartTime;
        return this;
    }

    /**
     * 基线日期开始时间（Unix timestamp），单位：毫秒
     * @return baseLineStartTime
     */
    public Long getBaseLineStartTime() {
        return baseLineStartTime;
    }

    public void setBaseLineStartTime(Long baseLineStartTime) {
        this.baseLineStartTime = baseLineStartTime;
    }

    public CompareSlowLogTemplatesRequestBody withBaseLineEndTime(Long baseLineEndTime) {
        this.baseLineEndTime = baseLineEndTime;
        return this;
    }

    /**
     * 基线日期结束时间（Unix timestamp），单位：毫秒
     * @return baseLineEndTime
     */
    public Long getBaseLineEndTime() {
        return baseLineEndTime;
    }

    public void setBaseLineEndTime(Long baseLineEndTime) {
        this.baseLineEndTime = baseLineEndTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompareSlowLogTemplatesRequestBody that = (CompareSlowLogTemplatesRequestBody) obj;
        return Objects.equals(this.curPage, that.curPage) && Objects.equals(this.perPage, that.perPage)
            && Objects.equals(this.comparativeStartTime, that.comparativeStartTime)
            && Objects.equals(this.comparativeEndTime, that.comparativeEndTime)
            && Objects.equals(this.baseLineStartTime, that.baseLineStartTime)
            && Objects.equals(this.baseLineEndTime, that.baseLineEndTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(curPage, perPage, comparativeStartTime, comparativeEndTime, baseLineStartTime, baseLineEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareSlowLogTemplatesRequestBody {\n");
        sb.append("    curPage: ").append(toIndentedString(curPage)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
        sb.append("    comparativeStartTime: ").append(toIndentedString(comparativeStartTime)).append("\n");
        sb.append("    comparativeEndTime: ").append(toIndentedString(comparativeEndTime)).append("\n");
        sb.append("    baseLineStartTime: ").append(toIndentedString(baseLineStartTime)).append("\n");
        sb.append("    baseLineEndTime: ").append(toIndentedString(baseLineEndTime)).append("\n");
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
