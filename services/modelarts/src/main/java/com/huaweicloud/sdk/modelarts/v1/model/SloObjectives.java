package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SLO目标配置
 */
public class SloObjectives {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_ttft")

    private Integer metricTtft;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_tpot")

    private Integer metricTpot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percental")

    private Integer percental;

    public SloObjectives withMetricTtft(Integer metricTtft) {
        this.metricTtft = metricTtft;
        return this;
    }

    /**
     * **参数解释：** TTFT指标，单位毫秒。 **取值范围：** 0~10000。 **约束限制：** 不涉及。 **默认取值：** 100。
     * @return metricTtft
     */
    public Integer getMetricTtft() {
        return metricTtft;
    }

    public void setMetricTtft(Integer metricTtft) {
        this.metricTtft = metricTtft;
    }

    public SloObjectives withMetricTpot(Integer metricTpot) {
        this.metricTpot = metricTpot;
        return this;
    }

    /**
     * **参数解释：** TPOT指标，单位毫秒。 **取值范围：** 0~1000。 **约束限制：** 不涉及。 **默认取值：** 50。
     * @return metricTpot
     */
    public Integer getMetricTpot() {
        return metricTpot;
    }

    public void setMetricTpot(Integer metricTpot) {
        this.metricTpot = metricTpot;
    }

    public SloObjectives withPercental(Integer percental) {
        this.percental = percental;
        return this;
    }

    /**
     * **参数解释：** SLO满足百分比。 **取值范围：** 0~100。
     * @return percental
     */
    public Integer getPercental() {
        return percental;
    }

    public void setPercental(Integer percental) {
        this.percental = percental;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SloObjectives that = (SloObjectives) obj;
        return Objects.equals(this.metricTtft, that.metricTtft) && Objects.equals(this.metricTpot, that.metricTpot)
            && Objects.equals(this.percental, that.percental);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricTtft, metricTpot, percental);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SloObjectives {\n");
        sb.append("    metricTtft: ").append(toIndentedString(metricTtft)).append("\n");
        sb.append("    metricTpot: ").append(toIndentedString(metricTpot)).append("\n");
        sb.append("    percental: ").append(toIndentedString(percental)).append("\n");
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
