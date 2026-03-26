package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Ray Serve中的应用。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
 */
public class ServeApplication {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_path")

    private String importPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployments")

    private List<Deployment> deployments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_env")

    private ServeRuntimeEnv runtimeEnv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_prefix")

    private String routePrefix;

    public ServeApplication withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：Application的名称。 **约束限制**：不涉及。 **取值范围**：长度为[1,64]的中文、字母、数字、下划线、中划线、半角句号（.）、空格的组合。 **默认取值**：不涉及。 
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
     * **参数解释**：输入路径。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return importPath
     */
    public String getImportPath() {
        return importPath;
    }

    public void setImportPath(String importPath) {
        this.importPath = importPath;
    }

    public ServeApplication withDeployments(List<Deployment> deployments) {
        this.deployments = deployments;
        return this;
    }

    public ServeApplication addDeploymentsItem(Deployment deploymentsItem) {
        if (this.deployments == null) {
            this.deployments = new ArrayList<>();
        }
        this.deployments.add(deploymentsItem);
        return this;
    }

    public ServeApplication withDeployments(Consumer<List<Deployment>> deploymentsSetter) {
        if (this.deployments == null) {
            this.deployments = new ArrayList<>();
        }
        deploymentsSetter.accept(this.deployments);
        return this;
    }

    /**
     * **参数解释**：Deployment列表。 **约束限制**：不涉及。 **取值范围**：[1,5]。 **默认取值**：不涉及。
     * @return deployments
     */
    public List<Deployment> getDeployments() {
        return deployments;
    }

    public void setDeployments(List<Deployment> deployments) {
        this.deployments = deployments;
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

    public ServeApplication withRoutePrefix(String routePrefix) {
        this.routePrefix = routePrefix;
        return this;
    }

    /**
     * **参数解释**：路由前缀。 **约束限制**：要求在RayServe中具有唯一性，不能跟其他的Application的前缀重复。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return routePrefix
     */
    public String getRoutePrefix() {
        return routePrefix;
    }

    public void setRoutePrefix(String routePrefix) {
        this.routePrefix = routePrefix;
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
            && Objects.equals(this.deployments, that.deployments) && Objects.equals(this.runtimeEnv, that.runtimeEnv)
            && Objects.equals(this.routePrefix, that.routePrefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, importPath, deployments, runtimeEnv, routePrefix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServeApplication {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    importPath: ").append(toIndentedString(importPath)).append("\n");
        sb.append("    deployments: ").append(toIndentedString(deployments)).append("\n");
        sb.append("    runtimeEnv: ").append(toIndentedString(runtimeEnv)).append("\n");
        sb.append("    routePrefix: ").append(toIndentedString(routePrefix)).append("\n");
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
