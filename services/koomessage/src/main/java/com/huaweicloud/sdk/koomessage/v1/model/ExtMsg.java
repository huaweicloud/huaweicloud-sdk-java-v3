package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExtMsg
 */
public class ExtMsg {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_in_browser")

    private String openInBrowser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_title")

    private String webTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_name")

    private String packageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "browser_floor_url")

    private String browserFloorUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depend_engine_ver")

    private String dependEngineVer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "third_service_name")

    private String thirdServiceName;

    public ExtMsg withOpenInBrowser(String openInBrowser) {
        this.openInBrowser = openInBrowser;
        return this;
    }

    /**
     * 打开方式。 - 0：webView打开  - 1：浏览器打开   > action_type=OPEN_URL必填，其他不填。 
     * @return openInBrowser
     */
    public String getOpenInBrowser() {
        return openInBrowser;
    }

    public void setOpenInBrowser(String openInBrowser) {
        this.openInBrowser = openInBrowser;
    }

    public ExtMsg withWebTitle(String webTitle) {
        this.webTitle = webTitle;
        return this;
    }

    /**
     * 标题，必填，长度范围为1-20个字符。 > action_type=OPEN_URL必填，其他不填。 
     * @return webTitle
     */
    public String getWebTitle() {
        return webTitle;
    }

    public void setWebTitle(String webTitle) {
        this.webTitle = webTitle;
    }

    public ExtMsg withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * app包名，长度范围为1-50个字符。 > action_type=OPEN_APP必填，其他不填。 
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public ExtMsg withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 商家应用的appid，长度范围为0-60个字符。 > action_type=OPEN_APP必填，其他不填。 
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ExtMsg withBrowserFloorUrl(String browserFloorUrl) {
        this.browserFloorUrl = browserFloorUrl;
        return this;
    }

    /**
     * 兜底url，长度范围为0-1000个字符，支持http/https。 > action_type=OPEN_APP选填，其他不填。 
     * @return browserFloorUrl
     */
    public String getBrowserFloorUrl() {
        return browserFloorUrl;
    }

    public void setBrowserFloorUrl(String browserFloorUrl) {
        this.browserFloorUrl = browserFloorUrl;
    }

    public ExtMsg withDependEngineVer(String dependEngineVer) {
        this.dependEngineVer = dependEngineVer;
        return this;
    }

    /**
     * 依赖的快应用引擎版本号，长度范围为1-50个字符。 > action_type=OPEN_QUICK必填，其他不填。 
     * @return dependEngineVer
     */
    public String getDependEngineVer() {
        return dependEngineVer;
    }

    public void setDependEngineVer(String dependEngineVer) {
        this.dependEngineVer = dependEngineVer;
    }

    public ExtMsg withThirdServiceName(String thirdServiceName) {
        this.thirdServiceName = thirdServiceName;
        return this;
    }

    /**
     * 第三方服务名，长度范围为1-50个字符。 > action_type=OPEN_QUICK必填，其他不填。 
     * @return thirdServiceName
     */
    public String getThirdServiceName() {
        return thirdServiceName;
    }

    public void setThirdServiceName(String thirdServiceName) {
        this.thirdServiceName = thirdServiceName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtMsg extMsg = (ExtMsg) o;
        return Objects.equals(this.openInBrowser, extMsg.openInBrowser)
            && Objects.equals(this.webTitle, extMsg.webTitle) && Objects.equals(this.packageName, extMsg.packageName)
            && Objects.equals(this.appId, extMsg.appId) && Objects.equals(this.browserFloorUrl, extMsg.browserFloorUrl)
            && Objects.equals(this.dependEngineVer, extMsg.dependEngineVer)
            && Objects.equals(this.thirdServiceName, extMsg.thirdServiceName);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(openInBrowser, webTitle, packageName, appId, browserFloorUrl, dependEngineVer, thirdServiceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtMsg {\n");
        sb.append("    openInBrowser: ").append(toIndentedString(openInBrowser)).append("\n");
        sb.append("    webTitle: ").append(toIndentedString(webTitle)).append("\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    browserFloorUrl: ").append(toIndentedString(browserFloorUrl)).append("\n");
        sb.append("    dependEngineVer: ").append(toIndentedString(dependEngineVer)).append("\n");
        sb.append("    thirdServiceName: ").append(toIndentedString(thirdServiceName)).append("\n");
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
