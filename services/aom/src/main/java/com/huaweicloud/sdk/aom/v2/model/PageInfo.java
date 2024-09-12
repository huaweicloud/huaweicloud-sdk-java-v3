package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PageInfo
 */
public class PageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_count")

    private String currentCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "previous_marker")

    private String previousMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private String nextMarker;

    public PageInfo withCurrentCount(String currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * 当前页事件、告警总数
     * @return currentCount
     */
    public String getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(String currentCount) {
        this.currentCount = currentCount;
    }

    public PageInfo withPreviousMarker(String previousMarker) {
        this.previousMarker = previousMarker;
        return this;
    }

    /**
     * 前一个marker
     * @return previousMarker
     */
    public String getPreviousMarker() {
        return previousMarker;
    }

    public void setPreviousMarker(String previousMarker) {
        this.previousMarker = previousMarker;
    }

    public PageInfo withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 下一个marker
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PageInfo that = (PageInfo) obj;
        return Objects.equals(this.currentCount, that.currentCount)
            && Objects.equals(this.previousMarker, that.previousMarker)
            && Objects.equals(this.nextMarker, that.nextMarker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentCount, previousMarker, nextMarker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PageInfo {\n");
        sb.append("    currentCount: ").append(toIndentedString(currentCount)).append("\n");
        sb.append("    previousMarker: ").append(toIndentedString(previousMarker)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
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
