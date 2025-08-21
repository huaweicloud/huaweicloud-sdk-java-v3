package com.huaweicloud.sdk.dcos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 客户工单
 */
public class SaveOrderBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_code")

    private String modelCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_whitelist")

    private AccessWhiteList accessWhitelist;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delivery_info")

    private DeliveryInfo deliveryInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_objects")

    private List<OperationObject> operationObjects = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_attachments")

    private List<UploadFileInfo> operationAttachments = null;

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
    @JsonProperty(value = "fields")

    private List<FieldEntity> fields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_accept_terms")

    private Boolean isAcceptTerms;

    public SaveOrderBody withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 工单号，修改已保存的草稿时使用
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public SaveOrderBody withTitle(String title) {
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

    public SaveOrderBody withModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }

    /**
     * 工单类型编码
     * @return modelCode
     */
    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public SaveOrderBody withAccessWhitelist(AccessWhiteList accessWhitelist) {
        this.accessWhitelist = accessWhitelist;
        return this;
    }

    public SaveOrderBody withAccessWhitelist(Consumer<AccessWhiteList> accessWhitelistSetter) {
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

    public SaveOrderBody withDeliveryInfo(DeliveryInfo deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
        return this;
    }

    public SaveOrderBody withDeliveryInfo(Consumer<DeliveryInfo> deliveryInfoSetter) {
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

    public SaveOrderBody withOperationObjects(List<OperationObject> operationObjects) {
        this.operationObjects = operationObjects;
        return this;
    }

    public SaveOrderBody addOperationObjectsItem(OperationObject operationObjectsItem) {
        if (this.operationObjects == null) {
            this.operationObjects = new ArrayList<>();
        }
        this.operationObjects.add(operationObjectsItem);
        return this;
    }

    public SaveOrderBody withOperationObjects(Consumer<List<OperationObject>> operationObjectsSetter) {
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

    public SaveOrderBody withOperationAttachments(List<UploadFileInfo> operationAttachments) {
        this.operationAttachments = operationAttachments;
        return this;
    }

    public SaveOrderBody addOperationAttachmentsItem(UploadFileInfo operationAttachmentsItem) {
        if (this.operationAttachments == null) {
            this.operationAttachments = new ArrayList<>();
        }
        this.operationAttachments.add(operationAttachmentsItem);
        return this;
    }

    public SaveOrderBody withOperationAttachments(Consumer<List<UploadFileInfo>> operationAttachmentsSetter) {
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

    public SaveOrderBody withAdditionalAttachments(List<UploadFileInfo> additionalAttachments) {
        this.additionalAttachments = additionalAttachments;
        return this;
    }

    public SaveOrderBody addAdditionalAttachmentsItem(UploadFileInfo additionalAttachmentsItem) {
        if (this.additionalAttachments == null) {
            this.additionalAttachments = new ArrayList<>();
        }
        this.additionalAttachments.add(additionalAttachmentsItem);
        return this;
    }

    public SaveOrderBody withAdditionalAttachments(Consumer<List<UploadFileInfo>> additionalAttachmentsSetter) {
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

    public SaveOrderBody withAdditionalContent(String additionalContent) {
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

    public SaveOrderBody withCountryCode(String countryCode) {
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

    public SaveOrderBody withPhone(String phone) {
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

    public SaveOrderBody withFields(List<FieldEntity> fields) {
        this.fields = fields;
        return this;
    }

    public SaveOrderBody addFieldsItem(FieldEntity fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public SaveOrderBody withFields(Consumer<List<FieldEntity>> fieldsSetter) {
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

    public SaveOrderBody withIsAcceptTerms(Boolean isAcceptTerms) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SaveOrderBody that = (SaveOrderBody) obj;
        return Objects.equals(this.number, that.number) && Objects.equals(this.title, that.title)
            && Objects.equals(this.modelCode, that.modelCode)
            && Objects.equals(this.accessWhitelist, that.accessWhitelist)
            && Objects.equals(this.deliveryInfo, that.deliveryInfo)
            && Objects.equals(this.operationObjects, that.operationObjects)
            && Objects.equals(this.operationAttachments, that.operationAttachments)
            && Objects.equals(this.additionalAttachments, that.additionalAttachments)
            && Objects.equals(this.additionalContent, that.additionalContent)
            && Objects.equals(this.countryCode, that.countryCode) && Objects.equals(this.phone, that.phone)
            && Objects.equals(this.fields, that.fields) && Objects.equals(this.isAcceptTerms, that.isAcceptTerms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number,
            title,
            modelCode,
            accessWhitelist,
            deliveryInfo,
            operationObjects,
            operationAttachments,
            additionalAttachments,
            additionalContent,
            countryCode,
            phone,
            fields,
            isAcceptTerms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SaveOrderBody {\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    modelCode: ").append(toIndentedString(modelCode)).append("\n");
        sb.append("    accessWhitelist: ").append(toIndentedString(accessWhitelist)).append("\n");
        sb.append("    deliveryInfo: ").append(toIndentedString(deliveryInfo)).append("\n");
        sb.append("    operationObjects: ").append(toIndentedString(operationObjects)).append("\n");
        sb.append("    operationAttachments: ").append(toIndentedString(operationAttachments)).append("\n");
        sb.append("    additionalAttachments: ").append(toIndentedString(additionalAttachments)).append("\n");
        sb.append("    additionalContent: ").append(toIndentedString(additionalContent)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    isAcceptTerms: ").append(toIndentedString(isAcceptTerms)).append("\n");
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
