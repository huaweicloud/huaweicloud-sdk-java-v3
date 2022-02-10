package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ConfigList */
public class ConfigList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterId")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createAt")

    private Object createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finishedAt")

    private Object finishedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifyDeleteReset")

    private String modifyDeleteReset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedMsg")

    private String failedMsg;

    public ConfigList withId(String id) {
        this.id = id;
        return this;
    }

    /** 操作ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConfigList withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /** 集群ID。
     * 
     * @return clusterId */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ConfigList withCreateAt(Object createAt) {
        this.createAt = createAt;
        return this;
    }

    /** 创建时间。
     * 
     * @return createAt */
    public Object getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Object createAt) {
        this.createAt = createAt;
    }

    public ConfigList withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 状态。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ConfigList withFinishedAt(Object finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    /** 结束时间。
     * 
     * @return finishedAt */
    public Object getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(Object finishedAt) {
        this.finishedAt = finishedAt;
    }

    public ConfigList withModifyDeleteReset(String modifyDeleteReset) {
        this.modifyDeleteReset = modifyDeleteReset;
        return this;
    }

    /** 修改参数配置记录。
     * 
     * @return modifyDeleteReset */
    public String getModifyDeleteReset() {
        return modifyDeleteReset;
    }

    public void setModifyDeleteReset(String modifyDeleteReset) {
        this.modifyDeleteReset = modifyDeleteReset;
    }

    public ConfigList withFailedMsg(String failedMsg) {
        this.failedMsg = failedMsg;
        return this;
    }

    /** 返回错误信息。
     * 
     * @return failedMsg */
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
        ConfigList configList = (ConfigList) o;
        return Objects.equals(this.id, configList.id) && Objects.equals(this.clusterId, configList.clusterId)
            && Objects.equals(this.createAt, configList.createAt) && Objects.equals(this.status, configList.status)
            && Objects.equals(this.finishedAt, configList.finishedAt)
            && Objects.equals(this.modifyDeleteReset, configList.modifyDeleteReset)
            && Objects.equals(this.failedMsg, configList.failedMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clusterId, createAt, status, finishedAt, modifyDeleteReset, failedMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigList {\n");
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
