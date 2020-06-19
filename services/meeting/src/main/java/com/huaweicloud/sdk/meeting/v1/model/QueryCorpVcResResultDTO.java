package com.huaweicloud.sdk.meeting.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.QueryVmrPkgResResultDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 企业资源信息
 */
public class QueryCorpVcResResultDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vmrPkgList")
    
    private List<QueryVmrPkgResResultDTO> vmrPkgList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="te1080pHardCount")
    
    private Integer te1080pHardCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="te720pHardCount")
    
    private Integer te720pHardCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="teSoftCount")
    
    private Integer teSoftCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roomCount")
    
    private Integer roomCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="recordCapability")
    
    private Integer recordCapability;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confCallCount")
    
    private Integer confCallCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="liveCount")
    
    private Integer liveCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="thirdPartyHardCount")
    
    private Integer thirdPartyHardCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hwVisionCount")
    
    private Integer hwVisionCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ideaHubCount")
    
    private Integer ideaHubCount;

    public QueryCorpVcResResultDTO withVmrPkgList(List<QueryVmrPkgResResultDTO> vmrPkgList) {
        this.vmrPkgList = vmrPkgList;
        return this;
    }

    
    public QueryCorpVcResResultDTO addVmrPkgListItem(QueryVmrPkgResResultDTO vmrPkgListItem) {
        if (this.vmrPkgList == null) {
            this.vmrPkgList = new ArrayList<>();
        }
        this.vmrPkgList.add(vmrPkgListItem);
        return this;
    }

    public QueryCorpVcResResultDTO withVmrPkgList(Consumer<List<QueryVmrPkgResResultDTO>> vmrPkgListSetter) {
        if(this.vmrPkgList == null ){
            this.vmrPkgList = new ArrayList<>();
        }
        vmrPkgListSetter.accept(this.vmrPkgList);
        return this;
    }

    /**
     * 虚拟会议室类型列表,最多支持8个，暂不限制
     * @return vmrPkgList
     */
    public List<QueryVmrPkgResResultDTO> getVmrPkgList() {
        return vmrPkgList;
    }

    public void setVmrPkgList(List<QueryVmrPkgResResultDTO> vmrPkgList) {
        this.vmrPkgList = vmrPkgList;
    }

    public QueryCorpVcResResultDTO withTe1080pHardCount(Integer te1080pHardCount) {
        this.te1080pHardCount = te1080pHardCount;
        return this;
    }

    


    /**
     * 1080P硬终端账户数
     * @return te1080pHardCount
     */
    public Integer getTe1080pHardCount() {
        return te1080pHardCount;
    }

    public void setTe1080pHardCount(Integer te1080pHardCount) {
        this.te1080pHardCount = te1080pHardCount;
    }

    public QueryCorpVcResResultDTO withTe720pHardCount(Integer te720pHardCount) {
        this.te720pHardCount = te720pHardCount;
        return this;
    }

    


    /**
     * 720P硬终端账户数
     * @return te720pHardCount
     */
    public Integer getTe720pHardCount() {
        return te720pHardCount;
    }

    public void setTe720pHardCount(Integer te720pHardCount) {
        this.te720pHardCount = te720pHardCount;
    }

    public QueryCorpVcResResultDTO withTeSoftCount(Integer teSoftCount) {
        this.teSoftCount = teSoftCount;
        return this;
    }

    


    /**
     * 软终端账户数
     * @return teSoftCount
     */
    public Integer getTeSoftCount() {
        return teSoftCount;
    }

    public void setTeSoftCount(Integer teSoftCount) {
        this.teSoftCount = teSoftCount;
    }

    public QueryCorpVcResResultDTO withRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
        return this;
    }

    


    /**
     * 大屏软终端数量
     * @return roomCount
     */
    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    public QueryCorpVcResResultDTO withRecordCapability(Integer recordCapability) {
        this.recordCapability = recordCapability;
        return this;
    }

    


    /**
     * 录播存储空间 （单位：G）
     * @return recordCapability
     */
    public Integer getRecordCapability() {
        return recordCapability;
    }

    public void setRecordCapability(Integer recordCapability) {
        this.recordCapability = recordCapability;
    }

    public QueryCorpVcResResultDTO withConfCallCount(Integer confCallCount) {
        this.confCallCount = confCallCount;
        return this;
    }

    


    /**
     * 会议并发方数
     * @return confCallCount
     */
    public Integer getConfCallCount() {
        return confCallCount;
    }

    public void setConfCallCount(Integer confCallCount) {
        this.confCallCount = confCallCount;
    }

    public QueryCorpVcResResultDTO withLiveCount(Integer liveCount) {
        this.liveCount = liveCount;
        return this;
    }

    


    /**
     * 推流并发数量
     * @return liveCount
     */
    public Integer getLiveCount() {
        return liveCount;
    }

    public void setLiveCount(Integer liveCount) {
        this.liveCount = liveCount;
    }

    public QueryCorpVcResResultDTO withThirdPartyHardCount(Integer thirdPartyHardCount) {
        this.thirdPartyHardCount = thirdPartyHardCount;
        return this;
    }

    


    /**
     * 第三方硬终端接入数
     * @return thirdPartyHardCount
     */
    public Integer getThirdPartyHardCount() {
        return thirdPartyHardCount;
    }

    public void setThirdPartyHardCount(Integer thirdPartyHardCount) {
        this.thirdPartyHardCount = thirdPartyHardCount;
    }

    public QueryCorpVcResResultDTO withHwVisionCount(Integer hwVisionCount) {
        this.hwVisionCount = hwVisionCount;
        return this;
    }

    


    /**
     * 智慧屏终端接入数
     * @return hwVisionCount
     */
    public Integer getHwVisionCount() {
        return hwVisionCount;
    }

    public void setHwVisionCount(Integer hwVisionCount) {
        this.hwVisionCount = hwVisionCount;
    }

    public QueryCorpVcResResultDTO withIdeaHubCount(Integer ideaHubCount) {
        this.ideaHubCount = ideaHubCount;
        return this;
    }

    


    /**
     * ideahub终端接入数
     * @return ideaHubCount
     */
    public Integer getIdeaHubCount() {
        return ideaHubCount;
    }

    public void setIdeaHubCount(Integer ideaHubCount) {
        this.ideaHubCount = ideaHubCount;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryCorpVcResResultDTO queryCorpVcResResultDTO = (QueryCorpVcResResultDTO) o;
        return Objects.equals(this.vmrPkgList, queryCorpVcResResultDTO.vmrPkgList) &&
            Objects.equals(this.te1080pHardCount, queryCorpVcResResultDTO.te1080pHardCount) &&
            Objects.equals(this.te720pHardCount, queryCorpVcResResultDTO.te720pHardCount) &&
            Objects.equals(this.teSoftCount, queryCorpVcResResultDTO.teSoftCount) &&
            Objects.equals(this.roomCount, queryCorpVcResResultDTO.roomCount) &&
            Objects.equals(this.recordCapability, queryCorpVcResResultDTO.recordCapability) &&
            Objects.equals(this.confCallCount, queryCorpVcResResultDTO.confCallCount) &&
            Objects.equals(this.liveCount, queryCorpVcResResultDTO.liveCount) &&
            Objects.equals(this.thirdPartyHardCount, queryCorpVcResResultDTO.thirdPartyHardCount) &&
            Objects.equals(this.hwVisionCount, queryCorpVcResResultDTO.hwVisionCount) &&
            Objects.equals(this.ideaHubCount, queryCorpVcResResultDTO.ideaHubCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(vmrPkgList, te1080pHardCount, te720pHardCount, teSoftCount, roomCount, recordCapability, confCallCount, liveCount, thirdPartyHardCount, hwVisionCount, ideaHubCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCorpVcResResultDTO {\n");
        sb.append("    vmrPkgList: ").append(toIndentedString(vmrPkgList)).append("\n");
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

