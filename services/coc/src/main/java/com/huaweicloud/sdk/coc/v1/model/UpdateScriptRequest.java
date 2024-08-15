package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateScriptRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_uuid")

    private String scriptUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-project-id")

    private String xProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-user-profile")

    private String xUserProfile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private EditScriptModel body;

    public UpdateScriptRequest withScriptUuid(String scriptUuid) {
        this.scriptUuid = scriptUuid;
        return this;
    }

    /**
     * 脚本uuid
     * @return scriptUuid
     */
    public String getScriptUuid() {
        return scriptUuid;
    }

    public void setScriptUuid(String scriptUuid) {
        this.scriptUuid = scriptUuid;
    }

    public UpdateScriptRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 国际化标记，zh-cn表示中文，en-us或不传表示英文
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public UpdateScriptRequest withXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
        return this;
    }

    /**
     * 项目ID，一个项目对应一个region
     * @return xProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-project-id")
    public String getXProjectId() {
        return xProjectId;
    }

    public void setXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
    }

    public UpdateScriptRequest withXUserProfile(String xUserProfile) {
        this.xUserProfile = xUserProfile;
        return this;
    }

    /**
     * IAM5.0用户信息
     * @return xUserProfile
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-user-profile")
    public String getXUserProfile() {
        return xUserProfile;
    }

    public void setXUserProfile(String xUserProfile) {
        this.xUserProfile = xUserProfile;
    }

    public UpdateScriptRequest withBody(EditScriptModel body) {
        this.body = body;
        return this;
    }

    public UpdateScriptRequest withBody(Consumer<EditScriptModel> bodySetter) {
        if (this.body == null) {
            this.body = new EditScriptModel();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public EditScriptModel getBody() {
        return body;
    }

    public void setBody(EditScriptModel body) {
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
        UpdateScriptRequest that = (UpdateScriptRequest) obj;
        return Objects.equals(this.scriptUuid, that.scriptUuid) && Objects.equals(this.xLanguage, that.xLanguage)
            && Objects.equals(this.xProjectId, that.xProjectId) && Objects.equals(this.xUserProfile, that.xUserProfile)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scriptUuid, xLanguage, xProjectId, xUserProfile, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateScriptRequest {\n");
        sb.append("    scriptUuid: ").append(toIndentedString(scriptUuid)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    xUserProfile: ").append(toIndentedString(xUserProfile)).append("\n");
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
