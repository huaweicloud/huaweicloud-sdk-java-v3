package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 镜像扫描信息
 */
public class ImageScanRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_type")

    private String scanType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_blocking")

    private Boolean isBlocking;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_address")

    private String repositoryAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_user_name")

    private String loginUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_password")

    private String loginPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    public ImageScanRequestInfo withScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }

    /**
     * **参数解释**: 扫描类型 **约束限制**: 不涉及 **取值范围**: - local_image：本地镜像，镜像扫描参数。 - remote_image：远程镜像仓，镜像扫描参数。  **默认取值**: 不涉及 
     * @return scanType
     */
    public String getScanType() {
        return scanType;
    }

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    public ImageScanRequestInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**: 镜像名称 **约束限制**: 不涉及 **取值范围**: 字符长度1-128位 **默认取值**: 不涉及 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ImageScanRequestInfo withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * **参数解释**: 镜像版本 **约束限制**: 不涉及 **取值范围**: 字符长度1-128位 **默认取值**: 不涉及 
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public ImageScanRequestInfo withIsBlocking(Boolean isBlocking) {
        this.isBlocking = isBlocking;
        return this;
    }

    /**
     * **参数解释**: 流水线是否阻断 **约束限制**: 不涉及 **取值范围**:   - true：流水线被阻断。   - false：流水线未阻断。  **默认取值**: 不涉及 
     * @return isBlocking
     */
    public Boolean getIsBlocking() {
        return isBlocking;
    }

    public void setIsBlocking(Boolean isBlocking) {
        this.isBlocking = isBlocking;
    }

    public ImageScanRequestInfo withRepositoryAddress(String repositoryAddress) {
        this.repositoryAddress = repositoryAddress;
        return this;
    }

    /**
     * **参数解释**: 镜像仓地址 **约束限制**: 不涉及 **取值范围**: 字符长度1-128位 **默认取值**: 不涉及 
     * @return repositoryAddress
     */
    public String getRepositoryAddress() {
        return repositoryAddress;
    }

    public void setRepositoryAddress(String repositoryAddress) {
        this.repositoryAddress = repositoryAddress;
    }

    public ImageScanRequestInfo withLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName;
        return this;
    }

    /**
     * **参数解释**: 镜像仓登录用户名 **约束限制**: 不涉及 **取值范围**: 字符长度1-128位 **默认取值**: 不涉及 
     * @return loginUserName
     */
    public String getLoginUserName() {
        return loginUserName;
    }

    public void setLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName;
    }

    public ImageScanRequestInfo withLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
        return this;
    }

    /**
     * **参数解释**: 镜像仓登录密码 **约束限制**: 不涉及 **取值范围**: 字符长度1-128位 **默认取值**: 不涉及 
     * @return loginPassword
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public ImageScanRequestInfo withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**: 组织名称 **约束限制**: 不涉及 **取值范围**: 字符长度1-128位 **默认取值**: 不涉及 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageScanRequestInfo that = (ImageScanRequestInfo) obj;
        return Objects.equals(this.scanType, that.scanType) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.imageVersion, that.imageVersion) && Objects.equals(this.isBlocking, that.isBlocking)
            && Objects.equals(this.repositoryAddress, that.repositoryAddress)
            && Objects.equals(this.loginUserName, that.loginUserName)
            && Objects.equals(this.loginPassword, that.loginPassword) && Objects.equals(this.namespace, that.namespace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanType,
            imageName,
            imageVersion,
            isBlocking,
            repositoryAddress,
            loginUserName,
            loginPassword,
            namespace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageScanRequestInfo {\n");
        sb.append("    scanType: ").append(toIndentedString(scanType)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    isBlocking: ").append(toIndentedString(isBlocking)).append("\n");
        sb.append("    repositoryAddress: ").append(toIndentedString(repositoryAddress)).append("\n");
        sb.append("    loginUserName: ").append(toIndentedString(loginUserName)).append("\n");
        sb.append("    loginPassword: ").append(toIndentedString(loginPassword)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
