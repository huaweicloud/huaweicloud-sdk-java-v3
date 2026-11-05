package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * JobBaselineInfo
 */
public class JobBaselineInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baselines")

    private List<BaselineInfo> baselines = null;

    public JobBaselineInfo withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**： 作业ID。 **取值范围**： 长度为1~64个字符。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public JobBaselineInfo withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * **参数解释**： 作业名称。如果作业不存在或不在当前工作空间内，则为空。 **取值范围**： 长度为1~1024个字符。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public JobBaselineInfo withBaselines(List<BaselineInfo> baselines) {
        this.baselines = baselines;
        return this;
    }

    public JobBaselineInfo addBaselinesItem(BaselineInfo baselinesItem) {
        if (this.baselines == null) {
            this.baselines = new ArrayList<>();
        }
        this.baselines.add(baselinesItem);
        return this;
    }

    public JobBaselineInfo withBaselines(Consumer<List<BaselineInfo>> baselinesSetter) {
        if (this.baselines == null) {
            this.baselines = new ArrayList<>();
        }
        baselinesSetter.accept(this.baselines);
        return this;
    }

    /**
     * **参数解释**： 作业关联的基线信息列表。如果作业未关联基线，则返回空列表。 **取值范围**： 不涉及。
     * @return baselines
     */
    public List<BaselineInfo> getBaselines() {
        return baselines;
    }

    public void setBaselines(List<BaselineInfo> baselines) {
        this.baselines = baselines;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobBaselineInfo that = (JobBaselineInfo) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.baselines, that.baselines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, jobName, baselines);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobBaselineInfo {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    baselines: ").append(toIndentedString(baselines)).append("\n");
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
