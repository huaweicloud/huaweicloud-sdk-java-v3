package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowPublishableAppRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_group_id")

    private String appGroupId;

    public ShowPublishableAppRequest withAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
        return this;
    }

    /**
     * 应用组ID
     * @return appGroupId
     */
    public String getAppGroupId() {
        return appGroupId;
    }

    public void setAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPublishableAppRequest that = (ShowPublishableAppRequest) obj;
        return Objects.equals(this.appGroupId, that.appGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPublishableAppRequest {\n");
        sb.append("    appGroupId: ").append(toIndentedString(appGroupId)).append("\n");
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
