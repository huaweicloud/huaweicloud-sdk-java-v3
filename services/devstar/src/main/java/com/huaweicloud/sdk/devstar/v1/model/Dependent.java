package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Dependent
 */
public class Dependent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependent_services")

    private List<ResouceInfo> dependentServices = null;

    public Dependent withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 部署方式。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dependent withDependentServices(List<ResouceInfo> dependentServices) {
        this.dependentServices = dependentServices;
        return this;
    }

    public Dependent addDependentServicesItem(ResouceInfo dependentServicesItem) {
        if (this.dependentServices == null) {
            this.dependentServices = new ArrayList<>();
        }
        this.dependentServices.add(dependentServicesItem);
        return this;
    }

    public Dependent withDependentServices(Consumer<List<ResouceInfo>> dependentServicesSetter) {
        if (this.dependentServices == null) {
            this.dependentServices = new ArrayList<>();
        }
        dependentServicesSetter.accept(this.dependentServices);
        return this;
    }

    /**
     * 依赖云资源信息
     * @return dependentServices
     */
    public List<ResouceInfo> getDependentServices() {
        return dependentServices;
    }

    public void setDependentServices(List<ResouceInfo> dependentServices) {
        this.dependentServices = dependentServices;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dependent dependent = (Dependent) o;
        return Objects.equals(this.name, dependent.name)
            && Objects.equals(this.dependentServices, dependent.dependentServices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dependentServices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Dependent {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dependentServices: ").append(toIndentedString(dependentServices)).append("\n");
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
