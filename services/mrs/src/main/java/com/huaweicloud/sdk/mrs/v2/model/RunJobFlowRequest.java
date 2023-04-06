package com.huaweicloud.sdk.mrs.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v2.model.RunJobFlowCommand;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class RunJobFlowRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private RunJobFlowCommand body;

    public RunJobFlowRequest withBody(RunJobFlowCommand body) {
        this.body = body;
        return this;
    }

    public RunJobFlowRequest withBody(Consumer<RunJobFlowCommand> bodySetter) {
        if(this.body == null ){
            this.body = new RunJobFlowCommand();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public RunJobFlowCommand getBody() {
        return body;
    }

    public void setBody(RunJobFlowCommand body) {
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
        RunJobFlowRequest runJobFlowRequest = (RunJobFlowRequest) o;
        return Objects.equals(this.body, runJobFlowRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunJobFlowRequest {\n");
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

