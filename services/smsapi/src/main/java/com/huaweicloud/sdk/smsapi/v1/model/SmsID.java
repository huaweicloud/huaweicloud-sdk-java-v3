package com.huaweicloud.sdk.smsapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SmsID
 */
public class SmsID {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private String from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "originTo")

    private String originTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smsMsgId")

    private String smsMsgId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "countryId")

    private String countryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public SmsID withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public SmsID withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * 发送短信号码
     * @return from
     */
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public SmsID withOriginTo(String originTo) {
        this.originTo = originTo;
        return this;
    }

    /**
     * 接收短信号码
     * @return originTo
     */
    public String getOriginTo() {
        return originTo;
    }

    public void setOriginTo(String originTo) {
        this.originTo = originTo;
    }

    public SmsID withSmsMsgId(String smsMsgId) {
        this.smsMsgId = smsMsgId;
        return this;
    }

    /**
     * 短信id
     * @return smsMsgId
     */
    public String getSmsMsgId() {
        return smsMsgId;
    }

    public void setSmsMsgId(String smsMsgId) {
        this.smsMsgId = smsMsgId;
    }

    public SmsID withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 短信当前状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SmsID withCountryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    /**
     * 国家码
     * @return countryId
     */
    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public SmsID withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 短信拆分条数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmsID that = (SmsID) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.from, that.from)
            && Objects.equals(this.originTo, that.originTo) && Objects.equals(this.smsMsgId, that.smsMsgId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.countryId, that.countryId)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime, from, originTo, smsMsgId, status, countryId, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmsID {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    originTo: ").append(toIndentedString(originTo)).append("\n");
        sb.append("    smsMsgId: ").append(toIndentedString(smsMsgId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
