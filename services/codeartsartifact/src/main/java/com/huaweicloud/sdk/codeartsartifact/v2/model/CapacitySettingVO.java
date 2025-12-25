package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CapacitySettingVO
 */
public class CapacitySettingVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity_threshold")

    private Integer capacityThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_type")

    private Integer messageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_mail_enabled")

    private Integer isMailEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_sms_enabled")

    private Integer isSmsEnabled;

    public CapacitySettingVO withCapacityThreshold(Integer capacityThreshold) {
        this.capacityThreshold = capacityThreshold;
        return this;
    }

    /**
     * **参数解释**: 容量阈值。 **取值范围**: 不涉及。 
     * @return capacityThreshold
     */
    public Integer getCapacityThreshold() {
        return capacityThreshold;
    }

    public void setCapacityThreshold(Integer capacityThreshold) {
        this.capacityThreshold = capacityThreshold;
    }

    public CapacitySettingVO withMessageType(Integer messageType) {
        this.messageType = messageType;
        return this;
    }

    /**
     * **参数解释**: 消息类型。 **取值范围**: 不涉及。 
     * @return messageType
     */
    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public CapacitySettingVO withIsMailEnabled(Integer isMailEnabled) {
        this.isMailEnabled = isMailEnabled;
        return this;
    }

    /**
     * **参数解释**: 是否启用邮件。 **取值范围**: 不涉及。 
     * @return isMailEnabled
     */
    public Integer getIsMailEnabled() {
        return isMailEnabled;
    }

    public void setIsMailEnabled(Integer isMailEnabled) {
        this.isMailEnabled = isMailEnabled;
    }

    public CapacitySettingVO withIsSmsEnabled(Integer isSmsEnabled) {
        this.isSmsEnabled = isSmsEnabled;
        return this;
    }

    /**
     * **参数解释**: 是否启用短信。 **取值范围**: 不涉及。 
     * @return isSmsEnabled
     */
    public Integer getIsSmsEnabled() {
        return isSmsEnabled;
    }

    public void setIsSmsEnabled(Integer isSmsEnabled) {
        this.isSmsEnabled = isSmsEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CapacitySettingVO that = (CapacitySettingVO) obj;
        return Objects.equals(this.capacityThreshold, that.capacityThreshold)
            && Objects.equals(this.messageType, that.messageType)
            && Objects.equals(this.isMailEnabled, that.isMailEnabled)
            && Objects.equals(this.isSmsEnabled, that.isSmsEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacityThreshold, messageType, isMailEnabled, isSmsEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CapacitySettingVO {\n");
        sb.append("    capacityThreshold: ").append(toIndentedString(capacityThreshold)).append("\n");
        sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
        sb.append("    isMailEnabled: ").append(toIndentedString(isMailEnabled)).append("\n");
        sb.append("    isSmsEnabled: ").append(toIndentedString(isSmsEnabled)).append("\n");
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
