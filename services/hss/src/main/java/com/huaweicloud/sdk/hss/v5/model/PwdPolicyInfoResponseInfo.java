package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 服务器的口令复杂度策略。建议设置最小口令长度不小于8，同时包含大写字母、小写字母、数字和特殊字符。
 */
public class PwdPolicyInfoResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

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

    public PwdPolicyInfoResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机id
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public PwdPolicyInfoResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 服务器名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public PwdPolicyInfoResponseInfo withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 服务器IP（私有IP），为兼容用户使用，不删除此字段
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public PwdPolicyInfoResponseInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 服务器私有IP
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public PwdPolicyInfoResponseInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 服务器公网IP
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public PwdPolicyInfoResponseInfo withMinLength(Boolean minLength) {
        this.minLength = minLength;
        return this;
    }

    /**
     * 口令最小长度的设置是否符合要求，符合为true，不符合为false
     * @return minLength
     */
    public Boolean getMinLength() {
        return minLength;
    }

    public void setMinLength(Boolean minLength) {
        this.minLength = minLength;
    }

    public PwdPolicyInfoResponseInfo withUppercaseLetter(Boolean uppercaseLetter) {
        this.uppercaseLetter = uppercaseLetter;
        return this;
    }

    /**
     * 大写字母的设置是否符合要求，符合为true，不符合为false
     * @return uppercaseLetter
     */
    public Boolean getUppercaseLetter() {
        return uppercaseLetter;
    }

    public void setUppercaseLetter(Boolean uppercaseLetter) {
        this.uppercaseLetter = uppercaseLetter;
    }

    public PwdPolicyInfoResponseInfo withLowercaseLetter(Boolean lowercaseLetter) {
        this.lowercaseLetter = lowercaseLetter;
        return this;
    }

    /**
     * 小写字母的设置是否符合要求，符合为true，不符合为false
     * @return lowercaseLetter
     */
    public Boolean getLowercaseLetter() {
        return lowercaseLetter;
    }

    public void setLowercaseLetter(Boolean lowercaseLetter) {
        this.lowercaseLetter = lowercaseLetter;
    }

    public PwdPolicyInfoResponseInfo withNumber(Boolean number) {
        this.number = number;
        return this;
    }

    /**
     * 数字的设置是否符合要求，符合为true，不符合为false
     * @return number
     */
    public Boolean getNumber() {
        return number;
    }

    public void setNumber(Boolean number) {
        this.number = number;
    }

    public PwdPolicyInfoResponseInfo withSpecialCharacter(Boolean specialCharacter) {
        this.specialCharacter = specialCharacter;
        return this;
    }

    /**
     * 特殊字符的设置是否符合要求，符合为true，不符合为false
     * @return specialCharacter
     */
    public Boolean getSpecialCharacter() {
        return specialCharacter;
    }

    public void setSpecialCharacter(Boolean specialCharacter) {
        this.specialCharacter = specialCharacter;
    }

    public PwdPolicyInfoResponseInfo withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 修改建议
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
        PwdPolicyInfoResponseInfo that = (PwdPolicyInfoResponseInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.hostIp, that.hostIp) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.minLength, that.minLength)
            && Objects.equals(this.uppercaseLetter, that.uppercaseLetter)
            && Objects.equals(this.lowercaseLetter, that.lowercaseLetter) && Objects.equals(this.number, that.number)
            && Objects.equals(this.specialCharacter, that.specialCharacter)
            && Objects.equals(this.suggestion, that.suggestion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId,
            hostName,
            hostIp,
            privateIp,
            publicIp,
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
        sb.append("class PwdPolicyInfoResponseInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
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
