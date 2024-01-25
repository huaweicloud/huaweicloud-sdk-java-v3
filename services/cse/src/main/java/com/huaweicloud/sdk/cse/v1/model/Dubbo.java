package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Dubbo
 */
public class Dubbo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private String service;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "methods")

    private List<DubboMethod> methods = null;

    public Dubbo withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * 服务名。
     * @return service
     */
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Dubbo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Dubbo withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * 分组。
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Dubbo withMethods(List<DubboMethod> methods) {
        this.methods = methods;
        return this;
    }

    public Dubbo addMethodsItem(DubboMethod methodsItem) {
        if (this.methods == null) {
            this.methods = new ArrayList<>();
        }
        this.methods.add(methodsItem);
        return this;
    }

    public Dubbo withMethods(Consumer<List<DubboMethod>> methodsSetter) {
        if (this.methods == null) {
            this.methods = new ArrayList<>();
        }
        methodsSetter.accept(this.methods);
        return this;
    }

    /**
     * dubbo方法列表。
     * @return methods
     */
    public List<DubboMethod> getMethods() {
        return methods;
    }

    public void setMethods(List<DubboMethod> methods) {
        this.methods = methods;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Dubbo that = (Dubbo) obj;
        return Objects.equals(this.service, that.service) && Objects.equals(this.version, that.version)
            && Objects.equals(this.group, that.group) && Objects.equals(this.methods, that.methods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(service, version, group, methods);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Dubbo {\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
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
