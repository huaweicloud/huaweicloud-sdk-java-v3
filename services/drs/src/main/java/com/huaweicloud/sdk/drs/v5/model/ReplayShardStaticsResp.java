package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 回放概览信息基于进间点的统计结果
 */
public class ReplayShardStaticsResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish")

    private Long finish;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal")

    private Long abnormal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow")

    private Long slow;

    public ReplayShardStaticsResp withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 回放时间点
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ReplayShardStaticsResp withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * SQL总量
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ReplayShardStaticsResp withFinish(Long finish) {
        this.finish = finish;
        return this;
    }

    /**
     * SQL执行量
     * @return finish
     */
    public Long getFinish() {
        return finish;
    }

    public void setFinish(Long finish) {
        this.finish = finish;
    }

    public ReplayShardStaticsResp withAbnormal(Long abnormal) {
        this.abnormal = abnormal;
        return this;
    }

    /**
     * SQL异常量
     * @return abnormal
     */
    public Long getAbnormal() {
        return abnormal;
    }

    public void setAbnormal(Long abnormal) {
        this.abnormal = abnormal;
    }

    public ReplayShardStaticsResp withSlow(Long slow) {
        this.slow = slow;
        return this;
    }

    /**
     * 慢SQL数量
     * @return slow
     */
    public Long getSlow() {
        return slow;
    }

    public void setSlow(Long slow) {
        this.slow = slow;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReplayShardStaticsResp that = (ReplayShardStaticsResp) obj;
        return Objects.equals(this.time, that.time) && Objects.equals(this.total, that.total)
            && Objects.equals(this.finish, that.finish) && Objects.equals(this.abnormal, that.abnormal)
            && Objects.equals(this.slow, that.slow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, total, finish, abnormal, slow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplayShardStaticsResp {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    finish: ").append(toIndentedString(finish)).append("\n");
        sb.append("    abnormal: ").append(toIndentedString(abnormal)).append("\n");
        sb.append("    slow: ").append(toIndentedString(slow)).append("\n");
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
