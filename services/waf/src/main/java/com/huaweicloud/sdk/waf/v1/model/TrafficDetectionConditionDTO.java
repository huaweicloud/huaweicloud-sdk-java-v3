package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TrafficDetectionConditionDTO
 */
public class TrafficDetectionConditionDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_field")

    private String matchField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_field_index")

    private String matchFieldIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_operator")

    private String logicalOperator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_contents")

    private List<String> matchContents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_list_ref")

    private String valueListRef;

    public TrafficDetectionConditionDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** Id，唯一标识当前流量检测条件。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TrafficDetectionConditionDTO withMatchField(String matchField) {
        this.matchField = matchField;
        return this;
    }

    /**
     * **参数解释：** 匹配字段（类别），标识流量筛选的字段类型（如url表示URL路径）。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return matchField
     */
    public String getMatchField() {
        return matchField;
    }

    public void setMatchField(String matchField) {
        this.matchField = matchField;
    }

    public TrafficDetectionConditionDTO withMatchFieldIndex(String matchFieldIndex) {
        this.matchFieldIndex = matchFieldIndex;
        return this;
    }

    /**
     * **参数解释：** 子字段，匹配字段的细分维度（如无则不填）。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return matchFieldIndex
     */
    public String getMatchFieldIndex() {
        return matchFieldIndex;
    }

    public void setMatchFieldIndex(String matchFieldIndex) {
        this.matchFieldIndex = matchFieldIndex;
    }

    public TrafficDetectionConditionDTO withLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
        return this;
    }

    /**
     * **参数解释：** 逻辑运算符，标识匹配条件的逻辑关系（如contain表示包含）。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return logicalOperator
     */
    public String getLogicalOperator() {
        return logicalOperator;
    }

    public void setLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
    }

    public TrafficDetectionConditionDTO withMatchContents(List<String> matchContents) {
        this.matchContents = matchContents;
        return this;
    }

    public TrafficDetectionConditionDTO addMatchContentsItem(String matchContentsItem) {
        if (this.matchContents == null) {
            this.matchContents = new ArrayList<>();
        }
        this.matchContents.add(matchContentsItem);
        return this;
    }

    public TrafficDetectionConditionDTO withMatchContents(Consumer<List<String>> matchContentsSetter) {
        if (this.matchContents == null) {
            this.matchContents = new ArrayList<>();
        }
        matchContentsSetter.accept(this.matchContents);
        return this;
    }

    /**
     * **参数解释：** 匹配内容，符合筛选条件的具体值列表（如特定URL路径）。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return matchContents
     */
    public List<String> getMatchContents() {
        return matchContents;
    }

    public void setMatchContents(List<String> matchContents) {
        this.matchContents = matchContents;
    }

    public TrafficDetectionConditionDTO withValueListRef(String valueListRef) {
        this.valueListRef = valueListRef;
        return this;
    }

    /**
     * **参数解释：** 引用表Id，关联预设的匹配内容列表ID（如无则不填）。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return valueListRef
     */
    public String getValueListRef() {
        return valueListRef;
    }

    public void setValueListRef(String valueListRef) {
        this.valueListRef = valueListRef;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrafficDetectionConditionDTO that = (TrafficDetectionConditionDTO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.matchField, that.matchField)
            && Objects.equals(this.matchFieldIndex, that.matchFieldIndex)
            && Objects.equals(this.logicalOperator, that.logicalOperator)
            && Objects.equals(this.matchContents, that.matchContents)
            && Objects.equals(this.valueListRef, that.valueListRef);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, matchField, matchFieldIndex, logicalOperator, matchContents, valueListRef);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrafficDetectionConditionDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    matchField: ").append(toIndentedString(matchField)).append("\n");
        sb.append("    matchFieldIndex: ").append(toIndentedString(matchFieldIndex)).append("\n");
        sb.append("    logicalOperator: ").append(toIndentedString(logicalOperator)).append("\n");
        sb.append("    matchContents: ").append(toIndentedString(matchContents)).append("\n");
        sb.append("    valueListRef: ").append(toIndentedString(valueListRef)).append("\n");
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
