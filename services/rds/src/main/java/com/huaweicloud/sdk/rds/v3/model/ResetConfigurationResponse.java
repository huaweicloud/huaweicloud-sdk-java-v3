package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ResetConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_name")

    private String configName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_restart")

    private Boolean needRestart;

    public ResetConfigurationResponse withConfigName(String configName) {
        this.configName = configName;
        return this;
    }

    /**
     * **参数解释**：  参数组模板名称。  **约束限制**：  不涉及。
     * @return configName
     */
    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public ResetConfigurationResponse withNeedRestart(Boolean needRestart) {
        this.needRestart = needRestart;
        return this;
    }

    /**
     * **参数解释**：  是否涉及重启。（当前该字段不使用，默认为false）  **约束限制**：  不涉及。
     * @return needRestart
     */
    public Boolean getNeedRestart() {
        return needRestart;
    }

    public void setNeedRestart(Boolean needRestart) {
        this.needRestart = needRestart;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetConfigurationResponse that = (ResetConfigurationResponse) obj;
        return Objects.equals(this.configName, that.configName) && Objects.equals(this.needRestart, that.needRestart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configName, needRestart);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetConfigurationResponse {\n");
        sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
        sb.append("    needRestart: ").append(toIndentedString(needRestart)).append("\n");
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
