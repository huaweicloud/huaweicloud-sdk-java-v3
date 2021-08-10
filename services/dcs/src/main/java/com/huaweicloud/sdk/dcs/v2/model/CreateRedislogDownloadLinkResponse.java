package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class CreateRedislogDownloadLinkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link")

    private String link;

    public CreateRedislogDownloadLinkResponse withId(String id) {
        this.id = id;
        return this;
    }

    /** 日志id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateRedislogDownloadLinkResponse withLink(String link) {
        this.link = link;
        return this;
    }

    /** 日志下载链接，默认有效时间为24小时
     * 
     * @return link */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRedislogDownloadLinkResponse createRedislogDownloadLinkResponse = (CreateRedislogDownloadLinkResponse) o;
        return Objects.equals(this.id, createRedislogDownloadLinkResponse.id)
            && Objects.equals(this.link, createRedislogDownloadLinkResponse.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, link);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRedislogDownloadLinkResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
