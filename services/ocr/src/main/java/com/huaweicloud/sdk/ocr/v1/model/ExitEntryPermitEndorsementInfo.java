package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ExitEntryPermitEndorsementInfo
 */
public class ExitEntryPermitEndorsementInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endorsement_type")

    @JacksonXmlProperty(localName = "endorsement_type")

    private String endorsementType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_round_trips")

    @JacksonXmlProperty(localName = "valid_round_trips")

    private String validRoundTrips;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endorsement_valid_period")

    @JacksonXmlProperty(localName = "endorsement_valid_period")

    private String endorsementValidPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    @JacksonXmlProperty(localName = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_info")

    @JacksonXmlProperty(localName = "issue_info")

    private String issueInfo;

    public ExitEntryPermitEndorsementInfo withEndorsementType(String endorsementType) {
        this.endorsementType = endorsementType;
        return this;
    }

    /**
     * 签注种类。 
     * @return endorsementType
     */
    public String getEndorsementType() {
        return endorsementType;
    }

    public void setEndorsementType(String endorsementType) {
        this.endorsementType = endorsementType;
    }

    public ExitEntryPermitEndorsementInfo withValidRoundTrips(String validRoundTrips) {
        this.validRoundTrips = validRoundTrips;
        return this;
    }

    /**
     * 签注往返有效次数。 
     * @return validRoundTrips
     */
    public String getValidRoundTrips() {
        return validRoundTrips;
    }

    public void setValidRoundTrips(String validRoundTrips) {
        this.validRoundTrips = validRoundTrips;
    }

    public ExitEntryPermitEndorsementInfo withEndorsementValidPeriod(String endorsementValidPeriod) {
        this.endorsementValidPeriod = endorsementValidPeriod;
        return this;
    }

    /**
     * 签注有效期。 
     * @return endorsementValidPeriod
     */
    public String getEndorsementValidPeriod() {
        return endorsementValidPeriod;
    }

    public void setEndorsementValidPeriod(String endorsementValidPeriod) {
        this.endorsementValidPeriod = endorsementValidPeriod;
    }

    public ExitEntryPermitEndorsementInfo withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 签注备注。 
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public ExitEntryPermitEndorsementInfo withIssueInfo(String issueInfo) {
        this.issueInfo = issueInfo;
        return this;
    }

    /**
     * 签注签发信息。 
     * @return issueInfo
     */
    public String getIssueInfo() {
        return issueInfo;
    }

    public void setIssueInfo(String issueInfo) {
        this.issueInfo = issueInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExitEntryPermitEndorsementInfo exitEntryPermitEndorsementInfo = (ExitEntryPermitEndorsementInfo) o;
        return Objects.equals(this.endorsementType, exitEntryPermitEndorsementInfo.endorsementType)
            && Objects.equals(this.validRoundTrips, exitEntryPermitEndorsementInfo.validRoundTrips)
            && Objects.equals(this.endorsementValidPeriod, exitEntryPermitEndorsementInfo.endorsementValidPeriod)
            && Objects.equals(this.remark, exitEntryPermitEndorsementInfo.remark)
            && Objects.equals(this.issueInfo, exitEntryPermitEndorsementInfo.issueInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endorsementType, validRoundTrips, endorsementValidPeriod, remark, issueInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExitEntryPermitEndorsementInfo {\n");
        sb.append("    endorsementType: ").append(toIndentedString(endorsementType)).append("\n");
        sb.append("    validRoundTrips: ").append(toIndentedString(validRoundTrips)).append("\n");
        sb.append("    endorsementValidPeriod: ").append(toIndentedString(endorsementValidPeriod)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    issueInfo: ").append(toIndentedString(issueInfo)).append("\n");
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
