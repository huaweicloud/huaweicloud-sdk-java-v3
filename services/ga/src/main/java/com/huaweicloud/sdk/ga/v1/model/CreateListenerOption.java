package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建监听器的详细信息。
 */
public class CreateListenerOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ListenerProtocol protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_ranges")

    private List<PortRange> portRanges = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_affinity")

    private ClientAffinity clientAffinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accelerator_id")

    private String acceleratorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    public CreateListenerOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 监听器名称，取值范围：1~64个字符之间，只能由数字、字母、中划线和中文组成。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateListenerOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 监听器的描述信息，取值范围：0~255个字符之间，禁止输入字符：<>。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateListenerOption withProtocol(ListenerProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get protocol
     * @return protocol
     */
    public ListenerProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(ListenerProtocol protocol) {
        this.protocol = protocol;
    }

    public CreateListenerOption withPortRanges(List<PortRange> portRanges) {
        this.portRanges = portRanges;
        return this;
    }

    public CreateListenerOption addPortRangesItem(PortRange portRangesItem) {
        if (this.portRanges == null) {
            this.portRanges = new ArrayList<>();
        }
        this.portRanges.add(portRangesItem);
        return this;
    }

    public CreateListenerOption withPortRanges(Consumer<List<PortRange>> portRangesSetter) {
        if (this.portRanges == null) {
            this.portRanges = new ArrayList<>();
        }
        portRangesSetter.accept(this.portRanges);
        return this;
    }

    /**
     * 监听端口范围列表。
     * @return portRanges
     */
    public List<PortRange> getPortRanges() {
        return portRanges;
    }

    public void setPortRanges(List<PortRange> portRanges) {
        this.portRanges = portRanges;
    }

    public CreateListenerOption withClientAffinity(ClientAffinity clientAffinity) {
        this.clientAffinity = clientAffinity;
        return this;
    }

    /**
     * Get clientAffinity
     * @return clientAffinity
     */
    public ClientAffinity getClientAffinity() {
        return clientAffinity;
    }

    public void setClientAffinity(ClientAffinity clientAffinity) {
        this.clientAffinity = clientAffinity;
    }

    public CreateListenerOption withAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }

    /**
     * 全球加速实例ID。
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return acceleratorId;
    }

    public void setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
    }

    public CreateListenerOption withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateListenerOption addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateListenerOption withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateListenerOption that = (CreateListenerOption) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.portRanges, that.portRanges)
            && Objects.equals(this.clientAffinity, that.clientAffinity)
            && Objects.equals(this.acceleratorId, that.acceleratorId) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, protocol, portRanges, clientAffinity, acceleratorId, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateListenerOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    portRanges: ").append(toIndentedString(portRanges)).append("\n");
        sb.append("    clientAffinity: ").append(toIndentedString(clientAffinity)).append("\n");
        sb.append("    acceleratorId: ").append(toIndentedString(acceleratorId)).append("\n");
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
