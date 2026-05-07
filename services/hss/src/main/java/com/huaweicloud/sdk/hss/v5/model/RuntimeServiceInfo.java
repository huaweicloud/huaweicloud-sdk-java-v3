package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RuntimeServiceInfo
 */
public class RuntimeServiceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_type")

    private String runtimeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_version")

    private String runtimeVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_driver")

    private List<String> storageDriver = null;

    public RuntimeServiceInfo withRuntimeType(String runtimeType) {
        this.runtimeType = runtimeType;
        return this;
    }

    /**
     * **参数解释** 运行时类型 **取值范围** - docker：docker运行时。 - containerd：containerd运行时。 - podman：podman运行时。 - isulad：isulad运行时。 - crio：crio运行时。 - unknown：未知运行时。 
     * @return runtimeType
     */
    public String getRuntimeType() {
        return runtimeType;
    }

    public void setRuntimeType(String runtimeType) {
        this.runtimeType = runtimeType;
    }

    public RuntimeServiceInfo withRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    /**
     * **参数解释** 运行时版本 **取值范围** 字符长度0-128 
     * @return runtimeVersion
     */
    public String getRuntimeVersion() {
        return runtimeVersion;
    }

    public void setRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
    }

    public RuntimeServiceInfo withStorageDriver(List<String> storageDriver) {
        this.storageDriver = storageDriver;
        return this;
    }

    public RuntimeServiceInfo addStorageDriverItem(String storageDriverItem) {
        if (this.storageDriver == null) {
            this.storageDriver = new ArrayList<>();
        }
        this.storageDriver.add(storageDriverItem);
        return this;
    }

    public RuntimeServiceInfo withStorageDriver(Consumer<List<String>> storageDriverSetter) {
        if (this.storageDriver == null) {
            this.storageDriver = new ArrayList<>();
        }
        storageDriverSetter.accept(this.storageDriver);
        return this;
    }

    /**
     * **参数解释** 运行时存储驱动数组 **取值范围** 数组范围0-20 
     * @return storageDriver
     */
    public List<String> getStorageDriver() {
        return storageDriver;
    }

    public void setStorageDriver(List<String> storageDriver) {
        this.storageDriver = storageDriver;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuntimeServiceInfo that = (RuntimeServiceInfo) obj;
        return Objects.equals(this.runtimeType, that.runtimeType)
            && Objects.equals(this.runtimeVersion, that.runtimeVersion)
            && Objects.equals(this.storageDriver, that.storageDriver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runtimeType, runtimeVersion, storageDriver);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuntimeServiceInfo {\n");
        sb.append("    runtimeType: ").append(toIndentedString(runtimeType)).append("\n");
        sb.append("    runtimeVersion: ").append(toIndentedString(runtimeVersion)).append("\n");
        sb.append("    storageDriver: ").append(toIndentedString(storageDriver)).append("\n");
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
