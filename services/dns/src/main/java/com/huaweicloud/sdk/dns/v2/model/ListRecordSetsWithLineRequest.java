package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListRecordSetsWithLineRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_type")

    private String zoneType;

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
    @JsonProperty(value = "zone_id")

    private String zoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_id")

    private String lineId;

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
    @JsonProperty(value = "records")

    private String records;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_check_id")

    private String healthCheckId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_mode")

    private String searchMode;

    public ListRecordSetsWithLineRequest withZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }

    /**
     * 待查询的Record Set的域名类型。  取值范围：public  搜索模式默认为模糊搜索。  默认值为public。
     * @return zoneType
     */
    public String getZoneType() {
        return zoneType;
    }

    public void setZoneType(String zoneType) {
        this.zoneType = zoneType;
    }

    public ListRecordSetsWithLineRequest withMarker(String marker) {
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

    public ListRecordSetsWithLineRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的资源个数。  取值范围：0~500  取值一般为10，20，50。默认值为500。
     * minimum: 0
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListRecordSetsWithLineRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页查询起始偏移量，表示从偏移量的下一个资源开始查询。  取值范围：0~2147483647  默认值为0。  当前设置marker不为空时，以marker为分页起始标识。
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListRecordSetsWithLineRequest withZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    /**
     * zone的ID。
     * @return zoneId
     */
    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public ListRecordSetsWithLineRequest withLineId(String lineId) {
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

    public ListRecordSetsWithLineRequest withTags(String tags) {
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

    public ListRecordSetsWithLineRequest withStatus(String status) {
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

    public ListRecordSetsWithLineRequest withType(String type) {
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

    public ListRecordSetsWithLineRequest withName(String name) {
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

    public ListRecordSetsWithLineRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 待查询的Record Set的id包含此id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListRecordSetsWithLineRequest withRecords(String records) {
        this.records = records;
        return this;
    }

    /**
     * 待查询的Record Set的值中包含此records。  搜索模式默认为模糊搜索。  默认值为空。
     * @return records
     */
    public String getRecords() {
        return records;
    }

    public void setRecords(String records) {
        this.records = records;
    }

    public ListRecordSetsWithLineRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 查询结果中Record Set列表的排序字段。  取值范围：  name：记录集名称 type：记录集类型 默认值为空，表示不排序。
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListRecordSetsWithLineRequest withSortDir(String sortDir) {
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

    public ListRecordSetsWithLineRequest withHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
        return this;
    }

    /**
     * 健康检查ID。  搜索模式默认为模糊搜索。  默认值为空。
     * @return healthCheckId
     */
    public String getHealthCheckId() {
        return healthCheckId;
    }

    public void setHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
    }

    public ListRecordSetsWithLineRequest withSearchMode(String searchMode) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRecordSetsWithLineRequest that = (ListRecordSetsWithLineRequest) obj;
        return Objects.equals(this.zoneType, that.zoneType) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.zoneId, that.zoneId) && Objects.equals(this.lineId, that.lineId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.status, that.status)
            && Objects.equals(this.type, that.type) && Objects.equals(this.name, that.name)
            && Objects.equals(this.id, that.id) && Objects.equals(this.records, that.records)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.sortDir, that.sortDir)
            && Objects.equals(this.healthCheckId, that.healthCheckId)
            && Objects.equals(this.searchMode, that.searchMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneType,
            marker,
            limit,
            offset,
            zoneId,
            lineId,
            tags,
            status,
            type,
            name,
            id,
            records,
            sortKey,
            sortDir,
            healthCheckId,
            searchMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRecordSetsWithLineRequest {\n");
        sb.append("    zoneType: ").append(toIndentedString(zoneType)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
        sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    healthCheckId: ").append(toIndentedString(healthCheckId)).append("\n");
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
