package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 用户配置信息
 */
public class CustomerConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failureRemind")

    @JacksonXmlProperty(localName = "failureRemind")

    private String failureRemind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterName")

    @JacksonXmlProperty(localName = "clusterName")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serviceProvider")

    @JacksonXmlProperty(localName = "serviceProvider")

    private String serviceProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "localDisk")

    @JacksonXmlProperty(localName = "localDisk")

    private String localDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl")

    @JacksonXmlProperty(localName = "ssl")

    private String ssl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createFrom")

    @JacksonXmlProperty(localName = "createFrom")

    private String createFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceId")

    @JacksonXmlProperty(localName = "resourceId")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavorType")

    @JacksonXmlProperty(localName = "flavorType")

    private String flavorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workSpaceId")

    @JacksonXmlProperty(localName = "workSpaceId")

    private String workSpaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trial")

    @JacksonXmlProperty(localName = "trial")

    private String trial;

    public CustomerConfig withFailureRemind(String failureRemind) {
        this.failureRemind = failureRemind;
        return this;
    }

    /**
     * 失败提醒。
     * @return failureRemind
     */
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

    /**
     * 集群类型。
     * @return clusterName
     */
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

    /**
     * 服务提供
     * @return serviceProvider
     */
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

    /**
     * 是否本地磁盘。
     * @return localDisk
     */
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

    /**
     * 是否使用ssl。
     * @return ssl
     */
    public String getSsl() {
        return ssl;
    }

    public void setSsl(String ssl) {
        this.ssl = ssl;
    }

    public CustomerConfig withCreateFrom(String createFrom) {
        this.createFrom = createFrom;
        return this;
    }

    /**
     * 创建来源
     * @return createFrom
     */
    public String getCreateFrom() {
        return createFrom;
    }

    public void setCreateFrom(String createFrom) {
        this.createFrom = createFrom;
    }

    public CustomerConfig withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public CustomerConfig withFlavorType(String flavorType) {
        this.flavorType = flavorType;
        return this;
    }

    /**
     * 规格类型
     * @return flavorType
     */
    public String getFlavorType() {
        return flavorType;
    }

    public void setFlavorType(String flavorType) {
        this.flavorType = flavorType;
    }

    public CustomerConfig withWorkSpaceId(String workSpaceId) {
        this.workSpaceId = workSpaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return workSpaceId
     */
    public String getWorkSpaceId() {
        return workSpaceId;
    }

    public void setWorkSpaceId(String workSpaceId) {
        this.workSpaceId = workSpaceId;
    }

    public CustomerConfig withTrial(String trial) {
        this.trial = trial;
        return this;
    }

    /**
     * 适用
     * @return trial
     */
    public String getTrial() {
        return trial;
    }

    public void setTrial(String trial) {
        this.trial = trial;
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
            && Objects.equals(this.localDisk, customerConfig.localDisk) && Objects.equals(this.ssl, customerConfig.ssl)
            && Objects.equals(this.createFrom, customerConfig.createFrom)
            && Objects.equals(this.resourceId, customerConfig.resourceId)
            && Objects.equals(this.flavorType, customerConfig.flavorType)
            && Objects.equals(this.workSpaceId, customerConfig.workSpaceId)
            && Objects.equals(this.trial, customerConfig.trial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failureRemind,
            clusterName,
            serviceProvider,
            localDisk,
            ssl,
            createFrom,
            resourceId,
            flavorType,
            workSpaceId,
            trial);
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
        sb.append("    createFrom: ").append(toIndentedString(createFrom)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    flavorType: ").append(toIndentedString(flavorType)).append("\n");
        sb.append("    workSpaceId: ").append(toIndentedString(workSpaceId)).append("\n");
        sb.append("    trial: ").append(toIndentedString(trial)).append("\n");
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
