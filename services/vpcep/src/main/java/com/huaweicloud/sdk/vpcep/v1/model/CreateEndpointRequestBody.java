package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 创建终端节接口请求结构体 */
public class CreateEndpointRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_service_id")

    private String endpointServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_dns")

    private Boolean enableDns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagList> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routetables")

    private List<String> routetables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_ip")

    private String portIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whitelist")

    private List<String> whitelist = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_whitelist")

    private Boolean enableWhitelist;

    public CreateEndpointRequestBody withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /** 说明： 创建Interface类型Client必选。需要指定vpc_id对应VPC下已 创建的网络（network）的 ID，UUID格式。 详细内容请参考《虚拟私有云 API参考》中的“查询子 网”，详见响应消息中的
     * “id”字段。 创建连接Interface类型终端节 点服务的终端节点时，此参数 必选。 说明 ● VPC的子网网段不能与 198.19.128.0/17重叠 ● VPC路由表中自定义路由的目 的地址不能与
     * 198.19.128.0/17重叠
     * 
     * @return subnetId */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CreateEndpointRequestBody withEndpointServiceId(String endpointServiceId) {
        this.endpointServiceId = endpointServiceId;
        return this;
    }

    /** 终端节点服务的ID。 可以通过查询终端节点服务概 要获取要连接的终端节点服务 ID。
     * 
     * @return endpointServiceId */
    public String getEndpointServiceId() {
        return endpointServiceId;
    }

    public void setEndpointServiceId(String endpointServiceId) {
        this.endpointServiceId = endpointServiceId;
    }

    public CreateEndpointRequestBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /** 终端节点所在的VPC的ID。 详细内容请参考《虚拟私有云 API参考》中的“查询VPC”， 详见响应消息中的“id”字 段。
     * 
     * @return vpcId */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateEndpointRequestBody withEnableDns(Boolean enableDns) {
        this.enableDns = enableDns;
        return this;
    }

    /** 是否创建域名。 ● true：创建域名 ● false：不创建域名 默认值为false。 说明 当创建连接gateway类型终端节点服务的终端节点时，“enable_dns”设置为true或者false，均不创建域名。
     * 
     * @return enableDns */
    public Boolean getEnableDns() {
        return enableDns;
    }

    public void setEnableDns(Boolean enableDns) {
        this.enableDns = enableDns;
    }

    public CreateEndpointRequestBody withTags(List<TagList> tags) {
        this.tags = tags;
        return this;
    }

    public CreateEndpointRequestBody addTagsItem(TagList tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateEndpointRequestBody withTags(Consumer<List<TagList>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 标签列表，没有标签默认为空数组。
     * 
     * @return tags */
    public List<TagList> getTags() {
        return tags;
    }

    public void setTags(List<TagList> tags) {
        this.tags = tags;
    }

    public CreateEndpointRequestBody withRoutetables(List<String> routetables) {
        this.routetables = routetables;
        return this;
    }

    public CreateEndpointRequestBody addRoutetablesItem(String routetablesItem) {
        if (this.routetables == null) {
            this.routetables = new ArrayList<>();
        }
        this.routetables.add(routetablesItem);
        return this;
    }

    public CreateEndpointRequestBody withRoutetables(Consumer<List<String>> routetablesSetter) {
        if (this.routetables == null) {
            this.routetables = new ArrayList<>();
        }
        routetablesSetter.accept(this.routetables);
        return this;
    }

    /** 路由表ID列表。详细内容请参考《虚拟私有云 API参考》中的“查询VPC路由”，详见响应消息中的“id”字段。 创建连接gateway类型终端节点服务的终节点时，此参数必选。 说明 不设置此参数时，选择默认路由表。
     * 
     * @return routetables */
    public List<String> getRoutetables() {
        return routetables;
    }

    public void setRoutetables(List<String> routetables) {
        this.routetables = routetables;
    }

    public CreateEndpointRequestBody withPortIp(String portIp) {
        this.portIp = portIp;
        return this;
    }

    /** 访问所连接的终端节点服务的IP。 创建终端节点时，可以指定访问所连接的终端节点服务的IP，目前只支持IPv4类型 。 创建连接Interface类型终端节点服务的终端节点时，此参数必选。
     * 
     * @return portIp */
    public String getPortIp() {
        return portIp;
    }

    public void setPortIp(String portIp) {
        this.portIp = portIp;
    }

    public CreateEndpointRequestBody withWhitelist(List<String> whitelist) {
        this.whitelist = whitelist;
        return this;
    }

    public CreateEndpointRequestBody addWhitelistItem(String whitelistItem) {
        if (this.whitelist == null) {
            this.whitelist = new ArrayList<>();
        }
        this.whitelist.add(whitelistItem);
        return this;
    }

    public CreateEndpointRequestBody withWhitelist(Consumer<List<String>> whitelistSetter) {
        if (this.whitelist == null) {
            this.whitelist = new ArrayList<>();
        }
        whitelistSetter.accept(this.whitelist);
        return this;
    }

    /** 添加用于控制访问终端节点的白名单。 创建终端节点时，支持访问控制，使用此参数可以添加IPv4或CIDR，默认空列表。 仅当创建连接Interface类型终端节点服务的终端节点时，支持设置此参数。
     * 
     * @return whitelist */
    public List<String> getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(List<String> whitelist) {
        this.whitelist = whitelist;
    }

    public CreateEndpointRequestBody withEnableWhitelist(Boolean enableWhitelist) {
        this.enableWhitelist = enableWhitelist;
        return this;
    }

    /** 是否开启网络ACL隔离。
     * 
     * @return enableWhitelist */
    public Boolean getEnableWhitelist() {
        return enableWhitelist;
    }

    public void setEnableWhitelist(Boolean enableWhitelist) {
        this.enableWhitelist = enableWhitelist;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateEndpointRequestBody createEndpointRequestBody = (CreateEndpointRequestBody) o;
        return Objects.equals(this.subnetId, createEndpointRequestBody.subnetId)
            && Objects.equals(this.endpointServiceId, createEndpointRequestBody.endpointServiceId)
            && Objects.equals(this.vpcId, createEndpointRequestBody.vpcId)
            && Objects.equals(this.enableDns, createEndpointRequestBody.enableDns)
            && Objects.equals(this.tags, createEndpointRequestBody.tags)
            && Objects.equals(this.routetables, createEndpointRequestBody.routetables)
            && Objects.equals(this.portIp, createEndpointRequestBody.portIp)
            && Objects.equals(this.whitelist, createEndpointRequestBody.whitelist)
            && Objects.equals(this.enableWhitelist, createEndpointRequestBody.enableWhitelist);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(subnetId, endpointServiceId, vpcId, enableDns, tags, routetables, portIp, whitelist, enableWhitelist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEndpointRequestBody {\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    endpointServiceId: ").append(toIndentedString(endpointServiceId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    enableDns: ").append(toIndentedString(enableDns)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    routetables: ").append(toIndentedString(routetables)).append("\n");
        sb.append("    portIp: ").append(toIndentedString(portIp)).append("\n");
        sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
        sb.append("    enableWhitelist: ").append(toIndentedString(enableWhitelist)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
