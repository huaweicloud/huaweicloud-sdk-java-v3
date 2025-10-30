package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 镜像的口令复杂度策略
 */
public class ImagePwdComplexityInfoResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_scan_time")

    private Long latestScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_length")

    private Boolean minLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uppercase_letter")

    private Boolean uppercaseLetter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lowercase_letter")

    private Boolean lowercaseLetter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private Boolean number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "special_character")

    private Boolean specialCharacter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    public ImagePwdComplexityInfoResponseInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**: 镜像ID **取值范围**: 字符长度0-128位 
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ImagePwdComplexityInfoResponseInfo withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**: 组织名称（只有私有镜像和共享镜像有该字段，本地镜像没有） **取值范围**: 字符长度0-65535位 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ImagePwdComplexityInfoResponseInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**: 镜像名称 **取值范围**: 字符长度0-65535位 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ImagePwdComplexityInfoResponseInfo withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * **参数解释**: 镜像版本名称 **取值范围**: 字符长度0-256位 
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public ImagePwdComplexityInfoResponseInfo withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * **参数解释**: 仓库镜像类型 **取值范围**: - SwrPrivate : swr私有镜像。 - SwrShared : swr共享。 - SwrEnterprise : swr企业。 - Harbor : harbor仓库。 - Jfrog : jfrog仓库。 - Other : 其他仓库。 
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public ImagePwdComplexityInfoResponseInfo withLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
        return this;
    }

    /**
     * **参数解释**: 最后一次检测时间，时间单位 毫秒（ms） **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return latestScanTime
     */
    public Long getLatestScanTime() {
        return latestScanTime;
    }

    public void setLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
    }

    public ImagePwdComplexityInfoResponseInfo withMinLength(Boolean minLength) {
        this.minLength = minLength;
        return this;
    }

    /**
     * **参数解释**： 口令最小长度 **取值范围**： - true：是。 - false：否。 
     * @return minLength
     */
    public Boolean getMinLength() {
        return minLength;
    }

    public void setMinLength(Boolean minLength) {
        this.minLength = minLength;
    }

    public ImagePwdComplexityInfoResponseInfo withUppercaseLetter(Boolean uppercaseLetter) {
        this.uppercaseLetter = uppercaseLetter;
        return this;
    }

    /**
     * **参数解释**： 大写字母 **取值范围**： - true：是。 - false：否。 
     * @return uppercaseLetter
     */
    public Boolean getUppercaseLetter() {
        return uppercaseLetter;
    }

    public void setUppercaseLetter(Boolean uppercaseLetter) {
        this.uppercaseLetter = uppercaseLetter;
    }

    public ImagePwdComplexityInfoResponseInfo withLowercaseLetter(Boolean lowercaseLetter) {
        this.lowercaseLetter = lowercaseLetter;
        return this;
    }

    /**
     * **参数解释**： 小写字母 **取值范围**： - true：是。 - false：否。 
     * @return lowercaseLetter
     */
    public Boolean getLowercaseLetter() {
        return lowercaseLetter;
    }

    public void setLowercaseLetter(Boolean lowercaseLetter) {
        this.lowercaseLetter = lowercaseLetter;
    }

    public ImagePwdComplexityInfoResponseInfo withNumber(Boolean number) {
        this.number = number;
        return this;
    }

    /**
     * **参数解释**： 数字 **取值范围**： - true：是。 - false：否。 
     * @return number
     */
    public Boolean getNumber() {
        return number;
    }

    public void setNumber(Boolean number) {
        this.number = number;
    }

    public ImagePwdComplexityInfoResponseInfo withSpecialCharacter(Boolean specialCharacter) {
        this.specialCharacter = specialCharacter;
        return this;
    }

    /**
     * **参数解释**： 特殊字符 **取值范围**： - true：是。 - false：否。 
     * @return specialCharacter
     */
    public Boolean getSpecialCharacter() {
        return specialCharacter;
    }

    public void setSpecialCharacter(Boolean specialCharacter) {
        this.specialCharacter = specialCharacter;
    }

    public ImagePwdComplexityInfoResponseInfo withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * **参数解释**: 修改建议 **取值范围**: 字符长度0-65534位 
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImagePwdComplexityInfoResponseInfo that = (ImagePwdComplexityInfoResponseInfo) obj;
        return Objects.equals(this.imageId, that.imageId) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.imageVersion, that.imageVersion)
            && Objects.equals(this.imageType, that.imageType)
            && Objects.equals(this.latestScanTime, that.latestScanTime)
            && Objects.equals(this.minLength, that.minLength)
            && Objects.equals(this.uppercaseLetter, that.uppercaseLetter)
            && Objects.equals(this.lowercaseLetter, that.lowercaseLetter) && Objects.equals(this.number, that.number)
            && Objects.equals(this.specialCharacter, that.specialCharacter)
            && Objects.equals(this.suggestion, that.suggestion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId,
            namespace,
            imageName,
            imageVersion,
            imageType,
            latestScanTime,
            minLength,
            uppercaseLetter,
            lowercaseLetter,
            number,
            specialCharacter,
            suggestion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImagePwdComplexityInfoResponseInfo {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    latestScanTime: ").append(toIndentedString(latestScanTime)).append("\n");
        sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
        sb.append("    uppercaseLetter: ").append(toIndentedString(uppercaseLetter)).append("\n");
        sb.append("    lowercaseLetter: ").append(toIndentedString(lowercaseLetter)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    specialCharacter: ").append(toIndentedString(specialCharacter)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
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
