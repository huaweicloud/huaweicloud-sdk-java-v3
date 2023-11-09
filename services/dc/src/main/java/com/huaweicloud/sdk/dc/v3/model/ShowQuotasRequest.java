package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowQuotasRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private List<String> type = null;

    public ShowQuotasRequest withType(List<String> type) {
        this.type = type;
        return this;
    }

    public ShowQuotasRequest addTypeItem(String typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public ShowQuotasRequest withType(Consumer<List<String>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /**
     * 支持过滤的配额类型： - [physicalConnect:  物理连接direct_connect实例的配额和使用量] - [virtualInterface: 虚拟接口virtual-interface的配额和使用量] - [connectGateway: 连接网关（用于关联GEIP）的配额和使用量](tag:hws) - [geip: 每租户可以关联GEIP的配额和使用量](tag:hws) - [globalDcGateway 专线全球接入网关的配额和使用量] - [peerLinkPerGdgw: 接入网关的关联连接的配额和使用量]
     * @return type
     */
    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowQuotasRequest that = (ShowQuotasRequest) obj;
        return Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQuotasRequest {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
