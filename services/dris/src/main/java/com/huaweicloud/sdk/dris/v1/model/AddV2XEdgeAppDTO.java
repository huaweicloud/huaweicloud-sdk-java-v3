package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AppModel传输对象
 */
public class AddV2XEdgeAppDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_app_id")

    private String edgeAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_version")

    private String appVersion;

    public AddV2XEdgeAppDTO withEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
        return this;
    }

    /**
     * **参数说明**：用户自定义应用唯一ID，部署边缘应用前应先创建应用，方法参见：[创建应用](https://support.huaweicloud.com/api-v2x/v2x_04_0026.html)。  **取值范围**：只允许字母、数字、下划线（_）、连接符（-）、美元符号（$）的组合。
     * @return edgeAppId
     */
    public String getEdgeAppId() {
        return edgeAppId;
    }

    public void setEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
    }

    public AddV2XEdgeAppDTO withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * **参数说明**：应用版本，部署边缘应用版本前应先创建应用版本并发布，创建应用版本方法参见：[创建应用](https://support.huaweicloud.com/api-v2x/v2x_04_0038.html)，发布应用版本方法参见：[更新应用版本状态](https://support.huaweicloud.com/api-v2x/v2x_04_0105.html)。  **取值范围**：只允许小写字母、数字、连接符（-）、点（.）的组合且要以小写字母或数字开头和结尾。
     * @return appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddV2XEdgeAppDTO addV2XEdgeAppDTO = (AddV2XEdgeAppDTO) o;
        return Objects.equals(this.edgeAppId, addV2XEdgeAppDTO.edgeAppId)
            && Objects.equals(this.appVersion, addV2XEdgeAppDTO.appVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgeAppId, appVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddV2XEdgeAppDTO {\n");
        sb.append("    edgeAppId: ").append(toIndentedString(edgeAppId)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
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
