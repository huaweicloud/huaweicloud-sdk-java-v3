package com.huaweicloud.sdk.workspace.v2.model;

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
 * 定时任务时间配置。
 */
public class ScheduledTaskConfig {

    /**
     * 执行周期类型，可选值为： - FIXED_TIME：指定时间。 - DAY：按天。 - WEEK：按周。 - MONTH：按月。 - LIFE_CYCLE：指定场景下触发。
     */
    public static final class ScheduledTypeEnum {

        /**
         * Enum FIXED_TIME for value: "FIXED_TIME"
         */
        public static final ScheduledTypeEnum FIXED_TIME = new ScheduledTypeEnum("FIXED_TIME");

        /**
         * Enum DAY for value: "DAY"
         */
        public static final ScheduledTypeEnum DAY = new ScheduledTypeEnum("DAY");

        /**
         * Enum WEEK for value: "WEEK"
         */
        public static final ScheduledTypeEnum WEEK = new ScheduledTypeEnum("WEEK");

        /**
         * Enum MONTH for value: "MONTH"
         */
        public static final ScheduledTypeEnum MONTH = new ScheduledTypeEnum("MONTH");

        /**
         * Enum LIFE_CYCLE for value: "LIFE_CYCLE"
         */
        public static final ScheduledTypeEnum LIFE_CYCLE = new ScheduledTypeEnum("LIFE_CYCLE");

        private static final Map<String, ScheduledTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScheduledTypeEnum> createStaticFields() {
            Map<String, ScheduledTypeEnum> map = new HashMap<>();
            map.put("FIXED_TIME", FIXED_TIME);
            map.put("DAY", DAY);
            map.put("WEEK", WEEK);
            map.put("MONTH", MONTH);
            map.put("LIFE_CYCLE", LIFE_CYCLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScheduledTypeEnum(String value) {
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
        public static ScheduledTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScheduledTypeEnum(value));
        }

        public static ScheduledTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScheduledTypeEnum) {
                return this.value.equals(((ScheduledTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_type")

    private ScheduledTypeEnum scheduledType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day_interval")

    private Integer dayInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "week_list")

    private String weekList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "month_list")

    private String monthList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_list")

    private String dateList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_date")

    private String scheduledDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_time")

    private String scheduledTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gray_count")

    private Integer grayCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gray_desktop_ids")

    private List<String> grayDesktopIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gray_fail_threshold")

    private Integer grayFailThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "life_cycle_type")

    private String lifeCycleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    public ScheduledTaskConfig withScheduledType(ScheduledTypeEnum scheduledType) {
        this.scheduledType = scheduledType;
        return this;
    }

    /**
     * 执行周期类型，可选值为： - FIXED_TIME：指定时间。 - DAY：按天。 - WEEK：按周。 - MONTH：按月。 - LIFE_CYCLE：指定场景下触发。
     * @return scheduledType
     */
    public ScheduledTypeEnum getScheduledType() {
        return scheduledType;
    }

    public void setScheduledType(ScheduledTypeEnum scheduledType) {
        this.scheduledType = scheduledType;
    }

    public ScheduledTaskConfig withDayInterval(Integer dayInterval) {
        this.dayInterval = dayInterval;
        return this;
    }

    /**
     * 周期按天时：按x天间隔执行。
     * minimum: 1
     * maximum: 31
     * @return dayInterval
     */
    public Integer getDayInterval() {
        return dayInterval;
    }

    public void setDayInterval(Integer dayInterval) {
        this.dayInterval = dayInterval;
    }

    public ScheduledTaskConfig withWeekList(String weekList) {
        this.weekList = weekList;
        return this;
    }

    /**
     * 周期按周时：取值1~7，分别对应周日~周六，英文逗号分隔，如1,2,7。
     * @return weekList
     */
    public String getWeekList() {
        return weekList;
    }

    public void setWeekList(String weekList) {
        this.weekList = weekList;
    }

    public ScheduledTaskConfig withMonthList(String monthList) {
        this.monthList = monthList;
        return this;
    }

    /**
     * 周期按月时：取值1~12，英文逗号分隔，如1,3,12。
     * @return monthList
     */
    public String getMonthList() {
        return monthList;
    }

    public void setMonthList(String monthList) {
        this.monthList = monthList;
    }

    public ScheduledTaskConfig withDateList(String dateList) {
        this.dateList = dateList;
        return this;
    }

    /**
     * 周期按月时：取值1~31及L(代表当月最后一天)，英文逗号分隔，如1,2,28,L。
     * @return dateList
     */
    public String getDateList() {
        return dateList;
    }

    public void setDateList(String dateList) {
        this.dateList = dateList;
    }

    public ScheduledTaskConfig withScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate;
        return this;
    }

    /**
     * 周期指定时间时：表示指定的日期，格式为yyyy-MM-dd。
     * @return scheduledDate
     */
    public String getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public ScheduledTaskConfig withScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
        return this;
    }

    /**
     * 指定的执行时间点，格式为HH:mm:ss。
     * @return scheduledTime
     */
    public String getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public ScheduledTaskConfig withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 到期时间，格式为yyyy-MM-dd HH:mm:ss。
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public ScheduledTaskConfig withGrayCount(Integer grayCount) {
        this.grayCount = grayCount;
        return this;
    }

    /**
     * 灰度对象数量，优先级高于gray_desktop_ids。只支持脚本执行。
     * minimum: 0
     * maximum: 1000
     * @return grayCount
     */
    public Integer getGrayCount() {
        return grayCount;
    }

    public void setGrayCount(Integer grayCount) {
        this.grayCount = grayCount;
    }

    public ScheduledTaskConfig withGrayDesktopIds(List<String> grayDesktopIds) {
        this.grayDesktopIds = grayDesktopIds;
        return this;
    }

    public ScheduledTaskConfig addGrayDesktopIdsItem(String grayDesktopIdsItem) {
        if (this.grayDesktopIds == null) {
            this.grayDesktopIds = new ArrayList<>();
        }
        this.grayDesktopIds.add(grayDesktopIdsItem);
        return this;
    }

    public ScheduledTaskConfig withGrayDesktopIds(Consumer<List<String>> grayDesktopIdsSetter) {
        if (this.grayDesktopIds == null) {
            this.grayDesktopIds = new ArrayList<>();
        }
        grayDesktopIdsSetter.accept(this.grayDesktopIds);
        return this;
    }

    /**
     * 灰度执行的桌面id列表，优先级低于gray_count。只支持脚本执行。
     * @return grayDesktopIds
     */
    public List<String> getGrayDesktopIds() {
        return grayDesktopIds;
    }

    public void setGrayDesktopIds(List<String> grayDesktopIds) {
        this.grayDesktopIds = grayDesktopIds;
    }

    public ScheduledTaskConfig withGrayFailThreshold(Integer grayFailThreshold) {
        this.grayFailThreshold = grayFailThreshold;
        return this;
    }

    /**
     * 灰度失败阈值，灰度执行失败次数达到该值时，不执行下一批任务。只支持脚本执行。
     * minimum: 1
     * maximum: 1000
     * @return grayFailThreshold
     */
    public Integer getGrayFailThreshold() {
        return grayFailThreshold;
    }

    public void setGrayFailThreshold(Integer grayFailThreshold) {
        this.grayFailThreshold = grayFailThreshold;
    }

    public ScheduledTaskConfig withLifeCycleType(String lifeCycleType) {
        this.lifeCycleType = lifeCycleType;
        return this;
    }

    /**
     * 触发场景。POST_CREATE_DESKTOP_SUCCESS：创建桌面成功后，POST_REBUILD_DESKTOP_SUCCESS：重建桌面成功后，POST_REATTACH_DESKTOP_SUCCESS：触发重建的分配用户任务成功后。
     * @return lifeCycleType
     */
    public String getLifeCycleType() {
        return lifeCycleType;
    }

    public void setLifeCycleType(String lifeCycleType) {
        this.lifeCycleType = lifeCycleType;
    }

    public ScheduledTaskConfig withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduledTaskConfig that = (ScheduledTaskConfig) obj;
        return Objects.equals(this.scheduledType, that.scheduledType)
            && Objects.equals(this.dayInterval, that.dayInterval) && Objects.equals(this.weekList, that.weekList)
            && Objects.equals(this.monthList, that.monthList) && Objects.equals(this.dateList, that.dateList)
            && Objects.equals(this.scheduledDate, that.scheduledDate)
            && Objects.equals(this.scheduledTime, that.scheduledTime)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.grayCount, that.grayCount)
            && Objects.equals(this.grayDesktopIds, that.grayDesktopIds)
            && Objects.equals(this.grayFailThreshold, that.grayFailThreshold)
            && Objects.equals(this.lifeCycleType, that.lifeCycleType) && Objects.equals(this.timeZone, that.timeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduledType,
            dayInterval,
            weekList,
            monthList,
            dateList,
            scheduledDate,
            scheduledTime,
            expireTime,
            grayCount,
            grayDesktopIds,
            grayFailThreshold,
            lifeCycleType,
            timeZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduledTaskConfig {\n");
        sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
        sb.append("    dayInterval: ").append(toIndentedString(dayInterval)).append("\n");
        sb.append("    weekList: ").append(toIndentedString(weekList)).append("\n");
        sb.append("    monthList: ").append(toIndentedString(monthList)).append("\n");
        sb.append("    dateList: ").append(toIndentedString(dateList)).append("\n");
        sb.append("    scheduledDate: ").append(toIndentedString(scheduledDate)).append("\n");
        sb.append("    scheduledTime: ").append(toIndentedString(scheduledTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    grayCount: ").append(toIndentedString(grayCount)).append("\n");
        sb.append("    grayDesktopIds: ").append(toIndentedString(grayDesktopIds)).append("\n");
        sb.append("    grayFailThreshold: ").append(toIndentedString(grayFailThreshold)).append("\n");
        sb.append("    lifeCycleType: ").append(toIndentedString(lifeCycleType)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
