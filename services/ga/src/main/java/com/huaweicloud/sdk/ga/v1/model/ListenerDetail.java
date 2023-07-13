package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 监听器实例。
 */
public class ListenerDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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
    @JsonProperty(value = "status")

    private ConfigStatus status;

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
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_info")

    private FrozenInfo frozenInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    public ListenerDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 监听器ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListenerDetail withName(String name) {
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

    public ListenerDetail withDescription(String description) {
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

    public ListenerDetail withProtocol(ListenerProtocol protocol) {
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

    public ListenerDetail withStatus(ConfigStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public ConfigStatus getStatus() {
        return status;
    }

    public void setStatus(ConfigStatus status) {
        this.status = status;
    }

    public ListenerDetail withPortRanges(List<PortRange> portRanges) {
        this.portRanges = portRanges;
        return this;
    }

    public ListenerDetail addPortRangesItem(PortRange portRangesItem) {
        if (this.portRanges == null) {
            this.portRanges = new ArrayList<>();
        }
        this.portRanges.add(portRangesItem);
        return this;
    }

    public ListenerDetail withPortRanges(Consumer<List<PortRange>> portRangesSetter) {
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

    public ListenerDetail withClientAffinity(ClientAffinity clientAffinity) {
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

    public ListenerDetail withAcceleratorId(String acceleratorId) {
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

    public ListenerDetail withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ListenerDetail withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ListenerDetail withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListenerDetail withFrozenInfo(FrozenInfo frozenInfo) {
        this.frozenInfo = frozenInfo;
        return this;
    }

    public ListenerDetail withFrozenInfo(Consumer<FrozenInfo> frozenInfoSetter) {
        if (this.frozenInfo == null) {
            this.frozenInfo = new FrozenInfo();
            frozenInfoSetter.accept(this.frozenInfo);
        }

        return this;
    }

    /**
     * Get frozenInfo
     * @return frozenInfo
     */
    public FrozenInfo getFrozenInfo() {
        return frozenInfo;
    }

    public void setFrozenInfo(FrozenInfo frozenInfo) {
        this.frozenInfo = frozenInfo;
    }

    public ListenerDetail withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public ListenerDetail addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListenerDetail withTags(Consumer<List<ResourceTag>> tagsSetter) {
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
        ListenerDetail that = (ListenerDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.status, that.status) && Objects.equals(this.portRanges, that.portRanges)
            && Objects.equals(this.clientAffinity, that.clientAffinity)
            && Objects.equals(this.acceleratorId, that.acceleratorId) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.frozenInfo, that.frozenInfo) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            protocol,
            status,
            portRanges,
            clientAffinity,
            acceleratorId,
            createdAt,
            updatedAt,
            domainId,
            frozenInfo,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListenerDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    portRanges: ").append(toIndentedString(portRanges)).append("\n");
        sb.append("    clientAffinity: ").append(toIndentedString(clientAffinity)).append("\n");
        sb.append("    acceleratorId: ").append(toIndentedString(acceleratorId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    frozenInfo: ").append(toIndentedString(frozenInfo)).append("\n");
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
