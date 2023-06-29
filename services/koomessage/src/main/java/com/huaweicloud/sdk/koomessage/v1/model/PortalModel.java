package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 主页模型。
 */
public class PortalModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portal_id")

    private String portalId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company_id")

    private String companyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company_name")

    private String companyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_id")

    private String pubId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_name")

    private String pubName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_img")

    private String backgroundImg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_img_url")

    private String backgroundImgUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private String summary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tels")

    private String tels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fastapps")

    private String fastapps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private Integer state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approve_state")

    private Integer approveState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online_time")

    private OffsetDateTime onlineTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_reason")

    private String changeReason;

    public PortalModel withPortalId(String portalId) {
        this.portalId = portalId;
        return this;
    }

    /**
     * 主页ID。
     * @return portalId
     */
    public String getPortalId() {
        return portalId;
    }

    public void setPortalId(String portalId) {
        this.portalId = portalId;
    }

    public PortalModel withCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * 企业ID。
     * @return companyId
     */
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public PortalModel withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * 企业名称。
     * @return companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public PortalModel withPubId(String pubId) {
        this.pubId = pubId;
        return this;
    }

    /**
     * 服务号ID。
     * @return pubId
     */
    public String getPubId() {
        return pubId;
    }

    public void setPubId(String pubId) {
        this.pubId = pubId;
    }

    public PortalModel withPubName(String pubName) {
        this.pubName = pubName;
        return this;
    }

    /**
     * 服务号名称。
     * @return pubName
     */
    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public PortalModel withBackgroundImg(String backgroundImg) {
        this.backgroundImg = backgroundImg;
        return this;
    }

    /**
     * 主页背景图片资源ID。
     * @return backgroundImg
     */
    public String getBackgroundImg() {
        return backgroundImg;
    }

    public void setBackgroundImg(String backgroundImg) {
        this.backgroundImg = backgroundImg;
    }

    public PortalModel withBackgroundImgUrl(String backgroundImgUrl) {
        this.backgroundImgUrl = backgroundImgUrl;
        return this;
    }

    /**
     * 背景图片URL。
     * @return backgroundImgUrl
     */
    public String getBackgroundImgUrl() {
        return backgroundImgUrl;
    }

    public void setBackgroundImgUrl(String backgroundImgUrl) {
        this.backgroundImgUrl = backgroundImgUrl;
    }

    public PortalModel withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * 简介。
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public PortalModel withTels(String tels) {
        this.tels = tels;
        return this;
    }

    /**
     * 热线号列表。  > 以JSON列表返回，格式： > {\"tel\": \"400-800-8800\", \"usage\": \"官方服务电话\"}。 
     * @return tels
     */
    public String getTels() {
        return tels;
    }

    public void setTels(String tels) {
        this.tels = tels;
    }

    public PortalModel withFastapps(String fastapps) {
        this.fastapps = fastapps;
        return this;
    }

    /**
     * 快应用列表。  > 以JSON列表返回，格式： > {\"name\": \"快应用名称\",\"logo_img\": \"快应用LOGO图片资源ID\", \"logo_img_url\": \"快应用LOGO图片资源URL\", \"description\": \"快应用描述\",\"deeplink\": \"hap://app/fastapp\",\"depend_engine_version\": \"1040\"}。 
     * @return fastapps
     */
    public String getFastapps() {
        return fastapps;
    }

    public void setFastapps(String fastapps) {
        this.fastapps = fastapps;
    }

    public PortalModel withState(Integer state) {
        this.state = state;
        return this;
    }

    /**
     * 资源状态。  - 1：未生效  - 2：已生效  - 3：已失效  - 4：已冻结 
     * @return state
     */
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public PortalModel withApproveState(Integer approveState) {
        this.approveState = approveState;
        return this;
    }

    /**
     * 审核状态。  - 1：待审核  - 2：通过  - 3：驳回 
     * @return approveState
     */
    public Integer getApproveState() {
        return approveState;
    }

    public void setApproveState(Integer approveState) {
        this.approveState = approveState;
    }

    public PortalModel withOnlineTime(OffsetDateTime onlineTime) {
        this.onlineTime = onlineTime;
        return this;
    }

    /**
     * 上线时间。
     * @return onlineTime
     */
    public OffsetDateTime getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(OffsetDateTime onlineTime) {
        this.onlineTime = onlineTime;
    }

    public PortalModel withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建人。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public PortalModel withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public PortalModel withChangeReason(String changeReason) {
        this.changeReason = changeReason;
        return this;
    }

    /**
     * 修改原因。
     * @return changeReason
     */
    public String getChangeReason() {
        return changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PortalModel that = (PortalModel) obj;
        return Objects.equals(this.portalId, that.portalId) && Objects.equals(this.companyId, that.companyId)
            && Objects.equals(this.companyName, that.companyName) && Objects.equals(this.pubId, that.pubId)
            && Objects.equals(this.pubName, that.pubName) && Objects.equals(this.backgroundImg, that.backgroundImg)
            && Objects.equals(this.backgroundImgUrl, that.backgroundImgUrl)
            && Objects.equals(this.summary, that.summary) && Objects.equals(this.tels, that.tels)
            && Objects.equals(this.fastapps, that.fastapps) && Objects.equals(this.state, that.state)
            && Objects.equals(this.approveState, that.approveState) && Objects.equals(this.onlineTime, that.onlineTime)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.changeReason, that.changeReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portalId,
            companyId,
            companyName,
            pubId,
            pubName,
            backgroundImg,
            backgroundImgUrl,
            summary,
            tels,
            fastapps,
            state,
            approveState,
            onlineTime,
            creator,
            createTime,
            changeReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PortalModel {\n");
        sb.append("    portalId: ").append(toIndentedString(portalId)).append("\n");
        sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
        sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
        sb.append("    pubId: ").append(toIndentedString(pubId)).append("\n");
        sb.append("    pubName: ").append(toIndentedString(pubName)).append("\n");
        sb.append("    backgroundImg: ").append(toIndentedString(backgroundImg)).append("\n");
        sb.append("    backgroundImgUrl: ").append(toIndentedString(backgroundImgUrl)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    tels: ").append(toIndentedString(tels)).append("\n");
        sb.append("    fastapps: ").append(toIndentedString(fastapps)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    approveState: ").append(toIndentedString(approveState)).append("\n");
        sb.append("    onlineTime: ").append(toIndentedString(onlineTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    changeReason: ").append(toIndentedString(changeReason)).append("\n");
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
