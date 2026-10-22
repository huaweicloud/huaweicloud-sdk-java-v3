package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SecurityReportContentResponseReportContentInfoAttackTypeDistributionInfoList
 */
public class SecurityReportContentResponseReportContentInfoAttackTypeDistributionInfoList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Integer num;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private List<SecurityReportContentResponseReportContentInfoDetail> detail = null;

    public SecurityReportContentResponseReportContentInfoAttackTypeDistributionInfoList withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 攻击类型标识（如custom_custom表示精准防护类攻击）。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public SecurityReportContentResponseReportContentInfoAttackTypeDistributionInfoList withNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * **参数解释：** 该攻击类型的总数量。 **约束限制：** 不涉及 **取值范围：** ≥0 **默认取值：** 0
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public SecurityReportContentResponseReportContentInfoAttackTypeDistributionInfoList withDetail(
        List<SecurityReportContentResponseReportContentInfoDetail> detail) {
        this.detail = detail;
        return this;
    }

    public SecurityReportContentResponseReportContentInfoAttackTypeDistributionInfoList addDetailItem(
        SecurityReportContentResponseReportContentInfoDetail detailItem) {
        if (this.detail == null) {
            this.detail = new ArrayList<>();
        }
        this.detail.add(detailItem);
        return this;
    }

    public SecurityReportContentResponseReportContentInfoAttackTypeDistributionInfoList withDetail(
        Consumer<List<SecurityReportContentResponseReportContentInfoDetail>> detailSetter) {
        if (this.detail == null) {
            this.detail = new ArrayList<>();
        }
        detailSetter.accept(this.detail);
        return this;
    }

    /**
     * **参数解释：** 该攻击类型的详细分布信息。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return detail
     */
    public List<SecurityReportContentResponseReportContentInfoDetail> getDetail() {
        return detail;
    }

    public void setDetail(List<SecurityReportContentResponseReportContentInfoDetail> detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityReportContentResponseReportContentInfoAttackTypeDistributionInfoList that =
            (SecurityReportContentResponseReportContentInfoAttackTypeDistributionInfoList) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.num, that.num)
            && Objects.equals(this.detail, that.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, num, detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityReportContentResponseReportContentInfoAttackTypeDistributionInfoList {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
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
