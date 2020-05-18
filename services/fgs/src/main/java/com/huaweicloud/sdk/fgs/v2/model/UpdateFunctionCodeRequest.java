package com.huaweicloud.sdk.fgs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.fgs.v2.model.UpdateFunctionCodeRequestBody;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class UpdateFunctionCodeRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="function_urn")
    
    private String functionUrn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateFunctionCodeRequestBody body = null;

    public UpdateFunctionCodeRequest withFunctionUrn(String functionUrn) {
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

    public UpdateFunctionCodeRequest withBody(UpdateFunctionCodeRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateFunctionCodeRequest withBody(Consumer<UpdateFunctionCodeRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateFunctionCodeRequestBody();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateFunctionCodeRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateFunctionCodeRequestBody body) {
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
        UpdateFunctionCodeRequest updateFunctionCodeRequest = (UpdateFunctionCodeRequest) o;
        return Objects.equals(this.functionUrn, updateFunctionCodeRequest.functionUrn) &&
            Objects.equals(this.body, updateFunctionCodeRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(functionUrn, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFunctionCodeRequest {\n");
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

