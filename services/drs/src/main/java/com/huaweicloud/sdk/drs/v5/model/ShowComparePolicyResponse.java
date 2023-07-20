package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

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
public class ShowComparePolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    /**
     * 对比策略状态。 - OPEN：开启 - CLOSED：关闭 - NO_SUPPORT：不支持
     */
    public static final class StatusEnum {

        /**
         * Enum OPEN for value: "OPEN"
         */
        public static final StatusEnum OPEN = new StatusEnum("OPEN");

        /**
         * Enum CLOSED for value: "CLOSED"
         */
        public static final StatusEnum CLOSED = new StatusEnum("CLOSED");

        /**
         * Enum NO_SUPPORT for value: "NO_SUPPORT"
         */
        public static final StatusEnum NO_SUPPORT = new StatusEnum("NO_SUPPORT");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("OPEN", OPEN);
            map.put("CLOSED", CLOSED);
            map.put("NO_SUPPORT", NO_SUPPORT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_type")

    private List<String> compareType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_compare_time")

    private String nextCompareTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_policy")

    private String comparePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval_hour")

    private Integer intervalHour;

    public ShowComparePolicyResponse withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 对比时间。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public ShowComparePolicyResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 对比策略状态。 - OPEN：开启 - CLOSED：关闭 - NO_SUPPORT：不支持
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowComparePolicyResponse withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 对比开始时间。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ShowComparePolicyResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 对比结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowComparePolicyResponse withCompareType(List<String> compareType) {
        this.compareType = compareType;
        return this;
    }

    public ShowComparePolicyResponse addCompareTypeItem(String compareTypeItem) {
        if (this.compareType == null) {
            this.compareType = new ArrayList<>();
        }
        this.compareType.add(compareTypeItem);
        return this;
    }

    public ShowComparePolicyResponse withCompareType(Consumer<List<String>> compareTypeSetter) {
        if (this.compareType == null) {
            this.compareType = new ArrayList<>();
        }
        compareTypeSetter.accept(this.compareType);
        return this;
    }

    /**
     * 对比类型。 - object：对象对比 - lines：行对比 - contents：内容对比 - account：用户对比
     * @return compareType
     */
    public List<String> getCompareType() {
        return compareType;
    }

    public void setCompareType(List<String> compareType) {
        this.compareType = compareType;
    }

    public ShowComparePolicyResponse withNextCompareTime(String nextCompareTime) {
        this.nextCompareTime = nextCompareTime;
        return this;
    }

    /**
     * 下次对比时间，UTC时间，例如：2023-06-12T08:00:00Z
     * @return nextCompareTime
     */
    public String getNextCompareTime() {
        return nextCompareTime;
    }

    public void setNextCompareTime(String nextCompareTime) {
        this.nextCompareTime = nextCompareTime;
    }

    public ShowComparePolicyResponse withComparePolicy(String comparePolicy) {
        this.comparePolicy = comparePolicy;
        return this;
    }

    /**
     * 对比策略。 - normal：普通对比 - manyToOne：多对一对比
     * @return comparePolicy
     */
    public String getComparePolicy() {
        return comparePolicy;
    }

    public void setComparePolicy(String comparePolicy) {
        this.comparePolicy = comparePolicy;
    }

    public ShowComparePolicyResponse withIntervalHour(Integer intervalHour) {
        this.intervalHour = intervalHour;
        return this;
    }

    /**
     * 间隔时间。
     * @return intervalHour
     */
    public Integer getIntervalHour() {
        return intervalHour;
    }

    public void setIntervalHour(Integer intervalHour) {
        this.intervalHour = intervalHour;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowComparePolicyResponse that = (ShowComparePolicyResponse) obj;
        return Objects.equals(this.period, that.period) && Objects.equals(this.status, that.status)
            && Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.compareType, that.compareType)
            && Objects.equals(this.nextCompareTime, that.nextCompareTime)
            && Objects.equals(this.comparePolicy, that.comparePolicy)
            && Objects.equals(this.intervalHour, that.intervalHour);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(period, status, beginTime, endTime, compareType, nextCompareTime, comparePolicy, intervalHour);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowComparePolicyResponse {\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    compareType: ").append(toIndentedString(compareType)).append("\n");
        sb.append("    nextCompareTime: ").append(toIndentedString(nextCompareTime)).append("\n");
        sb.append("    comparePolicy: ").append(toIndentedString(comparePolicy)).append("\n");
        sb.append("    intervalHour: ").append(toIndentedString(intervalHour)).append("\n");
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
