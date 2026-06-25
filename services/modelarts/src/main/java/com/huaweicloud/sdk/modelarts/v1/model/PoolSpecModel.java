package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 物理池创建请求体。
 */
public class PoolSpecModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private List<String> scope = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<PoolSpecModelResources> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network")

    private PoolSpecModelNetwork network;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobFlavors")

    private List<String> jobFlavors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver")

    private PoolDriver driver;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "controlMode")

    private Integer controlMode;

    public PoolSpecModel withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源池类型。可选值如下： - Dedicate：物理资源池，独立的网络，支持网络打通，定制驱动，定制作业类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PoolSpecModel withScope(List<String> scope) {
        this.scope = scope;
        return this;
    }

    public PoolSpecModel addScopeItem(String scopeItem) {
        if (this.scope == null) {
            this.scope = new ArrayList<>();
        }
        this.scope.add(scopeItem);
        return this;
    }

    public PoolSpecModel withScope(Consumer<List<String>> scopeSetter) {
        if (this.scope == null) {
            this.scope = new ArrayList<>();
        }
        scopeSetter.accept(this.scope);
        return this;
    }

    /**
     * 资源池支持的作业类型。至少选择一种，物理资源池支持全部选择。可选值如下： - Train：训练作业 - Infer：推理作业 - Notebook：Notebook作业
     * @return scope
     */
    public List<String> getScope() {
        return scope;
    }

    public void setScope(List<String> scope) {
        this.scope = scope;
    }

    public PoolSpecModel withResources(List<PoolSpecModelResources> resources) {
        this.resources = resources;
        return this;
    }

    public PoolSpecModel addResourcesItem(PoolSpecModelResources resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public PoolSpecModel withResources(Consumer<List<PoolSpecModelResources>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源池中的资源规格信列表，包括资源规格和相应规格的资源数量。
     * @return resources
     */
    public List<PoolSpecModelResources> getResources() {
        return resources;
    }

    public void setResources(List<PoolSpecModelResources> resources) {
        this.resources = resources;
    }

    public PoolSpecModel withNetwork(PoolSpecModelNetwork network) {
        this.network = network;
        return this;
    }

    public PoolSpecModel withNetwork(Consumer<PoolSpecModelNetwork> networkSetter) {
        if (this.network == null) {
            this.network = new PoolSpecModelNetwork();
            networkSetter.accept(this.network);
        }

        return this;
    }

    /**
     * Get network
     * @return network
     */
    public PoolSpecModelNetwork getNetwork() {
        return network;
    }

    public void setNetwork(PoolSpecModelNetwork network) {
        this.network = network;
    }

    public PoolSpecModel withJobFlavors(List<String> jobFlavors) {
        this.jobFlavors = jobFlavors;
        return this;
    }

    public PoolSpecModel addJobFlavorsItem(String jobFlavorsItem) {
        if (this.jobFlavors == null) {
            this.jobFlavors = new ArrayList<>();
        }
        this.jobFlavors.add(jobFlavorsItem);
        return this;
    }

    public PoolSpecModel withJobFlavors(Consumer<List<String>> jobFlavorsSetter) {
        if (this.jobFlavors == null) {
            this.jobFlavors = new ArrayList<>();
        }
        jobFlavorsSetter.accept(this.jobFlavors);
        return this;
    }

    /**
     * 资源池支持的作业规格信息列表，内容为作业规格名称。
     * @return jobFlavors
     */
    public List<String> getJobFlavors() {
        return jobFlavors;
    }

    public void setJobFlavors(List<String> jobFlavors) {
        this.jobFlavors = jobFlavors;
    }

    public PoolSpecModel withDriver(PoolDriver driver) {
        this.driver = driver;
        return this;
    }

    public PoolSpecModel withDriver(Consumer<PoolDriver> driverSetter) {
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

    public PoolSpecModel withControlMode(Integer controlMode) {
        this.controlMode = controlMode;
        return this;
    }

    /**
     * 资源池的受限状态。可选值如下： - 0：代表不受限 - 1：转包周期受限 - 2：规格变更受限 - 4：服务受限 - 8：冻结 - 16：公安冻结（不可退订） 另外状态是可以叠加的，比如9代表转包周期受限+冻结状态。
     * @return controlMode
     */
    public Integer getControlMode() {
        return controlMode;
    }

    public void setControlMode(Integer controlMode) {
        this.controlMode = controlMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolSpecModel that = (PoolSpecModel) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.scope, that.scope)
            && Objects.equals(this.resources, that.resources) && Objects.equals(this.network, that.network)
            && Objects.equals(this.jobFlavors, that.jobFlavors) && Objects.equals(this.driver, that.driver)
            && Objects.equals(this.controlMode, that.controlMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, scope, resources, network, jobFlavors, driver, controlMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolSpecModel {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    jobFlavors: ").append(toIndentedString(jobFlavors)).append("\n");
        sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
        sb.append("    controlMode: ").append(toIndentedString(controlMode)).append("\n");
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
