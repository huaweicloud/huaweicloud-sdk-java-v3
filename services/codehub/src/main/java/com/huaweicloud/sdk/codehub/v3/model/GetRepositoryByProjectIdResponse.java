package com.huaweicloud.sdk.codehub.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.codehub.v3.model.Error;
import com.huaweicloud.sdk.codehub.v3.model.RepoInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class GetRepositoryByProjectIdResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error")
    
    private Error error = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    private RepoInfo result = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;

    public GetRepositoryByProjectIdResponse withError(Error error) {
        this.error = error;
        return this;
    }

    public GetRepositoryByProjectIdResponse withError(Consumer<Error> errorSetter) {
        if(this.error == null ){
            this.error = new Error();
            errorSetter.accept(this.error);
        }
        
        return this;
    }


    /**
     * Get error
     * @return error
     */
    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public GetRepositoryByProjectIdResponse withResult(RepoInfo result) {
        this.result = result;
        return this;
    }

    public GetRepositoryByProjectIdResponse withResult(Consumer<RepoInfo> resultSetter) {
        if(this.result == null ){
            this.result = new RepoInfo();
            resultSetter.accept(this.result);
        }
        
        return this;
    }


    /**
     * Get result
     * @return result
     */
    public RepoInfo getResult() {
        return result;
    }

    public void setResult(RepoInfo result) {
        this.result = result;
    }

    public GetRepositoryByProjectIdResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 响应状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetRepositoryByProjectIdResponse getRepositoryByProjectIdResponse = (GetRepositoryByProjectIdResponse) o;
        return Objects.equals(this.error, getRepositoryByProjectIdResponse.error) &&
            Objects.equals(this.result, getRepositoryByProjectIdResponse.result) &&
            Objects.equals(this.status, getRepositoryByProjectIdResponse.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(error, result, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetRepositoryByProjectIdResponse {\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

