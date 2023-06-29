package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 请求成功返回的数据。
 */
public class UpdatePubInfoResponseModelData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_update_log_id")

    private String pubUpdateLogId;

    public UpdatePubInfoResponseModelData withPubUpdateLogId(String pubUpdateLogId) {
        this.pubUpdateLogId = pubUpdateLogId;
        return this;
    }

    /**
     * 服务号更新记录ID。
     * @return pubUpdateLogId
     */
    public String getPubUpdateLogId() {
        return pubUpdateLogId;
    }

    public void setPubUpdateLogId(String pubUpdateLogId) {
        this.pubUpdateLogId = pubUpdateLogId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePubInfoResponseModelData that = (UpdatePubInfoResponseModelData) obj;
        return Objects.equals(this.pubUpdateLogId, that.pubUpdateLogId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pubUpdateLogId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePubInfoResponseModelData {\n");
        sb.append("    pubUpdateLogId: ").append(toIndentedString(pubUpdateLogId)).append("\n");
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
