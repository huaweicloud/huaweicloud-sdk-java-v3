package com.huaweicloud.sdk.dsc.v1.model;

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
 * ScanJobRequest
 */
public class ScanJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_ids")

    private List<String> assetIds = null;

    /**
     * 扫描周期，日(DAY)，周(WEEK)，月(MONTH)，单次扫描(ONCE)
     */
    public static final class CycleEnum {

        /**
         * Enum ONCE for value: "ONCE"
         */
        public static final CycleEnum ONCE = new CycleEnum("ONCE");

        /**
         * Enum DAY for value: "DAY"
         */
        public static final CycleEnum DAY = new CycleEnum("DAY");

        /**
         * Enum WEEK for value: "WEEK"
         */
        public static final CycleEnum WEEK = new CycleEnum("WEEK");

        /**
         * Enum MONTH for value: "MONTH"
         */
        public static final CycleEnum MONTH = new CycleEnum("MONTH");

        private static final Map<String, CycleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CycleEnum> createStaticFields() {
            Map<String, CycleEnum> map = new HashMap<>();
            map.put("ONCE", ONCE);
            map.put("DAY", DAY);
            map.put("WEEK", WEEK);
            map.put("MONTH", MONTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CycleEnum(String value) {
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
        public static CycleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CycleEnum(value));
        }

        public static CycleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CycleEnum) {
                return this.value.equals(((CycleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cycle")

    private CycleEnum cycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open")

    private Boolean open;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_group_ids")

    private List<String> ruleGroupIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_nlp")

    private Boolean useNlp;

    public ScanJobRequest withAssetIds(List<String> assetIds) {
        this.assetIds = assetIds;
        return this;
    }

    public ScanJobRequest addAssetIdsItem(String assetIdsItem) {
        if (this.assetIds == null) {
            this.assetIds = new ArrayList<>();
        }
        this.assetIds.add(assetIdsItem);
        return this;
    }

    public ScanJobRequest withAssetIds(Consumer<List<String>> assetIdsSetter) {
        if (this.assetIds == null) {
            this.assetIds = new ArrayList<>();
        }
        assetIdsSetter.accept(this.assetIds);
        return this;
    }

    /**
     * 资产ID列表
     * @return assetIds
     */
    public List<String> getAssetIds() {
        return assetIds;
    }

    public void setAssetIds(List<String> assetIds) {
        this.assetIds = assetIds;
    }

    public ScanJobRequest withCycle(CycleEnum cycle) {
        this.cycle = cycle;
        return this;
    }

    /**
     * 扫描周期，日(DAY)，周(WEEK)，月(MONTH)，单次扫描(ONCE)
     * @return cycle
     */
    public CycleEnum getCycle() {
        return cycle;
    }

    public void setCycle(CycleEnum cycle) {
        this.cycle = cycle;
    }

    public ScanJobRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 扫描任务名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScanJobRequest withOpen(Boolean open) {
        this.open = open;
        return this;
    }

    /**
     * 是否开启任务
     * @return open
     */
    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public ScanJobRequest withRuleGroupIds(List<String> ruleGroupIds) {
        this.ruleGroupIds = ruleGroupIds;
        return this;
    }

    public ScanJobRequest addRuleGroupIdsItem(String ruleGroupIdsItem) {
        if (this.ruleGroupIds == null) {
            this.ruleGroupIds = new ArrayList<>();
        }
        this.ruleGroupIds.add(ruleGroupIdsItem);
        return this;
    }

    public ScanJobRequest withRuleGroupIds(Consumer<List<String>> ruleGroupIdsSetter) {
        if (this.ruleGroupIds == null) {
            this.ruleGroupIds = new ArrayList<>();
        }
        ruleGroupIdsSetter.accept(this.ruleGroupIds);
        return this;
    }

    /**
     * 规则组ID列表
     * @return ruleGroupIds
     */
    public List<String> getRuleGroupIds() {
        return ruleGroupIds;
    }

    public void setRuleGroupIds(List<String> ruleGroupIds) {
        this.ruleGroupIds = ruleGroupIds;
    }

    public ScanJobRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 扫描任务开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ScanJobRequest withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public ScanJobRequest withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * 主题的唯一资源标识符
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public ScanJobRequest withUseNlp(Boolean useNlp) {
        this.useNlp = useNlp;
        return this;
    }

    /**
     * 是否用nlp
     * @return useNlp
     */
    public Boolean getUseNlp() {
        return useNlp;
    }

    public void setUseNlp(Boolean useNlp) {
        this.useNlp = useNlp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScanJobRequest that = (ScanJobRequest) obj;
        return Objects.equals(this.assetIds, that.assetIds) && Objects.equals(this.cycle, that.cycle)
            && Objects.equals(this.name, that.name) && Objects.equals(this.open, that.open)
            && Objects.equals(this.ruleGroupIds, that.ruleGroupIds) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.timeZone, that.timeZone) && Objects.equals(this.topicUrn, that.topicUrn)
            && Objects.equals(this.useNlp, that.useNlp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetIds, cycle, name, open, ruleGroupIds, startTime, timeZone, topicUrn, useNlp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScanJobRequest {\n");
        sb.append("    assetIds: ").append(toIndentedString(assetIds)).append("\n");
        sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    open: ").append(toIndentedString(open)).append("\n");
        sb.append("    ruleGroupIds: ").append(toIndentedString(ruleGroupIds)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    useNlp: ").append(toIndentedString(useNlp)).append("\n");
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
