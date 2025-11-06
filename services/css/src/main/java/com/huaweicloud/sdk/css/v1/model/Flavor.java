package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 规格信息返回值。 **取值范围**： 不涉及
 */
public class Flavor {

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
    @JsonProperty(value = "diskrange")

    private String diskrange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condOperationStatus")

    private String condOperationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condOperationAz")

    private String condOperationAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "localdisk")

    private String localdisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavorTypeCn")

    private String flavorTypeCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavorTypeEn")

    private String flavorTypeEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge")

    private Boolean edge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "str_id")

    private String strId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAllowHttps")

    private Boolean isAllowHttps;

    public Flavor withCpu(Integer cpu) {
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

    public Flavor withRam(Integer ram) {
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

    public Flavor withName(String name) {
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

    public Flavor withRegion(String region) {
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

    public Flavor withTypename(String typename) {
        this.typename = typename;
        return this;
    }

    /**
     * **参数解释**： 节点类型名称。 **取值范围**： 不涉及
     * @return typename
     */
    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Flavor withDiskrange(String diskrange) {
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

    public Flavor withCondOperationStatus(String condOperationStatus) {
        this.condOperationStatus = condOperationStatus;
        return this;
    }

    /**
     * **参数解释**： 此参数是Region级配置，某个AZ没有在condOperationAz参数中配置时默认使用此参数的取值。 **取值范围**：   - normal：正常商用。   - sellout：售罄。
     * @return condOperationStatus
     */
    public String getCondOperationStatus() {
        return condOperationStatus;
    }

    public void setCondOperationStatus(String condOperationStatus) {
        this.condOperationStatus = condOperationStatus;
    }

    public Flavor withCondOperationAz(String condOperationAz) {
        this.condOperationAz = condOperationAz;
        return this;
    }

    /**
     * **参数解释**： 此参数是AZ级配置，某个AZ没有在此参数中配置时默认使用condOperationAz参数的取值。此参数的配置格式“az(xx)”。()内为某个AZ的flavor状态，()内必须要填有状态，不填为无效配置。状态的取值范围与condOperationStatus参数相同。 **取值范围**： 不涉及
     * @return condOperationAz
     */
    public String getCondOperationAz() {
        return condOperationAz;
    }

    public void setCondOperationAz(String condOperationAz) {
        this.condOperationAz = condOperationAz;
    }

    public Flavor withLocaldisk(String localdisk) {
        this.localdisk = localdisk;
        return this;
    }

    /**
     * **参数解释**： 是否本地盘。 **取值范围**： - true：本地盘。 - false：非本地盘。
     * @return localdisk
     */
    public String getLocaldisk() {
        return localdisk;
    }

    public void setLocaldisk(String localdisk) {
        this.localdisk = localdisk;
    }

    public Flavor withFlavorTypeCn(String flavorTypeCn) {
        this.flavorTypeCn = flavorTypeCn;
        return this;
    }

    /**
     * **参数解释**： 中文规格分类。 **取值范围**： 不涉及
     * @return flavorTypeCn
     */
    public String getFlavorTypeCn() {
        return flavorTypeCn;
    }

    public void setFlavorTypeCn(String flavorTypeCn) {
        this.flavorTypeCn = flavorTypeCn;
    }

    public Flavor withFlavorTypeEn(String flavorTypeEn) {
        this.flavorTypeEn = flavorTypeEn;
        return this;
    }

    /**
     * **参数解释**： 英文规格分类。 **取值范围**： 不涉及
     * @return flavorTypeEn
     */
    public String getFlavorTypeEn() {
        return flavorTypeEn;
    }

    public void setFlavorTypeEn(String flavorTypeEn) {
        this.flavorTypeEn = flavorTypeEn;
    }

    public Flavor withEdge(Boolean edge) {
        this.edge = edge;
        return this;
    }

    /**
     * **参数解释**： 是否边缘区规格。 **取值范围**： - true：边缘区专属规格。 - false：通用规格。
     * @return edge
     */
    public Boolean getEdge() {
        return edge;
    }

    public void setEdge(Boolean edge) {
        this.edge = edge;
    }

    public Flavor withStrId(String strId) {
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

    public Flavor withIsAllowHttps(Boolean isAllowHttps) {
        this.isAllowHttps = isAllowHttps;
        return this;
    }

    /**
     * **参数解释**： 节点类型是否支持HTTPS协议访问。 **取值范围**： 不涉及
     * @return isAllowHttps
     */
    public Boolean getIsAllowHttps() {
        return isAllowHttps;
    }

    public void setIsAllowHttps(Boolean isAllowHttps) {
        this.isAllowHttps = isAllowHttps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Flavor that = (Flavor) obj;
        return Objects.equals(this.cpu, that.cpu) && Objects.equals(this.ram, that.ram)
            && Objects.equals(this.name, that.name) && Objects.equals(this.region, that.region)
            && Objects.equals(this.typename, that.typename) && Objects.equals(this.diskrange, that.diskrange)
            && Objects.equals(this.condOperationStatus, that.condOperationStatus)
            && Objects.equals(this.condOperationAz, that.condOperationAz)
            && Objects.equals(this.localdisk, that.localdisk) && Objects.equals(this.flavorTypeCn, that.flavorTypeCn)
            && Objects.equals(this.flavorTypeEn, that.flavorTypeEn) && Objects.equals(this.edge, that.edge)
            && Objects.equals(this.strId, that.strId) && Objects.equals(this.isAllowHttps, that.isAllowHttps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu,
            ram,
            name,
            region,
            typename,
            diskrange,
            condOperationStatus,
            condOperationAz,
            localdisk,
            flavorTypeCn,
            flavorTypeEn,
            edge,
            strId,
            isAllowHttps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Flavor {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    typename: ").append(toIndentedString(typename)).append("\n");
        sb.append("    diskrange: ").append(toIndentedString(diskrange)).append("\n");
        sb.append("    condOperationStatus: ").append(toIndentedString(condOperationStatus)).append("\n");
        sb.append("    condOperationAz: ").append(toIndentedString(condOperationAz)).append("\n");
        sb.append("    localdisk: ").append(toIndentedString(localdisk)).append("\n");
        sb.append("    flavorTypeCn: ").append(toIndentedString(flavorTypeCn)).append("\n");
        sb.append("    flavorTypeEn: ").append(toIndentedString(flavorTypeEn)).append("\n");
        sb.append("    edge: ").append(toIndentedString(edge)).append("\n");
        sb.append("    strId: ").append(toIndentedString(strId)).append("\n");
        sb.append("    isAllowHttps: ").append(toIndentedString(isAllowHttps)).append("\n");
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
