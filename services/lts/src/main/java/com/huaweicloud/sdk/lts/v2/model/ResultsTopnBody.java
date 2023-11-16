package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResultsTopnBody
 */
public class ResultsTopnBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_traffic")

    private Double indexTraffic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage")

    private Double storage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "write_traffic")

    private Double writeTraffic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_name")

    private String logGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name")

    private String logStreamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_transfer")

    private Double basicTransfer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "senior_transfer")

    private Double seniorTransfer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_agency_transfer")

    private Boolean isAgencyTransfer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cold_storage")

    private Double coldStorage;

    public ResultsTopnBody withIndexTraffic(Double indexTraffic) {
        this.indexTraffic = indexTraffic;
        return this;
    }

    /**
     * 索引流量，byte, 查询数据类型中包含index时返回
     * @return indexTraffic
     */
    public Double getIndexTraffic() {
        return indexTraffic;
    }

    public void setIndexTraffic(Double indexTraffic) {
        this.indexTraffic = indexTraffic;
    }

    public ResultsTopnBody withStorage(Double storage) {
        this.storage = storage;
        return this;
    }

    /**
     * 存储量，byte, 查询数据类型中包含storage时返回
     * @return storage
     */
    public Double getStorage() {
        return storage;
    }

    public void setStorage(Double storage) {
        this.storage = storage;
    }

    public ResultsTopnBody withWriteTraffic(Double writeTraffic) {
        this.writeTraffic = writeTraffic;
        return this;
    }

    /**
     * 写入流量，byte, 查询数据类型中包含write时返回
     * @return writeTraffic
     */
    public Double getWriteTraffic() {
        return writeTraffic;
    }

    public void setWriteTraffic(Double writeTraffic) {
        this.writeTraffic = writeTraffic;
    }

    public ResultsTopnBody withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * 日志组id，资源类型为日志组时返回
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public ResultsTopnBody withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * 日志组名称，资源类型为日志组时返回
     * @return logGroupName
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public ResultsTopnBody withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /**
     * 日志流id，资源类型为日志流时返回
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public ResultsTopnBody withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * 日志流名称，资源类型为日志流时返回
     * @return logStreamName
     */
    public String getLogStreamName() {
        return logStreamName;
    }

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    public ResultsTopnBody withBasicTransfer(Double basicTransfer) {
        this.basicTransfer = basicTransfer;
        return this;
    }

    /**
     * 基础转储流量，byte, 查询数据类型中包含basicTransfer时返回
     * @return basicTransfer
     */
    public Double getBasicTransfer() {
        return basicTransfer;
    }

    public void setBasicTransfer(Double basicTransfer) {
        this.basicTransfer = basicTransfer;
    }

    public ResultsTopnBody withSeniorTransfer(Double seniorTransfer) {
        this.seniorTransfer = seniorTransfer;
        return this;
    }

    /**
     * 基础转储流量，byte, 查询数据类型中包含seniorTransfer时返回
     * @return seniorTransfer
     */
    public Double getSeniorTransfer() {
        return seniorTransfer;
    }

    public void setSeniorTransfer(Double seniorTransfer) {
        this.seniorTransfer = seniorTransfer;
    }

    public ResultsTopnBody withIsAgencyTransfer(Boolean isAgencyTransfer) {
        this.isAgencyTransfer = isAgencyTransfer;
        return this;
    }

    /**
     * 不是委托转储，true，是委托转储，则前端资源统计展示的流不能跳
     * @return isAgencyTransfer
     */
    public Boolean getIsAgencyTransfer() {
        return isAgencyTransfer;
    }

    public void setIsAgencyTransfer(Boolean isAgencyTransfer) {
        this.isAgencyTransfer = isAgencyTransfer;
    }

    public ResultsTopnBody withColdStorage(Double coldStorage) {
        this.coldStorage = coldStorage;
        return this;
    }

    /**
     * 冷存储量
     * @return coldStorage
     */
    public Double getColdStorage() {
        return coldStorage;
    }

    public void setColdStorage(Double coldStorage) {
        this.coldStorage = coldStorage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResultsTopnBody that = (ResultsTopnBody) obj;
        return Objects.equals(this.indexTraffic, that.indexTraffic) && Objects.equals(this.storage, that.storage)
            && Objects.equals(this.writeTraffic, that.writeTraffic) && Objects.equals(this.logGroupId, that.logGroupId)
            && Objects.equals(this.logGroupName, that.logGroupName)
            && Objects.equals(this.logStreamId, that.logStreamId)
            && Objects.equals(this.logStreamName, that.logStreamName)
            && Objects.equals(this.basicTransfer, that.basicTransfer)
            && Objects.equals(this.seniorTransfer, that.seniorTransfer)
            && Objects.equals(this.isAgencyTransfer, that.isAgencyTransfer)
            && Objects.equals(this.coldStorage, that.coldStorage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexTraffic,
            storage,
            writeTraffic,
            logGroupId,
            logGroupName,
            logStreamId,
            logStreamName,
            basicTransfer,
            seniorTransfer,
            isAgencyTransfer,
            coldStorage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResultsTopnBody {\n");
        sb.append("    indexTraffic: ").append(toIndentedString(indexTraffic)).append("\n");
        sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
        sb.append("    writeTraffic: ").append(toIndentedString(writeTraffic)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
        sb.append("    basicTransfer: ").append(toIndentedString(basicTransfer)).append("\n");
        sb.append("    seniorTransfer: ").append(toIndentedString(seniorTransfer)).append("\n");
        sb.append("    isAgencyTransfer: ").append(toIndentedString(isAgencyTransfer)).append("\n");
        sb.append("    coldStorage: ").append(toIndentedString(coldStorage)).append("\n");
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
