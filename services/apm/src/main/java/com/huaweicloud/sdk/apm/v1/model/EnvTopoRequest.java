package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 获取组件环境拓扑数据的请求参数。
 */
public class EnvTopoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_env_id")

    private Long targetEnvId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private String direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_user")

    private Boolean filterUser;

    public EnvTopoRequest withTargetEnvId(Long targetEnvId) {
        this.targetEnvId = targetEnvId;
        return this;
    }

    /**
     * 环境id。
     * @return targetEnvId
     */
    public Long getTargetEnvId() {
        return targetEnvId;
    }

    public void setTargetEnvId(Long targetEnvId) {
        this.targetEnvId = targetEnvId;
    }

    public EnvTopoRequest withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 方向，可为空。
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public EnvTopoRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public EnvTopoRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public EnvTopoRequest withFilterUser(Boolean filterUser) {
        this.filterUser = filterUser;
        return this;
    }

    /**
     * 过滤。
     * @return filterUser
     */
    public Boolean getFilterUser() {
        return filterUser;
    }

    public void setFilterUser(Boolean filterUser) {
        this.filterUser = filterUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnvTopoRequest that = (EnvTopoRequest) obj;
        return Objects.equals(this.targetEnvId, that.targetEnvId) && Objects.equals(this.direction, that.direction)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.filterUser, that.filterUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetEnvId, direction, endTime, startTime, filterUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvTopoRequest {\n");
        sb.append("    targetEnvId: ").append(toIndentedString(targetEnvId)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    filterUser: ").append(toIndentedString(filterUser)).append("\n");
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
