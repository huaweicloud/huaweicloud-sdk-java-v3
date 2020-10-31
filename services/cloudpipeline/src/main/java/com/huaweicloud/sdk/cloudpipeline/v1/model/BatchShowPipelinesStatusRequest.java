package com.huaweicloud.sdk.cloudpipeline.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchShowPipelinesStatusRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pipeline_ids")
    
    private String pipelineIds;

    public BatchShowPipelinesStatusRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * Get xLanguage
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public BatchShowPipelinesStatusRequest withPipelineIds(String pipelineIds) {
        this.pipelineIds = pipelineIds;
        return this;
    }

    


    /**
     * Get pipelineIds
     * @return pipelineIds
     */
    public String getPipelineIds() {
        return pipelineIds;
    }

    public void setPipelineIds(String pipelineIds) {
        this.pipelineIds = pipelineIds;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchShowPipelinesStatusRequest batchShowPipelinesStatusRequest = (BatchShowPipelinesStatusRequest) o;
        return Objects.equals(this.xLanguage, batchShowPipelinesStatusRequest.xLanguage) &&
            Objects.equals(this.pipelineIds, batchShowPipelinesStatusRequest.pipelineIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, pipelineIds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchShowPipelinesStatusRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    pipelineIds: ").append(toIndentedString(pipelineIds)).append("\n");
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

