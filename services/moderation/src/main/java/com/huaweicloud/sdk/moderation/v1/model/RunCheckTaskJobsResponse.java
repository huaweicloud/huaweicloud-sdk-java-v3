package com.huaweicloud.sdk.moderation.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.moderation.v1.model.CheckTaskJobsItemsBody;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class RunCheckTaskJobsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    private List<CheckTaskJobsItemsBody> result = null;
    
    public RunCheckTaskJobsResponse withResult(List<CheckTaskJobsItemsBody> result) {
        this.result = result;
        return this;
    }

    
    public RunCheckTaskJobsResponse addResultItem(CheckTaskJobsItemsBody resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public RunCheckTaskJobsResponse withResult(Consumer<List<CheckTaskJobsItemsBody>> resultSetter) {
        if(this.result == null ){
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 调用成功时表示调用结果。  调用失败时无此字段。 
     * @return result
     */
    public List<CheckTaskJobsItemsBody> getResult() {
        return result;
    }

    public void setResult(List<CheckTaskJobsItemsBody> result) {
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
        RunCheckTaskJobsResponse runCheckTaskJobsResponse = (RunCheckTaskJobsResponse) o;
        return Objects.equals(this.result, runCheckTaskJobsResponse.result);
    }
    @Override
    public int hashCode() {
        return Objects.hash(result);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunCheckTaskJobsResponse {\n");
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

