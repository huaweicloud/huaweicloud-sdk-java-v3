package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowAssetTempAuthorityRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="http_verb")
    
    private String httpVerb;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content_md5")
    
    private String contentMd5;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content_type")
    
    private String contentType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bucket")
    
    private String bucket;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object_key")
    
    private String objectKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="upload_id")
    
    private String uploadId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="part_number")
    
    private Integer partNumber;

    public ShowAssetTempAuthorityRequest withHttpVerb(String httpVerb) {
        this.httpVerb = httpVerb;
        return this;
    }

    


    /**
     * http方法<br/>初始化多段上传任务为POST,列举多段上传任务为GET,<br/> 上传段为PUT,合并段为POST,列举已上传段为GET,取消段合并为DELETE。 
     * @return httpVerb
     */
    public String getHttpVerb() {
        return httpVerb;
    }

    public void setHttpVerb(String httpVerb) {
        this.httpVerb = httpVerb;
    }

    

    public ShowAssetTempAuthorityRequest withContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
        return this;
    }

    


    /**
     * 上传段时,每段媒资内容的md5值,非上传段操作不涉及此字段<br/> 
     * @return contentMd5
     */
    public String getContentMd5() {
        return contentMd5;
    }

    public void setContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
    }

    

    public ShowAssetTempAuthorityRequest withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    


    /**
     * 上传段时,媒资内容对应的content-type值,非上传段操作不涉及此字段<br/> 
     * @return contentType
     */
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    

    public ShowAssetTempAuthorityRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    


    /**
     * 桶名<br/> 
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
     * 对象名<br/> 
     * @return objectKey
     */
    public String getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    

    public ShowAssetTempAuthorityRequest withUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }

    


    /**
     * 上传任务id,由OBS分配<br/> 
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
     * 上传段号,取值[1,10000]<br/> 
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
        return Objects.equals(this.httpVerb, showAssetTempAuthorityRequest.httpVerb) &&
            Objects.equals(this.contentMd5, showAssetTempAuthorityRequest.contentMd5) &&
            Objects.equals(this.contentType, showAssetTempAuthorityRequest.contentType) &&
            Objects.equals(this.bucket, showAssetTempAuthorityRequest.bucket) &&
            Objects.equals(this.objectKey, showAssetTempAuthorityRequest.objectKey) &&
            Objects.equals(this.uploadId, showAssetTempAuthorityRequest.uploadId) &&
            Objects.equals(this.partNumber, showAssetTempAuthorityRequest.partNumber);
    }
    @Override
    public int hashCode() {
        return Objects.hash(httpVerb, contentMd5, contentType, bucket, objectKey, uploadId, partNumber);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAssetTempAuthorityRequest {\n");
        sb.append("    httpVerb: ").append(toIndentedString(httpVerb)).append("\n");
        sb.append("    contentMd5: ").append(toIndentedString(contentMd5)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
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

