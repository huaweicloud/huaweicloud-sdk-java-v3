package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源池创建请求体。
 */
public class PoolSpecCreation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private List<String> scope = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<PoolResourceFlavor> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network")

    private PoolSpecCreationNetwork network;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobFlavors")

    private List<String> jobFlavors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver")

    private PoolDriver driver;

    public PoolSpecCreation withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：资源池类型。 **约束限制**：不涉及。 **取值范围**：可选值如下： - Dedicate：物理资源池，独立的网络，支持网络打通，定制驱动，定制作业类型 - Logical：逻辑资源池。没有独立的网络，不支持网络打通，资源池创建和扩缩容相较物理资源池更快。 **默认取值**：不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PoolSpecCreation withScope(List<String> scope) {
        this.scope = scope;
        return this;
    }

    public PoolSpecCreation addScopeItem(String scopeItem) {
        if (this.scope == null) {
            this.scope = new ArrayList<>();
        }
        this.scope.add(scopeItem);
        return this;
    }

    public PoolSpecCreation withScope(Consumer<List<String>> scopeSetter) {
        if (this.scope == null) {
            this.scope = new ArrayList<>();
        }
        scopeSetter.accept(this.scope);
        return this;
    }

    /**
     * **参数解释**：资源池支持的作业类型。 **约束限制**：不涉及。 **取值范围**：用户创建标准资源池时至少选择一种，物理资源池支持全部选择。可选值如下： - Train：训练作业 - Infer：推理作业 - Notebook：Notebook作业 **默认取值**：不涉及。
     * @return scope
     */
    public List<String> getScope() {
        return scope;
    }

    public void setScope(List<String> scope) {
        this.scope = scope;
    }

    public PoolSpecCreation withResources(List<PoolResourceFlavor> resources) {
        this.resources = resources;
        return this;
    }

    public PoolSpecCreation addResourcesItem(PoolResourceFlavor resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public PoolSpecCreation withResources(Consumer<List<PoolResourceFlavor>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * **参数解释**：资源池中的资源规格信列表，包括资源规格和相应规格的资源数量。 **约束限制**：不涉及。
     * @return resources
     */
    public List<PoolResourceFlavor> getResources() {
        return resources;
    }

    public void setResources(List<PoolResourceFlavor> resources) {
        this.resources = resources;
    }

    public PoolSpecCreation withNetwork(PoolSpecCreationNetwork network) {
        this.network = network;
        return this;
    }

    public PoolSpecCreation withNetwork(Consumer<PoolSpecCreationNetwork> networkSetter) {
        if (this.network == null) {
            this.network = new PoolSpecCreationNetwork();
            networkSetter.accept(this.network);
        }

        return this;
    }

    /**
     * Get network
     * @return network
     */
    public PoolSpecCreationNetwork getNetwork() {
        return network;
    }

    public void setNetwork(PoolSpecCreationNetwork network) {
        this.network = network;
    }

    public PoolSpecCreation withJobFlavors(List<String> jobFlavors) {
        this.jobFlavors = jobFlavors;
        return this;
    }

    public PoolSpecCreation addJobFlavorsItem(String jobFlavorsItem) {
        if (this.jobFlavors == null) {
            this.jobFlavors = new ArrayList<>();
        }
        this.jobFlavors.add(jobFlavorsItem);
        return this;
    }

    public PoolSpecCreation withJobFlavors(Consumer<List<String>> jobFlavorsSetter) {
        if (this.jobFlavors == null) {
            this.jobFlavors = new ArrayList<>();
        }
        jobFlavorsSetter.accept(this.jobFlavors);
        return this;
    }

    /**
     * **参数解释**：资源池支持的作业规格信息列表，内容为作业规格名称。 **约束限制**：不涉及。
     * @return jobFlavors
     */
    public List<String> getJobFlavors() {
        return jobFlavors;
    }

    public void setJobFlavors(List<String> jobFlavors) {
        this.jobFlavors = jobFlavors;
    }

    public PoolSpecCreation withDriver(PoolDriver driver) {
        this.driver = driver;
        return this;
    }

    public PoolSpecCreation withDriver(Consumer<PoolDriver> driverSetter) {
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
        PoolSpecCreation that = (PoolSpecCreation) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.scope, that.scope)
            && Objects.equals(this.resources, that.resources) && Objects.equals(this.network, that.network)
            && Objects.equals(this.jobFlavors, that.jobFlavors) && Objects.equals(this.driver, that.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, scope, resources, network, jobFlavors, driver);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolSpecCreation {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
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
