package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowTrainingJobRoutePlanResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank_mapping")

    private String rankMapping;

    public ShowTrainingJobRoutePlanResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：训练作业ID。 **取值范围**：不涉及。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowTrainingJobRoutePlanResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：路由规划状态。 **取值范围**： - success：路由规划成功 - failed：路由规划未执行或不满足条件，返回默认rank映射
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowTrainingJobRoutePlanResponse withRankMapping(String rankMapping) {
        this.rankMapping = rankMapping;
        return this;
    }

    /**
     * **参数解释**：rank映射结果，格式为\"newRankId-workerId\"，多个映射项之间以英文逗号分隔。 **约束限制**：当status为failed时，返回基于作业规格计算的默认顺序映射。 **取值范围**：不涉及。
     * @return rankMapping
     */
    public String getRankMapping() {
        return rankMapping;
    }

    public void setRankMapping(String rankMapping) {
        this.rankMapping = rankMapping;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTrainingJobRoutePlanResponse that = (ShowTrainingJobRoutePlanResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.rankMapping, that.rankMapping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, status, rankMapping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTrainingJobRoutePlanResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    rankMapping: ").append(toIndentedString(rankMapping)).append("\n");
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
