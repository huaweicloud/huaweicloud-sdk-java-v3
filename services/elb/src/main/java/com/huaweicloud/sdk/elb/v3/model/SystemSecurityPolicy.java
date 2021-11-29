package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** SystemSecurityPolicy */
public class SystemSecurityPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocols")

    private List<String> protocols = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ciphers")

    private List<String> ciphers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public SystemSecurityPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /** 系统安全策略的名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SystemSecurityPolicy withProtocols(List<String> protocols) {
        this.protocols = protocols;
        return this;
    }

    public SystemSecurityPolicy addProtocolsItem(String protocolsItem) {
        if (this.protocols == null) {
            this.protocols = new ArrayList<>();
        }
        this.protocols.add(protocolsItem);
        return this;
    }

    public SystemSecurityPolicy withProtocols(Consumer<List<String>> protocolsSetter) {
        if (this.protocols == null) {
            this.protocols = new ArrayList<>();
        }
        protocolsSetter.accept(this.protocols);
        return this;
    }

    /** 系统安全策略的TLS协议列表。
     * 
     * @return protocols */
    public List<String> getProtocols() {
        return protocols;
    }

    public void setProtocols(List<String> protocols) {
        this.protocols = protocols;
    }

    public SystemSecurityPolicy withCiphers(List<String> ciphers) {
        this.ciphers = ciphers;
        return this;
    }

    public SystemSecurityPolicy addCiphersItem(String ciphersItem) {
        if (this.ciphers == null) {
            this.ciphers = new ArrayList<>();
        }
        this.ciphers.add(ciphersItem);
        return this;
    }

    public SystemSecurityPolicy withCiphers(Consumer<List<String>> ciphersSetter) {
        if (this.ciphers == null) {
            this.ciphers = new ArrayList<>();
        }
        ciphersSetter.accept(this.ciphers);
        return this;
    }

    /** 系统安全策略的加密套件列表。
     * 
     * @return ciphers */
    public List<String> getCiphers() {
        return ciphers;
    }

    public void setCiphers(List<String> ciphers) {
        this.ciphers = ciphers;
    }

    public SystemSecurityPolicy withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 项目id。
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SystemSecurityPolicy systemSecurityPolicy = (SystemSecurityPolicy) o;
        return Objects.equals(this.name, systemSecurityPolicy.name)
            && Objects.equals(this.protocols, systemSecurityPolicy.protocols)
            && Objects.equals(this.ciphers, systemSecurityPolicy.ciphers)
            && Objects.equals(this.projectId, systemSecurityPolicy.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, protocols, ciphers, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemSecurityPolicy {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
        sb.append("    ciphers: ").append(toIndentedString(ciphers)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
