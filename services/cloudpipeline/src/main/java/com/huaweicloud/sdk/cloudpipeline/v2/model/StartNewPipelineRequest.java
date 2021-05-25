package com.huaweicloud.sdk.cloudpipeline.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudpipeline.v2.model.StartPipelineParameters;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class StartNewPipelineRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pipeline_id")
    
    private String pipelineId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private StartPipelineParameters body;

    public StartNewPipelineRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * 语言类型 中文:zh-cn 英文:en-us，默认en-us
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

    

    public StartNewPipelineRequest withPipelineId(String pipelineId) {
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

    

    public StartNewPipelineRequest withBody(StartPipelineParameters body) {
        this.body = body;
        return this;
    }

    public StartNewPipelineRequest withBody(Consumer<StartPipelineParameters> bodySetter) {
        if(this.body == null ){
            this.body = new StartPipelineParameters();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public StartPipelineParameters getBody() {
        return body;
    }

    public void setBody(StartPipelineParameters body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartNewPipelineRequest startNewPipelineRequest = (StartNewPipelineRequest) o;
        return Objects.equals(this.xLanguage, startNewPipelineRequest.xLanguage) &&
            Objects.equals(this.pipelineId, startNewPipelineRequest.pipelineId) &&
            Objects.equals(this.body, startNewPipelineRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, pipelineId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartNewPipelineRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

