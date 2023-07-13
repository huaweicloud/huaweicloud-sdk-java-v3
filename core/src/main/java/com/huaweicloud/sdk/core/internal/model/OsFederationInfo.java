package com.huaweicloud.sdk.core.internal.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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

    public List<Object> getGroups() {
        return groups;
    }

    public void setGroups(List<Object> groups) {
        this.groups = groups;
    }
}
