package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 分页页码信息
 */
public class PageInfoOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "previous_marker")

    @JacksonXmlProperty(localName = "previous_marker")

    private String previousMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    @JacksonXmlProperty(localName = "next_marker")

    private String nextMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_count")

    @JacksonXmlProperty(localName = "current_count")

    private Integer currentCount;

    public PageInfoOption withPreviousMarker(String previousMarker) {
        this.previousMarker = previousMarker;
        return this;
    }

    /**
     * 翻页时，作为前一页的marker取值
     * @return previousMarker
     */
    public String getPreviousMarker() {
        return previousMarker;
    }

    public void setPreviousMarker(String previousMarker) {
        this.previousMarker = previousMarker;
    }

    public PageInfoOption withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 翻页时，作为后一页的marker取值
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    public PageInfoOption withCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * 当前页的数据总数
     * minimum: 0
     * maximum: 99999
     * @return currentCount
     */
    public Integer getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(Integer currentCount) {
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
        PageInfoOption pageInfoOption = (PageInfoOption) o;
        return Objects.equals(this.previousMarker, pageInfoOption.previousMarker)
            && Objects.equals(this.nextMarker, pageInfoOption.nextMarker)
            && Objects.equals(this.currentCount, pageInfoOption.currentCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(previousMarker, nextMarker, currentCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PageInfoOption {\n");
        sb.append("    previousMarker: ").append(toIndentedString(previousMarker)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
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
