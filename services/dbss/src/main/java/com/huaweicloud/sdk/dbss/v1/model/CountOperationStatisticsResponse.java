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
public class CountOperationStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "generate_time")

    private String generateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_statistics")

    private List<OperationStatisticsBean> operationStatistics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public CountOperationStatisticsResponse withGenerateTime(String generateTime) {
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

    public CountOperationStatisticsResponse withOperationStatistics(List<OperationStatisticsBean> operationStatistics) {
        this.operationStatistics = operationStatistics;
        return this;
    }

    public CountOperationStatisticsResponse addOperationStatisticsItem(
        OperationStatisticsBean operationStatisticsItem) {
        if (this.operationStatistics == null) {
            this.operationStatistics = new ArrayList<>();
        }
        this.operationStatistics.add(operationStatisticsItem);
        return this;
    }

    public CountOperationStatisticsResponse withOperationStatistics(
        Consumer<List<OperationStatisticsBean>> operationStatisticsSetter) {
        if (this.operationStatistics == null) {
            this.operationStatistics = new ArrayList<>();
        }
        operationStatisticsSetter.accept(this.operationStatistics);
        return this;
    }

    /**
     * 风险操作统计
     * @return operationStatistics
     */
    public List<OperationStatisticsBean> getOperationStatistics() {
        return operationStatistics;
    }

    public void setOperationStatistics(List<OperationStatisticsBean> operationStatistics) {
        this.operationStatistics = operationStatistics;
    }

    public CountOperationStatisticsResponse withStatus(String status) {
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
        CountOperationStatisticsResponse that = (CountOperationStatisticsResponse) obj;
        return Objects.equals(this.generateTime, that.generateTime)
            && Objects.equals(this.operationStatistics, that.operationStatistics)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(generateTime, operationStatistics, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountOperationStatisticsResponse {\n");
        sb.append("    generateTime: ").append(toIndentedString(generateTime)).append("\n");
        sb.append("    operationStatistics: ").append(toIndentedString(operationStatistics)).append("\n");
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
