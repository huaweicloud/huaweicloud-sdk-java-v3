package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MappingRules
 */
public class MappingRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local")

    private List<RulesLocal> local = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote")

    private List<RulesRemote> remote = null;

    public MappingRules withLocal(List<RulesLocal> local) {
        this.local = local;
        return this;
    }

    public MappingRules addLocalItem(RulesLocal localItem) {
        if (this.local == null) {
            this.local = new ArrayList<>();
        }
        this.local.add(localItem);
        return this;
    }

    public MappingRules withLocal(Consumer<List<RulesLocal>> localSetter) {
        if (this.local == null) {
            this.local = new ArrayList<>();
        }
        localSetter.accept(this.local);
        return this;
    }

    /**
     * 表示联邦用户在本系统中的用户信息。 user：联邦用户在本系统中的用户名称。group：联邦用户在本系统中所属用户组。
     * @return local
     */
    public List<RulesLocal> getLocal() {
        return local;
    }

    public void setLocal(List<RulesLocal> local) {
        this.local = local;
    }

    public MappingRules withRemote(List<RulesRemote> remote) {
        this.remote = remote;
        return this;
    }

    public MappingRules addRemoteItem(RulesRemote remoteItem) {
        if (this.remote == null) {
            this.remote = new ArrayList<>();
        }
        this.remote.add(remoteItem);
        return this;
    }

    public MappingRules withRemote(Consumer<List<RulesRemote>> remoteSetter) {
        if (this.remote == null) {
            this.remote = new ArrayList<>();
        }
        remoteSetter.accept(this.remote);
        return this;
    }

    /**
     * 表示联邦用户在IdP中的用户信息。由断言属性及运算符组成的表达式，取值由断言决定。
     * @return remote
     */
    public List<RulesRemote> getRemote() {
        return remote;
    }

    public void setRemote(List<RulesRemote> remote) {
        this.remote = remote;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MappingRules that = (MappingRules) obj;
        return Objects.equals(this.local, that.local) && Objects.equals(this.remote, that.remote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(local, remote);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MappingRules {\n");
        sb.append("    local: ").append(toIndentedString(local)).append("\n");
        sb.append("    remote: ").append(toIndentedString(remote)).append("\n");
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
