package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SecurityReportContentResponseReportContentInfoQpsStatisticsInfoTimeline1
 */
public class SecurityReportContentResponseReportContentInfoQpsStatisticsInfoTimeline1 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Long num;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "docCountItems")

    private List<SecurityReportContentResponseReportContentInfoDocCountItems> docCountItems = null;

    public SecurityReportContentResponseReportContentInfoQpsStatisticsInfoTimeline1 withTime(Long time) {
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

    public SecurityReportContentResponseReportContentInfoQpsStatisticsInfoTimeline1 withNum(Long num) {
        this.num = num;
        return this;
    }

    /**
     * **参数解释：** 该时间点对应统计维度的峰值QPS值。 **约束限制：** 不涉及 **取值范围：** ≥0 **默认取值：** 0
     * @return num
     */
    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public SecurityReportContentResponseReportContentInfoQpsStatisticsInfoTimeline1 withDocCountItems(
        List<SecurityReportContentResponseReportContentInfoDocCountItems> docCountItems) {
        this.docCountItems = docCountItems;
        return this;
    }

    public SecurityReportContentResponseReportContentInfoQpsStatisticsInfoTimeline1 addDocCountItemsItem(
        SecurityReportContentResponseReportContentInfoDocCountItems docCountItemsItem) {
        if (this.docCountItems == null) {
            this.docCountItems = new ArrayList<>();
        }
        this.docCountItems.add(docCountItemsItem);
        return this;
    }

    public SecurityReportContentResponseReportContentInfoQpsStatisticsInfoTimeline1 withDocCountItems(
        Consumer<List<SecurityReportContentResponseReportContentInfoDocCountItems>> docCountItemsSetter) {
        if (this.docCountItems == null) {
            this.docCountItems = new ArrayList<>();
        }
        docCountItemsSetter.accept(this.docCountItems);
        return this;
    }

    /**
     * **参数解释：** 该时间点各维度的详细统计项。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return docCountItems
     */
    public List<SecurityReportContentResponseReportContentInfoDocCountItems> getDocCountItems() {
        return docCountItems;
    }

    public void setDocCountItems(List<SecurityReportContentResponseReportContentInfoDocCountItems> docCountItems) {
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
        SecurityReportContentResponseReportContentInfoQpsStatisticsInfoTimeline1 that =
            (SecurityReportContentResponseReportContentInfoQpsStatisticsInfoTimeline1) obj;
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
        sb.append("class SecurityReportContentResponseReportContentInfoQpsStatisticsInfoTimeline1 {\n");
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
