package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 分页信息。
 */
public class PageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private String nextMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "previous_marker")

    private String previousMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_count")

    private BigDecimal currentCount;

    public PageInfo withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 分页查询结果中最后一条记录的ID。通常用于查询下一页。
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    public PageInfo withPreviousMarker(String previousMarker) {
        this.previousMarker = previousMarker;
        return this;
    }

    /**
     * 分页查询结果中第一条记录的ID。通常用于配合page_reverse=true查询上一页。
     * @return previousMarker
     */
    public String getPreviousMarker() {
        return previousMarker;
    }

    public void setPreviousMarker(String previousMarker) {
        this.previousMarker = previousMarker;
    }

    public PageInfo withCurrentCount(BigDecimal currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * 分页查询资源时，本页的实例的个数。
     * minimum: 1
     * maximum: 2E+3
     * @return currentCount
     */
    public BigDecimal getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(BigDecimal currentCount) {
        this.currentCount = currentCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PageInfo pageInfo = (PageInfo) o;
        return Objects.equals(this.nextMarker, pageInfo.nextMarker)
            && Objects.equals(this.previousMarker, pageInfo.previousMarker)
            && Objects.equals(this.currentCount, pageInfo.currentCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextMarker, previousMarker, currentCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PageInfo {\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
        sb.append("    previousMarker: ").append(toIndentedString(previousMarker)).append("\n");
        sb.append("    currentCount: ").append(toIndentedString(currentCount)).append("\n");
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
