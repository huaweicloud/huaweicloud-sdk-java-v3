package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 流水线自定义参数
 */
public class PipelineVariable {

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

    private List<String> limits = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_reset")

    private Boolean isReset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_value")

    private String latestValue;

    public PipelineVariable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 自定义参数名称。 **取值范围**： 仅支持大小写英文字母、数字、“_”，不超过128个字符。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PipelineVariable withSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * **参数解释**： 序号。 **取值范围**： [1, 2147483647]。 
     * @return sequence
     */
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public PipelineVariable withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 自定义参数的类型。 **取值范围**： 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PipelineVariable withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 自定义参数的默认值。 **取值范围**： 不涉及。 
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PipelineVariable withIsSecret(Boolean isSecret) {
        this.isSecret = isSecret;
        return this;
    }

    /**
     * **参数解释**： 是否为私密参数。 **取值范围**： - true：是私密参数。 - false：不是私密参数。 
     * @return isSecret
     */
    public Boolean getIsSecret() {
        return isSecret;
    }

    public void setIsSecret(Boolean isSecret) {
        this.isSecret = isSecret;
    }

    public PipelineVariable withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 自定义参数描述。 **取值范围**： 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PipelineVariable withIsRuntime(Boolean isRuntime) {
        this.isRuntime = isRuntime;
        return this;
    }

    /**
     * **参数解释**： 是否运行时设置。 **取值范围**： - true：运行时设置。 - false：非运行时设置。 
     * @return isRuntime
     */
    public Boolean getIsRuntime() {
        return isRuntime;
    }

    public void setIsRuntime(Boolean isRuntime) {
        this.isRuntime = isRuntime;
    }

    public PipelineVariable withLimits(List<String> limits) {
        this.limits = limits;
        return this;
    }

    public PipelineVariable addLimitsItem(String limitsItem) {
        if (this.limits == null) {
            this.limits = new ArrayList<>();
        }
        this.limits.add(limitsItem);
        return this;
    }

    public PipelineVariable withLimits(Consumer<List<String>> limitsSetter) {
        if (this.limits == null) {
            this.limits = new ArrayList<>();
        }
        limitsSetter.accept(this.limits);
        return this;
    }

    /**
     * **参数解释**： 限定枚举值列表。 **取值范围**： 不涉及。 
     * @return limits
     */
    public List<String> getLimits() {
        return limits;
    }

    public void setLimits(List<String> limits) {
        this.limits = limits;
    }

    public PipelineVariable withIsReset(Boolean isReset) {
        this.isReset = isReset;
        return this;
    }

    /**
     * **参数解释**： 自增长参数是否被重置。 **取值范围**： - true：被重置。 - false：不被重置。 
     * @return isReset
     */
    public Boolean getIsReset() {
        return isReset;
    }

    public void setIsReset(Boolean isReset) {
        this.isReset = isReset;
    }

    public PipelineVariable withLatestValue(String latestValue) {
        this.latestValue = latestValue;
        return this;
    }

    /**
     * **参数解释**： 自增长参数最新值。 **取值范围**： 不涉及。 
     * @return latestValue
     */
    public String getLatestValue() {
        return latestValue;
    }

    public void setLatestValue(String latestValue) {
        this.latestValue = latestValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipelineVariable that = (PipelineVariable) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.sequence, that.sequence)
            && Objects.equals(this.type, that.type) && Objects.equals(this.value, that.value)
            && Objects.equals(this.isSecret, that.isSecret) && Objects.equals(this.description, that.description)
            && Objects.equals(this.isRuntime, that.isRuntime) && Objects.equals(this.limits, that.limits)
            && Objects.equals(this.isReset, that.isReset) && Objects.equals(this.latestValue, that.latestValue);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, sequence, type, value, isSecret, description, isRuntime, limits, isReset, latestValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineVariable {\n");
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
