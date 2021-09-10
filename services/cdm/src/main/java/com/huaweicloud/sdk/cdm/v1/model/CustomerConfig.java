package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 用户配置信息 */
public class CustomerConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failureRemind")

    private String failureRemind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterName")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serviceProvider")

    private String serviceProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "localDisk")

    private String localDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl")

    private String ssl;

    public CustomerConfig withFailureRemind(String failureRemind) {
        this.failureRemind = failureRemind;
        return this;
    }

    /** 失败提醒。
     * 
     * @return failureRemind */
    public String getFailureRemind() {
        return failureRemind;
    }

    public void setFailureRemind(String failureRemind) {
        this.failureRemind = failureRemind;
    }

    public CustomerConfig withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /** 集群类型。
     * 
     * @return clusterName */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public CustomerConfig withServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
        return this;
    }

    /** 服务提供
     * 
     * @return serviceProvider */
    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public CustomerConfig withLocalDisk(String localDisk) {
        this.localDisk = localDisk;
        return this;
    }

    /** 是否本地磁盘。
     * 
     * @return localDisk */
    public String getLocalDisk() {
        return localDisk;
    }

    public void setLocalDisk(String localDisk) {
        this.localDisk = localDisk;
    }

    public CustomerConfig withSsl(String ssl) {
        this.ssl = ssl;
        return this;
    }

    /** 是否使用ssl。
     * 
     * @return ssl */
    public String getSsl() {
        return ssl;
    }

    public void setSsl(String ssl) {
        this.ssl = ssl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerConfig customerConfig = (CustomerConfig) o;
        return Objects.equals(this.failureRemind, customerConfig.failureRemind)
            && Objects.equals(this.clusterName, customerConfig.clusterName)
            && Objects.equals(this.serviceProvider, customerConfig.serviceProvider)
            && Objects.equals(this.localDisk, customerConfig.localDisk) && Objects.equals(this.ssl, customerConfig.ssl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failureRemind, clusterName, serviceProvider, localDisk, ssl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerConfig {\n");
        sb.append("    failureRemind: ").append(toIndentedString(failureRemind)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    serviceProvider: ").append(toIndentedString(serviceProvider)).append("\n");
        sb.append("    localDisk: ").append(toIndentedString(localDisk)).append("\n");
        sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
