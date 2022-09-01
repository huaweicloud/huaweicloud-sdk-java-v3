package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowAssetTempAuthorityRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Authorization")

    @JacksonXmlProperty(localName = "Authorization")

    private String authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    @JacksonXmlProperty(localName = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_verb")

    @JacksonXmlProperty(localName = "http_verb")

    private String httpVerb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    @JacksonXmlProperty(localName = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_key")

    @JacksonXmlProperty(localName = "object_key")

    private String objectKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_type")

    @JacksonXmlProperty(localName = "content_type")

    private String contentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_md5")

    @JacksonXmlProperty(localName = "content_md5")

    private String contentMd5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_id")

    @JacksonXmlProperty(localName = "upload_id")

    private String uploadId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "part_number")

    @JacksonXmlProperty(localName = "part_number")

    private Integer partNumber;

    public ShowAssetTempAuthorityRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，携带的鉴权信息。 
     * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public ShowAssetTempAuthorityRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，请求的发生时间。 
     * @return xSdkDate
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")
    public String getXSdkDate() {
        return xSdkDate;
    }

    public void setXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
    }

    public ShowAssetTempAuthorityRequest withHttpVerb(String httpVerb) {
        this.httpVerb = httpVerb;
        return this;
    }

    /**
     * 分段上传时调用OBS接口的HTTP方法，具体操作需要的HTTP方法请参考OBS的接口文档。  - 初始化上传任务：POST - 上传段：PUT - 合并段：POST - 取消段：DELETE - 列举已上传段：GET
     * @return httpVerb
     */
    public String getHttpVerb() {
        return httpVerb;
    }

    public void setHttpVerb(String httpVerb) {
        this.httpVerb = httpVerb;
    }

    public ShowAssetTempAuthorityRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * 桶名。  调用[创建媒资：上传方式](https://support.huaweicloud.com/api-vod/vod_04_0196.html)接口中返回的响应体中的target字段获得的bucket值。
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public ShowAssetTempAuthorityRequest withObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }

    /**
     * 对象名。  调用[创建媒资：上传方式](https://support.huaweicloud.com/api-vod/vod_04_0196.html)接口中返回的响应体中的target字段获得的object值。
     * @return objectKey
     */
    public String getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    public ShowAssetTempAuthorityRequest withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * 文件类型对应的content-type，如MP4对应video/mp4。
     * @return contentType
     */
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public ShowAssetTempAuthorityRequest withContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
        return this;
    }

    /**
     * 上传段时每段的MD5。
     * @return contentMd5
     */
    public String getContentMd5() {
        return contentMd5;
    }

    public void setContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
    }

    public ShowAssetTempAuthorityRequest withUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }

    /**
     * 每一个上传任务的id，是OBS进行初始段后OBS返回的。
     * @return uploadId
     */
    public String getUploadId() {
        return uploadId;
    }

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    public ShowAssetTempAuthorityRequest withPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
        return this;
    }

    /**
     * 上传段时每一段的id。  取值范围：[1,10000]。
     * minimum: 1
     * maximum: 10000
     * @return partNumber
     */
    public Integer getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAssetTempAuthorityRequest showAssetTempAuthorityRequest = (ShowAssetTempAuthorityRequest) o;
        return Objects.equals(this.authorization, showAssetTempAuthorityRequest.authorization)
            && Objects.equals(this.xSdkDate, showAssetTempAuthorityRequest.xSdkDate)
            && Objects.equals(this.httpVerb, showAssetTempAuthorityRequest.httpVerb)
            && Objects.equals(this.bucket, showAssetTempAuthorityRequest.bucket)
            && Objects.equals(this.objectKey, showAssetTempAuthorityRequest.objectKey)
            && Objects.equals(this.contentType, showAssetTempAuthorityRequest.contentType)
            && Objects.equals(this.contentMd5, showAssetTempAuthorityRequest.contentMd5)
            && Objects.equals(this.uploadId, showAssetTempAuthorityRequest.uploadId)
            && Objects.equals(this.partNumber, showAssetTempAuthorityRequest.partNumber);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(authorization, xSdkDate, httpVerb, bucket, objectKey, contentType, contentMd5, uploadId, partNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAssetTempAuthorityRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    httpVerb: ").append(toIndentedString(httpVerb)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    contentMd5: ").append(toIndentedString(contentMd5)).append("\n");
        sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
        sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
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
