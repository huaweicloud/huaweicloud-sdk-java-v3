package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ProductTopic */
public class ProductTopic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private Integer productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_id")

    private String topicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private Integer permission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_name")

    private String topicName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ProductTopic withProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    /** 归属产品ID minimum: 1 maximum: 999999999999999999
     * 
     * @return productId */
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public ProductTopic withTopicId(String topicId) {
        this.topicId = topicId;
        return this;
    }

    /** 产品主题ID
     * 
     * @return topicId */
    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public ProductTopic withPermission(Integer permission) {
        this.permission = permission;
        return this;
    }

    /** 主题权限 0-发布 1-订阅 minimum: 0 maximum: 10
     * 
     * @return permission */
    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public ProductTopic withTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /** 主题名称
     * 
     * @return topicName */
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public ProductTopic withVersion(String version) {
        this.version = version;
        return this;
    }

    /** 版本号
     * 
     * @return version */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ProductTopic withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductTopic productTopic = (ProductTopic) o;
        return Objects.equals(this.productId, productTopic.productId)
            && Objects.equals(this.topicId, productTopic.topicId)
            && Objects.equals(this.permission, productTopic.permission)
            && Objects.equals(this.topicName, productTopic.topicName)
            && Objects.equals(this.version, productTopic.version)
            && Objects.equals(this.description, productTopic.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, topicId, permission, topicName, version, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductTopic {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
