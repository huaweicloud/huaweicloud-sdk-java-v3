package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAssetStatisticResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_num")

    private Long accountNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_num")

    private Long portNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_num")

    private Long processNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_num")

    private Long appNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_launch_num")

    private Long autoLaunchNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_framework_num")

    private Long webFrameworkNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_site_num")

    private Long webSiteNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jar_package_num")

    private Long jarPackageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kernel_module_num")

    private Long kernelModuleNum;

    public ShowAssetStatisticResponse withAccountNum(Long accountNum) {
        this.accountNum = accountNum;
        return this;
    }

    /**
     * 账号数量
     * minimum: 0
     * maximum: 2147483647
     * @return accountNum
     */
    public Long getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(Long accountNum) {
        this.accountNum = accountNum;
    }

    public ShowAssetStatisticResponse withPortNum(Long portNum) {
        this.portNum = portNum;
        return this;
    }

    /**
     * 开放端口数量
     * minimum: 0
     * maximum: 2147483647
     * @return portNum
     */
    public Long getPortNum() {
        return portNum;
    }

    public void setPortNum(Long portNum) {
        this.portNum = portNum;
    }

    public ShowAssetStatisticResponse withProcessNum(Long processNum) {
        this.processNum = processNum;
        return this;
    }

    /**
     * 进程数量
     * minimum: 0
     * maximum: 2147483647
     * @return processNum
     */
    public Long getProcessNum() {
        return processNum;
    }

    public void setProcessNum(Long processNum) {
        this.processNum = processNum;
    }

    public ShowAssetStatisticResponse withAppNum(Long appNum) {
        this.appNum = appNum;
        return this;
    }

    /**
     * 软件数量
     * minimum: 0
     * maximum: 2147483647
     * @return appNum
     */
    public Long getAppNum() {
        return appNum;
    }

    public void setAppNum(Long appNum) {
        this.appNum = appNum;
    }

    public ShowAssetStatisticResponse withAutoLaunchNum(Long autoLaunchNum) {
        this.autoLaunchNum = autoLaunchNum;
        return this;
    }

    /**
     * 自启动数量
     * minimum: 0
     * maximum: 2147483647
     * @return autoLaunchNum
     */
    public Long getAutoLaunchNum() {
        return autoLaunchNum;
    }

    public void setAutoLaunchNum(Long autoLaunchNum) {
        this.autoLaunchNum = autoLaunchNum;
    }

    public ShowAssetStatisticResponse withWebFrameworkNum(Long webFrameworkNum) {
        this.webFrameworkNum = webFrameworkNum;
        return this;
    }

    /**
     * web框架数量
     * minimum: 0
     * maximum: 2147483647
     * @return webFrameworkNum
     */
    public Long getWebFrameworkNum() {
        return webFrameworkNum;
    }

    public void setWebFrameworkNum(Long webFrameworkNum) {
        this.webFrameworkNum = webFrameworkNum;
    }

    public ShowAssetStatisticResponse withWebSiteNum(Long webSiteNum) {
        this.webSiteNum = webSiteNum;
        return this;
    }

    /**
     * Web站点数量
     * minimum: 0
     * maximum: 2147483647
     * @return webSiteNum
     */
    public Long getWebSiteNum() {
        return webSiteNum;
    }

    public void setWebSiteNum(Long webSiteNum) {
        this.webSiteNum = webSiteNum;
    }

    public ShowAssetStatisticResponse withJarPackageNum(Long jarPackageNum) {
        this.jarPackageNum = jarPackageNum;
        return this;
    }

    /**
     * Jar包数量
     * minimum: 0
     * maximum: 2147483647
     * @return jarPackageNum
     */
    public Long getJarPackageNum() {
        return jarPackageNum;
    }

    public void setJarPackageNum(Long jarPackageNum) {
        this.jarPackageNum = jarPackageNum;
    }

    public ShowAssetStatisticResponse withKernelModuleNum(Long kernelModuleNum) {
        this.kernelModuleNum = kernelModuleNum;
        return this;
    }

    /**
     * 内核模块数量
     * minimum: 0
     * maximum: 2147483647
     * @return kernelModuleNum
     */
    public Long getKernelModuleNum() {
        return kernelModuleNum;
    }

    public void setKernelModuleNum(Long kernelModuleNum) {
        this.kernelModuleNum = kernelModuleNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAssetStatisticResponse showAssetStatisticResponse = (ShowAssetStatisticResponse) o;
        return Objects.equals(this.accountNum, showAssetStatisticResponse.accountNum)
            && Objects.equals(this.portNum, showAssetStatisticResponse.portNum)
            && Objects.equals(this.processNum, showAssetStatisticResponse.processNum)
            && Objects.equals(this.appNum, showAssetStatisticResponse.appNum)
            && Objects.equals(this.autoLaunchNum, showAssetStatisticResponse.autoLaunchNum)
            && Objects.equals(this.webFrameworkNum, showAssetStatisticResponse.webFrameworkNum)
            && Objects.equals(this.webSiteNum, showAssetStatisticResponse.webSiteNum)
            && Objects.equals(this.jarPackageNum, showAssetStatisticResponse.jarPackageNum)
            && Objects.equals(this.kernelModuleNum, showAssetStatisticResponse.kernelModuleNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNum,
            portNum,
            processNum,
            appNum,
            autoLaunchNum,
            webFrameworkNum,
            webSiteNum,
            jarPackageNum,
            kernelModuleNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAssetStatisticResponse {\n");
        sb.append("    accountNum: ").append(toIndentedString(accountNum)).append("\n");
        sb.append("    portNum: ").append(toIndentedString(portNum)).append("\n");
        sb.append("    processNum: ").append(toIndentedString(processNum)).append("\n");
        sb.append("    appNum: ").append(toIndentedString(appNum)).append("\n");
        sb.append("    autoLaunchNum: ").append(toIndentedString(autoLaunchNum)).append("\n");
        sb.append("    webFrameworkNum: ").append(toIndentedString(webFrameworkNum)).append("\n");
        sb.append("    webSiteNum: ").append(toIndentedString(webSiteNum)).append("\n");
        sb.append("    jarPackageNum: ").append(toIndentedString(jarPackageNum)).append("\n");
        sb.append("    kernelModuleNum: ").append(toIndentedString(kernelModuleNum)).append("\n");
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
