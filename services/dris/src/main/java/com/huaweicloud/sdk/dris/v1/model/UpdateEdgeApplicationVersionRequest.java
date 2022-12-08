package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateEdgeApplicationVersionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Instance-Id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_app_id")

    private String edgeAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateEdgeAppVersionDTO body;

    public UpdateEdgeApplicationVersionRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数说明**：实例ID。dris物理实例的唯一标识。获取方法参见[获取Instance-Id](https://support.huaweicloud.com/api-v2x/v2x_04_0030.html)。  **取值范围**：仅支持数字，小写字母和连接符（-）的组合，长度36。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateEdgeApplicationVersionRequest withEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
        return this;
    }

    /**
     * **参数说明**：用户自定义应用唯一ID。  **取值范围**：只允许字母、数字、下划线（_）、连接符（-）、美元符号（$）的组合。
     * @return edgeAppId
     */
    public String getEdgeAppId() {
        return edgeAppId;
    }

    public void setEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
    }

    public UpdateEdgeApplicationVersionRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数说明**：应用版本，应用内版本唯一。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public UpdateEdgeApplicationVersionRequest withBody(UpdateEdgeAppVersionDTO body) {
        this.body = body;
        return this;
    }

    public UpdateEdgeApplicationVersionRequest withBody(Consumer<UpdateEdgeAppVersionDTO> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateEdgeAppVersionDTO();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateEdgeAppVersionDTO getBody() {
        return body;
    }

    public void setBody(UpdateEdgeAppVersionDTO body) {
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
        UpdateEdgeApplicationVersionRequest updateEdgeApplicationVersionRequest =
            (UpdateEdgeApplicationVersionRequest) o;
        return Objects.equals(this.instanceId, updateEdgeApplicationVersionRequest.instanceId)
            && Objects.equals(this.edgeAppId, updateEdgeApplicationVersionRequest.edgeAppId)
            && Objects.equals(this.version, updateEdgeApplicationVersionRequest.version)
            && Objects.equals(this.body, updateEdgeApplicationVersionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, edgeAppId, version, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEdgeApplicationVersionRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    edgeAppId: ").append(toIndentedString(edgeAppId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
