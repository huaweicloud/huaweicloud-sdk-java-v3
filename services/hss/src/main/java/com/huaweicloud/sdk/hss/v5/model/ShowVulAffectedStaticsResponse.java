package com.huaweicloud.sdk.hss.v5.model;

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
public class ShowVulAffectedStaticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_num")

    private Integer vulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_num")

    private Integer imageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_num")

    private Integer containerNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<VulAffectedStatisticsResponseInfoDataList> dataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_vul_num")

    private Integer totalVulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_tips")

    private List<String> extendTips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_text_tips")

    private List<String> extendTextTips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled_operate_types")

    private VulAffectedStatisticsResponseInfoDisabledOperateTypes disabledOperateTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_vul_num")

    private Integer cceVulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_host_num")

    private Integer basicHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_disabled_vul_list")

    private List<VulAffectedStatisticsResponseInfoCceDisabledVulList> cceDisabledVulList = null;

    public ShowVulAffectedStaticsResponse withVulNum(Integer vulNum) {
        this.vulNum = vulNum;
        return this;
    }

    /**
     * **参数解释**: 影响的漏洞数量(按漏洞编号计算) **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return vulNum
     */
    public Integer getVulNum() {
        return vulNum;
    }

    public void setVulNum(Integer vulNum) {
        this.vulNum = vulNum;
    }

    public ShowVulAffectedStaticsResponse withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * **参数解释**: 影响主机数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return hostNum
     */
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    public ShowVulAffectedStaticsResponse withImageNum(Integer imageNum) {
        this.imageNum = imageNum;
        return this;
    }

    /**
     * **参数解释**: 影响镜像数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return imageNum
     */
    public Integer getImageNum() {
        return imageNum;
    }

    public void setImageNum(Integer imageNum) {
        this.imageNum = imageNum;
    }

    public ShowVulAffectedStaticsResponse withContainerNum(Integer containerNum) {
        this.containerNum = containerNum;
        return this;
    }

    /**
     * **参数解释**: 影响容器数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return containerNum
     */
    public Integer getContainerNum() {
        return containerNum;
    }

    public void setContainerNum(Integer containerNum) {
        this.containerNum = containerNum;
    }

    public ShowVulAffectedStaticsResponse withDataList(List<VulAffectedStatisticsResponseInfoDataList> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ShowVulAffectedStaticsResponse addDataListItem(VulAffectedStatisticsResponseInfoDataList dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ShowVulAffectedStaticsResponse withDataList(
        Consumer<List<VulAffectedStatisticsResponseInfoDataList>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * **参数解释**: 按漏洞类型的统计值，当select_type为all_host或空时，有该字段 
     * @return dataList
     */
    public List<VulAffectedStatisticsResponseInfoDataList> getDataList() {
        return dataList;
    }

    public void setDataList(List<VulAffectedStatisticsResponseInfoDataList> dataList) {
        this.dataList = dataList;
    }

    public ShowVulAffectedStaticsResponse withTotalVulNum(Integer totalVulNum) {
        this.totalVulNum = totalVulNum;
        return this;
    }

    /**
     * **参数解释**: 影响的总漏洞条数(主机+漏洞 以此维度计算) **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return totalVulNum
     */
    public Integer getTotalVulNum() {
        return totalVulNum;
    }

    public void setTotalVulNum(Integer totalVulNum) {
        this.totalVulNum = totalVulNum;
    }

    public ShowVulAffectedStaticsResponse withExtendTips(List<String> extendTips) {
        this.extendTips = extendTips;
        return this;
    }

    public ShowVulAffectedStaticsResponse addExtendTipsItem(String extendTipsItem) {
        if (this.extendTips == null) {
            this.extendTips = new ArrayList<>();
        }
        this.extendTips.add(extendTipsItem);
        return this;
    }

    public ShowVulAffectedStaticsResponse withExtendTips(Consumer<List<String>> extendTipsSetter) {
        if (this.extendTips == null) {
            this.extendTips = new ArrayList<>();
        }
        extendTipsSetter.accept(this.extendTips);
        return this;
    }

    /**
     * Get extendTips
     * @return extendTips
     */
    public List<String> getExtendTips() {
        return extendTips;
    }

    public void setExtendTips(List<String> extendTips) {
        this.extendTips = extendTips;
    }

    public ShowVulAffectedStaticsResponse withExtendTextTips(List<String> extendTextTips) {
        this.extendTextTips = extendTextTips;
        return this;
    }

    public ShowVulAffectedStaticsResponse addExtendTextTipsItem(String extendTextTipsItem) {
        if (this.extendTextTips == null) {
            this.extendTextTips = new ArrayList<>();
        }
        this.extendTextTips.add(extendTextTipsItem);
        return this;
    }

    public ShowVulAffectedStaticsResponse withExtendTextTips(Consumer<List<String>> extendTextTipsSetter) {
        if (this.extendTextTips == null) {
            this.extendTextTips = new ArrayList<>();
        }
        extendTextTipsSetter.accept(this.extendTextTips);
        return this;
    }

    /**
     * Get extendTextTips
     * @return extendTextTips
     */
    public List<String> getExtendTextTips() {
        return extendTextTips;
    }

    public void setExtendTextTips(List<String> extendTextTips) {
        this.extendTextTips = extendTextTips;
    }

    public ShowVulAffectedStaticsResponse withDisabledOperateTypes(
        VulAffectedStatisticsResponseInfoDisabledOperateTypes disabledOperateTypes) {
        this.disabledOperateTypes = disabledOperateTypes;
        return this;
    }

    public ShowVulAffectedStaticsResponse withDisabledOperateTypes(
        Consumer<VulAffectedStatisticsResponseInfoDisabledOperateTypes> disabledOperateTypesSetter) {
        if (this.disabledOperateTypes == null) {
            this.disabledOperateTypes = new VulAffectedStatisticsResponseInfoDisabledOperateTypes();
            disabledOperateTypesSetter.accept(this.disabledOperateTypes);
        }

        return this;
    }

    /**
     * Get disabledOperateTypes
     * @return disabledOperateTypes
     */
    public VulAffectedStatisticsResponseInfoDisabledOperateTypes getDisabledOperateTypes() {
        return disabledOperateTypes;
    }

    public void setDisabledOperateTypes(VulAffectedStatisticsResponseInfoDisabledOperateTypes disabledOperateTypes) {
        this.disabledOperateTypes = disabledOperateTypes;
    }

    public ShowVulAffectedStaticsResponse withCceVulNum(Integer cceVulNum) {
        this.cceVulNum = cceVulNum;
        return this;
    }

    /**
     * **参数解释**: CCE漏洞数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return cceVulNum
     */
    public Integer getCceVulNum() {
        return cceVulNum;
    }

    public void setCceVulNum(Integer cceVulNum) {
        this.cceVulNum = cceVulNum;
    }

    public ShowVulAffectedStaticsResponse withBasicHostNum(Integer basicHostNum) {
        this.basicHostNum = basicHostNum;
        return this;
    }

    /**
     * **参数解释**: 基础版主机数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return basicHostNum
     */
    public Integer getBasicHostNum() {
        return basicHostNum;
    }

    public void setBasicHostNum(Integer basicHostNum) {
        this.basicHostNum = basicHostNum;
    }

    public ShowVulAffectedStaticsResponse withCceDisabledVulList(
        List<VulAffectedStatisticsResponseInfoCceDisabledVulList> cceDisabledVulList) {
        this.cceDisabledVulList = cceDisabledVulList;
        return this;
    }

    public ShowVulAffectedStaticsResponse addCceDisabledVulListItem(
        VulAffectedStatisticsResponseInfoCceDisabledVulList cceDisabledVulListItem) {
        if (this.cceDisabledVulList == null) {
            this.cceDisabledVulList = new ArrayList<>();
        }
        this.cceDisabledVulList.add(cceDisabledVulListItem);
        return this;
    }

    public ShowVulAffectedStaticsResponse withCceDisabledVulList(
        Consumer<List<VulAffectedStatisticsResponseInfoCceDisabledVulList>> cceDisabledVulListSetter) {
        if (this.cceDisabledVulList == null) {
            this.cceDisabledVulList = new ArrayList<>();
        }
        cceDisabledVulListSetter.accept(this.cceDisabledVulList);
        return this;
    }

    /**
     * **参数解释**: CCE主机漏洞禁止修复列表 
     * @return cceDisabledVulList
     */
    public List<VulAffectedStatisticsResponseInfoCceDisabledVulList> getCceDisabledVulList() {
        return cceDisabledVulList;
    }

    public void setCceDisabledVulList(List<VulAffectedStatisticsResponseInfoCceDisabledVulList> cceDisabledVulList) {
        this.cceDisabledVulList = cceDisabledVulList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVulAffectedStaticsResponse that = (ShowVulAffectedStaticsResponse) obj;
        return Objects.equals(this.vulNum, that.vulNum) && Objects.equals(this.hostNum, that.hostNum)
            && Objects.equals(this.imageNum, that.imageNum) && Objects.equals(this.containerNum, that.containerNum)
            && Objects.equals(this.dataList, that.dataList) && Objects.equals(this.totalVulNum, that.totalVulNum)
            && Objects.equals(this.extendTips, that.extendTips)
            && Objects.equals(this.extendTextTips, that.extendTextTips)
            && Objects.equals(this.disabledOperateTypes, that.disabledOperateTypes)
            && Objects.equals(this.cceVulNum, that.cceVulNum) && Objects.equals(this.basicHostNum, that.basicHostNum)
            && Objects.equals(this.cceDisabledVulList, that.cceDisabledVulList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulNum,
            hostNum,
            imageNum,
            containerNum,
            dataList,
            totalVulNum,
            extendTips,
            extendTextTips,
            disabledOperateTypes,
            cceVulNum,
            basicHostNum,
            cceDisabledVulList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVulAffectedStaticsResponse {\n");
        sb.append("    vulNum: ").append(toIndentedString(vulNum)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    imageNum: ").append(toIndentedString(imageNum)).append("\n");
        sb.append("    containerNum: ").append(toIndentedString(containerNum)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
        sb.append("    totalVulNum: ").append(toIndentedString(totalVulNum)).append("\n");
        sb.append("    extendTips: ").append(toIndentedString(extendTips)).append("\n");
        sb.append("    extendTextTips: ").append(toIndentedString(extendTextTips)).append("\n");
        sb.append("    disabledOperateTypes: ").append(toIndentedString(disabledOperateTypes)).append("\n");
        sb.append("    cceVulNum: ").append(toIndentedString(cceVulNum)).append("\n");
        sb.append("    basicHostNum: ").append(toIndentedString(basicHostNum)).append("\n");
        sb.append("    cceDisabledVulList: ").append(toIndentedString(cceDisabledVulList)).append("\n");
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
