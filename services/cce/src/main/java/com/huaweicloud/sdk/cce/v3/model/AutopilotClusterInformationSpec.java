package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class AutopilotClusterInformationSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customSan")

    private List<String> customSan = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eniNetwork")

    private AutopilotEniNetworkUpdate eniNetwork;

    public AutopilotClusterInformationSpec withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 集群的描述信息。  1. 字符取值范围[0,200]。不包含~$%^&*<>[]{}()'\"#\\等特殊字符。 2. 仅运行（Available）的集群允许修改。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AutopilotClusterInformationSpec withCustomSan(List<String> customSan) {
        this.customSan = customSan;
        return this;
    }

    public AutopilotClusterInformationSpec addCustomSanItem(String customSanItem) {
        if (this.customSan == null) {
            this.customSan = new ArrayList<>();
        }
        this.customSan.add(customSanItem);
        return this;
    }

    public AutopilotClusterInformationSpec withCustomSan(Consumer<List<String>> customSanSetter) {
        if (this.customSan == null) {
            this.customSan = new ArrayList<>();
        }
        customSanSetter.accept(this.customSan);
        return this;
    }

    /**
     * 集群的API Server服务端证书中的自定义SAN（Subject Alternative Name）字段，遵从SSL标准X509定义的格式规范。  1. 不允许出现同名重复。 2. 格式符合IP和域名格式。  示例: ``` SAN 1: DNS Name=example.com SAN 2: DNS Name=www.example.com SAN 3: DNS Name=example.net SAN 4: IP Address=93.184.216.34 ```
     * @return customSan
     */
    public List<String> getCustomSan() {
        return customSan;
    }

    public void setCustomSan(List<String> customSan) {
        this.customSan = customSan;
    }

    public AutopilotClusterInformationSpec withEniNetwork(AutopilotEniNetworkUpdate eniNetwork) {
        this.eniNetwork = eniNetwork;
        return this;
    }

    public AutopilotClusterInformationSpec withEniNetwork(Consumer<AutopilotEniNetworkUpdate> eniNetworkSetter) {
        if (this.eniNetwork == null) {
            this.eniNetwork = new AutopilotEniNetworkUpdate();
            eniNetworkSetter.accept(this.eniNetwork);
        }

        return this;
    }

    /**
     * Get eniNetwork
     * @return eniNetwork
     */
    public AutopilotEniNetworkUpdate getEniNetwork() {
        return eniNetwork;
    }

    public void setEniNetwork(AutopilotEniNetworkUpdate eniNetwork) {
        this.eniNetwork = eniNetwork;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutopilotClusterInformationSpec that = (AutopilotClusterInformationSpec) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.customSan, that.customSan)
            && Objects.equals(this.eniNetwork, that.eniNetwork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, customSan, eniNetwork);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutopilotClusterInformationSpec {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    customSan: ").append(toIndentedString(customSan)).append("\n");
        sb.append("    eniNetwork: ").append(toIndentedString(eniNetwork)).append("\n");
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
