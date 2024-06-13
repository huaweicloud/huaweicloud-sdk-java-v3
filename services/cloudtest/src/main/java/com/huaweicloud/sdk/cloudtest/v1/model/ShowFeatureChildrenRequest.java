package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowFeatureChildrenRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_id")

    private String featureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private QueryTestItemTreeInfo body;

    public ShowFeatureChildrenRequest withFeatureId(String featureId) {
        this.featureId = featureId;
        return this;
    }

    /**
     * Get featureId
     * @return featureId
     */
    public String getFeatureId() {
        return featureId;
    }

    public void setFeatureId(String featureId) {
        this.featureId = featureId;
    }

    public ShowFeatureChildrenRequest withBody(QueryTestItemTreeInfo body) {
        this.body = body;
        return this;
    }

    public ShowFeatureChildrenRequest withBody(Consumer<QueryTestItemTreeInfo> bodySetter) {
        if (this.body == null) {
            this.body = new QueryTestItemTreeInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public QueryTestItemTreeInfo getBody() {
        return body;
    }

    public void setBody(QueryTestItemTreeInfo body) {
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
        ShowFeatureChildrenRequest that = (ShowFeatureChildrenRequest) obj;
        return Objects.equals(this.featureId, that.featureId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(featureId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFeatureChildrenRequest {\n");
        sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
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
