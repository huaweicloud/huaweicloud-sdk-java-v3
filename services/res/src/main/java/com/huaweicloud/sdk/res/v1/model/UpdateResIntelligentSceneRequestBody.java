package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateResIntelligentSceneRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_id")

    private String datasourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specs_config")

    private SpecsConfig specsConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private String schedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_configs")

    private JobConfig jobConfigs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene_name")

    private String sceneName;

    public UpdateResIntelligentSceneRequestBody withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 场景类型： - customize，自定义场景 - intelligent，智能场景
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public UpdateResIntelligentSceneRequestBody withDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }

    /**
     * 数据源id，字母、数字、下划线、减号组合32位。
     * @return datasourceId
     */
    public String getDatasourceId() {
        return datasourceId;
    }

    public void setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
    }

    public UpdateResIntelligentSceneRequestBody withSpecsConfig(SpecsConfig specsConfig) {
        this.specsConfig = specsConfig;
        return this;
    }

    public UpdateResIntelligentSceneRequestBody withSpecsConfig(Consumer<SpecsConfig> specsConfigSetter) {
        if (this.specsConfig == null) {
            this.specsConfig = new SpecsConfig();
            specsConfigSetter.accept(this.specsConfig);
        }

        return this;
    }

    /**
     * Get specsConfig
     * @return specsConfig
     */
    public SpecsConfig getSpecsConfig() {
        return specsConfig;
    }

    public void setSpecsConfig(SpecsConfig specsConfig) {
        this.specsConfig = specsConfig;
    }

    public UpdateResIntelligentSceneRequestBody withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * 调度信息。
     * @return schedule
     */
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public UpdateResIntelligentSceneRequestBody withJobConfigs(JobConfig jobConfigs) {
        this.jobConfigs = jobConfigs;
        return this;
    }

    public UpdateResIntelligentSceneRequestBody withJobConfigs(Consumer<JobConfig> jobConfigsSetter) {
        if (this.jobConfigs == null) {
            this.jobConfigs = new JobConfig();
            jobConfigsSetter.accept(this.jobConfigs);
        }

        return this;
    }

    /**
     * Get jobConfigs
     * @return jobConfigs
     */
    public JobConfig getJobConfigs() {
        return jobConfigs;
    }

    public void setJobConfigs(JobConfig jobConfigs) {
        this.jobConfigs = jobConfigs;
    }

    public UpdateResIntelligentSceneRequestBody withSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }

    /**
     * 场景名称，1-64位字母、数字、下划线、中划线组合。
     * @return sceneName
     */
    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateResIntelligentSceneRequestBody updateResIntelligentSceneRequestBody =
            (UpdateResIntelligentSceneRequestBody) o;
        return Objects.equals(this.category, updateResIntelligentSceneRequestBody.category)
            && Objects.equals(this.datasourceId, updateResIntelligentSceneRequestBody.datasourceId)
            && Objects.equals(this.specsConfig, updateResIntelligentSceneRequestBody.specsConfig)
            && Objects.equals(this.schedule, updateResIntelligentSceneRequestBody.schedule)
            && Objects.equals(this.jobConfigs, updateResIntelligentSceneRequestBody.jobConfigs)
            && Objects.equals(this.sceneName, updateResIntelligentSceneRequestBody.sceneName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, datasourceId, specsConfig, schedule, jobConfigs, sceneName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResIntelligentSceneRequestBody {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    datasourceId: ").append(toIndentedString(datasourceId)).append("\n");
        sb.append("    specsConfig: ").append(toIndentedString(specsConfig)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    jobConfigs: ").append(toIndentedString(jobConfigs)).append("\n");
        sb.append("    sceneName: ").append(toIndentedString(sceneName)).append("\n");
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
