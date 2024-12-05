package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 审批信息,只读参数。业务对象最近一次的审批信息，包括审批的业务详情、审核人信息、审核时间等。
 */
public class ApprovalVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_ch")

    private String nameCh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_id")

    private String bizId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_type")

    private BizTypeEnum bizType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_info")

    private String bizInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_info_obj")

    private Object bizInfoObj;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_version")

    private Integer bizVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_status")

    private BizStatusEnum bizStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_status")

    private ApprovalStatusEnum approvalStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_type")

    private ApprovalTypeEnum approvalType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submit_time")

    private OffsetDateTime submitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l1")

    private String l1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l2")

    private String l2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l3")

    private String l3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_time")

    private OffsetDateTime approvalTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver")

    private String approver;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg")

    private String msg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_path")

    private String directoryPath;

    public ApprovalVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 审批单ID，ID字符串。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApprovalVO withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 项目ID，获取方式参考接口路径参数“project_id”。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ApprovalVO withNameCh(String nameCh) {
        this.nameCh = nameCh;
        return this;
    }

    /**
     * 业务中文名。
     * @return nameCh
     */
    public String getNameCh() {
        return nameCh;
    }

    public void setNameCh(String nameCh) {
        this.nameCh = nameCh;
    }

    public ApprovalVO withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 业务英文名。
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public ApprovalVO withBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }

    /**
     * 业务ID，ID字符串。
     * @return bizId
     */
    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public ApprovalVO withBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
        return this;
    }

    /**
     * Get bizType
     * @return bizType
     */
    public BizTypeEnum getBizType() {
        return bizType;
    }

    public void setBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
    }

    public ApprovalVO withBizInfo(String bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }

    /**
     * 序列化之后的业务详情，类型是string。
     * @return bizInfo
     */
    public String getBizInfo() {
        return bizInfo;
    }

    public void setBizInfo(String bizInfo) {
        this.bizInfo = bizInfo;
    }

    public ApprovalVO withBizInfoObj(Object bizInfoObj) {
        this.bizInfoObj = bizInfoObj;
        return this;
    }

    /**
     * 业务详情，类型是object。
     * @return bizInfoObj
     */
    public Object getBizInfoObj() {
        return bizInfoObj;
    }

    public void setBizInfoObj(Object bizInfoObj) {
        this.bizInfoObj = bizInfoObj;
    }

    public ApprovalVO withBizVersion(Integer bizVersion) {
        this.bizVersion = bizVersion;
        return this;
    }

    /**
     * 业务版本。
     * @return bizVersion
     */
    public Integer getBizVersion() {
        return bizVersion;
    }

    public void setBizVersion(Integer bizVersion) {
        this.bizVersion = bizVersion;
    }

    public ApprovalVO withBizStatus(BizStatusEnum bizStatus) {
        this.bizStatus = bizStatus;
        return this;
    }

    /**
     * Get bizStatus
     * @return bizStatus
     */
    public BizStatusEnum getBizStatus() {
        return bizStatus;
    }

    public void setBizStatus(BizStatusEnum bizStatus) {
        this.bizStatus = bizStatus;
    }

    public ApprovalVO withApprovalStatus(ApprovalStatusEnum approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }

    /**
     * Get approvalStatus
     * @return approvalStatus
     */
    public ApprovalStatusEnum getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public ApprovalVO withApprovalType(ApprovalTypeEnum approvalType) {
        this.approvalType = approvalType;
        return this;
    }

    /**
     * Get approvalType
     * @return approvalType
     */
    public ApprovalTypeEnum getApprovalType() {
        return approvalType;
    }

    public void setApprovalType(ApprovalTypeEnum approvalType) {
        this.approvalType = approvalType;
    }

    public ApprovalVO withSubmitTime(OffsetDateTime submitTime) {
        this.submitTime = submitTime;
        return this;
    }

    /**
     * 提交时间。
     * @return submitTime
     */
    public OffsetDateTime getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(OffsetDateTime submitTime) {
        this.submitTime = submitTime;
    }

    public ApprovalVO withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建者。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public ApprovalVO withL1(String l1) {
        this.l1 = l1;
        return this;
    }

    /**
     * 主题域分组中文名，只读，创建和更新时无需填写。
     * @return l1
     */
    public String getL1() {
        return l1;
    }

    public void setL1(String l1) {
        this.l1 = l1;
    }

    public ApprovalVO withL2(String l2) {
        this.l2 = l2;
        return this;
    }

    /**
     * 主题域中文名，只读，创建和更新时无需填写。
     * @return l2
     */
    public String getL2() {
        return l2;
    }

    public void setL2(String l2) {
        this.l2 = l2;
    }

    public ApprovalVO withL3(String l3) {
        this.l3 = l3;
        return this;
    }

    /**
     * 业务对象中文名，只读，创建和更新时无需填写。
     * @return l3
     */
    public String getL3() {
        return l3;
    }

    public void setL3(String l3) {
        this.l3 = l3;
    }

    public ApprovalVO withApprovalTime(OffsetDateTime approvalTime) {
        this.approvalTime = approvalTime;
        return this;
    }

    /**
     * 审核时间。
     * @return approvalTime
     */
    public OffsetDateTime getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(OffsetDateTime approvalTime) {
        this.approvalTime = approvalTime;
    }

    public ApprovalVO withApprover(String approver) {
        this.approver = approver;
        return this;
    }

    /**
     * 审核人。
     * @return approver
     */
    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public ApprovalVO withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 审核人邮箱。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ApprovalVO withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * 审核信息。
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ApprovalVO withDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
        return this;
    }

    /**
     * 目录树。
     * @return directoryPath
     */
    public String getDirectoryPath() {
        return directoryPath;
    }

    public void setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApprovalVO that = (ApprovalVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.nameCh, that.nameCh) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.bizId, that.bizId) && Objects.equals(this.bizType, that.bizType)
            && Objects.equals(this.bizInfo, that.bizInfo) && Objects.equals(this.bizInfoObj, that.bizInfoObj)
            && Objects.equals(this.bizVersion, that.bizVersion) && Objects.equals(this.bizStatus, that.bizStatus)
            && Objects.equals(this.approvalStatus, that.approvalStatus)
            && Objects.equals(this.approvalType, that.approvalType) && Objects.equals(this.submitTime, that.submitTime)
            && Objects.equals(this.createBy, that.createBy) && Objects.equals(this.l1, that.l1)
            && Objects.equals(this.l2, that.l2) && Objects.equals(this.l3, that.l3)
            && Objects.equals(this.approvalTime, that.approvalTime) && Objects.equals(this.approver, that.approver)
            && Objects.equals(this.email, that.email) && Objects.equals(this.msg, that.msg)
            && Objects.equals(this.directoryPath, that.directoryPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            tenantId,
            nameCh,
            nameEn,
            bizId,
            bizType,
            bizInfo,
            bizInfoObj,
            bizVersion,
            bizStatus,
            approvalStatus,
            approvalType,
            submitTime,
            createBy,
            l1,
            l2,
            l3,
            approvalTime,
            approver,
            email,
            msg,
            directoryPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApprovalVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    nameCh: ").append(toIndentedString(nameCh)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    bizId: ").append(toIndentedString(bizId)).append("\n");
        sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
        sb.append("    bizInfo: ").append(toIndentedString(bizInfo)).append("\n");
        sb.append("    bizInfoObj: ").append(toIndentedString(bizInfoObj)).append("\n");
        sb.append("    bizVersion: ").append(toIndentedString(bizVersion)).append("\n");
        sb.append("    bizStatus: ").append(toIndentedString(bizStatus)).append("\n");
        sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
        sb.append("    approvalType: ").append(toIndentedString(approvalType)).append("\n");
        sb.append("    submitTime: ").append(toIndentedString(submitTime)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    l1: ").append(toIndentedString(l1)).append("\n");
        sb.append("    l2: ").append(toIndentedString(l2)).append("\n");
        sb.append("    l3: ").append(toIndentedString(l3)).append("\n");
        sb.append("    approvalTime: ").append(toIndentedString(approvalTime)).append("\n");
        sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
        sb.append("    directoryPath: ").append(toIndentedString(directoryPath)).append("\n");
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
