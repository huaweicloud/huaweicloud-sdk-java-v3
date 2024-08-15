package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeployStrategyGrayRelease
 */
public class DeployStrategyGrayRelease {

    /**
     * 灰度策略:WEIGHT为基于流量比例，CONTENT为基于内容
     */
    public static final class TypeEnum {

        /**
         * Enum WEIGHT for value: "WEIGHT"
         */
        public static final TypeEnum WEIGHT = new TypeEnum("WEIGHT");

        /**
         * Enum CONTENT for value: "CONTENT"
         */
        public static final TypeEnum CONTENT = new TypeEnum("CONTENT");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("WEIGHT", WEIGHT);
            map.put("CONTENT", CONTENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    /**
     * 灰度实例新增模式:MIRROR为蓝绿，EXTRA为金丝雀（先增后减），NOSURGE为金丝雀（先减后增）
     */
    public static final class ReplicaSurgeModeEnum {

        /**
         * Enum MIRROR for value: "MIRROR"
         */
        public static final ReplicaSurgeModeEnum MIRROR = new ReplicaSurgeModeEnum("MIRROR");

        /**
         * Enum EXTRA for value: "EXTRA"
         */
        public static final ReplicaSurgeModeEnum EXTRA = new ReplicaSurgeModeEnum("EXTRA");

        /**
         * Enum NOSURGE for value: "NOSURGE"
         */
        public static final ReplicaSurgeModeEnum NOSURGE = new ReplicaSurgeModeEnum("NOSURGE");

        private static final Map<String, ReplicaSurgeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReplicaSurgeModeEnum> createStaticFields() {
            Map<String, ReplicaSurgeModeEnum> map = new HashMap<>();
            map.put("MIRROR", MIRROR);
            map.put("EXTRA", EXTRA);
            map.put("NOSURGE", NOSURGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReplicaSurgeModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ReplicaSurgeModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReplicaSurgeModeEnum(value));
        }

        public static ReplicaSurgeModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReplicaSurgeModeEnum) {
                return this.value.equals(((ReplicaSurgeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica_surge_mode")

    private ReplicaSurgeModeEnum replicaSurgeMode;

    /**
     * 类型1（使用应用网关、微服务引擎）、类型3（注册到微服务中心）、类型4（对接ELB独享型）、类型6（对接ELB共享型）
     */
    public static final class DeploymentModeEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final DeploymentModeEnum NUMBER_1 = new DeploymentModeEnum(1);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final DeploymentModeEnum NUMBER_3 = new DeploymentModeEnum(3);

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final DeploymentModeEnum NUMBER_4 = new DeploymentModeEnum(4);

        /**
         * Enum NUMBER_6 for value: 6
         */
        public static final DeploymentModeEnum NUMBER_6 = new DeploymentModeEnum(6);

        private static final Map<Integer, DeploymentModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, DeploymentModeEnum> createStaticFields() {
            Map<Integer, DeploymentModeEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            map.put(6, NUMBER_6);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        DeploymentModeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DeploymentModeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeploymentModeEnum(value));
        }

        public static DeploymentModeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeploymentModeEnum) {
                return this.value.equals(((DeploymentModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_mode")

    private DeploymentModeEnum deploymentMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_batch_weight")

    private Integer firstBatchWeight;

    /**
     * all满足所有条件，any满足任意条件(type为CONTENT时配置)
     */
    public static final class RuleMatchModeEnum {

        /**
         * Enum ALL for value: "all"
         */
        public static final RuleMatchModeEnum ALL = new RuleMatchModeEnum("all");

        /**
         * Enum ANY for value: "any"
         */
        public static final RuleMatchModeEnum ANY = new RuleMatchModeEnum("any");

        private static final Map<String, RuleMatchModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RuleMatchModeEnum> createStaticFields() {
            Map<String, RuleMatchModeEnum> map = new HashMap<>();
            map.put("all", ALL);
            map.put("any", ANY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RuleMatchModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RuleMatchModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RuleMatchModeEnum(value));
        }

        public static RuleMatchModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RuleMatchModeEnum) {
                return this.value.equals(((RuleMatchModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_match_mode")

    private RuleMatchModeEnum ruleMatchMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<DeployStrategyGrayReleaseRules> rules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_batch_replica")

    private Integer firstBatchReplica;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remaining_batch")

    private Integer remainingBatch;

    public DeployStrategyGrayRelease withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 灰度策略:WEIGHT为基于流量比例，CONTENT为基于内容
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public DeployStrategyGrayRelease withReplicaSurgeMode(ReplicaSurgeModeEnum replicaSurgeMode) {
        this.replicaSurgeMode = replicaSurgeMode;
        return this;
    }

    /**
     * 灰度实例新增模式:MIRROR为蓝绿，EXTRA为金丝雀（先增后减），NOSURGE为金丝雀（先减后增）
     * @return replicaSurgeMode
     */
    public ReplicaSurgeModeEnum getReplicaSurgeMode() {
        return replicaSurgeMode;
    }

    public void setReplicaSurgeMode(ReplicaSurgeModeEnum replicaSurgeMode) {
        this.replicaSurgeMode = replicaSurgeMode;
    }

    public DeployStrategyGrayRelease withDeploymentMode(DeploymentModeEnum deploymentMode) {
        this.deploymentMode = deploymentMode;
        return this;
    }

    /**
     * 类型1（使用应用网关、微服务引擎）、类型3（注册到微服务中心）、类型4（对接ELB独享型）、类型6（对接ELB共享型）
     * @return deploymentMode
     */
    public DeploymentModeEnum getDeploymentMode() {
        return deploymentMode;
    }

    public void setDeploymentMode(DeploymentModeEnum deploymentMode) {
        this.deploymentMode = deploymentMode;
    }

    public DeployStrategyGrayRelease withFirstBatchWeight(Integer firstBatchWeight) {
        this.firstBatchWeight = firstBatchWeight;
        return this;
    }

    /**
     * 灰度流量比例(type为WEIGHT时配置)
     * @return firstBatchWeight
     */
    public Integer getFirstBatchWeight() {
        return firstBatchWeight;
    }

    public void setFirstBatchWeight(Integer firstBatchWeight) {
        this.firstBatchWeight = firstBatchWeight;
    }

    public DeployStrategyGrayRelease withRuleMatchMode(RuleMatchModeEnum ruleMatchMode) {
        this.ruleMatchMode = ruleMatchMode;
        return this;
    }

    /**
     * all满足所有条件，any满足任意条件(type为CONTENT时配置)
     * @return ruleMatchMode
     */
    public RuleMatchModeEnum getRuleMatchMode() {
        return ruleMatchMode;
    }

    public void setRuleMatchMode(RuleMatchModeEnum ruleMatchMode) {
        this.ruleMatchMode = ruleMatchMode;
    }

    public DeployStrategyGrayRelease withRules(List<DeployStrategyGrayReleaseRules> rules) {
        this.rules = rules;
        return this;
    }

    public DeployStrategyGrayRelease addRulesItem(DeployStrategyGrayReleaseRules rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public DeployStrategyGrayRelease withRules(Consumer<List<DeployStrategyGrayReleaseRules>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 灰度匹配规则(type为CONTENT时配置)
     * @return rules
     */
    public List<DeployStrategyGrayReleaseRules> getRules() {
        return rules;
    }

    public void setRules(List<DeployStrategyGrayReleaseRules> rules) {
        this.rules = rules;
    }

    public DeployStrategyGrayRelease withFirstBatchReplica(Integer firstBatchReplica) {
        this.firstBatchReplica = firstBatchReplica;
        return this;
    }

    /**
     * 首批灰度实例数量(replica_surge_mode为金丝雀类型时需要配置)
     * @return firstBatchReplica
     */
    public Integer getFirstBatchReplica() {
        return firstBatchReplica;
    }

    public void setFirstBatchReplica(Integer firstBatchReplica) {
        this.firstBatchReplica = firstBatchReplica;
    }

    public DeployStrategyGrayRelease withRemainingBatch(Integer remainingBatch) {
        this.remainingBatch = remainingBatch;
        return this;
    }

    /**
     * 剩余实例部署批次(replica_surge_mode为金丝雀类型时需要配置)
     * @return remainingBatch
     */
    public Integer getRemainingBatch() {
        return remainingBatch;
    }

    public void setRemainingBatch(Integer remainingBatch) {
        this.remainingBatch = remainingBatch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeployStrategyGrayRelease that = (DeployStrategyGrayRelease) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.replicaSurgeMode, that.replicaSurgeMode)
            && Objects.equals(this.deploymentMode, that.deploymentMode)
            && Objects.equals(this.firstBatchWeight, that.firstBatchWeight)
            && Objects.equals(this.ruleMatchMode, that.ruleMatchMode) && Objects.equals(this.rules, that.rules)
            && Objects.equals(this.firstBatchReplica, that.firstBatchReplica)
            && Objects.equals(this.remainingBatch, that.remainingBatch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            replicaSurgeMode,
            deploymentMode,
            firstBatchWeight,
            ruleMatchMode,
            rules,
            firstBatchReplica,
            remainingBatch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployStrategyGrayRelease {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    replicaSurgeMode: ").append(toIndentedString(replicaSurgeMode)).append("\n");
        sb.append("    deploymentMode: ").append(toIndentedString(deploymentMode)).append("\n");
        sb.append("    firstBatchWeight: ").append(toIndentedString(firstBatchWeight)).append("\n");
        sb.append("    ruleMatchMode: ").append(toIndentedString(ruleMatchMode)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    firstBatchReplica: ").append(toIndentedString(firstBatchReplica)).append("\n");
        sb.append("    remainingBatch: ").append(toIndentedString(remainingBatch)).append("\n");
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
