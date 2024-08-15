package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务统计信息  讨论： statistics属性里用状态声明key合理么？ 还要统计什么内容，怎么扩展？
 */
public class JobScriptOrderStatisticsModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_instance")

    private Integer totalInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_statistics")

    private List<ExectuionStatistic> executeStatistics = null;

    public JobScriptOrderStatisticsModel withTotalInstance(Integer totalInstance) {
        this.totalInstance = totalInstance;
        return this;
    }

    /**
     * 实例总量
     * @return totalInstance
     */
    public Integer getTotalInstance() {
        return totalInstance;
    }

    public void setTotalInstance(Integer totalInstance) {
        this.totalInstance = totalInstance;
    }

    public JobScriptOrderStatisticsModel withExecuteStatistics(List<ExectuionStatistic> executeStatistics) {
        this.executeStatistics = executeStatistics;
        return this;
    }

    public JobScriptOrderStatisticsModel addExecuteStatisticsItem(ExectuionStatistic executeStatisticsItem) {
        if (this.executeStatistics == null) {
            this.executeStatistics = new ArrayList<>();
        }
        this.executeStatistics.add(executeStatisticsItem);
        return this;
    }

    public JobScriptOrderStatisticsModel withExecuteStatistics(
        Consumer<List<ExectuionStatistic>> executeStatisticsSetter) {
        if (this.executeStatistics == null) {
            this.executeStatistics = new ArrayList<>();
        }
        executeStatisticsSetter.accept(this.executeStatistics);
        return this;
    }

    /**
     * 每个状态一个count，里面记录该状态的总数量，以及包含该状态的批次列表
     * @return executeStatistics
     */
    public List<ExectuionStatistic> getExecuteStatistics() {
        return executeStatistics;
    }

    public void setExecuteStatistics(List<ExectuionStatistic> executeStatistics) {
        this.executeStatistics = executeStatistics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobScriptOrderStatisticsModel that = (JobScriptOrderStatisticsModel) obj;
        return Objects.equals(this.totalInstance, that.totalInstance)
            && Objects.equals(this.executeStatistics, that.executeStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalInstance, executeStatistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobScriptOrderStatisticsModel {\n");
        sb.append("    totalInstance: ").append(toIndentedString(totalInstance)).append("\n");
        sb.append("    executeStatistics: ").append(toIndentedString(executeStatistics)).append("\n");
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
