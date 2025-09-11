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
public class CountInjectionStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "generate_time")

    private String generateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "injection_statistics")

    private List<InjectionStatisticsBean> injectionStatistics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public CountInjectionStatisticsResponse withGenerateTime(String generateTime) {
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

    public CountInjectionStatisticsResponse withInjectionStatistics(List<InjectionStatisticsBean> injectionStatistics) {
        this.injectionStatistics = injectionStatistics;
        return this;
    }

    public CountInjectionStatisticsResponse addInjectionStatisticsItem(
        InjectionStatisticsBean injectionStatisticsItem) {
        if (this.injectionStatistics == null) {
            this.injectionStatistics = new ArrayList<>();
        }
        this.injectionStatistics.add(injectionStatisticsItem);
        return this;
    }

    public CountInjectionStatisticsResponse withInjectionStatistics(
        Consumer<List<InjectionStatisticsBean>> injectionStatisticsSetter) {
        if (this.injectionStatistics == null) {
            this.injectionStatistics = new ArrayList<>();
        }
        injectionStatisticsSetter.accept(this.injectionStatistics);
        return this;
    }

    /**
     * 注入列表
     * @return injectionStatistics
     */
    public List<InjectionStatisticsBean> getInjectionStatistics() {
        return injectionStatistics;
    }

    public void setInjectionStatistics(List<InjectionStatisticsBean> injectionStatistics) {
        this.injectionStatistics = injectionStatistics;
    }

    public CountInjectionStatisticsResponse withStatus(String status) {
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
        CountInjectionStatisticsResponse that = (CountInjectionStatisticsResponse) obj;
        return Objects.equals(this.generateTime, that.generateTime)
            && Objects.equals(this.injectionStatistics, that.injectionStatistics)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(generateTime, injectionStatistics, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountInjectionStatisticsResponse {\n");
        sb.append("    generateTime: ").append(toIndentedString(generateTime)).append("\n");
        sb.append("    injectionStatistics: ").append(toIndentedString(injectionStatistics)).append("\n");
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
