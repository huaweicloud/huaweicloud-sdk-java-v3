package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaskInstanceContainerStatusRsp
 */
public class TaskInstanceContainerStatusRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart_count")

    private Integer restartCount;

    public TaskInstanceContainerStatusRsp withRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
        return this;
    }

    /**
     * 重启次数
     * @return restartCount
     */
    public Integer getRestartCount() {
        return restartCount;
    }

    public void setRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskInstanceContainerStatusRsp that = (TaskInstanceContainerStatusRsp) obj;
        return Objects.equals(this.restartCount, that.restartCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restartCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskInstanceContainerStatusRsp {\n");
        sb.append("    restartCount: ").append(toIndentedString(restartCount)).append("\n");
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
