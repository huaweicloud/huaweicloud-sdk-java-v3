package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 恢复凭据对象请求体
 */
public class UploadSecretBlobRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_blob")

    private String secretBlob;

    public UploadSecretBlobRequestBody withSecretBlob(String secretBlob) {
        this.secretBlob = secretBlob;
        return this;
    }

    /**
     * 将指定凭据对象进行备份后得到的凭据备份文件，备份文件包含有凭据当前所有的凭据版本信息，备份文件经过加密与编码，内容不可直接读。 
     * @return secretBlob
     */
    public String getSecretBlob() {
        return secretBlob;
    }

    public void setSecretBlob(String secretBlob) {
        this.secretBlob = secretBlob;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadSecretBlobRequestBody uploadSecretBlobRequestBody = (UploadSecretBlobRequestBody) o;
        return Objects.equals(this.secretBlob, uploadSecretBlobRequestBody.secretBlob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secretBlob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadSecretBlobRequestBody {\n");
        sb.append("    secretBlob: ").append(toIndentedString(secretBlob)).append("\n");
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
