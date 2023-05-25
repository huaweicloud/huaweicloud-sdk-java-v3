package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ComponentStorageParameters
 */
public class ComponentStorageParameters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_mode")

    private Integer defaultMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "medium")

    private String medium;

    public ComponentStorageParameters withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 主机路径， 适用于HostPath的存储类型
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ComponentStorageParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 配置项、密钥或者PVC的名字， 适用于ConfigMap、Secret和PersistentVolumeClaim的存储类型
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComponentStorageParameters withDefaultMode(Integer defaultMode) {
        this.defaultMode = defaultMode;
        return this;
    }

    /**
     * 挂载的权限，十进制格式，如384
     * @return defaultMode
     */
    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public ComponentStorageParameters withMedium(String medium) {
        this.medium = medium;
        return this;
    }

    /**
     * 适用于EmptyDir类型的存储。不传参数为默认的磁盘介质，传参为memory则开启内存存储。
     * @return medium
     */
    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentStorageParameters componentStorageParameters = (ComponentStorageParameters) o;
        return Objects.equals(this.path, componentStorageParameters.path)
            && Objects.equals(this.name, componentStorageParameters.name)
            && Objects.equals(this.defaultMode, componentStorageParameters.defaultMode)
            && Objects.equals(this.medium, componentStorageParameters.medium);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, name, defaultMode, medium);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentStorageParameters {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
        sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
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
