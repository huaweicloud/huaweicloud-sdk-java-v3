package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateAgentStatusResponseDetail
 */
public class UpdateAgentStatusResponseDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private AgentConfig result;

    public UpdateAgentStatusResponseDetail withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 全链路应用id
     * minimum: 0
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UpdateAgentStatusResponseDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 全链路应用状态，枚举值：CREATING，FAILED，NORMAL，DELETE
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateAgentStatusResponseDetail withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 全链路应用更新时间
     * minimum: 0
     * maximum: 9999999999999
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateAgentStatusResponseDetail withResult(AgentConfig result) {
        this.result = result;
        return this;
    }

    public UpdateAgentStatusResponseDetail withResult(Consumer<AgentConfig> resultSetter) {
        if (this.result == null) {
            this.result = new AgentConfig();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public AgentConfig getResult() {
        return result;
    }

    public void setResult(AgentConfig result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAgentStatusResponseDetail updateAgentStatusResponseDetail = (UpdateAgentStatusResponseDetail) o;
        return Objects.equals(this.id, updateAgentStatusResponseDetail.id)
            && Objects.equals(this.status, updateAgentStatusResponseDetail.status)
            && Objects.equals(this.updateTime, updateAgentStatusResponseDetail.updateTime)
            && Objects.equals(this.result, updateAgentStatusResponseDetail.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, updateTime, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAgentStatusResponseDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
