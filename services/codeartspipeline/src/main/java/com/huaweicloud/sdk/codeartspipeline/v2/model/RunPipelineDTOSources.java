package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RunPipelineDTOSources
 */
public class RunPipelineDTOSources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private RunPipelineDTOParams params;

    public RunPipelineDTOSources withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 流水线源类型，目前支持“code”、“artifact”等代码源类型。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RunPipelineDTOSources withParams(RunPipelineDTOParams params) {
        this.params = params;
        return this;
    }

    public RunPipelineDTOSources withParams(Consumer<RunPipelineDTOParams> paramsSetter) {
        if (this.params == null) {
            this.params = new RunPipelineDTOParams();
            paramsSetter.accept(this.params);
        }

        return this;
    }

    /**
     * Get params
     * @return params
     */
    public RunPipelineDTOParams getParams() {
        return params;
    }

    public void setParams(RunPipelineDTOParams params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunPipelineDTOSources that = (RunPipelineDTOSources) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunPipelineDTOSources {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
