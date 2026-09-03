package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * BlockAlert
 */
public class BlockAlert {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_template")

    private AlertTemplate alertTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private String enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waitingCount")

    private Integer waitingCount;

    public BlockAlert withAlertTemplate(AlertTemplate alertTemplate) {
        this.alertTemplate = alertTemplate;
        return this;
    }

    public BlockAlert withAlertTemplate(Consumer<AlertTemplate> alertTemplateSetter) {
        if (this.alertTemplate == null) {
            this.alertTemplate = new AlertTemplate();
            alertTemplateSetter.accept(this.alertTemplate);
        }

        return this;
    }

    /**
     * Get alertTemplate
     * @return alertTemplate
     */
    public AlertTemplate getAlertTemplate() {
        return alertTemplate;
    }

    public void setAlertTemplate(AlertTemplate alertTemplate) {
        this.alertTemplate = alertTemplate;
    }

    public BlockAlert withEnable(String enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 阻塞告警开启 0关闭 1开启
     * @return enable
     */
    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public BlockAlert withWaitingCount(Integer waitingCount) {
        this.waitingCount = waitingCount;
        return this;
    }

    /**
     * 等待队列大于多少个开始阻塞
     * @return waitingCount
     */
    public Integer getWaitingCount() {
        return waitingCount;
    }

    public void setWaitingCount(Integer waitingCount) {
        this.waitingCount = waitingCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BlockAlert that = (BlockAlert) obj;
        return Objects.equals(this.alertTemplate, that.alertTemplate) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.waitingCount, that.waitingCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alertTemplate, enable, waitingCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BlockAlert {\n");
        sb.append("    alertTemplate: ").append(toIndentedString(alertTemplate)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    waitingCount: ").append(toIndentedString(waitingCount)).append("\n");
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
