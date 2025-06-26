package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TriggerSetting
 */
public class TriggerSetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cron")

    private String cron;

    public TriggerSetting withCron(String cron) {
        this.cron = cron;
        return this;
    }

    /**
     * 定时设置，cron格式描述 '* * * * * *'。cron 基于 UTC 时间。
     * @return cron
     */
    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TriggerSetting that = (TriggerSetting) obj;
        return Objects.equals(this.cron, that.cron);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cron);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TriggerSetting {\n");
        sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
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
