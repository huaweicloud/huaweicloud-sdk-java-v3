package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** flavors数据结构说明 */
public class FlavorsResp {

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

    private List<LinksInfo> links = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_extra_specs")

    private OsExtraSpecs osExtraSpecs;

    public FlavorsResp withId(String id) {
        this.id = id;
        return this;
    }

    /** 裸金属服务器规格的ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FlavorsResp withName(String name) {
        this.name = name;
        return this;
    }

    /** 裸金属服务器规格的名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlavorsResp withVcpus(String vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /** 该裸金属服务器规格对应的CPU核数。
     * 
     * @return vcpus */
    public String getVcpus() {
        return vcpus;
    }

    public void setVcpus(String vcpus) {
        this.vcpus = vcpus;
    }

    public FlavorsResp withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    /** 该裸金属服务器规格对应的内存大小，单位为MB。
     * 
     * @return ram */
    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public FlavorsResp withDisk(String disk) {
        this.disk = disk;
        return this;
    }

    /** 该裸金属服务器规格对应要求系统盘大小，0为不限制。
     * 
     * @return disk */
    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public FlavorsResp withSwap(String swap) {
        this.swap = swap;
        return this;
    }

    /** 未使用
     * 
     * @return swap */
    public String getSwap() {
        return swap;
    }

    public void setSwap(String swap) {
        this.swap = swap;
    }

    public FlavorsResp withOsFLVEXTDATAEphemeral(Integer osFLVEXTDATAEphemeral) {
        this.osFLVEXTDATAEphemeral = osFLVEXTDATAEphemeral;
        return this;
    }

    /** 未使用
     * 
     * @return osFLVEXTDATAEphemeral */
    public Integer getOsFLVEXTDATAEphemeral() {
        return osFLVEXTDATAEphemeral;
    }

    public void setOsFLVEXTDATAEphemeral(Integer osFLVEXTDATAEphemeral) {
        this.osFLVEXTDATAEphemeral = osFLVEXTDATAEphemeral;
    }

    public FlavorsResp withOsFLVDISABLEDDisabled(Boolean osFLVDISABLEDDisabled) {
        this.osFLVDISABLEDDisabled = osFLVDISABLEDDisabled;
        return this;
    }

    /** 未使用
     * 
     * @return osFLVDISABLEDDisabled */
    public Boolean getOsFLVDISABLEDDisabled() {
        return osFLVDISABLEDDisabled;
    }

    public void setOsFLVDISABLEDDisabled(Boolean osFLVDISABLEDDisabled) {
        this.osFLVDISABLEDDisabled = osFLVDISABLEDDisabled;
    }

    public FlavorsResp withRxtxFactor(Float rxtxFactor) {
        this.rxtxFactor = rxtxFactor;
        return this;
    }

    /** 未使用
     * 
     * @return rxtxFactor */
    public Float getRxtxFactor() {
        return rxtxFactor;
    }

    public void setRxtxFactor(Float rxtxFactor) {
        this.rxtxFactor = rxtxFactor;
    }

    public FlavorsResp withRxtxQuota(String rxtxQuota) {
        this.rxtxQuota = rxtxQuota;
        return this;
    }

    /** 未使用
     * 
     * @return rxtxQuota */
    public String getRxtxQuota() {
        return rxtxQuota;
    }

    public void setRxtxQuota(String rxtxQuota) {
        this.rxtxQuota = rxtxQuota;
    }

    public FlavorsResp withRxtxCap(String rxtxCap) {
        this.rxtxCap = rxtxCap;
        return this;
    }

    /** 未使用
     * 
     * @return rxtxCap */
    public String getRxtxCap() {
        return rxtxCap;
    }

    public void setRxtxCap(String rxtxCap) {
        this.rxtxCap = rxtxCap;
    }

    public FlavorsResp withOsFlavorAccessIsPublic(Boolean osFlavorAccessIsPublic) {
        this.osFlavorAccessIsPublic = osFlavorAccessIsPublic;
        return this;
    }

    /** 是否是公共规格。false：私有规格；true：公共规格
     * 
     * @return osFlavorAccessIsPublic */
    public Boolean getOsFlavorAccessIsPublic() {
        return osFlavorAccessIsPublic;
    }

    public void setOsFlavorAccessIsPublic(Boolean osFlavorAccessIsPublic) {
        this.osFlavorAccessIsPublic = osFlavorAccessIsPublic;
    }

    public FlavorsResp withLinks(List<LinksInfo> links) {
        this.links = links;
        return this;
    }

    public FlavorsResp addLinksItem(LinksInfo linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public FlavorsResp withLinks(Consumer<List<LinksInfo>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /** 规格相关快捷链接地址，详情请参见表3 links字段数据结构说明。
     * 
     * @return links */
    public List<LinksInfo> getLinks() {
        return links;
    }

    public void setLinks(List<LinksInfo> links) {
        this.links = links;
    }

    public FlavorsResp withOsExtraSpecs(OsExtraSpecs osExtraSpecs) {
        this.osExtraSpecs = osExtraSpecs;
        return this;
    }

    public FlavorsResp withOsExtraSpecs(Consumer<OsExtraSpecs> osExtraSpecsSetter) {
        if (this.osExtraSpecs == null) {
            this.osExtraSpecs = new OsExtraSpecs();
            osExtraSpecsSetter.accept(this.osExtraSpecs);
        }

        return this;
    }

    /** Get osExtraSpecs
     * 
     * @return osExtraSpecs */
    public OsExtraSpecs getOsExtraSpecs() {
        return osExtraSpecs;
    }

    public void setOsExtraSpecs(OsExtraSpecs osExtraSpecs) {
        this.osExtraSpecs = osExtraSpecs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlavorsResp flavorsResp = (FlavorsResp) o;
        return Objects.equals(this.id, flavorsResp.id) && Objects.equals(this.name, flavorsResp.name)
            && Objects.equals(this.vcpus, flavorsResp.vcpus) && Objects.equals(this.ram, flavorsResp.ram)
            && Objects.equals(this.disk, flavorsResp.disk) && Objects.equals(this.swap, flavorsResp.swap)
            && Objects.equals(this.osFLVEXTDATAEphemeral, flavorsResp.osFLVEXTDATAEphemeral)
            && Objects.equals(this.osFLVDISABLEDDisabled, flavorsResp.osFLVDISABLEDDisabled)
            && Objects.equals(this.rxtxFactor, flavorsResp.rxtxFactor)
            && Objects.equals(this.rxtxQuota, flavorsResp.rxtxQuota)
            && Objects.equals(this.rxtxCap, flavorsResp.rxtxCap)
            && Objects.equals(this.osFlavorAccessIsPublic, flavorsResp.osFlavorAccessIsPublic)
            && Objects.equals(this.links, flavorsResp.links)
            && Objects.equals(this.osExtraSpecs, flavorsResp.osExtraSpecs);
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
            osExtraSpecs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorsResp {\n");
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
        sb.append("    osExtraSpecs: ").append(toIndentedString(osExtraSpecs)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
