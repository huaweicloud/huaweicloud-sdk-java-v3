package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListHistoryOnlineInfoNewRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_type")

    private String queryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_hour")

    private Integer clientHour;

    public ListHistoryOnlineInfoNewRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询的起始时间。指定该参数后，返回的结果为此时间之后的所有登录记录。时间格式如：“2016-08-20T21:11Z”。终止时间不为空时，起始时间为必填参数。类型查询优先于时间查询。类型查询和时间查询必须有一个存在。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListHistoryOnlineInfoNewRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询的结束时间。指定该参数后，返回的结果为此时间之前的所有登录记录。时间格式如：“2016-08-20T21:11Z”。起始时间不为空时，终止时间为必填参数。类型查询优先于时间查询。类型查询和时间查询必须有一个存在。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListHistoryOnlineInfoNewRequest withQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * 查询类型，类型查询优先于时间查询。类型查询和时间查询必须有一个存在。 -MONTH：按月查询。 -WEEK：按周查询。 -DAY：按天查询。
     * @return queryType
     */
    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public ListHistoryOnlineInfoNewRequest withClientHour(Integer clientHour) {
        this.clientHour = clientHour;
        return this;
    }

    /**
     * 客户端所在操作系统时间的小时数。
     * minimum: 0
     * maximum: 7200
     * @return clientHour
     */
    public Integer getClientHour() {
        return clientHour;
    }

    public void setClientHour(Integer clientHour) {
        this.clientHour = clientHour;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHistoryOnlineInfoNewRequest that = (ListHistoryOnlineInfoNewRequest) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.queryType, that.queryType) && Objects.equals(this.clientHour, that.clientHour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, queryType, clientHour);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHistoryOnlineInfoNewRequest {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
        sb.append("    clientHour: ").append(toIndentedString(clientHour)).append("\n");
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
