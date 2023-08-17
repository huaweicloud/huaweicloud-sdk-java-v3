package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class GenerateInitialConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "equipment_id")

    private String equipmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_content")

    private String configContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_at")

    private String expireAt;

    public GenerateInitialConfigurationResponse withEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
        return this;
    }

    /**
     * 智能企业网关设备ID
     * @return equipmentId
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public GenerateInitialConfigurationResponse withConfigContent(String configContent) {
        this.configContent = configContent;
        return this;
    }

    /**
     * 初始配置URL
     * @return configContent
     */
    public String getConfigContent() {
        return configContent;
    }

    public void setConfigContent(String configContent) {
        this.configContent = configContent;
    }

    public GenerateInitialConfigurationResponse withExpireAt(String expireAt) {
        this.expireAt = expireAt;
        return this;
    }

    /**
     * URL失效时间
     * @return expireAt
     */
    public String getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(String expireAt) {
        this.expireAt = expireAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GenerateInitialConfigurationResponse that = (GenerateInitialConfigurationResponse) obj;
        return Objects.equals(this.equipmentId, that.equipmentId)
            && Objects.equals(this.configContent, that.configContent) && Objects.equals(this.expireAt, that.expireAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(equipmentId, configContent, expireAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateInitialConfigurationResponse {\n");
        sb.append("    equipmentId: ").append(toIndentedString(equipmentId)).append("\n");
        sb.append("    configContent: ").append(toIndentedString(configContent)).append("\n");
        sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
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
