package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 需要复制的原域名配置。
 */
public class BatchCopyConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_domain")

    private String targetDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_domain")

    private String sourceDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_list")

    private List<String> configList = null;

    public BatchCopyConfigs withTargetDomain(String targetDomain) {
        this.targetDomain = targetDomain;
        return this;
    }

    /**
     * 目标域名列表,多个域名以逗号（半角）分隔,域名数最大10个。
     * @return targetDomain
     */
    public String getTargetDomain() {
        return targetDomain;
    }

    public void setTargetDomain(String targetDomain) {
        this.targetDomain = targetDomain;
    }

    public BatchCopyConfigs withSourceDomain(String sourceDomain) {
        this.sourceDomain = sourceDomain;
        return this;
    }

    /**
     * 原域名。
     * @return sourceDomain
     */
    public String getSourceDomain() {
        return sourceDomain;
    }

    public void setSourceDomain(String sourceDomain) {
        this.sourceDomain = sourceDomain;
    }

    public BatchCopyConfigs withConfigList(List<String> configList) {
        this.configList = configList;
        return this;
    }

    public BatchCopyConfigs addConfigListItem(String configListItem) {
        if (this.configList == null) {
            this.configList = new ArrayList<>();
        }
        this.configList.add(configListItem);
        return this;
    }

    public BatchCopyConfigs withConfigList(Consumer<List<String>> configListSetter) {
        if (this.configList == null) {
            this.configList = new ArrayList<>();
        }
        configListSetter.accept(this.configList);
        return this;
    }

    /**
     * 需要复制的域名配置项,多个配置项以逗号（半角）分隔，支持复制的配置项： - originRequestHeader（回源请求头） - httpResponseHeader（HTTP header配置） - cacheUrlParamsConfig（URL参数） - urlAuth（URL鉴权配置） - userAgentBlackAndWhiteList（User-Agent黑白名单） - ipv6Accelerate（IPv6开关） - rangeStatus（Range回源） - cacheRules（缓存规则） - followOrigin（缓存遵循源站） - privateBucketRetrieval（私有桶回源） - follow302Status（回源跟随） - sources（源站配置） - compress（智能压缩） - referer（防盗链） - ipBlackAndWhiteList（IP黑白名单）
     * @return configList
     */
    public List<String> getConfigList() {
        return configList;
    }

    public void setConfigList(List<String> configList) {
        this.configList = configList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCopyConfigs that = (BatchCopyConfigs) obj;
        return Objects.equals(this.targetDomain, that.targetDomain)
            && Objects.equals(this.sourceDomain, that.sourceDomain) && Objects.equals(this.configList, that.configList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetDomain, sourceDomain, configList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCopyConfigs {\n");
        sb.append("    targetDomain: ").append(toIndentedString(targetDomain)).append("\n");
        sb.append("    sourceDomain: ").append(toIndentedString(sourceDomain)).append("\n");
        sb.append("    configList: ").append(toIndentedString(configList)).append("\n");
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
