package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 主机信息
 */
public class HostInfoDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_tag")

    private String hostTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_status")

    private String hostStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_name")

    private String osName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_version")

    private String containerVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private List<Nic> nics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private String specification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_details")

    private List<NPUDetailsDTO> npuDetails = null;

    public HostInfoDTO withHostTag(String hostTag) {
        this.hostTag = hostTag;
        return this;
    }

    /**
     * 主机标签DEFAULT|MASTER|SLAVE
     * @return hostTag
     */
    public String getHostTag() {
        return hostTag;
    }

    public void setHostTag(String hostTag) {
        this.hostTag = hostTag;
    }

    public HostInfoDTO withHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    /**
     * 主机工作状态(ONLINE|OFFLINE)
     * @return hostStatus
     */
    public String getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
    }

    public HostInfoDTO withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * 边缘节点操作系统。例如：Ubuntu 20.04；CentOS 7.9。不同于os_type边缘节点系统类型。
     * @return osName
     */
    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public HostInfoDTO withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 边缘节点主机名
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public HostInfoDTO withContainerVersion(String containerVersion) {
        this.containerVersion = containerVersion;
        return this;
    }

    /**
     * 容器运行时版本
     * @return containerVersion
     */
    public String getContainerVersion() {
        return containerVersion;
    }

    public void setContainerVersion(String containerVersion) {
        this.containerVersion = containerVersion;
    }

    public HostInfoDTO withNics(List<Nic> nics) {
        this.nics = nics;
        return this;
    }

    public HostInfoDTO addNicsItem(Nic nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public HostInfoDTO withNics(Consumer<List<Nic>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * 边缘节点网络网卡信息
     * @return nics
     */
    public List<Nic> getNics() {
        return nics;
    }

    public void setNics(List<Nic> nics) {
        this.nics = nics;
    }

    public HostInfoDTO withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * 网络规格，如4 cores | 3867 MB
     * @return specification
     */
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public HostInfoDTO withNpuDetails(List<NPUDetailsDTO> npuDetails) {
        this.npuDetails = npuDetails;
        return this;
    }

    public HostInfoDTO addNpuDetailsItem(NPUDetailsDTO npuDetailsItem) {
        if (this.npuDetails == null) {
            this.npuDetails = new ArrayList<>();
        }
        this.npuDetails.add(npuDetailsItem);
        return this;
    }

    public HostInfoDTO withNpuDetails(Consumer<List<NPUDetailsDTO>> npuDetailsSetter) {
        if (this.npuDetails == null) {
            this.npuDetails = new ArrayList<>();
        }
        npuDetailsSetter.accept(this.npuDetails);
        return this;
    }

    /**
     * NPU设备详细信息，包括硬件信息和使用情况。
     * @return npuDetails
     */
    public List<NPUDetailsDTO> getNpuDetails() {
        return npuDetails;
    }

    public void setNpuDetails(List<NPUDetailsDTO> npuDetails) {
        this.npuDetails = npuDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostInfoDTO that = (HostInfoDTO) obj;
        return Objects.equals(this.hostTag, that.hostTag) && Objects.equals(this.hostStatus, that.hostStatus)
            && Objects.equals(this.osName, that.osName) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.containerVersion, that.containerVersion) && Objects.equals(this.nics, that.nics)
            && Objects.equals(this.specification, that.specification)
            && Objects.equals(this.npuDetails, that.npuDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostTag, hostStatus, osName, hostName, containerVersion, nics, specification, npuDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostInfoDTO {\n");
        sb.append("    hostTag: ").append(toIndentedString(hostTag)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    containerVersion: ").append(toIndentedString(containerVersion)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    npuDetails: ").append(toIndentedString(npuDetails)).append("\n");
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
