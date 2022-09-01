package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建增强型跨源连接的请求body体。
 */
public class CreateEnhancedConnectionsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_vpc_id")

    @JacksonXmlProperty(localName = "dest_vpc_id")

    private String destVpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_network_id")

    @JacksonXmlProperty(localName = "dest_network_id")

    private String destNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queues")

    @JacksonXmlProperty(localName = "queues")

    private List<String> queues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    @JacksonXmlProperty(localName = "hosts")

    private List<EnhancedConnectionsHost> hosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routetable_id")

    @JacksonXmlProperty(localName = "routetable_id")

    private String routetableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private List<JobsTags> tags = null;

    public CreateEnhancedConnectionsReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 连接名称。长度64，数字字母下划线组成。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateEnhancedConnectionsReq withDestVpcId(String destVpcId) {
        this.destVpcId = destVpcId;
        return this;
    }

    /**
     * 对应服务的vpc的ID。
     * @return destVpcId
     */
    public String getDestVpcId() {
        return destVpcId;
    }

    public void setDestVpcId(String destVpcId) {
        this.destVpcId = destVpcId;
    }

    public CreateEnhancedConnectionsReq withDestNetworkId(String destNetworkId) {
        this.destNetworkId = destNetworkId;
        return this;
    }

    /**
     * 对应服务的子网网络ID，即为需要建立连接的服务所在的子网。
     * @return destNetworkId
     */
    public String getDestNetworkId() {
        return destNetworkId;
    }

    public void setDestNetworkId(String destNetworkId) {
        this.destNetworkId = destNetworkId;
    }

    public CreateEnhancedConnectionsReq withQueues(List<String> queues) {
        this.queues = queues;
        return this;
    }

    public CreateEnhancedConnectionsReq addQueuesItem(String queuesItem) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        this.queues.add(queuesItem);
        return this;
    }

    public CreateEnhancedConnectionsReq withQueues(Consumer<List<String>> queuesSetter) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        queuesSetter.accept(this.queues);
        return this;
    }

    /**
     * 需要使用跨源的队列列表。
     * @return queues
     */
    public List<String> getQueues() {
        return queues;
    }

    public void setQueues(List<String> queues) {
        this.queues = queues;
    }

    public CreateEnhancedConnectionsReq withHosts(List<EnhancedConnectionsHost> hosts) {
        this.hosts = hosts;
        return this;
    }

    public CreateEnhancedConnectionsReq addHostsItem(EnhancedConnectionsHost hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public CreateEnhancedConnectionsReq withHosts(Consumer<List<EnhancedConnectionsHost>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * 用户自定义主机信息，最大支持2万条记录。
     * @return hosts
     */
    public List<EnhancedConnectionsHost> getHosts() {
        return hosts;
    }

    public void setHosts(List<EnhancedConnectionsHost> hosts) {
        this.hosts = hosts;
    }

    public CreateEnhancedConnectionsReq withRoutetableId(String routetableId) {
        this.routetableId = routetableId;
        return this;
    }

    /**
     * 对应服务的子网关联的路由表。
     * @return routetableId
     */
    public String getRoutetableId() {
        return routetableId;
    }

    public void setRoutetableId(String routetableId) {
        this.routetableId = routetableId;
    }

    public CreateEnhancedConnectionsReq withTags(List<JobsTags> tags) {
        this.tags = tags;
        return this;
    }

    public CreateEnhancedConnectionsReq addTagsItem(JobsTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateEnhancedConnectionsReq withTags(Consumer<List<JobsTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 作业的标签。具体请参考表tags。
     * @return tags
     */
    public List<JobsTags> getTags() {
        return tags;
    }

    public void setTags(List<JobsTags> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateEnhancedConnectionsReq createEnhancedConnectionsReq = (CreateEnhancedConnectionsReq) o;
        return Objects.equals(this.name, createEnhancedConnectionsReq.name)
            && Objects.equals(this.destVpcId, createEnhancedConnectionsReq.destVpcId)
            && Objects.equals(this.destNetworkId, createEnhancedConnectionsReq.destNetworkId)
            && Objects.equals(this.queues, createEnhancedConnectionsReq.queues)
            && Objects.equals(this.hosts, createEnhancedConnectionsReq.hosts)
            && Objects.equals(this.routetableId, createEnhancedConnectionsReq.routetableId)
            && Objects.equals(this.tags, createEnhancedConnectionsReq.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, destVpcId, destNetworkId, queues, hosts, routetableId, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEnhancedConnectionsReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    destVpcId: ").append(toIndentedString(destVpcId)).append("\n");
        sb.append("    destNetworkId: ").append(toIndentedString(destNetworkId)).append("\n");
        sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    routetableId: ").append(toIndentedString(routetableId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
