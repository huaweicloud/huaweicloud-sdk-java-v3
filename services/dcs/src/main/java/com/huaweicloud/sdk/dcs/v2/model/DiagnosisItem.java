package com.huaweicloud.sdk.dcs.v2.model;

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
 * 诊断项
 */
public class DiagnosisItem {

    /**
     * 诊断项名称
     */
    public static final class NameEnum {

        /**
         * Enum CONNECTION_NUM for value: "connection_num"
         */
        public static final NameEnum CONNECTION_NUM = new NameEnum("connection_num");

        /**
         * Enum RX_CONTROLLED for value: "rx_controlled"
         */
        public static final NameEnum RX_CONTROLLED = new NameEnum("rx_controlled");

        /**
         * Enum PERSISTENCE for value: "persistence"
         */
        public static final NameEnum PERSISTENCE = new NameEnum("persistence");

        /**
         * Enum CENTRALIZED_EXPIRATION for value: "centralized_expiration"
         */
        public static final NameEnum CENTRALIZED_EXPIRATION = new NameEnum("centralized_expiration");

        /**
         * Enum INNER_MEMORY_FRAGMENTATION for value: "inner_memory_fragmentation"
         */
        public static final NameEnum INNER_MEMORY_FRAGMENTATION = new NameEnum("inner_memory_fragmentation");

        /**
         * Enum TIME_CONSUMING_COMMANDS for value: "time_consuming_commands"
         */
        public static final NameEnum TIME_CONSUMING_COMMANDS = new NameEnum("time_consuming_commands");

        /**
         * Enum HIT_RATIO for value: "hit_ratio"
         */
        public static final NameEnum HIT_RATIO = new NameEnum("hit_ratio");

        /**
         * Enum MEMORY_USAGE for value: "memory_usage"
         */
        public static final NameEnum MEMORY_USAGE = new NameEnum("memory_usage");

        /**
         * Enum CPU_USAGE for value: "cpu_usage"
         */
        public static final NameEnum CPU_USAGE = new NameEnum("cpu_usage");

        private static final Map<String, NameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NameEnum> createStaticFields() {
            Map<String, NameEnum> map = new HashMap<>();
            map.put("connection_num", CONNECTION_NUM);
            map.put("rx_controlled", RX_CONTROLLED);
            map.put("persistence", PERSISTENCE);
            map.put("centralized_expiration", CENTRALIZED_EXPIRATION);
            map.put("inner_memory_fragmentation", INNER_MEMORY_FRAGMENTATION);
            map.put("time_consuming_commands", TIME_CONSUMING_COMMANDS);
            map.put("hit_ratio", HIT_RATIO);
            map.put("memory_usage", MEMORY_USAGE);
            map.put("cpu_usage", CPU_USAGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NameEnum(String value) {
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
        public static NameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            NameEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NameEnum(value);
            }
            return result;
        }

        public static NameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            NameEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NameEnum) {
                return this.value.equals(((NameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private NameEnum name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cause_ids")

    private List<ConclusionItem> causeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "impact_ids")

    private List<ConclusionItem> impactIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advice_ids")

    private List<ConclusionItem> adviceIds = null;

    /**
    * 诊断结果
    */
    public static final class ResultEnum {

        /**
         * Enum FAILED for value: "failed"
         */
        public static final ResultEnum FAILED = new ResultEnum("failed");

        /**
         * Enum ABNORMAL for value: "abnormal"
         */
        public static final ResultEnum ABNORMAL = new ResultEnum("abnormal");

        /**
         * Enum NORMAL for value: "normal"
         */
        public static final ResultEnum NORMAL = new ResultEnum("normal");

        private static final Map<String, ResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResultEnum> createStaticFields() {
            Map<String, ResultEnum> map = new HashMap<>();
            map.put("failed", FAILED);
            map.put("abnormal", ABNORMAL);
            map.put("normal", NORMAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResultEnum(String value) {
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
        public static ResultEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ResultEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResultEnum(value);
            }
            return result;
        }

        public static ResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResultEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResultEnum) {
                return this.value.equals(((ResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private ResultEnum result;

    public DiagnosisItem withName(NameEnum name) {
        this.name = name;
        return this;
    }

    /**
     * 诊断项名称
     * @return name
     */
    public NameEnum getName() {
        return name;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    public DiagnosisItem withCauseIds(List<ConclusionItem> causeIds) {
        this.causeIds = causeIds;
        return this;
    }

    public DiagnosisItem addCauseIdsItem(ConclusionItem causeIdsItem) {
        if (this.causeIds == null) {
            this.causeIds = new ArrayList<>();
        }
        this.causeIds.add(causeIdsItem);
        return this;
    }

    public DiagnosisItem withCauseIds(Consumer<List<ConclusionItem>> causeIdsSetter) {
        if (this.causeIds == null) {
            this.causeIds = new ArrayList<>();
        }
        causeIdsSetter.accept(this.causeIds);
        return this;
    }

    /**
     * 原因ID列表
     * @return causeIds
     */
    public List<ConclusionItem> getCauseIds() {
        return causeIds;
    }

    public void setCauseIds(List<ConclusionItem> causeIds) {
        this.causeIds = causeIds;
    }

    public DiagnosisItem withImpactIds(List<ConclusionItem> impactIds) {
        this.impactIds = impactIds;
        return this;
    }

    public DiagnosisItem addImpactIdsItem(ConclusionItem impactIdsItem) {
        if (this.impactIds == null) {
            this.impactIds = new ArrayList<>();
        }
        this.impactIds.add(impactIdsItem);
        return this;
    }

    public DiagnosisItem withImpactIds(Consumer<List<ConclusionItem>> impactIdsSetter) {
        if (this.impactIds == null) {
            this.impactIds = new ArrayList<>();
        }
        impactIdsSetter.accept(this.impactIds);
        return this;
    }

    /**
     * 影响ID列表
     * @return impactIds
     */
    public List<ConclusionItem> getImpactIds() {
        return impactIds;
    }

    public void setImpactIds(List<ConclusionItem> impactIds) {
        this.impactIds = impactIds;
    }

    public DiagnosisItem withAdviceIds(List<ConclusionItem> adviceIds) {
        this.adviceIds = adviceIds;
        return this;
    }

    public DiagnosisItem addAdviceIdsItem(ConclusionItem adviceIdsItem) {
        if (this.adviceIds == null) {
            this.adviceIds = new ArrayList<>();
        }
        this.adviceIds.add(adviceIdsItem);
        return this;
    }

    public DiagnosisItem withAdviceIds(Consumer<List<ConclusionItem>> adviceIdsSetter) {
        if (this.adviceIds == null) {
            this.adviceIds = new ArrayList<>();
        }
        adviceIdsSetter.accept(this.adviceIds);
        return this;
    }

    /**
     * 建议ID列表
     * @return adviceIds
     */
    public List<ConclusionItem> getAdviceIds() {
        return adviceIds;
    }

    public void setAdviceIds(List<ConclusionItem> adviceIds) {
        this.adviceIds = adviceIds;
    }

    public DiagnosisItem withResult(ResultEnum result) {
        this.result = result;
        return this;
    }

    /**
     * 诊断结果
     * @return result
     */
    public ResultEnum getResult() {
        return result;
    }

    public void setResult(ResultEnum result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiagnosisItem diagnosisItem = (DiagnosisItem) o;
        return Objects.equals(this.name, diagnosisItem.name) && Objects.equals(this.causeIds, diagnosisItem.causeIds)
            && Objects.equals(this.impactIds, diagnosisItem.impactIds)
            && Objects.equals(this.adviceIds, diagnosisItem.adviceIds)
            && Objects.equals(this.result, diagnosisItem.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, causeIds, impactIds, adviceIds, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiagnosisItem {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    causeIds: ").append(toIndentedString(causeIds)).append("\n");
        sb.append("    impactIds: ").append(toIndentedString(impactIds)).append("\n");
        sb.append("    adviceIds: ").append(toIndentedString(adviceIds)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
