package com.huaweicloud.sdk.dcos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 验收信息
 */
public class OrderVerification {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "details")

    private OrderServiceDetails details;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachments")

    private List<UploadFileInfo> attachments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meet_expectation")

    private Boolean meetExpectation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comments")

    private String comments;

    public OrderVerification withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 服务情况，正常或异常
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public OrderVerification withDetails(OrderServiceDetails details) {
        this.details = details;
        return this;
    }

    public OrderVerification withDetails(Consumer<OrderServiceDetails> detailsSetter) {
        if (this.details == null) {
            this.details = new OrderServiceDetails();
            detailsSetter.accept(this.details);
        }

        return this;
    }

    /**
     * Get details
     * @return details
     */
    public OrderServiceDetails getDetails() {
        return details;
    }

    public void setDetails(OrderServiceDetails details) {
        this.details = details;
    }

    public OrderVerification withAttachments(List<UploadFileInfo> attachments) {
        this.attachments = attachments;
        return this;
    }

    public OrderVerification addAttachmentsItem(UploadFileInfo attachmentsItem) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        this.attachments.add(attachmentsItem);
        return this;
    }

    public OrderVerification withAttachments(Consumer<List<UploadFileInfo>> attachmentsSetter) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        attachmentsSetter.accept(this.attachments);
        return this;
    }

    /**
     * 附件
     * @return attachments
     */
    public List<UploadFileInfo> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<UploadFileInfo> attachments) {
        this.attachments = attachments;
    }

    public OrderVerification withMeetExpectation(Boolean meetExpectation) {
        this.meetExpectation = meetExpectation;
        return this;
    }

    /**
     * 是否符合预期
     * @return meetExpectation
     */
    public Boolean getMeetExpectation() {
        return meetExpectation;
    }

    public void setMeetExpectation(Boolean meetExpectation) {
        this.meetExpectation = meetExpectation;
    }

    public OrderVerification withComments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * 客户验收意见说明
     * @return comments
     */
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrderVerification that = (OrderVerification) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.details, that.details)
            && Objects.equals(this.attachments, that.attachments)
            && Objects.equals(this.meetExpectation, that.meetExpectation)
            && Objects.equals(this.comments, that.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, details, attachments, meetExpectation, comments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderVerification {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
        sb.append("    meetExpectation: ").append(toIndentedString(meetExpectation)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
