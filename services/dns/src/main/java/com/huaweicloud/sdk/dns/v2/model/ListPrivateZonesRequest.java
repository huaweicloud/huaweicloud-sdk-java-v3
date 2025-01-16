package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListPrivateZonesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_mode")

    private String searchMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "router_id")

    private String routerId;

    public ListPrivateZonesRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 待查询的zone的类型。  取值范围：private。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListPrivateZonesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的资源个数。  取值范围：0~500  取值一般为10，20，50。默认值为500。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListPrivateZonesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页查询起始的资源ID，为空时为查询第一页。  默认值为空。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListPrivateZonesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页查询起始偏移量，表示从偏移量的下一个资源开始查询。  取值范围：0~2147483647  默认值为0。  当前设置marker不为空时，以marker为分页起始标识。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPrivateZonesRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 资源标签。
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ListPrivateZonesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Zone名称。  搜索模式默认为模糊搜索。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListPrivateZonesRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Zone ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListPrivateZonesRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 资源状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListPrivateZonesRequest withSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }

    /**
     * 查询条件搜索模式。  取值范围：  like：模糊搜索 equal：精确搜索
     * @return searchMode
     */
    public String getSearchMode() {
        return searchMode;
    }

    public void setSearchMode(String searchMode) {
        this.searchMode = searchMode;
    }

    public ListPrivateZonesRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 查询结果中zone列表的排序字段。  取值范围为：  name：域名 created_at：创建时间 updated_at：更新时间 默认值为空，表示不排序。
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListPrivateZonesRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 查询结果中zone列表的排序方式。  取值范围：  desc：降序排序 asc：升序排序 默认值为空，表示不排序。
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListPrivateZonesRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 域名关联的企业项目ID，长度不超过36个字符。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListPrivateZonesRequest withRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }

    /**
     * 关联VPC的ID。
     * @return routerId
     */
    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPrivateZonesRequest that = (ListPrivateZonesRequest) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.name, that.name)
            && Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.searchMode, that.searchMode) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.routerId, that.routerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            limit,
            marker,
            offset,
            tags,
            name,
            id,
            status,
            searchMode,
            sortKey,
            sortDir,
            enterpriseProjectId,
            routerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPrivateZonesRequest {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    searchMode: ").append(toIndentedString(searchMode)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    routerId: ").append(toIndentedString(routerId)).append("\n");
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
