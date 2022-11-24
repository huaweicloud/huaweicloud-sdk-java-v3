package com.huaweicloud.sdk.cloudtable.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建集群参数对象实体。
 */
public class Cluster {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_mode")

    private String authMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_lemon")

    private Boolean enableLemon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_openTSDB")

    private Boolean enableOpenTSDB;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private Instance instance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_size")

    private Integer storageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_type")

    private String storageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private Datastore datastore;

    public Cluster withAuthMode(String authMode) {
        this.authMode = authMode;
        return this;
    }

    /**
     * 是否开启IAM权限认证。 - false：不开启 - true：开启
     * @return authMode
     */
    public String getAuthMode() {
        return authMode;
    }

    public void setAuthMode(String authMode) {
        this.authMode = authMode;
    }

    public Cluster withEnableLemon(Boolean enableLemon) {
        this.enableLemon = enableLemon;
        return this;
    }

    /**
     * 是否开启Lemon(目前已关闭该参数，填false即可) - false：不开启 - true：开启
     * @return enableLemon
     */
    public Boolean getEnableLemon() {
        return enableLemon;
    }

    public void setEnableLemon(Boolean enableLemon) {
        this.enableLemon = enableLemon;
    }

    public Cluster withEnableOpenTSDB(Boolean enableOpenTSDB) {
        this.enableOpenTSDB = enableOpenTSDB;
        return this;
    }

    /**
     * 是否开启OpenTSDB。 - false：不开启 - true：开启
     * @return enableOpenTSDB
     */
    public Boolean getEnableOpenTSDB() {
        return enableOpenTSDB;
    }

    public void setEnableOpenTSDB(Boolean enableOpenTSDB) {
        this.enableOpenTSDB = enableOpenTSDB;
    }

    public Cluster withInstance(Instance instance) {
        this.instance = instance;
        return this;
    }

    public Cluster withInstance(Consumer<Instance> instanceSetter) {
        if (this.instance == null) {
            this.instance = new Instance();
            instanceSetter.accept(this.instance);
        }

        return this;
    }

    /**
     * Get instance
     * @return instance
     */
    public Instance getInstance() {
        return instance;
    }

    public void setInstance(Instance instance) {
        this.instance = instance;
    }

    public Cluster withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * CloudTable集群的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cluster withStorageSize(Integer storageSize) {
        this.storageSize = storageSize;
        return this;
    }

    /**
     * 存储值的大小。  取值范围: 1-[10240-1024*1024*1024]
     * @return storageSize
     */
    public Integer getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(Integer storageSize) {
        this.storageSize = storageSize;
    }

    public Cluster withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * 存储类型： - ULTRAHIGH：超高IO - COMMON：普通IO
     * @return storageType
     */
    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public Cluster withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 集群所在的（虚拟网络私有云）VPC。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public Cluster withDatastore(Datastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public Cluster withDatastore(Consumer<Datastore> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new Datastore();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public Datastore getDatastore() {
        return datastore;
    }

    public void setDatastore(Datastore datastore) {
        this.datastore = datastore;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cluster cluster = (Cluster) o;
        return Objects.equals(this.authMode, cluster.authMode) && Objects.equals(this.enableLemon, cluster.enableLemon)
            && Objects.equals(this.enableOpenTSDB, cluster.enableOpenTSDB)
            && Objects.equals(this.instance, cluster.instance) && Objects.equals(this.name, cluster.name)
            && Objects.equals(this.storageSize, cluster.storageSize)
            && Objects.equals(this.storageType, cluster.storageType) && Objects.equals(this.vpcId, cluster.vpcId)
            && Objects.equals(this.datastore, cluster.datastore);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(authMode, enableLemon, enableOpenTSDB, instance, name, storageSize, storageType, vpcId, datastore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Cluster {\n");
        sb.append("    authMode: ").append(toIndentedString(authMode)).append("\n");
        sb.append("    enableLemon: ").append(toIndentedString(enableLemon)).append("\n");
        sb.append("    enableOpenTSDB: ").append(toIndentedString(enableOpenTSDB)).append("\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    storageSize: ").append(toIndentedString(storageSize)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
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
