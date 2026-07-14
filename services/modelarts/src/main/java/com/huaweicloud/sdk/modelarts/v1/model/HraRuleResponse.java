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
public class HraRuleResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable")

    private Boolean disable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaler_type")

    private String scalerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_status")

    private String ruleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slo_info")

    private List<SloInfo> sloInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private List<Metrics> metrics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_replica")

    private List<RoleReplica> roleReplica = null;

    public HraRuleResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 规则ID，在创建HRA策略时即可在返回体中获取，也可通过查询推理单元配比检测信息获取当前用户拥有的HRA策略，其中id字段即为规则ID。 **约束限制：** 不涉及。 **取值范围：** 规则ID。 **默认取值：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HraRuleResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 规则名称。 **取值范围：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HraRuleResponse withDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }

    /**
     * **参数解释：** 规则是否禁用。 **取值范围：** - true：禁用。 - false：不禁用。 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return disable
     */
    public Boolean getDisable() {
        return disable;
    }

    public void setDisable(Boolean disable) {
        this.disable = disable;
    }

    public HraRuleResponse withScalerType(String scalerType) {
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

    public HraRuleResponse withRuleStatus(String ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }

    /**
     * **参数解释：** HRA规则状态。 **取值范围：** - CREATING：创建。 - CONFIG_SUCCESS：配置HRA策略成功。 - EXECUTE_SUCCESS：执行HRA策略成功。 - DELETED：删除。 - FAILED：失败。 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return ruleStatus
     */
    public String getRuleStatus() {
        return ruleStatus;
    }

    public void setRuleStatus(String ruleStatus) {
        this.ruleStatus = ruleStatus;
    }

    public HraRuleResponse withSloInfo(List<SloInfo> sloInfo) {
        this.sloInfo = sloInfo;
        return this;
    }

    public HraRuleResponse addSloInfoItem(SloInfo sloInfoItem) {
        if (this.sloInfo == null) {
            this.sloInfo = new ArrayList<>();
        }
        this.sloInfo.add(sloInfoItem);
        return this;
    }

    public HraRuleResponse withSloInfo(Consumer<List<SloInfo>> sloInfoSetter) {
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

    public HraRuleResponse withMetrics(List<Metrics> metrics) {
        this.metrics = metrics;
        return this;
    }

    public HraRuleResponse addMetricsItem(Metrics metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public HraRuleResponse withMetrics(Consumer<List<Metrics>> metricsSetter) {
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

    public HraRuleResponse withRoleReplica(List<RoleReplica> roleReplica) {
        this.roleReplica = roleReplica;
        return this;
    }

    public HraRuleResponse addRoleReplicaItem(RoleReplica roleReplicaItem) {
        if (this.roleReplica == null) {
            this.roleReplica = new ArrayList<>();
        }
        this.roleReplica.add(roleReplicaItem);
        return this;
    }

    public HraRuleResponse withRoleReplica(Consumer<List<RoleReplica>> roleReplicaSetter) {
        if (this.roleReplica == null) {
            this.roleReplica = new ArrayList<>();
        }
        roleReplicaSetter.accept(this.roleReplica);
        return this;
    }

    /**
     * **参数解释：** 角色扩缩策略（不会进行实质扩缩，因此该配置值无效）。
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
        HraRuleResponse that = (HraRuleResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.disable, that.disable) && Objects.equals(this.scalerType, that.scalerType)
            && Objects.equals(this.ruleStatus, that.ruleStatus) && Objects.equals(this.sloInfo, that.sloInfo)
            && Objects.equals(this.metrics, that.metrics) && Objects.equals(this.roleReplica, that.roleReplica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, disable, scalerType, ruleStatus, sloInfo, metrics, roleReplica);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HraRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
        sb.append("    scalerType: ").append(toIndentedString(scalerType)).append("\n");
        sb.append("    ruleStatus: ").append(toIndentedString(ruleStatus)).append("\n");
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
