package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Serve 应用配置。
 */
public class ServeApplication {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_path")

    private String importPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_prefix")

    private String routePrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_env")

    private ServeRuntimeEnv runtimeEnv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployments")

    private List<ServeDeployment> deployments = null;

    public ServeApplication withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：应用名（L7 路由/计费维度）。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServeApplication withImportPath(String importPath) {
        this.importPath = importPath;
        return this;
    }

    /**
     * **参数解释**：Python 导入路径（模块:对象），如 voc_deepseek_server_v4:app。 **约束限制**：不能包含空格。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return importPath
     */
    public String getImportPath() {
        return importPath;
    }

    public void setImportPath(String importPath) {
        this.importPath = importPath;
    }

    public ServeApplication withRoutePrefix(String routePrefix) {
        this.routePrefix = routePrefix;
        return this;
    }

    /**
     * **参数解释**：路由前缀，端点内不可重复。 **约束限制**：必须以 / 开头，不能包含空格，且同一端点内多个应用的 route_prefix 不可重复。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return routePrefix
     */
    public String getRoutePrefix() {
        return routePrefix;
    }

    public void setRoutePrefix(String routePrefix) {
        this.routePrefix = routePrefix;
    }

    public ServeApplication withRuntimeEnv(ServeRuntimeEnv runtimeEnv) {
        this.runtimeEnv = runtimeEnv;
        return this;
    }

    public ServeApplication withRuntimeEnv(Consumer<ServeRuntimeEnv> runtimeEnvSetter) {
        if (this.runtimeEnv == null) {
            this.runtimeEnv = new ServeRuntimeEnv();
            runtimeEnvSetter.accept(this.runtimeEnv);
        }

        return this;
    }

    /**
     * Get runtimeEnv
     * @return runtimeEnv
     */
    public ServeRuntimeEnv getRuntimeEnv() {
        return runtimeEnv;
    }

    public void setRuntimeEnv(ServeRuntimeEnv runtimeEnv) {
        this.runtimeEnv = runtimeEnv;
    }

    public ServeApplication withDeployments(List<ServeDeployment> deployments) {
        this.deployments = deployments;
        return this;
    }

    public ServeApplication addDeploymentsItem(ServeDeployment deploymentsItem) {
        if (this.deployments == null) {
            this.deployments = new ArrayList<>();
        }
        this.deployments.add(deploymentsItem);
        return this;
    }

    public ServeApplication withDeployments(Consumer<List<ServeDeployment>> deploymentsSetter) {
        if (this.deployments == null) {
            this.deployments = new ArrayList<>();
        }
        deploymentsSetter.accept(this.deployments);
        return this;
    }

    /**
     * Get deployments
     * @return deployments
     */
    public List<ServeDeployment> getDeployments() {
        return deployments;
    }

    public void setDeployments(List<ServeDeployment> deployments) {
        this.deployments = deployments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServeApplication that = (ServeApplication) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.importPath, that.importPath)
            && Objects.equals(this.routePrefix, that.routePrefix) && Objects.equals(this.runtimeEnv, that.runtimeEnv)
            && Objects.equals(this.deployments, that.deployments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, importPath, routePrefix, runtimeEnv, deployments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServeApplication {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    importPath: ").append(toIndentedString(importPath)).append("\n");
        sb.append("    routePrefix: ").append(toIndentedString(routePrefix)).append("\n");
        sb.append("    runtimeEnv: ").append(toIndentedString(runtimeEnv)).append("\n");
        sb.append("    deployments: ").append(toIndentedString(deployments)).append("\n");
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
