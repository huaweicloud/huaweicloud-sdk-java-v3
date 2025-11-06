package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResizeFlavor
 */
public class ResizeFlavor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "str_id")

    private String strId;

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
    @JsonProperty(value = "diskrange")

    private String diskrange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "typename")

    private String typename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condOperationStatus")

    private String condOperationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "localdisk")

    private String localdisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge")

    private Boolean edge;

    public ResizeFlavor withStrId(String strId) {
        this.strId = strId;
        return this;
    }

    /**
     * **参数解释**： 规格id。 **取值范围**： 不涉及
     * @return strId
     */
    public String getStrId() {
        return strId;
    }

    public void setStrId(String strId) {
        this.strId = strId;
    }

    public ResizeFlavor withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * **参数解释**： 实例的CPU核数。 **取值范围**： 不涉及
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public ResizeFlavor withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    /**
     * **参数解释**： 实例的内存大小。单位GB。 **取值范围**： 不涉及
     * @return ram
     */
    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public ResizeFlavor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 规格名称。 **取值范围**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResizeFlavor withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释**： 节点规格支持的Region。 **取值范围**： 不涉及
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ResizeFlavor withDiskrange(String diskrange) {
        this.diskrange = diskrange;
        return this;
    }

    /**
     * **参数解释**： 实例的硬盘容量范围，单位GB。 **取值范围**： 不涉及
     * @return diskrange
     */
    public String getDiskrange() {
        return diskrange;
    }

    public void setDiskrange(String diskrange) {
        this.diskrange = diskrange;
    }

    public ResizeFlavor withTypename(String typename) {
        this.typename = typename;
        return this;
    }

    /**
     * **参数解释**： 节点类型。 **取值范围**： - ess：数据节点。 - ess-cold：冷数据节点。 - ess-client：Client节点。 - ess-master：Master节点。 - lgs：LogStash节点。
     * @return typename
     */
    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public ResizeFlavor withCondOperationStatus(String condOperationStatus) {
        this.condOperationStatus = condOperationStatus;
        return this;
    }

    /**
     * **参数解释**： 规格售卖状态。 **取值范围**： - normal：正常商用。 - sellout：售罄。
     * @return condOperationStatus
     */
    public String getCondOperationStatus() {
        return condOperationStatus;
    }

    public void setCondOperationStatus(String condOperationStatus) {
        this.condOperationStatus = condOperationStatus;
    }

    public ResizeFlavor withLocaldisk(String localdisk) {
        this.localdisk = localdisk;
        return this;
    }

    /**
     * **参数解释**： 是否本地盘。 **取值范围**： - false：非本地盘规格。 - true：本地盘规格。
     * @return localdisk
     */
    public String getLocaldisk() {
        return localdisk;
    }

    public void setLocaldisk(String localdisk) {
        this.localdisk = localdisk;
    }

    public ResizeFlavor withEdge(Boolean edge) {
        this.edge = edge;
        return this;
    }

    /**
     * **参数解释**： 是否边缘区规格。 **取值范围**： - false：中心可用区规格。 - true：边缘可用区规格。
     * @return edge
     */
    public Boolean getEdge() {
        return edge;
    }

    public void setEdge(Boolean edge) {
        this.edge = edge;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResizeFlavor that = (ResizeFlavor) obj;
        return Objects.equals(this.strId, that.strId) && Objects.equals(this.cpu, that.cpu)
            && Objects.equals(this.ram, that.ram) && Objects.equals(this.name, that.name)
            && Objects.equals(this.region, that.region) && Objects.equals(this.diskrange, that.diskrange)
            && Objects.equals(this.typename, that.typename)
            && Objects.equals(this.condOperationStatus, that.condOperationStatus)
            && Objects.equals(this.localdisk, that.localdisk) && Objects.equals(this.edge, that.edge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strId, cpu, ram, name, region, diskrange, typename, condOperationStatus, localdisk, edge);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeFlavor {\n");
        sb.append("    strId: ").append(toIndentedString(strId)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    diskrange: ").append(toIndentedString(diskrange)).append("\n");
        sb.append("    typename: ").append(toIndentedString(typename)).append("\n");
        sb.append("    condOperationStatus: ").append(toIndentedString(condOperationStatus)).append("\n");
        sb.append("    localdisk: ").append(toIndentedString(localdisk)).append("\n");
        sb.append("    edge: ").append(toIndentedString(edge)).append("\n");
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
