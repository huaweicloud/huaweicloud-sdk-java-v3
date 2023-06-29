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
public class ShowSpResourceResponse extends SdkResponse {

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
    @JsonProperty(value = "corpCount")

    private ResDetailDTO corpCount;

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
    @JsonProperty(value = "enablePstn")

    private Boolean enablePstn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableSMS")

    private Boolean enableSMS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groupList")

    private List<QueryCorpGroupDTO> groupList = null;

    public ShowSpResourceResponse withTe1080pHardCount(ResDetailDTO te1080pHardCount) {
        this.te1080pHardCount = te1080pHardCount;
        return this;
    }

    public ShowSpResourceResponse withTe1080pHardCount(Consumer<ResDetailDTO> te1080pHardCountSetter) {
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

    public ShowSpResourceResponse withTe720pHardCount(ResDetailDTO te720pHardCount) {
        this.te720pHardCount = te720pHardCount;
        return this;
    }

    public ShowSpResourceResponse withTe720pHardCount(Consumer<ResDetailDTO> te720pHardCountSetter) {
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

    public ShowSpResourceResponse withTeSoftCount(ResDetailDTO teSoftCount) {
        this.teSoftCount = teSoftCount;
        return this;
    }

    public ShowSpResourceResponse withTeSoftCount(Consumer<ResDetailDTO> teSoftCountSetter) {
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

    public ShowSpResourceResponse withRoomCount(ResDetailDTO roomCount) {
        this.roomCount = roomCount;
        return this;
    }

    public ShowSpResourceResponse withRoomCount(Consumer<ResDetailDTO> roomCountSetter) {
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

    public ShowSpResourceResponse withRecordCapability(ResDetailDTO recordCapability) {
        this.recordCapability = recordCapability;
        return this;
    }

    public ShowSpResourceResponse withRecordCapability(Consumer<ResDetailDTO> recordCapabilitySetter) {
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

    public ShowSpResourceResponse withConfCallCount(ResDetailDTO confCallCount) {
        this.confCallCount = confCallCount;
        return this;
    }

    public ShowSpResourceResponse withConfCallCount(Consumer<ResDetailDTO> confCallCountSetter) {
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

    public ShowSpResourceResponse withLiveCount(ResDetailDTO liveCount) {
        this.liveCount = liveCount;
        return this;
    }

    public ShowSpResourceResponse withLiveCount(Consumer<ResDetailDTO> liveCountSetter) {
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

    public ShowSpResourceResponse withCorpCount(ResDetailDTO corpCount) {
        this.corpCount = corpCount;
        return this;
    }

    public ShowSpResourceResponse withCorpCount(Consumer<ResDetailDTO> corpCountSetter) {
        if (this.corpCount == null) {
            this.corpCount = new ResDetailDTO();
            corpCountSetter.accept(this.corpCount);
        }

        return this;
    }

    /**
     * Get corpCount
     * @return corpCount
     */
    public ResDetailDTO getCorpCount() {
        return corpCount;
    }

    public void setCorpCount(ResDetailDTO corpCount) {
        this.corpCount = corpCount;
    }

    public ShowSpResourceResponse withThirdPartyHardCount(ResDetailDTO thirdPartyHardCount) {
        this.thirdPartyHardCount = thirdPartyHardCount;
        return this;
    }

    public ShowSpResourceResponse withThirdPartyHardCount(Consumer<ResDetailDTO> thirdPartyHardCountSetter) {
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

    public ShowSpResourceResponse withHwVisionCount(ResDetailDTO hwVisionCount) {
        this.hwVisionCount = hwVisionCount;
        return this;
    }

    public ShowSpResourceResponse withHwVisionCount(Consumer<ResDetailDTO> hwVisionCountSetter) {
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

    public ShowSpResourceResponse withIdeaHubCount(ResDetailDTO ideaHubCount) {
        this.ideaHubCount = ideaHubCount;
        return this;
    }

    public ShowSpResourceResponse withIdeaHubCount(Consumer<ResDetailDTO> ideaHubCountSetter) {
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

    public ShowSpResourceResponse withEnablePstn(Boolean enablePstn) {
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

    public ShowSpResourceResponse withEnableSMS(Boolean enableSMS) {
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

    public ShowSpResourceResponse withGroupList(List<QueryCorpGroupDTO> groupList) {
        this.groupList = groupList;
        return this;
    }

    public ShowSpResourceResponse addGroupListItem(QueryCorpGroupDTO groupListItem) {
        if (this.groupList == null) {
            this.groupList = new ArrayList<>();
        }
        this.groupList.add(groupListItem);
        return this;
    }

    public ShowSpResourceResponse withGroupList(Consumer<List<QueryCorpGroupDTO>> groupListSetter) {
        if (this.groupList == null) {
            this.groupList = new ArrayList<>();
        }
        groupListSetter.accept(this.groupList);
        return this;
    }

    /**
     * SP管理员绑定的分组列表。
     * @return groupList
     */
    public List<QueryCorpGroupDTO> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<QueryCorpGroupDTO> groupList) {
        this.groupList = groupList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSpResourceResponse that = (ShowSpResourceResponse) obj;
        return Objects.equals(this.te1080pHardCount, that.te1080pHardCount)
            && Objects.equals(this.te720pHardCount, that.te720pHardCount)
            && Objects.equals(this.teSoftCount, that.teSoftCount) && Objects.equals(this.roomCount, that.roomCount)
            && Objects.equals(this.recordCapability, that.recordCapability)
            && Objects.equals(this.confCallCount, that.confCallCount) && Objects.equals(this.liveCount, that.liveCount)
            && Objects.equals(this.corpCount, that.corpCount)
            && Objects.equals(this.thirdPartyHardCount, that.thirdPartyHardCount)
            && Objects.equals(this.hwVisionCount, that.hwVisionCount)
            && Objects.equals(this.ideaHubCount, that.ideaHubCount) && Objects.equals(this.enablePstn, that.enablePstn)
            && Objects.equals(this.enableSMS, that.enableSMS) && Objects.equals(this.groupList, that.groupList);
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
            corpCount,
            thirdPartyHardCount,
            hwVisionCount,
            ideaHubCount,
            enablePstn,
            enableSMS,
            groupList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSpResourceResponse {\n");
        sb.append("    te1080pHardCount: ").append(toIndentedString(te1080pHardCount)).append("\n");
        sb.append("    te720pHardCount: ").append(toIndentedString(te720pHardCount)).append("\n");
        sb.append("    teSoftCount: ").append(toIndentedString(teSoftCount)).append("\n");
        sb.append("    roomCount: ").append(toIndentedString(roomCount)).append("\n");
        sb.append("    recordCapability: ").append(toIndentedString(recordCapability)).append("\n");
        sb.append("    confCallCount: ").append(toIndentedString(confCallCount)).append("\n");
        sb.append("    liveCount: ").append(toIndentedString(liveCount)).append("\n");
        sb.append("    corpCount: ").append(toIndentedString(corpCount)).append("\n");
        sb.append("    thirdPartyHardCount: ").append(toIndentedString(thirdPartyHardCount)).append("\n");
        sb.append("    hwVisionCount: ").append(toIndentedString(hwVisionCount)).append("\n");
        sb.append("    ideaHubCount: ").append(toIndentedString(ideaHubCount)).append("\n");
        sb.append("    enablePstn: ").append(toIndentedString(enablePstn)).append("\n");
        sb.append("    enableSMS: ").append(toIndentedString(enableSMS)).append("\n");
        sb.append("    groupList: ").append(toIndentedString(groupList)).append("\n");
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
