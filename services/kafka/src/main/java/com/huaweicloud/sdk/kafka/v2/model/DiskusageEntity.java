package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** DiskusageEntity */
public class DiskusageEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_name")

    private String brokerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_disk_size")

    private String dataDiskSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_disk_use")

    private String dataDiskUse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_disk_free")

    private String dataDiskFree;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_disk_use_percentage")

    private String dataDiskUsePercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_list")

    private List<DiskusageTopicEntity> topicList = null;

    public DiskusageEntity withBrokerName(String brokerName) {
        this.brokerName = brokerName;
        return this;
    }

    /** Broker名称。
     * 
     * @return brokerName */
    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public DiskusageEntity withDataDiskSize(String dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }

    /** 磁盘容量。
     * 
     * @return dataDiskSize */
    public String getDataDiskSize() {
        return dataDiskSize;
    }

    public void setDataDiskSize(String dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
    }

    public DiskusageEntity withDataDiskUse(String dataDiskUse) {
        this.dataDiskUse = dataDiskUse;
        return this;
    }

    /** 已使用的磁盘容量。
     * 
     * @return dataDiskUse */
    public String getDataDiskUse() {
        return dataDiskUse;
    }

    public void setDataDiskUse(String dataDiskUse) {
        this.dataDiskUse = dataDiskUse;
    }

    public DiskusageEntity withDataDiskFree(String dataDiskFree) {
        this.dataDiskFree = dataDiskFree;
        return this;
    }

    /** 剩余可用的磁盘容量。
     * 
     * @return dataDiskFree */
    public String getDataDiskFree() {
        return dataDiskFree;
    }

    public void setDataDiskFree(String dataDiskFree) {
        this.dataDiskFree = dataDiskFree;
    }

    public DiskusageEntity withDataDiskUsePercentage(String dataDiskUsePercentage) {
        this.dataDiskUsePercentage = dataDiskUsePercentage;
        return this;
    }

    /** 消息标签。
     * 
     * @return dataDiskUsePercentage */
    public String getDataDiskUsePercentage() {
        return dataDiskUsePercentage;
    }

    public void setDataDiskUsePercentage(String dataDiskUsePercentage) {
        this.dataDiskUsePercentage = dataDiskUsePercentage;
    }

    public DiskusageEntity withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 消息标签。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DiskusageEntity withTopicList(List<DiskusageTopicEntity> topicList) {
        this.topicList = topicList;
        return this;
    }

    public DiskusageEntity addTopicListItem(DiskusageTopicEntity topicListItem) {
        if (this.topicList == null) {
            this.topicList = new ArrayList<>();
        }
        this.topicList.add(topicListItem);
        return this;
    }

    public DiskusageEntity withTopicList(Consumer<List<DiskusageTopicEntity>> topicListSetter) {
        if (this.topicList == null) {
            this.topicList = new ArrayList<>();
        }
        topicListSetter.accept(this.topicList);
        return this;
    }

    /** topic磁盘容量使用列表。
     * 
     * @return topicList */
    public List<DiskusageTopicEntity> getTopicList() {
        return topicList;
    }

    public void setTopicList(List<DiskusageTopicEntity> topicList) {
        this.topicList = topicList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiskusageEntity diskusageEntity = (DiskusageEntity) o;
        return Objects.equals(this.brokerName, diskusageEntity.brokerName)
            && Objects.equals(this.dataDiskSize, diskusageEntity.dataDiskSize)
            && Objects.equals(this.dataDiskUse, diskusageEntity.dataDiskUse)
            && Objects.equals(this.dataDiskFree, diskusageEntity.dataDiskFree)
            && Objects.equals(this.dataDiskUsePercentage, diskusageEntity.dataDiskUsePercentage)
            && Objects.equals(this.status, diskusageEntity.status)
            && Objects.equals(this.topicList, diskusageEntity.topicList);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(brokerName, dataDiskSize, dataDiskUse, dataDiskFree, dataDiskUsePercentage, status, topicList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiskusageEntity {\n");
        sb.append("    brokerName: ").append(toIndentedString(brokerName)).append("\n");
        sb.append("    dataDiskSize: ").append(toIndentedString(dataDiskSize)).append("\n");
        sb.append("    dataDiskUse: ").append(toIndentedString(dataDiskUse)).append("\n");
        sb.append("    dataDiskFree: ").append(toIndentedString(dataDiskFree)).append("\n");
        sb.append("    dataDiskUsePercentage: ").append(toIndentedString(dataDiskUsePercentage)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    topicList: ").append(toIndentedString(topicList)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
