package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 边缘节点设备认证方式信息。
 */
public class DeviceAuthInfoDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fingerprint")

    private String fingerprint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_path")

    private CertificateLocalPathDTO localPath;

    public DeviceAuthInfoDTO withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 边缘节点认证方式，不填默认为密钥认证接入方式(SECRET)。
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public DeviceAuthInfoDTO withFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    /**
     * 证书指纹，认证类型使用证书认证接入(CERTIFICATES)需填写该字段。
     * @return fingerprint
     */
    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public DeviceAuthInfoDTO withLocalPath(CertificateLocalPathDTO localPath) {
        this.localPath = localPath;
        return this;
    }

    public DeviceAuthInfoDTO withLocalPath(Consumer<CertificateLocalPathDTO> localPathSetter) {
        if (this.localPath == null) {
            this.localPath = new CertificateLocalPathDTO();
            localPathSetter.accept(this.localPath);
        }

        return this;
    }

    /**
     * Get localPath
     * @return localPath
     */
    public CertificateLocalPathDTO getLocalPath() {
        return localPath;
    }

    public void setLocalPath(CertificateLocalPathDTO localPath) {
        this.localPath = localPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeviceAuthInfoDTO that = (DeviceAuthInfoDTO) obj;
        return Objects.equals(this.authType, that.authType) && Objects.equals(this.fingerprint, that.fingerprint)
            && Objects.equals(this.localPath, that.localPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authType, fingerprint, localPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceAuthInfoDTO {\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
        sb.append("    localPath: ").append(toIndentedString(localPath)).append("\n");
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
