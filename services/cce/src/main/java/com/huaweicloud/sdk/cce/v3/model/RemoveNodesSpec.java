package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.Login;
import com.huaweicloud.sdk.cce.v3.model.NodeItem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RemoveNodesSpec
 */
public class RemoveNodesSpec  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="login")
    
    private Login login;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodes")
    
    private List<NodeItem> nodes = null;
    
    public RemoveNodesSpec withLogin(Login login) {
        this.login = login;
        return this;
    }

    public RemoveNodesSpec withLogin(Consumer<Login> loginSetter) {
        if(this.login == null ){
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
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public RemoveNodesSpec withNodes(Consumer<List<NodeItem>> nodesSetter) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 待操作节点列表
     * @return nodes
     */
    public List<NodeItem> getNodes() {
        return nodes;
    }

    public void setNodes(List<NodeItem> nodes) {
        this.nodes = nodes;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RemoveNodesSpec removeNodesSpec = (RemoveNodesSpec) o;
        return Objects.equals(this.login, removeNodesSpec.login) &&
            Objects.equals(this.nodes, removeNodesSpec.nodes);
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

