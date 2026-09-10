package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateOpsAnalysisTaskRequestBody
 */
public class CreateOpsAnalysisTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent")

    private OpsAnalysisTaskAgent agent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_strategy")

    private OpsExecutionStrategy executionStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_strategy")

    private OpsSampleStrategy sampleStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<OpsTasksTagForTMS> tags = null;

    public CreateOpsAnalysisTaskRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 任务名称，用于标识和区分不同的分析任务。  **约束限制：** 不涉及  **取值范围：** 长度1-64个字符，支持中文、字母、数字、中划线及下划线。  **默认取值：** 无
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateOpsAnalysisTaskRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 任务的详细描述，用于记录任务目的或备注信息。  **约束限制：** 不涉及  **取值范围：** 长度0-1024个字符。  **默认取值：** 无
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateOpsAnalysisTaskRequestBody withAgent(OpsAnalysisTaskAgent agent) {
        this.agent = agent;
        return this;
    }

    public CreateOpsAnalysisTaskRequestBody withAgent(Consumer<OpsAnalysisTaskAgent> agentSetter) {
        if (this.agent == null) {
            this.agent = new OpsAnalysisTaskAgent();
            agentSetter.accept(this.agent);
        }

        return this;
    }

    /**
     * Get agent
     * @return agent
     */
    public OpsAnalysisTaskAgent getAgent() {
        return agent;
    }

    public void setAgent(OpsAnalysisTaskAgent agent) {
        this.agent = agent;
    }

    public CreateOpsAnalysisTaskRequestBody withExecutionStrategy(OpsExecutionStrategy executionStrategy) {
        this.executionStrategy = executionStrategy;
        return this;
    }

    public CreateOpsAnalysisTaskRequestBody withExecutionStrategy(
        Consumer<OpsExecutionStrategy> executionStrategySetter) {
        if (this.executionStrategy == null) {
            this.executionStrategy = new OpsExecutionStrategy();
            executionStrategySetter.accept(this.executionStrategy);
        }

        return this;
    }

    /**
     * Get executionStrategy
     * @return executionStrategy
     */
    public OpsExecutionStrategy getExecutionStrategy() {
        return executionStrategy;
    }

    public void setExecutionStrategy(OpsExecutionStrategy executionStrategy) {
        this.executionStrategy = executionStrategy;
    }

    public CreateOpsAnalysisTaskRequestBody withSampleStrategy(OpsSampleStrategy sampleStrategy) {
        this.sampleStrategy = sampleStrategy;
        return this;
    }

    public CreateOpsAnalysisTaskRequestBody withSampleStrategy(Consumer<OpsSampleStrategy> sampleStrategySetter) {
        if (this.sampleStrategy == null) {
            this.sampleStrategy = new OpsSampleStrategy();
            sampleStrategySetter.accept(this.sampleStrategy);
        }

        return this;
    }

    /**
     * Get sampleStrategy
     * @return sampleStrategy
     */
    public OpsSampleStrategy getSampleStrategy() {
        return sampleStrategy;
    }

    public void setSampleStrategy(OpsSampleStrategy sampleStrategy) {
        this.sampleStrategy = sampleStrategy;
    }

    public CreateOpsAnalysisTaskRequestBody withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * **参数解释：** 委托名称，赋予服务访问用户资源的权限。  **约束限制：** 必须是IAM中已创建的有效委托。  **取值范围：** 合法的委托名称字符串。  **默认取值：** 无
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public CreateOpsAnalysisTaskRequestBody withTags(List<OpsTasksTagForTMS> tags) {
        this.tags = tags;
        return this;
    }

    public CreateOpsAnalysisTaskRequestBody addTagsItem(OpsTasksTagForTMS tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateOpsAnalysisTaskRequestBody withTags(Consumer<List<OpsTasksTagForTMS>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 资源标签列表，用于资源分类。  **约束限制：** 不涉及  **取值范围：** 数组长度0-20。  **默认取值：** 空数组
     * @return tags
     */
    public List<OpsTasksTagForTMS> getTags() {
        return tags;
    }

    public void setTags(List<OpsTasksTagForTMS> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOpsAnalysisTaskRequestBody that = (CreateOpsAnalysisTaskRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.agent, that.agent) && Objects.equals(this.executionStrategy, that.executionStrategy)
            && Objects.equals(this.sampleStrategy, that.sampleStrategy)
            && Objects.equals(this.agencyName, that.agencyName) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, agent, executionStrategy, sampleStrategy, agencyName, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOpsAnalysisTaskRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
        sb.append("    executionStrategy: ").append(toIndentedString(executionStrategy)).append("\n");
        sb.append("    sampleStrategy: ").append(toIndentedString(sampleStrategy)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
