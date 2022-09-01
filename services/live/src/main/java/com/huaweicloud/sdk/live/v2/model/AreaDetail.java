package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AreaDetail
 */
public class AreaDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area")

    @JacksonXmlProperty(localName = "area")

    private String area;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    @JacksonXmlProperty(localName = "summary")

    private List<TimeValue> summary = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    @JacksonXmlProperty(localName = "detail")

    private List<AreaTimeValue> detail = null;

    public AreaDetail withArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * 各个计费大区名称，例如CN
     * @return area
     */
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public AreaDetail withSummary(List<TimeValue> summary) {
        this.summary = summary;
        return this;
    }

    public AreaDetail addSummaryItem(TimeValue summaryItem) {
        if (this.summary == null) {
            this.summary = new ArrayList<>();
        }
        this.summary.add(summaryItem);
        return this;
    }

    public AreaDetail withSummary(Consumer<List<TimeValue>> summarySetter) {
        if (this.summary == null) {
            this.summary = new ArrayList<>();
        }
        summarySetter.accept(this.summary);
        return this;
    }

    /**
     * 时间戳及相应时间的指标数值
     * @return summary
     */
    public List<TimeValue> getSummary() {
        return summary;
    }

    public void setSummary(List<TimeValue> summary) {
        this.summary = summary;
    }

    public AreaDetail withDetail(List<AreaTimeValue> detail) {
        this.detail = detail;
        return this;
    }

    public AreaDetail addDetailItem(AreaTimeValue detailItem) {
        if (this.detail == null) {
            this.detail = new ArrayList<>();
        }
        this.detail.add(detailItem);
        return this;
    }

    public AreaDetail withDetail(Consumer<List<AreaTimeValue>> detailSetter) {
        if (this.detail == null) {
            this.detail = new ArrayList<>();
        }
        detailSetter.accept(this.detail);
        return this;
    }

    /**
     * 各个大区下的具体省份、区域、国家的时间戳及相应时间的指标数值
     * @return detail
     */
    public List<AreaTimeValue> getDetail() {
        return detail;
    }

    public void setDetail(List<AreaTimeValue> detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AreaDetail areaDetail = (AreaDetail) o;
        return Objects.equals(this.area, areaDetail.area) && Objects.equals(this.summary, areaDetail.summary)
            && Objects.equals(this.detail, areaDetail.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, summary, detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AreaDetail {\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
