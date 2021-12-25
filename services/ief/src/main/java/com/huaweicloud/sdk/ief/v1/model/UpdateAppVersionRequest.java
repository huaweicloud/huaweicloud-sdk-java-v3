package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateAppVersionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief-instance-id")

    private String iefInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private VersionUpdate body;

    public UpdateAppVersionRequest withIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
        return this;
    }

    /** 铂金版实例ID，专业版实例为空值
     * 
     * @return iefInstanceId */
    public String getIefInstanceId() {
        return iefInstanceId;
    }

    public void setIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
    }

    public UpdateAppVersionRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** 应用模板ID
     * 
     * @return appId */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public UpdateAppVersionRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /** 应用模板版本ID
     * 
     * @return versionId */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public UpdateAppVersionRequest withBody(VersionUpdate body) {
        this.body = body;
        return this;
    }

    public UpdateAppVersionRequest withBody(Consumer<VersionUpdate> bodySetter) {
        if (this.body == null) {
            this.body = new VersionUpdate();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public VersionUpdate getBody() {
        return body;
    }

    public void setBody(VersionUpdate body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAppVersionRequest updateAppVersionRequest = (UpdateAppVersionRequest) o;
        return Objects.equals(this.iefInstanceId, updateAppVersionRequest.iefInstanceId)
            && Objects.equals(this.appId, updateAppVersionRequest.appId)
            && Objects.equals(this.versionId, updateAppVersionRequest.versionId)
            && Objects.equals(this.body, updateAppVersionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iefInstanceId, appId, versionId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAppVersionRequest {\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
