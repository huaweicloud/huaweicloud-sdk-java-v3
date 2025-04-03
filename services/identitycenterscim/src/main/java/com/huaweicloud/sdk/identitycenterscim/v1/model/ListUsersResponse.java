package com.huaweicloud.sdk.identitycenterscim.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListUsersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalResults")

    private Integer totalResults;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "itemsPerPage")

    private String itemsPerPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startIndex")

    private String startIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemas")

    private List<String> schemas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Resources")

    private List<GetUserResp> resources = null;

    public ListUsersResponse withTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
        return this;
    }

    /**
     * 总结果数
     * @return totalResults
     */
    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public ListUsersResponse withItemsPerPage(String itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
        return this;
    }

    /**
     * 每页的元素个数
     * @return itemsPerPage
     */
    public String getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(String itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    public ListUsersResponse withStartIndex(String startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    /**
     * 起始索引
     * @return startIndex
     */
    public String getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(String startIndex) {
        this.startIndex = startIndex;
    }

    public ListUsersResponse withSchemas(List<String> schemas) {
        this.schemas = schemas;
        return this;
    }

    public ListUsersResponse addSchemasItem(String schemasItem) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        this.schemas.add(schemasItem);
        return this;
    }

    public ListUsersResponse withSchemas(Consumer<List<String>> schemasSetter) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        schemasSetter.accept(this.schemas);
        return this;
    }

    /**
     * 概要
     * @return schemas
     */
    public List<String> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<String> schemas) {
        this.schemas = schemas;
    }

    public ListUsersResponse withResources(List<GetUserResp> resources) {
        this.resources = resources;
        return this;
    }

    public ListUsersResponse addResourcesItem(GetUserResp resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ListUsersResponse withResources(Consumer<List<GetUserResp>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 包含用户信息的列表
     * @return resources
     */
    public List<GetUserResp> getResources() {
        return resources;
    }

    public void setResources(List<GetUserResp> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUsersResponse that = (ListUsersResponse) obj;
        return Objects.equals(this.totalResults, that.totalResults)
            && Objects.equals(this.itemsPerPage, that.itemsPerPage) && Objects.equals(this.startIndex, that.startIndex)
            && Objects.equals(this.schemas, that.schemas) && Objects.equals(this.resources, that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalResults, itemsPerPage, startIndex, schemas, resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUsersResponse {\n");
        sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
        sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
        sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
