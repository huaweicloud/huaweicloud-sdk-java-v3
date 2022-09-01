package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDetailOfSubscriptionTargetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_type")

    @JacksonXmlProperty(localName = "provider_type")

    private String providerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    @JacksonXmlProperty(localName = "detail")

    private Object detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transform")

    @JacksonXmlProperty(localName = "transform")

    private SubscriptionTargetInfoTransform transform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    @JacksonXmlProperty(localName = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    @JacksonXmlProperty(localName = "updated_time")

    private String updatedTime;

    public ShowDetailOfSubscriptionTargetResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 订阅目标ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowDetailOfSubscriptionTargetResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 订阅的事件目标名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowDetailOfSubscriptionTargetResponse withProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * 订阅的事件目标的提供方类型
     * @return providerType
     */
    public String getProviderType() {
        return providerType;
    }

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    public ShowDetailOfSubscriptionTargetResponse withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 订阅的事件目标参数列表
     * @return detail
     */
    public Object getDetail() {
        return detail;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public ShowDetailOfSubscriptionTargetResponse withTransform(SubscriptionTargetInfoTransform transform) {
        this.transform = transform;
        return this;
    }

    public ShowDetailOfSubscriptionTargetResponse withTransform(
        Consumer<SubscriptionTargetInfoTransform> transformSetter) {
        if (this.transform == null) {
            this.transform = new SubscriptionTargetInfoTransform();
            transformSetter.accept(this.transform);
        }

        return this;
    }

    /**
     * Get transform
     * @return transform
     */
    public SubscriptionTargetInfoTransform getTransform() {
        return transform;
    }

    public void setTransform(SubscriptionTargetInfoTransform transform) {
        this.transform = transform;
    }

    public ShowDetailOfSubscriptionTargetResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public ShowDetailOfSubscriptionTargetResponse withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 更新时间
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDetailOfSubscriptionTargetResponse showDetailOfSubscriptionTargetResponse =
            (ShowDetailOfSubscriptionTargetResponse) o;
        return Objects.equals(this.id, showDetailOfSubscriptionTargetResponse.id)
            && Objects.equals(this.name, showDetailOfSubscriptionTargetResponse.name)
            && Objects.equals(this.providerType, showDetailOfSubscriptionTargetResponse.providerType)
            && Objects.equals(this.detail, showDetailOfSubscriptionTargetResponse.detail)
            && Objects.equals(this.transform, showDetailOfSubscriptionTargetResponse.transform)
            && Objects.equals(this.createdTime, showDetailOfSubscriptionTargetResponse.createdTime)
            && Objects.equals(this.updatedTime, showDetailOfSubscriptionTargetResponse.updatedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, providerType, detail, transform, createdTime, updatedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDetailOfSubscriptionTargetResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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
