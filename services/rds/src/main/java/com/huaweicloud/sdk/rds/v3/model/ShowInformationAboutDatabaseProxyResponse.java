package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInformationAboutDatabaseProxyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy")

    private Proxy proxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_instance")

    private MasterInstance masterInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readonly_instances")

    private List<ReadonlyInstances> readonlyInstances = null;

    public ShowInformationAboutDatabaseProxyResponse withProxy(Proxy proxy) {
        this.proxy = proxy;
        return this;
    }

    public ShowInformationAboutDatabaseProxyResponse withProxy(Consumer<Proxy> proxySetter) {
        if (this.proxy == null) {
            this.proxy = new Proxy();
            proxySetter.accept(this.proxy);
        }

        return this;
    }

    /**
     * Get proxy
     * @return proxy
     */
    public Proxy getProxy() {
        return proxy;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    public ShowInformationAboutDatabaseProxyResponse withMasterInstance(MasterInstance masterInstance) {
        this.masterInstance = masterInstance;
        return this;
    }

    public ShowInformationAboutDatabaseProxyResponse withMasterInstance(Consumer<MasterInstance> masterInstanceSetter) {
        if (this.masterInstance == null) {
            this.masterInstance = new MasterInstance();
            masterInstanceSetter.accept(this.masterInstance);
        }

        return this;
    }

    /**
     * Get masterInstance
     * @return masterInstance
     */
    public MasterInstance getMasterInstance() {
        return masterInstance;
    }

    public void setMasterInstance(MasterInstance masterInstance) {
        this.masterInstance = masterInstance;
    }

    public ShowInformationAboutDatabaseProxyResponse withReadonlyInstances(List<ReadonlyInstances> readonlyInstances) {
        this.readonlyInstances = readonlyInstances;
        return this;
    }

    public ShowInformationAboutDatabaseProxyResponse addReadonlyInstancesItem(ReadonlyInstances readonlyInstancesItem) {
        if (this.readonlyInstances == null) {
            this.readonlyInstances = new ArrayList<>();
        }
        this.readonlyInstances.add(readonlyInstancesItem);
        return this;
    }

    public ShowInformationAboutDatabaseProxyResponse withReadonlyInstances(
        Consumer<List<ReadonlyInstances>> readonlyInstancesSetter) {
        if (this.readonlyInstances == null) {
            this.readonlyInstances = new ArrayList<>();
        }
        readonlyInstancesSetter.accept(this.readonlyInstances);
        return this;
    }

    /**
     * 只读实例信息。
     * @return readonlyInstances
     */
    public List<ReadonlyInstances> getReadonlyInstances() {
        return readonlyInstances;
    }

    public void setReadonlyInstances(List<ReadonlyInstances> readonlyInstances) {
        this.readonlyInstances = readonlyInstances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInformationAboutDatabaseProxyResponse that = (ShowInformationAboutDatabaseProxyResponse) obj;
        return Objects.equals(this.proxy, that.proxy) && Objects.equals(this.masterInstance, that.masterInstance)
            && Objects.equals(this.readonlyInstances, that.readonlyInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proxy, masterInstance, readonlyInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInformationAboutDatabaseProxyResponse {\n");
        sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
        sb.append("    masterInstance: ").append(toIndentedString(masterInstance)).append("\n");
        sb.append("    readonlyInstances: ").append(toIndentedString(readonlyInstances)).append("\n");
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
