package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新应用图标
 */
public class UpdateRawIconReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon_content")

    private String iconContent;

    public UpdateRawIconReq withIconContent(String iconContent) {
        this.iconContent = iconContent;
        return this;
    }

    /**
     * 待更新的应用图标
     * @return iconContent
     */
    public String getIconContent() {
        return iconContent;
    }

    public void setIconContent(String iconContent) {
        this.iconContent = iconContent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateRawIconReq that = (UpdateRawIconReq) obj;
        return Objects.equals(this.iconContent, that.iconContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iconContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRawIconReq {\n");
        sb.append("    iconContent: ").append(toIndentedString(iconContent)).append("\n");
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
