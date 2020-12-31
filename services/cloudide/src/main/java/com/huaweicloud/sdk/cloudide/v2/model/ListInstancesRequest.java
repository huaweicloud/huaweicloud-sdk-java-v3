package com.huaweicloud.sdk.cloudide.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListInstancesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Long limit = 30l;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Long offset = 0l;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_temporary")
    
    private Boolean isTemporary;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label")
    
    private String label;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="search")
    
    private String search;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort_dir")
    
    private String sortDir = "desc";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort_key")
    
    private String sortKey = "created_time";

    public ListInstancesRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 10
     * maximum: 30
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListInstancesRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * minimum: 0
     * maximum: 999
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListInstancesRequest withIsTemporary(Boolean isTemporary) {
        this.isTemporary = isTemporary;
        return this;
    }

    


    /**
     * Get isTemporary
     * @return isTemporary
     */
    public Boolean getIsTemporary() {
        return isTemporary;
    }

    public void setIsTemporary(Boolean isTemporary) {
        this.isTemporary = isTemporary;
    }

    public ListInstancesRequest withLabel(String label) {
        this.label = label;
        return this;
    }

    


    /**
     * Get label
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ListInstancesRequest withSearch(String search) {
        this.search = search;
        return this;
    }

    


    /**
     * Get search
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public ListInstancesRequest withSortDir(String sortDir) {
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

    public ListInstancesRequest withSortKey(String sortKey) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstancesRequest listInstancesRequest = (ListInstancesRequest) o;
        return Objects.equals(this.limit, listInstancesRequest.limit) &&
            Objects.equals(this.offset, listInstancesRequest.offset) &&
            Objects.equals(this.isTemporary, listInstancesRequest.isTemporary) &&
            Objects.equals(this.label, listInstancesRequest.label) &&
            Objects.equals(this.search, listInstancesRequest.search) &&
            Objects.equals(this.sortDir, listInstancesRequest.sortDir) &&
            Objects.equals(this.sortKey, listInstancesRequest.sortKey);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, isTemporary, label, search, sortDir, sortKey);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    isTemporary: ").append(toIndentedString(isTemporary)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
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

