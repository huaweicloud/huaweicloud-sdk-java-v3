package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class KeystoneUpdateProjectRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private KeystoneUpdateProjectRequestBody body;

    public KeystoneUpdateProjectRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 待修改的项目ID，获取方式请参见：[获取账号、IAM用户、项目、用户组、委托的名称和ID](https://support.huaweicloud.com/api-iam/iam_17_0002.html)。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public KeystoneUpdateProjectRequest withBody(KeystoneUpdateProjectRequestBody body) {
        this.body = body;
        return this;
    }

    public KeystoneUpdateProjectRequest withBody(Consumer<KeystoneUpdateProjectRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new KeystoneUpdateProjectRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public KeystoneUpdateProjectRequestBody getBody() {
        return body;
    }

    public void setBody(KeystoneUpdateProjectRequestBody body) {
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
        KeystoneUpdateProjectRequest keystoneUpdateProjectRequest = (KeystoneUpdateProjectRequest) o;
        return Objects.equals(this.projectId, keystoneUpdateProjectRequest.projectId)
            && Objects.equals(this.body, keystoneUpdateProjectRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneUpdateProjectRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
