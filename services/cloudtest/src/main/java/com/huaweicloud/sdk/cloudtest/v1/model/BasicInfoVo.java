package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BasicInfoVo
 */
public class BasicInfoVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_interval")

    private Integer collectInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_task_name")

    private String subTaskName;

    public BasicInfoVo withCollectInterval(Integer collectInterval) {
        this.collectInterval = collectInterval;
        return this;
    }

    /**
     * 采集间隔以秒为单位
     * @return collectInterval
     */
    public Integer getCollectInterval() {
        return collectInterval;
    }

    public void setCollectInterval(Integer collectInterval) {
        this.collectInterval = collectInterval;
    }

    public BasicInfoVo withSubTaskName(String subTaskName) {
        this.subTaskName = subTaskName;
        return this;
    }

    /**
     * 子任务名称
     * @return subTaskName
     */
    public String getSubTaskName() {
        return subTaskName;
    }

    public void setSubTaskName(String subTaskName) {
        this.subTaskName = subTaskName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasicInfoVo that = (BasicInfoVo) obj;
        return Objects.equals(this.collectInterval, that.collectInterval)
            && Objects.equals(this.subTaskName, that.subTaskName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectInterval, subTaskName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BasicInfoVo {\n");
        sb.append("    collectInterval: ").append(toIndentedString(collectInterval)).append("\n");
        sb.append("    subTaskName: ").append(toIndentedString(subTaskName)).append("\n");
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
