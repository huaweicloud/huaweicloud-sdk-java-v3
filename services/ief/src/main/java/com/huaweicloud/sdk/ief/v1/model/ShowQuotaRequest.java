package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowQuotaRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "types")

    private String types;

    public ShowQuotaRequest withTypes(String types) {
        this.types = types;
        return this;
    }

    /**
     * 查询配额的资源类型，支持填写： - edge_node: 边缘节点 - node_cert: 边缘节点证书 - edge_group: 边缘节点组 - group_cert: 边缘节点组证书 - application: 应用模板 - deployment: 容器应用 - device_template: 终端设备模板 - device: 终端设备 - app_version: 应用模板的版本 - tag: 标签  - configmap: 配置项 - secret: 密钥 - ief_instance: 铂金版实例 - service: 服务网格 - gateway: 服务网关
     * @return types
     */
    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowQuotaRequest showQuotaRequest = (ShowQuotaRequest) o;
        return Objects.equals(this.types, showQuotaRequest.types);
    }

    @Override
    public int hashCode() {
        return Objects.hash(types);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQuotaRequest {\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
