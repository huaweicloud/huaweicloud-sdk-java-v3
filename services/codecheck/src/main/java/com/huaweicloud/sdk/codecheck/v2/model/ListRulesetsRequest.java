package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListRulesetsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListRulesetsRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 项目ID
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListRulesetsRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /** 规则集类别 '0只查询系统规则集，1只查询当前用户自定义规则集，2只查询其他用户自定义规则集，'0,1,2'或''查所有'
     * 
     * @return category */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ListRulesetsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 分页索引，偏移量 minimum: 0
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListRulesetsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页显示的数量 minimum: 1 maximum: 1000
     * 
     * @return limit */
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
        ListRulesetsRequest listRulesetsRequest = (ListRulesetsRequest) o;
        return Objects.equals(this.projectId, listRulesetsRequest.projectId)
            && Objects.equals(this.category, listRulesetsRequest.category)
            && Objects.equals(this.offset, listRulesetsRequest.offset)
            && Objects.equals(this.limit, listRulesetsRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, category, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRulesetsRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
