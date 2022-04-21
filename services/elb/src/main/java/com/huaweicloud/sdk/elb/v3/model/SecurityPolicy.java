package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 自定义安全策略信息
 */
public class SecurityPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listeners")

    private ListenerRef listeners;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocols")

    private List<String> protocols = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ciphers")

    private List<String> ciphers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public SecurityPolicy withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 自定义安全安全策略的id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SecurityPolicy withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 自定义安全策略的项目id。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public SecurityPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 自定义安全策略的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SecurityPolicy withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 自定义安全策略的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SecurityPolicy withListeners(ListenerRef listeners) {
        this.listeners = listeners;
        return this;
    }

    public SecurityPolicy withListeners(Consumer<ListenerRef> listenersSetter) {
        if (this.listeners == null) {
            this.listeners = new ListenerRef();
            listenersSetter.accept(this.listeners);
        }

        return this;
    }

    /**
     * Get listeners
     * @return listeners
     */
    public ListenerRef getListeners() {
        return listeners;
    }

    public void setListeners(ListenerRef listeners) {
        this.listeners = listeners;
    }

    public SecurityPolicy withProtocols(List<String> protocols) {
        this.protocols = protocols;
        return this;
    }

    public SecurityPolicy addProtocolsItem(String protocolsItem) {
        if (this.protocols == null) {
            this.protocols = new ArrayList<>();
        }
        this.protocols.add(protocolsItem);
        return this;
    }

    public SecurityPolicy withProtocols(Consumer<List<String>> protocolsSetter) {
        if (this.protocols == null) {
            this.protocols = new ArrayList<>();
        }
        protocolsSetter.accept(this.protocols);
        return this;
    }

    /**
     * 自定义安全策略的TLS协议列表。
     * @return protocols
     */
    public List<String> getProtocols() {
        return protocols;
    }

    public void setProtocols(List<String> protocols) {
        this.protocols = protocols;
    }

    public SecurityPolicy withCiphers(List<String> ciphers) {
        this.ciphers = ciphers;
        return this;
    }

    public SecurityPolicy addCiphersItem(String ciphersItem) {
        if (this.ciphers == null) {
            this.ciphers = new ArrayList<>();
        }
        this.ciphers.add(ciphersItem);
        return this;
    }

    public SecurityPolicy withCiphers(Consumer<List<String>> ciphersSetter) {
        if (this.ciphers == null) {
            this.ciphers = new ArrayList<>();
        }
        ciphersSetter.accept(this.ciphers);
        return this;
    }

    /**
     * 自定义安全策略的加密套件列表。
     * @return ciphers
     */
    public List<String> getCiphers() {
        return ciphers;
    }

    public void setCiphers(List<String> ciphers) {
        this.ciphers = ciphers;
    }

    public SecurityPolicy withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 自定义安全策略的创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public SecurityPolicy withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 自定义安全策略的更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecurityPolicy securityPolicy = (SecurityPolicy) o;
        return Objects.equals(this.id, securityPolicy.id) && Objects.equals(this.projectId, securityPolicy.projectId)
            && Objects.equals(this.name, securityPolicy.name)
            && Objects.equals(this.description, securityPolicy.description)
            && Objects.equals(this.listeners, securityPolicy.listeners)
            && Objects.equals(this.protocols, securityPolicy.protocols)
            && Objects.equals(this.ciphers, securityPolicy.ciphers)
            && Objects.equals(this.createdAt, securityPolicy.createdAt)
            && Objects.equals(this.updatedAt, securityPolicy.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, projectId, name, description, listeners, protocols, ciphers, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityPolicy {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
        sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
        sb.append("    ciphers: ").append(toIndentedString(ciphers)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
