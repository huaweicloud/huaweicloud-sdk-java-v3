package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInstanceByInstanceIdResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private Integer expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Integer createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_time")

    private Integer currentTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_spec_data")

    private ProductSpecData productSpecData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_config")

    private InstanceConfig instanceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_service_bw_update_enable")

    private Boolean elasticServiceBwUpdateEnable;

    public ShowInstanceByInstanceIdResponse withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ShowInstanceByInstanceIdResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowInstanceByInstanceIdResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowInstanceByInstanceIdResponse withExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 过期时间
     * minimum: 0
     * maximum: 2000
     * @return expireTime
     */
    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    public ShowInstanceByInstanceIdResponse withCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 2000
     * @return createTime
     */
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public ShowInstanceByInstanceIdResponse withCurrentTime(Integer currentTime) {
        this.currentTime = currentTime;
        return this;
    }

    /**
     * 当前时间
     * minimum: 0
     * maximum: 2000
     * @return currentTime
     */
    public Integer getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Integer currentTime) {
        this.currentTime = currentTime;
    }

    public ShowInstanceByInstanceIdResponse withProductSpecData(ProductSpecData productSpecData) {
        this.productSpecData = productSpecData;
        return this;
    }

    public ShowInstanceByInstanceIdResponse withProductSpecData(Consumer<ProductSpecData> productSpecDataSetter) {
        if (this.productSpecData == null) {
            this.productSpecData = new ProductSpecData();
            productSpecDataSetter.accept(this.productSpecData);
        }

        return this;
    }

    /**
     * Get productSpecData
     * @return productSpecData
     */
    public ProductSpecData getProductSpecData() {
        return productSpecData;
    }

    public void setProductSpecData(ProductSpecData productSpecData) {
        this.productSpecData = productSpecData;
    }

    public ShowInstanceByInstanceIdResponse withInstanceConfig(InstanceConfig instanceConfig) {
        this.instanceConfig = instanceConfig;
        return this;
    }

    public ShowInstanceByInstanceIdResponse withInstanceConfig(Consumer<InstanceConfig> instanceConfigSetter) {
        if (this.instanceConfig == null) {
            this.instanceConfig = new InstanceConfig();
            instanceConfigSetter.accept(this.instanceConfig);
        }

        return this;
    }

    /**
     * Get instanceConfig
     * @return instanceConfig
     */
    public InstanceConfig getInstanceConfig() {
        return instanceConfig;
    }

    public void setInstanceConfig(InstanceConfig instanceConfig) {
        this.instanceConfig = instanceConfig;
    }

    public ShowInstanceByInstanceIdResponse withElasticServiceBwUpdateEnable(Boolean elasticServiceBwUpdateEnable) {
        this.elasticServiceBwUpdateEnable = elasticServiceBwUpdateEnable;
        return this;
    }

    /**
     * 弹性业务带宽是否可更新
     * @return elasticServiceBwUpdateEnable
     */
    public Boolean getElasticServiceBwUpdateEnable() {
        return elasticServiceBwUpdateEnable;
    }

    public void setElasticServiceBwUpdateEnable(Boolean elasticServiceBwUpdateEnable) {
        this.elasticServiceBwUpdateEnable = elasticServiceBwUpdateEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceByInstanceIdResponse that = (ShowInstanceByInstanceIdResponse) obj;
        return Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.version, that.version) && Objects.equals(this.expireTime, that.expireTime)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.currentTime, that.currentTime)
            && Objects.equals(this.productSpecData, that.productSpecData)
            && Objects.equals(this.instanceConfig, that.instanceConfig)
            && Objects.equals(this.elasticServiceBwUpdateEnable, that.elasticServiceBwUpdateEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceName,
            enterpriseProjectId,
            version,
            expireTime,
            createTime,
            currentTime,
            productSpecData,
            instanceConfig,
            elasticServiceBwUpdateEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceByInstanceIdResponse {\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    currentTime: ").append(toIndentedString(currentTime)).append("\n");
        sb.append("    productSpecData: ").append(toIndentedString(productSpecData)).append("\n");
        sb.append("    instanceConfig: ").append(toIndentedString(instanceConfig)).append("\n");
        sb.append("    elasticServiceBwUpdateEnable: ")
            .append(toIndentedString(elasticServiceBwUpdateEnable))
            .append("\n");
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
