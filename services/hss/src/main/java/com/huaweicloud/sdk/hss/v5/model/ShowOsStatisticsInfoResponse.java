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
public class ShowOsStatisticsInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "win_num")

    private Integer winNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linux_num")

    private Integer linuxNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_list")

    private List<OsStatisticsInfo> osList = null;

    public ShowOsStatisticsInfoResponse withWinNum(Integer winNum) {
        this.winNum = winNum;
        return this;
    }

    /**
     * win_num
     * @return winNum
     */
    public Integer getWinNum() {
        return winNum;
    }

    public void setWinNum(Integer winNum) {
        this.winNum = winNum;
    }

    public ShowOsStatisticsInfoResponse withLinuxNum(Integer linuxNum) {
        this.linuxNum = linuxNum;
        return this;
    }

    /**
     * linux_num
     * @return linuxNum
     */
    public Integer getLinuxNum() {
        return linuxNum;
    }

    public void setLinuxNum(Integer linuxNum) {
        this.linuxNum = linuxNum;
    }

    public ShowOsStatisticsInfoResponse withOsList(List<OsStatisticsInfo> osList) {
        this.osList = osList;
        return this;
    }

    public ShowOsStatisticsInfoResponse addOsListItem(OsStatisticsInfo osListItem) {
        if (this.osList == null) {
            this.osList = new ArrayList<>();
        }
        this.osList.add(osListItem);
        return this;
    }

    public ShowOsStatisticsInfoResponse withOsList(Consumer<List<OsStatisticsInfo>> osListSetter) {
        if (this.osList == null) {
            this.osList = new ArrayList<>();
        }
        osListSetter.accept(this.osList);
        return this;
    }

    /**
     * 操作系统统计数据列表
     * @return osList
     */
    public List<OsStatisticsInfo> getOsList() {
        return osList;
    }

    public void setOsList(List<OsStatisticsInfo> osList) {
        this.osList = osList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOsStatisticsInfoResponse that = (ShowOsStatisticsInfoResponse) obj;
        return Objects.equals(this.winNum, that.winNum) && Objects.equals(this.linuxNum, that.linuxNum)
            && Objects.equals(this.osList, that.osList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(winNum, linuxNum, osList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOsStatisticsInfoResponse {\n");
        sb.append("    winNum: ").append(toIndentedString(winNum)).append("\n");
        sb.append("    linuxNum: ").append(toIndentedString(linuxNum)).append("\n");
        sb.append("    osList: ").append(toIndentedString(osList)).append("\n");
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
