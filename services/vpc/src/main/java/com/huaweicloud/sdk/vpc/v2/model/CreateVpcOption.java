package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * vpc对象
 */
public class CreateVpcOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_service_endpoint_states")

    private String blockServiceEndpointStates;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_network_address_usage_metrics")

    private Boolean enableNetworkAddressUsageMetrics;

    public CreateVpcOption withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * 功能说明：虚拟私有云下可用子网的范围 取值范围： - 10.0.0.0/8 ~ 10.255.255.240/28 - 172.16.0.0/12 ~ 172.31.255.240/28 - 192.168.0.0/16 ~ 192.168.255.240/28 约束：必须是ipv4 cidr格式，例如:192.168.0.0/16
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public CreateVpcOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 功能说明：虚拟私有云名称 取值范围：0-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点） 约束：如果名称不为空，则同一个租户下的名称不能重复
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateVpcOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 功能说明：虚拟私有云的描述 取值范围：0-255个字符，不能包含“<”和“>”。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateVpcOption withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 功能说明：企业项目ID。创建虚拟私有云时，给虚拟私有云绑定企业项目ID。 取值范围：最大长度36字节，带“-”连字符的UUID格式，或者是字符串“0”。“0”表示默认企业项目。 默认值：\"0\"
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateVpcOption withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CreateVpcOption addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateVpcOption withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 功能说明：VPC资源标签。创建VPC时，给VPC添加资源标签。 取值范围：最大10个标签, key：标签名称; value：标签值。 格式：[key*value]，每一个标签的key和value之间用*连接
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public CreateVpcOption withBlockServiceEndpointStates(String blockServiceEndpointStates) {
        this.blockServiceEndpointStates = blockServiceEndpointStates;
        return this;
    }

    /**
     * 功能说明：默认情况下，VPC中的资源可以通过内网访问服务终结点。开启该项后，VPC将无法通过内网访问服务终结点，请谨慎操作。 无法访问以下云服务：容器镜像服务SWR、云日志服务LTS、企业主机安全HSS、应用运维管理AOM、应用性能管理APM、对象存储服务OBS、API网关APIG。 取值范围： off：代表禁用。 on：代表开启。
     * @return blockServiceEndpointStates
     */
    public String getBlockServiceEndpointStates() {
        return blockServiceEndpointStates;
    }

    public void setBlockServiceEndpointStates(String blockServiceEndpointStates) {
        this.blockServiceEndpointStates = blockServiceEndpointStates;
    }

    public CreateVpcOption withEnableNetworkAddressUsageMetrics(Boolean enableNetworkAddressUsageMetrics) {
        this.enableNetworkAddressUsageMetrics = enableNetworkAddressUsageMetrics;
        return this;
    }

    /**
     * 功能说明：是否开启VPC内所有子网的IPv4地址使用量指标监控。 取值范围： true：开启 false：不开启
     * @return enableNetworkAddressUsageMetrics
     */
    public Boolean getEnableNetworkAddressUsageMetrics() {
        return enableNetworkAddressUsageMetrics;
    }

    public void setEnableNetworkAddressUsageMetrics(Boolean enableNetworkAddressUsageMetrics) {
        this.enableNetworkAddressUsageMetrics = enableNetworkAddressUsageMetrics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVpcOption that = (CreateVpcOption) obj;
        return Objects.equals(this.cidr, that.cidr) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.blockServiceEndpointStates, that.blockServiceEndpointStates)
            && Objects.equals(this.enableNetworkAddressUsageMetrics, that.enableNetworkAddressUsageMetrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cidr,
            name,
            description,
            enterpriseProjectId,
            tags,
            blockServiceEndpointStates,
            enableNetworkAddressUsageMetrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVpcOption {\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    blockServiceEndpointStates: ").append(toIndentedString(blockServiceEndpointStates)).append("\n");
        sb.append("    enableNetworkAddressUsageMetrics: ")
            .append(toIndentedString(enableNetworkAddressUsageMetrics))
            .append("\n");
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
