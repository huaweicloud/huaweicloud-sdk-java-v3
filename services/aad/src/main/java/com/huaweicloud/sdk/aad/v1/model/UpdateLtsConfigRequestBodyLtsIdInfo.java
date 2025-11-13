package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 日志配置信息
 */
public class UpdateLtsConfigRequestBodyLtsIdInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_id")

    private String epsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_group_id")

    private String ltsGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_attack_stream_id")

    private String ltsAttackStreamId;

    public UpdateLtsConfigRequestBodyLtsIdInfo withEpsId(String epsId) {
        this.epsId = epsId;
        return this;
    }

    /**
     * 企业项目id
     * @return epsId
     */
    public String getEpsId() {
        return epsId;
    }

    public void setEpsId(String epsId) {
        this.epsId = epsId;
    }

    public UpdateLtsConfigRequestBodyLtsIdInfo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public UpdateLtsConfigRequestBodyLtsIdInfo withLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
        return this;
    }

    /**
     * 日志组id
     * @return ltsGroupId
     */
    public String getLtsGroupId() {
        return ltsGroupId;
    }

    public void setLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
    }

    public UpdateLtsConfigRequestBodyLtsIdInfo withLtsAttackStreamId(String ltsAttackStreamId) {
        this.ltsAttackStreamId = ltsAttackStreamId;
        return this;
    }

    /**
     * 日志流id
     * @return ltsAttackStreamId
     */
    public String getLtsAttackStreamId() {
        return ltsAttackStreamId;
    }

    public void setLtsAttackStreamId(String ltsAttackStreamId) {
        this.ltsAttackStreamId = ltsAttackStreamId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateLtsConfigRequestBodyLtsIdInfo that = (UpdateLtsConfigRequestBodyLtsIdInfo) obj;
        return Objects.equals(this.epsId, that.epsId) && Objects.equals(this.region, that.region)
            && Objects.equals(this.ltsGroupId, that.ltsGroupId)
            && Objects.equals(this.ltsAttackStreamId, that.ltsAttackStreamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(epsId, region, ltsGroupId, ltsAttackStreamId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLtsConfigRequestBodyLtsIdInfo {\n");
        sb.append("    epsId: ").append(toIndentedString(epsId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    ltsGroupId: ").append(toIndentedString(ltsGroupId)).append("\n");
        sb.append("    ltsAttackStreamId: ").append(toIndentedString(ltsAttackStreamId)).append("\n");
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
