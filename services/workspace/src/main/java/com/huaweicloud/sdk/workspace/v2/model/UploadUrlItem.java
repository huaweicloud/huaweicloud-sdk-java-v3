package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OBS 预签名上传地址项。
 */
public class UploadUrlItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_url")

    private String uploadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket")

    private String obsBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_object_key")

    private String obsObjectKey;

    public UploadUrlItem withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域标识。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public UploadUrlItem withUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }

    /**
     * OBS 预签名上传地址。
     * @return uploadUrl
     */
    public String getUploadUrl() {
        return uploadUrl;
    }

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    public UploadUrlItem withObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
        return this;
    }

    /**
     * OBS 桶名。
     * @return obsBucket
     */
    public String getObsBucket() {
        return obsBucket;
    }

    public void setObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
    }

    public UploadUrlItem withObsObjectKey(String obsObjectKey) {
        this.obsObjectKey = obsObjectKey;
        return this;
    }

    /**
     * OBS 对象键。
     * @return obsObjectKey
     */
    public String getObsObjectKey() {
        return obsObjectKey;
    }

    public void setObsObjectKey(String obsObjectKey) {
        this.obsObjectKey = obsObjectKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadUrlItem that = (UploadUrlItem) obj;
        return Objects.equals(this.region, that.region) && Objects.equals(this.uploadUrl, that.uploadUrl)
            && Objects.equals(this.obsBucket, that.obsBucket) && Objects.equals(this.obsObjectKey, that.obsObjectKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, uploadUrl, obsBucket, obsObjectKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadUrlItem {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
        sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
        sb.append("    obsObjectKey: ").append(toIndentedString(obsObjectKey)).append("\n");
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
