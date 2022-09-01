package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 分页对象
 */
public class PageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_count")

    @JacksonXmlProperty(localName = "current_count")

    private Integer currentCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    @JacksonXmlProperty(localName = "next_marker")

    private String nextMarker;

    public PageInfo withCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * 当前页的资源数量
     * minimum: 0
     * maximum: 200
     * @return currentCount
     */
    public Integer getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
    }

    public PageInfo withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 下一页的marker
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
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
        return Objects.equals(this.currentCount, pageInfo.currentCount)
            && Objects.equals(this.nextMarker, pageInfo.nextMarker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentCount, nextMarker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PageInfo {\n");
        sb.append("    currentCount: ").append(toIndentedString(currentCount)).append("\n");
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
