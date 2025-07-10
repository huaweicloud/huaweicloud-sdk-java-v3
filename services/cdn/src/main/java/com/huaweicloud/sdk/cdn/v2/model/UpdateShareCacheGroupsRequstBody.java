package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 共享缓存组配置 **约束限制：** 不涉及
 */
public class UpdateShareCacheGroupsRequstBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_cache_records")

    private List<ShareCacheGroupsRecord> shareCacheRecords = null;

    public UpdateShareCacheGroupsRequstBody withShareCacheRecords(List<ShareCacheGroupsRecord> shareCacheRecords) {
        this.shareCacheRecords = shareCacheRecords;
        return this;
    }

    public UpdateShareCacheGroupsRequstBody addShareCacheRecordsItem(ShareCacheGroupsRecord shareCacheRecordsItem) {
        if (this.shareCacheRecords == null) {
            this.shareCacheRecords = new ArrayList<>();
        }
        this.shareCacheRecords.add(shareCacheRecordsItem);
        return this;
    }

    public UpdateShareCacheGroupsRequstBody withShareCacheRecords(
        Consumer<List<ShareCacheGroupsRecord>> shareCacheRecordsSetter) {
        if (this.shareCacheRecords == null) {
            this.shareCacheRecords = new ArrayList<>();
        }
        shareCacheRecordsSetter.accept(this.shareCacheRecords);
        return this;
    }

    /**
     * **参数解释：** 关联域名 **约束限制：** - 必须传入主域名 - 最多可包含50个关联域名
     * @return shareCacheRecords
     */
    public List<ShareCacheGroupsRecord> getShareCacheRecords() {
        return shareCacheRecords;
    }

    public void setShareCacheRecords(List<ShareCacheGroupsRecord> shareCacheRecords) {
        this.shareCacheRecords = shareCacheRecords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateShareCacheGroupsRequstBody that = (UpdateShareCacheGroupsRequstBody) obj;
        return Objects.equals(this.shareCacheRecords, that.shareCacheRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shareCacheRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateShareCacheGroupsRequstBody {\n");
        sb.append("    shareCacheRecords: ").append(toIndentedString(shareCacheRecords)).append("\n");
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
