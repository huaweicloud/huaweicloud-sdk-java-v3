package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 高可用配置请求结构体
 */
public class HaConfigDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_type")

    private String haType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_standby_config")

    private ActiveStandbyConfigDTO activeStandbyConfig;

    public HaConfigDTO withHaType(String haType) {
        this.haType = haType;
        return this;
    }

    /**
     * 节点高可用类型双活或者主备
     * @return haType
     */
    public String getHaType() {
        return haType;
    }

    public void setHaType(String haType) {
        this.haType = haType;
    }

    public HaConfigDTO withActiveStandbyConfig(ActiveStandbyConfigDTO activeStandbyConfig) {
        this.activeStandbyConfig = activeStandbyConfig;
        return this;
    }

    public HaConfigDTO withActiveStandbyConfig(Consumer<ActiveStandbyConfigDTO> activeStandbyConfigSetter) {
        if (this.activeStandbyConfig == null) {
            this.activeStandbyConfig = new ActiveStandbyConfigDTO();
            activeStandbyConfigSetter.accept(this.activeStandbyConfig);
        }

        return this;
    }

    /**
     * Get activeStandbyConfig
     * @return activeStandbyConfig
     */
    public ActiveStandbyConfigDTO getActiveStandbyConfig() {
        return activeStandbyConfig;
    }

    public void setActiveStandbyConfig(ActiveStandbyConfigDTO activeStandbyConfig) {
        this.activeStandbyConfig = activeStandbyConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HaConfigDTO that = (HaConfigDTO) obj;
        return Objects.equals(this.haType, that.haType)
            && Objects.equals(this.activeStandbyConfig, that.activeStandbyConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(haType, activeStandbyConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HaConfigDTO {\n");
        sb.append("    haType: ").append(toIndentedString(haType)).append("\n");
        sb.append("    activeStandbyConfig: ").append(toIndentedString(activeStandbyConfig)).append("\n");
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
