package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class OperateScriptJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_uuid")

    private String executeUuid;

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

    private JobScriptOrderOperationBody body;

    public OperateScriptJobRequest withExecuteUuid(String executeUuid) {
        this.executeUuid = executeUuid;
        return this;
    }

    /**
     * 脚本工单的执行Id，取自executeJobScript和ListJobScriptOrders返回体中
     * @return executeUuid
     */
    public String getExecuteUuid() {
        return executeUuid;
    }

    public void setExecuteUuid(String executeUuid) {
        this.executeUuid = executeUuid;
    }

    public OperateScriptJobRequest withXLanguage(String xLanguage) {
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

    public OperateScriptJobRequest withXProjectId(String xProjectId) {
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

    public OperateScriptJobRequest withXUserProfile(String xUserProfile) {
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

    public OperateScriptJobRequest withBody(JobScriptOrderOperationBody body) {
        this.body = body;
        return this;
    }

    public OperateScriptJobRequest withBody(Consumer<JobScriptOrderOperationBody> bodySetter) {
        if (this.body == null) {
            this.body = new JobScriptOrderOperationBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public JobScriptOrderOperationBody getBody() {
        return body;
    }

    public void setBody(JobScriptOrderOperationBody body) {
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
        OperateScriptJobRequest that = (OperateScriptJobRequest) obj;
        return Objects.equals(this.executeUuid, that.executeUuid) && Objects.equals(this.xLanguage, that.xLanguage)
            && Objects.equals(this.xProjectId, that.xProjectId) && Objects.equals(this.xUserProfile, that.xUserProfile)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executeUuid, xLanguage, xProjectId, xUserProfile, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateScriptJobRequest {\n");
        sb.append("    executeUuid: ").append(toIndentedString(executeUuid)).append("\n");
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
