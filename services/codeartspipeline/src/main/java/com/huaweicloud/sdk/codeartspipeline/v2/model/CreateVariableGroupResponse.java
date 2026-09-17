package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateVariableGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_variable_group_id")

    private String pipelineVariableGroupId;

    public CreateVariableGroupResponse withPipelineVariableGroupId(String pipelineVariableGroupId) {
        this.pipelineVariableGroupId = pipelineVariableGroupId;
        return this;
    }

    /**
     * **参数解释**： 参数组ID。 **取值范围**： 32位字符，由数字和字母组成。 
     * @return pipelineVariableGroupId
     */
    public String getPipelineVariableGroupId() {
        return pipelineVariableGroupId;
    }

    public void setPipelineVariableGroupId(String pipelineVariableGroupId) {
        this.pipelineVariableGroupId = pipelineVariableGroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVariableGroupResponse that = (CreateVariableGroupResponse) obj;
        return Objects.equals(this.pipelineVariableGroupId, that.pipelineVariableGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipelineVariableGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVariableGroupResponse {\n");
        sb.append("    pipelineVariableGroupId: ").append(toIndentedString(pipelineVariableGroupId)).append("\n");
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
