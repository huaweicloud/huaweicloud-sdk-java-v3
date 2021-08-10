package com.huaweicloud.sdk.kms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 凭据版本。 */
public class Version {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_metadata")

    private VersionMetadata versionMetadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_binary")

    private String secretBinary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_string")

    private String secretString;

    public Version withVersionMetadata(VersionMetadata versionMetadata) {
        this.versionMetadata = versionMetadata;
        return this;
    }

    public Version withVersionMetadata(Consumer<VersionMetadata> versionMetadataSetter) {
        if (this.versionMetadata == null) {
            this.versionMetadata = new VersionMetadata();
            versionMetadataSetter.accept(this.versionMetadata);
        }

        return this;
    }

    /** Get versionMetadata
     * 
     * @return versionMetadata */
    public VersionMetadata getVersionMetadata() {
        return versionMetadata;
    }

    public void setVersionMetadata(VersionMetadata versionMetadata) {
        this.versionMetadata = versionMetadata;
    }

    public Version withSecretBinary(String secretBinary) {
        this.secretBinary = secretBinary;
        return this;
    }

    /** 二进制类型凭据在base64编码后的明文，凭据管理服务将其加密后，存入凭据的初始版本中。 类型：base64编码的二进制数据对象。
     * 
     * @return secretBinary */
    public String getSecretBinary() {
        return secretBinary;
    }

    public void setSecretBinary(String secretBinary) {
        this.secretBinary = secretBinary;
    }

    public Version withSecretString(String secretString) {
        this.secretString = secretString;
        return this;
    }

    /** 文本类型凭据的明文，凭据管理服务将其加密后，存入凭据的初始版本中。
     * 
     * @return secretString */
    public String getSecretString() {
        return secretString;
    }

    public void setSecretString(String secretString) {
        this.secretString = secretString;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Version version = (Version) o;
        return Objects.equals(this.versionMetadata, version.versionMetadata)
            && Objects.equals(this.secretBinary, version.secretBinary)
            && Objects.equals(this.secretString, version.secretString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionMetadata, secretBinary, secretString);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Version {\n");
        sb.append("    versionMetadata: ").append(toIndentedString(versionMetadata)).append("\n");
        sb.append("    secretBinary: ").append(toIndentedString(secretBinary)).append("\n");
        sb.append("    secretString: ").append(toIndentedString(secretString)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
