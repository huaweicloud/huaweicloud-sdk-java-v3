package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SMN通道设置对象。跨帐号授予SMN主题发送通知的权限请参考《用户指南- 资源记录器- 开启/配置/修改资源记录器》中的“跨帐号授权”内容。
 */
public class TrackerSMNChannelConfigBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    public TrackerSMNChannelConfigBody withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * SMN主题的区域id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public TrackerSMNChannelConfigBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 创建或更新资源记录器用户的项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TrackerSMNChannelConfigBody withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * SMN主题urn
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackerSMNChannelConfigBody that = (TrackerSMNChannelConfigBody) obj;
        return Objects.equals(this.regionId, that.regionId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.topicUrn, that.topicUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, projectId, topicUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrackerSMNChannelConfigBody {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
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
