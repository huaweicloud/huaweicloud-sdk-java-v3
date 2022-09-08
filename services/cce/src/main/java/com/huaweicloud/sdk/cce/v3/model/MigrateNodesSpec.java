package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MigrateNodesSpec
 */
public class MigrateNodesSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os")

    private String os;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParam")

    private MigrateNodeExtendParam extendParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login")

    private Login login;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<NodeItem> nodes = null;

    public MigrateNodesSpec withOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * 操作系统类型，须精确到版本号。 当指定“alpha.cce/NodeImageID”参数时，“os”参数必须和用户自定义镜像的操作系统一致。 
     * @return os
     */
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public MigrateNodesSpec withExtendParam(MigrateNodeExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public MigrateNodesSpec withExtendParam(Consumer<MigrateNodeExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new MigrateNodeExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public MigrateNodeExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(MigrateNodeExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    public MigrateNodesSpec withLogin(Login login) {
        this.login = login;
        return this;
    }

    public MigrateNodesSpec withLogin(Consumer<Login> loginSetter) {
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

    public MigrateNodesSpec withNodes(List<NodeItem> nodes) {
        this.nodes = nodes;
        return this;
    }

    public MigrateNodesSpec addNodesItem(NodeItem nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public MigrateNodesSpec withNodes(Consumer<List<NodeItem>> nodesSetter) {
        if (this.nodes == null) {
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
        MigrateNodesSpec migrateNodesSpec = (MigrateNodesSpec) o;
        return Objects.equals(this.os, migrateNodesSpec.os)
            && Objects.equals(this.extendParam, migrateNodesSpec.extendParam)
            && Objects.equals(this.login, migrateNodesSpec.login) && Objects.equals(this.nodes, migrateNodesSpec.nodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(os, extendParam, login, nodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateNodesSpec {\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
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
