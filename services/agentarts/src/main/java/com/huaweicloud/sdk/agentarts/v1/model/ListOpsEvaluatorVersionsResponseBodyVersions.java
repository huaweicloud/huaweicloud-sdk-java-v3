package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListOpsEvaluatorVersionsResponseBodyVersions
 */
public class ListOpsEvaluatorVersionsResponseBodyVersions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_id")

    private String evaluatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_info")

    private OpsEvaluatorBaseInfo baseInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_content")

    private EvaluatorContent evaluatorContent;

    public ListOpsEvaluatorVersionsResponseBodyVersions withEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
        return this;
    }

    /**
     * **参数解释：** 评估器的唯一标识符。 **取值范围：** 不涉及。 
     * @return evaluatorId
     */
    public String getEvaluatorId() {
        return evaluatorId;
    }

    public void setEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
    }

    public ListOpsEvaluatorVersionsResponseBodyVersions withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 评估器的具体版本号，用于区分不同的逻辑迭代。 **取值范围：** 不涉及。 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ListOpsEvaluatorVersionsResponseBodyVersions withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 该版本的变更详细说明或备注。 **取值范围：** 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListOpsEvaluatorVersionsResponseBodyVersions withBaseInfo(OpsEvaluatorBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    public ListOpsEvaluatorVersionsResponseBodyVersions withBaseInfo(Consumer<OpsEvaluatorBaseInfo> baseInfoSetter) {
        if (this.baseInfo == null) {
            this.baseInfo = new OpsEvaluatorBaseInfo();
            baseInfoSetter.accept(this.baseInfo);
        }

        return this;
    }

    /**
     * Get baseInfo
     * @return baseInfo
     */
    public OpsEvaluatorBaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(OpsEvaluatorBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public ListOpsEvaluatorVersionsResponseBodyVersions withEvaluatorContent(EvaluatorContent evaluatorContent) {
        this.evaluatorContent = evaluatorContent;
        return this;
    }

    public ListOpsEvaluatorVersionsResponseBodyVersions withEvaluatorContent(
        Consumer<EvaluatorContent> evaluatorContentSetter) {
        if (this.evaluatorContent == null) {
            this.evaluatorContent = new EvaluatorContent();
            evaluatorContentSetter.accept(this.evaluatorContent);
        }

        return this;
    }

    /**
     * Get evaluatorContent
     * @return evaluatorContent
     */
    public EvaluatorContent getEvaluatorContent() {
        return evaluatorContent;
    }

    public void setEvaluatorContent(EvaluatorContent evaluatorContent) {
        this.evaluatorContent = evaluatorContent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsEvaluatorVersionsResponseBodyVersions that = (ListOpsEvaluatorVersionsResponseBodyVersions) obj;
        return Objects.equals(this.evaluatorId, that.evaluatorId) && Objects.equals(this.version, that.version)
            && Objects.equals(this.description, that.description) && Objects.equals(this.baseInfo, that.baseInfo)
            && Objects.equals(this.evaluatorContent, that.evaluatorContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluatorId, version, description, baseInfo, evaluatorContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluatorVersionsResponseBodyVersions {\n");
        sb.append("    evaluatorId: ").append(toIndentedString(evaluatorId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    baseInfo: ").append(toIndentedString(baseInfo)).append("\n");
        sb.append("    evaluatorContent: ").append(toIndentedString(evaluatorContent)).append("\n");
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
