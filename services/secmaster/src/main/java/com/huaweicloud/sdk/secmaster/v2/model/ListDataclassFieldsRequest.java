package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDataclassFieldsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

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
    @JsonProperty(value = "is_built_in")

    private Boolean isBuiltIn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_id")

    private String dataclassId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_category")

    private String fieldCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapping")

    private Boolean mapping;

    public ListDataclassFieldsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListDataclassFieldsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量
     * minimum: 0
     * maximum: 999999999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListDataclassFieldsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 数据量
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

    public ListDataclassFieldsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称查询
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListDataclassFieldsRequest withIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
        return this;
    }

    /**
     * 是否内置
     * @return isBuiltIn
     */
    public Boolean getIsBuiltIn() {
        return isBuiltIn;
    }

    public void setIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
    }

    public ListDataclassFieldsRequest withDataclassId(String dataclassId) {
        this.dataclassId = dataclassId;
        return this;
    }

    /**
     * 数据类id
     * @return dataclassId
     */
    public String getDataclassId() {
        return dataclassId;
    }

    public void setDataclassId(String dataclassId) {
        this.dataclassId = dataclassId;
    }

    public ListDataclassFieldsRequest withFieldCategory(String fieldCategory) {
        this.fieldCategory = fieldCategory;
        return this;
    }

    /**
     * 字段分类
     * @return fieldCategory
     */
    public String getFieldCategory() {
        return fieldCategory;
    }

    public void setFieldCategory(String fieldCategory) {
        this.fieldCategory = fieldCategory;
    }

    public ListDataclassFieldsRequest withMapping(Boolean mapping) {
        this.mapping = mapping;
        return this;
    }

    /**
     * 是否展示在分类映射外的其他地方
     * @return mapping
     */
    public Boolean getMapping() {
        return mapping;
    }

    public void setMapping(Boolean mapping) {
        this.mapping = mapping;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDataclassFieldsRequest that = (ListDataclassFieldsRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.name, that.name)
            && Objects.equals(this.isBuiltIn, that.isBuiltIn) && Objects.equals(this.dataclassId, that.dataclassId)
            && Objects.equals(this.fieldCategory, that.fieldCategory) && Objects.equals(this.mapping, that.mapping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, offset, limit, name, isBuiltIn, dataclassId, fieldCategory, mapping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDataclassFieldsRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isBuiltIn: ").append(toIndentedString(isBuiltIn)).append("\n");
        sb.append("    dataclassId: ").append(toIndentedString(dataclassId)).append("\n");
        sb.append("    fieldCategory: ").append(toIndentedString(fieldCategory)).append("\n");
        sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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
