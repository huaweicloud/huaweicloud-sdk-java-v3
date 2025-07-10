package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 共享缓存配置
 */
public class ListShareCacheGroupsConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Integer createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_cache_records")

    private List<ListShareCacheGroupsRecord> shareCacheRecords = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_domain")

    private String primaryDomain;

    public ListShareCacheGroupsConfig withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 共享缓存ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListShareCacheGroupsConfig withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 共享缓存组名
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ListShareCacheGroupsConfig withCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 共享缓存创建时间
     * @return createTime
     */
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public ListShareCacheGroupsConfig withShareCacheRecords(List<ListShareCacheGroupsRecord> shareCacheRecords) {
        this.shareCacheRecords = shareCacheRecords;
        return this;
    }

    public ListShareCacheGroupsConfig addShareCacheRecordsItem(ListShareCacheGroupsRecord shareCacheRecordsItem) {
        if (this.shareCacheRecords == null) {
            this.shareCacheRecords = new ArrayList<>();
        }
        this.shareCacheRecords.add(shareCacheRecordsItem);
        return this;
    }

    public ListShareCacheGroupsConfig withShareCacheRecords(
        Consumer<List<ListShareCacheGroupsRecord>> shareCacheRecordsSetter) {
        if (this.shareCacheRecords == null) {
            this.shareCacheRecords = new ArrayList<>();
        }
        shareCacheRecordsSetter.accept(this.shareCacheRecords);
        return this;
    }

    /**
     * 共享缓存域名记录
     * @return shareCacheRecords
     */
    public List<ListShareCacheGroupsRecord> getShareCacheRecords() {
        return shareCacheRecords;
    }

    public void setShareCacheRecords(List<ListShareCacheGroupsRecord> shareCacheRecords) {
        this.shareCacheRecords = shareCacheRecords;
    }

    public ListShareCacheGroupsConfig withPrimaryDomain(String primaryDomain) {
        this.primaryDomain = primaryDomain;
        return this;
    }

    /**
     * 共享缓存组主域名
     * @return primaryDomain
     */
    public String getPrimaryDomain() {
        return primaryDomain;
    }

    public void setPrimaryDomain(String primaryDomain) {
        this.primaryDomain = primaryDomain;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListShareCacheGroupsConfig that = (ListShareCacheGroupsConfig) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.shareCacheRecords, that.shareCacheRecords)
            && Objects.equals(this.primaryDomain, that.primaryDomain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, groupName, createTime, shareCacheRecords, primaryDomain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListShareCacheGroupsConfig {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    shareCacheRecords: ").append(toIndentedString(shareCacheRecords)).append("\n");
        sb.append("    primaryDomain: ").append(toIndentedString(primaryDomain)).append("\n");
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
