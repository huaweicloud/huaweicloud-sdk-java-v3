package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowIndexUsageStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_time")

    private Long collectTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_index_usage_count")

    private Long totalIndexUsageCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_size_mb")

    private Double indexSizeMb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fragmentation_gl30_count")

    private Long fragmentationGl30Count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_lookup_lt100_count")

    private Long keyLookupLt100Count;

    public ShowIndexUsageStatisticsResponse withCollectTime(Long collectTime) {
        this.collectTime = collectTime;
        return this;
    }

    /**
     * 采集时间(ms)
     * @return collectTime
     */
    public Long getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Long collectTime) {
        this.collectTime = collectTime;
    }

    public ShowIndexUsageStatisticsResponse withTotalIndexUsageCount(Long totalIndexUsageCount) {
        this.totalIndexUsageCount = totalIndexUsageCount;
        return this;
    }

    /**
     * 索引使用总数
     * @return totalIndexUsageCount
     */
    public Long getTotalIndexUsageCount() {
        return totalIndexUsageCount;
    }

    public void setTotalIndexUsageCount(Long totalIndexUsageCount) {
        this.totalIndexUsageCount = totalIndexUsageCount;
    }

    public ShowIndexUsageStatisticsResponse withIndexSizeMb(Double indexSizeMb) {
        this.indexSizeMb = indexSizeMb;
        return this;
    }

    /**
     * 索引总空间(MB)
     * @return indexSizeMb
     */
    public Double getIndexSizeMb() {
        return indexSizeMb;
    }

    public void setIndexSizeMb(Double indexSizeMb) {
        this.indexSizeMb = indexSizeMb;
    }

    public ShowIndexUsageStatisticsResponse withFragmentationGl30Count(Long fragmentationGl30Count) {
        this.fragmentationGl30Count = fragmentationGl30Count;
        return this;
    }

    /**
     * 碎片率大于30%的数量
     * @return fragmentationGl30Count
     */
    public Long getFragmentationGl30Count() {
        return fragmentationGl30Count;
    }

    public void setFragmentationGl30Count(Long fragmentationGl30Count) {
        this.fragmentationGl30Count = fragmentationGl30Count;
    }

    public ShowIndexUsageStatisticsResponse withKeyLookupLt100Count(Long keyLookupLt100Count) {
        this.keyLookupLt100Count = keyLookupLt100Count;
        return this;
    }

    /**
     * 查找次数小于100的数量
     * @return keyLookupLt100Count
     */
    public Long getKeyLookupLt100Count() {
        return keyLookupLt100Count;
    }

    public void setKeyLookupLt100Count(Long keyLookupLt100Count) {
        this.keyLookupLt100Count = keyLookupLt100Count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowIndexUsageStatisticsResponse that = (ShowIndexUsageStatisticsResponse) obj;
        return Objects.equals(this.collectTime, that.collectTime)
            && Objects.equals(this.totalIndexUsageCount, that.totalIndexUsageCount)
            && Objects.equals(this.indexSizeMb, that.indexSizeMb)
            && Objects.equals(this.fragmentationGl30Count, that.fragmentationGl30Count)
            && Objects.equals(this.keyLookupLt100Count, that.keyLookupLt100Count);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(collectTime, totalIndexUsageCount, indexSizeMb, fragmentationGl30Count, keyLookupLt100Count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIndexUsageStatisticsResponse {\n");
        sb.append("    collectTime: ").append(toIndentedString(collectTime)).append("\n");
        sb.append("    totalIndexUsageCount: ").append(toIndentedString(totalIndexUsageCount)).append("\n");
        sb.append("    indexSizeMb: ").append(toIndentedString(indexSizeMb)).append("\n");
        sb.append("    fragmentationGl30Count: ").append(toIndentedString(fragmentationGl30Count)).append("\n");
        sb.append("    keyLookupLt100Count: ").append(toIndentedString(keyLookupLt100Count)).append("\n");
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
