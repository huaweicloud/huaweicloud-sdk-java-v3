package com.huaweicloud.sdk.deh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 专属主机类型。
 */
public class DedicatedHostType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type")

    private String hostType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private Integer vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cores")

    private Integer cores;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sockets")

    private Integer sockets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Integer memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_flavors")

    private List<String> supportedFlavors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_offerings")

    private List<DedicatedHostTypeOffering> availabilityZoneOfferings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public DedicatedHostType withHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }

    /**
     * 专属主机类型。
     * @return hostType
     */
    public String getHostType() {
        return hostType;
    }

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }

    public DedicatedHostType withVcpus(Integer vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * 专属主机类型的vCPU数量。
     * @return vcpus
     */
    public Integer getVcpus() {
        return vcpus;
    }

    public void setVcpus(Integer vcpus) {
        this.vcpus = vcpus;
    }

    public DedicatedHostType withCores(Integer cores) {
        this.cores = cores;
        return this;
    }

    /**
     * 专属主机类型的核心数量。
     * @return cores
     */
    public Integer getCores() {
        return cores;
    }

    public void setCores(Integer cores) {
        this.cores = cores;
    }

    public DedicatedHostType withSockets(Integer sockets) {
        this.sockets = sockets;
        return this;
    }

    /**
     * 专属主机类型的物理套接字数量。
     * @return sockets
     */
    public Integer getSockets() {
        return sockets;
    }

    public void setSockets(Integer sockets) {
        this.sockets = sockets;
    }

    public DedicatedHostType withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 专属主机类型的内存大小。
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public DedicatedHostType withSupportedFlavors(List<String> supportedFlavors) {
        this.supportedFlavors = supportedFlavors;
        return this;
    }

    public DedicatedHostType addSupportedFlavorsItem(String supportedFlavorsItem) {
        if (this.supportedFlavors == null) {
            this.supportedFlavors = new ArrayList<>();
        }
        this.supportedFlavors.add(supportedFlavorsItem);
        return this;
    }

    public DedicatedHostType withSupportedFlavors(Consumer<List<String>> supportedFlavorsSetter) {
        if (this.supportedFlavors == null) {
            this.supportedFlavors = new ArrayList<>();
        }
        supportedFlavorsSetter.accept(this.supportedFlavors);
        return this;
    }

    /**
     * 专属主机规格列表。
     * @return supportedFlavors
     */
    public List<String> getSupportedFlavors() {
        return supportedFlavors;
    }

    public void setSupportedFlavors(List<String> supportedFlavors) {
        this.supportedFlavors = supportedFlavors;
    }

    public DedicatedHostType withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 专属主机类型的类别。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public DedicatedHostType withAvailabilityZoneOfferings(List<DedicatedHostTypeOffering> availabilityZoneOfferings) {
        this.availabilityZoneOfferings = availabilityZoneOfferings;
        return this;
    }

    public DedicatedHostType addAvailabilityZoneOfferingsItem(DedicatedHostTypeOffering availabilityZoneOfferingsItem) {
        if (this.availabilityZoneOfferings == null) {
            this.availabilityZoneOfferings = new ArrayList<>();
        }
        this.availabilityZoneOfferings.add(availabilityZoneOfferingsItem);
        return this;
    }

    public DedicatedHostType withAvailabilityZoneOfferings(
        Consumer<List<DedicatedHostTypeOffering>> availabilityZoneOfferingsSetter) {
        if (this.availabilityZoneOfferings == null) {
            this.availabilityZoneOfferings = new ArrayList<>();
        }
        availabilityZoneOfferingsSetter.accept(this.availabilityZoneOfferings);
        return this;
    }

    /**
     * Get availabilityZoneOfferings
     * @return availabilityZoneOfferings
     */
    public List<DedicatedHostTypeOffering> getAvailabilityZoneOfferings() {
        return availabilityZoneOfferings;
    }

    public void setAvailabilityZoneOfferings(List<DedicatedHostTypeOffering> availabilityZoneOfferings) {
        this.availabilityZoneOfferings = availabilityZoneOfferings;
    }

    public DedicatedHostType withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public DedicatedHostType withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DedicatedHostType that = (DedicatedHostType) obj;
        return Objects.equals(this.hostType, that.hostType) && Objects.equals(this.vcpus, that.vcpus)
            && Objects.equals(this.cores, that.cores) && Objects.equals(this.sockets, that.sockets)
            && Objects.equals(this.memory, that.memory) && Objects.equals(this.supportedFlavors, that.supportedFlavors)
            && Objects.equals(this.category, that.category)
            && Objects.equals(this.availabilityZoneOfferings, that.availabilityZoneOfferings)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostType,
            vcpus,
            cores,
            sockets,
            memory,
            supportedFlavors,
            category,
            availabilityZoneOfferings,
            pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DedicatedHostType {\n");
        sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
        sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    supportedFlavors: ").append(toIndentedString(supportedFlavors)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    availabilityZoneOfferings: ").append(toIndentedString(availabilityZoneOfferings)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
