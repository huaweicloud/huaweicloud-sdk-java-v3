package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowEnvResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dev_user_pool")

    private Boolean devUserPool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_dev")

    private Boolean hasDev;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_drug")

    private Boolean hasDrug;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_encryption_button")

    private Boolean hasEncryptionButton;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_mode")

    private String deployMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_cold_archive")

    private Boolean enableColdArchive;

    public ShowEnvResponse withDevUserPool(Boolean devUserPool) {
        this.devUserPool = devUserPool;
        return this;
    }

    /**
     * notebook是否使用专属资源池
     * @return devUserPool
     */
    public Boolean getDevUserPool() {
        return devUserPool;
    }

    public void setDevUserPool(Boolean devUserPool) {
        this.devUserPool = devUserPool;
    }

    public ShowEnvResponse withHasDev(Boolean hasDev) {
        this.hasDev = hasDev;
        return this;
    }

    /**
     * 是否集成开发环境
     * @return hasDev
     */
    public Boolean getHasDev() {
        return hasDev;
    }

    public void setHasDev(Boolean hasDev) {
        this.hasDev = hasDev;
    }

    public ShowEnvResponse withHasDrug(Boolean hasDrug) {
        this.hasDrug = hasDrug;
        return this;
    }

    /**
     * 是否部署药物虚拟筛选
     * @return hasDrug
     */
    public Boolean getHasDrug() {
        return hasDrug;
    }

    public void setHasDrug(Boolean hasDrug) {
        this.hasDrug = hasDrug;
    }

    public ShowEnvResponse withHasEncryptionButton(Boolean hasEncryptionButton) {
        this.hasEncryptionButton = hasEncryptionButton;
        return this;
    }

    /**
     * 是否显示加密按钮
     * @return hasEncryptionButton
     */
    public Boolean getHasEncryptionButton() {
        return hasEncryptionButton;
    }

    public void setHasEncryptionButton(Boolean hasEncryptionButton) {
        this.hasEncryptionButton = hasEncryptionButton;
    }

    public ShowEnvResponse withDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }

    /**
     * 医疗智能体部署模式
     * @return deployMode
     */
    public String getDeployMode() {
        return deployMode;
    }

    public void setDeployMode(String deployMode) {
        this.deployMode = deployMode;
    }

    public ShowEnvResponse withEnableColdArchive(Boolean enableColdArchive) {
        this.enableColdArchive = enableColdArchive;
        return this;
    }

    /**
     * 是否支持归档类型存储
     * @return enableColdArchive
     */
    public Boolean getEnableColdArchive() {
        return enableColdArchive;
    }

    public void setEnableColdArchive(Boolean enableColdArchive) {
        this.enableColdArchive = enableColdArchive;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEnvResponse showEnvResponse = (ShowEnvResponse) o;
        return Objects.equals(this.devUserPool, showEnvResponse.devUserPool)
            && Objects.equals(this.hasDev, showEnvResponse.hasDev)
            && Objects.equals(this.hasDrug, showEnvResponse.hasDrug)
            && Objects.equals(this.hasEncryptionButton, showEnvResponse.hasEncryptionButton)
            && Objects.equals(this.deployMode, showEnvResponse.deployMode)
            && Objects.equals(this.enableColdArchive, showEnvResponse.enableColdArchive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(devUserPool, hasDev, hasDrug, hasEncryptionButton, deployMode, enableColdArchive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEnvResponse {\n");
        sb.append("    devUserPool: ").append(toIndentedString(devUserPool)).append("\n");
        sb.append("    hasDev: ").append(toIndentedString(hasDev)).append("\n");
        sb.append("    hasDrug: ").append(toIndentedString(hasDrug)).append("\n");
        sb.append("    hasEncryptionButton: ").append(toIndentedString(hasEncryptionButton)).append("\n");
        sb.append("    deployMode: ").append(toIndentedString(deployMode)).append("\n");
        sb.append("    enableColdArchive: ").append(toIndentedString(enableColdArchive)).append("\n");
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
