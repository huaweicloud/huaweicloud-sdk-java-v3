package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ShowTakeOverAssetDetailsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Authorization")

    private String authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_bucket")

    private String sourceBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_object")

    private String sourceObject;

    public ShowTakeOverAssetDetailsRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /** 使用AK/SK方式认证时必选，携带的鉴权信息。
     * 
     * @return authorization */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public ShowTakeOverAssetDetailsRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    /** 使用AK/SK方式认证时必选，请求的发生时间。
     * 
     * @return xSdkDate */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")
    public String getXSdkDate() {
        return xSdkDate;
    }

    public void setXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
    }

    public ShowTakeOverAssetDetailsRequest withSourceBucket(String sourceBucket) {
        this.sourceBucket = sourceBucket;
        return this;
    }

    /** 媒资原始输入存放的桶。
     * 
     * @return sourceBucket */
    public String getSourceBucket() {
        return sourceBucket;
    }

    public void setSourceBucket(String sourceBucket) {
        this.sourceBucket = sourceBucket;
    }

    public ShowTakeOverAssetDetailsRequest withSourceObject(String sourceObject) {
        this.sourceObject = sourceObject;
        return this;
    }

    /** 媒资原始输入的objectKey。
     * 
     * @return sourceObject */
    public String getSourceObject() {
        return sourceObject;
    }

    public void setSourceObject(String sourceObject) {
        this.sourceObject = sourceObject;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTakeOverAssetDetailsRequest showTakeOverAssetDetailsRequest = (ShowTakeOverAssetDetailsRequest) o;
        return Objects.equals(this.authorization, showTakeOverAssetDetailsRequest.authorization)
            && Objects.equals(this.xSdkDate, showTakeOverAssetDetailsRequest.xSdkDate)
            && Objects.equals(this.sourceBucket, showTakeOverAssetDetailsRequest.sourceBucket)
            && Objects.equals(this.sourceObject, showTakeOverAssetDetailsRequest.sourceObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization, xSdkDate, sourceBucket, sourceObject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTakeOverAssetDetailsRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    sourceBucket: ").append(toIndentedString(sourceBucket)).append("\n");
        sb.append("    sourceObject: ").append(toIndentedString(sourceObject)).append("\n");
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
