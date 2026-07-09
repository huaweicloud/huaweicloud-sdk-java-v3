package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UploadDatabaseSslFileRequest
 */
public class UploadDatabaseSslFileRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pem_key_txt")

    private String pemKeyTxt;

    public UploadDatabaseSslFileRequest withPemKeyTxt(String pemKeyTxt) {
        this.pemKeyTxt = pemKeyTxt;
        return this;
    }

    /**
     * 私钥文本内容
     * @return pemKeyTxt
     */
    public String getPemKeyTxt() {
        return pemKeyTxt;
    }

    public void setPemKeyTxt(String pemKeyTxt) {
        this.pemKeyTxt = pemKeyTxt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadDatabaseSslFileRequest that = (UploadDatabaseSslFileRequest) obj;
        return Objects.equals(this.pemKeyTxt, that.pemKeyTxt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pemKeyTxt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadDatabaseSslFileRequest {\n");
        sb.append("    pemKeyTxt: ").append(toIndentedString(pemKeyTxt)).append("\n");
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
