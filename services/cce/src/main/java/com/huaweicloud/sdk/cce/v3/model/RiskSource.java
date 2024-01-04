package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 风险项来源
 */
public class RiskSource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configurationRisks")

    private List<ConfigurationRisks> configurationRisks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deprecatedAPIRisks")

    private List<DeprecatedAPIRisks> deprecatedAPIRisks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeRisks")

    private List<NodeRisks> nodeRisks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addonRisks")

    private List<AddonRisks> addonRisks = null;

    public RiskSource withConfigurationRisks(List<ConfigurationRisks> configurationRisks) {
        this.configurationRisks = configurationRisks;
        return this;
    }

    public RiskSource addConfigurationRisksItem(ConfigurationRisks configurationRisksItem) {
        if (this.configurationRisks == null) {
            this.configurationRisks = new ArrayList<>();
        }
        this.configurationRisks.add(configurationRisksItem);
        return this;
    }

    public RiskSource withConfigurationRisks(Consumer<List<ConfigurationRisks>> configurationRisksSetter) {
        if (this.configurationRisks == null) {
            this.configurationRisks = new ArrayList<>();
        }
        configurationRisksSetter.accept(this.configurationRisks);
        return this;
    }

    /**
     * 配置风险项
     * @return configurationRisks
     */
    public List<ConfigurationRisks> getConfigurationRisks() {
        return configurationRisks;
    }

    public void setConfigurationRisks(List<ConfigurationRisks> configurationRisks) {
        this.configurationRisks = configurationRisks;
    }

    public RiskSource withDeprecatedAPIRisks(List<DeprecatedAPIRisks> deprecatedAPIRisks) {
        this.deprecatedAPIRisks = deprecatedAPIRisks;
        return this;
    }

    public RiskSource addDeprecatedAPIRisksItem(DeprecatedAPIRisks deprecatedAPIRisksItem) {
        if (this.deprecatedAPIRisks == null) {
            this.deprecatedAPIRisks = new ArrayList<>();
        }
        this.deprecatedAPIRisks.add(deprecatedAPIRisksItem);
        return this;
    }

    public RiskSource withDeprecatedAPIRisks(Consumer<List<DeprecatedAPIRisks>> deprecatedAPIRisksSetter) {
        if (this.deprecatedAPIRisks == null) {
            this.deprecatedAPIRisks = new ArrayList<>();
        }
        deprecatedAPIRisksSetter.accept(this.deprecatedAPIRisks);
        return this;
    }

    /**
     * 废弃API风险
     * @return deprecatedAPIRisks
     */
    public List<DeprecatedAPIRisks> getDeprecatedAPIRisks() {
        return deprecatedAPIRisks;
    }

    public void setDeprecatedAPIRisks(List<DeprecatedAPIRisks> deprecatedAPIRisks) {
        this.deprecatedAPIRisks = deprecatedAPIRisks;
    }

    public RiskSource withNodeRisks(List<NodeRisks> nodeRisks) {
        this.nodeRisks = nodeRisks;
        return this;
    }

    public RiskSource addNodeRisksItem(NodeRisks nodeRisksItem) {
        if (this.nodeRisks == null) {
            this.nodeRisks = new ArrayList<>();
        }
        this.nodeRisks.add(nodeRisksItem);
        return this;
    }

    public RiskSource withNodeRisks(Consumer<List<NodeRisks>> nodeRisksSetter) {
        if (this.nodeRisks == null) {
            this.nodeRisks = new ArrayList<>();
        }
        nodeRisksSetter.accept(this.nodeRisks);
        return this;
    }

    /**
     * 节点风险
     * @return nodeRisks
     */
    public List<NodeRisks> getNodeRisks() {
        return nodeRisks;
    }

    public void setNodeRisks(List<NodeRisks> nodeRisks) {
        this.nodeRisks = nodeRisks;
    }

    public RiskSource withAddonRisks(List<AddonRisks> addonRisks) {
        this.addonRisks = addonRisks;
        return this;
    }

    public RiskSource addAddonRisksItem(AddonRisks addonRisksItem) {
        if (this.addonRisks == null) {
            this.addonRisks = new ArrayList<>();
        }
        this.addonRisks.add(addonRisksItem);
        return this;
    }

    public RiskSource withAddonRisks(Consumer<List<AddonRisks>> addonRisksSetter) {
        if (this.addonRisks == null) {
            this.addonRisks = new ArrayList<>();
        }
        addonRisksSetter.accept(this.addonRisks);
        return this;
    }

    /**
     * 插件风险
     * @return addonRisks
     */
    public List<AddonRisks> getAddonRisks() {
        return addonRisks;
    }

    public void setAddonRisks(List<AddonRisks> addonRisks) {
        this.addonRisks = addonRisks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RiskSource that = (RiskSource) obj;
        return Objects.equals(this.configurationRisks, that.configurationRisks)
            && Objects.equals(this.deprecatedAPIRisks, that.deprecatedAPIRisks)
            && Objects.equals(this.nodeRisks, that.nodeRisks) && Objects.equals(this.addonRisks, that.addonRisks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurationRisks, deprecatedAPIRisks, nodeRisks, addonRisks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RiskSource {\n");
        sb.append("    configurationRisks: ").append(toIndentedString(configurationRisks)).append("\n");
        sb.append("    deprecatedAPIRisks: ").append(toIndentedString(deprecatedAPIRisks)).append("\n");
        sb.append("    nodeRisks: ").append(toIndentedString(nodeRisks)).append("\n");
        sb.append("    addonRisks: ").append(toIndentedString(addonRisks)).append("\n");
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
