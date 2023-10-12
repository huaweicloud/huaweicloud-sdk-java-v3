package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UploadAppIconRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_group_id")

    private String appGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UploadAppIconRequestBody body;

    public UploadAppIconRequest withAppGroupId(String appGroupId) {
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

    public UploadAppIconRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用ID
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public UploadAppIconRequest withBody(UploadAppIconRequestBody body) {
        this.body = body;
        return this;
    }

    public UploadAppIconRequest withBody(Consumer<UploadAppIconRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UploadAppIconRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UploadAppIconRequestBody getBody() {
        return body;
    }

    public void setBody(UploadAppIconRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadAppIconRequest that = (UploadAppIconRequest) obj;
        return Objects.equals(this.appGroupId, that.appGroupId) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appGroupId, appId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadAppIconRequest {\n");
        sb.append("    appGroupId: ").append(toIndentedString(appGroupId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
