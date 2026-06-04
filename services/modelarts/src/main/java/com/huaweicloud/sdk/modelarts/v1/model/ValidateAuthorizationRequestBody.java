package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ValidateAuthorizationRequestBody
 */
public class ValidateAuthorizationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requests")

    private List<AuthRequests> requests = null;

    public ValidateAuthorizationRequestBody withRequests(List<AuthRequests> requests) {
        this.requests = requests;
        return this;
    }

    public ValidateAuthorizationRequestBody addRequestsItem(AuthRequests requestsItem) {
        if (this.requests == null) {
            this.requests = new ArrayList<>();
        }
        this.requests.add(requestsItem);
        return this;
    }

    public ValidateAuthorizationRequestBody withRequests(Consumer<List<AuthRequests>> requestsSetter) {
        if (this.requests == null) {
            this.requests = new ArrayList<>();
        }
        requestsSetter.accept(this.requests);
        return this;
    }

    /**
     * **参数解释**：工作空间鉴权请求体。
     * @return requests
     */
    public List<AuthRequests> getRequests() {
        return requests;
    }

    public void setRequests(List<AuthRequests> requests) {
        this.requests = requests;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValidateAuthorizationRequestBody that = (ValidateAuthorizationRequestBody) obj;
        return Objects.equals(this.requests, that.requests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requests);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateAuthorizationRequestBody {\n");
        sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
