package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 超节点下节点的信息。
 */
public class NodeTemplateInHyperNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az")

    private String az;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os")

    private String os;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login")

    private Login login;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rootVolume")

    private Volume rootVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataVolumes")

    private List<Volume> dataVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage")

    private Storage storage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "k8sTags")

    private Map<String, String> k8sTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime")

    private Runtime runtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParam")

    private NodeExtendParam extendParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostnameConfig")

    private HostnameConfig hostnameConfig;

    public NodeTemplateInHyperNode withAz(String az) {
        this.az = az;
        return this;
    }

    /**
     * **参数解释**： 超节点下节点所在的可用区。 [CCE支持的可用区请参考[地区和终端节点](https://console.huaweicloud.com/apiexplorer/#/endpoint/CCE)。](tag:hws) [CCE支持的可用区请参考[地区和终端节点](https://console-intl.huaweicloud.com/apiexplorer/#/endpoint/CCE)。](tag:hws_hk)
     * @return az
     */
    public String getAz() {
        return az;
    }

    public void setAz(String az) {
        this.az = az;
    }

    public NodeTemplateInHyperNode withOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * **参数解释**： 超节点下节点的操作系统类型。具体支持的操作系统请参见[节点操作系统说明](node-os.xml)。
     * @return os
     */
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public NodeTemplateInHyperNode withLogin(Login login) {
        this.login = login;
        return this;
    }

    public NodeTemplateInHyperNode withLogin(Consumer<Login> loginSetter) {
        if (this.login == null) {
            this.login = new Login();
            loginSetter.accept(this.login);
        }

        return this;
    }

    /**
     * Get login
     * @return login
     */
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public NodeTemplateInHyperNode withRootVolume(Volume rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public NodeTemplateInHyperNode withRootVolume(Consumer<Volume> rootVolumeSetter) {
        if (this.rootVolume == null) {
            this.rootVolume = new Volume();
            rootVolumeSetter.accept(this.rootVolume);
        }

        return this;
    }

    /**
     * Get rootVolume
     * @return rootVolume
     */
    public Volume getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(Volume rootVolume) {
        this.rootVolume = rootVolume;
    }

    public NodeTemplateInHyperNode withDataVolumes(List<Volume> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public NodeTemplateInHyperNode addDataVolumesItem(Volume dataVolumesItem) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public NodeTemplateInHyperNode withDataVolumes(Consumer<List<Volume>> dataVolumesSetter) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    /**
     * **参数解释**： 节点的数据盘参数。
     * @return dataVolumes
     */
    public List<Volume> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<Volume> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public NodeTemplateInHyperNode withStorage(Storage storage) {
        this.storage = storage;
        return this;
    }

    public NodeTemplateInHyperNode withStorage(Consumer<Storage> storageSetter) {
        if (this.storage == null) {
            this.storage = new Storage();
            storageSetter.accept(this.storage);
        }

        return this;
    }

    /**
     * Get storage
     * @return storage
     */
    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public NodeTemplateInHyperNode withK8sTags(Map<String, String> k8sTags) {
        this.k8sTags = k8sTags;
        return this;
    }

    public NodeTemplateInHyperNode putK8sTagsItem(String key, String k8sTagsItem) {
        if (this.k8sTags == null) {
            this.k8sTags = new HashMap<>();
        }
        this.k8sTags.put(key, k8sTagsItem);
        return this;
    }

    public NodeTemplateInHyperNode withK8sTags(Consumer<Map<String, String>> k8sTagsSetter) {
        if (this.k8sTags == null) {
            this.k8sTags = new HashMap<>();
        }
        k8sTagsSetter.accept(this.k8sTags);
        return this;
    }

    /**
     * **参数解释**： 超节点创建时下发到节点上的 k8s 标签，格式为key/value键值对。此接口中仅为展示作用。 示例： ``` \"k8sTags\": {   \"key\": \"value\" } ```
     * @return k8sTags
     */
    public Map<String, String> getK8sTags() {
        return k8sTags;
    }

    public void setK8sTags(Map<String, String> k8sTags) {
        this.k8sTags = k8sTags;
    }

    public NodeTemplateInHyperNode withRuntime(Runtime runtime) {
        this.runtime = runtime;
        return this;
    }

    public NodeTemplateInHyperNode withRuntime(Consumer<Runtime> runtimeSetter) {
        if (this.runtime == null) {
            this.runtime = new Runtime();
            runtimeSetter.accept(this.runtime);
        }

        return this;
    }

    /**
     * Get runtime
     * @return runtime
     */
    public Runtime getRuntime() {
        return runtime;
    }

    public void setRuntime(Runtime runtime) {
        this.runtime = runtime;
    }

    public NodeTemplateInHyperNode withExtendParam(NodeExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public NodeTemplateInHyperNode withExtendParam(Consumer<NodeExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new NodeExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public NodeExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(NodeExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    public NodeTemplateInHyperNode withHostnameConfig(HostnameConfig hostnameConfig) {
        this.hostnameConfig = hostnameConfig;
        return this;
    }

    public NodeTemplateInHyperNode withHostnameConfig(Consumer<HostnameConfig> hostnameConfigSetter) {
        if (this.hostnameConfig == null) {
            this.hostnameConfig = new HostnameConfig();
            hostnameConfigSetter.accept(this.hostnameConfig);
        }

        return this;
    }

    /**
     * Get hostnameConfig
     * @return hostnameConfig
     */
    public HostnameConfig getHostnameConfig() {
        return hostnameConfig;
    }

    public void setHostnameConfig(HostnameConfig hostnameConfig) {
        this.hostnameConfig = hostnameConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeTemplateInHyperNode that = (NodeTemplateInHyperNode) obj;
        return Objects.equals(this.az, that.az) && Objects.equals(this.os, that.os)
            && Objects.equals(this.login, that.login) && Objects.equals(this.rootVolume, that.rootVolume)
            && Objects.equals(this.dataVolumes, that.dataVolumes) && Objects.equals(this.storage, that.storage)
            && Objects.equals(this.k8sTags, that.k8sTags) && Objects.equals(this.runtime, that.runtime)
            && Objects.equals(this.extendParam, that.extendParam)
            && Objects.equals(this.hostnameConfig, that.hostnameConfig);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(az, os, login, rootVolume, dataVolumes, storage, k8sTags, runtime, extendParam, hostnameConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeTemplateInHyperNode {\n");
        sb.append("    az: ").append(toIndentedString(az)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
        sb.append("    k8sTags: ").append(toIndentedString(k8sTags)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
        sb.append("    hostnameConfig: ").append(toIndentedString(hostnameConfig)).append("\n");
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
