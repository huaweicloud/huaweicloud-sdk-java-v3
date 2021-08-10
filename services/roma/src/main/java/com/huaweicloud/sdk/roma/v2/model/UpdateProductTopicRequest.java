package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateProductTopicRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private Integer productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_id")

    private Integer topicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateProductTopicRequestBody body;

    public UpdateProductTopicRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateProductTopicRequest withProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    /** 产品ID minimum: 0 maximum: 200376420520689663
     * 
     * @return productId */
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public UpdateProductTopicRequest withTopicId(Integer topicId) {
        this.topicId = topicId;
        return this;
    }

    /** 产品主题ID minimum: 0 maximum: 200376420520689663
     * 
     * @return topicId */
    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public UpdateProductTopicRequest withBody(UpdateProductTopicRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateProductTopicRequest withBody(Consumer<UpdateProductTopicRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateProductTopicRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public UpdateProductTopicRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateProductTopicRequestBody body) {
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
        UpdateProductTopicRequest updateProductTopicRequest = (UpdateProductTopicRequest) o;
        return Objects.equals(this.instanceId, updateProductTopicRequest.instanceId)
            && Objects.equals(this.productId, updateProductTopicRequest.productId)
            && Objects.equals(this.topicId, updateProductTopicRequest.topicId)
            && Objects.equals(this.body, updateProductTopicRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, productId, topicId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProductTopicRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
