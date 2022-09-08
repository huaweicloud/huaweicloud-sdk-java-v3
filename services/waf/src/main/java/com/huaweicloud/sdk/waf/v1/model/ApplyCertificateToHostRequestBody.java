package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 绑定证书和域名的请求体，云模式HTTPS域名id（cloud_host_ids）与独享模式HTTPS域名id（premium_host_ids）至少填一项
 */
public class ApplyCertificateToHostRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_host_ids")

    private List<String> cloudHostIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "premium_host_ids")

    private List<String> premiumHostIds = null;

    public ApplyCertificateToHostRequestBody withCloudHostIds(List<String> cloudHostIds) {
        this.cloudHostIds = cloudHostIds;
        return this;
    }

    public ApplyCertificateToHostRequestBody addCloudHostIdsItem(String cloudHostIdsItem) {
        if (this.cloudHostIds == null) {
            this.cloudHostIds = new ArrayList<>();
        }
        this.cloudHostIds.add(cloudHostIdsItem);
        return this;
    }

    public ApplyCertificateToHostRequestBody withCloudHostIds(Consumer<List<String>> cloudHostIdsSetter) {
        if (this.cloudHostIds == null) {
            this.cloudHostIds = new ArrayList<>();
        }
        cloudHostIdsSetter.accept(this.cloudHostIds);
        return this;
    }

    /**
     * 云模式HTTPS域名id，通过查询云模式防护域名列表（ListHost）接口获取
     * @return cloudHostIds
     */
    public List<String> getCloudHostIds() {
        return cloudHostIds;
    }

    public void setCloudHostIds(List<String> cloudHostIds) {
        this.cloudHostIds = cloudHostIds;
    }

    public ApplyCertificateToHostRequestBody withPremiumHostIds(List<String> premiumHostIds) {
        this.premiumHostIds = premiumHostIds;
        return this;
    }

    public ApplyCertificateToHostRequestBody addPremiumHostIdsItem(String premiumHostIdsItem) {
        if (this.premiumHostIds == null) {
            this.premiumHostIds = new ArrayList<>();
        }
        this.premiumHostIds.add(premiumHostIdsItem);
        return this;
    }

    public ApplyCertificateToHostRequestBody withPremiumHostIds(Consumer<List<String>> premiumHostIdsSetter) {
        if (this.premiumHostIds == null) {
            this.premiumHostIds = new ArrayList<>();
        }
        premiumHostIdsSetter.accept(this.premiumHostIds);
        return this;
    }

    /**
     * 独享模式HTTPS域名id，通过独享模式域名列表（ListPremiumHost）接口获取
     * @return premiumHostIds
     */
    public List<String> getPremiumHostIds() {
        return premiumHostIds;
    }

    public void setPremiumHostIds(List<String> premiumHostIds) {
        this.premiumHostIds = premiumHostIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplyCertificateToHostRequestBody applyCertificateToHostRequestBody = (ApplyCertificateToHostRequestBody) o;
        return Objects.equals(this.cloudHostIds, applyCertificateToHostRequestBody.cloudHostIds)
            && Objects.equals(this.premiumHostIds, applyCertificateToHostRequestBody.premiumHostIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudHostIds, premiumHostIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyCertificateToHostRequestBody {\n");
        sb.append("    cloudHostIds: ").append(toIndentedString(cloudHostIds)).append("\n");
        sb.append("    premiumHostIds: ").append(toIndentedString(premiumHostIds)).append("\n");
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
