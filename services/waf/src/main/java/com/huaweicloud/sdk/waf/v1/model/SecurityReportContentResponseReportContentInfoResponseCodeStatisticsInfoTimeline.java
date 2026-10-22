package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoTimeline
 */
public class SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoTimeline {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Long num;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "docCountItems")

    private List<SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoDocCountItems> docCountItems =
        null;

    public SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoTimeline withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * **参数解释：** 时间戳（毫秒级），标识统计数据对应的时间点。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoTimeline withNum(Long num) {
        this.num = num;
        return this;
    }

    /**
     * **参数解释：** 该时间点WAF返回该响应码的数量。 **约束限制：** 不涉及 **取值范围：** ≥0 **默认取值：** 0
     * @return num
     */
    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoTimeline withDocCountItems(
        List<SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoDocCountItems> docCountItems) {
        this.docCountItems = docCountItems;
        return this;
    }

    public SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoTimeline addDocCountItemsItem(
        SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoDocCountItems docCountItemsItem) {
        if (this.docCountItems == null) {
            this.docCountItems = new ArrayList<>();
        }
        this.docCountItems.add(docCountItemsItem);
        return this;
    }

    public SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoTimeline withDocCountItems(
        Consumer<List<SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoDocCountItems>> docCountItemsSetter) {
        if (this.docCountItems == null) {
            this.docCountItems = new ArrayList<>();
        }
        docCountItemsSetter.accept(this.docCountItems);
        return this;
    }

    /**
     * **参数解释：** 该时间点各响应码的详细统计项。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return docCountItems
     */
    public List<SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoDocCountItems> getDocCountItems() {
        return docCountItems;
    }

    public void setDocCountItems(
        List<SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoDocCountItems> docCountItems) {
        this.docCountItems = docCountItems;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoTimeline that =
            (SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoTimeline) obj;
        return Objects.equals(this.time, that.time) && Objects.equals(this.num, that.num)
            && Objects.equals(this.docCountItems, that.docCountItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, num, docCountItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoTimeline {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
        sb.append("    docCountItems: ").append(toIndentedString(docCountItems)).append("\n");
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
