package com.huaweicloud.sdk.dns.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListRecordSetsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="zone_type")
    
    private String zoneType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private String limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private String offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private String tags;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="records")
    
    private String records;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort_key")
    
    private String sortKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort_dir")
    
    private String sortDir;

    public ListRecordSetsRequest withZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }

    


    /**
     * Get zoneType
     * @return zoneType
     */
    public String getZoneType() {
        return zoneType;
    }

    public void setZoneType(String zoneType) {
        this.zoneType = zoneType;
    }

    

    public ListRecordSetsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * Get marker
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    

    public ListRecordSetsRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    

    public ListRecordSetsRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    

    public ListRecordSetsRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    


    /**
     * Get tags
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    

    public ListRecordSetsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * Get status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public ListRecordSetsRequest withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * Get type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public ListRecordSetsRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListRecordSetsRequest withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ListRecordSetsRequest withRecords(String records) {
        this.records = records;
        return this;
    }

    


    /**
     * Get records
     * @return records
     */
    public String getRecords() {
        return records;
    }

    public void setRecords(String records) {
        this.records = records;
    }

    

    public ListRecordSetsRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    


    /**
     * Get sortKey
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    

    public ListRecordSetsRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    


    /**
     * Get sortDir
     * @return sortDir
     */
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
        ListRecordSetsRequest listRecordSetsRequest = (ListRecordSetsRequest) o;
        return Objects.equals(this.zoneType, listRecordSetsRequest.zoneType) &&
            Objects.equals(this.marker, listRecordSetsRequest.marker) &&
            Objects.equals(this.limit, listRecordSetsRequest.limit) &&
            Objects.equals(this.offset, listRecordSetsRequest.offset) &&
            Objects.equals(this.tags, listRecordSetsRequest.tags) &&
            Objects.equals(this.status, listRecordSetsRequest.status) &&
            Objects.equals(this.type, listRecordSetsRequest.type) &&
            Objects.equals(this.name, listRecordSetsRequest.name) &&
            Objects.equals(this.id, listRecordSetsRequest.id) &&
            Objects.equals(this.records, listRecordSetsRequest.records) &&
            Objects.equals(this.sortKey, listRecordSetsRequest.sortKey) &&
            Objects.equals(this.sortDir, listRecordSetsRequest.sortDir);
    }
    @Override
    public int hashCode() {
        return Objects.hash(zoneType, marker, limit, offset, tags, status, type, name, id, records, sortKey, sortDir);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRecordSetsRequest {\n");
        sb.append("    zoneType: ").append(toIndentedString(zoneType)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
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

