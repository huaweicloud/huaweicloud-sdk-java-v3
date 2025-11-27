package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListManagedClustersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unimported")

    private Boolean unimported;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListManagedClustersRequest withUnimported(Boolean unimported) {
        this.unimported = unimported;
        return this;
    }

    /**
     * 是否已导入到ucs
     * @return unimported
     */
    public Boolean getUnimported() {
        return unimported;
    }

    public void setUnimported(Boolean unimported) {
        this.unimported = unimported;
    }

    public ListManagedClustersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页获取列表时，页的大小，默认为-1
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListManagedClustersRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页获取列表时，起始偏移量，默认为0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListManagedClustersRequest that = (ListManagedClustersRequest) obj;
        return Objects.equals(this.unimported, that.unimported) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unimported, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListManagedClustersRequest {\n");
        sb.append("    unimported: ").append(toIndentedString(unimported)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
