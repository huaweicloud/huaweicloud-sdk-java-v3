package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 服务任务限制信息。 **约束限制：** 不涉及。
 */
public class ServerTaskLimit {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_task")

    private Integer maxTask;

    public ServerTaskLimit withMaxTask(Integer maxTask) {
        this.maxTask = maxTask;
        return this;
    }

    /**
     * **参数解释：** 单个服务任务限制总数。 **取值范围：** [0, 10000]。
     * @return maxTask
     */
    public Integer getMaxTask() {
        return maxTask;
    }

    public void setMaxTask(Integer maxTask) {
        this.maxTask = maxTask;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerTaskLimit that = (ServerTaskLimit) obj;
        return Objects.equals(this.maxTask, that.maxTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxTask);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerTaskLimit {\n");
        sb.append("    maxTask: ").append(toIndentedString(maxTask)).append("\n");
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
