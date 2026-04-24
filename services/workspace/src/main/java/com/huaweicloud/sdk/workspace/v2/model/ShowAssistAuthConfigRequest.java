package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowAssistAuthConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_auth_config_id")

    private String mainAuthConfigId;

    public ShowAssistAuthConfigRequest withMainAuthConfigId(String mainAuthConfigId) {
        this.mainAuthConfigId = mainAuthConfigId;
        return this;
    }

    /**
     * 主认证配置id
     * @return mainAuthConfigId
     */
    public String getMainAuthConfigId() {
        return mainAuthConfigId;
    }

    public void setMainAuthConfigId(String mainAuthConfigId) {
        this.mainAuthConfigId = mainAuthConfigId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAssistAuthConfigRequest that = (ShowAssistAuthConfigRequest) obj;
        return Objects.equals(this.mainAuthConfigId, that.mainAuthConfigId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mainAuthConfigId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAssistAuthConfigRequest {\n");
        sb.append("    mainAuthConfigId: ").append(toIndentedString(mainAuthConfigId)).append("\n");
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
