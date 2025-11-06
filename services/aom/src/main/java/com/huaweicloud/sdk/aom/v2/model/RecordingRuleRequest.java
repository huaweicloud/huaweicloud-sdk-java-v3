package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RecordingRuleRequest
 */
public class RecordingRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recording_rule")

    private String recordingRule;

    public RecordingRuleRequest withRecordingRule(String recordingRule) {
        this.recordingRule = recordingRule;
        return this;
    }

    /**
     * 预聚合规则。 待创建的预聚合规则详细信息。支持如下子参数： - groups：规则组。一份RecordingRule.yaml可以配置多组规则组。 - name：规则组名称。规则组名称必须唯一。 - interval：规则组的执行周期。默认60s。（可选） - rules：规则。一个规则组可以包含多条规则。 - record：规则的名称。聚合规则的名称必须符合  [Prometheus指标名称规范](https://prometheus.io/docs/concepts/data_model/#metric-names-and-labels)。  - expr：计算表达式。Prometheus监控将通过该表达式计算得出预聚合指标。计算表达式必须符合[PromQL](https://prometheus.io/docs/prometheus/latest/querying/basics/)。 - labels：指标的标签。标签必须符合[Prometheus指标标签规范](https://prometheus.io/docs/concepts/data_model/#metric-names-and-labels)。（可选）
     * @return recordingRule
     */
    public String getRecordingRule() {
        return recordingRule;
    }

    public void setRecordingRule(String recordingRule) {
        this.recordingRule = recordingRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecordingRuleRequest that = (RecordingRuleRequest) obj;
        return Objects.equals(this.recordingRule, that.recordingRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordingRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordingRuleRequest {\n");
        sb.append("    recordingRule: ").append(toIndentedString(recordingRule)).append("\n");
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
