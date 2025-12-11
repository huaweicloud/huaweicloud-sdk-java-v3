package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云服务器具体变更信息
 */
public class FileHostResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_total_num")

    private Integer changeTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_file_num")

    private Integer changeFileNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_registry_num")

    private Integer changeRegistryNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_time")

    private Long latestTime;

    public FileHostResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 服务器名称 **取值范围**: 字符长度1-256位 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public FileHostResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**： 服务器（主机）的唯一标识ID **取值范围**： 字符长度1-64位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public FileHostResponseInfo withChangeTotalNum(Integer changeTotalNum) {
        this.changeTotalNum = changeTotalNum;
        return this;
    }

    /**
     * **参数解释**： 文件变更与注册表变更总数量 **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return changeTotalNum
     */
    public Integer getChangeTotalNum() {
        return changeTotalNum;
    }

    public void setChangeTotalNum(Integer changeTotalNum) {
        this.changeTotalNum = changeTotalNum;
    }

    public FileHostResponseInfo withChangeFileNum(Integer changeFileNum) {
        this.changeFileNum = changeFileNum;
        return this;
    }

    /**
     * **参数解释**： 文件变更总数量 **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return changeFileNum
     */
    public Integer getChangeFileNum() {
        return changeFileNum;
    }

    public void setChangeFileNum(Integer changeFileNum) {
        this.changeFileNum = changeFileNum;
    }

    public FileHostResponseInfo withChangeRegistryNum(Integer changeRegistryNum) {
        this.changeRegistryNum = changeRegistryNum;
        return this;
    }

    /**
     * **参数解释**： 注册表变更总数量 **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return changeRegistryNum
     */
    public Integer getChangeRegistryNum() {
        return changeRegistryNum;
    }

    public void setChangeRegistryNum(Integer changeRegistryNum) {
        this.changeRegistryNum = changeRegistryNum;
    }

    public FileHostResponseInfo withLatestTime(Long latestTime) {
        this.latestTime = latestTime;
        return this;
    }

    /**
     * **参数解释**： 最后一次文件/注册表变更时间 **取值范围**： 非负长整数，时间格式：13位毫秒级时间戳（UTC时区，从1970-01-01 00:00:00开始计算），单位：ms 
     * minimum: 1609430400000
     * maximum: 4765104000000
     * @return latestTime
     */
    public Long getLatestTime() {
        return latestTime;
    }

    public void setLatestTime(Long latestTime) {
        this.latestTime = latestTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FileHostResponseInfo that = (FileHostResponseInfo) obj;
        return Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.changeTotalNum, that.changeTotalNum)
            && Objects.equals(this.changeFileNum, that.changeFileNum)
            && Objects.equals(this.changeRegistryNum, that.changeRegistryNum)
            && Objects.equals(this.latestTime, that.latestTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostName, hostId, changeTotalNum, changeFileNum, changeRegistryNum, latestTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileHostResponseInfo {\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    changeTotalNum: ").append(toIndentedString(changeTotalNum)).append("\n");
        sb.append("    changeFileNum: ").append(toIndentedString(changeFileNum)).append("\n");
        sb.append("    changeRegistryNum: ").append(toIndentedString(changeRegistryNum)).append("\n");
        sb.append("    latestTime: ").append(toIndentedString(latestTime)).append("\n");
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
