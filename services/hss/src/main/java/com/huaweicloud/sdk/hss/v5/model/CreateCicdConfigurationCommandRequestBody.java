package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 新增cicd配置
 */
public class CreateCicdConfigurationCommandRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_type")

    private String scanType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cicd_id")

    private String cicdId;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_image_scan")

    private Boolean isImageScan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_scan_info")

    private ImageScanRequestInfo imageScanInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_iac_scan")

    private Boolean isIacScan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iac_scan_info")

    private IacScanRequestInfo iacScanInfo;

    public CreateCicdConfigurationCommandRequestBody withScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }

    /**
     * **参数解释**： 扫描类型 **约束限制**: 不涉及 **取值范围**: - local_image：本地镜像，镜像扫描参数 - remote_image：远程镜像仓，镜像扫描参数 - local_directory：本地目录，iac扫描参数 - remote_address：https远程地址 - git_repository_address：git仓库地址  **默认取值**: 不涉及 
     * @return scanType
     */
    public String getScanType() {
        return scanType;
    }

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    public CreateCicdConfigurationCommandRequestBody withCicdId(String cicdId) {
        this.cicdId = cicdId;
        return this;
    }

    /**
     * **参数解释**： cicd标识 **约束限制**： 不涉及 **取值范围**： 字符长度1-128位 **默认取值**： 不涉及 
     * @return cicdId
     */
    public String getCicdId() {
        return cicdId;
    }

    public void setCicdId(String cicdId) {
        this.cicdId = cicdId;
    }

    public CreateCicdConfigurationCommandRequestBody withImageName(String imageName) {
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

    public CreateCicdConfigurationCommandRequestBody withImageVersion(String imageVersion) {
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

    public CreateCicdConfigurationCommandRequestBody withIsBlocking(Boolean isBlocking) {
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

    public CreateCicdConfigurationCommandRequestBody withRepositoryAddress(String repositoryAddress) {
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

    public CreateCicdConfigurationCommandRequestBody withLoginUserName(String loginUserName) {
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

    public CreateCicdConfigurationCommandRequestBody withLoginPassword(String loginPassword) {
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

    public CreateCicdConfigurationCommandRequestBody withNamespace(String namespace) {
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

    public CreateCicdConfigurationCommandRequestBody withIsImageScan(Boolean isImageScan) {
        this.isImageScan = isImageScan;
        return this;
    }

    /**
     * **参数解释**: 是否进行镜像扫描 **约束限制**: 不涉及 **取值范围**:   - true：镜像扫描。   - false：不进行镜像扫描。  **默认取值**: 不涉及 
     * @return isImageScan
     */
    public Boolean getIsImageScan() {
        return isImageScan;
    }

    public void setIsImageScan(Boolean isImageScan) {
        this.isImageScan = isImageScan;
    }

    public CreateCicdConfigurationCommandRequestBody withImageScanInfo(ImageScanRequestInfo imageScanInfo) {
        this.imageScanInfo = imageScanInfo;
        return this;
    }

    public CreateCicdConfigurationCommandRequestBody withImageScanInfo(
        Consumer<ImageScanRequestInfo> imageScanInfoSetter) {
        if (this.imageScanInfo == null) {
            this.imageScanInfo = new ImageScanRequestInfo();
            imageScanInfoSetter.accept(this.imageScanInfo);
        }

        return this;
    }

    /**
     * Get imageScanInfo
     * @return imageScanInfo
     */
    public ImageScanRequestInfo getImageScanInfo() {
        return imageScanInfo;
    }

    public void setImageScanInfo(ImageScanRequestInfo imageScanInfo) {
        this.imageScanInfo = imageScanInfo;
    }

    public CreateCicdConfigurationCommandRequestBody withIsIacScan(Boolean isIacScan) {
        this.isIacScan = isIacScan;
        return this;
    }

    /**
     * **参数解释**: 是否进行iac扫描 **约束限制**: 不涉及 **取值范围**:   - true：iac扫描。   - false：不进行iac扫描。  **默认取值**: 不涉及 
     * @return isIacScan
     */
    public Boolean getIsIacScan() {
        return isIacScan;
    }

    public void setIsIacScan(Boolean isIacScan) {
        this.isIacScan = isIacScan;
    }

    public CreateCicdConfigurationCommandRequestBody withIacScanInfo(IacScanRequestInfo iacScanInfo) {
        this.iacScanInfo = iacScanInfo;
        return this;
    }

    public CreateCicdConfigurationCommandRequestBody withIacScanInfo(Consumer<IacScanRequestInfo> iacScanInfoSetter) {
        if (this.iacScanInfo == null) {
            this.iacScanInfo = new IacScanRequestInfo();
            iacScanInfoSetter.accept(this.iacScanInfo);
        }

        return this;
    }

    /**
     * Get iacScanInfo
     * @return iacScanInfo
     */
    public IacScanRequestInfo getIacScanInfo() {
        return iacScanInfo;
    }

    public void setIacScanInfo(IacScanRequestInfo iacScanInfo) {
        this.iacScanInfo = iacScanInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCicdConfigurationCommandRequestBody that = (CreateCicdConfigurationCommandRequestBody) obj;
        return Objects.equals(this.scanType, that.scanType) && Objects.equals(this.cicdId, that.cicdId)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.imageVersion, that.imageVersion)
            && Objects.equals(this.isBlocking, that.isBlocking)
            && Objects.equals(this.repositoryAddress, that.repositoryAddress)
            && Objects.equals(this.loginUserName, that.loginUserName)
            && Objects.equals(this.loginPassword, that.loginPassword) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.isImageScan, that.isImageScan)
            && Objects.equals(this.imageScanInfo, that.imageScanInfo) && Objects.equals(this.isIacScan, that.isIacScan)
            && Objects.equals(this.iacScanInfo, that.iacScanInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanType,
            cicdId,
            imageName,
            imageVersion,
            isBlocking,
            repositoryAddress,
            loginUserName,
            loginPassword,
            namespace,
            isImageScan,
            imageScanInfo,
            isIacScan,
            iacScanInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCicdConfigurationCommandRequestBody {\n");
        sb.append("    scanType: ").append(toIndentedString(scanType)).append("\n");
        sb.append("    cicdId: ").append(toIndentedString(cicdId)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    isBlocking: ").append(toIndentedString(isBlocking)).append("\n");
        sb.append("    repositoryAddress: ").append(toIndentedString(repositoryAddress)).append("\n");
        sb.append("    loginUserName: ").append(toIndentedString(loginUserName)).append("\n");
        sb.append("    loginPassword: ").append(toIndentedString(loginPassword)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    isImageScan: ").append(toIndentedString(isImageScan)).append("\n");
        sb.append("    imageScanInfo: ").append(toIndentedString(imageScanInfo)).append("\n");
        sb.append("    isIacScan: ").append(toIndentedString(isIacScan)).append("\n");
        sb.append("    iacScanInfo: ").append(toIndentedString(iacScanInfo)).append("\n");
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
