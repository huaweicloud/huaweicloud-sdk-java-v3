package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDirectoryByResultCommitIdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evolve_task_id")

    private String evolveTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_id")

    private String commitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration")

    private Integer iteration;

    public ListDirectoryByResultCommitIdRequest withEvolveTaskId(String evolveTaskId) {
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

    public ListDirectoryByResultCommitIdRequest withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * **参数解释**： 演化任务结果的commit_id。 **约束限制**： 不涉及 **取值范围**： 仅支持字母、数字、中划线和下划线，长度为[1-256]个字符。 **默认取值**： 不涉及 
     * @return commitId
     */
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public ListDirectoryByResultCommitIdRequest withIteration(Integer iteration) {
        this.iteration = iteration;
        return this;
    }

    /**
     * **参数解释**： 从哪个轮次开始查询。 **约束限制**： 不涉及 **取值范围**： [-1-10000]。 **默认取值**： 不涉及 
     * minimum: -1
     * maximum: 10000
     * @return iteration
     */
    public Integer getIteration() {
        return iteration;
    }

    public void setIteration(Integer iteration) {
        this.iteration = iteration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDirectoryByResultCommitIdRequest that = (ListDirectoryByResultCommitIdRequest) obj;
        return Objects.equals(this.evolveTaskId, that.evolveTaskId) && Objects.equals(this.commitId, that.commitId)
            && Objects.equals(this.iteration, that.iteration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evolveTaskId, commitId, iteration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDirectoryByResultCommitIdRequest {\n");
        sb.append("    evolveTaskId: ").append(toIndentedString(evolveTaskId)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    iteration: ").append(toIndentedString(iteration)).append("\n");
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
