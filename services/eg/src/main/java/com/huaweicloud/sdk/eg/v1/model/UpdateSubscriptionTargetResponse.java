package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateSubscriptionTargetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_type")

    private String providerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private Object detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transform")

    private SubscriptionTargetInfoTransform transform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private String updatedTime;

    public UpdateSubscriptionTargetResponse withId(String id) {
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

    public UpdateSubscriptionTargetResponse withName(String name) {
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

    public UpdateSubscriptionTargetResponse withProviderType(String providerType) {
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

    public UpdateSubscriptionTargetResponse withDetail(Object detail) {
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

    public UpdateSubscriptionTargetResponse withTransform(SubscriptionTargetInfoTransform transform) {
        this.transform = transform;
        return this;
    }

    public UpdateSubscriptionTargetResponse withTransform(Consumer<SubscriptionTargetInfoTransform> transformSetter) {
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

    public UpdateSubscriptionTargetResponse withCreatedTime(String createdTime) {
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

    public UpdateSubscriptionTargetResponse withUpdatedTime(String updatedTime) {
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
        UpdateSubscriptionTargetResponse updateSubscriptionTargetResponse = (UpdateSubscriptionTargetResponse) o;
        return Objects.equals(this.id, updateSubscriptionTargetResponse.id)
            && Objects.equals(this.name, updateSubscriptionTargetResponse.name)
            && Objects.equals(this.providerType, updateSubscriptionTargetResponse.providerType)
            && Objects.equals(this.detail, updateSubscriptionTargetResponse.detail)
            && Objects.equals(this.transform, updateSubscriptionTargetResponse.transform)
            && Objects.equals(this.createdTime, updateSubscriptionTargetResponse.createdTime)
            && Objects.equals(this.updatedTime, updateSubscriptionTargetResponse.updatedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, providerType, detail, transform, createdTime, updatedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSubscriptionTargetResponse {\n");
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
