package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VoiceTrainingAllocatedResource
 */
public class VoiceTrainingAllocatedResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private ChardMode chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    public VoiceTrainingAllocatedResource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public VoiceTrainingAllocatedResource withChargeMode(ChardMode chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * Get chargeMode
     * @return chargeMode
     */
    public ChardMode getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChardMode chargeMode) {
        this.chargeMode = chargeMode;
    }

    public VoiceTrainingAllocatedResource withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 资源过期时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VoiceTrainingAllocatedResource that = (VoiceTrainingAllocatedResource) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.expireTime, that.expireTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, chargeMode, expireTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VoiceTrainingAllocatedResource {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
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
