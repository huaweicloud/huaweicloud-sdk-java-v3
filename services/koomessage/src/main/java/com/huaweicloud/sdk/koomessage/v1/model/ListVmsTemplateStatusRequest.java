package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListVmsTemplateStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_id")

    private String tplId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_name")

    private String tplName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_type")

    private String tplType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_param")

    private Boolean hasParam;

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

    public ListVmsTemplateStatusRequest withTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }

    /**
     * 智能信息基础版模板ID。
     * @return tplId
     */
    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
    }

    public ListVmsTemplateStatusRequest withTplName(String tplName) {
        this.tplName = tplName;
        return this;
    }

    /**
     * 智能信息基础版模板名称。
     * @return tplName
     */
    public String getTplName() {
        return tplName;
    }

    public void setTplName(String tplName) {
        this.tplName = tplName;
    }

    public ListVmsTemplateStatusRequest withTplType(String tplType) {
        this.tplType = tplType;
        return this;
    }

    /**
     * 智能信息基础版模板分类。 - public：公共模板 - private：个人模板
     * @return tplType
     */
    public String getTplType() {
        return tplType;
    }

    public void setTplType(String tplType) {
        this.tplType = tplType;
    }

    public ListVmsTemplateStatusRequest withHasParam(Boolean hasParam) {
        this.hasParam = hasParam;
        return this;
    }

    /**
     * 智能信息基础版模板是否携带参数，不传查全部模板。
     * @return hasParam
     */
    public Boolean getHasParam() {
        return hasParam;
    }

    public void setHasParam(Boolean hasParam) {
        this.hasParam = hasParam;
    }

    public ListVmsTemplateStatusRequest withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 智能信息基础版模板创建开始时间。 样例为：2019-10-12T07:20:50Z。  > begin_time和end_time必须全部为空或全部不为空，并且begin_time不能大于end_time。 
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ListVmsTemplateStatusRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 智能信息基础版模板创建结束时间。 样例为：2019-10-12T07:20:50Z。  > begin_time和end_time必须全部为空或全部不为空，并且begin_time不能大于end_time。 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListVmsTemplateStatusRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询，offset大于等于0。
     * minimum: 0
     * maximum: 1000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListVmsTemplateStatusRequest withLimit(Integer limit) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListVmsTemplateStatusRequest listVmsTemplateStatusRequest = (ListVmsTemplateStatusRequest) o;
        return Objects.equals(this.tplId, listVmsTemplateStatusRequest.tplId)
            && Objects.equals(this.tplName, listVmsTemplateStatusRequest.tplName)
            && Objects.equals(this.tplType, listVmsTemplateStatusRequest.tplType)
            && Objects.equals(this.hasParam, listVmsTemplateStatusRequest.hasParam)
            && Objects.equals(this.beginTime, listVmsTemplateStatusRequest.beginTime)
            && Objects.equals(this.endTime, listVmsTemplateStatusRequest.endTime)
            && Objects.equals(this.offset, listVmsTemplateStatusRequest.offset)
            && Objects.equals(this.limit, listVmsTemplateStatusRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tplId, tplName, tplType, hasParam, beginTime, endTime, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVmsTemplateStatusRequest {\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    tplName: ").append(toIndentedString(tplName)).append("\n");
        sb.append("    tplType: ").append(toIndentedString(tplType)).append("\n");
        sb.append("    hasParam: ").append(toIndentedString(hasParam)).append("\n");
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
