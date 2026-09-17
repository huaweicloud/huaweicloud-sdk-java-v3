package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ContainerSettingsReqDTO
 */
public class ContainerSettingsReqDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private ContainerConfigsReqDTO configs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_envs")

    private Object customEnvs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_hosts")

    private Object extraHosts;

    public ContainerSettingsReqDTO withConfigs(ContainerConfigsReqDTO configs) {
        this.configs = configs;
        return this;
    }

    public ContainerSettingsReqDTO withConfigs(Consumer<ContainerConfigsReqDTO> configsSetter) {
        if (this.configs == null) {
            this.configs = new ContainerConfigsReqDTO();
            configsSetter.accept(this.configs);
        }

        return this;
    }

    /**
     * Get configs
     * @return configs
     */
    public ContainerConfigsReqDTO getConfigs() {
        return configs;
    }

    public void setConfigs(ContainerConfigsReqDTO configs) {
        this.configs = configs;
    }

    public ContainerSettingsReqDTO withCustomEnvs(Object customEnvs) {
        this.customEnvs = customEnvs;
        return this;
    }

    /**
     * 自定义环境变量
     * @return customEnvs
     */
    public Object getCustomEnvs() {
        return customEnvs;
    }

    public void setCustomEnvs(Object customEnvs) {
        this.customEnvs = customEnvs;
    }

    public ContainerSettingsReqDTO withExtraHosts(Object extraHosts) {
        this.extraHosts = extraHosts;
        return this;
    }

    /**
     * 域名解析配置集合。示例：[{\"hostname\":\"endpoint\",\"ip\":\"127.0.0.1\"}]
     * @return extraHosts
     */
    public Object getExtraHosts() {
        return extraHosts;
    }

    public void setExtraHosts(Object extraHosts) {
        this.extraHosts = extraHosts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContainerSettingsReqDTO that = (ContainerSettingsReqDTO) obj;
        return Objects.equals(this.configs, that.configs) && Objects.equals(this.customEnvs, that.customEnvs)
            && Objects.equals(this.extraHosts, that.extraHosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configs, customEnvs, extraHosts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerSettingsReqDTO {\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
        sb.append("    customEnvs: ").append(toIndentedString(customEnvs)).append("\n");
        sb.append("    extraHosts: ").append(toIndentedString(extraHosts)).append("\n");
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
