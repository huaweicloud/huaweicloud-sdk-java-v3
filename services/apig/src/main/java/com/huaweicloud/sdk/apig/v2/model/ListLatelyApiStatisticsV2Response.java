package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListLatelyApiStatisticsV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg")

    private String msg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<StatisticsAPI> list = null;

    public ListLatelyApiStatisticsV2Response withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 响应码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ListLatelyApiStatisticsV2Response withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * 返回消息
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ListLatelyApiStatisticsV2Response withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间的UTC的时间戳
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListLatelyApiStatisticsV2Response withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 截止时间的UTC的时间戳
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListLatelyApiStatisticsV2Response withList(List<StatisticsAPI> list) {
        this.list = list;
        return this;
    }

    public ListLatelyApiStatisticsV2Response addListItem(StatisticsAPI listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public ListLatelyApiStatisticsV2Response withList(Consumer<List<StatisticsAPI>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 统计指标的数据结构结构体
     * @return list
     */
    public List<StatisticsAPI> getList() {
        return list;
    }

    public void setList(List<StatisticsAPI> list) {
        this.list = list;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLatelyApiStatisticsV2Response listLatelyApiStatisticsV2Response = (ListLatelyApiStatisticsV2Response) o;
        return Objects.equals(this.code, listLatelyApiStatisticsV2Response.code)
            && Objects.equals(this.msg, listLatelyApiStatisticsV2Response.msg)
            && Objects.equals(this.startTime, listLatelyApiStatisticsV2Response.startTime)
            && Objects.equals(this.endTime, listLatelyApiStatisticsV2Response.endTime)
            && Objects.equals(this.list, listLatelyApiStatisticsV2Response.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, msg, startTime, endTime, list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLatelyApiStatisticsV2Response {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
