package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PipelineByTemplateDTOVariables
 */
public class PipelineByTemplateDTOVariables {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private Object name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private Integer sequence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_secret")

    private Boolean isSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_runtime")

    private Boolean isRuntime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_reset")

    private Boolean isReset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_value")

    private String latestValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limits")

    private List<String> limits = null;

    public PipelineByTemplateDTOVariables withName(Object name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 参数名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return name
     */
    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public PipelineByTemplateDTOVariables withSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * **参数解释**： 参数序号，从1开始递增。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return sequence
     */
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public PipelineByTemplateDTOVariables withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 参数类型。 **约束限制**： 不涉及。 **取值范围**： - autoIncrement：自增长参数。 - enum：枚举参数。 - string：字符串参数。 **默认取值**： 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PipelineByTemplateDTOVariables withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 参数值。 **约束限制**： 不涉及。 **取值范围**： 不超过8192字符。 **默认取值**： 不涉及。 
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PipelineByTemplateDTOVariables withIsSecret(Boolean isSecret) {
        this.isSecret = isSecret;
        return this;
    }

    /**
     * **参数解释**： 是否私密参数。 **约束限制**： 不涉及。 **取值范围**： - true：是私密参数。 - false：不是私密参数。 **默认取值**： false。 
     * @return isSecret
     */
    public Boolean getIsSecret() {
        return isSecret;
    }

    public void setIsSecret(Boolean isSecret) {
        this.isSecret = isSecret;
    }

    public PipelineByTemplateDTOVariables withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 参数描述。 **约束限制**： 不涉及。 **取值范围**： 不超过512字符。 **默认取值**： 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PipelineByTemplateDTOVariables withIsRuntime(Boolean isRuntime) {
        this.isRuntime = isRuntime;
        return this;
    }

    /**
     * **参数解释**： 是否运行时设置参数。 **约束限制**： 不涉及。 **取值范围**： - true：是运行时设置参数。 - false：不是运行时设置参数。 **默认取值**： false。 
     * @return isRuntime
     */
    public Boolean getIsRuntime() {
        return isRuntime;
    }

    public void setIsRuntime(Boolean isRuntime) {
        this.isRuntime = isRuntime;
    }

    public PipelineByTemplateDTOVariables withIsReset(Boolean isReset) {
        this.isReset = isReset;
        return this;
    }

    /**
     * **参数解释**： 是否重置。自增长参数被编辑，则使用编辑后的值，否则进行末位数字递增。 **约束限制**： 不涉及。 **取值范围**： - true：使用编辑后的参数值。 - false：使用自增长参数。 **默认取值**： false 
     * @return isReset
     */
    public Boolean getIsReset() {
        return isReset;
    }

    public void setIsReset(Boolean isReset) {
        this.isReset = isReset;
    }

    public PipelineByTemplateDTOVariables withLatestValue(String latestValue) {
        this.latestValue = latestValue;
        return this;
    }

    /**
     * **参数解释**： 最近一次运行的参数值。 **约束限制**： 不涉及。 **取值范围**： 不超过8192字符。 **默认取值**： 不涉及。 
     * @return latestValue
     */
    public String getLatestValue() {
        return latestValue;
    }

    public void setLatestValue(String latestValue) {
        this.latestValue = latestValue;
    }

    public PipelineByTemplateDTOVariables withLimits(List<String> limits) {
        this.limits = limits;
        return this;
    }

    public PipelineByTemplateDTOVariables addLimitsItem(String limitsItem) {
        if (this.limits == null) {
            this.limits = new ArrayList<>();
        }
        this.limits.add(limitsItem);
        return this;
    }

    public PipelineByTemplateDTOVariables withLimits(Consumer<List<String>> limitsSetter) {
        if (this.limits == null) {
            this.limits = new ArrayList<>();
        }
        limitsSetter.accept(this.limits);
        return this;
    }

    /**
     * **参数解释**： 枚举值列表。 **约束限制**： 不涉及。 **取值范围**： 每个枚举值不超过1024字符。 **默认取值**： 不涉及。 
     * @return limits
     */
    public List<String> getLimits() {
        return limits;
    }

    public void setLimits(List<String> limits) {
        this.limits = limits;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipelineByTemplateDTOVariables that = (PipelineByTemplateDTOVariables) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.sequence, that.sequence)
            && Objects.equals(this.type, that.type) && Objects.equals(this.value, that.value)
            && Objects.equals(this.isSecret, that.isSecret) && Objects.equals(this.description, that.description)
            && Objects.equals(this.isRuntime, that.isRuntime) && Objects.equals(this.isReset, that.isReset)
            && Objects.equals(this.latestValue, that.latestValue) && Objects.equals(this.limits, that.limits);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, sequence, type, value, isSecret, description, isRuntime, isReset, latestValue, limits);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineByTemplateDTOVariables {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    isSecret: ").append(toIndentedString(isSecret)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isRuntime: ").append(toIndentedString(isRuntime)).append("\n");
        sb.append("    isReset: ").append(toIndentedString(isReset)).append("\n");
        sb.append("    latestValue: ").append(toIndentedString(latestValue)).append("\n");
        sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
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
