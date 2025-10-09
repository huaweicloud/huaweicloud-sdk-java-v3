package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 节点名称固定前后缀配置参数。假设集群内不同节点池被用户所在公司不同部门使用，可以通过前后缀的名称区分部门和使用方式，如设置nodeNamePrefix为finance-，代表部门名称，nodeNameSuffix为-product，代表生产使用，节点池名称为gpu，代表业务类型，则最终的节点名称为finance-gpu(五位随机数)-product **约束限制**： 仅 v1.28.1/v1.27.3/v1.25.6/v1.23.11/v1.21.12 及以上集群支持配置节点名称固定前后缀，该配置参数仅在节点池场景有效 **取值范围**： 不涉及 **默认取值**： 不涉及
 */
public class NodeSpecNodeNameTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeNamePrefix")

    private String nodeNamePrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeNameSuffix")

    private String nodeNameSuffix;

    public NodeSpecNodeNameTemplate withNodeNamePrefix(String nodeNamePrefix) {
        this.nodeNamePrefix = nodeNamePrefix;
        return this;
    }

    /**
     * **参数解释**： 节点名称前缀。如果用户填写为空串或缺省，则节点名称不会增加前缀。 **约束限制**： 仅支持小写字母、数字、连字符（-）和点（.），必须以小写字母开头，并且符合[FRC 1123](https://tools.ietf.org/html/rfc1123)中定义的DNS子域名命名规范。 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return nodeNamePrefix
     */
    public String getNodeNamePrefix() {
        return nodeNamePrefix;
    }

    public void setNodeNamePrefix(String nodeNamePrefix) {
        this.nodeNamePrefix = nodeNamePrefix;
    }

    public NodeSpecNodeNameTemplate withNodeNameSuffix(String nodeNameSuffix) {
        this.nodeNameSuffix = nodeNameSuffix;
        return this;
    }

    /**
     * **参数解释**： 节点名称后缀。如果用户填写为空串或缺省，则节点名称不会增加后缀。 **约束限制**： 仅支持小写字母、数字、连字符（-）和点（.），后缀结尾必须为小写字母或者数字，并且符合[FRC 1123](https://tools.ietf.org/html/rfc1123)中定义的DNS子域名命名规范。 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return nodeNameSuffix
     */
    public String getNodeNameSuffix() {
        return nodeNameSuffix;
    }

    public void setNodeNameSuffix(String nodeNameSuffix) {
        this.nodeNameSuffix = nodeNameSuffix;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeSpecNodeNameTemplate that = (NodeSpecNodeNameTemplate) obj;
        return Objects.equals(this.nodeNamePrefix, that.nodeNamePrefix)
            && Objects.equals(this.nodeNameSuffix, that.nodeNameSuffix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeNamePrefix, nodeNameSuffix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeSpecNodeNameTemplate {\n");
        sb.append("    nodeNamePrefix: ").append(toIndentedString(nodeNamePrefix)).append("\n");
        sb.append("    nodeNameSuffix: ").append(toIndentedString(nodeNameSuffix)).append("\n");
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
