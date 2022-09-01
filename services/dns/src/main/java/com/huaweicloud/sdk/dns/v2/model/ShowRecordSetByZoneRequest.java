package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowRecordSetByZoneRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_id")

    @JacksonXmlProperty(localName = "zone_id")

    private String zoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    @JacksonXmlProperty(localName = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_id")

    @JacksonXmlProperty(localName = "line_id")

    private String lineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    @JacksonXmlProperty(localName = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    @JacksonXmlProperty(localName = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_mode")

    @JacksonXmlProperty(localName = "search_mode")

    private String searchMode;

    public ShowRecordSetByZoneRequest withZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    /**
     * Get zoneId
     * @return zoneId
     */
    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public ShowRecordSetByZoneRequest withMarker(String marker) {
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

    public ShowRecordSetByZoneRequest withLimit(Integer limit) {
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

    public ShowRecordSetByZoneRequest withOffset(Integer offset) {
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

    public ShowRecordSetByZoneRequest withLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }

    /**
     * 解析线路ID。
     * @return lineId
     */
    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public ShowRecordSetByZoneRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 资源标签。  取值格式：key1,value1|key2,value2  多个标签之间用\"|\"分开，每个标签的键值用英文逗号\",\"相隔。
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ShowRecordSetByZoneRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 待查询的Record Set的状态。  取值范围：ACTIVE、ERROR、DISABLE、FREEZE、PENDING_CREATE、PENDING_UPDATE、PENDING_DELETE
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowRecordSetByZoneRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 待查询的Record Set的记录集类型。  取值范围：A、CNAME、MX、AAAA、TXT、SRV、NS、CAA
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowRecordSetByZoneRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 待查询的Record Set的域名中包含此name。  搜索模式默认为模糊搜索。  默认值为空。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowRecordSetByZoneRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 待查询的Record Set的id包含此id。  搜索模式默认为模糊搜索。  默认值为空。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowRecordSetByZoneRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 查询结果中Record Set列表的排序字段。  取值范围：  name：域名 type：记录集类型 默认值为空，表示不排序。
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ShowRecordSetByZoneRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 查询结果中Record Set列表的排序方式。  取值范围：  desc：降序排序 asc：升序排序 默认值为空，表示不排序。
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ShowRecordSetByZoneRequest withSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }

    /**
     * 查询条件搜索模式。  取值范围：  like：模糊搜索 equal：精确搜索 默认值为like。
     * @return searchMode
     */
    public String getSearchMode() {
        return searchMode;
    }

    public void setSearchMode(String searchMode) {
        this.searchMode = searchMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRecordSetByZoneRequest showRecordSetByZoneRequest = (ShowRecordSetByZoneRequest) o;
        return Objects.equals(this.zoneId, showRecordSetByZoneRequest.zoneId)
            && Objects.equals(this.marker, showRecordSetByZoneRequest.marker)
            && Objects.equals(this.limit, showRecordSetByZoneRequest.limit)
            && Objects.equals(this.offset, showRecordSetByZoneRequest.offset)
            && Objects.equals(this.lineId, showRecordSetByZoneRequest.lineId)
            && Objects.equals(this.tags, showRecordSetByZoneRequest.tags)
            && Objects.equals(this.status, showRecordSetByZoneRequest.status)
            && Objects.equals(this.type, showRecordSetByZoneRequest.type)
            && Objects.equals(this.name, showRecordSetByZoneRequest.name)
            && Objects.equals(this.id, showRecordSetByZoneRequest.id)
            && Objects.equals(this.sortKey, showRecordSetByZoneRequest.sortKey)
            && Objects.equals(this.sortDir, showRecordSetByZoneRequest.sortDir)
            && Objects.equals(this.searchMode, showRecordSetByZoneRequest.searchMode);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(zoneId, marker, limit, offset, lineId, tags, status, type, name, id, sortKey, sortDir, searchMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRecordSetByZoneRequest {\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    searchMode: ").append(toIndentedString(searchMode)).append("\n");
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
