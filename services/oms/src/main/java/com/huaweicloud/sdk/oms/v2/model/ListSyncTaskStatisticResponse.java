package com.huaweicloud.sdk.oms.v2.model;

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
public class ListSyncTaskStatisticResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_task_id")

    private String syncTaskId;

    /**
     * 统计结果时间间隔说明描述 FIVE_MINUTES：5分钟 ONE_HOUR：1小时
     */
    public static final class StatisticTimeTypeEnum {

        /**
         * Enum FIVE_MINUTES for value: "FIVE_MINUTES"
         */
        public static final StatisticTimeTypeEnum FIVE_MINUTES = new StatisticTimeTypeEnum("FIVE_MINUTES");

        /**
         * Enum ONE_HOUR for value: "ONE_HOUR"
         */
        public static final StatisticTimeTypeEnum ONE_HOUR = new StatisticTimeTypeEnum("ONE_HOUR");

        private static final Map<String, StatisticTimeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatisticTimeTypeEnum> createStaticFields() {
            Map<String, StatisticTimeTypeEnum> map = new HashMap<>();
            map.put("FIVE_MINUTES", FIVE_MINUTES);
            map.put("ONE_HOUR", ONE_HOUR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatisticTimeTypeEnum(String value) {
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
        public static StatisticTimeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatisticTimeTypeEnum(value));
        }

        public static StatisticTimeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatisticTimeTypeEnum) {
                return this.value.equals(((StatisticTimeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistic_time_type")

    private StatisticTimeTypeEnum statisticTimeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistic_datas")

    private List<StatisticTypeData> statisticDatas = null;

    public ListSyncTaskStatisticResponse withSyncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
        return this;
    }

    /**
     * 同步任务id
     * @return syncTaskId
     */
    public String getSyncTaskId() {
        return syncTaskId;
    }

    public void setSyncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
    }

    public ListSyncTaskStatisticResponse withStatisticTimeType(StatisticTimeTypeEnum statisticTimeType) {
        this.statisticTimeType = statisticTimeType;
        return this;
    }

    /**
     * 统计结果时间间隔说明描述 FIVE_MINUTES：5分钟 ONE_HOUR：1小时
     * @return statisticTimeType
     */
    public StatisticTimeTypeEnum getStatisticTimeType() {
        return statisticTimeType;
    }

    public void setStatisticTimeType(StatisticTimeTypeEnum statisticTimeType) {
        this.statisticTimeType = statisticTimeType;
    }

    public ListSyncTaskStatisticResponse withStatisticDatas(List<StatisticTypeData> statisticDatas) {
        this.statisticDatas = statisticDatas;
        return this;
    }

    public ListSyncTaskStatisticResponse addStatisticDatasItem(StatisticTypeData statisticDatasItem) {
        if (this.statisticDatas == null) {
            this.statisticDatas = new ArrayList<>();
        }
        this.statisticDatas.add(statisticDatasItem);
        return this;
    }

    public ListSyncTaskStatisticResponse withStatisticDatas(Consumer<List<StatisticTypeData>> statisticDatasSetter) {
        if (this.statisticDatas == null) {
            this.statisticDatas = new ArrayList<>();
        }
        statisticDatasSetter.accept(this.statisticDatas);
        return this;
    }

    /**
     * 查询的同步任务统计结果集
     * @return statisticDatas
     */
    public List<StatisticTypeData> getStatisticDatas() {
        return statisticDatas;
    }

    public void setStatisticDatas(List<StatisticTypeData> statisticDatas) {
        this.statisticDatas = statisticDatas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSyncTaskStatisticResponse that = (ListSyncTaskStatisticResponse) obj;
        return Objects.equals(this.syncTaskId, that.syncTaskId)
            && Objects.equals(this.statisticTimeType, that.statisticTimeType)
            && Objects.equals(this.statisticDatas, that.statisticDatas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(syncTaskId, statisticTimeType, statisticDatas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSyncTaskStatisticResponse {\n");
        sb.append("    syncTaskId: ").append(toIndentedString(syncTaskId)).append("\n");
        sb.append("    statisticTimeType: ").append(toIndentedString(statisticTimeType)).append("\n");
        sb.append("    statisticDatas: ").append(toIndentedString(statisticDatas)).append("\n");
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
