package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListOrgInstancesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_temporary")

    @JacksonXmlProperty(localName = "is_temporary")

    private Boolean isTemporary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_id")

    @JacksonXmlProperty(localName = "org_id")

    private String orgId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    @JacksonXmlProperty(localName = "search")

    private String search;

    public ListOrgInstancesRequest withIsTemporary(Boolean isTemporary) {
        this.isTemporary = isTemporary;
        return this;
    }

    /**
     * 是否页面显示（以标签配置为准）
     * @return isTemporary
     */
    public Boolean getIsTemporary() {
        return isTemporary;
    }

    public void setIsTemporary(Boolean isTemporary) {
        this.isTemporary = isTemporary;
    }

    public ListOrgInstancesRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量 10/15/30
     * minimum: 10
     * maximum: 30
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListOrgInstancesRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询
     * minimum: 0
     * maximum: 999
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListOrgInstancesRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
     * 租户id（对应华为云帐号的domainId）
     * @return orgId
     */
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public ListOrgInstancesRequest withSearch(String search) {
        this.search = search;
        return this;
    }

    /**
     * 关键字查询(根据实例名，描述模糊查询)
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListOrgInstancesRequest listOrgInstancesRequest = (ListOrgInstancesRequest) o;
        return Objects.equals(this.isTemporary, listOrgInstancesRequest.isTemporary)
            && Objects.equals(this.limit, listOrgInstancesRequest.limit)
            && Objects.equals(this.offset, listOrgInstancesRequest.offset)
            && Objects.equals(this.orgId, listOrgInstancesRequest.orgId)
            && Objects.equals(this.search, listOrgInstancesRequest.search);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isTemporary, limit, offset, orgId, search);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOrgInstancesRequest {\n");
        sb.append("    isTemporary: ").append(toIndentedString(isTemporary)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
