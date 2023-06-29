package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 日志组与日志流id信息，对应云日志服务（lts）创建的日志组和日志流id。
 */
public class LtsIdInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ltsGroupId")

    private String ltsGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ltsAccessStreamID")

    private String ltsAccessStreamID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ltsAttackStreamID")

    private String ltsAttackStreamID;

    public LtsIdInfo withLtsGroupId(String ltsGroupId) {
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

    public LtsIdInfo withLtsAccessStreamID(String ltsAccessStreamID) {
        this.ltsAccessStreamID = ltsAccessStreamID;
        return this;
    }

    /**
     * 访问日志流id
     * @return ltsAccessStreamID
     */
    public String getLtsAccessStreamID() {
        return ltsAccessStreamID;
    }

    public void setLtsAccessStreamID(String ltsAccessStreamID) {
        this.ltsAccessStreamID = ltsAccessStreamID;
    }

    public LtsIdInfo withLtsAttackStreamID(String ltsAttackStreamID) {
        this.ltsAttackStreamID = ltsAttackStreamID;
        return this;
    }

    /**
     * 攻击日志流id
     * @return ltsAttackStreamID
     */
    public String getLtsAttackStreamID() {
        return ltsAttackStreamID;
    }

    public void setLtsAttackStreamID(String ltsAttackStreamID) {
        this.ltsAttackStreamID = ltsAttackStreamID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LtsIdInfo that = (LtsIdInfo) obj;
        return Objects.equals(this.ltsGroupId, that.ltsGroupId)
            && Objects.equals(this.ltsAccessStreamID, that.ltsAccessStreamID)
            && Objects.equals(this.ltsAttackStreamID, that.ltsAttackStreamID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ltsGroupId, ltsAccessStreamID, ltsAttackStreamID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LtsIdInfo {\n");
        sb.append("    ltsGroupId: ").append(toIndentedString(ltsGroupId)).append("\n");
        sb.append("    ltsAccessStreamID: ").append(toIndentedString(ltsAccessStreamID)).append("\n");
        sb.append("    ltsAttackStreamID: ").append(toIndentedString(ltsAttackStreamID)).append("\n");
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
