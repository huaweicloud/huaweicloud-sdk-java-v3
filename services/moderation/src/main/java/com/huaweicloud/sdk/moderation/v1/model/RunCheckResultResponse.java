package com.huaweicloud.sdk.moderation.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.moderation.v1.model.CheckResultResultBody;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class RunCheckResultResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    private CheckResultResultBody result = null;

    public RunCheckResultResponse withResult(CheckResultResultBody result) {
        this.result = result;
        return this;
    }

    public RunCheckResultResponse withResult(Consumer<CheckResultResultBody> resultSetter) {
        if(this.result == null ){
            this.result = new CheckResultResultBody();
        }
        resultSetter.accept(this.result);
        return this;
    }


    /**
     * Get result
     * @return result
     */
    public CheckResultResultBody getResult() {
        return result;
    }

    public void setResult(CheckResultResultBody result) {
        this.result = result;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunCheckResultResponse runCheckResultResponse = (RunCheckResultResponse) o;
        return Objects.equals(this.result, runCheckResultResponse.result);
    }
    @Override
    public int hashCode() {
        return Objects.hash(result);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunCheckResultResponse {\n");
            sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

