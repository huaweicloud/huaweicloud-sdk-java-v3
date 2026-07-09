package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源池状态信息。
 */
public class PoolStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private PoolStatusResources resources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private List<PoolStatusScope> scope = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver")

    private PoolStatusDriver driver;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent")

    private String parent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root")

    private String root;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusters")

    private PoolStatusClusters clusters;

    public PoolStatus withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * **参数解释**：资源池的状态。 **取值范围**：可选值如下： - Creating：资源池在创建中。 - Running：资源池在运行中。 - Abnormal：资源池异常。 - Deleting：资源池在删除中。 - Error：资源池错误。
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public PoolStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释**：资源池当前状态的提示信息。 **取值范围**：不涉及。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PoolStatus withResources(PoolStatusResources resources) {
        this.resources = resources;
        return this;
    }

    public PoolStatus withResources(Consumer<PoolStatusResources> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new PoolStatusResources();
            resourcesSetter.accept(this.resources);
        }

        return this;
    }

    /**
     * Get resources
     * @return resources
     */
    public PoolStatusResources getResources() {
        return resources;
    }

    public void setResources(PoolStatusResources resources) {
        this.resources = resources;
    }

    public PoolStatus withScope(List<PoolStatusScope> scope) {
        this.scope = scope;
        return this;
    }

    public PoolStatus addScopeItem(PoolStatusScope scopeItem) {
        if (this.scope == null) {
            this.scope = new ArrayList<>();
        }
        this.scope.add(scopeItem);
        return this;
    }

    public PoolStatus withScope(Consumer<List<PoolStatusScope>> scopeSetter) {
        if (this.scope == null) {
            this.scope = new ArrayList<>();
        }
        scopeSetter.accept(this.scope);
        return this;
    }

    /**
     * **参数解释**：资源池当前支持的业务类型的状态信息。
     * @return scope
     */
    public List<PoolStatusScope> getScope() {
        return scope;
    }

    public void setScope(List<PoolStatusScope> scope) {
        this.scope = scope;
    }

    public PoolStatus withDriver(PoolStatusDriver driver) {
        this.driver = driver;
        return this;
    }

    public PoolStatus withDriver(Consumer<PoolStatusDriver> driverSetter) {
        if (this.driver == null) {
            this.driver = new PoolStatusDriver();
            driverSetter.accept(this.driver);
        }

        return this;
    }

    /**
     * Get driver
     * @return driver
     */
    public PoolStatusDriver getDriver() {
        return driver;
    }

    public void setDriver(PoolStatusDriver driver) {
        this.driver = driver;
    }

    public PoolStatus withParent(String parent) {
        this.parent = parent;
        return this;
    }

    /**
     * **参数解释**：资源池所属父资源池的ID。物理池为空。 **取值范围**：不涉及。
     * @return parent
     */
    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public PoolStatus withRoot(String root) {
        this.root = root;
        return this;
    }

    /**
     * **参数解释**：资源池根资源池的ID。 **取值范围**：不涉及。
     * @return root
     */
    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public PoolStatus withClusters(PoolStatusClusters clusters) {
        this.clusters = clusters;
        return this;
    }

    public PoolStatus withClusters(Consumer<PoolStatusClusters> clustersSetter) {
        if (this.clusters == null) {
            this.clusters = new PoolStatusClusters();
            clustersSetter.accept(this.clusters);
        }

        return this;
    }

    /**
     * Get clusters
     * @return clusters
     */
    public PoolStatusClusters getClusters() {
        return clusters;
    }

    public void setClusters(PoolStatusClusters clusters) {
        this.clusters = clusters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolStatus that = (PoolStatus) obj;
        return Objects.equals(this.phase, that.phase) && Objects.equals(this.message, that.message)
            && Objects.equals(this.resources, that.resources) && Objects.equals(this.scope, that.scope)
            && Objects.equals(this.driver, that.driver) && Objects.equals(this.parent, that.parent)
            && Objects.equals(this.root, that.root) && Objects.equals(this.clusters, that.clusters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase, message, resources, scope, driver, parent, root, clusters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolStatus {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
        sb.append("    root: ").append(toIndentedString(root)).append("\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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
