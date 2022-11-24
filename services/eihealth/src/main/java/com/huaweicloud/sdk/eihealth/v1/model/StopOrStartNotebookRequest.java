package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class StopOrStartNotebookRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notebook_id")

    private String notebookId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private NotebookActionReq body;

    public StopOrStartNotebookRequest withEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
        return this;
    }

    /**
     * 医疗智能体平台项目ID，您可以在EIHealth平台单击所需的项目名称，进入项目设置页面查看。
     * @return eihealthProjectId
     */
    public String getEihealthProjectId() {
        return eihealthProjectId;
    }

    public void setEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
    }

    public StopOrStartNotebookRequest withNotebookId(String notebookId) {
        this.notebookId = notebookId;
        return this;
    }

    /**
     * notebook id
     * @return notebookId
     */
    public String getNotebookId() {
        return notebookId;
    }

    public void setNotebookId(String notebookId) {
        this.notebookId = notebookId;
    }

    public StopOrStartNotebookRequest withBody(NotebookActionReq body) {
        this.body = body;
        return this;
    }

    public StopOrStartNotebookRequest withBody(Consumer<NotebookActionReq> bodySetter) {
        if (this.body == null) {
            this.body = new NotebookActionReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public NotebookActionReq getBody() {
        return body;
    }

    public void setBody(NotebookActionReq body) {
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
        StopOrStartNotebookRequest stopOrStartNotebookRequest = (StopOrStartNotebookRequest) o;
        return Objects.equals(this.eihealthProjectId, stopOrStartNotebookRequest.eihealthProjectId)
            && Objects.equals(this.notebookId, stopOrStartNotebookRequest.notebookId)
            && Objects.equals(this.body, stopOrStartNotebookRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eihealthProjectId, notebookId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopOrStartNotebookRequest {\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
        sb.append("    notebookId: ").append(toIndentedString(notebookId)).append("\n");
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
