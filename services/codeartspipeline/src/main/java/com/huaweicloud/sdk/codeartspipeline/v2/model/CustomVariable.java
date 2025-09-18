package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CustomVariable
 */
public class CustomVariable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_id")

    private String pipelineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

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
    @JsonProperty(value = "limits")

    private List<Object> limits = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_reset")

    private Boolean isReset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_value")

    private String latestValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_value")

    private String runtimeValue;

    public CustomVariable withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * **参数解释**： 流水线ID，可以通过[查询流水线列表](ListPipelines.xml)接口，其中pipelines.pipelineId即为流水线ID。 **约束限制**： 不涉及。 **取值范围**： 32位字符，由数字和字母组成。 **默认取值**： 不涉及。 
     * @return pipelineId
     */
    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public CustomVariable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 自定义参数名称。 **约束限制**： 不涉及。 **取值范围**： 仅支持大小写英文字母、数字、“_”，不超过128个字符。 **默认取值**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomVariable withSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * **参数解释**： 参数序号，从1开始。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return sequence
     */
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public CustomVariable withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 自定义参数类型。 **约束限制**： 不涉及。 **取值范围**： - autoIncrement：自增长参数。 - enum：枚举参数。 - string：字符串参数。 **默认取值**： 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CustomVariable withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 自定义参数默认值。 **约束限制**： 不涉及。 **取值范围**： 最长8192字符。 **默认取值**： 不涉及。 
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public CustomVariable withIsSecret(Boolean isSecret) {
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

    public CustomVariable withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 参数描述。 **约束限制**： 不涉及。 **取值范围**： 最长1024字符。 **默认取值**： 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CustomVariable withIsRuntime(Boolean isRuntime) {
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

    public CustomVariable withLimits(List<Object> limits) {
        this.limits = limits;
        return this;
    }

    public CustomVariable addLimitsItem(Object limitsItem) {
        if (this.limits == null) {
            this.limits = new ArrayList<>();
        }
        this.limits.add(limitsItem);
        return this;
    }

    public CustomVariable withLimits(Consumer<List<Object>> limitsSetter) {
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
    public List<Object> getLimits() {
        return limits;
    }

    public void setLimits(List<Object> limits) {
        this.limits = limits;
    }

    public CustomVariable withIsReset(Boolean isReset) {
        this.isReset = isReset;
        return this;
    }

    /**
     * **参数解释**： 是否重置。自增长参数被编辑，则使用编辑后的值，否则进行末位数字递增。 **约束限制**： 不涉及。 **取值范围**： - true：使用编辑后的参数值。 - false：使用自增长参数。 **默认取值**： false。 
     * @return isReset
     */
    public Boolean getIsReset() {
        return isReset;
    }

    public void setIsReset(Boolean isReset) {
        this.isReset = isReset;
    }

    public CustomVariable withLatestValue(String latestValue) {
        this.latestValue = latestValue;
        return this;
    }

    /**
     * **参数解释**： 最近一次运行的参数值。 **约束限制**： 不涉及。 **取值范围**： 最长8192字符。 **默认取值**： 不涉及。 
     * @return latestValue
     */
    public String getLatestValue() {
        return latestValue;
    }

    public void setLatestValue(String latestValue) {
        this.latestValue = latestValue;
    }

    public CustomVariable withRuntimeValue(String runtimeValue) {
        this.runtimeValue = runtimeValue;
        return this;
    }

    /**
     * **参数解释**： 流水线运行时设置参数的传入值。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return runtimeValue
     */
    public String getRuntimeValue() {
        return runtimeValue;
    }

    public void setRuntimeValue(String runtimeValue) {
        this.runtimeValue = runtimeValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomVariable that = (CustomVariable) obj;
        return Objects.equals(this.pipelineId, that.pipelineId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.sequence, that.sequence) && Objects.equals(this.type, that.type)
            && Objects.equals(this.value, that.value) && Objects.equals(this.isSecret, that.isSecret)
            && Objects.equals(this.description, that.description) && Objects.equals(this.isRuntime, that.isRuntime)
            && Objects.equals(this.limits, that.limits) && Objects.equals(this.isReset, that.isReset)
            && Objects.equals(this.latestValue, that.latestValue)
            && Objects.equals(this.runtimeValue, that.runtimeValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipelineId,
            name,
            sequence,
            type,
            value,
            isSecret,
            description,
            isRuntime,
            limits,
            isReset,
            latestValue,
            runtimeValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomVariable {\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    isSecret: ").append(toIndentedString(isSecret)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isRuntime: ").append(toIndentedString(isRuntime)).append("\n");
        sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
        sb.append("    isReset: ").append(toIndentedString(isReset)).append("\n");
        sb.append("    latestValue: ").append(toIndentedString(latestValue)).append("\n");
        sb.append("    runtimeValue: ").append(toIndentedString(runtimeValue)).append("\n");
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
