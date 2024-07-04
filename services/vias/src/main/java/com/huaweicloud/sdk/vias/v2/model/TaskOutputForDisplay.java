package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 作业的输出配置展示
 */
public class TaskOutputForDisplay {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private TaskOutputObs obs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dis")

    private TaskOutputDis dis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webhook")

    private TaskOutputWebhook webhook;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_center")

    private Boolean eventCenter;

    public TaskOutputForDisplay withObs(TaskOutputObs obs) {
        this.obs = obs;
        return this;
    }

    public TaskOutputForDisplay withObs(Consumer<TaskOutputObs> obsSetter) {
        if (this.obs == null) {
            this.obs = new TaskOutputObs();
            obsSetter.accept(this.obs);
        }

        return this;
    }

    /**
     * Get obs
     * @return obs
     */
    public TaskOutputObs getObs() {
        return obs;
    }

    public void setObs(TaskOutputObs obs) {
        this.obs = obs;
    }

    public TaskOutputForDisplay withDis(TaskOutputDis dis) {
        this.dis = dis;
        return this;
    }

    public TaskOutputForDisplay withDis(Consumer<TaskOutputDis> disSetter) {
        if (this.dis == null) {
            this.dis = new TaskOutputDis();
            disSetter.accept(this.dis);
        }

        return this;
    }

    /**
     * Get dis
     * @return dis
     */
    public TaskOutputDis getDis() {
        return dis;
    }

    public void setDis(TaskOutputDis dis) {
        this.dis = dis;
    }

    public TaskOutputForDisplay withWebhook(TaskOutputWebhook webhook) {
        this.webhook = webhook;
        return this;
    }

    public TaskOutputForDisplay withWebhook(Consumer<TaskOutputWebhook> webhookSetter) {
        if (this.webhook == null) {
            this.webhook = new TaskOutputWebhook();
            webhookSetter.accept(this.webhook);
        }

        return this;
    }

    /**
     * Get webhook
     * @return webhook
     */
    public TaskOutputWebhook getWebhook() {
        return webhook;
    }

    public void setWebhook(TaskOutputWebhook webhook) {
        this.webhook = webhook;
    }

    public TaskOutputForDisplay withEventCenter(Boolean eventCenter) {
        this.eventCenter = eventCenter;
        return this;
    }

    /**
     * 输出类型是否关联事件中心
     * @return eventCenter
     */
    public Boolean getEventCenter() {
        return eventCenter;
    }

    public void setEventCenter(Boolean eventCenter) {
        this.eventCenter = eventCenter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskOutputForDisplay that = (TaskOutputForDisplay) obj;
        return Objects.equals(this.obs, that.obs) && Objects.equals(this.dis, that.dis)
            && Objects.equals(this.webhook, that.webhook) && Objects.equals(this.eventCenter, that.eventCenter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obs, dis, webhook, eventCenter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskOutputForDisplay {\n");
        sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
        sb.append("    dis: ").append(toIndentedString(dis)).append("\n");
        sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
        sb.append("    eventCenter: ").append(toIndentedString(eventCenter)).append("\n");
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
