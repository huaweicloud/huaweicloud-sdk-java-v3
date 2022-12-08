package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NodePoolSpec {

    /**
     * 节点池类型。不填写时默认为vm。  - vm：弹性云服务器 - ElasticBMS：C6型弹性裸金属通用计算增强型云服务器，规格示例：c6.22xlarge.2.physical 
     */
    public static final class TypeEnum {

        /**
         * Enum VM for value: "vm"
         */
        public static final TypeEnum VM = new TypeEnum("vm");

        /**
         * Enum ELASTICBMS for value: "ElasticBMS"
         */
        public static final TypeEnum ELASTICBMS = new TypeEnum("ElasticBMS");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("vm", VM);
            map.put("ElasticBMS", ELASTICBMS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeTemplate")

    private NodeSpec nodeTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initialNodeCount")

    private Integer initialNodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoscaling")

    private NodePoolNodeAutoscaling autoscaling;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeManagement")

    private NodeManagement nodeManagement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "podSecurityGroups")

    private List<SecurityID> podSecurityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customSecurityGroups")

    private List<String> customSecurityGroups = null;

    public NodePoolSpec withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 节点池类型。不填写时默认为vm。  - vm：弹性云服务器 - ElasticBMS：C6型弹性裸金属通用计算增强型云服务器，规格示例：c6.22xlarge.2.physical 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public NodePoolSpec withNodeTemplate(NodeSpec nodeTemplate) {
        this.nodeTemplate = nodeTemplate;
        return this;
    }

    public NodePoolSpec withNodeTemplate(Consumer<NodeSpec> nodeTemplateSetter) {
        if (this.nodeTemplate == null) {
            this.nodeTemplate = new NodeSpec();
            nodeTemplateSetter.accept(this.nodeTemplate);
        }

        return this;
    }

    /**
     * Get nodeTemplate
     * @return nodeTemplate
     */
    public NodeSpec getNodeTemplate() {
        return nodeTemplate;
    }

    public void setNodeTemplate(NodeSpec nodeTemplate) {
        this.nodeTemplate = nodeTemplate;
    }

    public NodePoolSpec withInitialNodeCount(Integer initialNodeCount) {
        this.initialNodeCount = initialNodeCount;
        return this;
    }

    /**
     * 节点池初始化节点个数。查询时为节点池目标节点数量。
     * @return initialNodeCount
     */
    public Integer getInitialNodeCount() {
        return initialNodeCount;
    }

    public void setInitialNodeCount(Integer initialNodeCount) {
        this.initialNodeCount = initialNodeCount;
    }

    public NodePoolSpec withAutoscaling(NodePoolNodeAutoscaling autoscaling) {
        this.autoscaling = autoscaling;
        return this;
    }

    public NodePoolSpec withAutoscaling(Consumer<NodePoolNodeAutoscaling> autoscalingSetter) {
        if (this.autoscaling == null) {
            this.autoscaling = new NodePoolNodeAutoscaling();
            autoscalingSetter.accept(this.autoscaling);
        }

        return this;
    }

    /**
     * Get autoscaling
     * @return autoscaling
     */
    public NodePoolNodeAutoscaling getAutoscaling() {
        return autoscaling;
    }

    public void setAutoscaling(NodePoolNodeAutoscaling autoscaling) {
        this.autoscaling = autoscaling;
    }

    public NodePoolSpec withNodeManagement(NodeManagement nodeManagement) {
        this.nodeManagement = nodeManagement;
        return this;
    }

    public NodePoolSpec withNodeManagement(Consumer<NodeManagement> nodeManagementSetter) {
        if (this.nodeManagement == null) {
            this.nodeManagement = new NodeManagement();
            nodeManagementSetter.accept(this.nodeManagement);
        }

        return this;
    }

    /**
     * Get nodeManagement
     * @return nodeManagement
     */
    public NodeManagement getNodeManagement() {
        return nodeManagement;
    }

    public void setNodeManagement(NodeManagement nodeManagement) {
        this.nodeManagement = nodeManagement;
    }

    public NodePoolSpec withPodSecurityGroups(List<SecurityID> podSecurityGroups) {
        this.podSecurityGroups = podSecurityGroups;
        return this;
    }

    public NodePoolSpec addPodSecurityGroupsItem(SecurityID podSecurityGroupsItem) {
        if (this.podSecurityGroups == null) {
            this.podSecurityGroups = new ArrayList<>();
        }
        this.podSecurityGroups.add(podSecurityGroupsItem);
        return this;
    }

    public NodePoolSpec withPodSecurityGroups(Consumer<List<SecurityID>> podSecurityGroupsSetter) {
        if (this.podSecurityGroups == null) {
            this.podSecurityGroups = new ArrayList<>();
        }
        podSecurityGroupsSetter.accept(this.podSecurityGroups);
        return this;
    }

    /**
     * 1.21版本集群节点池支持绑定安全组，最多五个。
     * @return podSecurityGroups
     */
    public List<SecurityID> getPodSecurityGroups() {
        return podSecurityGroups;
    }

    public void setPodSecurityGroups(List<SecurityID> podSecurityGroups) {
        this.podSecurityGroups = podSecurityGroups;
    }

    public NodePoolSpec withCustomSecurityGroups(List<String> customSecurityGroups) {
        this.customSecurityGroups = customSecurityGroups;
        return this;
    }

    public NodePoolSpec addCustomSecurityGroupsItem(String customSecurityGroupsItem) {
        if (this.customSecurityGroups == null) {
            this.customSecurityGroups = new ArrayList<>();
        }
        this.customSecurityGroups.add(customSecurityGroupsItem);
        return this;
    }

    public NodePoolSpec withCustomSecurityGroups(Consumer<List<String>> customSecurityGroupsSetter) {
        if (this.customSecurityGroups == null) {
            this.customSecurityGroups = new ArrayList<>();
        }
        customSecurityGroupsSetter.accept(this.customSecurityGroups);
        return this;
    }

    /**
     * 节点池自定义安全组相关配置。支持节点池新扩容节点绑定指定的安全组。  - 未指定安全组ID，新建节点将添加Node节点默认安全组。  - 指定有效安全组ID，新建节点将使用指定安全组。  - 指定安全组，应避免对CCE运行依赖的端口规则进行修改。[详细设置请参考[集群安全组规则配置](https://support.huaweicloud.com/cce_faq/cce_faq_00265.html)。](tag:hws)[详细设置请参考[集群安全组规则配置](https://support.huaweicloud.com/intl/zh-cn/cce_faq/cce_faq_00265.html)。](tag:hws_hk) 
     * @return customSecurityGroups
     */
    public List<String> getCustomSecurityGroups() {
        return customSecurityGroups;
    }

    public void setCustomSecurityGroups(List<String> customSecurityGroups) {
        this.customSecurityGroups = customSecurityGroups;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodePoolSpec nodePoolSpec = (NodePoolSpec) o;
        return Objects.equals(this.type, nodePoolSpec.type)
            && Objects.equals(this.nodeTemplate, nodePoolSpec.nodeTemplate)
            && Objects.equals(this.initialNodeCount, nodePoolSpec.initialNodeCount)
            && Objects.equals(this.autoscaling, nodePoolSpec.autoscaling)
            && Objects.equals(this.nodeManagement, nodePoolSpec.nodeManagement)
            && Objects.equals(this.podSecurityGroups, nodePoolSpec.podSecurityGroups)
            && Objects.equals(this.customSecurityGroups, nodePoolSpec.customSecurityGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            nodeTemplate,
            initialNodeCount,
            autoscaling,
            nodeManagement,
            podSecurityGroups,
            customSecurityGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodePoolSpec {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    nodeTemplate: ").append(toIndentedString(nodeTemplate)).append("\n");
        sb.append("    initialNodeCount: ").append(toIndentedString(initialNodeCount)).append("\n");
        sb.append("    autoscaling: ").append(toIndentedString(autoscaling)).append("\n");
        sb.append("    nodeManagement: ").append(toIndentedString(nodeManagement)).append("\n");
        sb.append("    podSecurityGroups: ").append(toIndentedString(podSecurityGroups)).append("\n");
        sb.append("    customSecurityGroups: ").append(toIndentedString(customSecurityGroups)).append("\n");
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
