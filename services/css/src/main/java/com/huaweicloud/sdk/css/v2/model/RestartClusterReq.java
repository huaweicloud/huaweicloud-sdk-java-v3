package com.huaweicloud.sdk.css.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RestartClusterReq
 */
public class RestartClusterReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public RestartClusterReq withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 操作角色。参数范围： - node - role
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RestartClusterReq withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 操作参数。参数说明：  - 当操作角色为node时，value为节点ID,通过[查询集群详情](ShowClusterDetail.xml)获取instances中的id属性。  - 当操作角色为role时，value为节点类型(ess、ess-master、ess-client、ess-cold)的多种不同组合。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestartClusterReq restartClusterReq = (RestartClusterReq) o;
        return Objects.equals(this.type, restartClusterReq.type) && Objects.equals(this.value, restartClusterReq.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestartClusterReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
