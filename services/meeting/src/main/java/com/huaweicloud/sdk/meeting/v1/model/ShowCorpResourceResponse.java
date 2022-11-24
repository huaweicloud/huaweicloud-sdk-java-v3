package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCorpResourceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "te1080pHardCount")

    private ResDetailDTO te1080pHardCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "te720pHardCount")

    private ResDetailDTO te720pHardCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "teSoftCount")

    private ResDetailDTO teSoftCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roomCount")

    private ResDetailDTO roomCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordCapability")

    private ResDetailDTO recordCapability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confCallCount")

    private ResDetailDTO confCallCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "liveCount")

    private ResDetailDTO liveCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thirdPartyHardCount")

    private ResDetailDTO thirdPartyHardCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hwVisionCount")

    private ResDetailDTO hwVisionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ideaHubCount")

    private ResDetailDTO ideaHubCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmr")

    private List<QueryVmrPkgResResultDTO> vmr = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enablePstn")

    private Boolean enablePstn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableSMS")

    private Boolean enableSMS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableHybridCloud")

    private Boolean enableHybridCloud;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableCloudDisk")

    private Boolean enableCloudDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableUc")

    private Boolean enableUc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableAiMinutes")

    private Boolean enableAiMinutes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "singleConfCallCount")

    private Integer singleConfCallCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confLength")

    private Integer confLength;

    public ShowCorpResourceResponse withTe1080pHardCount(ResDetailDTO te1080pHardCount) {
        this.te1080pHardCount = te1080pHardCount;
        return this;
    }

    public ShowCorpResourceResponse withTe1080pHardCount(Consumer<ResDetailDTO> te1080pHardCountSetter) {
        if (this.te1080pHardCount == null) {
            this.te1080pHardCount = new ResDetailDTO();
            te1080pHardCountSetter.accept(this.te1080pHardCount);
        }

        return this;
    }

    /**
     * Get te1080pHardCount
     * @return te1080pHardCount
     */
    public ResDetailDTO getTe1080pHardCount() {
        return te1080pHardCount;
    }

    public void setTe1080pHardCount(ResDetailDTO te1080pHardCount) {
        this.te1080pHardCount = te1080pHardCount;
    }

    public ShowCorpResourceResponse withTe720pHardCount(ResDetailDTO te720pHardCount) {
        this.te720pHardCount = te720pHardCount;
        return this;
    }

    public ShowCorpResourceResponse withTe720pHardCount(Consumer<ResDetailDTO> te720pHardCountSetter) {
        if (this.te720pHardCount == null) {
            this.te720pHardCount = new ResDetailDTO();
            te720pHardCountSetter.accept(this.te720pHardCount);
        }

        return this;
    }

    /**
     * Get te720pHardCount
     * @return te720pHardCount
     */
    public ResDetailDTO getTe720pHardCount() {
        return te720pHardCount;
    }

    public void setTe720pHardCount(ResDetailDTO te720pHardCount) {
        this.te720pHardCount = te720pHardCount;
    }

    public ShowCorpResourceResponse withTeSoftCount(ResDetailDTO teSoftCount) {
        this.teSoftCount = teSoftCount;
        return this;
    }

    public ShowCorpResourceResponse withTeSoftCount(Consumer<ResDetailDTO> teSoftCountSetter) {
        if (this.teSoftCount == null) {
            this.teSoftCount = new ResDetailDTO();
            teSoftCountSetter.accept(this.teSoftCount);
        }

        return this;
    }

    /**
     * Get teSoftCount
     * @return teSoftCount
     */
    public ResDetailDTO getTeSoftCount() {
        return teSoftCount;
    }

    public void setTeSoftCount(ResDetailDTO teSoftCount) {
        this.teSoftCount = teSoftCount;
    }

    public ShowCorpResourceResponse withRoomCount(ResDetailDTO roomCount) {
        this.roomCount = roomCount;
        return this;
    }

    public ShowCorpResourceResponse withRoomCount(Consumer<ResDetailDTO> roomCountSetter) {
        if (this.roomCount == null) {
            this.roomCount = new ResDetailDTO();
            roomCountSetter.accept(this.roomCount);
        }

        return this;
    }

    /**
     * Get roomCount
     * @return roomCount
     */
    public ResDetailDTO getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(ResDetailDTO roomCount) {
        this.roomCount = roomCount;
    }

    public ShowCorpResourceResponse withRecordCapability(ResDetailDTO recordCapability) {
        this.recordCapability = recordCapability;
        return this;
    }

    public ShowCorpResourceResponse withRecordCapability(Consumer<ResDetailDTO> recordCapabilitySetter) {
        if (this.recordCapability == null) {
            this.recordCapability = new ResDetailDTO();
            recordCapabilitySetter.accept(this.recordCapability);
        }

        return this;
    }

    /**
     * Get recordCapability
     * @return recordCapability
     */
    public ResDetailDTO getRecordCapability() {
        return recordCapability;
    }

    public void setRecordCapability(ResDetailDTO recordCapability) {
        this.recordCapability = recordCapability;
    }

    public ShowCorpResourceResponse withConfCallCount(ResDetailDTO confCallCount) {
        this.confCallCount = confCallCount;
        return this;
    }

    public ShowCorpResourceResponse withConfCallCount(Consumer<ResDetailDTO> confCallCountSetter) {
        if (this.confCallCount == null) {
            this.confCallCount = new ResDetailDTO();
            confCallCountSetter.accept(this.confCallCount);
        }

        return this;
    }

    /**
     * Get confCallCount
     * @return confCallCount
     */
    public ResDetailDTO getConfCallCount() {
        return confCallCount;
    }

    public void setConfCallCount(ResDetailDTO confCallCount) {
        this.confCallCount = confCallCount;
    }

    public ShowCorpResourceResponse withLiveCount(ResDetailDTO liveCount) {
        this.liveCount = liveCount;
        return this;
    }

    public ShowCorpResourceResponse withLiveCount(Consumer<ResDetailDTO> liveCountSetter) {
        if (this.liveCount == null) {
            this.liveCount = new ResDetailDTO();
            liveCountSetter.accept(this.liveCount);
        }

        return this;
    }

    /**
     * Get liveCount
     * @return liveCount
     */
    public ResDetailDTO getLiveCount() {
        return liveCount;
    }

    public void setLiveCount(ResDetailDTO liveCount) {
        this.liveCount = liveCount;
    }

    public ShowCorpResourceResponse withThirdPartyHardCount(ResDetailDTO thirdPartyHardCount) {
        this.thirdPartyHardCount = thirdPartyHardCount;
        return this;
    }

    public ShowCorpResourceResponse withThirdPartyHardCount(Consumer<ResDetailDTO> thirdPartyHardCountSetter) {
        if (this.thirdPartyHardCount == null) {
            this.thirdPartyHardCount = new ResDetailDTO();
            thirdPartyHardCountSetter.accept(this.thirdPartyHardCount);
        }

        return this;
    }

    /**
     * Get thirdPartyHardCount
     * @return thirdPartyHardCount
     */
    public ResDetailDTO getThirdPartyHardCount() {
        return thirdPartyHardCount;
    }

    public void setThirdPartyHardCount(ResDetailDTO thirdPartyHardCount) {
        this.thirdPartyHardCount = thirdPartyHardCount;
    }

    public ShowCorpResourceResponse withHwVisionCount(ResDetailDTO hwVisionCount) {
        this.hwVisionCount = hwVisionCount;
        return this;
    }

    public ShowCorpResourceResponse withHwVisionCount(Consumer<ResDetailDTO> hwVisionCountSetter) {
        if (this.hwVisionCount == null) {
            this.hwVisionCount = new ResDetailDTO();
            hwVisionCountSetter.accept(this.hwVisionCount);
        }

        return this;
    }

    /**
     * Get hwVisionCount
     * @return hwVisionCount
     */
    public ResDetailDTO getHwVisionCount() {
        return hwVisionCount;
    }

    public void setHwVisionCount(ResDetailDTO hwVisionCount) {
        this.hwVisionCount = hwVisionCount;
    }

    public ShowCorpResourceResponse withIdeaHubCount(ResDetailDTO ideaHubCount) {
        this.ideaHubCount = ideaHubCount;
        return this;
    }

    public ShowCorpResourceResponse withIdeaHubCount(Consumer<ResDetailDTO> ideaHubCountSetter) {
        if (this.ideaHubCount == null) {
            this.ideaHubCount = new ResDetailDTO();
            ideaHubCountSetter.accept(this.ideaHubCount);
        }

        return this;
    }

    /**
     * Get ideaHubCount
     * @return ideaHubCount
     */
    public ResDetailDTO getIdeaHubCount() {
        return ideaHubCount;
    }

    public void setIdeaHubCount(ResDetailDTO ideaHubCount) {
        this.ideaHubCount = ideaHubCount;
    }

    public ShowCorpResourceResponse withVmr(List<QueryVmrPkgResResultDTO> vmr) {
        this.vmr = vmr;
        return this;
    }

    public ShowCorpResourceResponse addVmrItem(QueryVmrPkgResResultDTO vmrItem) {
        if (this.vmr == null) {
            this.vmr = new ArrayList<>();
        }
        this.vmr.add(vmrItem);
        return this;
    }

    public ShowCorpResourceResponse withVmr(Consumer<List<QueryVmrPkgResResultDTO>> vmrSetter) {
        if (this.vmr == null) {
            this.vmr = new ArrayList<>();
        }
        vmrSetter.accept(this.vmr);
        return this;
    }

    /**
     * 查询云会议室套餐包分配数量结果。
     * @return vmr
     */
    public List<QueryVmrPkgResResultDTO> getVmr() {
        return vmr;
    }

    public void setVmr(List<QueryVmrPkgResResultDTO> vmr) {
        this.vmr = vmr;
    }

    public ShowCorpResourceResponse withEnablePstn(Boolean enablePstn) {
        this.enablePstn = enablePstn;
        return this;
    }

    /**
     * 在创建企业的时候设置的pstn权限开关。
     * @return enablePstn
     */
    public Boolean getEnablePstn() {
        return enablePstn;
    }

    public void setEnablePstn(Boolean enablePstn) {
        this.enablePstn = enablePstn;
    }

    public ShowCorpResourceResponse withEnableSMS(Boolean enableSMS) {
        this.enableSMS = enableSMS;
        return this;
    }

    /**
     * 企业是否通过短信形式发送会议通知。
     * @return enableSMS
     */
    public Boolean getEnableSMS() {
        return enableSMS;
    }

    public void setEnableSMS(Boolean enableSMS) {
        this.enableSMS = enableSMS;
    }

    public ShowCorpResourceResponse withEnableHybridCloud(Boolean enableHybridCloud) {
        this.enableHybridCloud = enableHybridCloud;
        return this;
    }

    /**
     * 企业是否开启混合云模式。
     * @return enableHybridCloud
     */
    public Boolean getEnableHybridCloud() {
        return enableHybridCloud;
    }

    public void setEnableHybridCloud(Boolean enableHybridCloud) {
        this.enableHybridCloud = enableHybridCloud;
    }

    public ShowCorpResourceResponse withEnableCloudDisk(Boolean enableCloudDisk) {
        this.enableCloudDisk = enableCloudDisk;
        return this;
    }

    /**
     * 是否开启云盘。
     * @return enableCloudDisk
     */
    public Boolean getEnableCloudDisk() {
        return enableCloudDisk;
    }

    public void setEnableCloudDisk(Boolean enableCloudDisk) {
        this.enableCloudDisk = enableCloudDisk;
    }

    public ShowCorpResourceResponse withEnableUc(Boolean enableUc) {
        this.enableUc = enableUc;
        return this;
    }

    /**
     * 是否开启UC功能。
     * @return enableUc
     */
    public Boolean getEnableUc() {
        return enableUc;
    }

    public void setEnableUc(Boolean enableUc) {
        this.enableUc = enableUc;
    }

    public ShowCorpResourceResponse withEnableAiMinutes(Boolean enableAiMinutes) {
        this.enableAiMinutes = enableAiMinutes;
        return this;
    }

    /**
     * 是否开启Ai会议纪要。
     * @return enableAiMinutes
     */
    public Boolean getEnableAiMinutes() {
        return enableAiMinutes;
    }

    public void setEnableAiMinutes(Boolean enableAiMinutes) {
        this.enableAiMinutes = enableAiMinutes;
    }

    public ShowCorpResourceResponse withSingleConfCallCount(Integer singleConfCallCount) {
        this.singleConfCallCount = singleConfCallCount;
        return this;
    }

    /**
     * 单会议并发呼叫数。
     * @return singleConfCallCount
     */
    public Integer getSingleConfCallCount() {
        return singleConfCallCount;
    }

    public void setSingleConfCallCount(Integer singleConfCallCount) {
        this.singleConfCallCount = singleConfCallCount;
    }

    public ShowCorpResourceResponse withConfLength(Integer confLength) {
        this.confLength = confLength;
        return this;
    }

    /**
     * 会议时长。
     * @return confLength
     */
    public Integer getConfLength() {
        return confLength;
    }

    public void setConfLength(Integer confLength) {
        this.confLength = confLength;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCorpResourceResponse showCorpResourceResponse = (ShowCorpResourceResponse) o;
        return Objects.equals(this.te1080pHardCount, showCorpResourceResponse.te1080pHardCount)
            && Objects.equals(this.te720pHardCount, showCorpResourceResponse.te720pHardCount)
            && Objects.equals(this.teSoftCount, showCorpResourceResponse.teSoftCount)
            && Objects.equals(this.roomCount, showCorpResourceResponse.roomCount)
            && Objects.equals(this.recordCapability, showCorpResourceResponse.recordCapability)
            && Objects.equals(this.confCallCount, showCorpResourceResponse.confCallCount)
            && Objects.equals(this.liveCount, showCorpResourceResponse.liveCount)
            && Objects.equals(this.thirdPartyHardCount, showCorpResourceResponse.thirdPartyHardCount)
            && Objects.equals(this.hwVisionCount, showCorpResourceResponse.hwVisionCount)
            && Objects.equals(this.ideaHubCount, showCorpResourceResponse.ideaHubCount)
            && Objects.equals(this.vmr, showCorpResourceResponse.vmr)
            && Objects.equals(this.enablePstn, showCorpResourceResponse.enablePstn)
            && Objects.equals(this.enableSMS, showCorpResourceResponse.enableSMS)
            && Objects.equals(this.enableHybridCloud, showCorpResourceResponse.enableHybridCloud)
            && Objects.equals(this.enableCloudDisk, showCorpResourceResponse.enableCloudDisk)
            && Objects.equals(this.enableUc, showCorpResourceResponse.enableUc)
            && Objects.equals(this.enableAiMinutes, showCorpResourceResponse.enableAiMinutes)
            && Objects.equals(this.singleConfCallCount, showCorpResourceResponse.singleConfCallCount)
            && Objects.equals(this.confLength, showCorpResourceResponse.confLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(te1080pHardCount,
            te720pHardCount,
            teSoftCount,
            roomCount,
            recordCapability,
            confCallCount,
            liveCount,
            thirdPartyHardCount,
            hwVisionCount,
            ideaHubCount,
            vmr,
            enablePstn,
            enableSMS,
            enableHybridCloud,
            enableCloudDisk,
            enableUc,
            enableAiMinutes,
            singleConfCallCount,
            confLength);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCorpResourceResponse {\n");
        sb.append("    te1080pHardCount: ").append(toIndentedString(te1080pHardCount)).append("\n");
        sb.append("    te720pHardCount: ").append(toIndentedString(te720pHardCount)).append("\n");
        sb.append("    teSoftCount: ").append(toIndentedString(teSoftCount)).append("\n");
        sb.append("    roomCount: ").append(toIndentedString(roomCount)).append("\n");
        sb.append("    recordCapability: ").append(toIndentedString(recordCapability)).append("\n");
        sb.append("    confCallCount: ").append(toIndentedString(confCallCount)).append("\n");
        sb.append("    liveCount: ").append(toIndentedString(liveCount)).append("\n");
        sb.append("    thirdPartyHardCount: ").append(toIndentedString(thirdPartyHardCount)).append("\n");
        sb.append("    hwVisionCount: ").append(toIndentedString(hwVisionCount)).append("\n");
        sb.append("    ideaHubCount: ").append(toIndentedString(ideaHubCount)).append("\n");
        sb.append("    vmr: ").append(toIndentedString(vmr)).append("\n");
        sb.append("    enablePstn: ").append(toIndentedString(enablePstn)).append("\n");
        sb.append("    enableSMS: ").append(toIndentedString(enableSMS)).append("\n");
        sb.append("    enableHybridCloud: ").append(toIndentedString(enableHybridCloud)).append("\n");
        sb.append("    enableCloudDisk: ").append(toIndentedString(enableCloudDisk)).append("\n");
        sb.append("    enableUc: ").append(toIndentedString(enableUc)).append("\n");
        sb.append("    enableAiMinutes: ").append(toIndentedString(enableAiMinutes)).append("\n");
        sb.append("    singleConfCallCount: ").append(toIndentedString(singleConfCallCount)).append("\n");
        sb.append("    confLength: ").append(toIndentedString(confLength)).append("\n");
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
