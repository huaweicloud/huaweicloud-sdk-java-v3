package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListQueriesCondition
 */
public class ListQueriesCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field")

    private String field;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    public ListQueriesCondition withField(String field) {
        this.field = field;
        return this;
    }

    /**
     * 字段名称参考下方字段列表 systemQuery boolean 是否隐藏系统查询 userName String 用户名称 applicationName String 应用名称 dbName String 数据库名称 resourcePool String 资源池 queryStatus String 查询状态 enqueue String 排队状态 lane String 快慢车道 instName String 接入CN pid String 会话ID blockTime int 阻塞时间（ms） duration int 执行时间（ms） minCpuTime int 最小cpu时间（ms） maxCpuTime int 最大cpu时间（ms） totalCpuTime int CPU时间（ms） cpuSkewPercent int CPU时间倾斜（%） spillInfo String dn下盘信息 minSpillSize int dn上下盘的最小数据量（mb） maxSpillSize int dn上下盘的最大数据量（mb） averageSpillSize int 平均下盘量（MB） spillSkewPercent int dn间下盘倾斜率 queryBand String 作业类型 jobName String 任务名称 jobInst String 任务实例 clientHostname String 主机名称 clientPort String TCP端口 waiting boolean 是否等待 estimateTotalTime int 预估总执行时间（ms） estimateLeftTime int 预估剩余时间（ms） controlGroup String cgroup minPeakMemory int dn最小内存峰值（mb） maxPeakMemory int dn最大内存峰值（mb） averagePeakMemory int 内存使用平均值（mb） memorySkewPercent int 各dn内存使用倾斜率 estimateMemory int 预估使用内存（mb） minDnTime int dn最小执行时间（ms） maxDnTime int dn最大执行时间（ms） averageDnTime int dn平均执行时间（ms） dntimeSkewPercent int 各dn的执行时间倾斜率 warning String 告警 averagePeakIops int dn每秒平均io 峰值（列存是次/s，行存是万次/s） iopsSkewPercent int dn间的io倾斜率 wlmStatus String 语句运行状态 wlmAttrib String 语句属性
     * @return field
     */
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public ListQueriesCondition withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 字段值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ListQueriesCondition withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 比较方式： String类型参数：=、!=、like、not like int类型参数：=、!=、>、<、>=、<= boolean类型参数：=、!=
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListQueriesCondition that = (ListQueriesCondition) obj;
        return Objects.equals(this.field, that.field) && Objects.equals(this.value, that.value)
            && Objects.equals(this.operator, that.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, value, operator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQueriesCondition {\n");
        sb.append("    field: ").append(toIndentedString(field)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
