package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SecurityReportContentResponseReportContentInfoOverviewStatisticsListInfo
 */
public class SecurityReportContentResponseReportContentInfoOverviewStatisticsListInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Integer num;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_domains")

    private List<SecurityReportContentResponseReportContentInfoTopDomains> topDomains = null;

    public SecurityReportContentResponseReportContentInfoOverviewStatisticsListInfo withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 统计维度标识（如ACCESS表示访问类统计）。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public SecurityReportContentResponseReportContentInfoOverviewStatisticsListInfo withNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * **参数解释：** 该统计维度的总数量。 **约束限制：** 不涉及 **取值范围：** ≥0 **默认取值：** 0
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public SecurityReportContentResponseReportContentInfoOverviewStatisticsListInfo withTopDomains(
        List<SecurityReportContentResponseReportContentInfoTopDomains> topDomains) {
        this.topDomains = topDomains;
        return this;
    }

    public SecurityReportContentResponseReportContentInfoOverviewStatisticsListInfo addTopDomainsItem(
        SecurityReportContentResponseReportContentInfoTopDomains topDomainsItem) {
        if (this.topDomains == null) {
            this.topDomains = new ArrayList<>();
        }
        this.topDomains.add(topDomainsItem);
        return this;
    }

    public SecurityReportContentResponseReportContentInfoOverviewStatisticsListInfo withTopDomains(
        Consumer<List<SecurityReportContentResponseReportContentInfoTopDomains>> topDomainsSetter) {
        if (this.topDomains == null) {
            this.topDomains = new ArrayList<>();
        }
        topDomainsSetter.accept(this.topDomains);
        return this;
    }

    /**
     * **参数解释：** TOP域名列表，按统计数量排序的域名信息。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return topDomains
     */
    public List<SecurityReportContentResponseReportContentInfoTopDomains> getTopDomains() {
        return topDomains;
    }

    public void setTopDomains(List<SecurityReportContentResponseReportContentInfoTopDomains> topDomains) {
        this.topDomains = topDomains;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityReportContentResponseReportContentInfoOverviewStatisticsListInfo that =
            (SecurityReportContentResponseReportContentInfoOverviewStatisticsListInfo) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.num, that.num)
            && Objects.equals(this.topDomains, that.topDomains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, num, topDomains);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityReportContentResponseReportContentInfoOverviewStatisticsListInfo {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
        sb.append("    topDomains: ").append(toIndentedString(topDomains)).append("\n");
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
