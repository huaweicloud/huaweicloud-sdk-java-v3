package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源池描述信息更新参数。
 */
public class PoolSpecUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private List<String> scope = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<PoolSpecUpdateResources> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobFlavors")

    private List<String> jobFlavors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver")

    private PoolDriver driver;

    public PoolSpecUpdate withScope(List<String> scope) {
        this.scope = scope;
        return this;
    }

    public PoolSpecUpdate addScopeItem(String scopeItem) {
        if (this.scope == null) {
            this.scope = new ArrayList<>();
        }
        this.scope.add(scopeItem);
        return this;
    }

    public PoolSpecUpdate withScope(Consumer<List<String>> scopeSetter) {
        if (this.scope == null) {
            this.scope = new ArrayList<>();
        }
        scopeSetter.accept(this.scope);
        return this;
    }

    /**
     * **参数解释**：更新启用的作业类型。 **约束限制**：不涉及。 **取值范围**：可选值如下： - Train：训练作业 - Infer：推理作业 - Notebook：Notebook作业 **默认取值**：不涉及。
     * @return scope
     */
    public List<String> getScope() {
        return scope;
    }

    public void setScope(List<String> scope) {
        this.scope = scope;
    }

    public PoolSpecUpdate withResources(List<PoolSpecUpdateResources> resources) {
        this.resources = resources;
        return this;
    }

    public PoolSpecUpdate addResourcesItem(PoolSpecUpdateResources resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public PoolSpecUpdate withResources(Consumer<List<PoolSpecUpdateResources>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * **参数解释**：更新的资源规格列表。
     * @return resources
     */
    public List<PoolSpecUpdateResources> getResources() {
        return resources;
    }

    public void setResources(List<PoolSpecUpdateResources> resources) {
        this.resources = resources;
    }

    public PoolSpecUpdate withJobFlavors(List<String> jobFlavors) {
        this.jobFlavors = jobFlavors;
        return this;
    }

    public PoolSpecUpdate addJobFlavorsItem(String jobFlavorsItem) {
        if (this.jobFlavors == null) {
            this.jobFlavors = new ArrayList<>();
        }
        this.jobFlavors.add(jobFlavorsItem);
        return this;
    }

    public PoolSpecUpdate withJobFlavors(Consumer<List<String>> jobFlavorsSetter) {
        if (this.jobFlavors == null) {
            this.jobFlavors = new ArrayList<>();
        }
        jobFlavorsSetter.accept(this.jobFlavors);
        return this;
    }

    /**
     * **参数解释**：资源池支持的作业规格信息列表。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return jobFlavors
     */
    public List<String> getJobFlavors() {
        return jobFlavors;
    }

    public void setJobFlavors(List<String> jobFlavors) {
        this.jobFlavors = jobFlavors;
    }

    public PoolSpecUpdate withDriver(PoolDriver driver) {
        this.driver = driver;
        return this;
    }

    public PoolSpecUpdate withDriver(Consumer<PoolDriver> driverSetter) {
        if (this.driver == null) {
            this.driver = new PoolDriver();
            driverSetter.accept(this.driver);
        }

        return this;
    }

    /**
     * Get driver
     * @return driver
     */
    public PoolDriver getDriver() {
        return driver;
    }

    public void setDriver(PoolDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolSpecUpdate that = (PoolSpecUpdate) obj;
        return Objects.equals(this.scope, that.scope) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.jobFlavors, that.jobFlavors) && Objects.equals(this.driver, that.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scope, resources, jobFlavors, driver);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolSpecUpdate {\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    jobFlavors: ").append(toIndentedString(jobFlavors)).append("\n");
        sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
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
