package com.huaweicloud.sdk.eds.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OfferListResponseBodyEntities
 */
public class OfferListResponseBodyEntities {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offer_id")

    private String offerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offer_code")

    private String offerCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offer_name")

    private String offerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offer_description")

    private String offerDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offer_status")

    private String offerStatus;

    public OfferListResponseBodyEntities withOfferId(String offerId) {
        this.offerId = offerId;
        return this;
    }

    /**
     * 合约ID
     * @return offerId
     */
    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public OfferListResponseBodyEntities withOfferCode(String offerCode) {
        this.offerCode = offerCode;
        return this;
    }

    /**
     * 合约编码
     * @return offerCode
     */
    public String getOfferCode() {
        return offerCode;
    }

    public void setOfferCode(String offerCode) {
        this.offerCode = offerCode;
    }

    public OfferListResponseBodyEntities withOfferName(String offerName) {
        this.offerName = offerName;
        return this;
    }

    /**
     * 合约名称
     * @return offerName
     */
    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public OfferListResponseBodyEntities withOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
        return this;
    }

    /**
     * 合约描述
     * @return offerDescription
     */
    public String getOfferDescription() {
        return offerDescription;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    public OfferListResponseBodyEntities withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 合约创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public OfferListResponseBodyEntities withOfferStatus(String offerStatus) {
        this.offerStatus = offerStatus;
        return this;
    }

    /**
     * 合约状态
     * @return offerStatus
     */
    public String getOfferStatus() {
        return offerStatus;
    }

    public void setOfferStatus(String offerStatus) {
        this.offerStatus = offerStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OfferListResponseBodyEntities that = (OfferListResponseBodyEntities) obj;
        return Objects.equals(this.offerId, that.offerId) && Objects.equals(this.offerCode, that.offerCode)
            && Objects.equals(this.offerName, that.offerName)
            && Objects.equals(this.offerDescription, that.offerDescription)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.offerStatus, that.offerStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offerId, offerCode, offerName, offerDescription, createTime, offerStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferListResponseBodyEntities {\n");
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    offerCode: ").append(toIndentedString(offerCode)).append("\n");
        sb.append("    offerName: ").append(toIndentedString(offerName)).append("\n");
        sb.append("    offerDescription: ").append(toIndentedString(offerDescription)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    offerStatus: ").append(toIndentedString(offerStatus)).append("\n");
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
