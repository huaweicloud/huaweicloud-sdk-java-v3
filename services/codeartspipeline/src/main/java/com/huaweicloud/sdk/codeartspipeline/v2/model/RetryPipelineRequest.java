package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 重试运行流水线请求体。
 */
public class RetryPipelineRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_https_url")

    private String repoHttpsUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_run_ids")

    private List<String> jobRunIds = null;

    public RetryPipelineRequest withRepoHttpsUrl(String repoHttpsUrl) {
        this.repoHttpsUrl = repoHttpsUrl;
        return this;
    }

    /**
     * **参数解释**： 仓库HTTPS地址。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return repoHttpsUrl
     */
    public String getRepoHttpsUrl() {
        return repoHttpsUrl;
    }

    public void setRepoHttpsUrl(String repoHttpsUrl) {
        this.repoHttpsUrl = repoHttpsUrl;
    }

    public RetryPipelineRequest withJobRunIds(List<String> jobRunIds) {
        this.jobRunIds = jobRunIds;
        return this;
    }

    public RetryPipelineRequest addJobRunIdsItem(String jobRunIdsItem) {
        if (this.jobRunIds == null) {
            this.jobRunIds = new ArrayList<>();
        }
        this.jobRunIds.add(jobRunIdsItem);
        return this;
    }

    public RetryPipelineRequest withJobRunIds(Consumer<List<String>> jobRunIdsSetter) {
        if (this.jobRunIds == null) {
            this.jobRunIds = new ArrayList<>();
        }
        jobRunIdsSetter.accept(this.jobRunIds);
        return this;
    }

    /**
     * **参数解释**： 流水线任务运行ID列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return jobRunIds
     */
    public List<String> getJobRunIds() {
        return jobRunIds;
    }

    public void setJobRunIds(List<String> jobRunIds) {
        this.jobRunIds = jobRunIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetryPipelineRequest that = (RetryPipelineRequest) obj;
        return Objects.equals(this.repoHttpsUrl, that.repoHttpsUrl) && Objects.equals(this.jobRunIds, that.jobRunIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repoHttpsUrl, jobRunIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetryPipelineRequest {\n");
        sb.append("    repoHttpsUrl: ").append(toIndentedString(repoHttpsUrl)).append("\n");
        sb.append("    jobRunIds: ").append(toIndentedString(jobRunIds)).append("\n");
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
