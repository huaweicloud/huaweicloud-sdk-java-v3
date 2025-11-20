package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RemoveNodesSpec
 */
public class RemoveNodesSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login")

    private Login login;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<NodeItem> nodes = null;

    public RemoveNodesSpec withLogin(Login login) {
        this.login = login;
        return this;
    }

    public RemoveNodesSpec withLogin(Consumer<Login> loginSetter) {
        if (this.login == null) {
            this.login = new Login();
            loginSetter.accept(this.login);
        }

        return this;
    }

    /**
     * Get login
     * @return login
     */
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public RemoveNodesSpec withNodes(List<NodeItem> nodes) {
        this.nodes = nodes;
        return this;
    }

    public RemoveNodesSpec addNodesItem(NodeItem nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public RemoveNodesSpec withNodes(Consumer<List<NodeItem>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * **参数解释**： 待操作节点列表，当前最多支持同时移除200个节点。 **约束限制**： 不涉及 
     * @return nodes
     */
    public List<NodeItem> getNodes() {
        return nodes;
    }

    public void setNodes(List<NodeItem> nodes) {
        this.nodes = nodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemoveNodesSpec that = (RemoveNodesSpec) obj;
        return Objects.equals(this.login, that.login) && Objects.equals(this.nodes, that.nodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, nodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveNodesSpec {\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
