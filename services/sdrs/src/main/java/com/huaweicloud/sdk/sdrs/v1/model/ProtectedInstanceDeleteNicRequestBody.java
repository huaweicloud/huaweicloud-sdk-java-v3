package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 保护实例删除网卡请求体
 */
public class ProtectedInstanceDeleteNicRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nic_id")

    private String nicId;

    public ProtectedInstanceDeleteNicRequestBody withNicId(String nicId) {
        this.nicId = nicId;
        return this;
    }

    /**
     * 网卡Port ID。
     * @return nicId
     */
    public String getNicId() {
        return nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtectedInstanceDeleteNicRequestBody that = (ProtectedInstanceDeleteNicRequestBody) obj;
        return Objects.equals(this.nicId, that.nicId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nicId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectedInstanceDeleteNicRequestBody {\n");
        sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
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
