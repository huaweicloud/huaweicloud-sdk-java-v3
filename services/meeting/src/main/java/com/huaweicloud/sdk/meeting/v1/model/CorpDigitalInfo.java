package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数字资产信息
 */
public class CorpDigitalInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "corpId")

    private String corpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public CorpDigitalInfo withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * 音色资产标识ID。
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public CorpDigitalInfo withCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }

    /**
     * 当前会议企业ID。
     * @return corpId
     */
    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public CorpDigitalInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型，PUBLIC：公共、LOCAL：本地会议、PRIVATE：克隆专用。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CorpDigitalInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 音色名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CorpDigitalInfo that = (CorpDigitalInfo) obj;
        return Objects.equals(this.account, that.account) && Objects.equals(this.corpId, that.corpId)
            && Objects.equals(this.type, that.type) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account, corpId, type, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorpDigitalInfo {\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    corpId: ").append(toIndentedString(corpId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
