package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 评估任务的输入源配置。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class OpsInputSource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offline_config")

    private OpsOfflineConfig offlineConfig;

    public OpsInputSource withOfflineConfig(OpsOfflineConfig offlineConfig) {
        this.offlineConfig = offlineConfig;
        return this;
    }

    public OpsInputSource withOfflineConfig(Consumer<OpsOfflineConfig> offlineConfigSetter) {
        if (this.offlineConfig == null) {
            this.offlineConfig = new OpsOfflineConfig();
            offlineConfigSetter.accept(this.offlineConfig);
        }

        return this;
    }

    /**
     * Get offlineConfig
     * @return offlineConfig
     */
    public OpsOfflineConfig getOfflineConfig() {
        return offlineConfig;
    }

    public void setOfflineConfig(OpsOfflineConfig offlineConfig) {
        this.offlineConfig = offlineConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsInputSource that = (OpsInputSource) obj;
        return Objects.equals(this.offlineConfig, that.offlineConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offlineConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsInputSource {\n");
        sb.append("    offlineConfig: ").append(toIndentedString(offlineConfig)).append("\n");
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
