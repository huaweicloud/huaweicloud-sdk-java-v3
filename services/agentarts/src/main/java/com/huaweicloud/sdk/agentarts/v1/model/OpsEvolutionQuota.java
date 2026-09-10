package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OpsEvolutionQuota
 */
public class OpsEvolutionQuota {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    public OpsEvolutionQuota withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 配额类型。 **取值范围：** - model_tuning_task_count: 单个租户可以创建的模型优化任务个数 - agent_tuning_task_count: 单个租户可以创建的智能体优化任务个数 - parallel_agent_tuning_task_count: 单个租户可以并行运行的的智能体优化任务个数 - analysis_task_count: 单个租户可以创建的分析任务个数 - parallel_analysis_task_count: 单个租户可以并行运行的的分析任务个数 - model_deployment_count: 单个租户可以创建的模型部署个数
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OpsEvolutionQuota withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * **参数解释：** 当前配置的配额值。 **取值范围：** 取值为 1-10000个。
     * minimum: 1
     * maximum: 10000
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public OpsEvolutionQuota withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * **参数解释：** 已使用数量（实时计算）。 **取值范围：** 取值为 0-10000个。
     * minimum: 0
     * maximum: 10000
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsEvolutionQuota that = (OpsEvolutionQuota) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.quota, that.quota)
            && Objects.equals(this.used, that.used);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, quota, used);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsEvolutionQuota {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
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
