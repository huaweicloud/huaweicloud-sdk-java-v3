package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 变更包周期云模式waf规格请求体
 */
public class ChangePrepaidCloudWafRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private Boolean isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waf_product_info")

    private AlterWafProductInfo wafProductInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_expack_product_info")

    private ExpackProductInfo domainExpackProductInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_expack_product_info")

    private ExpackProductInfo bandwidthExpackProductInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_expack_product_info")

    private ExpackProductInfo ruleExpackProductInfo;

    public ChangePrepaidCloudWafRequestBody withProjectId(String projectId) {
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

    public ChangePrepaidCloudWafRequestBody withIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 是否自动支付    - false: 否（需要客户手动去支付）    - true：是（自动支付）
     * @return isAutoPay
     */
    public Boolean getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public ChangePrepaidCloudWafRequestBody withWafProductInfo(AlterWafProductInfo wafProductInfo) {
        this.wafProductInfo = wafProductInfo;
        return this;
    }

    public ChangePrepaidCloudWafRequestBody withWafProductInfo(Consumer<AlterWafProductInfo> wafProductInfoSetter) {
        if (this.wafProductInfo == null) {
            this.wafProductInfo = new AlterWafProductInfo();
            wafProductInfoSetter.accept(this.wafProductInfo);
        }

        return this;
    }

    /**
     * Get wafProductInfo
     * @return wafProductInfo
     */
    public AlterWafProductInfo getWafProductInfo() {
        return wafProductInfo;
    }

    public void setWafProductInfo(AlterWafProductInfo wafProductInfo) {
        this.wafProductInfo = wafProductInfo;
    }

    public ChangePrepaidCloudWafRequestBody withDomainExpackProductInfo(ExpackProductInfo domainExpackProductInfo) {
        this.domainExpackProductInfo = domainExpackProductInfo;
        return this;
    }

    public ChangePrepaidCloudWafRequestBody withDomainExpackProductInfo(
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

    public ChangePrepaidCloudWafRequestBody withBandwidthExpackProductInfo(
        ExpackProductInfo bandwidthExpackProductInfo) {
        this.bandwidthExpackProductInfo = bandwidthExpackProductInfo;
        return this;
    }

    public ChangePrepaidCloudWafRequestBody withBandwidthExpackProductInfo(
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

    public ChangePrepaidCloudWafRequestBody withRuleExpackProductInfo(ExpackProductInfo ruleExpackProductInfo) {
        this.ruleExpackProductInfo = ruleExpackProductInfo;
        return this;
    }

    public ChangePrepaidCloudWafRequestBody withRuleExpackProductInfo(
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangePrepaidCloudWafRequestBody that = (ChangePrepaidCloudWafRequestBody) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.isAutoPay, that.isAutoPay)
            && Objects.equals(this.wafProductInfo, that.wafProductInfo)
            && Objects.equals(this.domainExpackProductInfo, that.domainExpackProductInfo)
            && Objects.equals(this.bandwidthExpackProductInfo, that.bandwidthExpackProductInfo)
            && Objects.equals(this.ruleExpackProductInfo, that.ruleExpackProductInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            isAutoPay,
            wafProductInfo,
            domainExpackProductInfo,
            bandwidthExpackProductInfo,
            ruleExpackProductInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangePrepaidCloudWafRequestBody {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
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
