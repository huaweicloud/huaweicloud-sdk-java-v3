package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 购买包周期云模式waf请求参数
 */
public class CreatePrepaidCloudWafRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private Boolean isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_renew")

    private Boolean isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waf_product_info")

    private WafProductInfo wafProductInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_expack_product_info")

    private ExpackProductInfo domainExpackProductInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_expack_product_info")

    private ExpackProductInfo bandwidthExpackProductInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_expack_product_info")

    private ExpackProductInfo ruleExpackProductInfo;

    public CreatePrepaidCloudWafRequestBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreatePrepaidCloudWafRequestBody withIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 是否自动支付    - false: 否（需要客户手动去支付）   - true：是（自动支付）
     * @return isAutoPay
     */
    public Boolean getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public CreatePrepaidCloudWafRequestBody withIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 是否自动续订   -  true：自动续订   - false：不自动续订
     * @return isAutoRenew
     */
    public Boolean getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public CreatePrepaidCloudWafRequestBody withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * region Id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public CreatePrepaidCloudWafRequestBody withWafProductInfo(WafProductInfo wafProductInfo) {
        this.wafProductInfo = wafProductInfo;
        return this;
    }

    public CreatePrepaidCloudWafRequestBody withWafProductInfo(Consumer<WafProductInfo> wafProductInfoSetter) {
        if (this.wafProductInfo == null) {
            this.wafProductInfo = new WafProductInfo();
            wafProductInfoSetter.accept(this.wafProductInfo);
        }

        return this;
    }

    /**
     * Get wafProductInfo
     * @return wafProductInfo
     */
    public WafProductInfo getWafProductInfo() {
        return wafProductInfo;
    }

    public void setWafProductInfo(WafProductInfo wafProductInfo) {
        this.wafProductInfo = wafProductInfo;
    }

    public CreatePrepaidCloudWafRequestBody withDomainExpackProductInfo(ExpackProductInfo domainExpackProductInfo) {
        this.domainExpackProductInfo = domainExpackProductInfo;
        return this;
    }

    public CreatePrepaidCloudWafRequestBody withDomainExpackProductInfo(
        Consumer<ExpackProductInfo> domainExpackProductInfoSetter) {
        if (this.domainExpackProductInfo == null) {
            this.domainExpackProductInfo = new ExpackProductInfo();
            domainExpackProductInfoSetter.accept(this.domainExpackProductInfo);
        }

        return this;
    }

    /**
     * Get domainExpackProductInfo
     * @return domainExpackProductInfo
     */
    public ExpackProductInfo getDomainExpackProductInfo() {
        return domainExpackProductInfo;
    }

    public void setDomainExpackProductInfo(ExpackProductInfo domainExpackProductInfo) {
        this.domainExpackProductInfo = domainExpackProductInfo;
    }

    public CreatePrepaidCloudWafRequestBody withBandwidthExpackProductInfo(
        ExpackProductInfo bandwidthExpackProductInfo) {
        this.bandwidthExpackProductInfo = bandwidthExpackProductInfo;
        return this;
    }

    public CreatePrepaidCloudWafRequestBody withBandwidthExpackProductInfo(
        Consumer<ExpackProductInfo> bandwidthExpackProductInfoSetter) {
        if (this.bandwidthExpackProductInfo == null) {
            this.bandwidthExpackProductInfo = new ExpackProductInfo();
            bandwidthExpackProductInfoSetter.accept(this.bandwidthExpackProductInfo);
        }

        return this;
    }

    /**
     * Get bandwidthExpackProductInfo
     * @return bandwidthExpackProductInfo
     */
    public ExpackProductInfo getBandwidthExpackProductInfo() {
        return bandwidthExpackProductInfo;
    }

    public void setBandwidthExpackProductInfo(ExpackProductInfo bandwidthExpackProductInfo) {
        this.bandwidthExpackProductInfo = bandwidthExpackProductInfo;
    }

    public CreatePrepaidCloudWafRequestBody withRuleExpackProductInfo(ExpackProductInfo ruleExpackProductInfo) {
        this.ruleExpackProductInfo = ruleExpackProductInfo;
        return this;
    }

    public CreatePrepaidCloudWafRequestBody withRuleExpackProductInfo(
        Consumer<ExpackProductInfo> ruleExpackProductInfoSetter) {
        if (this.ruleExpackProductInfo == null) {
            this.ruleExpackProductInfo = new ExpackProductInfo();
            ruleExpackProductInfoSetter.accept(this.ruleExpackProductInfo);
        }

        return this;
    }

    /**
     * Get ruleExpackProductInfo
     * @return ruleExpackProductInfo
     */
    public ExpackProductInfo getRuleExpackProductInfo() {
        return ruleExpackProductInfo;
    }

    public void setRuleExpackProductInfo(ExpackProductInfo ruleExpackProductInfo) {
        this.ruleExpackProductInfo = ruleExpackProductInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePrepaidCloudWafRequestBody createPrepaidCloudWafRequestBody = (CreatePrepaidCloudWafRequestBody) o;
        return Objects.equals(this.projectId, createPrepaidCloudWafRequestBody.projectId)
            && Objects.equals(this.isAutoPay, createPrepaidCloudWafRequestBody.isAutoPay)
            && Objects.equals(this.isAutoRenew, createPrepaidCloudWafRequestBody.isAutoRenew)
            && Objects.equals(this.regionId, createPrepaidCloudWafRequestBody.regionId)
            && Objects.equals(this.wafProductInfo, createPrepaidCloudWafRequestBody.wafProductInfo)
            && Objects.equals(this.domainExpackProductInfo, createPrepaidCloudWafRequestBody.domainExpackProductInfo)
            && Objects.equals(this.bandwidthExpackProductInfo,
                createPrepaidCloudWafRequestBody.bandwidthExpackProductInfo)
            && Objects.equals(this.ruleExpackProductInfo, createPrepaidCloudWafRequestBody.ruleExpackProductInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            isAutoPay,
            isAutoRenew,
            regionId,
            wafProductInfo,
            domainExpackProductInfo,
            bandwidthExpackProductInfo,
            ruleExpackProductInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrepaidCloudWafRequestBody {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    wafProductInfo: ").append(toIndentedString(wafProductInfo)).append("\n");
        sb.append("    domainExpackProductInfo: ").append(toIndentedString(domainExpackProductInfo)).append("\n");
        sb.append("    bandwidthExpackProductInfo: ").append(toIndentedString(bandwidthExpackProductInfo)).append("\n");
        sb.append("    ruleExpackProductInfo: ").append(toIndentedString(ruleExpackProductInfo)).append("\n");
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
