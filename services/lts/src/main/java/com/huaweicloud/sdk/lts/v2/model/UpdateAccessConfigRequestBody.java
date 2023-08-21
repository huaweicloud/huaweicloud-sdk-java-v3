package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改日志接入请求体
 */
public class UpdateAccessConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_id")

    private String accessConfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_detail")

    private AccessConfigDeatilCreate accessConfigDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_group_info")

    private AccessConfigHostGroupIdList hostGroupInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_tag")

    private List<AccessConfigTag> accessConfigTag = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_split")

    private Boolean logSplit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binary_collect")

    private Boolean binaryCollect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    public UpdateAccessConfigRequestBody withAccessConfigId(String accessConfigId) {
        this.accessConfigId = accessConfigId;
        return this;
    }

    /**
     * 日志接入ID
     * @return accessConfigId
     */
    public String getAccessConfigId() {
        return accessConfigId;
    }

    public void setAccessConfigId(String accessConfigId) {
        this.accessConfigId = accessConfigId;
    }

    public UpdateAccessConfigRequestBody withAccessConfigDetail(AccessConfigDeatilCreate accessConfigDetail) {
        this.accessConfigDetail = accessConfigDetail;
        return this;
    }

    public UpdateAccessConfigRequestBody withAccessConfigDetail(
        Consumer<AccessConfigDeatilCreate> accessConfigDetailSetter) {
        if (this.accessConfigDetail == null) {
            this.accessConfigDetail = new AccessConfigDeatilCreate();
            accessConfigDetailSetter.accept(this.accessConfigDetail);
        }

        return this;
    }

    /**
     * Get accessConfigDetail
     * @return accessConfigDetail
     */
    public AccessConfigDeatilCreate getAccessConfigDetail() {
        return accessConfigDetail;
    }

    public void setAccessConfigDetail(AccessConfigDeatilCreate accessConfigDetail) {
        this.accessConfigDetail = accessConfigDetail;
    }

    public UpdateAccessConfigRequestBody withHostGroupInfo(AccessConfigHostGroupIdList hostGroupInfo) {
        this.hostGroupInfo = hostGroupInfo;
        return this;
    }

    public UpdateAccessConfigRequestBody withHostGroupInfo(Consumer<AccessConfigHostGroupIdList> hostGroupInfoSetter) {
        if (this.hostGroupInfo == null) {
            this.hostGroupInfo = new AccessConfigHostGroupIdList();
            hostGroupInfoSetter.accept(this.hostGroupInfo);
        }

        return this;
    }

    /**
     * Get hostGroupInfo
     * @return hostGroupInfo
     */
    public AccessConfigHostGroupIdList getHostGroupInfo() {
        return hostGroupInfo;
    }

    public void setHostGroupInfo(AccessConfigHostGroupIdList hostGroupInfo) {
        this.hostGroupInfo = hostGroupInfo;
    }

    public UpdateAccessConfigRequestBody withAccessConfigTag(List<AccessConfigTag> accessConfigTag) {
        this.accessConfigTag = accessConfigTag;
        return this;
    }

    public UpdateAccessConfigRequestBody addAccessConfigTagItem(AccessConfigTag accessConfigTagItem) {
        if (this.accessConfigTag == null) {
            this.accessConfigTag = new ArrayList<>();
        }
        this.accessConfigTag.add(accessConfigTagItem);
        return this;
    }

    public UpdateAccessConfigRequestBody withAccessConfigTag(Consumer<List<AccessConfigTag>> accessConfigTagSetter) {
        if (this.accessConfigTag == null) {
            this.accessConfigTag = new ArrayList<>();
        }
        accessConfigTagSetter.accept(this.accessConfigTag);
        return this;
    }

    /**
     * 标签信息。KEY不能重复,最多20个标签
     * @return accessConfigTag
     */
    public List<AccessConfigTag> getAccessConfigTag() {
        return accessConfigTag;
    }

    public void setAccessConfigTag(List<AccessConfigTag> accessConfigTag) {
        this.accessConfigTag = accessConfigTag;
    }

    public UpdateAccessConfigRequestBody withLogSplit(Boolean logSplit) {
        this.logSplit = logSplit;
        return this;
    }

    /**
     * 日志拆分
     * @return logSplit
     */
    public Boolean getLogSplit() {
        return logSplit;
    }

    public void setLogSplit(Boolean logSplit) {
        this.logSplit = logSplit;
    }

    public UpdateAccessConfigRequestBody withBinaryCollect(Boolean binaryCollect) {
        this.binaryCollect = binaryCollect;
        return this;
    }

    /**
     * 二进制采集
     * @return binaryCollect
     */
    public Boolean getBinaryCollect() {
        return binaryCollect;
    }

    public void setBinaryCollect(Boolean binaryCollect) {
        this.binaryCollect = binaryCollect;
    }

    public UpdateAccessConfigRequestBody withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * CCE集群ID，CCE类型时，为必填
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAccessConfigRequestBody that = (UpdateAccessConfigRequestBody) obj;
        return Objects.equals(this.accessConfigId, that.accessConfigId)
            && Objects.equals(this.accessConfigDetail, that.accessConfigDetail)
            && Objects.equals(this.hostGroupInfo, that.hostGroupInfo)
            && Objects.equals(this.accessConfigTag, that.accessConfigTag)
            && Objects.equals(this.logSplit, that.logSplit) && Objects.equals(this.binaryCollect, that.binaryCollect)
            && Objects.equals(this.clusterId, that.clusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessConfigId,
            accessConfigDetail,
            hostGroupInfo,
            accessConfigTag,
            logSplit,
            binaryCollect,
            clusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAccessConfigRequestBody {\n");
        sb.append("    accessConfigId: ").append(toIndentedString(accessConfigId)).append("\n");
        sb.append("    accessConfigDetail: ").append(toIndentedString(accessConfigDetail)).append("\n");
        sb.append("    hostGroupInfo: ").append(toIndentedString(hostGroupInfo)).append("\n");
        sb.append("    accessConfigTag: ").append(toIndentedString(accessConfigTag)).append("\n");
        sb.append("    logSplit: ").append(toIndentedString(logSplit)).append("\n");
        sb.append("    binaryCollect: ").append(toIndentedString(binaryCollect)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
