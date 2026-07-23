package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOpsEvaluatorResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_id")

    private String evaluatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_type")

    private Integer evaluatorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "box_type")

    private String boxType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "builtin")

    private Boolean builtin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_version")

    private String latestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_version")

    private EvaluationOpsCurrentVersion currentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_info")

    private OpsEvaluatorBaseInfo baseInfo;

    public ShowOpsEvaluatorResponse withEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
        return this;
    }

    /**
     * **参数解释** 评估器的唯一标识符ID。 **取值范围** 符合通用唯一识别码(UUID)标准的字符串。 
     * @return evaluatorId
     */
    public String getEvaluatorId() {
        return evaluatorId;
    }

    public void setEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
    }

    public ShowOpsEvaluatorResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释** 评估器的显示名称。 **取值范围** 支持中英文、数字及常用特殊符号。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowOpsEvaluatorResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释** 对评估器功能、逻辑或评测维度的详细描述。 **取值范围** 任意字符串。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowOpsEvaluatorResponse withEvaluatorType(Integer evaluatorType) {
        this.evaluatorType = evaluatorType;
        return this;
    }

    /**
     * **参数解释** 评估器的分类类型编码。 **取值范围** 对应的整型编码。 
     * minimum: 0
     * maximum: 2147483647
     * @return evaluatorType
     */
    public Integer getEvaluatorType() {
        return evaluatorType;
    }

    public void setEvaluatorType(Integer evaluatorType) {
        this.evaluatorType = evaluatorType;
    }

    public ShowOpsEvaluatorResponse withBoxType(String boxType) {
        this.boxType = boxType;
        return this;
    }

    /**
     * **参数解释** 评估器的可见性类型（盒子类型），决定了评估逻辑的透明度。 **取值范围** - White: 白盒评估。 - Black: 黑盒评估。 
     * @return boxType
     */
    public String getBoxType() {
        return boxType;
    }

    public void setBoxType(String boxType) {
        this.boxType = boxType;
    }

    public ShowOpsEvaluatorResponse withBuiltin(Boolean builtin) {
        this.builtin = builtin;
        return this;
    }

    /**
     * **参数解释** 标识该评估器是否为系统内置预置。 **取值范围** - true: 系统内置。 - false: 用户自定义。 
     * @return builtin
     */
    public Boolean getBuiltin() {
        return builtin;
    }

    public void setBuiltin(Boolean builtin) {
        this.builtin = builtin;
    }

    public ShowOpsEvaluatorResponse withLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * **参数解释** 该评估器下最新发布的版本号。 **取值范围** 符合语义化版本格式的字符串（如 0.0.2）。 
     * @return latestVersion
     */
    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public ShowOpsEvaluatorResponse withCurrentVersion(EvaluationOpsCurrentVersion currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    public ShowOpsEvaluatorResponse withCurrentVersion(Consumer<EvaluationOpsCurrentVersion> currentVersionSetter) {
        if (this.currentVersion == null) {
            this.currentVersion = new EvaluationOpsCurrentVersion();
            currentVersionSetter.accept(this.currentVersion);
        }

        return this;
    }

    /**
     * Get currentVersion
     * @return currentVersion
     */
    public EvaluationOpsCurrentVersion getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(EvaluationOpsCurrentVersion currentVersion) {
        this.currentVersion = currentVersion;
    }

    public ShowOpsEvaluatorResponse withBaseInfo(OpsEvaluatorBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    public ShowOpsEvaluatorResponse withBaseInfo(Consumer<OpsEvaluatorBaseInfo> baseInfoSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsEvaluatorResponse that = (ShowOpsEvaluatorResponse) obj;
        return Objects.equals(this.evaluatorId, that.evaluatorId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.evaluatorType, that.evaluatorType) && Objects.equals(this.boxType, that.boxType)
            && Objects.equals(this.builtin, that.builtin) && Objects.equals(this.latestVersion, that.latestVersion)
            && Objects.equals(this.currentVersion, that.currentVersion) && Objects.equals(this.baseInfo, that.baseInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluatorId,
            name,
            description,
            evaluatorType,
            boxType,
            builtin,
            latestVersion,
            currentVersion,
            baseInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluatorResponse {\n");
        sb.append("    evaluatorId: ").append(toIndentedString(evaluatorId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    evaluatorType: ").append(toIndentedString(evaluatorType)).append("\n");
        sb.append("    boxType: ").append(toIndentedString(boxType)).append("\n");
        sb.append("    builtin: ").append(toIndentedString(builtin)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
        sb.append("    baseInfo: ").append(toIndentedString(baseInfo)).append("\n");
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
