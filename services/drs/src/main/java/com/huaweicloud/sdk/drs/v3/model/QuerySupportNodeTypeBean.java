package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 规格信息
 */
public class QuerySupportNodeTypeBean {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_sellout")

    private Boolean isSellout;

    public QuerySupportNodeTypeBean withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 规格类型
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public QuerySupportNodeTypeBean withIsSellout(Boolean isSellout) {
        this.isSellout = isSellout;
        return this;
    }

    /**
     * 是否售罄
     * @return isSellout
     */
    public Boolean getIsSellout() {
        return isSellout;
    }

    public void setIsSellout(Boolean isSellout) {
        this.isSellout = isSellout;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuerySupportNodeTypeBean that = (QuerySupportNodeTypeBean) obj;
        return Objects.equals(this.nodeType, that.nodeType) && Objects.equals(this.isSellout, that.isSellout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeType, isSellout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuerySupportNodeTypeBean {\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    isSellout: ").append(toIndentedString(isSellout)).append("\n");
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
