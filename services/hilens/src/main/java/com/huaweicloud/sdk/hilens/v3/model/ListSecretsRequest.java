package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSecretsRequest {

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
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private String sort;

    public ListSecretsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询的起始位置，取值范围为非负整数，默认为0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSecretsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量，取值范围1~100，默认为100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSecretsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 设备名称，模糊匹配，只允许中文字符、英文字母、数字、下划线、中划线，最大长度64
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListSecretsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID，默认为注册账号子账号的default工作空间，可通过专业版HiLens控制台展开工作空间列表获取到工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListSecretsRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 标签的key和value通过点连接，多个标签通过逗号连接，如：tags=key1.value1,key2.value2
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ListSecretsRequest withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 服务提供者：ief或hilens。不传会查询全部服务类型的设备列表
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public ListSecretsRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 排序方式，可根据名称、创建时间、更新时间排序枚举值：name，created_at，updated_at。sort默认升序，如sort=name，降序：sort=name%3Adesc。不填默认为sort=created_at%3Adesc。
     * @return sort
     */
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSecretsRequest listSecretsRequest = (ListSecretsRequest) o;
        return Objects.equals(this.offset, listSecretsRequest.offset)
            && Objects.equals(this.limit, listSecretsRequest.limit)
            && Objects.equals(this.name, listSecretsRequest.name)
            && Objects.equals(this.workspaceId, listSecretsRequest.workspaceId)
            && Objects.equals(this.tags, listSecretsRequest.tags)
            && Objects.equals(this.provider, listSecretsRequest.provider)
            && Objects.equals(this.sort, listSecretsRequest.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, name, workspaceId, tags, provider, sort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecretsRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
