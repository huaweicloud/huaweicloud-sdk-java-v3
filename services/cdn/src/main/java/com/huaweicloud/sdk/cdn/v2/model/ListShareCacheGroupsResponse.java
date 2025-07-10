package com.huaweicloud.sdk.cdn.v2.model;

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
public class ListShareCacheGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_cache_groups")

    private List<ListShareCacheGroupsConfig> shareCacheGroups = null;

    public ListShareCacheGroupsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 共享缓存配置总数量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListShareCacheGroupsResponse withShareCacheGroups(List<ListShareCacheGroupsConfig> shareCacheGroups) {
        this.shareCacheGroups = shareCacheGroups;
        return this;
    }

    public ListShareCacheGroupsResponse addShareCacheGroupsItem(ListShareCacheGroupsConfig shareCacheGroupsItem) {
        if (this.shareCacheGroups == null) {
            this.shareCacheGroups = new ArrayList<>();
        }
        this.shareCacheGroups.add(shareCacheGroupsItem);
        return this;
    }

    public ListShareCacheGroupsResponse withShareCacheGroups(
        Consumer<List<ListShareCacheGroupsConfig>> shareCacheGroupsSetter) {
        if (this.shareCacheGroups == null) {
            this.shareCacheGroups = new ArrayList<>();
        }
        shareCacheGroupsSetter.accept(this.shareCacheGroups);
        return this;
    }

    /**
     * 共享缓存配置
     * @return shareCacheGroups
     */
    public List<ListShareCacheGroupsConfig> getShareCacheGroups() {
        return shareCacheGroups;
    }

    public void setShareCacheGroups(List<ListShareCacheGroupsConfig> shareCacheGroups) {
        this.shareCacheGroups = shareCacheGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListShareCacheGroupsResponse that = (ListShareCacheGroupsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.shareCacheGroups, that.shareCacheGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, shareCacheGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListShareCacheGroupsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    shareCacheGroups: ").append(toIndentedString(shareCacheGroups)).append("\n");
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
