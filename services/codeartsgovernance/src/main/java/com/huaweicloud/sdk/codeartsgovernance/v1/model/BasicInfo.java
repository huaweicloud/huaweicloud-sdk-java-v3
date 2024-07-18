package com.huaweicloud.sdk.codeartsgovernance.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BasicInfo
 */
public class BasicInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_name")

    private String packageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private Integer fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_code")

    private Integer versionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_sdk")

    private String minSdk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_sdk")

    private String targetSdk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sha1")

    private String sha1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sha256")

    private String sha256;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "md5")

    private String md5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer")

    private String issuer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_date")

    private String effectiveDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm")

    private String algorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_key")

    private String publicKey;

    public BasicInfo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称，移动应用特有
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public BasicInfo withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * 文件包名
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public BasicInfo withFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 文件大小
     * minimum: 0
     * maximum: 2147483648
     * @return fileSize
     */
    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public BasicInfo withVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }

    /**
     * 版本号
     * minimum: 0
     * maximum: 100000
     * @return versionCode
     */
    public Integer getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }

    public BasicInfo withMinSdk(String minSdk) {
        this.minSdk = minSdk;
        return this;
    }

    /**
     * 最小SDK版本
     * @return minSdk
     */
    public String getMinSdk() {
        return minSdk;
    }

    public void setMinSdk(String minSdk) {
        this.minSdk = minSdk;
    }

    public BasicInfo withTargetSdk(String targetSdk) {
        this.targetSdk = targetSdk;
        return this;
    }

    /**
     * 目标SDK版本
     * @return targetSdk
     */
    public String getTargetSdk() {
        return targetSdk;
    }

    public void setTargetSdk(String targetSdk) {
        this.targetSdk = targetSdk;
    }

    public BasicInfo withSha1(String sha1) {
        this.sha1 = sha1;
        return this;
    }

    /**
     * 文件SHA1值
     * @return sha1
     */
    public String getSha1() {
        return sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    public BasicInfo withSha256(String sha256) {
        this.sha256 = sha256;
        return this;
    }

    /**
     * 文件SHA256值
     * @return sha256
     */
    public String getSha256() {
        return sha256;
    }

    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

    public BasicInfo withMd5(String md5) {
        this.md5 = md5;
        return this;
    }

    /**
     * 文件MD5值
     * @return md5
     */
    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public BasicInfo withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * 证书发布者
     * @return issuer
     */
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public BasicInfo withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 证书拥有者
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public BasicInfo withEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * 证书有效日期
     * @return effectiveDate
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public BasicInfo withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * 算法
     * @return algorithm
     */
    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public BasicInfo withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * 证书公钥
     * @return publicKey
     */
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasicInfo that = (BasicInfo) obj;
        return Objects.equals(this.appName, that.appName) && Objects.equals(this.packageName, that.packageName)
            && Objects.equals(this.fileSize, that.fileSize) && Objects.equals(this.versionCode, that.versionCode)
            && Objects.equals(this.minSdk, that.minSdk) && Objects.equals(this.targetSdk, that.targetSdk)
            && Objects.equals(this.sha1, that.sha1) && Objects.equals(this.sha256, that.sha256)
            && Objects.equals(this.md5, that.md5) && Objects.equals(this.issuer, that.issuer)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.effectiveDate, that.effectiveDate)
            && Objects.equals(this.algorithm, that.algorithm) && Objects.equals(this.publicKey, that.publicKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appName,
            packageName,
            fileSize,
            versionCode,
            minSdk,
            targetSdk,
            sha1,
            sha256,
            md5,
            issuer,
            owner,
            effectiveDate,
            algorithm,
            publicKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BasicInfo {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    versionCode: ").append(toIndentedString(versionCode)).append("\n");
        sb.append("    minSdk: ").append(toIndentedString(minSdk)).append("\n");
        sb.append("    targetSdk: ").append(toIndentedString(targetSdk)).append("\n");
        sb.append("    sha1: ").append(toIndentedString(sha1)).append("\n");
        sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
        sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
        sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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
