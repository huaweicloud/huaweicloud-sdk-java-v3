package com.huaweicloud.sdk.vcm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 音频数据输入列表
 */
public class AudioInputData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public AudioInputData withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * type为obs时输入参数  OBS桶名称。 
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public AudioInputData withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * type为obs时输入参数  OBS桶内的路径，例如“output/c1.mp4”。 
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public AudioInputData withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * type为url时输入参数  视频数据的URL，目前支持OBS URL，且需要设置该URL对匿名用户可读权限。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AudioInputData audioInputData = (AudioInputData) o;
        return Objects.equals(this.bucket, audioInputData.bucket) && Objects.equals(this.path, audioInputData.path)
            && Objects.equals(this.url, audioInputData.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, path, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioInputData {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
