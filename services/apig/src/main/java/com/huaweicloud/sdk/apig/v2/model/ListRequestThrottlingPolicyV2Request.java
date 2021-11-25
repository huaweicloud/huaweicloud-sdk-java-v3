package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListRequestThrottlingPolicyV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precise_search")

    private String preciseSearch;

    public ListRequestThrottlingPolicyV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListRequestThrottlingPolicyV2Request withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /** 偏移量，表示从此偏移量开始查询，偏移量小于0时，自动转换为0
     * 
     * @return offset */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListRequestThrottlingPolicyV2Request withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页显示的条目数量 minimum: 1 maximum: 500
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListRequestThrottlingPolicyV2Request withId(String id) {
        this.id = id;
        return this;
    }

    /** 流控策略编号
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListRequestThrottlingPolicyV2Request withName(String name) {
        this.name = name;
        return this;
    }

    /** 流控策略名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListRequestThrottlingPolicyV2Request withPreciseSearch(String preciseSearch) {
        this.preciseSearch = preciseSearch;
        return this;
    }

    /** 指定需要精确匹配查找的参数名称，目前仅支持name
     * 
     * @return preciseSearch */
    public String getPreciseSearch() {
        return preciseSearch;
    }

    public void setPreciseSearch(String preciseSearch) {
        this.preciseSearch = preciseSearch;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRequestThrottlingPolicyV2Request listRequestThrottlingPolicyV2Request =
            (ListRequestThrottlingPolicyV2Request) o;
        return Objects.equals(this.instanceId, listRequestThrottlingPolicyV2Request.instanceId)
            && Objects.equals(this.offset, listRequestThrottlingPolicyV2Request.offset)
            && Objects.equals(this.limit, listRequestThrottlingPolicyV2Request.limit)
            && Objects.equals(this.id, listRequestThrottlingPolicyV2Request.id)
            && Objects.equals(this.name, listRequestThrottlingPolicyV2Request.name)
            && Objects.equals(this.preciseSearch, listRequestThrottlingPolicyV2Request.preciseSearch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, offset, limit, id, name, preciseSearch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRequestThrottlingPolicyV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    preciseSearch: ").append(toIndentedString(preciseSearch)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
