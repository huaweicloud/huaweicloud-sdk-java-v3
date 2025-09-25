package com.huaweicloud.sdk.dcos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOrderResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_type")

    private String subType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_code")

    private String modelCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_objects")

    private List<OperationObject> operationObjects = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_attachments")

    private List<UploadFileInfo> operationAttachments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_whitelist")

    private AccessWhiteList accessWhitelist;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delivery_info")

    private DeliveryInfo deliveryInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional_attachments")

    private List<UploadFileInfo> additionalAttachments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional_content")

    private String additionalContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country_code")

    private String countryCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage")

    private String stage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logs")

    private List<OrderLog> logs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<FieldEntity> fields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicant")

    private String applicant;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_accept_terms")

    private Boolean isAcceptTerms;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification")

    private OrderVerification verification;

    public ShowOrderResponse withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 服务单号
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ShowOrderResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ShowOrderResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 服务单类型:IDC运维 设备运维 设备检查 客户陪同
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowOrderResponse withSubType(String subType) {
        this.subType = subType;
        return this;
    }

    /**
     * 具体操作类型:设备物理上下电
     * @return subType
     */
    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public ShowOrderResponse withModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }

    /**
     * 服务单类型编码
     * @return modelCode
     */
    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public ShowOrderResponse withOperationObjects(List<OperationObject> operationObjects) {
        this.operationObjects = operationObjects;
        return this;
    }

    public ShowOrderResponse addOperationObjectsItem(OperationObject operationObjectsItem) {
        if (this.operationObjects == null) {
            this.operationObjects = new ArrayList<>();
        }
        this.operationObjects.add(operationObjectsItem);
        return this;
    }

    public ShowOrderResponse withOperationObjects(Consumer<List<OperationObject>> operationObjectsSetter) {
        if (this.operationObjects == null) {
            this.operationObjects = new ArrayList<>();
        }
        operationObjectsSetter.accept(this.operationObjects);
        return this;
    }

    /**
     * 操作对象
     * @return operationObjects
     */
    public List<OperationObject> getOperationObjects() {
        return operationObjects;
    }

    public void setOperationObjects(List<OperationObject> operationObjects) {
        this.operationObjects = operationObjects;
    }

    public ShowOrderResponse withOperationAttachments(List<UploadFileInfo> operationAttachments) {
        this.operationAttachments = operationAttachments;
        return this;
    }

    public ShowOrderResponse addOperationAttachmentsItem(UploadFileInfo operationAttachmentsItem) {
        if (this.operationAttachments == null) {
            this.operationAttachments = new ArrayList<>();
        }
        this.operationAttachments.add(operationAttachmentsItem);
        return this;
    }

    public ShowOrderResponse withOperationAttachments(Consumer<List<UploadFileInfo>> operationAttachmentsSetter) {
        if (this.operationAttachments == null) {
            this.operationAttachments = new ArrayList<>();
        }
        operationAttachmentsSetter.accept(this.operationAttachments);
        return this;
    }

    /**
     * 操作内容附件
     * @return operationAttachments
     */
    public List<UploadFileInfo> getOperationAttachments() {
        return operationAttachments;
    }

    public void setOperationAttachments(List<UploadFileInfo> operationAttachments) {
        this.operationAttachments = operationAttachments;
    }

    public ShowOrderResponse withAccessWhitelist(AccessWhiteList accessWhitelist) {
        this.accessWhitelist = accessWhitelist;
        return this;
    }

    public ShowOrderResponse withAccessWhitelist(Consumer<AccessWhiteList> accessWhitelistSetter) {
        if (this.accessWhitelist == null) {
            this.accessWhitelist = new AccessWhiteList();
            accessWhitelistSetter.accept(this.accessWhitelist);
        }

        return this;
    }

    /**
     * Get accessWhitelist
     * @return accessWhitelist
     */
    public AccessWhiteList getAccessWhitelist() {
        return accessWhitelist;
    }

    public void setAccessWhitelist(AccessWhiteList accessWhitelist) {
        this.accessWhitelist = accessWhitelist;
    }

    public ShowOrderResponse withDeliveryInfo(DeliveryInfo deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
        return this;
    }

    public ShowOrderResponse withDeliveryInfo(Consumer<DeliveryInfo> deliveryInfoSetter) {
        if (this.deliveryInfo == null) {
            this.deliveryInfo = new DeliveryInfo();
            deliveryInfoSetter.accept(this.deliveryInfo);
        }

        return this;
    }

    /**
     * Get deliveryInfo
     * @return deliveryInfo
     */
    public DeliveryInfo getDeliveryInfo() {
        return deliveryInfo;
    }

    public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }

    public ShowOrderResponse withAdditionalAttachments(List<UploadFileInfo> additionalAttachments) {
        this.additionalAttachments = additionalAttachments;
        return this;
    }

    public ShowOrderResponse addAdditionalAttachmentsItem(UploadFileInfo additionalAttachmentsItem) {
        if (this.additionalAttachments == null) {
            this.additionalAttachments = new ArrayList<>();
        }
        this.additionalAttachments.add(additionalAttachmentsItem);
        return this;
    }

    public ShowOrderResponse withAdditionalAttachments(Consumer<List<UploadFileInfo>> additionalAttachmentsSetter) {
        if (this.additionalAttachments == null) {
            this.additionalAttachments = new ArrayList<>();
        }
        additionalAttachmentsSetter.accept(this.additionalAttachments);
        return this;
    }

    /**
     * 补充附件
     * @return additionalAttachments
     */
    public List<UploadFileInfo> getAdditionalAttachments() {
        return additionalAttachments;
    }

    public void setAdditionalAttachments(List<UploadFileInfo> additionalAttachments) {
        this.additionalAttachments = additionalAttachments;
    }

    public ShowOrderResponse withAdditionalContent(String additionalContent) {
        this.additionalContent = additionalContent;
        return this;
    }

    /**
     * 补充说明
     * @return additionalContent
     */
    public String getAdditionalContent() {
        return additionalContent;
    }

    public void setAdditionalContent(String additionalContent) {
        this.additionalContent = additionalContent;
    }

    public ShowOrderResponse withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * 手机国际码
     * @return countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public ShowOrderResponse withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 联系电话
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ShowOrderResponse withStage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * 当前阶段.DRAFT草稿、SUMMITED服务申请、IN_PROGRESS服务处理中、ACCEPTANCE服务验收、CLOSED服务关闭
     * @return stage
     */
    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public ShowOrderResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 当前状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowOrderResponse withLogs(List<OrderLog> logs) {
        this.logs = logs;
        return this;
    }

    public ShowOrderResponse addLogsItem(OrderLog logsItem) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        this.logs.add(logsItem);
        return this;
    }

    public ShowOrderResponse withLogs(Consumer<List<OrderLog>> logsSetter) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        logsSetter.accept(this.logs);
        return this;
    }

    /**
     * 服务单日志
     * @return logs
     */
    public List<OrderLog> getLogs() {
        return logs;
    }

    public void setLogs(List<OrderLog> logs) {
        this.logs = logs;
    }

    public ShowOrderResponse withFields(List<FieldEntity> fields) {
        this.fields = fields;
        return this;
    }

    public ShowOrderResponse addFieldsItem(FieldEntity fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ShowOrderResponse withFields(Consumer<List<FieldEntity>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * 扩展字段
     * @return fields
     */
    public List<FieldEntity> getFields() {
        return fields;
    }

    public void setFields(List<FieldEntity> fields) {
        this.fields = fields;
    }

    public ShowOrderResponse withApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }

    /**
     * 申请人
     * @return applicant
     */
    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public ShowOrderResponse withIsAcceptTerms(Boolean isAcceptTerms) {
        this.isAcceptTerms = isAcceptTerms;
        return this;
    }

    /**
     * 是否同意服务条款
     * @return isAcceptTerms
     */
    public Boolean getIsAcceptTerms() {
        return isAcceptTerms;
    }

    public void setIsAcceptTerms(Boolean isAcceptTerms) {
        this.isAcceptTerms = isAcceptTerms;
    }

    public ShowOrderResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 申请时间/创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowOrderResponse withVerification(OrderVerification verification) {
        this.verification = verification;
        return this;
    }

    public ShowOrderResponse withVerification(Consumer<OrderVerification> verificationSetter) {
        if (this.verification == null) {
            this.verification = new OrderVerification();
            verificationSetter.accept(this.verification);
        }

        return this;
    }

    /**
     * Get verification
     * @return verification
     */
    public OrderVerification getVerification() {
        return verification;
    }

    public void setVerification(OrderVerification verification) {
        this.verification = verification;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOrderResponse that = (ShowOrderResponse) obj;
        return Objects.equals(this.number, that.number) && Objects.equals(this.title, that.title)
            && Objects.equals(this.type, that.type) && Objects.equals(this.subType, that.subType)
            && Objects.equals(this.modelCode, that.modelCode)
            && Objects.equals(this.operationObjects, that.operationObjects)
            && Objects.equals(this.operationAttachments, that.operationAttachments)
            && Objects.equals(this.accessWhitelist, that.accessWhitelist)
            && Objects.equals(this.deliveryInfo, that.deliveryInfo)
            && Objects.equals(this.additionalAttachments, that.additionalAttachments)
            && Objects.equals(this.additionalContent, that.additionalContent)
            && Objects.equals(this.countryCode, that.countryCode) && Objects.equals(this.phone, that.phone)
            && Objects.equals(this.stage, that.stage) && Objects.equals(this.status, that.status)
            && Objects.equals(this.logs, that.logs) && Objects.equals(this.fields, that.fields)
            && Objects.equals(this.applicant, that.applicant) && Objects.equals(this.isAcceptTerms, that.isAcceptTerms)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.verification, that.verification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number,
            title,
            type,
            subType,
            modelCode,
            operationObjects,
            operationAttachments,
            accessWhitelist,
            deliveryInfo,
            additionalAttachments,
            additionalContent,
            countryCode,
            phone,
            stage,
            status,
            logs,
            fields,
            applicant,
            isAcceptTerms,
            createTime,
            verification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOrderResponse {\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
        sb.append("    modelCode: ").append(toIndentedString(modelCode)).append("\n");
        sb.append("    operationObjects: ").append(toIndentedString(operationObjects)).append("\n");
        sb.append("    operationAttachments: ").append(toIndentedString(operationAttachments)).append("\n");
        sb.append("    accessWhitelist: ").append(toIndentedString(accessWhitelist)).append("\n");
        sb.append("    deliveryInfo: ").append(toIndentedString(deliveryInfo)).append("\n");
        sb.append("    additionalAttachments: ").append(toIndentedString(additionalAttachments)).append("\n");
        sb.append("    additionalContent: ").append(toIndentedString(additionalContent)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    applicant: ").append(toIndentedString(applicant)).append("\n");
        sb.append("    isAcceptTerms: ").append(toIndentedString(isAcceptTerms)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
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
