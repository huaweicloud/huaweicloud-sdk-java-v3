package com.huaweicloud.sdk.msgsms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SmsAppAddReq
 */
public class SmsAppAddReq {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_secret")

    private Boolean showSecret;

    public SmsAppAddReq withAppName(String appName) {
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

    public SmsAppAddReq withCreateSignAndTemplate(Boolean createSignAndTemplate) {
        this.createSignAndTemplate = createSignAndTemplate;
        return this;
    }

    /**
     * 是否创建测试签名和模板。只有地域为国内时，该字段有效 true：是 false：否
     * @return createSignAndTemplate
     */
    public Boolean getCreateSignAndTemplate() {
        return createSignAndTemplate;
    }

    public void setCreateSignAndTemplate(Boolean createSignAndTemplate) {
        this.createSignAndTemplate = createSignAndTemplate;
    }

    public SmsAppAddReq withEnterpriseProjectId(String enterpriseProjectId) {
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

    public SmsAppAddReq withEnterpriseProjectName(String enterpriseProjectName) {
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

    public SmsAppAddReq withRegion(String region) {
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

    public SmsAppAddReq withUpLinkAddr(String upLinkAddr) {
        this.upLinkAddr = upLinkAddr;
        return this;
    }

    /**
     * 上行回调地址。只有地域为国内时，
     * @return upLinkAddr
     */
    public String getUpLinkAddr() {
        return upLinkAddr;
    }

    public void setUpLinkAddr(String upLinkAddr) {
        this.upLinkAddr = upLinkAddr;
    }

    public SmsAppAddReq withShowSecret(Boolean showSecret) {
        this.showSecret = showSecret;
        return this;
    }

    /**
     * 是否在返回体中显示app_secret字段
     * @return showSecret
     */
    public Boolean getShowSecret() {
        return showSecret;
    }

    public void setShowSecret(Boolean showSecret) {
        this.showSecret = showSecret;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmsAppAddReq that = (SmsAppAddReq) obj;
        return Objects.equals(this.appName, that.appName)
            && Objects.equals(this.createSignAndTemplate, that.createSignAndTemplate)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.region, that.region) && Objects.equals(this.upLinkAddr, that.upLinkAddr)
            && Objects.equals(this.showSecret, that.showSecret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appName,
            createSignAndTemplate,
            enterpriseProjectId,
            enterpriseProjectName,
            region,
            upLinkAddr,
            showSecret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmsAppAddReq {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    createSignAndTemplate: ").append(toIndentedString(createSignAndTemplate)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    upLinkAddr: ").append(toIndentedString(upLinkAddr)).append("\n");
        sb.append("    showSecret: ").append(toIndentedString(showSecret)).append("\n");
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
