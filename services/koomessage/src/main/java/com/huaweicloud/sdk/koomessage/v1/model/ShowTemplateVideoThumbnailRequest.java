package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowTemplateVideoThumbnailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aim_resource_id")

    private String aimResourceId;

    public ShowTemplateVideoThumbnailRequest withAimResourceId(String aimResourceId) {
        this.aimResourceId = aimResourceId;
        return this;
    }

    /**
     * 目标资源ID
     * @return aimResourceId
     */
    public String getAimResourceId() {
        return aimResourceId;
    }

    public void setAimResourceId(String aimResourceId) {
        this.aimResourceId = aimResourceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTemplateVideoThumbnailRequest that = (ShowTemplateVideoThumbnailRequest) obj;
        return Objects.equals(this.aimResourceId, that.aimResourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aimResourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTemplateVideoThumbnailRequest {\n");
        sb.append("    aimResourceId: ").append(toIndentedString(aimResourceId)).append("\n");
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
