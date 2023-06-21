package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询智能信息基础版模板返回体。
 */
public class VmsTemplateStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_id")

    private String tplId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_state")

    private Integer auditState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_desc")

    private String auditDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_size")

    private Integer tplSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_time")

    private String validTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_detail")

    private List<StatusDetail> statusDetail = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preview_url")

    private String previewUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_name")

    private String tplName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_sign")

    private String tplSign;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "var_info")

    private List<VarInfo> varInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restags")

    private String restags;

    public VmsTemplateStatus withTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }

    /**
     * 智能信息基础版模板ID。
     * @return tplId
     */
    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
    }

    public VmsTemplateStatus withAuditState(Integer auditState) {
        this.auditState = auditState;
        return this;
    }

    /**
     * 智能信息基础版审核状态。 - 0：正常可用 - 1：审核中 - 2：审核不通过 - 3：模板已禁用 - 4：模板不存在 - 5：模板已过期 
     * @return auditState
     */
    public Integer getAuditState() {
        return auditState;
    }

    public void setAuditState(Integer auditState) {
        this.auditState = auditState;
    }

    public VmsTemplateStatus withAuditDesc(String auditDesc) {
        this.auditDesc = auditDesc;
        return this;
    }

    /**
     * 智能信息基础版模板状态的描述，若状态是审核不通过或被禁用，描述表示的是不通过或禁用的原因。 > 长度不超过 1024 字。 
     * @return auditDesc
     */
    public String getAuditDesc() {
        return auditDesc;
    }

    public void setAuditDesc(String auditDesc) {
        this.auditDesc = auditDesc;
    }

    public VmsTemplateStatus withTplSize(Integer tplSize) {
        this.tplSize = tplSize;
        return this;
    }

    /**
     * 智能信息基础版模板的大小。  >  单位：字节。 
     * @return tplSize
     */
    public Integer getTplSize() {
        return tplSize;
    }

    public void setTplSize(Integer tplSize) {
        this.tplSize = tplSize;
    }

    public VmsTemplateStatus withValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }

    /**
     * 模板截止有效日期，格式：yyyy-MM-ddTHH:mm:ssZ，0：表示永久有效。样例：2020-01-31T23:59:59Z。
     * @return validTime
     */
    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    public VmsTemplateStatus withStatusDetail(List<StatusDetail> statusDetail) {
        this.statusDetail = statusDetail;
        return this;
    }

    public VmsTemplateStatus addStatusDetailItem(StatusDetail statusDetailItem) {
        if (this.statusDetail == null) {
            this.statusDetail = new ArrayList<>();
        }
        this.statusDetail.add(statusDetailItem);
        return this;
    }

    public VmsTemplateStatus withStatusDetail(Consumer<List<StatusDetail>> statusDetailSetter) {
        if (this.statusDetail == null) {
            this.statusDetail = new ArrayList<>();
        }
        statusDetailSetter.accept(this.statusDetail);
        return this;
    }

    /**
     * 运营商的模板状态详情。
     * @return statusDetail
     */
    public List<StatusDetail> getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(List<StatusDetail> statusDetail) {
        this.statusDetail = statusDetail;
    }

    public VmsTemplateStatus withPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }

    /**
     * 智能信息基础版模板预览地址。
     * @return previewUrl
     */
    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public VmsTemplateStatus withTplName(String tplName) {
        this.tplName = tplName;
        return this;
    }

    /**
     * 智能信息基础版模板名称。
     * @return tplName
     */
    public String getTplName() {
        return tplName;
    }

    public void setTplName(String tplName) {
        this.tplName = tplName;
    }

    public VmsTemplateStatus withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 智能信息基础版模板主题。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public VmsTemplateStatus withTplSign(String tplSign) {
        this.tplSign = tplSign;
        return this;
    }

    /**
     * 智能信息基础版模板签名。
     * @return tplSign
     */
    public String getTplSign() {
        return tplSign;
    }

    public void setTplSign(String tplSign) {
        this.tplSign = tplSign;
    }

    public VmsTemplateStatus withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 智能信息基础版模板创建时间，格式：yyyy-MM-ddTHH:mm:ssZ。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public VmsTemplateStatus withVarInfo(List<VarInfo> varInfo) {
        this.varInfo = varInfo;
        return this;
    }

    public VmsTemplateStatus addVarInfoItem(VarInfo varInfoItem) {
        if (this.varInfo == null) {
            this.varInfo = new ArrayList<>();
        }
        this.varInfo.add(varInfoItem);
        return this;
    }

    public VmsTemplateStatus withVarInfo(Consumer<List<VarInfo>> varInfoSetter) {
        if (this.varInfo == null) {
            this.varInfo = new ArrayList<>();
        }
        varInfoSetter.accept(this.varInfo);
        return this;
    }

    /**
     * 智能信息基础版模板动参信息，静态模板没有动参，该字段填空。
     * @return varInfo
     */
    public List<VarInfo> getVarInfo() {
        return varInfo;
    }

    public void setVarInfo(List<VarInfo> varInfo) {
        this.varInfo = varInfo;
    }

    public VmsTemplateStatus withRestags(String restags) {
        this.restags = restags;
        return this;
    }

    /**
     * 资源分配标签，取值如下： - 三网一般 - 三网抗诉 - 单网一般 - 单网抗诉 
     * @return restags
     */
    public String getRestags() {
        return restags;
    }

    public void setRestags(String restags) {
        this.restags = restags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmsTemplateStatus vmsTemplateStatus = (VmsTemplateStatus) o;
        return Objects.equals(this.tplId, vmsTemplateStatus.tplId)
            && Objects.equals(this.auditState, vmsTemplateStatus.auditState)
            && Objects.equals(this.auditDesc, vmsTemplateStatus.auditDesc)
            && Objects.equals(this.tplSize, vmsTemplateStatus.tplSize)
            && Objects.equals(this.validTime, vmsTemplateStatus.validTime)
            && Objects.equals(this.statusDetail, vmsTemplateStatus.statusDetail)
            && Objects.equals(this.previewUrl, vmsTemplateStatus.previewUrl)
            && Objects.equals(this.tplName, vmsTemplateStatus.tplName)
            && Objects.equals(this.title, vmsTemplateStatus.title)
            && Objects.equals(this.tplSign, vmsTemplateStatus.tplSign)
            && Objects.equals(this.createTime, vmsTemplateStatus.createTime)
            && Objects.equals(this.varInfo, vmsTemplateStatus.varInfo)
            && Objects.equals(this.restags, vmsTemplateStatus.restags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tplId,
            auditState,
            auditDesc,
            tplSize,
            validTime,
            statusDetail,
            previewUrl,
            tplName,
            title,
            tplSign,
            createTime,
            varInfo,
            restags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmsTemplateStatus {\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    auditState: ").append(toIndentedString(auditState)).append("\n");
        sb.append("    auditDesc: ").append(toIndentedString(auditDesc)).append("\n");
        sb.append("    tplSize: ").append(toIndentedString(tplSize)).append("\n");
        sb.append("    validTime: ").append(toIndentedString(validTime)).append("\n");
        sb.append("    statusDetail: ").append(toIndentedString(statusDetail)).append("\n");
        sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
        sb.append("    tplName: ").append(toIndentedString(tplName)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    tplSign: ").append(toIndentedString(tplSign)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    varInfo: ").append(toIndentedString(varInfo)).append("\n");
        sb.append("    restags: ").append(toIndentedString(restags)).append("\n");
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
