package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateSendSmsReq
 */
public class CreateSendSmsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private Long templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_content")

    private String smsContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cids")

    private List<String> cids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private Long orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_temp_id")

    private Long fileTempId;

    public CreateSendSmsReq withTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板id
     * @return templateId
     */
    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public CreateSendSmsReq withSmsContent(String smsContent) {
        this.smsContent = smsContent;
        return this;
    }

    /**
     * 短信内容
     * @return smsContent
     */
    public String getSmsContent() {
        return smsContent;
    }

    public void setSmsContent(String smsContent) {
        this.smsContent = smsContent;
    }

    public CreateSendSmsReq withCids(List<String> cids) {
        this.cids = cids;
        return this;
    }

    public CreateSendSmsReq addCidsItem(String cidsItem) {
        if (this.cids == null) {
            this.cids = new ArrayList<>();
        }
        this.cids.add(cidsItem);
        return this;
    }

    public CreateSendSmsReq withCids(Consumer<List<String>> cidsSetter) {
        if (this.cids == null) {
            this.cids = new ArrayList<>();
        }
        cidsSetter.accept(this.cids);
        return this;
    }

    /**
     * 容器ID
     * @return cids
     */
    public List<String> getCids() {
        return cids;
    }

    public void setCids(List<String> cids) {
        this.cids = cids;
    }

    public CreateSendSmsReq withOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 批次号
     * @return orderId
     */
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public CreateSendSmsReq withFileTempId(Long fileTempId) {
        this.fileTempId = fileTempId;
        return this;
    }

    /**
     * 临时文件ID
     * @return fileTempId
     */
    public Long getFileTempId() {
        return fileTempId;
    }

    public void setFileTempId(Long fileTempId) {
        this.fileTempId = fileTempId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSendSmsReq that = (CreateSendSmsReq) obj;
        return Objects.equals(this.templateId, that.templateId) && Objects.equals(this.smsContent, that.smsContent)
            && Objects.equals(this.cids, that.cids) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.fileTempId, that.fileTempId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, smsContent, cids, orderId, fileTempId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSendSmsReq {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    smsContent: ").append(toIndentedString(smsContent)).append("\n");
        sb.append("    cids: ").append(toIndentedString(cids)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    fileTempId: ").append(toIndentedString(fileTempId)).append("\n");
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
