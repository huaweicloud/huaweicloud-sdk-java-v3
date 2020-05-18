package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.BatchDeleteScalingConfigsRequestBody;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class BatchDeleteScalingConfigsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private BatchDeleteScalingConfigsRequestBody body = null;

    public BatchDeleteScalingConfigsRequest withBody(BatchDeleteScalingConfigsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchDeleteScalingConfigsRequest withBody(Consumer<BatchDeleteScalingConfigsRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new BatchDeleteScalingConfigsRequestBody();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public BatchDeleteScalingConfigsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchDeleteScalingConfigsRequestBody body) {
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
        BatchDeleteScalingConfigsRequest batchDeleteScalingConfigsRequest = (BatchDeleteScalingConfigsRequest) o;
        return Objects.equals(this.body, batchDeleteScalingConfigsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteScalingConfigsRequest {\n");
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

