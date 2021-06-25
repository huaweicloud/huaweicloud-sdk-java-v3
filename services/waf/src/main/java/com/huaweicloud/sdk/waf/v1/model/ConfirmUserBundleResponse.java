package com.huaweicloud.sdk.waf.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ConfirmUserBundleResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private Integer type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host")
    
    private Object host;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="premium_type")
    
    private Integer premiumType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="premium_name")
    
    private String premiumName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="premium_host")
    
    private Object premiumHost;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="options")
    
    private Object options;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rule")
    
    private Object rule;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="upgrade")
    
    private Object upgrade;

    public ConfirmUserBundleResponse withType(Integer type) {
        this.type = type;
        return this;
    }

    


    /**
     * 云模式套餐类型
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
     * 云模式套餐名称
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
     * 云模式支持的域名配额相关信息
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
     * 独享套餐类型
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
     * 独享套餐名称
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
     * 独享支持的域名配额相关信息
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
     * 支持的策略相关信息
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
     * 支持的规则配额相关信息
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
     * 不同版本支持的规则信息
     * @return upgrade
     */
    public Object getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(Object upgrade) {
        this.upgrade = upgrade;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfirmUserBundleResponse confirmUserBundleResponse = (ConfirmUserBundleResponse) o;
        return Objects.equals(this.type, confirmUserBundleResponse.type) &&
            Objects.equals(this.name, confirmUserBundleResponse.name) &&
            Objects.equals(this.host, confirmUserBundleResponse.host) &&
            Objects.equals(this.premiumType, confirmUserBundleResponse.premiumType) &&
            Objects.equals(this.premiumName, confirmUserBundleResponse.premiumName) &&
            Objects.equals(this.premiumHost, confirmUserBundleResponse.premiumHost) &&
            Objects.equals(this.options, confirmUserBundleResponse.options) &&
            Objects.equals(this.rule, confirmUserBundleResponse.rule) &&
            Objects.equals(this.upgrade, confirmUserBundleResponse.upgrade);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, name, host, premiumType, premiumName, premiumHost, options, rule, upgrade);
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

