package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.OsfederationGroups;
import com.huaweicloud.sdk.iam.v3.model.OsfederationIdentityprovider;
import com.huaweicloud.sdk.iam.v3.model.OsfederationProtocol;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class TokenUserOsfederation  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="groups")
    
    private List<OsfederationGroups> groups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="identity_provider")
    
    private OsfederationIdentityprovider identityProvider;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private OsfederationProtocol protocol;

    public TokenUserOsfederation withGroups(List<OsfederationGroups> groups) {
        this.groups = groups;
        return this;
    }

    
    public TokenUserOsfederation addGroupsItem(OsfederationGroups groupsItem) {
        if(this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public TokenUserOsfederation withGroups(Consumer<List<OsfederationGroups>> groupsSetter) {
        if(this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * 用户组信息列表。
     * @return groups
     */
    public List<OsfederationGroups> getGroups() {
        return groups;
    }

    public void setGroups(List<OsfederationGroups> groups) {
        this.groups = groups;
    }

    

    public TokenUserOsfederation withIdentityProvider(OsfederationIdentityprovider identityProvider) {
        this.identityProvider = identityProvider;
        return this;
    }

    public TokenUserOsfederation withIdentityProvider(Consumer<OsfederationIdentityprovider> identityProviderSetter) {
        if(this.identityProvider == null ){
            this.identityProvider = new OsfederationIdentityprovider();
            identityProviderSetter.accept(this.identityProvider);
        }
        
        return this;
    }


    /**
     * Get identityProvider
     * @return identityProvider
     */
    public OsfederationIdentityprovider getIdentityProvider() {
        return identityProvider;
    }

    public void setIdentityProvider(OsfederationIdentityprovider identityProvider) {
        this.identityProvider = identityProvider;
    }

    

    public TokenUserOsfederation withProtocol(OsfederationProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    public TokenUserOsfederation withProtocol(Consumer<OsfederationProtocol> protocolSetter) {
        if(this.protocol == null ){
            this.protocol = new OsfederationProtocol();
            protocolSetter.accept(this.protocol);
        }
        
        return this;
    }


    /**
     * Get protocol
     * @return protocol
     */
    public OsfederationProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(OsfederationProtocol protocol) {
        this.protocol = protocol;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TokenUserOsfederation tokenUserOsfederation = (TokenUserOsfederation) o;
        return Objects.equals(this.groups, tokenUserOsfederation.groups) &&
            Objects.equals(this.identityProvider, tokenUserOsfederation.identityProvider) &&
            Objects.equals(this.protocol, tokenUserOsfederation.protocol);
    }
    @Override
    public int hashCode() {
        return Objects.hash(groups, identityProvider, protocol);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TokenUserOsfederation {\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    identityProvider: ").append(toIndentedString(identityProvider)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

