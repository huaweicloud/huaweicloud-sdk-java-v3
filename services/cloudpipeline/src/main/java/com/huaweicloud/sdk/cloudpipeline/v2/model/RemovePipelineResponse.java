package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class RemovePipelineResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_id")

    @JacksonXmlProperty(localName = "pipeline_id")

    private String pipelineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_name")

    @JacksonXmlProperty(localName = "pipeline_name")

    private String pipelineName;

    public RemovePipelineResponse withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * 流水线ID
     * @return pipelineId
     */
    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public RemovePipelineResponse withPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }

    /**
     * 流水线名字
     * @return pipelineName
     */
    public String getPipelineName() {
        return pipelineName;
    }

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RemovePipelineResponse removePipelineResponse = (RemovePipelineResponse) o;
        return Objects.equals(this.pipelineId, removePipelineResponse.pipelineId)
            && Objects.equals(this.pipelineName, removePipelineResponse.pipelineName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipelineId, pipelineName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemovePipelineResponse {\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    pipelineName: ").append(toIndentedString(pipelineName)).append("\n");
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
