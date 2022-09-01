package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateResDatasourceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_id")

    @JacksonXmlProperty(localName = "datasource_id")

    private String datasourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    @JacksonXmlProperty(localName = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateResDatastructRequestBody body;

    public UpdateResDatasourceRequest withDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }

    /**
     * 数据源id
     * @return datasourceId
     */
    public String getDatasourceId() {
        return datasourceId;
    }

    public void setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
    }

    public UpdateResDatasourceRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public UpdateResDatasourceRequest withBody(UpdateResDatastructRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateResDatasourceRequest withBody(Consumer<UpdateResDatastructRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateResDatastructRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateResDatastructRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateResDatastructRequestBody body) {
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
        UpdateResDatasourceRequest updateResDatasourceRequest = (UpdateResDatasourceRequest) o;
        return Objects.equals(this.datasourceId, updateResDatasourceRequest.datasourceId)
            && Objects.equals(this.workspaceId, updateResDatasourceRequest.workspaceId)
            && Objects.equals(this.body, updateResDatasourceRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasourceId, workspaceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResDatasourceRequest {\n");
        sb.append("    datasourceId: ").append(toIndentedString(datasourceId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
