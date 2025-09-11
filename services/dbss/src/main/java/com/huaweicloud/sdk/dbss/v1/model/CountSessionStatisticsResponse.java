package com.huaweicloud.sdk.dbss.v1.model;

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
public class CountSessionStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "generate_time")

    private String generateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_statistics")

    private List<SessionStatisticsBean> sessionStatistics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public CountSessionStatisticsResponse withGenerateTime(String generateTime) {
        this.generateTime = generateTime;
        return this;
    }

    /**
     * 生成时间
     * @return generateTime
     */
    public String getGenerateTime() {
        return generateTime;
    }

    public void setGenerateTime(String generateTime) {
        this.generateTime = generateTime;
    }

    public CountSessionStatisticsResponse withSessionStatistics(List<SessionStatisticsBean> sessionStatistics) {
        this.sessionStatistics = sessionStatistics;
        return this;
    }

    public CountSessionStatisticsResponse addSessionStatisticsItem(SessionStatisticsBean sessionStatisticsItem) {
        if (this.sessionStatistics == null) {
            this.sessionStatistics = new ArrayList<>();
        }
        this.sessionStatistics.add(sessionStatisticsItem);
        return this;
    }

    public CountSessionStatisticsResponse withSessionStatistics(
        Consumer<List<SessionStatisticsBean>> sessionStatisticsSetter) {
        if (this.sessionStatistics == null) {
            this.sessionStatistics = new ArrayList<>();
        }
        sessionStatisticsSetter.accept(this.sessionStatistics);
        return this;
    }

    /**
     * 统计数据列表
     * @return sessionStatistics
     */
    public List<SessionStatisticsBean> getSessionStatistics() {
        return sessionStatistics;
    }

    public void setSessionStatistics(List<SessionStatisticsBean> sessionStatistics) {
        this.sessionStatistics = sessionStatistics;
    }

    public CountSessionStatisticsResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态  - FINISHED：已完成  - RUNNING：运行中
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CountSessionStatisticsResponse that = (CountSessionStatisticsResponse) obj;
        return Objects.equals(this.generateTime, that.generateTime)
            && Objects.equals(this.sessionStatistics, that.sessionStatistics)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(generateTime, sessionStatistics, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountSessionStatisticsResponse {\n");
        sb.append("    generateTime: ").append(toIndentedString(generateTime)).append("\n");
        sb.append("    sessionStatistics: ").append(toIndentedString(sessionStatistics)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
