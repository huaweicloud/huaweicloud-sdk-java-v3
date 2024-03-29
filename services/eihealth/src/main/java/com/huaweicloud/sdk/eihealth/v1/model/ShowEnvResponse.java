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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_bucket_path")

    private String publicBucketPath;

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

    public ShowEnvResponse withPublicBucketPath(String publicBucketPath) {
        this.publicBucketPath = publicBucketPath;
        return this;
    }

    /**
     * 医疗智能体公共数据桶https路径
     * @return publicBucketPath
     */
    public String getPublicBucketPath() {
        return publicBucketPath;
    }

    public void setPublicBucketPath(String publicBucketPath) {
        this.publicBucketPath = publicBucketPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEnvResponse that = (ShowEnvResponse) obj;
        return Objects.equals(this.devUserPool, that.devUserPool) && Objects.equals(this.hasDev, that.hasDev)
            && Objects.equals(this.hasDrug, that.hasDrug)
            && Objects.equals(this.hasEncryptionButton, that.hasEncryptionButton)
            && Objects.equals(this.deployMode, that.deployMode)
            && Objects.equals(this.enableColdArchive, that.enableColdArchive)
            && Objects.equals(this.publicBucketPath, that.publicBucketPath);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(devUserPool, hasDev, hasDrug, hasEncryptionButton, deployMode, enableColdArchive, publicBucketPath);
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
        sb.append("    publicBucketPath: ").append(toIndentedString(publicBucketPath)).append("\n");
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
