package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ListSqlRecommendRulesRequestBody
 */
public class ListSqlRecommendRulesRequestBody {

    /**
     * **参数解释**: 推荐类型。 **约束限制**: 不涉及。 **取值范围**: - all：全部 - exec_count：执行次数 - avg_exec_time：平均执行时间 - max_exec_time：最大执行时间  **默认取值**: all
     */
    public static final class RecommendTypeEnum {

        /**
         * Enum ALL for value: "all"
         */
        public static final RecommendTypeEnum ALL = new RecommendTypeEnum("all");

        /**
         * Enum EXEC_COUNT for value: "exec_count"
         */
        public static final RecommendTypeEnum EXEC_COUNT = new RecommendTypeEnum("exec_count");

        /**
         * Enum AVG_EXEC_TIME for value: "avg_exec_time"
         */
        public static final RecommendTypeEnum AVG_EXEC_TIME = new RecommendTypeEnum("avg_exec_time");

        /**
         * Enum MAX_EXEC_TIME for value: "max_exec_time"
         */
        public static final RecommendTypeEnum MAX_EXEC_TIME = new RecommendTypeEnum("max_exec_time");

        private static final Map<String, RecommendTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecommendTypeEnum> createStaticFields() {
            Map<String, RecommendTypeEnum> map = new HashMap<>();
            map.put("all", ALL);
            map.put("exec_count", EXEC_COUNT);
            map.put("avg_exec_time", AVG_EXEC_TIME);
            map.put("max_exec_time", MAX_EXEC_TIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecommendTypeEnum(String value) {
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
        public static RecommendTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RecommendTypeEnum(value));
        }

        public static RecommendTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RecommendTypeEnum) {
                return this.value.equals(((RecommendTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recommend_type")

    private RecommendTypeEnum recommendType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recommend_count")

    private Integer recommendCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_ops_tunnel")

    private Boolean useOpsTunnel;

    public ListSqlRecommendRulesRequestBody withRecommendType(RecommendTypeEnum recommendType) {
        this.recommendType = recommendType;
        return this;
    }

    /**
     * **参数解释**: 推荐类型。 **约束限制**: 不涉及。 **取值范围**: - all：全部 - exec_count：执行次数 - avg_exec_time：平均执行时间 - max_exec_time：最大执行时间  **默认取值**: all
     * @return recommendType
     */
    public RecommendTypeEnum getRecommendType() {
        return recommendType;
    }

    public void setRecommendType(RecommendTypeEnum recommendType) {
        this.recommendType = recommendType;
    }

    public ListSqlRecommendRulesRequestBody withRecommendCount(Integer recommendCount) {
        this.recommendCount = recommendCount;
        return this;
    }

    /**
     * **参数解释**: 推荐规则返回条数。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return recommendCount
     */
    public Integer getRecommendCount() {
        return recommendCount;
    }

    public void setRecommendCount(Integer recommendCount) {
        this.recommendCount = recommendCount;
    }

    public ListSqlRecommendRulesRequestBody withUseOpsTunnel(Boolean useOpsTunnel) {
        this.useOpsTunnel = useOpsTunnel;
        return this;
    }

    /**
     * **参数解释**: 是否使用紧急通道。 **约束限制**: 不涉及。 **取值范围**: - true：开启紧急通道 - false：关闭紧急通道  **默认取值**: false
     * @return useOpsTunnel
     */
    public Boolean getUseOpsTunnel() {
        return useOpsTunnel;
    }

    public void setUseOpsTunnel(Boolean useOpsTunnel) {
        this.useOpsTunnel = useOpsTunnel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSqlRecommendRulesRequestBody that = (ListSqlRecommendRulesRequestBody) obj;
        return Objects.equals(this.recommendType, that.recommendType)
            && Objects.equals(this.recommendCount, that.recommendCount)
            && Objects.equals(this.useOpsTunnel, that.useOpsTunnel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recommendType, recommendCount, useOpsTunnel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSqlRecommendRulesRequestBody {\n");
        sb.append("    recommendType: ").append(toIndentedString(recommendType)).append("\n");
        sb.append("    recommendCount: ").append(toIndentedString(recommendCount)).append("\n");
        sb.append("    useOpsTunnel: ").append(toIndentedString(useOpsTunnel)).append("\n");
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
