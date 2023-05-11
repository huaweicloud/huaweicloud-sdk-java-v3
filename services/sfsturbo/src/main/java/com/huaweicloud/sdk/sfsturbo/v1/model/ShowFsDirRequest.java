package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowFsDirRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_id")

    private String shareId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    public ShowFsDirRequest withShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }

    /**
     * 文件系统id
     * @return shareId
     */
    public String getShareId() {
        return shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public ShowFsDirRequest withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 需要查询的目录的全路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowFsDirRequest showFsDirRequest = (ShowFsDirRequest) o;
        return Objects.equals(this.shareId, showFsDirRequest.shareId)
            && Objects.equals(this.path, showFsDirRequest.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shareId, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFsDirRequest {\n");
        sb.append("    shareId: ").append(toIndentedString(shareId)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
