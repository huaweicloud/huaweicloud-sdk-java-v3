package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CompareParameterGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_name")

    private String sourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private String targetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_name")

    private String targetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<ParamGroupParameterDiffV3> parameters = null;

    public CompareParameterGroupsResponse withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * **参数解释**：  源参数组ID。  **约束限制**：  不涉及。  **取值范围**：  只能由英文字母、数字组成，长度为36个字符。  **默认取值**：  不涉及。
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public CompareParameterGroupsResponse withSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * **参数解释**：  源参数组名称。  **参数范围**：  不涉及。
     * @return sourceName
     */
    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public CompareParameterGroupsResponse withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * **参数解释**：  目标参数组ID。  **约束限制**：  不涉及。  **取值范围**：  只能由英文字母、数字组成，长度为36个字符。  **默认取值**：  不涉及。
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public CompareParameterGroupsResponse withTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }

    /**
     * **参数解释**：  目标参数组名称。  **参数范围**：  不涉及。
     * @return targetName
     */
    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public CompareParameterGroupsResponse withParameters(List<ParamGroupParameterDiffV3> parameters) {
        this.parameters = parameters;
        return this;
    }

    public CompareParameterGroupsResponse addParametersItem(ParamGroupParameterDiffV3 parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public CompareParameterGroupsResponse withParameters(Consumer<List<ParamGroupParameterDiffV3>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * **参数解释**：  比较参数组返回相关信息的集合。  **参数范围**：  不涉及。
     * @return parameters
     */
    public List<ParamGroupParameterDiffV3> getParameters() {
        return parameters;
    }

    public void setParameters(List<ParamGroupParameterDiffV3> parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompareParameterGroupsResponse that = (CompareParameterGroupsResponse) obj;
        return Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.sourceName, that.sourceName)
            && Objects.equals(this.targetId, that.targetId) && Objects.equals(this.targetName, that.targetName)
            && Objects.equals(this.parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceId, sourceName, targetId, targetName, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareParameterGroupsResponse {\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
