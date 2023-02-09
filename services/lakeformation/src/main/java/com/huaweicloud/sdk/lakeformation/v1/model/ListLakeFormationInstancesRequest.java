package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListLakeFormationInstancesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_recycle_bin")

    private Boolean inRecycleBin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    public ListLakeFormationInstancesRequest withInRecycleBin(Boolean inRecycleBin) {
        this.inRecycleBin = inRecycleBin;
        return this;
    }

    /**
     * 是否查询回收站中的实例
     * @return inRecycleBin
     */
    public Boolean getInRecycleBin() {
        return inRecycleBin;
    }

    public void setInRecycleBin(Boolean inRecycleBin) {
        this.inRecycleBin = inRecycleBin;
    }

    public ListLakeFormationInstancesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页查询时的偏移量
     * minimum: 0
     * maximum: 1000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListLakeFormationInstancesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页一页显示数
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListLakeFormationInstancesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 使用LakeFormation实例名进行检索
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListLakeFormationInstancesRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListLakeFormationInstancesRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 标签条件列表
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLakeFormationInstancesRequest listLakeFormationInstancesRequest = (ListLakeFormationInstancesRequest) o;
        return Objects.equals(this.inRecycleBin, listLakeFormationInstancesRequest.inRecycleBin)
            && Objects.equals(this.offset, listLakeFormationInstancesRequest.offset)
            && Objects.equals(this.limit, listLakeFormationInstancesRequest.limit)
            && Objects.equals(this.name, listLakeFormationInstancesRequest.name)
            && Objects.equals(this.enterpriseProjectId, listLakeFormationInstancesRequest.enterpriseProjectId)
            && Objects.equals(this.tags, listLakeFormationInstancesRequest.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inRecycleBin, offset, limit, name, enterpriseProjectId, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLakeFormationInstancesRequest {\n");
        sb.append("    inRecycleBin: ").append(toIndentedString(inRecycleBin)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
