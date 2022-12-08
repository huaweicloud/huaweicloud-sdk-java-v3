package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数说明**：EdgeApp传输对象。
 */
public class V2XEdgeAppResponseDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "v2x_edge_id")

    private String v2xEdgeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_app_id")

    private String edgeAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_version")

    private String appVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public V2XEdgeAppResponseDTO withV2xEdgeId(String v2xEdgeId) {
        this.v2xEdgeId = v2xEdgeId;
        return this;
    }

    /**
     * **参数说明**：Edge ID，用于唯一标识一个Edge。
     * @return v2xEdgeId
     */
    public String getV2xEdgeId() {
        return v2xEdgeId;
    }

    public void setV2xEdgeId(String v2xEdgeId) {
        this.v2xEdgeId = v2xEdgeId;
    }

    public V2XEdgeAppResponseDTO withEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
        return this;
    }

    /**
     * **参数说明**：用户自定义应用唯一ID。
     * @return edgeAppId
     */
    public String getEdgeAppId() {
        return edgeAppId;
    }

    public void setEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
    }

    public V2XEdgeAppResponseDTO withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * **参数说明**：应用版本，比如1.0.0。
     * @return appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public V2XEdgeAppResponseDTO withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数说明**：应用部署状态。  **取值范围**：  - UNINSTALLED：待部署  - INSTALLED：部署中  - OFFLINE：离线  - ONLINE：在线  - UPGRADING：升级中  - DELETING：删除中  - RUNNING：运行中
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V2XEdgeAppResponseDTO v2XEdgeAppResponseDTO = (V2XEdgeAppResponseDTO) o;
        return Objects.equals(this.v2xEdgeId, v2XEdgeAppResponseDTO.v2xEdgeId)
            && Objects.equals(this.edgeAppId, v2XEdgeAppResponseDTO.edgeAppId)
            && Objects.equals(this.appVersion, v2XEdgeAppResponseDTO.appVersion)
            && Objects.equals(this.status, v2XEdgeAppResponseDTO.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(v2xEdgeId, edgeAppId, appVersion, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V2XEdgeAppResponseDTO {\n");
        sb.append("    v2xEdgeId: ").append(toIndentedString(v2xEdgeId)).append("\n");
        sb.append("    edgeAppId: ").append(toIndentedString(edgeAppId)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
