package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UploadCertsRequestBody
 */
public class UploadCertsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certs_object")

    private String certsObject;

    public UploadCertsRequestBody withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 证书文件存放的OBS桶（桶类型必须为标准存储或者低频存储，不支持归档存储）。
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public UploadCertsRequestBody withCertsObject(String certsObject) {
        this.certsObject = certsObject;
        return this;
    }

    /**
     * 证书文件对象。证书文件大小不能超过1M。证书名称在4位到32位之间，必须以字母开头，以（.cer|.crt|.rsa|.jks|.pem|.p10|.pfx|.p12|.csr|.der|.keystore）结尾，可以包含字母、数字、中划线、下划线或者小数点，不能包含其他的特殊字符。
     * @return certsObject
     */
    public String getCertsObject() {
        return certsObject;
    }

    public void setCertsObject(String certsObject) {
        this.certsObject = certsObject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadCertsRequestBody that = (UploadCertsRequestBody) obj;
        return Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.certsObject, that.certsObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName, certsObject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadCertsRequestBody {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    certsObject: ").append(toIndentedString(certsObject)).append("\n");
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
