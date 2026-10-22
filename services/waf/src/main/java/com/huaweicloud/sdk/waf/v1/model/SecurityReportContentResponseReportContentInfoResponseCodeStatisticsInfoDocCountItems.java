package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoDocCountItems
 */
public class SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoDocCountItems {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "doc_count")

    private Long docCount;

    public SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoDocCountItems withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 响应码标识。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoDocCountItems withDocCount(
        Long docCount) {
        this.docCount = docCount;
        return this;
    }

    /**
     * **参数解释：** 该响应码的文档计数。 **约束限制：** 不涉及 **取值范围：** ≥0 **默认取值：** 0
     * @return docCount
     */
    public Long getDocCount() {
        return docCount;
    }

    public void setDocCount(Long docCount) {
        this.docCount = docCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoDocCountItems that =
            (SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoDocCountItems) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.docCount, that.docCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, docCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfoDocCountItems {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    docCount: ").append(toIndentedString(docCount)).append("\n");
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
