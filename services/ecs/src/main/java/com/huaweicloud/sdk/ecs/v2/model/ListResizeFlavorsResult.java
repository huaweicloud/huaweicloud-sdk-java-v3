package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云服务器规格。
 */
public class ListResizeFlavorsResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private String vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private Integer ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk")

    private String disk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swap")

    private String swap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-FLV-EXT-DATA:ephemeral")

    private Integer osFLVEXTDATAEphemeral;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-FLV-DISABLED:disabled")

    private Boolean osFLVDISABLEDDisabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rxtx_factor")

    private Float rxtxFactor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rxtx_quota")

    private String rxtxQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rxtx_cap")

    private String rxtxCap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-flavor-access:is_public")

    private Boolean osFlavorAccessIsPublic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<FlavorLink> links = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_specs")

    private FlavorExtraSpec extraSpecs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_quota")

    private Object instanceQuota;

    public ListResizeFlavorsResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 云服务器规格的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListResizeFlavorsResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 云服务器规格的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListResizeFlavorsResult withVcpus(String vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * 云服务器规格对应的CPU核数。
     * @return vcpus
     */
    public String getVcpus() {
        return vcpus;
    }

    public void setVcpus(String vcpus) {
        this.vcpus = vcpus;
    }

    public ListResizeFlavorsResult withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    /**
     * 云服务器规格对应的内存大小，单位为MB。
     * @return ram
     */
    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public ListResizeFlavorsResult withDisk(String disk) {
        this.disk = disk;
        return this;
    }

    /**
     * 云服务器规格对应要求的系统盘大小。  当前未使用该参数，缺省值为0。
     * @return disk
     */
    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public ListResizeFlavorsResult withSwap(String swap) {
        this.swap = swap;
        return this;
    }

    /**
     * 云服务器规格对应要求的交换分区大小。  当前未使用该参数，缺省值为\"\"。
     * @return swap
     */
    public String getSwap() {
        return swap;
    }

    public void setSwap(String swap) {
        this.swap = swap;
    }

    public ListResizeFlavorsResult withOsFLVEXTDATAEphemeral(Integer osFLVEXTDATAEphemeral) {
        this.osFLVEXTDATAEphemeral = osFLVEXTDATAEphemeral;
        return this;
    }

    /**
     * 扩展属性，临时盘大小。  当前未使用该参数，缺省值为0
     * @return osFLVEXTDATAEphemeral
     */
    public Integer getOsFLVEXTDATAEphemeral() {
        return osFLVEXTDATAEphemeral;
    }

    public void setOsFLVEXTDATAEphemeral(Integer osFLVEXTDATAEphemeral) {
        this.osFLVEXTDATAEphemeral = osFLVEXTDATAEphemeral;
    }

    public ListResizeFlavorsResult withOsFLVDISABLEDDisabled(Boolean osFLVDISABLEDDisabled) {
        this.osFLVDISABLEDDisabled = osFLVDISABLEDDisabled;
        return this;
    }

    /**
     * 扩展属性，该云服务器规格是否禁用。  当前未使用该参数，缺省值为false。
     * @return osFLVDISABLEDDisabled
     */
    public Boolean getOsFLVDISABLEDDisabled() {
        return osFLVDISABLEDDisabled;
    }

    public void setOsFLVDISABLEDDisabled(Boolean osFLVDISABLEDDisabled) {
        this.osFLVDISABLEDDisabled = osFLVDISABLEDDisabled;
    }

    public ListResizeFlavorsResult withRxtxFactor(Float rxtxFactor) {
        this.rxtxFactor = rxtxFactor;
        return this;
    }

    /**
     * 云服务器可使用网络带宽与网络硬件带宽的比例。  当前未使用该参数，缺省值为1.0。
     * @return rxtxFactor
     */
    public Float getRxtxFactor() {
        return rxtxFactor;
    }

    public void setRxtxFactor(Float rxtxFactor) {
        this.rxtxFactor = rxtxFactor;
    }

    public ListResizeFlavorsResult withRxtxQuota(String rxtxQuota) {
        this.rxtxQuota = rxtxQuota;
        return this;
    }

    /**
     * 云服务器可使用网络带宽的软限制。  当前未使用该参数，缺省值为null。
     * @return rxtxQuota
     */
    public String getRxtxQuota() {
        return rxtxQuota;
    }

    public void setRxtxQuota(String rxtxQuota) {
        this.rxtxQuota = rxtxQuota;
    }

    public ListResizeFlavorsResult withRxtxCap(String rxtxCap) {
        this.rxtxCap = rxtxCap;
        return this;
    }

    /**
     *   云服务器可使用网络带宽的硬限制。  当前未使用该参数，缺省值为null。
     * @return rxtxCap
     */
    public String getRxtxCap() {
        return rxtxCap;
    }

    public void setRxtxCap(String rxtxCap) {
        this.rxtxCap = rxtxCap;
    }

    public ListResizeFlavorsResult withOsFlavorAccessIsPublic(Boolean osFlavorAccessIsPublic) {
        this.osFlavorAccessIsPublic = osFlavorAccessIsPublic;
        return this;
    }

    /**
     * 扩展属性，flavor是否给所有租户使用。  - true：表示给所有租户使用。 - false：表示给指定租户使用。  缺省值为true。
     * @return osFlavorAccessIsPublic
     */
    public Boolean getOsFlavorAccessIsPublic() {
        return osFlavorAccessIsPublic;
    }

    public void setOsFlavorAccessIsPublic(Boolean osFlavorAccessIsPublic) {
        this.osFlavorAccessIsPublic = osFlavorAccessIsPublic;
    }

    public ListResizeFlavorsResult withLinks(List<FlavorLink> links) {
        this.links = links;
        return this;
    }

    public ListResizeFlavorsResult addLinksItem(FlavorLink linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public ListResizeFlavorsResult withLinks(Consumer<List<FlavorLink>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * 规格相关快捷链接地址。
     * @return links
     */
    public List<FlavorLink> getLinks() {
        return links;
    }

    public void setLinks(List<FlavorLink> links) {
        this.links = links;
    }

    public ListResizeFlavorsResult withExtraSpecs(FlavorExtraSpec extraSpecs) {
        this.extraSpecs = extraSpecs;
        return this;
    }

    public ListResizeFlavorsResult withExtraSpecs(Consumer<FlavorExtraSpec> extraSpecsSetter) {
        if (this.extraSpecs == null) {
            this.extraSpecs = new FlavorExtraSpec();
            extraSpecsSetter.accept(this.extraSpecs);
        }

        return this;
    }

    /**
     * Get extraSpecs
     * @return extraSpecs
     */
    public FlavorExtraSpec getExtraSpecs() {
        return extraSpecs;
    }

    public void setExtraSpecs(FlavorExtraSpec extraSpecs) {
        this.extraSpecs = extraSpecs;
    }

    public ListResizeFlavorsResult withInstanceQuota(Object instanceQuota) {
        this.instanceQuota = instanceQuota;
        return this;
    }

    /**
     * 预留属性。
     * @return instanceQuota
     */
    public Object getInstanceQuota() {
        return instanceQuota;
    }

    public void setInstanceQuota(Object instanceQuota) {
        this.instanceQuota = instanceQuota;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListResizeFlavorsResult listResizeFlavorsResult = (ListResizeFlavorsResult) o;
        return Objects.equals(this.id, listResizeFlavorsResult.id)
            && Objects.equals(this.name, listResizeFlavorsResult.name)
            && Objects.equals(this.vcpus, listResizeFlavorsResult.vcpus)
            && Objects.equals(this.ram, listResizeFlavorsResult.ram)
            && Objects.equals(this.disk, listResizeFlavorsResult.disk)
            && Objects.equals(this.swap, listResizeFlavorsResult.swap)
            && Objects.equals(this.osFLVEXTDATAEphemeral, listResizeFlavorsResult.osFLVEXTDATAEphemeral)
            && Objects.equals(this.osFLVDISABLEDDisabled, listResizeFlavorsResult.osFLVDISABLEDDisabled)
            && Objects.equals(this.rxtxFactor, listResizeFlavorsResult.rxtxFactor)
            && Objects.equals(this.rxtxQuota, listResizeFlavorsResult.rxtxQuota)
            && Objects.equals(this.rxtxCap, listResizeFlavorsResult.rxtxCap)
            && Objects.equals(this.osFlavorAccessIsPublic, listResizeFlavorsResult.osFlavorAccessIsPublic)
            && Objects.equals(this.links, listResizeFlavorsResult.links)
            && Objects.equals(this.extraSpecs, listResizeFlavorsResult.extraSpecs)
            && Objects.equals(this.instanceQuota, listResizeFlavorsResult.instanceQuota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            vcpus,
            ram,
            disk,
            swap,
            osFLVEXTDATAEphemeral,
            osFLVDISABLEDDisabled,
            rxtxFactor,
            rxtxQuota,
            rxtxCap,
            osFlavorAccessIsPublic,
            links,
            extraSpecs,
            instanceQuota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResizeFlavorsResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
        sb.append("    swap: ").append(toIndentedString(swap)).append("\n");
        sb.append("    osFLVEXTDATAEphemeral: ").append(toIndentedString(osFLVEXTDATAEphemeral)).append("\n");
        sb.append("    osFLVDISABLEDDisabled: ").append(toIndentedString(osFLVDISABLEDDisabled)).append("\n");
        sb.append("    rxtxFactor: ").append(toIndentedString(rxtxFactor)).append("\n");
        sb.append("    rxtxQuota: ").append(toIndentedString(rxtxQuota)).append("\n");
        sb.append("    rxtxCap: ").append(toIndentedString(rxtxCap)).append("\n");
        sb.append("    osFlavorAccessIsPublic: ").append(toIndentedString(osFlavorAccessIsPublic)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    extraSpecs: ").append(toIndentedString(extraSpecs)).append("\n");
        sb.append("    instanceQuota: ").append(toIndentedString(instanceQuota)).append("\n");
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
