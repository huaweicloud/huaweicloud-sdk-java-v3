package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDetailsOfOrchestrationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orchestration_name")

    private String orchestrationName;

    /**
     * 编排策略，有以下几种策略类型： - list：列表； - hash：哈希； - range：区间； - hash_range: 哈希+区间； - none_value: 空值映射； - default: 默认值映射； - head_n: 截取前n项； - tail_n: 截取后n项； 当编排策略为list时，orchestration_map列表长度*map_param_list长度不超过3000。
     */
    public static final class OrchestrationStrategyEnum {

        /**
         * Enum LIST for value: "list"
         */
        public static final OrchestrationStrategyEnum LIST = new OrchestrationStrategyEnum("list");

        /**
         * Enum HASH for value: "hash"
         */
        public static final OrchestrationStrategyEnum HASH = new OrchestrationStrategyEnum("hash");

        /**
         * Enum RANGE for value: "range"
         */
        public static final OrchestrationStrategyEnum RANGE = new OrchestrationStrategyEnum("range");

        /**
         * Enum HASH_RANGE for value: "hash_range"
         */
        public static final OrchestrationStrategyEnum HASH_RANGE = new OrchestrationStrategyEnum("hash_range");

        /**
         * Enum NONE_VALUE for value: "none_value"
         */
        public static final OrchestrationStrategyEnum NONE_VALUE = new OrchestrationStrategyEnum("none_value");

        /**
         * Enum DEFAULT for value: "default"
         */
        public static final OrchestrationStrategyEnum DEFAULT = new OrchestrationStrategyEnum("default");

        /**
         * Enum HEAD_N for value: "head_n"
         */
        public static final OrchestrationStrategyEnum HEAD_N = new OrchestrationStrategyEnum("head_n");

        /**
         * Enum TAIL_N for value: "tail_n"
         */
        public static final OrchestrationStrategyEnum TAIL_N = new OrchestrationStrategyEnum("tail_n");

        private static final Map<String, OrchestrationStrategyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrchestrationStrategyEnum> createStaticFields() {
            Map<String, OrchestrationStrategyEnum> map = new HashMap<>();
            map.put("list", LIST);
            map.put("hash", HASH);
            map.put("range", RANGE);
            map.put("hash_range", HASH_RANGE);
            map.put("none_value", NONE_VALUE);
            map.put("default", DEFAULT);
            map.put("head_n", HEAD_N);
            map.put("tail_n", TAIL_N);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrchestrationStrategyEnum(String value) {
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
        public static OrchestrationStrategyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrchestrationStrategyEnum(value));
        }

        public static OrchestrationStrategyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrchestrationStrategyEnum) {
                return this.value.equals(((OrchestrationStrategyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orchestration_strategy")

    private OrchestrationStrategyEnum orchestrationStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orchestration_mapped_param")

    private OrchestrationMappedParam orchestrationMappedParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_preprocessing")

    private Boolean isPreprocessing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orchestration_map")

    private List<OrchestrationMap> orchestrationMap = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orchestration_id")

    private String orchestrationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orchestration_create_time")

    private OffsetDateTime orchestrationCreateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orchestration_update_time")

    private OffsetDateTime orchestrationUpdateTime;

    public ShowDetailsOfOrchestrationResponse withOrchestrationName(String orchestrationName) {
        this.orchestrationName = orchestrationName;
        return this;
    }

    /**
     * 编排映射规则名称。  支持英文，数字，下划线，且只能以英文开头，3-64个字符，同一实例下不允许重名。
     * @return orchestrationName
     */
    public String getOrchestrationName() {
        return orchestrationName;
    }

    public void setOrchestrationName(String orchestrationName) {
        this.orchestrationName = orchestrationName;
    }

    public ShowDetailsOfOrchestrationResponse withOrchestrationStrategy(
        OrchestrationStrategyEnum orchestrationStrategy) {
        this.orchestrationStrategy = orchestrationStrategy;
        return this;
    }

    /**
     * 编排策略，有以下几种策略类型： - list：列表； - hash：哈希； - range：区间； - hash_range: 哈希+区间； - none_value: 空值映射； - default: 默认值映射； - head_n: 截取前n项； - tail_n: 截取后n项； 当编排策略为list时，orchestration_map列表长度*map_param_list长度不超过3000。
     * @return orchestrationStrategy
     */
    public OrchestrationStrategyEnum getOrchestrationStrategy() {
        return orchestrationStrategy;
    }

    public void setOrchestrationStrategy(OrchestrationStrategyEnum orchestrationStrategy) {
        this.orchestrationStrategy = orchestrationStrategy;
    }

    public ShowDetailsOfOrchestrationResponse withOrchestrationMappedParam(
        OrchestrationMappedParam orchestrationMappedParam) {
        this.orchestrationMappedParam = orchestrationMappedParam;
        return this;
    }

    public ShowDetailsOfOrchestrationResponse withOrchestrationMappedParam(
        Consumer<OrchestrationMappedParam> orchestrationMappedParamSetter) {
        if (this.orchestrationMappedParam == null) {
            this.orchestrationMappedParam = new OrchestrationMappedParam();
            orchestrationMappedParamSetter.accept(this.orchestrationMappedParam);
        }

        return this;
    }

    /**
     * Get orchestrationMappedParam
     * @return orchestrationMappedParam
     */
    public OrchestrationMappedParam getOrchestrationMappedParam() {
        return orchestrationMappedParam;
    }

    public void setOrchestrationMappedParam(OrchestrationMappedParam orchestrationMappedParam) {
        this.orchestrationMappedParam = orchestrationMappedParam;
    }

    public ShowDetailsOfOrchestrationResponse withIsPreprocessing(Boolean isPreprocessing) {
        this.isPreprocessing = isPreprocessing;
        return this;
    }

    /**
     * 是否为预处理策略，预处理策略只会生成临时参数作为后面参数编排规则的入参标记。当为预处理策略时，该编排规则不能作为除default之外的最后一个编排规则。
     * @return isPreprocessing
     */
    public Boolean getIsPreprocessing() {
        return isPreprocessing;
    }

    public void setIsPreprocessing(Boolean isPreprocessing) {
        this.isPreprocessing = isPreprocessing;
    }

    public ShowDetailsOfOrchestrationResponse withOrchestrationMap(List<OrchestrationMap> orchestrationMap) {
        this.orchestrationMap = orchestrationMap;
        return this;
    }

    public ShowDetailsOfOrchestrationResponse addOrchestrationMapItem(OrchestrationMap orchestrationMapItem) {
        if (this.orchestrationMap == null) {
            this.orchestrationMap = new ArrayList<>();
        }
        this.orchestrationMap.add(orchestrationMapItem);
        return this;
    }

    public ShowDetailsOfOrchestrationResponse withOrchestrationMap(
        Consumer<List<OrchestrationMap>> orchestrationMapSetter) {
        if (this.orchestrationMap == null) {
            this.orchestrationMap = new ArrayList<>();
        }
        orchestrationMapSetter.accept(this.orchestrationMap);
        return this;
    }

    /**
     * 编排映射规则列表，列表长度范围为1-300。 编排映射规则的生效优先级与列表顺序保持一致，列表中靠前的配置匹配优先级较高。 映射规则不能重复，当orchestration_strategy=list时，map_param_list的列表也不能包含重复元素。
     * @return orchestrationMap
     */
    public List<OrchestrationMap> getOrchestrationMap() {
        return orchestrationMap;
    }

    public void setOrchestrationMap(List<OrchestrationMap> orchestrationMap) {
        this.orchestrationMap = orchestrationMap;
    }

    public ShowDetailsOfOrchestrationResponse withOrchestrationId(String orchestrationId) {
        this.orchestrationId = orchestrationId;
        return this;
    }

    /**
     * 编排规则编号。
     * @return orchestrationId
     */
    public String getOrchestrationId() {
        return orchestrationId;
    }

    public void setOrchestrationId(String orchestrationId) {
        this.orchestrationId = orchestrationId;
    }

    public ShowDetailsOfOrchestrationResponse withOrchestrationCreateTime(OffsetDateTime orchestrationCreateTime) {
        this.orchestrationCreateTime = orchestrationCreateTime;
        return this;
    }

    /**
     * 编排规则创建时间。
     * @return orchestrationCreateTime
     */
    public OffsetDateTime getOrchestrationCreateTime() {
        return orchestrationCreateTime;
    }

    public void setOrchestrationCreateTime(OffsetDateTime orchestrationCreateTime) {
        this.orchestrationCreateTime = orchestrationCreateTime;
    }

    public ShowDetailsOfOrchestrationResponse withOrchestrationUpdateTime(OffsetDateTime orchestrationUpdateTime) {
        this.orchestrationUpdateTime = orchestrationUpdateTime;
        return this;
    }

    /**
     * 编排规则更新时间。
     * @return orchestrationUpdateTime
     */
    public OffsetDateTime getOrchestrationUpdateTime() {
        return orchestrationUpdateTime;
    }

    public void setOrchestrationUpdateTime(OffsetDateTime orchestrationUpdateTime) {
        this.orchestrationUpdateTime = orchestrationUpdateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDetailsOfOrchestrationResponse that = (ShowDetailsOfOrchestrationResponse) obj;
        return Objects.equals(this.orchestrationName, that.orchestrationName)
            && Objects.equals(this.orchestrationStrategy, that.orchestrationStrategy)
            && Objects.equals(this.orchestrationMappedParam, that.orchestrationMappedParam)
            && Objects.equals(this.isPreprocessing, that.isPreprocessing)
            && Objects.equals(this.orchestrationMap, that.orchestrationMap)
            && Objects.equals(this.orchestrationId, that.orchestrationId)
            && Objects.equals(this.orchestrationCreateTime, that.orchestrationCreateTime)
            && Objects.equals(this.orchestrationUpdateTime, that.orchestrationUpdateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orchestrationName,
            orchestrationStrategy,
            orchestrationMappedParam,
            isPreprocessing,
            orchestrationMap,
            orchestrationId,
            orchestrationCreateTime,
            orchestrationUpdateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDetailsOfOrchestrationResponse {\n");
        sb.append("    orchestrationName: ").append(toIndentedString(orchestrationName)).append("\n");
        sb.append("    orchestrationStrategy: ").append(toIndentedString(orchestrationStrategy)).append("\n");
        sb.append("    orchestrationMappedParam: ").append(toIndentedString(orchestrationMappedParam)).append("\n");
        sb.append("    isPreprocessing: ").append(toIndentedString(isPreprocessing)).append("\n");
        sb.append("    orchestrationMap: ").append(toIndentedString(orchestrationMap)).append("\n");
        sb.append("    orchestrationId: ").append(toIndentedString(orchestrationId)).append("\n");
        sb.append("    orchestrationCreateTime: ").append(toIndentedString(orchestrationCreateTime)).append("\n");
        sb.append("    orchestrationUpdateTime: ").append(toIndentedString(orchestrationUpdateTime)).append("\n");
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
