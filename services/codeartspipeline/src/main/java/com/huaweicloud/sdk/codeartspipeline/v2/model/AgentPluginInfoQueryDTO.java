package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AgentPluginInfoQueryDTO
 */
public class AgentPluginInfoQueryDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_name")

    private String pluginName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regex_name")

    private String regexName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintainer")

    private String maintainer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_type")

    private List<String> businessType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_attribution")

    private String pluginAttribution;

    public AgentPluginInfoQueryDTO withPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }

    /**
     * 可选的查询条件-插件名
     * @return pluginName
     */
    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public AgentPluginInfoQueryDTO withRegexName(String regexName) {
        this.regexName = regexName;
        return this;
    }

    /**
     * 可选的查询条件-匹配名称
     * @return regexName
     */
    public String getRegexName() {
        return regexName;
    }

    public void setRegexName(String regexName) {
        this.regexName = regexName;
    }

    public AgentPluginInfoQueryDTO withMaintainer(String maintainer) {
        this.maintainer = maintainer;
        return this;
    }

    /**
     * 维护者
     * @return maintainer
     */
    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    public AgentPluginInfoQueryDTO withBusinessType(List<String> businessType) {
        this.businessType = businessType;
        return this;
    }

    public AgentPluginInfoQueryDTO addBusinessTypeItem(String businessTypeItem) {
        if (this.businessType == null) {
            this.businessType = new ArrayList<>();
        }
        this.businessType.add(businessTypeItem);
        return this;
    }

    public AgentPluginInfoQueryDTO withBusinessType(Consumer<List<String>> businessTypeSetter) {
        if (this.businessType == null) {
            this.businessType = new ArrayList<>();
        }
        businessTypeSetter.accept(this.businessType);
        return this;
    }

    /**
     * 业务类型,[Build,Gate,Deploy,Test,Normal]
     * @return businessType
     */
    public List<String> getBusinessType() {
        return businessType;
    }

    public void setBusinessType(List<String> businessType) {
        this.businessType = businessType;
    }

    public AgentPluginInfoQueryDTO withPluginAttribution(String pluginAttribution) {
        this.pluginAttribution = pluginAttribution;
        return this;
    }

    /**
     * 插件属性，official/custom
     * @return pluginAttribution
     */
    public String getPluginAttribution() {
        return pluginAttribution;
    }

    public void setPluginAttribution(String pluginAttribution) {
        this.pluginAttribution = pluginAttribution;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentPluginInfoQueryDTO that = (AgentPluginInfoQueryDTO) obj;
        return Objects.equals(this.pluginName, that.pluginName) && Objects.equals(this.regexName, that.regexName)
            && Objects.equals(this.maintainer, that.maintainer) && Objects.equals(this.businessType, that.businessType)
            && Objects.equals(this.pluginAttribution, that.pluginAttribution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pluginName, regexName, maintainer, businessType, pluginAttribution);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentPluginInfoQueryDTO {\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    regexName: ").append(toIndentedString(regexName)).append("\n");
        sb.append("    maintainer: ").append(toIndentedString(maintainer)).append("\n");
        sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
        sb.append("    pluginAttribution: ").append(toIndentedString(pluginAttribution)).append("\n");
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
