package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CreateResJobsReququestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    @JacksonXmlProperty(localName = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_config")

    @JacksonXmlProperty(localName = "job_config")

    private JobConfig jobConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_config")

    @JacksonXmlProperty(localName = "exec_config")

    private ResExecConfig execConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    @JacksonXmlProperty(localName = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    @JacksonXmlProperty(localName = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    @JacksonXmlProperty(localName = "schedule")

    private String schedule;

    public CreateResJobsReququestBody withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 类别： - RECALL，召回作业 - DATASOURCE，数据源作业 - FILTER，过滤作业 - SORTING，排序作业 - EVALUATE，效果评估作业
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public CreateResJobsReququestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateResJobsReququestBody withJobConfig(JobConfig jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }

    public CreateResJobsReququestBody withJobConfig(Consumer<JobConfig> jobConfigSetter) {
        if (this.jobConfig == null) {
            this.jobConfig = new JobConfig();
            jobConfigSetter.accept(this.jobConfig);
        }

        return this;
    }

    /**
     * Get jobConfig
     * @return jobConfig
     */
    public JobConfig getJobConfig() {
        return jobConfig;
    }

    public void setJobConfig(JobConfig jobConfig) {
        this.jobConfig = jobConfig;
    }

    public CreateResJobsReququestBody withExecConfig(ResExecConfig execConfig) {
        this.execConfig = execConfig;
        return this;
    }

    public CreateResJobsReququestBody withExecConfig(Consumer<ResExecConfig> execConfigSetter) {
        if (this.execConfig == null) {
            this.execConfig = new ResExecConfig();
            execConfigSetter.accept(this.execConfig);
        }

        return this;
    }

    /**
     * Get execConfig
     * @return execConfig
     */
    public ResExecConfig getExecConfig() {
        return execConfig;
    }

    public void setExecConfig(ResExecConfig execConfig) {
        this.execConfig = execConfig;
    }

    public CreateResJobsReququestBody withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名称，1-64位字母、数字、下划线、中划线组合
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public CreateResJobsReququestBody withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业类型： - WriteUserProfile，用户画像实时导入作业 - WriteItemProfile，物品画像实时导入作业 - UniversalProcess，行为数据实时导入作业 - NearlineRecall，近线召回作业 - EncodeProfile，近线特征工程作业 - AttributeMatch，属性匹配召回作业 - AlsCF，交替最小二乘协同过滤作业 - BhvHistory，历史行为记忆召回作业 - ItemCf，物品协同过滤召回作业 - MenEdit，人工配置候选集作业 - Ucb，UCB召回作业 - UserCf，用户协同过滤召回作业 - WeightBehavior，综合行为热度召回作业 - Filter，历史行为过滤作业 - AutoPreRank，智能ETL参数生成作业 - ETL，离线特征工程作业 - LR，LR作业 - DEEPFM，DEEPFM作业 - AutoGroup，AutoGroup作业 - StreamRank，在线训练作业 - DataStruct，识别数据结构作业 - DataExploration，数据探索作业 - DataImport，离线数据导入作业 - Evaluate，效果评估作业
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public CreateResJobsReququestBody withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * 调度参数
     * @return schedule
     */
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateResJobsReququestBody createResJobsReququestBody = (CreateResJobsReququestBody) o;
        return Objects.equals(this.category, createResJobsReququestBody.category)
            && Objects.equals(this.description, createResJobsReququestBody.description)
            && Objects.equals(this.jobConfig, createResJobsReququestBody.jobConfig)
            && Objects.equals(this.execConfig, createResJobsReququestBody.execConfig)
            && Objects.equals(this.jobName, createResJobsReququestBody.jobName)
            && Objects.equals(this.jobType, createResJobsReququestBody.jobType)
            && Objects.equals(this.schedule, createResJobsReququestBody.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, description, jobConfig, execConfig, jobName, jobType, schedule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResJobsReququestBody {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    jobConfig: ").append(toIndentedString(jobConfig)).append("\n");
        sb.append("    execConfig: ").append(toIndentedString(execConfig)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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
