package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设置视频模板封面图请求体。
 */
public class SetPrimaryVideoThumbnailRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aim_resource_id")

    private String aimResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnail_id")

    private String thumbnailId;

    public SetPrimaryVideoThumbnailRequestBody withAimResourceId(String aimResourceId) {
        this.aimResourceId = aimResourceId;
        return this;
    }

    /**
     * AIM资源ID。
     * @return aimResourceId
     */
    public String getAimResourceId() {
        return aimResourceId;
    }

    public void setAimResourceId(String aimResourceId) {
        this.aimResourceId = aimResourceId;
    }

    public SetPrimaryVideoThumbnailRequestBody withThumbnailId(String thumbnailId) {
        this.thumbnailId = thumbnailId;
        return this;
    }

    /**
     * 视频封面图ID。
     * @return thumbnailId
     */
    public String getThumbnailId() {
        return thumbnailId;
    }

    public void setThumbnailId(String thumbnailId) {
        this.thumbnailId = thumbnailId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetPrimaryVideoThumbnailRequestBody that = (SetPrimaryVideoThumbnailRequestBody) obj;
        return Objects.equals(this.aimResourceId, that.aimResourceId)
            && Objects.equals(this.thumbnailId, that.thumbnailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aimResourceId, thumbnailId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetPrimaryVideoThumbnailRequestBody {\n");
        sb.append("    aimResourceId: ").append(toIndentedString(aimResourceId)).append("\n");
        sb.append("    thumbnailId: ").append(toIndentedString(thumbnailId)).append("\n");
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
