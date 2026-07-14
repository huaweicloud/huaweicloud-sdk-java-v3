package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HRA规则
 */
public class HraRuleCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaler_type")

    private String scalerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slo_info")

    private List<SloInfo> sloInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private List<Metrics> metrics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_replica")

    private List<RoleReplica> roleReplica = null;

    public HraRuleCreateRequest withScalerType(String scalerType) {
        this.scalerType = scalerType;
        return this;
    }

    /**
     * **参数解释：** 扩缩容类型。 **取值范围：** - SIMULATOR_ALGO：模拟器算法扩缩容类型。 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return scalerType
     */
    public String getScalerType() {
        return scalerType;
    }

    public void setScalerType(String scalerType) {
        this.scalerType = scalerType;
    }

    public HraRuleCreateRequest withSloInfo(List<SloInfo> sloInfo) {
        this.sloInfo = sloInfo;
        return this;
    }

    public HraRuleCreateRequest addSloInfoItem(SloInfo sloInfoItem) {
        if (this.sloInfo == null) {
            this.sloInfo = new ArrayList<>();
        }
        this.sloInfo.add(sloInfoItem);
        return this;
    }

    public HraRuleCreateRequest withSloInfo(Consumer<List<SloInfo>> sloInfoSetter) {
        if (this.sloInfo == null) {
            this.sloInfo = new ArrayList<>();
        }
        sloInfoSetter.accept(this.sloInfo);
        return this;
    }

    /**
     * **参数解释：** SLO配置参数信息。 **取值范围：** 不涉及。
     * @return sloInfo
     */
    public List<SloInfo> getSloInfo() {
        return sloInfo;
    }

    public void setSloInfo(List<SloInfo> sloInfo) {
        this.sloInfo = sloInfo;
    }

    public HraRuleCreateRequest withMetrics(List<Metrics> metrics) {
        this.metrics = metrics;
        return this;
    }

    public HraRuleCreateRequest addMetricsItem(Metrics metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public HraRuleCreateRequest withMetrics(Consumer<List<Metrics>> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * **参数解释：** 指标信息。 **取值范围：** 不涉及。
     * @return metrics
     */
    public List<Metrics> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<Metrics> metrics) {
        this.metrics = metrics;
    }

    public HraRuleCreateRequest withRoleReplica(List<RoleReplica> roleReplica) {
        this.roleReplica = roleReplica;
        return this;
    }

    public HraRuleCreateRequest addRoleReplicaItem(RoleReplica roleReplicaItem) {
        if (this.roleReplica == null) {
            this.roleReplica = new ArrayList<>();
        }
        this.roleReplica.add(roleReplicaItem);
        return this;
    }

    public HraRuleCreateRequest withRoleReplica(Consumer<List<RoleReplica>> roleReplicaSetter) {
        if (this.roleReplica == null) {
            this.roleReplica = new ArrayList<>();
        }
        roleReplicaSetter.accept(this.roleReplica);
        return this;
    }

    /**
     * **参数解释：** 角色扩缩策略（不会进行实质扩缩，因此该配置值无效）。 **取值范围：** 1~128。
     * @return roleReplica
     */
    public List<RoleReplica> getRoleReplica() {
        return roleReplica;
    }

    public void setRoleReplica(List<RoleReplica> roleReplica) {
        this.roleReplica = roleReplica;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HraRuleCreateRequest that = (HraRuleCreateRequest) obj;
        return Objects.equals(this.scalerType, that.scalerType) && Objects.equals(this.sloInfo, that.sloInfo)
            && Objects.equals(this.metrics, that.metrics) && Objects.equals(this.roleReplica, that.roleReplica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scalerType, sloInfo, metrics, roleReplica);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HraRuleCreateRequest {\n");
        sb.append("    scalerType: ").append(toIndentedString(scalerType)).append("\n");
        sb.append("    sloInfo: ").append(toIndentedString(sloInfo)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    roleReplica: ").append(toIndentedString(roleReplica)).append("\n");
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
