package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ModuleContainerSettingsResDTO
 */
public class ModuleContainerSettingsResDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private ContainerConfigsResDTO configs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_envs")

    private Object customEnvs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_hosts")

    private List<DNSConfigDTO> extraHosts = null;

    public ModuleContainerSettingsResDTO withConfigs(ContainerConfigsResDTO configs) {
        this.configs = configs;
        return this;
    }

    public ModuleContainerSettingsResDTO withConfigs(Consumer<ContainerConfigsResDTO> configsSetter) {
        if (this.configs == null) {
            this.configs = new ContainerConfigsResDTO();
            configsSetter.accept(this.configs);
        }

        return this;
    }

    /**
     * Get configs
     * @return configs
     */
    public ContainerConfigsResDTO getConfigs() {
        return configs;
    }

    public void setConfigs(ContainerConfigsResDTO configs) {
        this.configs = configs;
    }

    public ModuleContainerSettingsResDTO withCustomEnvs(Object customEnvs) {
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

    public ModuleContainerSettingsResDTO withExtraHosts(List<DNSConfigDTO> extraHosts) {
        this.extraHosts = extraHosts;
        return this;
    }

    public ModuleContainerSettingsResDTO addExtraHostsItem(DNSConfigDTO extraHostsItem) {
        if (this.extraHosts == null) {
            this.extraHosts = new ArrayList<>();
        }
        this.extraHosts.add(extraHostsItem);
        return this;
    }

    public ModuleContainerSettingsResDTO withExtraHosts(Consumer<List<DNSConfigDTO>> extraHostsSetter) {
        if (this.extraHosts == null) {
            this.extraHosts = new ArrayList<>();
        }
        extraHostsSetter.accept(this.extraHosts);
        return this;
    }

    /**
     * 域名解析配置集合
     * @return extraHosts
     */
    public List<DNSConfigDTO> getExtraHosts() {
        return extraHosts;
    }

    public void setExtraHosts(List<DNSConfigDTO> extraHosts) {
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
        ModuleContainerSettingsResDTO that = (ModuleContainerSettingsResDTO) obj;
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
        sb.append("class ModuleContainerSettingsResDTO {\n");
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
