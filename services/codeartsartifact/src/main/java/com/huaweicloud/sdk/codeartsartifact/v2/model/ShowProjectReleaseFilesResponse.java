package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowProjectReleaseFilesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private StandardResponseResult result;

    public ShowProjectReleaseFilesResponse withResult(StandardResponseResult result) {
        this.result = result;
        return this;
    }

    public ShowProjectReleaseFilesResponse withResult(Consumer<StandardResponseResult> resultSetter) {
        if (this.result == null) {
            this.result = new StandardResponseResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public StandardResponseResult getResult() {
        return result;
    }

    public void setResult(StandardResponseResult result) {
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
        ShowProjectReleaseFilesResponse showProjectReleaseFilesResponse = (ShowProjectReleaseFilesResponse) o;
        return Objects.equals(this.result, showProjectReleaseFilesResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectReleaseFilesResponse {\n");
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
