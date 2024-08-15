package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 集群规格。
 */
public class CdmClusterFlavor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private Integer ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "typename")

    private String typename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterMode")

    private String clusterMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "str_id")

    private String strId;

    public CdmClusterFlavor withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * CPU。
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public CdmClusterFlavor withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    /**
     * 内存。
     * @return ram
     */
    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public CdmClusterFlavor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规格名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CdmClusterFlavor withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * region。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CdmClusterFlavor withTypename(String typename) {
        this.typename = typename;
        return this;
    }

    /**
     * 类型名称。
     * @return typename
     */
    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public CdmClusterFlavor withClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }

    /**
     * 集群模式。
     * @return clusterMode
     */
    public String getClusterMode() {
        return clusterMode;
    }

    public void setClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
    }

    public CdmClusterFlavor withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 规格状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CdmClusterFlavor withStrId(String strId) {
        this.strId = strId;
        return this;
    }

    /**
     * 规格ID。
     * @return strId
     */
    public String getStrId() {
        return strId;
    }

    public void setStrId(String strId) {
        this.strId = strId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CdmClusterFlavor that = (CdmClusterFlavor) obj;
        return Objects.equals(this.cpu, that.cpu) && Objects.equals(this.ram, that.ram)
            && Objects.equals(this.name, that.name) && Objects.equals(this.region, that.region)
            && Objects.equals(this.typename, that.typename) && Objects.equals(this.clusterMode, that.clusterMode)
            && Objects.equals(this.status, that.status) && Objects.equals(this.strId, that.strId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, name, region, typename, clusterMode, status, strId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CdmClusterFlavor {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    typename: ").append(toIndentedString(typename)).append("\n");
        sb.append("    clusterMode: ").append(toIndentedString(clusterMode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    strId: ").append(toIndentedString(strId)).append("\n");
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
