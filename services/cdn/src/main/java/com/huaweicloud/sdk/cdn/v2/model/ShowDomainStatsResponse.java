package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDomainStatsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by")

    private String groupBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_type")

    private String statType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Long interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Map<String, Object> result = null;

    public ShowDomainStatsResponse withGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * **参数解释：** 数据分组方式 **取值范围：** domain：按域名分组 **默认取值：** 不分组
     * @return groupBy
     */
    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public ShowDomainStatsResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释：** 查询起始时间戳 **取值范围：** 不涉及
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowDomainStatsResponse withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释：** 查询结束时间戳 **取值范围：** 不涉及
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ShowDomainStatsResponse withStatType(String statType) {
        this.statType = statType;
        return this;
    }

    /**
     * **参数解释：** 统计指标类型 **取值范围：** - flux：流量 - req_num：请求总数
     * @return statType
     */
    public String getStatType() {
        return statType;
    }

    public void setStatType(String statType) {
        this.statType = statType;
    }

    public ShowDomainStatsResponse withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 查询数据类型 **取值范围：** - summary：汇总数据 - detail：明细数据
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ShowDomainStatsResponse withInterval(Long interval) {
        this.interval = interval;
        return this;
    }

    /**
     * **参数解释：** 查询时间粒度 **取值范围：** - 300：采样时间间隔为5分钟，单位：秒 - 3600：采样时间间隔为1小时，单位：秒 - 86400：采样时间间隔为1天，单位：秒 **默认取值：** 默认取对应时间跨度的最小间隔 > 时间跨度小于等于7天，最小时间间隔为300；时间跨度大于7天，最小时间间隔为3600
     * @return interval
     */
    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public ShowDomainStatsResponse withResult(Map<String, Object> result) {
        this.result = result;
        return this;
    }

    public ShowDomainStatsResponse putResultItem(String key, Object resultItem) {
        if (this.result == null) {
            this.result = new HashMap<>();
        }
        this.result.put(key, resultItem);
        return this;
    }

    public ShowDomainStatsResponse withResult(Consumer<Map<String, Object>> resultSetter) {
        if (this.result == null) {
            this.result = new HashMap<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * **参数解释：** 按指定的分组方式组织的数据 **取值范围：** 不涉及
     * @return result
     */
    public Map<String, Object> getResult() {
        return result;
    }

    public void setResult(Map<String, Object> result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDomainStatsResponse that = (ShowDomainStatsResponse) obj;
        return Objects.equals(this.groupBy, that.groupBy) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.statType, that.statType)
            && Objects.equals(this.action, that.action) && Objects.equals(this.interval, that.interval)
            && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupBy, startTime, endTime, statType, action, interval, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainStatsResponse {\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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
