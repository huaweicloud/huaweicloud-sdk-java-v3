package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 状态详情
 */
public class ListAlertRuleTemplateMetricsResponseBodyStatusMetric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "activity")

    private Integer activity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ENABLED")

    private Integer enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "DISABLED")

    private Integer disabled;

    public ListAlertRuleTemplateMetricsResponseBodyStatusMetric withActivity(Integer activity) {
        this.activity = activity;
        return this;
    }

    /**
     * 活跃状态数量
     * minimum: 0
     * maximum: 10000
     * @return activity
     */
    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }

    public ListAlertRuleTemplateMetricsResponseBodyStatusMetric withEnabled(Integer enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 启用状态数量
     * minimum: 0
     * maximum: 10000
     * @return enabled
     */
    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public ListAlertRuleTemplateMetricsResponseBodyStatusMetric withDisabled(Integer disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * 禁用状态数量
     * minimum: 0
     * maximum: 10000
     * @return disabled
     */
    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlertRuleTemplateMetricsResponseBodyStatusMetric that =
            (ListAlertRuleTemplateMetricsResponseBodyStatusMetric) obj;
        return Objects.equals(this.activity, that.activity) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.disabled, that.disabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activity, enabled, disabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlertRuleTemplateMetricsResponseBodyStatusMetric {\n");
        sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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
