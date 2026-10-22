package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowPresignedUrlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "presigned_url")

    private String presignedUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire")

    private Long expire;

    public ShowPresignedUrlResponse withPresignedUrl(String presignedUrl) {
        this.presignedUrl = presignedUrl;
        return this;
    }

    /**
     * 预签名URL
     * @return presignedUrl
     */
    public String getPresignedUrl() {
        return presignedUrl;
    }

    public void setPresignedUrl(String presignedUrl) {
        this.presignedUrl = presignedUrl;
    }

    public ShowPresignedUrlResponse withExpire(Long expire) {
        this.expire = expire;
        return this;
    }

    /**
     * 过期时间（秒）
     * @return expire
     */
    public Long getExpire() {
        return expire;
    }

    public void setExpire(Long expire) {
        this.expire = expire;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPresignedUrlResponse that = (ShowPresignedUrlResponse) obj;
        return Objects.equals(this.presignedUrl, that.presignedUrl) && Objects.equals(this.expire, that.expire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(presignedUrl, expire);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPresignedUrlResponse {\n");
        sb.append("    presignedUrl: ").append(toIndentedString(presignedUrl)).append("\n");
        sb.append("    expire: ").append(toIndentedString(expire)).append("\n");
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
