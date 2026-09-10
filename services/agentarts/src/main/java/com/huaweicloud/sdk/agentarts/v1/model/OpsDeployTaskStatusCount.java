package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 任务状态数据。
 */
public class OpsDeployTaskStatusCount {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploying")

    private Integer deploying;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running")

    private Integer running;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stopping")

    private Integer stopping;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stopped")

    private Integer stopped;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "starting")

    private Integer starting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail")

    private Integer fail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleting")

    private Integer deleting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_fail")

    private Integer accessFail;

    public OpsDeployTaskStatusCount withDeploying(Integer deploying) {
        this.deploying = deploying;
        return this;
    }

    /**
     * **参数解释：** 部署中任务个数，单位：个。  **取值范围：** 0-1000的整数。
     * minimum: 0
     * maximum: 1000
     * @return deploying
     */
    public Integer getDeploying() {
        return deploying;
    }

    public void setDeploying(Integer deploying) {
        this.deploying = deploying;
    }

    public OpsDeployTaskStatusCount withRunning(Integer running) {
        this.running = running;
        return this;
    }

    /**
     * **参数解释：** 运行中任务个数，单位：个。  **取值范围：** 0-1000的整数。
     * minimum: 0
     * maximum: 1000
     * @return running
     */
    public Integer getRunning() {
        return running;
    }

    public void setRunning(Integer running) {
        this.running = running;
    }

    public OpsDeployTaskStatusCount withStopping(Integer stopping) {
        this.stopping = stopping;
        return this;
    }

    /**
     * **参数解释：** 停止中任务个数，单位：个。  **取值范围：** 0-1000的整数。
     * minimum: 0
     * maximum: 1000
     * @return stopping
     */
    public Integer getStopping() {
        return stopping;
    }

    public void setStopping(Integer stopping) {
        this.stopping = stopping;
    }

    public OpsDeployTaskStatusCount withStopped(Integer stopped) {
        this.stopped = stopped;
        return this;
    }

    /**
     * **参数解释：** 已停止任务个数，单位：个。  **取值范围：** 0-1000的整数。
     * minimum: 0
     * maximum: 1000
     * @return stopped
     */
    public Integer getStopped() {
        return stopped;
    }

    public void setStopped(Integer stopped) {
        this.stopped = stopped;
    }

    public OpsDeployTaskStatusCount withStarting(Integer starting) {
        this.starting = starting;
        return this;
    }

    /**
     * **参数解释：** 启动中任务个数，单位：个。  **取值范围：** 0-1000的整数。
     * minimum: 0
     * maximum: 1000
     * @return starting
     */
    public Integer getStarting() {
        return starting;
    }

    public void setStarting(Integer starting) {
        this.starting = starting;
    }

    public OpsDeployTaskStatusCount withFail(Integer fail) {
        this.fail = fail;
        return this;
    }

    /**
     * **参数解释：** 部署失败任务个数，单位：个。  **取值范围：** 0-1000的整数。
     * minimum: 0
     * maximum: 1000
     * @return fail
     */
    public Integer getFail() {
        return fail;
    }

    public void setFail(Integer fail) {
        this.fail = fail;
    }

    public OpsDeployTaskStatusCount withDeleting(Integer deleting) {
        this.deleting = deleting;
        return this;
    }

    /**
     * **参数解释：** 删除中任务个数，单位：个。  **取值范围：** 0-1000的整数。
     * minimum: 0
     * maximum: 1000
     * @return deleting
     */
    public Integer getDeleting() {
        return deleting;
    }

    public void setDeleting(Integer deleting) {
        this.deleting = deleting;
    }

    public OpsDeployTaskStatusCount withAccessFail(Integer accessFail) {
        this.accessFail = accessFail;
        return this;
    }

    /**
     * **参数解释：** 接入失败任务个数，单位：个。  **取值范围：** 0-1000的整数。
     * minimum: 0
     * maximum: 1000
     * @return accessFail
     */
    public Integer getAccessFail() {
        return accessFail;
    }

    public void setAccessFail(Integer accessFail) {
        this.accessFail = accessFail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsDeployTaskStatusCount that = (OpsDeployTaskStatusCount) obj;
        return Objects.equals(this.deploying, that.deploying) && Objects.equals(this.running, that.running)
            && Objects.equals(this.stopping, that.stopping) && Objects.equals(this.stopped, that.stopped)
            && Objects.equals(this.starting, that.starting) && Objects.equals(this.fail, that.fail)
            && Objects.equals(this.deleting, that.deleting) && Objects.equals(this.accessFail, that.accessFail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deploying, running, stopping, stopped, starting, fail, deleting, accessFail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsDeployTaskStatusCount {\n");
        sb.append("    deploying: ").append(toIndentedString(deploying)).append("\n");
        sb.append("    running: ").append(toIndentedString(running)).append("\n");
        sb.append("    stopping: ").append(toIndentedString(stopping)).append("\n");
        sb.append("    stopped: ").append(toIndentedString(stopped)).append("\n");
        sb.append("    starting: ").append(toIndentedString(starting)).append("\n");
        sb.append("    fail: ").append(toIndentedString(fail)).append("\n");
        sb.append("    deleting: ").append(toIndentedString(deleting)).append("\n");
        sb.append("    accessFail: ").append(toIndentedString(accessFail)).append("\n");
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
