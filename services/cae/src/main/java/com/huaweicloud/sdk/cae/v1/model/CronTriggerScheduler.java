package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CronTriggerScheduler
 */
public class CronTriggerScheduler {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cron")

    private String cron;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_replica")

    private Integer targetReplica;

    public CronTriggerScheduler withCron(String cron) {
        this.cron = cron;
        return this;
    }

    /**
     * 触发触发时间点，以五位cron表达式表示。
     * @return cron
     */
    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public CronTriggerScheduler withTargetReplica(Integer targetReplica) {
        this.targetReplica = targetReplica;
        return this;
    }

    /**
     * 要求达到的实例数。
     * @return targetReplica
     */
    public Integer getTargetReplica() {
        return targetReplica;
    }

    public void setTargetReplica(Integer targetReplica) {
        this.targetReplica = targetReplica;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CronTriggerScheduler that = (CronTriggerScheduler) obj;
        return Objects.equals(this.cron, that.cron) && Objects.equals(this.targetReplica, that.targetReplica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cron, targetReplica);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CronTriggerScheduler {\n");
        sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
        sb.append("    targetReplica: ").append(toIndentedString(targetReplica)).append("\n");
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
