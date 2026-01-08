package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OTP辅助认证方式配置。
 */
public class OtpConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receive_mode")

    private ReceiveModeEnum receiveMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_url")

    private String authUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_secret")

    private String appSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_server_access_mode")

    private AuthServerAccessMode authServerAccessMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_content")

    private String certContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_rule")

    private ApplyRuleInfo applyRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_objects")

    private List<ApplyObjects> applyObjects = null;

    public OtpConfigInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 认证id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OtpConfigInfo withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否启用。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public OtpConfigInfo withReceiveMode(ReceiveModeEnum receiveMode) {
        this.receiveMode = receiveMode;
        return this;
    }

    /**
     * Get receiveMode
     * @return receiveMode
     */
    public ReceiveModeEnum getReceiveMode() {
        return receiveMode;
    }

    public void setReceiveMode(ReceiveModeEnum receiveMode) {
        this.receiveMode = receiveMode;
    }

    public OtpConfigInfo withAuthUrl(String authUrl) {
        this.authUrl = authUrl;
        return this;
    }

    /**
     * 辅助认证服务器地址。
     * @return authUrl
     */
    public String getAuthUrl() {
        return authUrl;
    }

    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }

    public OtpConfigInfo withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 认证服务接入账号。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public OtpConfigInfo withAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }

    /**
     * 认证服务接入密码。
     * @return appSecret
     */
    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public OtpConfigInfo withAuthServerAccessMode(AuthServerAccessMode authServerAccessMode) {
        this.authServerAccessMode = authServerAccessMode;
        return this;
    }

    /**
     * Get authServerAccessMode
     * @return authServerAccessMode
     */
    public AuthServerAccessMode getAuthServerAccessMode() {
        return authServerAccessMode;
    }

    public void setAuthServerAccessMode(AuthServerAccessMode authServerAccessMode) {
        this.authServerAccessMode = authServerAccessMode;
    }

    public OtpConfigInfo withCertContent(String certContent) {
        this.certContent = certContent;
        return this;
    }

    /**
     * pem格式证书内容。
     * @return certContent
     */
    public String getCertContent() {
        return certContent;
    }

    public void setCertContent(String certContent) {
        this.certContent = certContent;
    }

    public OtpConfigInfo withApplyRule(ApplyRuleInfo applyRule) {
        this.applyRule = applyRule;
        return this;
    }

    public OtpConfigInfo withApplyRule(Consumer<ApplyRuleInfo> applyRuleSetter) {
        if (this.applyRule == null) {
            this.applyRule = new ApplyRuleInfo();
            applyRuleSetter.accept(this.applyRule);
        }

        return this;
    }

    /**
     * Get applyRule
     * @return applyRule
     */
    public ApplyRuleInfo getApplyRule() {
        return applyRule;
    }

    public void setApplyRule(ApplyRuleInfo applyRule) {
        this.applyRule = applyRule;
    }

    public OtpConfigInfo withApplyObjects(List<ApplyObjects> applyObjects) {
        this.applyObjects = applyObjects;
        return this;
    }

    public OtpConfigInfo addApplyObjectsItem(ApplyObjects applyObjectsItem) {
        if (this.applyObjects == null) {
            this.applyObjects = new ArrayList<>();
        }
        this.applyObjects.add(applyObjectsItem);
        return this;
    }

    public OtpConfigInfo withApplyObjects(Consumer<List<ApplyObjects>> applyObjectsSetter) {
        if (this.applyObjects == null) {
            this.applyObjects = new ArrayList<>();
        }
        applyObjectsSetter.accept(this.applyObjects);
        return this;
    }

    /**
     * 要应用的用户/用户组列表。
     * @return applyObjects
     */
    public List<ApplyObjects> getApplyObjects() {
        return applyObjects;
    }

    public void setApplyObjects(List<ApplyObjects> applyObjects) {
        this.applyObjects = applyObjects;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OtpConfigInfo that = (OtpConfigInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.receiveMode, that.receiveMode) && Objects.equals(this.authUrl, that.authUrl)
            && Objects.equals(this.appId, that.appId) && Objects.equals(this.appSecret, that.appSecret)
            && Objects.equals(this.authServerAccessMode, that.authServerAccessMode)
            && Objects.equals(this.certContent, that.certContent) && Objects.equals(this.applyRule, that.applyRule)
            && Objects.equals(this.applyObjects, that.applyObjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            enable,
            receiveMode,
            authUrl,
            appId,
            appSecret,
            authServerAccessMode,
            certContent,
            applyRule,
            applyObjects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OtpConfigInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    receiveMode: ").append(toIndentedString(receiveMode)).append("\n");
        sb.append("    authUrl: ").append(toIndentedString(authUrl)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
        sb.append("    authServerAccessMode: ").append(toIndentedString(authServerAccessMode)).append("\n");
        sb.append("    certContent: ").append(toIndentedString(certContent)).append("\n");
        sb.append("    applyRule: ").append(toIndentedString(applyRule)).append("\n");
        sb.append("    applyObjects: ").append(toIndentedString(applyObjects)).append("\n");
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
