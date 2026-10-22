package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LTS 日志组和流 ID 信息
 */
public class AiGuardLtsIdInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_access_stream_id")

    private String ltsAccessStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_group_id")

    private String ltsGroupId;

    public AiGuardLtsIdInfo withLtsAccessStreamId(String ltsAccessStreamId) {
        this.ltsAccessStreamId = ltsAccessStreamId;
        return this;
    }

    /**
     * LTS 日志流 ID
     * @return ltsAccessStreamId
     */
    public String getLtsAccessStreamId() {
        return ltsAccessStreamId;
    }

    public void setLtsAccessStreamId(String ltsAccessStreamId) {
        this.ltsAccessStreamId = ltsAccessStreamId;
    }

    public AiGuardLtsIdInfo withLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
        return this;
    }

    /**
     * LTS 日志组 ID
     * @return ltsGroupId
     */
    public String getLtsGroupId() {
        return ltsGroupId;
    }

    public void setLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AiGuardLtsIdInfo that = (AiGuardLtsIdInfo) obj;
        return Objects.equals(this.ltsAccessStreamId, that.ltsAccessStreamId)
            && Objects.equals(this.ltsGroupId, that.ltsGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ltsAccessStreamId, ltsGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AiGuardLtsIdInfo {\n");
        sb.append("    ltsAccessStreamId: ").append(toIndentedString(ltsAccessStreamId)).append("\n");
        sb.append("    ltsGroupId: ").append(toIndentedString(ltsGroupId)).append("\n");
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
