package com.huaweicloud.sdk.fgs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.fgs.v2.model.CreateFunctionTriggerRequestBody;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class CreateFunctionTriggerRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="function_urn")
    
    private String functionUrn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CreateFunctionTriggerRequestBody body = null;

    public CreateFunctionTriggerRequest withFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
        return this;
    }

    


    /**
     * Get functionUrn
     * @return functionUrn
     */
    public String getFunctionUrn() {
        return functionUrn;
    }

    public void setFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
    }

    public CreateFunctionTriggerRequest withBody(CreateFunctionTriggerRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateFunctionTriggerRequest withBody(Consumer<CreateFunctionTriggerRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new CreateFunctionTriggerRequestBody();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateFunctionTriggerRequestBody getBody() {
        return body;
    }

    public void setBody(CreateFunctionTriggerRequestBody body) {
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
        CreateFunctionTriggerRequest createFunctionTriggerRequest = (CreateFunctionTriggerRequest) o;
        return Objects.equals(this.functionUrn, createFunctionTriggerRequest.functionUrn) &&
            Objects.equals(this.body, createFunctionTriggerRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(functionUrn, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFunctionTriggerRequest {\n");
            sb.append("    functionUrn: ").append(toIndentedString(functionUrn)).append("\n");
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

