package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OnPremisesVersionInfo
 */
public class OnPremisesVersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kubernetesVersion")

    private String kubernetesVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "releaseVersion")

    private String releaseVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ucsctlDownloadURL")

    private String ucsctlDownloadURL;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private String arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obsEndpoint")

    private String obsEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packagePath")

    private String packagePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imagesPackagePath")

    private String imagesPackagePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetVersion")

    private String targetVersion;

    public OnPremisesVersionInfo withKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }

    /**
     * Kubernetes集群版本
     * @return kubernetesVersion
     */
    public String getKubernetesVersion() {
        return kubernetesVersion;
    }

    public void setKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
    }

    public OnPremisesVersionInfo withReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }

    /**
     * 发布版本
     * @return releaseVersion
     */
    public String getReleaseVersion() {
        return releaseVersion;
    }

    public void setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    public OnPremisesVersionInfo withUcsctlDownloadURL(String ucsctlDownloadURL) {
        this.ucsctlDownloadURL = ucsctlDownloadURL;
        return this;
    }

    /**
     * ucs-ctl工具下载链接
     * @return ucsctlDownloadURL
     */
    public String getUcsctlDownloadURL() {
        return ucsctlDownloadURL;
    }

    public void setUcsctlDownloadURL(String ucsctlDownloadURL) {
        this.ucsctlDownloadURL = ucsctlDownloadURL;
    }

    public OnPremisesVersionInfo withArch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * 兼容CPU架构
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public OnPremisesVersionInfo withObsEndpoint(String obsEndpoint) {
        this.obsEndpoint = obsEndpoint;
        return this;
    }

    /**
     * 对象存储服务访问端点
     * @return obsEndpoint
     */
    public String getObsEndpoint() {
        return obsEndpoint;
    }

    public void setObsEndpoint(String obsEndpoint) {
        this.obsEndpoint = obsEndpoint;
    }

    public OnPremisesVersionInfo withPackagePath(String packagePath) {
        this.packagePath = packagePath;
        return this;
    }

    /**
     * 软件包存储路径
     * @return packagePath
     */
    public String getPackagePath() {
        return packagePath;
    }

    public void setPackagePath(String packagePath) {
        this.packagePath = packagePath;
    }

    public OnPremisesVersionInfo withImagesPackagePath(String imagesPackagePath) {
        this.imagesPackagePath = imagesPackagePath;
        return this;
    }

    /**
     * 镜像包存储路径
     * @return imagesPackagePath
     */
    public String getImagesPackagePath() {
        return imagesPackagePath;
    }

    public void setImagesPackagePath(String imagesPackagePath) {
        this.imagesPackagePath = imagesPackagePath;
    }

    public OnPremisesVersionInfo withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * 目标版本
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OnPremisesVersionInfo that = (OnPremisesVersionInfo) obj;
        return Objects.equals(this.kubernetesVersion, that.kubernetesVersion)
            && Objects.equals(this.releaseVersion, that.releaseVersion)
            && Objects.equals(this.ucsctlDownloadURL, that.ucsctlDownloadURL) && Objects.equals(this.arch, that.arch)
            && Objects.equals(this.obsEndpoint, that.obsEndpoint) && Objects.equals(this.packagePath, that.packagePath)
            && Objects.equals(this.imagesPackagePath, that.imagesPackagePath)
            && Objects.equals(this.targetVersion, that.targetVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kubernetesVersion,
            releaseVersion,
            ucsctlDownloadURL,
            arch,
            obsEndpoint,
            packagePath,
            imagesPackagePath,
            targetVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OnPremisesVersionInfo {\n");
        sb.append("    kubernetesVersion: ").append(toIndentedString(kubernetesVersion)).append("\n");
        sb.append("    releaseVersion: ").append(toIndentedString(releaseVersion)).append("\n");
        sb.append("    ucsctlDownloadURL: ").append(toIndentedString(ucsctlDownloadURL)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    obsEndpoint: ").append(toIndentedString(obsEndpoint)).append("\n");
        sb.append("    packagePath: ").append(toIndentedString(packagePath)).append("\n");
        sb.append("    imagesPackagePath: ").append(toIndentedString(imagesPackagePath)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
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
