package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListRecordSetsByZoneRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_id")

    private String zoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    public ListRecordSetsByZoneRequest withZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    /** 所属zone id。
     * 
     * @return zoneId */
    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public ListRecordSetsByZoneRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /** 分页查询起始的资源ID，为空时为查询第一页。
     * 
     * @return marker */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListRecordSetsByZoneRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页返回的资源个数。 取值范围：0~500 取值一般为10，20，50。默认值为500。
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListRecordSetsByZoneRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 分页查询起始偏移量，表示从偏移量的下一个资源开始查询。 取值范围：0~2147483647 默认值为0。 当前设置marker不为空时，以marker为分页起始标识。
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListRecordSetsByZoneRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /** 资源标签。 取值格式：key1,value1|key2,value2 多个标签之间用\"|\"分开，每个标签的键值用英文逗号\",\"相隔。
     * 
     * @return tags */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ListRecordSetsByZoneRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 待查询的Record Set的状态。 取值范围：ACTIVE、ERROR、DISABLE、FREEZE、PENDING_CREATE、PENDING_UPDATE、PENDING_DELETE
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListRecordSetsByZoneRequest withType(String type) {
        this.type = type;
        return this;
    }

    /** 待查询的Record Set的记录集类型。 取值范围：A,AAAA,MX,CNAME,TXT, NS（仅限公网Zone）,SRV,PTR（仅限内网Zone）,CAA（仅限公网Zone）。
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListRecordSetsByZoneRequest withName(String name) {
        this.name = name;
        return this;
    }

    /** 待查询的Record Set的域名中包含此name。 搜索模式默认为模糊搜索。 默认值为空。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListRecordSetsByZoneRequest withId(String id) {
        this.id = id;
        return this;
    }

    /** 待查询的Record Set的id包含此id。 搜索模式默认为模糊搜索。 默认值为空。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListRecordSetsByZoneRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /** 查询结果中Record Set列表的排序字段。 取值范围为： name：域名 type：记录集类型 默认值为空，表示不排序。
     * 
     * @return sortKey */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListRecordSetsByZoneRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /** 查询结果中Record Set列表的排序方式。 取值范围： desc：降序排序 asc：升序排序 默认值为空，表示不排序。
     * 
     * @return sortDir */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRecordSetsByZoneRequest listRecordSetsByZoneRequest = (ListRecordSetsByZoneRequest) o;
        return Objects.equals(this.zoneId, listRecordSetsByZoneRequest.zoneId)
            && Objects.equals(this.marker, listRecordSetsByZoneRequest.marker)
            && Objects.equals(this.limit, listRecordSetsByZoneRequest.limit)
            && Objects.equals(this.offset, listRecordSetsByZoneRequest.offset)
            && Objects.equals(this.tags, listRecordSetsByZoneRequest.tags)
            && Objects.equals(this.status, listRecordSetsByZoneRequest.status)
            && Objects.equals(this.type, listRecordSetsByZoneRequest.type)
            && Objects.equals(this.name, listRecordSetsByZoneRequest.name)
            && Objects.equals(this.id, listRecordSetsByZoneRequest.id)
            && Objects.equals(this.sortKey, listRecordSetsByZoneRequest.sortKey)
            && Objects.equals(this.sortDir, listRecordSetsByZoneRequest.sortDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneId, marker, limit, offset, tags, status, type, name, id, sortKey, sortDir);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRecordSetsByZoneRequest {\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
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
