package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateDataconnectionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_connection_id")

    private String dataConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ApigDataSourcesVo body;

    public UpdateDataconnectionRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间id
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public UpdateDataconnectionRequest withDataConnectionId(String dataConnectionId) {
        this.dataConnectionId = dataConnectionId;
        return this;
    }

    /**
     * 数据连接ID
     * @return dataConnectionId
     */
    public String getDataConnectionId() {
        return dataConnectionId;
    }

    public void setDataConnectionId(String dataConnectionId) {
        this.dataConnectionId = dataConnectionId;
    }

    public UpdateDataconnectionRequest withBody(ApigDataSourcesVo body) {
        this.body = body;
        return this;
    }

    public UpdateDataconnectionRequest withBody(Consumer<ApigDataSourcesVo> bodySetter) {
        if (this.body == null) {
            this.body = new ApigDataSourcesVo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ApigDataSourcesVo getBody() {
        return body;
    }

    public void setBody(ApigDataSourcesVo body) {
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
        UpdateDataconnectionRequest that = (UpdateDataconnectionRequest) obj;
        return Objects.equals(this.workspace, that.workspace)
            && Objects.equals(this.dataConnectionId, that.dataConnectionId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, dataConnectionId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDataconnectionRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    dataConnectionId: ").append(toIndentedString(dataConnectionId)).append("\n");
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
