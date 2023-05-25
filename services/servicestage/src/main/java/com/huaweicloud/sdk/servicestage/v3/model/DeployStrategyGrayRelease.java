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
     * Gets or Sets type
     */
    public static final class TypeEnum {

        /**
         * Enum WEIGHT for value: "weight"
         */
        public static final TypeEnum WEIGHT = new TypeEnum("weight");

        /**
         * Enum CONTENT for value: "content"
         */
        public static final TypeEnum CONTENT = new TypeEnum("content");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("weight", WEIGHT);
            map.put("content", CONTENT);
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
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_batch_weight")

    private Integer firstBatchWeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_batch_replica")

    private Integer firstBatchReplica;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remaining_batch")

    private Integer remainingBatch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_mode")

    private Integer deploymentMode;

    /**
     * Gets or Sets replicaSurgeMode
     */
    public static final class ReplicaSurgeModeEnum {

        /**
         * Enum MIRROR for value: "mirror"
         */
        public static final ReplicaSurgeModeEnum MIRROR = new ReplicaSurgeModeEnum("mirror");

        /**
         * Enum EXTRA for value: "extra"
         */
        public static final ReplicaSurgeModeEnum EXTRA = new ReplicaSurgeModeEnum("extra");

        /**
         * Enum NO_SURGE for value: "no_surge"
         */
        public static final ReplicaSurgeModeEnum NO_SURGE = new ReplicaSurgeModeEnum("no_surge");

        private static final Map<String, ReplicaSurgeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReplicaSurgeModeEnum> createStaticFields() {
            Map<String, ReplicaSurgeModeEnum> map = new HashMap<>();
            map.put("mirror", MIRROR);
            map.put("extra", EXTRA);
            map.put("no_surge", NO_SURGE);
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
            ReplicaSurgeModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ReplicaSurgeModeEnum(value);
            }
            return result;
        }

        public static ReplicaSurgeModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ReplicaSurgeModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
     * Gets or Sets ruleMatchMode
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
            RuleMatchModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RuleMatchModeEnum(value);
            }
            return result;
        }

        public static RuleMatchModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            RuleMatchModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    public DeployStrategyGrayRelease withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public DeployStrategyGrayRelease withFirstBatchWeight(Integer firstBatchWeight) {
        this.firstBatchWeight = firstBatchWeight;
        return this;
    }

    /**
     * only used for weight type
     * @return firstBatchWeight
     */
    public Integer getFirstBatchWeight() {
        return firstBatchWeight;
    }

    public void setFirstBatchWeight(Integer firstBatchWeight) {
        this.firstBatchWeight = firstBatchWeight;
    }

    public DeployStrategyGrayRelease withFirstBatchReplica(Integer firstBatchReplica) {
        this.firstBatchReplica = firstBatchReplica;
        return this;
    }

    /**
     * Get firstBatchReplica
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
     * Get remainingBatch
     * @return remainingBatch
     */
    public Integer getRemainingBatch() {
        return remainingBatch;
    }

    public void setRemainingBatch(Integer remainingBatch) {
        this.remainingBatch = remainingBatch;
    }

    public DeployStrategyGrayRelease withDeploymentMode(Integer deploymentMode) {
        this.deploymentMode = deploymentMode;
        return this;
    }

    /**
     * Get deploymentMode
     * @return deploymentMode
     */
    public Integer getDeploymentMode() {
        return deploymentMode;
    }

    public void setDeploymentMode(Integer deploymentMode) {
        this.deploymentMode = deploymentMode;
    }

    public DeployStrategyGrayRelease withReplicaSurgeMode(ReplicaSurgeModeEnum replicaSurgeMode) {
        this.replicaSurgeMode = replicaSurgeMode;
        return this;
    }

    /**
     * Get replicaSurgeMode
     * @return replicaSurgeMode
     */
    public ReplicaSurgeModeEnum getReplicaSurgeMode() {
        return replicaSurgeMode;
    }

    public void setReplicaSurgeMode(ReplicaSurgeModeEnum replicaSurgeMode) {
        this.replicaSurgeMode = replicaSurgeMode;
    }

    public DeployStrategyGrayRelease withRuleMatchMode(RuleMatchModeEnum ruleMatchMode) {
        this.ruleMatchMode = ruleMatchMode;
        return this;
    }

    /**
     * Get ruleMatchMode
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
     * Get rules
     * @return rules
     */
    public List<DeployStrategyGrayReleaseRules> getRules() {
        return rules;
    }

    public void setRules(List<DeployStrategyGrayReleaseRules> rules) {
        this.rules = rules;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeployStrategyGrayRelease deployStrategyGrayRelease = (DeployStrategyGrayRelease) o;
        return Objects.equals(this.type, deployStrategyGrayRelease.type)
            && Objects.equals(this.firstBatchWeight, deployStrategyGrayRelease.firstBatchWeight)
            && Objects.equals(this.firstBatchReplica, deployStrategyGrayRelease.firstBatchReplica)
            && Objects.equals(this.remainingBatch, deployStrategyGrayRelease.remainingBatch)
            && Objects.equals(this.deploymentMode, deployStrategyGrayRelease.deploymentMode)
            && Objects.equals(this.replicaSurgeMode, deployStrategyGrayRelease.replicaSurgeMode)
            && Objects.equals(this.ruleMatchMode, deployStrategyGrayRelease.ruleMatchMode)
            && Objects.equals(this.rules, deployStrategyGrayRelease.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            firstBatchWeight,
            firstBatchReplica,
            remainingBatch,
            deploymentMode,
            replicaSurgeMode,
            ruleMatchMode,
            rules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployStrategyGrayRelease {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    firstBatchWeight: ").append(toIndentedString(firstBatchWeight)).append("\n");
        sb.append("    firstBatchReplica: ").append(toIndentedString(firstBatchReplica)).append("\n");
        sb.append("    remainingBatch: ").append(toIndentedString(remainingBatch)).append("\n");
        sb.append("    deploymentMode: ").append(toIndentedString(deploymentMode)).append("\n");
        sb.append("    replicaSurgeMode: ").append(toIndentedString(replicaSurgeMode)).append("\n");
        sb.append("    ruleMatchMode: ").append(toIndentedString(ruleMatchMode)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
