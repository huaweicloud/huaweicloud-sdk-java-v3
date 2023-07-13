package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 模板报表查询过滤条件。
 */
public class ListAimTemplateReportsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_ids")

    private List<String> tplIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListAimTemplateReportsRequestBody withTplIds(List<String> tplIds) {
        this.tplIds = tplIds;
        return this;
    }

    public ListAimTemplateReportsRequestBody addTplIdsItem(String tplIdsItem) {
        if (this.tplIds == null) {
            this.tplIds = new ArrayList<>();
        }
        this.tplIds.add(tplIdsItem);
        return this;
    }

    public ListAimTemplateReportsRequestBody withTplIds(Consumer<List<String>> tplIdsSetter) {
        if (this.tplIds == null) {
            this.tplIds = new ArrayList<>();
        }
        tplIdsSetter.accept(this.tplIds);
        return this;
    }

    /**
     * 智能信息模板ID列表，一次最多请求100个。 
     * @return tplIds
     */
    public List<String> getTplIds() {
        return tplIds;
    }

    public void setTplIds(List<String> tplIds) {
        this.tplIds = tplIds;
    }

    public ListAimTemplateReportsRequestBody withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 模板报表查询开始时间。样例：2019-10-12T07:20:50.522Z。  >开始时间和结束时间最多间隔90天，超出时间限制返回为空。 
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ListAimTemplateReportsRequestBody withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 模板报表查询结束时间。样例：2019-10-12T07:20:50.522Z。  >开始时间和结束时间最多间隔90天，超出时间限制返回为空。 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListAimTemplateReportsRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询，offset大于等于0。 
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAimTemplateReportsRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量。 
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAimTemplateReportsRequestBody that = (ListAimTemplateReportsRequestBody) obj;
        return Objects.equals(this.tplIds, that.tplIds) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tplIds, beginTime, endTime, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAimTemplateReportsRequestBody {\n");
        sb.append("    tplIds: ").append(toIndentedString(tplIds)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
