package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowClusterRedistributionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_info")

    private RdsRedisInfo redisInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_mode")

    private Boolean scheduleMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pause_enable")

    private Boolean pauseEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recover_enable")

    private Boolean recoverEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_enable")

    private Boolean retryEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_enable")

    private Boolean updateEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_enable")

    private Boolean controlEnable;

    public ShowClusterRedistributionResponse withRedisInfo(RdsRedisInfo redisInfo) {
        this.redisInfo = redisInfo;
        return this;
    }

    public ShowClusterRedistributionResponse withRedisInfo(Consumer<RdsRedisInfo> redisInfoSetter) {
        if (this.redisInfo == null) {
            this.redisInfo = new RdsRedisInfo();
            redisInfoSetter.accept(this.redisInfo);
        }

        return this;
    }

    /**
     * Get redisInfo
     * @return redisInfo
     */
    public RdsRedisInfo getRedisInfo() {
        return redisInfo;
    }

    public void setRedisInfo(RdsRedisInfo redisInfo) {
        this.redisInfo = redisInfo;
    }

    public ShowClusterRedistributionResponse withScheduleMode(Boolean scheduleMode) {
        this.scheduleMode = scheduleMode;
        return this;
    }

    /**
     * 调度模式
     * @return scheduleMode
     */
    public Boolean getScheduleMode() {
        return scheduleMode;
    }

    public void setScheduleMode(Boolean scheduleMode) {
        this.scheduleMode = scheduleMode;
    }

    public ShowClusterRedistributionResponse withPauseEnable(Boolean pauseEnable) {
        this.pauseEnable = pauseEnable;
        return this;
    }

    /**
     * 是否允许暂停
     * @return pauseEnable
     */
    public Boolean getPauseEnable() {
        return pauseEnable;
    }

    public void setPauseEnable(Boolean pauseEnable) {
        this.pauseEnable = pauseEnable;
    }

    public ShowClusterRedistributionResponse withRecoverEnable(Boolean recoverEnable) {
        this.recoverEnable = recoverEnable;
        return this;
    }

    /**
     * 是否允许恢复
     * @return recoverEnable
     */
    public Boolean getRecoverEnable() {
        return recoverEnable;
    }

    public void setRecoverEnable(Boolean recoverEnable) {
        this.recoverEnable = recoverEnable;
    }

    public ShowClusterRedistributionResponse withRetryEnable(Boolean retryEnable) {
        this.retryEnable = retryEnable;
        return this;
    }

    /**
     * 是否允许重试
     * @return retryEnable
     */
    public Boolean getRetryEnable() {
        return retryEnable;
    }

    public void setRetryEnable(Boolean retryEnable) {
        this.retryEnable = retryEnable;
    }

    public ShowClusterRedistributionResponse withUpdateEnable(Boolean updateEnable) {
        this.updateEnable = updateEnable;
        return this;
    }

    /**
     * 是否允许更新
     * @return updateEnable
     */
    public Boolean getUpdateEnable() {
        return updateEnable;
    }

    public void setUpdateEnable(Boolean updateEnable) {
        this.updateEnable = updateEnable;
    }

    public ShowClusterRedistributionResponse withControlEnable(Boolean controlEnable) {
        this.controlEnable = controlEnable;
        return this;
    }

    /**
     * 是否允许控制
     * @return controlEnable
     */
    public Boolean getControlEnable() {
        return controlEnable;
    }

    public void setControlEnable(Boolean controlEnable) {
        this.controlEnable = controlEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClusterRedistributionResponse that = (ShowClusterRedistributionResponse) obj;
        return Objects.equals(this.redisInfo, that.redisInfo) && Objects.equals(this.scheduleMode, that.scheduleMode)
            && Objects.equals(this.pauseEnable, that.pauseEnable)
            && Objects.equals(this.recoverEnable, that.recoverEnable)
            && Objects.equals(this.retryEnable, that.retryEnable)
            && Objects.equals(this.updateEnable, that.updateEnable)
            && Objects.equals(this.controlEnable, that.controlEnable);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(redisInfo, scheduleMode, pauseEnable, recoverEnable, retryEnable, updateEnable, controlEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterRedistributionResponse {\n");
        sb.append("    redisInfo: ").append(toIndentedString(redisInfo)).append("\n");
        sb.append("    scheduleMode: ").append(toIndentedString(scheduleMode)).append("\n");
        sb.append("    pauseEnable: ").append(toIndentedString(pauseEnable)).append("\n");
        sb.append("    recoverEnable: ").append(toIndentedString(recoverEnable)).append("\n");
        sb.append("    retryEnable: ").append(toIndentedString(retryEnable)).append("\n");
        sb.append("    updateEnable: ").append(toIndentedString(updateEnable)).append("\n");
        sb.append("    controlEnable: ").append(toIndentedString(controlEnable)).append("\n");
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
