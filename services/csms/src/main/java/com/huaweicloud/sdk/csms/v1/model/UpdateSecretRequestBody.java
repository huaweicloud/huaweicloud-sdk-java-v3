package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新凭据对象的元数据信息请求体
 */
public class UpdateSecretRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_key_id")

    private String kmsKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_rotation")

    private Boolean autoRotation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotation_period")

    private String rotationPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_subscriptions")

    private List<String> eventSubscriptions = null;

    public UpdateSecretRequestBody withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * 用于加密保护凭据值的KMS主密钥ID。更新凭据的主密钥后，仅新创建的凭据版本使用更新后的主密钥ID加密，之前的凭据版本依旧使用之前的主密钥ID解密。 
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public UpdateSecretRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 凭据的描述信息。 约束：2048字节。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateSecretRequestBody withAutoRotation(Boolean autoRotation) {
        this.autoRotation = autoRotation;
        return this;
    }

    /**
     * 自动轮转  取值：true 开启 false 关 
     * @return autoRotation
     */
    public Boolean getAutoRotation() {
        return autoRotation;
    }

    public void setAutoRotation(Boolean autoRotation) {
        this.autoRotation = autoRotation;
    }

    public UpdateSecretRequestBody withRotationPeriod(String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
        return this;
    }

    /**
     * 轮转周期  约束：6小时-8,760小时 （365天）  类型：Integer[unit] ，Integer表示时间长度 。unit表示时间单位，d（天）、h（小时）、m（分钟）、s（秒）。例如 1d 表示一天，24h也表示一天  说明：当开启自动轮转时，必须填写该值 
     * @return rotationPeriod
     */
    public String getRotationPeriod() {
        return rotationPeriod;
    }

    public void setRotationPeriod(String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    public UpdateSecretRequestBody withEventSubscriptions(List<String> eventSubscriptions) {
        this.eventSubscriptions = eventSubscriptions;
        return this;
    }

    public UpdateSecretRequestBody addEventSubscriptionsItem(String eventSubscriptionsItem) {
        if (this.eventSubscriptions == null) {
            this.eventSubscriptions = new ArrayList<>();
        }
        this.eventSubscriptions.add(eventSubscriptionsItem);
        return this;
    }

    public UpdateSecretRequestBody withEventSubscriptions(Consumer<List<String>> eventSubscriptionsSetter) {
        if (this.eventSubscriptions == null) {
            this.eventSubscriptions = new ArrayList<>();
        }
        eventSubscriptionsSetter.accept(this.eventSubscriptions);
        return this;
    }

    /**
     * 凭据订阅的事件列表，当前最大可订阅一个事件。当事件包含的基础事件触发时，通知消息将发送到事件对应的通知主题。 
     * @return eventSubscriptions
     */
    public List<String> getEventSubscriptions() {
        return eventSubscriptions;
    }

    public void setEventSubscriptions(List<String> eventSubscriptions) {
        this.eventSubscriptions = eventSubscriptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSecretRequestBody that = (UpdateSecretRequestBody) obj;
        return Objects.equals(this.kmsKeyId, that.kmsKeyId) && Objects.equals(this.description, that.description)
            && Objects.equals(this.autoRotation, that.autoRotation)
            && Objects.equals(this.rotationPeriod, that.rotationPeriod)
            && Objects.equals(this.eventSubscriptions, that.eventSubscriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kmsKeyId, description, autoRotation, rotationPeriod, eventSubscriptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecretRequestBody {\n");
        sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    autoRotation: ").append(toIndentedString(autoRotation)).append("\n");
        sb.append("    rotationPeriod: ").append(toIndentedString(rotationPeriod)).append("\n");
        sb.append("    eventSubscriptions: ").append(toIndentedString(eventSubscriptions)).append("\n");
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
