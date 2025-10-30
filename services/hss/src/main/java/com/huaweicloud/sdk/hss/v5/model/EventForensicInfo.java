package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 事件取证
 */
public class EventForensicInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occur_time")

    private Long occurTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_forensic_list")

    private List<FileForensicInfo> fileForensicList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_chain_forensic")

    private List<List<ProcessForensicInfo>> processChainForensic = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_forensic")

    private EventForensicInfoNetworkForensic networkForensic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_forensic")

    private EventForensicInfoUserForensic userForensic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_forensic")

    private EventForensicInfoRegistryForensic registryForensic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_login_forensic")

    private EventForensicInfoAbnormalLoginForensic abnormalLoginForensic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_forensic")

    private EventForensicInfoContainerForensic containerForensic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malware_forensic")

    private EventForensicInfoMalwareForensic malwareForensic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_launch_forensic")

    private EventForensicInfoAutoLaunchForensic autoLaunchForensic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kernel_forensic_list")

    private List<KernelForensicInfo> kernelForensicList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "geo_forensic")

    private EventForensicInfoGeoForensic geoForensic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_forensic")

    private EventForensicInfoStackForensic stackForensic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_block_forensic")

    private EventForensicInfoImageBlockForensic imageBlockForensic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "honey_forensic")

    private List<HoneyForensicInfo> honeyForensic = null;

    public EventForensicInfo withOccurTime(Long occurTime) {
        this.occurTime = occurTime;
        return this;
    }

    /**
     * **参数解释**： 发生时间，毫秒 **取值范围**： 不涉及
     * minimum: 0
     * maximum: 9223372036854775807
     * @return occurTime
     */
    public Long getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(Long occurTime) {
        this.occurTime = occurTime;
    }

    public EventForensicInfo withFileForensicList(List<FileForensicInfo> fileForensicList) {
        this.fileForensicList = fileForensicList;
        return this;
    }

    public EventForensicInfo addFileForensicListItem(FileForensicInfo fileForensicListItem) {
        if (this.fileForensicList == null) {
            this.fileForensicList = new ArrayList<>();
        }
        this.fileForensicList.add(fileForensicListItem);
        return this;
    }

    public EventForensicInfo withFileForensicList(Consumer<List<FileForensicInfo>> fileForensicListSetter) {
        if (this.fileForensicList == null) {
            this.fileForensicList = new ArrayList<>();
        }
        fileForensicListSetter.accept(this.fileForensicList);
        return this;
    }

    /**
     * **参数解释**： 文件取证信息列表 **取值范围**： 不涉及
     * @return fileForensicList
     */
    public List<FileForensicInfo> getFileForensicList() {
        return fileForensicList;
    }

    public void setFileForensicList(List<FileForensicInfo> fileForensicList) {
        this.fileForensicList = fileForensicList;
    }

    public EventForensicInfo withProcessChainForensic(List<List<ProcessForensicInfo>> processChainForensic) {
        this.processChainForensic = processChainForensic;
        return this;
    }

    public EventForensicInfo addProcessChainForensicItem(List<ProcessForensicInfo> processChainForensicItem) {
        if (this.processChainForensic == null) {
            this.processChainForensic = new ArrayList<>();
        }
        this.processChainForensic.add(processChainForensicItem);
        return this;
    }

    public EventForensicInfo withProcessChainForensic(
        Consumer<List<List<ProcessForensicInfo>>> processChainForensicSetter) {
        if (this.processChainForensic == null) {
            this.processChainForensic = new ArrayList<>();
        }
        processChainForensicSetter.accept(this.processChainForensic);
        return this;
    }

    /**
     * **参数解释**： 进程链取证信息 **取值范围**： 不涉及
     * @return processChainForensic
     */
    public List<List<ProcessForensicInfo>> getProcessChainForensic() {
        return processChainForensic;
    }

    public void setProcessChainForensic(List<List<ProcessForensicInfo>> processChainForensic) {
        this.processChainForensic = processChainForensic;
    }

    public EventForensicInfo withNetworkForensic(EventForensicInfoNetworkForensic networkForensic) {
        this.networkForensic = networkForensic;
        return this;
    }

    public EventForensicInfo withNetworkForensic(Consumer<EventForensicInfoNetworkForensic> networkForensicSetter) {
        if (this.networkForensic == null) {
            this.networkForensic = new EventForensicInfoNetworkForensic();
            networkForensicSetter.accept(this.networkForensic);
        }

        return this;
    }

    /**
     * Get networkForensic
     * @return networkForensic
     */
    public EventForensicInfoNetworkForensic getNetworkForensic() {
        return networkForensic;
    }

    public void setNetworkForensic(EventForensicInfoNetworkForensic networkForensic) {
        this.networkForensic = networkForensic;
    }

    public EventForensicInfo withUserForensic(EventForensicInfoUserForensic userForensic) {
        this.userForensic = userForensic;
        return this;
    }

    public EventForensicInfo withUserForensic(Consumer<EventForensicInfoUserForensic> userForensicSetter) {
        if (this.userForensic == null) {
            this.userForensic = new EventForensicInfoUserForensic();
            userForensicSetter.accept(this.userForensic);
        }

        return this;
    }

    /**
     * Get userForensic
     * @return userForensic
     */
    public EventForensicInfoUserForensic getUserForensic() {
        return userForensic;
    }

    public void setUserForensic(EventForensicInfoUserForensic userForensic) {
        this.userForensic = userForensic;
    }

    public EventForensicInfo withRegistryForensic(EventForensicInfoRegistryForensic registryForensic) {
        this.registryForensic = registryForensic;
        return this;
    }

    public EventForensicInfo withRegistryForensic(Consumer<EventForensicInfoRegistryForensic> registryForensicSetter) {
        if (this.registryForensic == null) {
            this.registryForensic = new EventForensicInfoRegistryForensic();
            registryForensicSetter.accept(this.registryForensic);
        }

        return this;
    }

    /**
     * Get registryForensic
     * @return registryForensic
     */
    public EventForensicInfoRegistryForensic getRegistryForensic() {
        return registryForensic;
    }

    public void setRegistryForensic(EventForensicInfoRegistryForensic registryForensic) {
        this.registryForensic = registryForensic;
    }

    public EventForensicInfo withAbnormalLoginForensic(EventForensicInfoAbnormalLoginForensic abnormalLoginForensic) {
        this.abnormalLoginForensic = abnormalLoginForensic;
        return this;
    }

    public EventForensicInfo withAbnormalLoginForensic(
        Consumer<EventForensicInfoAbnormalLoginForensic> abnormalLoginForensicSetter) {
        if (this.abnormalLoginForensic == null) {
            this.abnormalLoginForensic = new EventForensicInfoAbnormalLoginForensic();
            abnormalLoginForensicSetter.accept(this.abnormalLoginForensic);
        }

        return this;
    }

    /**
     * Get abnormalLoginForensic
     * @return abnormalLoginForensic
     */
    public EventForensicInfoAbnormalLoginForensic getAbnormalLoginForensic() {
        return abnormalLoginForensic;
    }

    public void setAbnormalLoginForensic(EventForensicInfoAbnormalLoginForensic abnormalLoginForensic) {
        this.abnormalLoginForensic = abnormalLoginForensic;
    }

    public EventForensicInfo withContainerForensic(EventForensicInfoContainerForensic containerForensic) {
        this.containerForensic = containerForensic;
        return this;
    }

    public EventForensicInfo withContainerForensic(
        Consumer<EventForensicInfoContainerForensic> containerForensicSetter) {
        if (this.containerForensic == null) {
            this.containerForensic = new EventForensicInfoContainerForensic();
            containerForensicSetter.accept(this.containerForensic);
        }

        return this;
    }

    /**
     * Get containerForensic
     * @return containerForensic
     */
    public EventForensicInfoContainerForensic getContainerForensic() {
        return containerForensic;
    }

    public void setContainerForensic(EventForensicInfoContainerForensic containerForensic) {
        this.containerForensic = containerForensic;
    }

    public EventForensicInfo withMalwareForensic(EventForensicInfoMalwareForensic malwareForensic) {
        this.malwareForensic = malwareForensic;
        return this;
    }

    public EventForensicInfo withMalwareForensic(Consumer<EventForensicInfoMalwareForensic> malwareForensicSetter) {
        if (this.malwareForensic == null) {
            this.malwareForensic = new EventForensicInfoMalwareForensic();
            malwareForensicSetter.accept(this.malwareForensic);
        }

        return this;
    }

    /**
     * Get malwareForensic
     * @return malwareForensic
     */
    public EventForensicInfoMalwareForensic getMalwareForensic() {
        return malwareForensic;
    }

    public void setMalwareForensic(EventForensicInfoMalwareForensic malwareForensic) {
        this.malwareForensic = malwareForensic;
    }

    public EventForensicInfo withAutoLaunchForensic(EventForensicInfoAutoLaunchForensic autoLaunchForensic) {
        this.autoLaunchForensic = autoLaunchForensic;
        return this;
    }

    public EventForensicInfo withAutoLaunchForensic(
        Consumer<EventForensicInfoAutoLaunchForensic> autoLaunchForensicSetter) {
        if (this.autoLaunchForensic == null) {
            this.autoLaunchForensic = new EventForensicInfoAutoLaunchForensic();
            autoLaunchForensicSetter.accept(this.autoLaunchForensic);
        }

        return this;
    }

    /**
     * Get autoLaunchForensic
     * @return autoLaunchForensic
     */
    public EventForensicInfoAutoLaunchForensic getAutoLaunchForensic() {
        return autoLaunchForensic;
    }

    public void setAutoLaunchForensic(EventForensicInfoAutoLaunchForensic autoLaunchForensic) {
        this.autoLaunchForensic = autoLaunchForensic;
    }

    public EventForensicInfo withKernelForensicList(List<KernelForensicInfo> kernelForensicList) {
        this.kernelForensicList = kernelForensicList;
        return this;
    }

    public EventForensicInfo addKernelForensicListItem(KernelForensicInfo kernelForensicListItem) {
        if (this.kernelForensicList == null) {
            this.kernelForensicList = new ArrayList<>();
        }
        this.kernelForensicList.add(kernelForensicListItem);
        return this;
    }

    public EventForensicInfo withKernelForensicList(Consumer<List<KernelForensicInfo>> kernelForensicListSetter) {
        if (this.kernelForensicList == null) {
            this.kernelForensicList = new ArrayList<>();
        }
        kernelForensicListSetter.accept(this.kernelForensicList);
        return this;
    }

    /**
     * **参数解释**： 内核取证信息 **取值范围**： 不涉及
     * @return kernelForensicList
     */
    public List<KernelForensicInfo> getKernelForensicList() {
        return kernelForensicList;
    }

    public void setKernelForensicList(List<KernelForensicInfo> kernelForensicList) {
        this.kernelForensicList = kernelForensicList;
    }

    public EventForensicInfo withGeoForensic(EventForensicInfoGeoForensic geoForensic) {
        this.geoForensic = geoForensic;
        return this;
    }

    public EventForensicInfo withGeoForensic(Consumer<EventForensicInfoGeoForensic> geoForensicSetter) {
        if (this.geoForensic == null) {
            this.geoForensic = new EventForensicInfoGeoForensic();
            geoForensicSetter.accept(this.geoForensic);
        }

        return this;
    }

    /**
     * Get geoForensic
     * @return geoForensic
     */
    public EventForensicInfoGeoForensic getGeoForensic() {
        return geoForensic;
    }

    public void setGeoForensic(EventForensicInfoGeoForensic geoForensic) {
        this.geoForensic = geoForensic;
    }

    public EventForensicInfo withStackForensic(EventForensicInfoStackForensic stackForensic) {
        this.stackForensic = stackForensic;
        return this;
    }

    public EventForensicInfo withStackForensic(Consumer<EventForensicInfoStackForensic> stackForensicSetter) {
        if (this.stackForensic == null) {
            this.stackForensic = new EventForensicInfoStackForensic();
            stackForensicSetter.accept(this.stackForensic);
        }

        return this;
    }

    /**
     * Get stackForensic
     * @return stackForensic
     */
    public EventForensicInfoStackForensic getStackForensic() {
        return stackForensic;
    }

    public void setStackForensic(EventForensicInfoStackForensic stackForensic) {
        this.stackForensic = stackForensic;
    }

    public EventForensicInfo withImageBlockForensic(EventForensicInfoImageBlockForensic imageBlockForensic) {
        this.imageBlockForensic = imageBlockForensic;
        return this;
    }

    public EventForensicInfo withImageBlockForensic(
        Consumer<EventForensicInfoImageBlockForensic> imageBlockForensicSetter) {
        if (this.imageBlockForensic == null) {
            this.imageBlockForensic = new EventForensicInfoImageBlockForensic();
            imageBlockForensicSetter.accept(this.imageBlockForensic);
        }

        return this;
    }

    /**
     * Get imageBlockForensic
     * @return imageBlockForensic
     */
    public EventForensicInfoImageBlockForensic getImageBlockForensic() {
        return imageBlockForensic;
    }

    public void setImageBlockForensic(EventForensicInfoImageBlockForensic imageBlockForensic) {
        this.imageBlockForensic = imageBlockForensic;
    }

    public EventForensicInfo withHoneyForensic(List<HoneyForensicInfo> honeyForensic) {
        this.honeyForensic = honeyForensic;
        return this;
    }

    public EventForensicInfo addHoneyForensicItem(HoneyForensicInfo honeyForensicItem) {
        if (this.honeyForensic == null) {
            this.honeyForensic = new ArrayList<>();
        }
        this.honeyForensic.add(honeyForensicItem);
        return this;
    }

    public EventForensicInfo withHoneyForensic(Consumer<List<HoneyForensicInfo>> honeyForensicSetter) {
        if (this.honeyForensic == null) {
            this.honeyForensic = new ArrayList<>();
        }
        honeyForensicSetter.accept(this.honeyForensic);
        return this;
    }

    /**
     * **参数解释**： 蜜罐相关取证信息 **取值范围**： 不涉及
     * @return honeyForensic
     */
    public List<HoneyForensicInfo> getHoneyForensic() {
        return honeyForensic;
    }

    public void setHoneyForensic(List<HoneyForensicInfo> honeyForensic) {
        this.honeyForensic = honeyForensic;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventForensicInfo that = (EventForensicInfo) obj;
        return Objects.equals(this.occurTime, that.occurTime)
            && Objects.equals(this.fileForensicList, that.fileForensicList)
            && Objects.equals(this.processChainForensic, that.processChainForensic)
            && Objects.equals(this.networkForensic, that.networkForensic)
            && Objects.equals(this.userForensic, that.userForensic)
            && Objects.equals(this.registryForensic, that.registryForensic)
            && Objects.equals(this.abnormalLoginForensic, that.abnormalLoginForensic)
            && Objects.equals(this.containerForensic, that.containerForensic)
            && Objects.equals(this.malwareForensic, that.malwareForensic)
            && Objects.equals(this.autoLaunchForensic, that.autoLaunchForensic)
            && Objects.equals(this.kernelForensicList, that.kernelForensicList)
            && Objects.equals(this.geoForensic, that.geoForensic)
            && Objects.equals(this.stackForensic, that.stackForensic)
            && Objects.equals(this.imageBlockForensic, that.imageBlockForensic)
            && Objects.equals(this.honeyForensic, that.honeyForensic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(occurTime,
            fileForensicList,
            processChainForensic,
            networkForensic,
            userForensic,
            registryForensic,
            abnormalLoginForensic,
            containerForensic,
            malwareForensic,
            autoLaunchForensic,
            kernelForensicList,
            geoForensic,
            stackForensic,
            imageBlockForensic,
            honeyForensic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventForensicInfo {\n");
        sb.append("    occurTime: ").append(toIndentedString(occurTime)).append("\n");
        sb.append("    fileForensicList: ").append(toIndentedString(fileForensicList)).append("\n");
        sb.append("    processChainForensic: ").append(toIndentedString(processChainForensic)).append("\n");
        sb.append("    networkForensic: ").append(toIndentedString(networkForensic)).append("\n");
        sb.append("    userForensic: ").append(toIndentedString(userForensic)).append("\n");
        sb.append("    registryForensic: ").append(toIndentedString(registryForensic)).append("\n");
        sb.append("    abnormalLoginForensic: ").append(toIndentedString(abnormalLoginForensic)).append("\n");
        sb.append("    containerForensic: ").append(toIndentedString(containerForensic)).append("\n");
        sb.append("    malwareForensic: ").append(toIndentedString(malwareForensic)).append("\n");
        sb.append("    autoLaunchForensic: ").append(toIndentedString(autoLaunchForensic)).append("\n");
        sb.append("    kernelForensicList: ").append(toIndentedString(kernelForensicList)).append("\n");
        sb.append("    geoForensic: ").append(toIndentedString(geoForensic)).append("\n");
        sb.append("    stackForensic: ").append(toIndentedString(stackForensic)).append("\n");
        sb.append("    imageBlockForensic: ").append(toIndentedString(imageBlockForensic)).append("\n");
        sb.append("    honeyForensic: ").append(toIndentedString(honeyForensic)).append("\n");
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
