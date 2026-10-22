package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：History Server配置。 
 */
public class HistoryServerConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private ObsConfig obs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_insight_enabled")

    private Boolean flowInsightEnabled;

    public HistoryServerConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**：存储历史服务器功能的启用/禁用状态。必须将其设置为“true”才能启用该功能。 **约束限制**：不涉及。 **取值范围**：   - true：启用。   - false：禁用。 **默认取值**：false。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public HistoryServerConfig withObs(ObsConfig obs) {
        this.obs = obs;
        return this;
    }

    public HistoryServerConfig withObs(Consumer<ObsConfig> obsSetter) {
        if (this.obs == null) {
            this.obs = new ObsConfig();
            obsSetter.accept(this.obs);
        }

        return this;
    }

    /**
     * Get obs
     * @return obs
     */
    public ObsConfig getObs() {
        return obs;
    }

    public void setObs(ObsConfig obs) {
        this.obs = obs;
    }

    public HistoryServerConfig withFlowInsightEnabled(Boolean flowInsightEnabled) {
        this.flowInsightEnabled = flowInsightEnabled;
        return this;
    }

    /**
     * **参数解释**：Flow Insight是一项诊断与可观测性功能，它从Ray集群收集指标、日志及工作流执行数据，并通过History Server收集器将其传输至已配置的OBS存储。该功能仅在“enabled”参数设置为“true”时可用。 **约束限制**：不涉及。 **取值范围**：   - true：启用。   - false：禁用。 **默认取值**：false。
     * @return flowInsightEnabled
     */
    public Boolean getFlowInsightEnabled() {
        return flowInsightEnabled;
    }

    public void setFlowInsightEnabled(Boolean flowInsightEnabled) {
        this.flowInsightEnabled = flowInsightEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HistoryServerConfig that = (HistoryServerConfig) obj;
        return Objects.equals(this.enabled, that.enabled) && Objects.equals(this.obs, that.obs)
            && Objects.equals(this.flowInsightEnabled, that.flowInsightEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, obs, flowInsightEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistoryServerConfig {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
        sb.append("    flowInsightEnabled: ").append(toIndentedString(flowInsightEnabled)).append("\n");
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
