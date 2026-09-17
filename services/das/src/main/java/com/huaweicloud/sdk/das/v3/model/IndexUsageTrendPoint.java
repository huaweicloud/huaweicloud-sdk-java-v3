package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 索引使用趋势点
 */
public class IndexUsageTrendPoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_time")

    private Long collectTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_fragmentation_percentage")

    private Double maxFragmentationPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_size_mb")

    private Double indexSizeMb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_count")

    private Double pageCount;

    public IndexUsageTrendPoint withCollectTime(Long collectTime) {
        this.collectTime = collectTime;
        return this;
    }

    /**
     * 采集时间
     * @return collectTime
     */
    public Long getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Long collectTime) {
        this.collectTime = collectTime;
    }

    public IndexUsageTrendPoint withMaxFragmentationPercentage(Double maxFragmentationPercentage) {
        this.maxFragmentationPercentage = maxFragmentationPercentage;
        return this;
    }

    /**
     * TOP1碎片率
     * @return maxFragmentationPercentage
     */
    public Double getMaxFragmentationPercentage() {
        return maxFragmentationPercentage;
    }

    public void setMaxFragmentationPercentage(Double maxFragmentationPercentage) {
        this.maxFragmentationPercentage = maxFragmentationPercentage;
    }

    public IndexUsageTrendPoint withIndexSizeMb(Double indexSizeMb) {
        this.indexSizeMb = indexSizeMb;
        return this;
    }

    /**
     * 总空间大小(MB)
     * @return indexSizeMb
     */
    public Double getIndexSizeMb() {
        return indexSizeMb;
    }

    public void setIndexSizeMb(Double indexSizeMb) {
        this.indexSizeMb = indexSizeMb;
    }

    public IndexUsageTrendPoint withPageCount(Double pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    /**
     * 页数量
     * @return pageCount
     */
    public Double getPageCount() {
        return pageCount;
    }

    public void setPageCount(Double pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IndexUsageTrendPoint that = (IndexUsageTrendPoint) obj;
        return Objects.equals(this.collectTime, that.collectTime)
            && Objects.equals(this.maxFragmentationPercentage, that.maxFragmentationPercentage)
            && Objects.equals(this.indexSizeMb, that.indexSizeMb) && Objects.equals(this.pageCount, that.pageCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectTime, maxFragmentationPercentage, indexSizeMb, pageCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndexUsageTrendPoint {\n");
        sb.append("    collectTime: ").append(toIndentedString(collectTime)).append("\n");
        sb.append("    maxFragmentationPercentage: ").append(toIndentedString(maxFragmentationPercentage)).append("\n");
        sb.append("    indexSizeMb: ").append(toIndentedString(indexSizeMb)).append("\n");
        sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
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
