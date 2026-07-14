package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SLO配置信息
 */
public class SloInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slo_objectives")

    private List<SloObjectives> sloObjectives = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "predict_window_seconds")

    private Integer predictWindowSeconds;

    public SloInfo withSloObjectives(List<SloObjectives> sloObjectives) {
        this.sloObjectives = sloObjectives;
        return this;
    }

    public SloInfo addSloObjectivesItem(SloObjectives sloObjectivesItem) {
        if (this.sloObjectives == null) {
            this.sloObjectives = new ArrayList<>();
        }
        this.sloObjectives.add(sloObjectivesItem);
        return this;
    }

    public SloInfo withSloObjectives(Consumer<List<SloObjectives>> sloObjectivesSetter) {
        if (this.sloObjectives == null) {
            this.sloObjectives = new ArrayList<>();
        }
        sloObjectivesSetter.accept(this.sloObjectives);
        return this;
    }

    /**
     * **参数解释：** 仿真期望指标。 **取值范围：** 不涉及。
     * @return sloObjectives
     */
    public List<SloObjectives> getSloObjectives() {
        return sloObjectives;
    }

    public void setSloObjectives(List<SloObjectives> sloObjectives) {
        this.sloObjectives = sloObjectives;
    }

    public SloInfo withPredictWindowSeconds(Integer predictWindowSeconds) {
        this.predictWindowSeconds = predictWindowSeconds;
        return this;
    }

    /**
     * **参数解释：** 预测时间窗口。 **约束限制：** 60~600。 **取值范围：** 不涉及。 **默认取值：** 60。
     * @return predictWindowSeconds
     */
    public Integer getPredictWindowSeconds() {
        return predictWindowSeconds;
    }

    public void setPredictWindowSeconds(Integer predictWindowSeconds) {
        this.predictWindowSeconds = predictWindowSeconds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SloInfo that = (SloInfo) obj;
        return Objects.equals(this.sloObjectives, that.sloObjectives)
            && Objects.equals(this.predictWindowSeconds, that.predictWindowSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sloObjectives, predictWindowSeconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SloInfo {\n");
        sb.append("    sloObjectives: ").append(toIndentedString(sloObjectives)).append("\n");
        sb.append("    predictWindowSeconds: ").append(toIndentedString(predictWindowSeconds)).append("\n");
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
