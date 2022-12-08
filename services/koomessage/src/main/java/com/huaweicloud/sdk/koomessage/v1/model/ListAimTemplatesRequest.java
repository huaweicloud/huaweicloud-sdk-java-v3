package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListAimTemplatesRequest {

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
    @JsonProperty(value = "factory_type")

    private List<String> factoryType = null;

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

    public ListAimTemplatesRequest withTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }

    /**
     * 智能信息模板ID。
     * @return tplId
     */
    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
    }

    public ListAimTemplatesRequest withTplName(String tplName) {
        this.tplName = tplName;
        return this;
    }

    /**
     * 智能信息模板名称。
     * @return tplName
     */
    public String getTplName() {
        return tplName;
    }

    public void setTplName(String tplName) {
        this.tplName = tplName;
    }

    public ListAimTemplatesRequest withTplType(String tplType) {
        this.tplType = tplType;
        return this;
    }

    /**
     * 模板分类。  - public：查公共模板 - private：查个人模板  > 不传查全部模板。 
     * @return tplType
     */
    public String getTplType() {
        return tplType;
    }

    public void setTplType(String tplType) {
        this.tplType = tplType;
    }

    public ListAimTemplatesRequest withFactoryType(List<String> factoryType) {
        this.factoryType = factoryType;
        return this;
    }

    public ListAimTemplatesRequest addFactoryTypeItem(String factoryTypeItem) {
        if (this.factoryType == null) {
            this.factoryType = new ArrayList<>();
        }
        this.factoryType.add(factoryTypeItem);
        return this;
    }

    public ListAimTemplatesRequest withFactoryType(Consumer<List<String>> factoryTypeSetter) {
        if (this.factoryType == null) {
            this.factoryType = new ArrayList<>();
        }
        factoryTypeSetter.accept(this.factoryType);
        return this;
    }

    /**
     * 厂商类型。 - HUAWEI：华为 - Xiaomi：小米 - OPPO：OPPO - MEIZU：魅族 - VIVO：VIVO 
     * @return factoryType
     */
    public List<String> getFactoryType() {
        return factoryType;
    }

    public void setFactoryType(List<String> factoryType) {
        this.factoryType = factoryType;
    }

    public ListAimTemplatesRequest withHasParam(Boolean hasParam) {
        this.hasParam = hasParam;
        return this;
    }

    /**
     * 模板是否携带参数。  - true：是 - false：否 
     * @return hasParam
     */
    public Boolean getHasParam() {
        return hasParam;
    }

    public void setHasParam(Boolean hasParam) {
        this.hasParam = hasParam;
    }

    public ListAimTemplatesRequest withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 模板创建开始时间。样例：2019-10-12T07:20:50Z。  > begin_time和end_time必须全部为空或全部不为空，并且begin_time不能大于end_time。 
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ListAimTemplatesRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 模板创建结束时间。样例：2019-10-12T07:20:50Z。  > begin_time和end_time必须全部为空或全部不为空，并且begin_time不能大于end_time。 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListAimTemplatesRequest withOffset(Integer offset) {
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

    public ListAimTemplatesRequest withLimit(Integer limit) {
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
        ListAimTemplatesRequest listAimTemplatesRequest = (ListAimTemplatesRequest) o;
        return Objects.equals(this.tplId, listAimTemplatesRequest.tplId)
            && Objects.equals(this.tplName, listAimTemplatesRequest.tplName)
            && Objects.equals(this.tplType, listAimTemplatesRequest.tplType)
            && Objects.equals(this.factoryType, listAimTemplatesRequest.factoryType)
            && Objects.equals(this.hasParam, listAimTemplatesRequest.hasParam)
            && Objects.equals(this.beginTime, listAimTemplatesRequest.beginTime)
            && Objects.equals(this.endTime, listAimTemplatesRequest.endTime)
            && Objects.equals(this.offset, listAimTemplatesRequest.offset)
            && Objects.equals(this.limit, listAimTemplatesRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tplId, tplName, tplType, factoryType, hasParam, beginTime, endTime, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAimTemplatesRequest {\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    tplName: ").append(toIndentedString(tplName)).append("\n");
        sb.append("    tplType: ").append(toIndentedString(tplType)).append("\n");
        sb.append("    factoryType: ").append(toIndentedString(factoryType)).append("\n");
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
