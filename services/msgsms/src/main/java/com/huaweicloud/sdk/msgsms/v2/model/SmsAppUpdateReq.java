package com.huaweicloud.sdk.msgsms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SmsAppUpdateReq
 */
public class SmsAppUpdateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_sign_and_template")

    private Boolean createSignAndTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "up_link_addr")

    private String upLinkAddr;

    public SmsAppUpdateReq withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public SmsAppUpdateReq withCreateSignAndTemplate(Boolean createSignAndTemplate) {
        this.createSignAndTemplate = createSignAndTemplate;
        return this;
    }

    /**
     * 是否创建测试签名和模板。只有地域为国内时，该字段有效 1. true：是 2. false：否
     * @return createSignAndTemplate
     */
    public Boolean getCreateSignAndTemplate() {
        return createSignAndTemplate;
    }

    public void setCreateSignAndTemplate(Boolean createSignAndTemplate) {
        this.createSignAndTemplate = createSignAndTemplate;
    }

    public SmsAppUpdateReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，默认为0
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public SmsAppUpdateReq withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    /**
     * 企业项目名称，默认为default
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public SmsAppUpdateReq withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 地域 1. cn：国内 2. intl：国际
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public SmsAppUpdateReq withUpLinkAddr(String upLinkAddr) {
        this.upLinkAddr = upLinkAddr;
        return this;
    }

    /**
     * 上行回调地址。只有地域为国内时，该字段有效
     * @return upLinkAddr
     */
    public String getUpLinkAddr() {
        return upLinkAddr;
    }

    public void setUpLinkAddr(String upLinkAddr) {
        this.upLinkAddr = upLinkAddr;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsAppUpdateReq smsAppUpdateReq = (SmsAppUpdateReq) o;
        return Objects.equals(this.appName, smsAppUpdateReq.appName)
            && Objects.equals(this.createSignAndTemplate, smsAppUpdateReq.createSignAndTemplate)
            && Objects.equals(this.enterpriseProjectId, smsAppUpdateReq.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectName, smsAppUpdateReq.enterpriseProjectName)
            && Objects.equals(this.region, smsAppUpdateReq.region)
            && Objects.equals(this.upLinkAddr, smsAppUpdateReq.upLinkAddr);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(appName, createSignAndTemplate, enterpriseProjectId, enterpriseProjectName, region, upLinkAddr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmsAppUpdateReq {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    createSignAndTemplate: ").append(toIndentedString(createSignAndTemplate)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    upLinkAddr: ").append(toIndentedString(upLinkAddr)).append("\n");
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
