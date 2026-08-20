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
public class ShowDomainCountryStatResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

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
    @JsonProperty(value = "result")

    private Map<String, Object> result = null;

    public ShowDomainCountryStatResponse withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 查询数据类型 > 汇总或明细数据  **取值范围：** - summary：查询汇总数据 - detail：查询数据详情
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ShowDomainCountryStatResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释：** 查询起始时间 **取值范围：** 相对于UTC 1970-01-01到当前时间相隔的毫秒数
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowDomainCountryStatResponse withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释：** 查询结束时间 **取值范围：** 相对于UTC 1970-01-01到当前时间相隔的毫秒数
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ShowDomainCountryStatResponse withStatType(String statType) {
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

    public ShowDomainCountryStatResponse withResult(Map<String, Object> result) {
        this.result = result;
        return this;
    }

    public ShowDomainCountryStatResponse putResultItem(String key, Object resultItem) {
        if (this.result == null) {
            this.result = new HashMap<>();
        }
        this.result.put(key, resultItem);
        return this;
    }

    public ShowDomainCountryStatResponse withResult(Consumer<Map<String, Object>> resultSetter) {
        if (this.result == null) {
            this.result = new HashMap<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * **参数解释：** 按指定的分组方式组织的数据 **取值范围：** - domain：按域名分组 - country：按国际&地区分组 - province：按省份分组 - isp：按运营商分组 **默认取值：** 默认不分组
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
        ShowDomainCountryStatResponse that = (ShowDomainCountryStatResponse) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.statType, that.statType)
            && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, startTime, endTime, statType, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainCountryStatResponse {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
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
