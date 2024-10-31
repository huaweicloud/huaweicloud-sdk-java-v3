package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LogConfigDto
 */
public class LogConfigDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_enable")

    private Integer ltsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_log_group_id")

    private String ltsLogGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_attack_log_stream_id")

    private String ltsAttackLogStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_attack_log_stream_enable")

    private Integer ltsAttackLogStreamEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_access_log_stream_id")

    private String ltsAccessLogStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_access_log_stream_enable")

    private Integer ltsAccessLogStreamEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_flow_log_stream_id")

    private String ltsFlowLogStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_flow_log_stream_enable")

    private Integer ltsFlowLogStreamEnable;

    public LogConfigDto withFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
        return this;
    }

    /**
     * 防火墙id，可通过[防火墙ID获取方式](cfw_02_0028.xml)获取
     * @return fwInstanceId
     */
    public String getFwInstanceId() {
        return fwInstanceId;
    }

    public void setFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
    }

    public LogConfigDto withLtsEnable(Integer ltsEnable) {
        this.ltsEnable = ltsEnable;
        return this;
    }

    /**
     * 是否开启LTS，1表示是，0表示不是
     * @return ltsEnable
     */
    public Integer getLtsEnable() {
        return ltsEnable;
    }

    public void setLtsEnable(Integer ltsEnable) {
        this.ltsEnable = ltsEnable;
    }

    public LogConfigDto withLtsLogGroupId(String ltsLogGroupId) {
        this.ltsLogGroupId = ltsLogGroupId;
        return this;
    }

    /**
     * LTS日志分组id,可通过查询LTS（云日志服务）下查询账号下所有日志组接口获得，通过返回值中的log_groups.log_group_id（.表示各对象之间层级的区分）获得
     * @return ltsLogGroupId
     */
    public String getLtsLogGroupId() {
        return ltsLogGroupId;
    }

    public void setLtsLogGroupId(String ltsLogGroupId) {
        this.ltsLogGroupId = ltsLogGroupId;
    }

    public LogConfigDto withLtsAttackLogStreamId(String ltsAttackLogStreamId) {
        this.ltsAttackLogStreamId = ltsAttackLogStreamId;
        return this;
    }

    /**
     * 攻击日志流id,可通过查询LTS（云日志服务）下查询指定日志组下的所有日志流接口获得，通过返回值中的log_streams.log_stream_id（.表示各对象之间层级的区分）获得
     * @return ltsAttackLogStreamId
     */
    public String getLtsAttackLogStreamId() {
        return ltsAttackLogStreamId;
    }

    public void setLtsAttackLogStreamId(String ltsAttackLogStreamId) {
        this.ltsAttackLogStreamId = ltsAttackLogStreamId;
    }

    public LogConfigDto withLtsAttackLogStreamEnable(Integer ltsAttackLogStreamEnable) {
        this.ltsAttackLogStreamEnable = ltsAttackLogStreamEnable;
        return this;
    }

    /**
     * 是否开启攻击日志流，1表示是，0表示不是
     * @return ltsAttackLogStreamEnable
     */
    public Integer getLtsAttackLogStreamEnable() {
        return ltsAttackLogStreamEnable;
    }

    public void setLtsAttackLogStreamEnable(Integer ltsAttackLogStreamEnable) {
        this.ltsAttackLogStreamEnable = ltsAttackLogStreamEnable;
    }

    public LogConfigDto withLtsAccessLogStreamId(String ltsAccessLogStreamId) {
        this.ltsAccessLogStreamId = ltsAccessLogStreamId;
        return this;
    }

    /**
     * 访问控制日志流id,可通过查询LTS（云日志服务）下查询指定日志组下的所有日志流接口获得，通过返回值中的log_streams.log_stream_id（.表示各对象之间层级的区分）获得
     * @return ltsAccessLogStreamId
     */
    public String getLtsAccessLogStreamId() {
        return ltsAccessLogStreamId;
    }

    public void setLtsAccessLogStreamId(String ltsAccessLogStreamId) {
        this.ltsAccessLogStreamId = ltsAccessLogStreamId;
    }

    public LogConfigDto withLtsAccessLogStreamEnable(Integer ltsAccessLogStreamEnable) {
        this.ltsAccessLogStreamEnable = ltsAccessLogStreamEnable;
        return this;
    }

    /**
     * 是否开启访问控制流，1表示是，0表示不是
     * @return ltsAccessLogStreamEnable
     */
    public Integer getLtsAccessLogStreamEnable() {
        return ltsAccessLogStreamEnable;
    }

    public void setLtsAccessLogStreamEnable(Integer ltsAccessLogStreamEnable) {
        this.ltsAccessLogStreamEnable = ltsAccessLogStreamEnable;
    }

    public LogConfigDto withLtsFlowLogStreamId(String ltsFlowLogStreamId) {
        this.ltsFlowLogStreamId = ltsFlowLogStreamId;
        return this;
    }

    /**
     * 流量日志id,可通过查询LTS（云日志服务）下查询指定日志组下的所有日志流接口获得，通过返回值中的log_streams.log_stream_id（.表示各对象之间层级的区分）获得
     * @return ltsFlowLogStreamId
     */
    public String getLtsFlowLogStreamId() {
        return ltsFlowLogStreamId;
    }

    public void setLtsFlowLogStreamId(String ltsFlowLogStreamId) {
        this.ltsFlowLogStreamId = ltsFlowLogStreamId;
    }

    public LogConfigDto withLtsFlowLogStreamEnable(Integer ltsFlowLogStreamEnable) {
        this.ltsFlowLogStreamEnable = ltsFlowLogStreamEnable;
        return this;
    }

    /**
     * 是否开启流量日志，1表示是，0表示不是
     * @return ltsFlowLogStreamEnable
     */
    public Integer getLtsFlowLogStreamEnable() {
        return ltsFlowLogStreamEnable;
    }

    public void setLtsFlowLogStreamEnable(Integer ltsFlowLogStreamEnable) {
        this.ltsFlowLogStreamEnable = ltsFlowLogStreamEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogConfigDto that = (LogConfigDto) obj;
        return Objects.equals(this.fwInstanceId, that.fwInstanceId) && Objects.equals(this.ltsEnable, that.ltsEnable)
            && Objects.equals(this.ltsLogGroupId, that.ltsLogGroupId)
            && Objects.equals(this.ltsAttackLogStreamId, that.ltsAttackLogStreamId)
            && Objects.equals(this.ltsAttackLogStreamEnable, that.ltsAttackLogStreamEnable)
            && Objects.equals(this.ltsAccessLogStreamId, that.ltsAccessLogStreamId)
            && Objects.equals(this.ltsAccessLogStreamEnable, that.ltsAccessLogStreamEnable)
            && Objects.equals(this.ltsFlowLogStreamId, that.ltsFlowLogStreamId)
            && Objects.equals(this.ltsFlowLogStreamEnable, that.ltsFlowLogStreamEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fwInstanceId,
            ltsEnable,
            ltsLogGroupId,
            ltsAttackLogStreamId,
            ltsAttackLogStreamEnable,
            ltsAccessLogStreamId,
            ltsAccessLogStreamEnable,
            ltsFlowLogStreamId,
            ltsFlowLogStreamEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogConfigDto {\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
        sb.append("    ltsEnable: ").append(toIndentedString(ltsEnable)).append("\n");
        sb.append("    ltsLogGroupId: ").append(toIndentedString(ltsLogGroupId)).append("\n");
        sb.append("    ltsAttackLogStreamId: ").append(toIndentedString(ltsAttackLogStreamId)).append("\n");
        sb.append("    ltsAttackLogStreamEnable: ").append(toIndentedString(ltsAttackLogStreamEnable)).append("\n");
        sb.append("    ltsAccessLogStreamId: ").append(toIndentedString(ltsAccessLogStreamId)).append("\n");
        sb.append("    ltsAccessLogStreamEnable: ").append(toIndentedString(ltsAccessLogStreamEnable)).append("\n");
        sb.append("    ltsFlowLogStreamId: ").append(toIndentedString(ltsFlowLogStreamId)).append("\n");
        sb.append("    ltsFlowLogStreamEnable: ").append(toIndentedString(ltsFlowLogStreamEnable)).append("\n");
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
