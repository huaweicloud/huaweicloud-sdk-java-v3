package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowTaskRunningLogRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evolve_task_id")

    private String evolveTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_byte")

    private Long startByte;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_byte")

    private Long endByte;

    public ShowTaskRunningLogRequest withEvolveTaskId(String evolveTaskId) {
        this.evolveTaskId = evolveTaskId;
        return this;
    }

    /**
     * **参数解释**： 演化任务标识符。 **约束限制**： 不涉及 **取值范围**： 仅支持字母、数字、中划线和下划线，长度为[1-128]个字符。 **默认取值**： 不涉及 
     * @return evolveTaskId
     */
    public String getEvolveTaskId() {
        return evolveTaskId;
    }

    public void setEvolveTaskId(String evolveTaskId) {
        this.evolveTaskId = evolveTaskId;
    }

    public ShowTaskRunningLogRequest withStartByte(Long startByte) {
        this.startByte = startByte;
        return this;
    }

    /**
     * **参数解释**： 算法的启动时间。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * minimum: 0
     * maximum: 9999999999999
     * @return startByte
     */
    public Long getStartByte() {
        return startByte;
    }

    public void setStartByte(Long startByte) {
        this.startByte = startByte;
    }

    public ShowTaskRunningLogRequest withEndByte(Long endByte) {
        this.endByte = endByte;
        return this;
    }

    /**
     * **参数解释**： 算法的最后更新时间。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * minimum: 0
     * maximum: 9999999999999
     * @return endByte
     */
    public Long getEndByte() {
        return endByte;
    }

    public void setEndByte(Long endByte) {
        this.endByte = endByte;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskRunningLogRequest that = (ShowTaskRunningLogRequest) obj;
        return Objects.equals(this.evolveTaskId, that.evolveTaskId) && Objects.equals(this.startByte, that.startByte)
            && Objects.equals(this.endByte, that.endByte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evolveTaskId, startByte, endByte);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskRunningLogRequest {\n");
        sb.append("    evolveTaskId: ").append(toIndentedString(evolveTaskId)).append("\n");
        sb.append("    startByte: ").append(toIndentedString(startByte)).append("\n");
        sb.append("    endByte: ").append(toIndentedString(endByte)).append("\n");
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
