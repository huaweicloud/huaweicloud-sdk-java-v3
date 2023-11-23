package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 单个实例需要设置的LTS策略。
 */
public class UpdateLtsConfigRequestBodyLtsConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_type")

    private LtsLogType logType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_group_id")

    private String ltsGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_stream_id")

    private String ltsStreamId;

    public UpdateLtsConfigRequestBodyLtsConfigs withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，可以调用“[查询实例列表和详情](x-wc://file=zh-cn_topic_0000001369935045.xml)”接口获取。如果未申请实例，可以调用“[创建实例](x-wc://file=zh-cn_topic_0000001369734929.xml)”接口创建。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateLtsConfigRequestBodyLtsConfigs withLogType(LtsLogType logType) {
        this.logType = logType;
        return this;
    }

    /**
     * Get logType
     * @return logType
     */
    public LtsLogType getLogType() {
        return logType;
    }

    public void setLogType(LtsLogType logType) {
        this.logType = logType;
    }

    public UpdateLtsConfigRequestBodyLtsConfigs withLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
        return this;
    }

    /**
     * LTS日志组ID。可通过云日志服务-“查询账号下所有日志组”API接口获取。
     * @return ltsGroupId
     */
    public String getLtsGroupId() {
        return ltsGroupId;
    }

    public void setLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
    }

    public UpdateLtsConfigRequestBodyLtsConfigs withLtsStreamId(String ltsStreamId) {
        this.ltsStreamId = ltsStreamId;
        return this;
    }

    /**
     * LTS日志流ID。可通过云日志服务-“查询指定日志组下的所有日志流”API接口获取。
     * @return ltsStreamId
     */
    public String getLtsStreamId() {
        return ltsStreamId;
    }

    public void setLtsStreamId(String ltsStreamId) {
        this.ltsStreamId = ltsStreamId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateLtsConfigRequestBodyLtsConfigs that = (UpdateLtsConfigRequestBodyLtsConfigs) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.logType, that.logType)
            && Objects.equals(this.ltsGroupId, that.ltsGroupId) && Objects.equals(this.ltsStreamId, that.ltsStreamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, logType, ltsGroupId, ltsStreamId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLtsConfigRequestBodyLtsConfigs {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
        sb.append("    ltsGroupId: ").append(toIndentedString(ltsGroupId)).append("\n");
        sb.append("    ltsStreamId: ").append(toIndentedString(ltsStreamId)).append("\n");
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
