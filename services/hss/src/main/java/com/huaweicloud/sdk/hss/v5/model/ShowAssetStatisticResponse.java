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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_service_num")

    private Long webServiceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_app_num")

    private Long webAppNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_num")

    private Long databaseNum;

    public ShowAssetStatisticResponse withAccountNum(Long accountNum) {
        this.accountNum = accountNum;
        return this;
    }

    /**
     * 主机账号数量
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
     * 自启动进程数量
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

    public ShowAssetStatisticResponse withWebServiceNum(Long webServiceNum) {
        this.webServiceNum = webServiceNum;
        return this;
    }

    /**
     * web服务数量
     * minimum: 0
     * maximum: 2147483647
     * @return webServiceNum
     */
    public Long getWebServiceNum() {
        return webServiceNum;
    }

    public void setWebServiceNum(Long webServiceNum) {
        this.webServiceNum = webServiceNum;
    }

    public ShowAssetStatisticResponse withWebAppNum(Long webAppNum) {
        this.webAppNum = webAppNum;
        return this;
    }

    /**
     * web应用数量
     * minimum: 0
     * maximum: 2147483647
     * @return webAppNum
     */
    public Long getWebAppNum() {
        return webAppNum;
    }

    public void setWebAppNum(Long webAppNum) {
        this.webAppNum = webAppNum;
    }

    public ShowAssetStatisticResponse withDatabaseNum(Long databaseNum) {
        this.databaseNum = databaseNum;
        return this;
    }

    /**
     * 数据库数量
     * minimum: 0
     * maximum: 2147483647
     * @return databaseNum
     */
    public Long getDatabaseNum() {
        return databaseNum;
    }

    public void setDatabaseNum(Long databaseNum) {
        this.databaseNum = databaseNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAssetStatisticResponse that = (ShowAssetStatisticResponse) obj;
        return Objects.equals(this.accountNum, that.accountNum) && Objects.equals(this.portNum, that.portNum)
            && Objects.equals(this.processNum, that.processNum) && Objects.equals(this.appNum, that.appNum)
            && Objects.equals(this.autoLaunchNum, that.autoLaunchNum)
            && Objects.equals(this.webFrameworkNum, that.webFrameworkNum)
            && Objects.equals(this.webSiteNum, that.webSiteNum)
            && Objects.equals(this.jarPackageNum, that.jarPackageNum)
            && Objects.equals(this.kernelModuleNum, that.kernelModuleNum)
            && Objects.equals(this.webServiceNum, that.webServiceNum) && Objects.equals(this.webAppNum, that.webAppNum)
            && Objects.equals(this.databaseNum, that.databaseNum);
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
            kernelModuleNum,
            webServiceNum,
            webAppNum,
            databaseNum);
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
        sb.append("    webServiceNum: ").append(toIndentedString(webServiceNum)).append("\n");
        sb.append("    webAppNum: ").append(toIndentedString(webAppNum)).append("\n");
        sb.append("    databaseNum: ").append(toIndentedString(databaseNum)).append("\n");
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
