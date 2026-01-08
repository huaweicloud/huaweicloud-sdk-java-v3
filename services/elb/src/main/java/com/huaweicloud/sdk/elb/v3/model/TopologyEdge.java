package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class TopologyEdge {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private String target;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private String sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private String targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_id")

    private String labelId;

    public TopologyEdge withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * **参数解释**：边起点id。  **取值范围**：不涉及
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public TopologyEdge withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * **参数解释**：边终点id。  **取值范围**：不涉及
     * @return target
     */
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public TopologyEdge withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * **参数解释**：边起点类型。  **取值范围**：不涉及
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public TopologyEdge withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * **参数解释**：边终点类型。  **取值范围**：不涉及
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public TopologyEdge withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * **参数解释**：边label信息。  **取值范围**：不涉及
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public TopologyEdge withLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }

    /**
     * **参数解释**：label id。  **取值范围**：不涉及
     * @return labelId
     */
    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopologyEdge that = (TopologyEdge) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.target, that.target)
            && Objects.equals(this.sourceType, that.sourceType) && Objects.equals(this.targetType, that.targetType)
            && Objects.equals(this.label, that.label) && Objects.equals(this.labelId, that.labelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, target, sourceType, targetType, label, labelId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopologyEdge {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
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
