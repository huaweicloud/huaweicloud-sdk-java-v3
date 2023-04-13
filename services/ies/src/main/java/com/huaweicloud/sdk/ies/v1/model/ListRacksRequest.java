package com.huaweicloud.sdk.ies.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListRacksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private List<String> sortKey = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private List<String> sortDir = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_site_id")

    private String edgeSiteId;

    public ListRacksRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页的数量
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListRacksRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页标识
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListRacksRequest withSortKey(List<String> sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    public ListRacksRequest addSortKeyItem(String sortKeyItem) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        this.sortKey.add(sortKeyItem);
        return this;
    }

    public ListRacksRequest withSortKey(Consumer<List<String>> sortKeySetter) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        sortKeySetter.accept(this.sortKey);
        return this;
    }

    /**
     * 排序字段
     * @return sortKey
     */
    public List<String> getSortKey() {
        return sortKey;
    }

    public void setSortKey(List<String> sortKey) {
        this.sortKey = sortKey;
    }

    public ListRacksRequest withSortDir(List<String> sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    public ListRacksRequest addSortDirItem(String sortDirItem) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        this.sortDir.add(sortDirItem);
        return this;
    }

    public ListRacksRequest withSortDir(Consumer<List<String>> sortDirSetter) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        sortDirSetter.accept(this.sortDir);
        return this;
    }

    /**
     * 排序方向，取值范围： - desc：降序 - acs：升序
     * @return sortDir
     */
    public List<String> getSortDir() {
        return sortDir;
    }

    public void setSortDir(List<String> sortDir) {
        this.sortDir = sortDir;
    }

    public ListRacksRequest withEdgeSiteId(String edgeSiteId) {
        this.edgeSiteId = edgeSiteId;
        return this;
    }

    /**
     * 边缘小站ID
     * @return edgeSiteId
     */
    public String getEdgeSiteId() {
        return edgeSiteId;
    }

    public void setEdgeSiteId(String edgeSiteId) {
        this.edgeSiteId = edgeSiteId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRacksRequest listRacksRequest = (ListRacksRequest) o;
        return Objects.equals(this.limit, listRacksRequest.limit)
            && Objects.equals(this.marker, listRacksRequest.marker)
            && Objects.equals(this.sortKey, listRacksRequest.sortKey)
            && Objects.equals(this.sortDir, listRacksRequest.sortDir)
            && Objects.equals(this.edgeSiteId, listRacksRequest.edgeSiteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, sortKey, sortDir, edgeSiteId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRacksRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    edgeSiteId: ").append(toIndentedString(edgeSiteId)).append("\n");
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
