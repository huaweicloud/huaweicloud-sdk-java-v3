package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ConfigurationsRsp
 */
public class ConfigurationsRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterId")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createAt")

    private String createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finishedAt")

    private String finishedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifyDeleteReset")

    private String modifyDeleteReset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedMsg")

    private String failedMsg;

    public ConfigurationsRsp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 操作ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConfigurationsRsp withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ConfigurationsRsp withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间。格式：Unix时间戳格式。
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public ConfigurationsRsp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务执行状态。 - true: 执行成功。 - false: 执行失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ConfigurationsRsp withFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * 结束时间，当创建未结束时结束时间为null。格式：Unix时间戳格式。
     * @return finishedAt
     */
    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public ConfigurationsRsp withModifyDeleteReset(String modifyDeleteReset) {
        this.modifyDeleteReset = modifyDeleteReset;
        return this;
    }

    /**
     * 修改参数配置记录。
     * @return modifyDeleteReset
     */
    public String getModifyDeleteReset() {
        return modifyDeleteReset;
    }

    public void setModifyDeleteReset(String modifyDeleteReset) {
        this.modifyDeleteReset = modifyDeleteReset;
    }

    public ConfigurationsRsp withFailedMsg(String failedMsg) {
        this.failedMsg = failedMsg;
        return this;
    }

    /**
     * 返回错误信息。当状态为success时该参数为null。
     * @return failedMsg
     */
    public String getFailedMsg() {
        return failedMsg;
    }

    public void setFailedMsg(String failedMsg) {
        this.failedMsg = failedMsg;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigurationsRsp configurationsRsp = (ConfigurationsRsp) o;
        return Objects.equals(this.id, configurationsRsp.id)
            && Objects.equals(this.clusterId, configurationsRsp.clusterId)
            && Objects.equals(this.createAt, configurationsRsp.createAt)
            && Objects.equals(this.status, configurationsRsp.status)
            && Objects.equals(this.finishedAt, configurationsRsp.finishedAt)
            && Objects.equals(this.modifyDeleteReset, configurationsRsp.modifyDeleteReset)
            && Objects.equals(this.failedMsg, configurationsRsp.failedMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clusterId, createAt, status, finishedAt, modifyDeleteReset, failedMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationsRsp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
        sb.append("    modifyDeleteReset: ").append(toIndentedString(modifyDeleteReset)).append("\n");
        sb.append("    failedMsg: ").append(toIndentedString(failedMsg)).append("\n");
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
