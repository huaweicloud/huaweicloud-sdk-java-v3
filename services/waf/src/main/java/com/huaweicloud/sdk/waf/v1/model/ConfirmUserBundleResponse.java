package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ConfirmUserBundleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private Object host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "premium_type")

    private Integer premiumType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "premium_name")

    private String premiumName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "premium_host")

    private Object premiumHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private Object options;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    private Object rule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade")

    private Object upgrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature")

    private Object feature;

    public ConfirmUserBundleResponse withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 云模式套餐类型 **取值范围：** - -2：冻结 - -1：无 - 2：云模式 标准版（包周期） - 3：云模式 专业版（包周期） - 4：云模式 企业版（包周期） - 7：云模式 入门版（包周期） - 22：云模式（按需计费）
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public ConfirmUserBundleResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 云模式套餐名称 **取值范围：** - None：无 - Basic：云模式 入门版（包周期） - Professional：云模式 标准版（包周期） - Enterprise：云模式 专业版（包周期） - Ultimate: 云模式 企业版（包周期） - cloud.waf.postpaid：云模式（按需计费）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConfirmUserBundleResponse withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * **参数解释：** 云模式支持的域名配额相关信息 **取值范围：** 不涉及
     * @return host
     */
    public Object getHost() {
        return host;
    }

    public void setHost(Object host) {
        this.host = host;
    }

    public ConfirmUserBundleResponse withPremiumType(Integer premiumType) {
        this.premiumType = premiumType;
        return this;
    }

    /**
     * **参数解释：** 独享套餐类型 **取值范围：** - -2：冻结 - -1：无 - 12：独享模式 版本规格为WI-100 - 13：独享模式 版本规格为WI-500
     * @return premiumType
     */
    public Integer getPremiumType() {
        return premiumType;
    }

    public void setPremiumType(Integer premiumType) {
        this.premiumType = premiumType;
    }

    public ConfirmUserBundleResponse withPremiumName(String premiumName) {
        this.premiumName = premiumName;
        return this;
    }

    /**
     * **参数解释：** 独享模式套餐名称 **取值范围：** - None：无 - Instance.professional：独享模式 版本规格为WI-100 - Instance.enterprise：独享模式 版本规格为WI-500
     * @return premiumName
     */
    public String getPremiumName() {
        return premiumName;
    }

    public void setPremiumName(String premiumName) {
        this.premiumName = premiumName;
    }

    public ConfirmUserBundleResponse withPremiumHost(Object premiumHost) {
        this.premiumHost = premiumHost;
        return this;
    }

    /**
     * **参数解释：** 独享支持的域名配额相关信息 **取值范围：** 不涉及
     * @return premiumHost
     */
    public Object getPremiumHost() {
        return premiumHost;
    }

    public void setPremiumHost(Object premiumHost) {
        this.premiumHost = premiumHost;
    }

    public ConfirmUserBundleResponse withOptions(Object options) {
        this.options = options;
        return this;
    }

    /**
     * **参数解释：** 支持的策略相关信息 **取值范围：** 不涉及
     * @return options
     */
    public Object getOptions() {
        return options;
    }

    public void setOptions(Object options) {
        this.options = options;
    }

    public ConfirmUserBundleResponse withRule(Object rule) {
        this.rule = rule;
        return this;
    }

    /**
     * **参数解释：** 支持的规则配额相关信息 **取值范围：** 不涉及
     * @return rule
     */
    public Object getRule() {
        return rule;
    }

    public void setRule(Object rule) {
        this.rule = rule;
    }

    public ConfirmUserBundleResponse withUpgrade(Object upgrade) {
        this.upgrade = upgrade;
        return this;
    }

    /**
     * **参数解释：** 不同版本支持的规则信息 **取值范围：** 不涉及
     * @return upgrade
     */
    public Object getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(Object upgrade) {
        this.upgrade = upgrade;
    }

    public ConfirmUserBundleResponse withFeature(Object feature) {
        this.feature = feature;
        return this;
    }

    /**
     * **参数解释：** 支持的特性 **取值范围：** 不涉及
     * @return feature
     */
    public Object getFeature() {
        return feature;
    }

    public void setFeature(Object feature) {
        this.feature = feature;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfirmUserBundleResponse that = (ConfirmUserBundleResponse) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.name, that.name)
            && Objects.equals(this.host, that.host) && Objects.equals(this.premiumType, that.premiumType)
            && Objects.equals(this.premiumName, that.premiumName) && Objects.equals(this.premiumHost, that.premiumHost)
            && Objects.equals(this.options, that.options) && Objects.equals(this.rule, that.rule)
            && Objects.equals(this.upgrade, that.upgrade) && Objects.equals(this.feature, that.feature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, host, premiumType, premiumName, premiumHost, options, rule, upgrade, feature);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmUserBundleResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    premiumType: ").append(toIndentedString(premiumType)).append("\n");
        sb.append("    premiumName: ").append(toIndentedString(premiumName)).append("\n");
        sb.append("    premiumHost: ").append(toIndentedString(premiumHost)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    upgrade: ").append(toIndentedString(upgrade)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
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
