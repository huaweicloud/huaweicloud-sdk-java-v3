package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.NovaLink;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 *  
 */
public class NovaServerFlavor  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private List<NovaLink> links = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vcpus")
    
    private Integer vcpus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ram")
    
    private Integer ram;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disk")
    
    private Integer disk;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ephemeral")
    
    private Integer ephemeral;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="swap")
    
    private Integer swap;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="original_name")
    
    private String originalName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extra_specs")
    
    private Map<String, String> extraSpecs = null;
    
    public NovaServerFlavor withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 云服务器类型ID。  微版本2.47后不支持。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NovaServerFlavor withLinks(List<NovaLink> links) {
        this.links = links;
        return this;
    }

    
    public NovaServerFlavor addLinksItem(NovaLink linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public NovaServerFlavor withLinks(Consumer<List<NovaLink>> linksSetter) {
        if(this.links == null ){
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * 云服务器类型相关标记快捷链接信息。  微版本2.47后不支持。
     * @return links
     */
    public List<NovaLink> getLinks() {
        return links;
    }

    public void setLinks(List<NovaLink> links) {
        this.links = links;
    }

    public NovaServerFlavor withVcpus(Integer vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    


    /**
     * 该云服务器规格对应的CPU核数。  在微版本2.47后支持。
     * @return vcpus
     */
    public Integer getVcpus() {
        return vcpus;
    }

    public void setVcpus(Integer vcpus) {
        this.vcpus = vcpus;
    }

    public NovaServerFlavor withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    


    /**
     * 该云服务器规格对应的内存大小，单位为MB。  在微版本2.47后支持。
     * @return ram
     */
    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public NovaServerFlavor withDisk(Integer disk) {
        this.disk = disk;
        return this;
    }

    


    /**
     * 该云服务器规格对应要求系统盘大小，0为不限制。  在微版本2.47后支持。
     * @return disk
     */
    public Integer getDisk() {
        return disk;
    }

    public void setDisk(Integer disk) {
        this.disk = disk;
    }

    public NovaServerFlavor withEphemeral(Integer ephemeral) {
        this.ephemeral = ephemeral;
        return this;
    }

    


    /**
     * 未使用。  在微版本2.47后支持。
     * @return ephemeral
     */
    public Integer getEphemeral() {
        return ephemeral;
    }

    public void setEphemeral(Integer ephemeral) {
        this.ephemeral = ephemeral;
    }

    public NovaServerFlavor withSwap(Integer swap) {
        this.swap = swap;
        return this;
    }

    


    /**
     * 未使用。  在微版本2.47后支持。
     * @return swap
     */
    public Integer getSwap() {
        return swap;
    }

    public void setSwap(Integer swap) {
        this.swap = swap;
    }

    public NovaServerFlavor withOriginalName(String originalName) {
        this.originalName = originalName;
        return this;
    }

    


    /**
     * 云服务器规格名称。  在微版本2.47后支持。
     * @return originalName
     */
    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public NovaServerFlavor withExtraSpecs(Map<String, String> extraSpecs) {
        this.extraSpecs = extraSpecs;
        return this;
    }

    

    public NovaServerFlavor putExtraSpecsItem(String key, String extraSpecsItem) {
         if (this.extraSpecs == null) {
            this.extraSpecs = new HashMap<>();
         }
        this.extraSpecs.put(key, extraSpecsItem);
        return this;
    }

    public NovaServerFlavor withExtraSpecs(Consumer<Map<String, String>> extraSpecsSetter) {
        if(this.extraSpecs == null ){
            this.extraSpecs = new HashMap<>();
        }
        extraSpecsSetter.accept(this.extraSpecs);
        return this;
    }
    /**
     * flavor扩展字段。  在微版本2.47后支持。
     * @return extraSpecs
     */
    public Map<String, String> getExtraSpecs() {
        return extraSpecs;
    }

    public void setExtraSpecs(Map<String, String> extraSpecs) {
        this.extraSpecs = extraSpecs;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaServerFlavor novaServerFlavor = (NovaServerFlavor) o;
        return Objects.equals(this.id, novaServerFlavor.id) &&
            Objects.equals(this.links, novaServerFlavor.links) &&
            Objects.equals(this.vcpus, novaServerFlavor.vcpus) &&
            Objects.equals(this.ram, novaServerFlavor.ram) &&
            Objects.equals(this.disk, novaServerFlavor.disk) &&
            Objects.equals(this.ephemeral, novaServerFlavor.ephemeral) &&
            Objects.equals(this.swap, novaServerFlavor.swap) &&
            Objects.equals(this.originalName, novaServerFlavor.originalName) &&
            Objects.equals(this.extraSpecs, novaServerFlavor.extraSpecs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, links, vcpus, ram, disk, ephemeral, swap, originalName, extraSpecs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaServerFlavor {\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    links: ").append(toIndentedString(links)).append("\n");
            sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
            sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
            sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
            sb.append("    ephemeral: ").append(toIndentedString(ephemeral)).append("\n");
            sb.append("    swap: ").append(toIndentedString(swap)).append("\n");
            sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
            sb.append("    extraSpecs: ").append(toIndentedString(extraSpecs)).append("\n");
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

