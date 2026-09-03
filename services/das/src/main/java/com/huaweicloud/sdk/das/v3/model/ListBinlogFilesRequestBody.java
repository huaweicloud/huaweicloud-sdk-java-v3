package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询binlog文件列表请求体
 */
public class ListBinlogFilesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cur_page")

    private Integer curPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_page")

    private Integer perPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binlog_type")

    private String binlogType;

    public ListBinlogFilesRequestBody withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListBinlogFilesRequestBody withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListBinlogFilesRequestBody withCurPage(Integer curPage) {
        this.curPage = curPage;
        return this;
    }

    /**
     * 当前页
     * @return curPage
     */
    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public ListBinlogFilesRequestBody withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * 分页大小
     * @return perPage
     */
    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public ListBinlogFilesRequestBody withBinlogType(String binlogType) {
        this.binlogType = binlogType;
        return this;
    }

    /**
     * binlog类型
     * @return binlogType
     */
    public String getBinlogType() {
        return binlogType;
    }

    public void setBinlogType(String binlogType) {
        this.binlogType = binlogType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBinlogFilesRequestBody that = (ListBinlogFilesRequestBody) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.curPage, that.curPage) && Objects.equals(this.perPage, that.perPage)
            && Objects.equals(this.binlogType, that.binlogType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, curPage, perPage, binlogType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBinlogFilesRequestBody {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    curPage: ").append(toIndentedString(curPage)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
        sb.append("    binlogType: ").append(toIndentedString(binlogType)).append("\n");
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
