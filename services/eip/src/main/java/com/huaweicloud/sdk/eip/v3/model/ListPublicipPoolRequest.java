package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListPublicipPoolRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    @JacksonXmlProperty(localName = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    @JacksonXmlProperty(localName = "fields")

    private String fields;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    @JacksonXmlProperty(localName = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    @JacksonXmlProperty(localName = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    @JacksonXmlProperty(localName = "public_border_group")

    private String publicBorderGroup;

    public ListPublicipPoolRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页查询起始的资源ID，为空时为查询第一页
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListPublicipPoolRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的个数取值范围：0~[2000]，其中2000为局点差异项，具体取值由局点决定
     * minimum: 0
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListPublicipPoolRequest withFields(String fields) {
        this.fields = fields;
        return this;
    }

    /**
     * 显示，形式为\"fields=id&fields=name&...\"  支持字段：id/name/size/used/project_id/status/billing_info/created_at/updated_at/type/shared/is_common/description/tags/enterprise_project_id/allow_share_bandwidth_types/public_border_group
     * @return fields
     */
    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public ListPublicipPoolRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序，形式为\"sort_key=id&sort_dir=asc\"  支持字段：id/name/created_at/updated_at/public_border_group
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListPublicipPoolRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 排序方向  取值范围：asc、desc
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListPublicipPoolRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 根据id过滤
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListPublicipPoolRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 根据name过滤
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListPublicipPoolRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 根据size过滤
     * minimum: 0
     * maximum: 999999
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListPublicipPoolRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 根据status过滤
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListPublicipPoolRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 根据type过滤
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListPublicipPoolRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 根据description过滤
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListPublicipPoolRequest withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * 根据public_border_group过滤
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPublicipPoolRequest listPublicipPoolRequest = (ListPublicipPoolRequest) o;
        return Objects.equals(this.marker, listPublicipPoolRequest.marker)
            && Objects.equals(this.limit, listPublicipPoolRequest.limit)
            && Objects.equals(this.fields, listPublicipPoolRequest.fields)
            && Objects.equals(this.sortKey, listPublicipPoolRequest.sortKey)
            && Objects.equals(this.sortDir, listPublicipPoolRequest.sortDir)
            && Objects.equals(this.id, listPublicipPoolRequest.id)
            && Objects.equals(this.name, listPublicipPoolRequest.name)
            && Objects.equals(this.size, listPublicipPoolRequest.size)
            && Objects.equals(this.status, listPublicipPoolRequest.status)
            && Objects.equals(this.type, listPublicipPoolRequest.type)
            && Objects.equals(this.description, listPublicipPoolRequest.description)
            && Objects.equals(this.publicBorderGroup, listPublicipPoolRequest.publicBorderGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marker,
            limit,
            fields,
            sortKey,
            sortDir,
            id,
            name,
            size,
            status,
            type,
            description,
            publicBorderGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPublicipPoolRequest {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
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
