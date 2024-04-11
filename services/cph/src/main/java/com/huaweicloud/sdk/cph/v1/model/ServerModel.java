package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 服务器规格。
 */
public class ServerModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_model_name")

    private String serverModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_type")

    private String serverType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Integer memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_spec")

    private ServerModelExtendSpec extendSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_type")

    private Integer productType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_size")

    private Integer freeSize;

    public ServerModel withServerModelName(String serverModelName) {
        this.serverModelName = serverModelName;
        return this;
    }

    /**
     * 云手机服务器的规格名称，不超过64字节。
     * @return serverModelName
     */
    public String getServerModelName() {
        return serverModelName;
    }

    public void setServerModelName(String serverModelName) {
        this.serverModelName = serverModelName;
    }

    public ServerModel withServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * 云手机服务器的型号，如Hi1616。不超过32字节。
     * @return serverType
     */
    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    public ServerModel withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * 云手机服务器的CPU核数。
     * minimum: 0
     * maximum: 8096
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public ServerModel withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 云手机服务器的内存大小，单位G。
     * minimum: 0
     * maximum: 8096
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public ServerModel withExtendSpec(ServerModelExtendSpec extendSpec) {
        this.extendSpec = extendSpec;
        return this;
    }

    public ServerModel withExtendSpec(Consumer<ServerModelExtendSpec> extendSpecSetter) {
        if (this.extendSpec == null) {
            this.extendSpec = new ServerModelExtendSpec();
            extendSpecSetter.accept(this.extendSpec);
        }

        return this;
    }

    /**
     * Get extendSpec
     * @return extendSpec
     */
    public ServerModelExtendSpec getExtendSpec() {
        return extendSpec;
    }

    public void setExtendSpec(ServerModelExtendSpec extendSpec) {
        this.extendSpec = extendSpec;
    }

    public ServerModel withProductType(Integer productType) {
        this.productType = productType;
        return this;
    }

    /**
     * 产品类型。 - 0：云手机 - 1：云手游
     * minimum: 0
     * maximum: 128
     * @return productType
     */
    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public ServerModel withFreeSize(Integer freeSize) {
        this.freeSize = freeSize;
        return this;
    }

    /**
     * 服务器磁盘的免费配额，单位G。
     * minimum: 0
     * maximum: 100000
     * @return freeSize
     */
    public Integer getFreeSize() {
        return freeSize;
    }

    public void setFreeSize(Integer freeSize) {
        this.freeSize = freeSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerModel that = (ServerModel) obj;
        return Objects.equals(this.serverModelName, that.serverModelName)
            && Objects.equals(this.serverType, that.serverType) && Objects.equals(this.cpu, that.cpu)
            && Objects.equals(this.memory, that.memory) && Objects.equals(this.extendSpec, that.extendSpec)
            && Objects.equals(this.productType, that.productType) && Objects.equals(this.freeSize, that.freeSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverModelName, serverType, cpu, memory, extendSpec, productType, freeSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerModel {\n");
        sb.append("    serverModelName: ").append(toIndentedString(serverModelName)).append("\n");
        sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    extendSpec: ").append(toIndentedString(extendSpec)).append("\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
        sb.append("    freeSize: ").append(toIndentedString(freeSize)).append("\n");
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
