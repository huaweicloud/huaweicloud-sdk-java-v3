package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

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
public class ListDbCacheMappingsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dbcache_mappings")

    private List<QueryDBCacheMappingResponse> dbcacheMappings = null;

    public ListDbCacheMappingsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总记录数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListDbCacheMappingsResponse withDbcacheMappings(List<QueryDBCacheMappingResponse> dbcacheMappings) {
        this.dbcacheMappings = dbcacheMappings;
        return this;
    }

    public ListDbCacheMappingsResponse addDbcacheMappingsItem(QueryDBCacheMappingResponse dbcacheMappingsItem) {
        if (this.dbcacheMappings == null) {
            this.dbcacheMappings = new ArrayList<>();
        }
        this.dbcacheMappings.add(dbcacheMappingsItem);
        return this;
    }

    public ListDbCacheMappingsResponse withDbcacheMappings(
        Consumer<List<QueryDBCacheMappingResponse>> dbcacheMappingsSetter) {
        if (this.dbcacheMappings == null) {
            this.dbcacheMappings = new ArrayList<>();
        }
        dbcacheMappingsSetter.accept(this.dbcacheMappings);
        return this;
    }

    /**
     * 内存加速映射信息。
     * @return dbcacheMappings
     */
    public List<QueryDBCacheMappingResponse> getDbcacheMappings() {
        return dbcacheMappings;
    }

    public void setDbcacheMappings(List<QueryDBCacheMappingResponse> dbcacheMappings) {
        this.dbcacheMappings = dbcacheMappings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDbCacheMappingsResponse that = (ListDbCacheMappingsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.dbcacheMappings, that.dbcacheMappings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, dbcacheMappings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDbCacheMappingsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    dbcacheMappings: ").append(toIndentedString(dbcacheMappings)).append("\n");
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
