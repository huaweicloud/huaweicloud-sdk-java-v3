package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AddResourceToIteratorRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iterator_uri")

    private String iteratorUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_async")

    private Boolean isAsync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AddResourceInfo body;

    public AddResourceToIteratorRequest withIteratorUri(String iteratorUri) {
        this.iteratorUri = iteratorUri;
        return this;
    }

    /**
     * 迭代uri
     * @return iteratorUri
     */
    public String getIteratorUri() {
        return iteratorUri;
    }

    public void setIteratorUri(String iteratorUri) {
        this.iteratorUri = iteratorUri;
    }

    public AddResourceToIteratorRequest withIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
        return this;
    }

    /**
     * 是否异步返回, 默认false， 超过500时，前端传true
     * @return isAsync
     */
    public Boolean getIsAsync() {
        return isAsync;
    }

    public void setIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
    }

    public AddResourceToIteratorRequest withBody(AddResourceInfo body) {
        this.body = body;
        return this;
    }

    public AddResourceToIteratorRequest withBody(Consumer<AddResourceInfo> bodySetter) {
        if (this.body == null) {
            this.body = new AddResourceInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AddResourceInfo getBody() {
        return body;
    }

    public void setBody(AddResourceInfo body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddResourceToIteratorRequest that = (AddResourceToIteratorRequest) obj;
        return Objects.equals(this.iteratorUri, that.iteratorUri) && Objects.equals(this.isAsync, that.isAsync)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iteratorUri, isAsync, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddResourceToIteratorRequest {\n");
        sb.append("    iteratorUri: ").append(toIndentedString(iteratorUri)).append("\n");
        sb.append("    isAsync: ").append(toIndentedString(isAsync)).append("\n");
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
