package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowWebHookConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "corpId")

    private String corpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spId")

    private String spId;

    public ShowWebHookConfigRequest withCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }

    /**
     * 企业ID。按企业注册回调时需要填写。
     * @return corpId
     */
    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public ShowWebHookConfigRequest withSpId(String spId) {
        this.spId = spId;
        return this;
    }

    /**
     * SP ID。多租户场景下，按SP注册回调时需要填写。
     * @return spId
     */
    public String getSpId() {
        return spId;
    }

    public void setSpId(String spId) {
        this.spId = spId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowWebHookConfigRequest showWebHookConfigRequest = (ShowWebHookConfigRequest) o;
        return Objects.equals(this.corpId, showWebHookConfigRequest.corpId)
            && Objects.equals(this.spId, showWebHookConfigRequest.spId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(corpId, spId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWebHookConfigRequest {\n");
        sb.append("    corpId: ").append(toIndentedString(corpId)).append("\n");
        sb.append("    spId: ").append(toIndentedString(spId)).append("\n");
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
