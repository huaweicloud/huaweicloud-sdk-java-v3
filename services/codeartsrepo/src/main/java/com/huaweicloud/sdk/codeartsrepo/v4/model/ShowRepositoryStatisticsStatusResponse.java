package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowRepositoryStatisticsStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_statistics")

    private Boolean canStatistics;

    /**
     * **参数解释：** 是否能被统计。 **取值范围：** - 0，表示用户次数和仓库次数都没用完。 - 1，表示仓库次数用完。 - 2，表示用户次数用完。 - 3, 表示仓库次数和用户次数都用完
     */
    public static final class ReasonEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ReasonEnum NUMBER_0 = new ReasonEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ReasonEnum NUMBER_1 = new ReasonEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final ReasonEnum NUMBER_2 = new ReasonEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final ReasonEnum NUMBER_3 = new ReasonEnum(3);

        private static final Map<Integer, ReasonEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ReasonEnum> createStaticFields() {
            Map<Integer, ReasonEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ReasonEnum(Integer value) {
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
        public static ReasonEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReasonEnum(value));
        }

        public static ReasonEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReasonEnum) {
                return this.value.equals(((ReasonEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private ReasonEnum reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event")

    private StatisticEventsDto event;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Total")

    private String xTotal;

    public ShowRepositoryStatisticsStatusResponse withCanStatistics(Boolean canStatistics) {
        this.canStatistics = canStatistics;
        return this;
    }

    /**
     * **参数解释：** 是否能被统计。 **取值范围：** - true，可以被统计。 - false，不可被统计。
     * @return canStatistics
     */
    public Boolean getCanStatistics() {
        return canStatistics;
    }

    public void setCanStatistics(Boolean canStatistics) {
        this.canStatistics = canStatistics;
    }

    public ShowRepositoryStatisticsStatusResponse withReason(ReasonEnum reason) {
        this.reason = reason;
        return this;
    }

    /**
     * **参数解释：** 是否能被统计。 **取值范围：** - 0，表示用户次数和仓库次数都没用完。 - 1，表示仓库次数用完。 - 2，表示用户次数用完。 - 3, 表示仓库次数和用户次数都用完
     * @return reason
     */
    public ReasonEnum getReason() {
        return reason;
    }

    public void setReason(ReasonEnum reason) {
        this.reason = reason;
    }

    public ShowRepositoryStatisticsStatusResponse withEvent(StatisticEventsDto event) {
        this.event = event;
        return this;
    }

    public ShowRepositoryStatisticsStatusResponse withEvent(Consumer<StatisticEventsDto> eventSetter) {
        if (this.event == null) {
            this.event = new StatisticEventsDto();
            eventSetter.accept(this.event);
        }

        return this;
    }

    /**
     * Get event
     * @return event
     */
    public StatisticEventsDto getEvent() {
        return event;
    }

    public void setEvent(StatisticEventsDto event) {
        this.event = event;
    }

    public ShowRepositoryStatisticsStatusResponse withXTotal(String xTotal) {
        this.xTotal = xTotal;
        return this;
    }

    /**
     * Get xTotal
     * @return xTotal
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Total")
    public String getXTotal() {
        return xTotal;
    }

    public void setXTotal(String xTotal) {
        this.xTotal = xTotal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRepositoryStatisticsStatusResponse that = (ShowRepositoryStatisticsStatusResponse) obj;
        return Objects.equals(this.canStatistics, that.canStatistics) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.event, that.event) && Objects.equals(this.xTotal, that.xTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canStatistics, reason, event, xTotal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRepositoryStatisticsStatusResponse {\n");
        sb.append("    canStatistics: ").append(toIndentedString(canStatistics)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    xTotal: ").append(toIndentedString(xTotal)).append("\n");
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
