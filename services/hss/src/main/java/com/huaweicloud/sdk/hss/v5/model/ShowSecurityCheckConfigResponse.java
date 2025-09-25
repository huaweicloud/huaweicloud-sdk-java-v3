package com.huaweicloud.sdk.hss.v5.model;

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
public class ShowSecurityCheckConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private Long taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Boolean status;

    /**
     * 体检周期类型：day-按天，week-按周
     */
    public static final class CheckPeriodTypeEnum {

        /**
         * Enum DAY for value: "day"
         */
        public static final CheckPeriodTypeEnum DAY = new CheckPeriodTypeEnum("day");

        /**
         * Enum WEEK for value: "week"
         */
        public static final CheckPeriodTypeEnum WEEK = new CheckPeriodTypeEnum("week");

        private static final Map<String, CheckPeriodTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CheckPeriodTypeEnum> createStaticFields() {
            Map<String, CheckPeriodTypeEnum> map = new HashMap<>();
            map.put("day", DAY);
            map.put("week", WEEK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CheckPeriodTypeEnum(String value) {
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
        public static CheckPeriodTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CheckPeriodTypeEnum(value));
        }

        public static CheckPeriodTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CheckPeriodTypeEnum) {
                return this.value.equals(((CheckPeriodTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_period_type")

    private CheckPeriodTypeEnum checkPeriodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day_period")

    private Integer dayPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "week_period")

    private List<String> weekPeriod = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hour")

    private Integer hour;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private List<String> content = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    public ShowSecurityCheckConfigResponse withTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 定时任务ID，前台只保存，不显示
     * @return taskId
     */
    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public ShowSecurityCheckConfigResponse withStatus(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * 体检状态，是否开启
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public ShowSecurityCheckConfigResponse withCheckPeriodType(CheckPeriodTypeEnum checkPeriodType) {
        this.checkPeriodType = checkPeriodType;
        return this;
    }

    /**
     * 体检周期类型：day-按天，week-按周
     * @return checkPeriodType
     */
    public CheckPeriodTypeEnum getCheckPeriodType() {
        return checkPeriodType;
    }

    public void setCheckPeriodType(CheckPeriodTypeEnum checkPeriodType) {
        this.checkPeriodType = checkPeriodType;
    }

    public ShowSecurityCheckConfigResponse withDayPeriod(Integer dayPeriod) {
        this.dayPeriod = dayPeriod;
        return this;
    }

    /**
     * 按天的周期
     * @return dayPeriod
     */
    public Integer getDayPeriod() {
        return dayPeriod;
    }

    public void setDayPeriod(Integer dayPeriod) {
        this.dayPeriod = dayPeriod;
    }

    public ShowSecurityCheckConfigResponse withWeekPeriod(List<String> weekPeriod) {
        this.weekPeriod = weekPeriod;
        return this;
    }

    public ShowSecurityCheckConfigResponse addWeekPeriodItem(String weekPeriodItem) {
        if (this.weekPeriod == null) {
            this.weekPeriod = new ArrayList<>();
        }
        this.weekPeriod.add(weekPeriodItem);
        return this;
    }

    public ShowSecurityCheckConfigResponse withWeekPeriod(Consumer<List<String>> weekPeriodSetter) {
        if (this.weekPeriod == null) {
            this.weekPeriod = new ArrayList<>();
        }
        weekPeriodSetter.accept(this.weekPeriod);
        return this;
    }

    /**
     * 按周的周期,选中的日期放入此列表，取值包含：mon,tue,wed,thu,fri,sat,sun
     * @return weekPeriod
     */
    public List<String> getWeekPeriod() {
        return weekPeriod;
    }

    public void setWeekPeriod(List<String> weekPeriod) {
        this.weekPeriod = weekPeriod;
    }

    public ShowSecurityCheckConfigResponse withHour(Integer hour) {
        this.hour = hour;
        return this;
    }

    /**
     * 体检时间：小时
     * minimum: 0
     * maximum: 24
     * @return hour
     */
    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public ShowSecurityCheckConfigResponse withContent(List<String> content) {
        this.content = content;
        return this;
    }

    public ShowSecurityCheckConfigResponse addContentItem(String contentItem) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(contentItem);
        return this;
    }

    public ShowSecurityCheckConfigResponse withContent(Consumer<List<String>> contentSetter) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        contentSetter.accept(this.content);
        return this;
    }

    /**
     * 体检内容，取值包含：asset,vul,baseline,event
     * @return content
     */
    public List<String> getContent() {
        return content;
    }

    public void setContent(List<String> content) {
        this.content = content;
    }

    public ShowSecurityCheckConfigResponse withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public ShowSecurityCheckConfigResponse addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public ShowSecurityCheckConfigResponse withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * 已选服务器ID列表
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSecurityCheckConfigResponse that = (ShowSecurityCheckConfigResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.checkPeriodType, that.checkPeriodType)
            && Objects.equals(this.dayPeriod, that.dayPeriod) && Objects.equals(this.weekPeriod, that.weekPeriod)
            && Objects.equals(this.hour, that.hour) && Objects.equals(this.content, that.content)
            && Objects.equals(this.hostIdList, that.hostIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, status, checkPeriodType, dayPeriod, weekPeriod, hour, content, hostIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecurityCheckConfigResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    checkPeriodType: ").append(toIndentedString(checkPeriodType)).append("\n");
        sb.append("    dayPeriod: ").append(toIndentedString(dayPeriod)).append("\n");
        sb.append("    weekPeriod: ").append(toIndentedString(weekPeriod)).append("\n");
        sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
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
