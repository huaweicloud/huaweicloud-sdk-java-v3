package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MysqlTdeInfo
 */
public class MysqlTdeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_tde")

    private Boolean enableTde;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption_type")

    private String encryptionType;

    public MysqlTdeInfo withEnableTde(Boolean enableTde) {
        this.enableTde = enableTde;
        return this;
    }

    /**
     * 是否打开透明加密功能。
     * @return enableTde
     */
    public Boolean getEnableTde() {
        return enableTde;
    }

    public void setEnableTde(Boolean enableTde) {
        this.enableTde = enableTde;
    }

    public MysqlTdeInfo withEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    /**
     * 透明加密算法，支持AES256、SM4加密算法。
     * @return encryptionType
     */
    public String getEncryptionType() {
        return encryptionType;
    }

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MysqlTdeInfo that = (MysqlTdeInfo) obj;
        return Objects.equals(this.enableTde, that.enableTde)
            && Objects.equals(this.encryptionType, that.encryptionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableTde, encryptionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlTdeInfo {\n");
        sb.append("    enableTde: ").append(toIndentedString(enableTde)).append("\n");
        sb.append("    encryptionType: ").append(toIndentedString(encryptionType)).append("\n");
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
