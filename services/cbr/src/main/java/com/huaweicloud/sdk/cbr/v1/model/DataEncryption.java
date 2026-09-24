package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DataEncryption
 */
public class DataEncryption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmkid")

    private String cmkid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypted_algorithm")

    private String encryptedAlgorithm;

    public DataEncryption withCmkid(String cmkid) {
        this.cmkid = cmkid;
        return this;
    }

    /**
     * 存储库的密钥ID。如果为非加密存储库，默认值为None
     * @return cmkid
     */
    public String getCmkid() {
        return cmkid;
    }

    public void setCmkid(String cmkid) {
        this.cmkid = cmkid;
    }

    public DataEncryption withEncryptedAlgorithm(String encryptedAlgorithm) {
        this.encryptedAlgorithm = encryptedAlgorithm;
        return this;
    }

    /**
     * 存储库的加密算法类型。如果为非加密存储库，默认值为None
     * @return encryptedAlgorithm
     */
    public String getEncryptedAlgorithm() {
        return encryptedAlgorithm;
    }

    public void setEncryptedAlgorithm(String encryptedAlgorithm) {
        this.encryptedAlgorithm = encryptedAlgorithm;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataEncryption that = (DataEncryption) obj;
        return Objects.equals(this.cmkid, that.cmkid)
            && Objects.equals(this.encryptedAlgorithm, that.encryptedAlgorithm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cmkid, encryptedAlgorithm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataEncryption {\n");
        sb.append("    cmkid: ").append(toIndentedString(cmkid)).append("\n");
        sb.append("    encryptedAlgorithm: ").append(toIndentedString(encryptedAlgorithm)).append("\n");
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
