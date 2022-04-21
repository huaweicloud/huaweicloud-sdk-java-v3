package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * user详细信息。
 */
public class OsFederationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_provider")

    private IdpIdInfo identityProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ProtocolIdInfo protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<Object> groups = null;

    public OsFederationInfo withIdentityProvider(IdpIdInfo identityProvider) {
        this.identityProvider = identityProvider;
        return this;
    }

    public OsFederationInfo withIdentityProvider(Consumer<IdpIdInfo> identityProviderSetter) {
        if (this.identityProvider == null) {
            this.identityProvider = new IdpIdInfo();
            identityProviderSetter.accept(this.identityProvider);
        }

        return this;
    }

    /**
     * Get identityProvider
     * @return identityProvider
     */
    public IdpIdInfo getIdentityProvider() {
        return identityProvider;
    }

    public void setIdentityProvider(IdpIdInfo identityProvider) {
        this.identityProvider = identityProvider;
    }

    public OsFederationInfo withProtocol(ProtocolIdInfo protocol) {
        this.protocol = protocol;
        return this;
    }

    public OsFederationInfo withProtocol(Consumer<ProtocolIdInfo> protocolSetter) {
        if (this.protocol == null) {
            this.protocol = new ProtocolIdInfo();
            protocolSetter.accept(this.protocol);
        }

        return this;
    }

    /**
     * Get protocol
     * @return protocol
     */
    public ProtocolIdInfo getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolIdInfo protocol) {
        this.protocol = protocol;
    }

    public OsFederationInfo withGroups(List<Object> groups) {
        this.groups = groups;
        return this;
    }

    public OsFederationInfo addGroupsItem(Object groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public OsFederationInfo withGroups(Consumer<List<Object>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * 用户组信息。
     * @return groups
     */
    public List<Object> getGroups() {
        return groups;
    }

    public void setGroups(List<Object> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OsFederationInfo osFederationInfo = (OsFederationInfo) o;
        return Objects.equals(this.identityProvider, osFederationInfo.identityProvider)
            && Objects.equals(this.protocol, osFederationInfo.protocol)
            && Objects.equals(this.groups, osFederationInfo.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityProvider, protocol, groups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OsFederationInfo {\n");
        sb.append("    identityProvider: ").append(toIndentedString(identityProvider)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
