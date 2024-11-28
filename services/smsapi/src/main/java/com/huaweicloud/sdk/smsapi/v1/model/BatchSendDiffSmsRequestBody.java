package com.huaweicloud.sdk.smsapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量发送短信的请求body数据结构
 */
public class BatchSendDiffSmsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private String from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statusCallback")

    private String statusCallback;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smsContent")

    private List<SmsContent> smsContent = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend")

    private String extend;

    public BatchSendDiffSmsRequestBody withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * 短信发送方的号码
     * @return from
     */
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public BatchSendDiffSmsRequestBody withStatusCallback(String statusCallback) {
        this.statusCallback = statusCallback;
        return this;
    }

    /**
     * SP的回调地址，用于单条接收短信状态报告
     * @return statusCallback
     */
    public String getStatusCallback() {
        return statusCallback;
    }

    public void setStatusCallback(String statusCallback) {
        this.statusCallback = statusCallback;
    }

    public BatchSendDiffSmsRequestBody withSmsContent(List<SmsContent> smsContent) {
        this.smsContent = smsContent;
        return this;
    }

    public BatchSendDiffSmsRequestBody addSmsContentItem(SmsContent smsContentItem) {
        if (this.smsContent == null) {
            this.smsContent = new ArrayList<>();
        }
        this.smsContent.add(smsContentItem);
        return this;
    }

    public BatchSendDiffSmsRequestBody withSmsContent(Consumer<List<SmsContent>> smsContentSetter) {
        if (this.smsContent == null) {
            this.smsContent = new ArrayList<>();
        }
        smsContentSetter.accept(this.smsContent);
        return this;
    }

    /**
     * 短信内容
     * @return smsContent
     */
    public List<SmsContent> getSmsContent() {
        return smsContent;
    }

    public void setSmsContent(List<SmsContent> smsContent) {
        this.smsContent = smsContent;
    }

    public BatchSendDiffSmsRequestBody withExtend(String extend) {
        this.extend = extend;
        return this;
    }

    /**
     * 扩展参数
     * @return extend
     */
    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchSendDiffSmsRequestBody that = (BatchSendDiffSmsRequestBody) obj;
        return Objects.equals(this.from, that.from) && Objects.equals(this.statusCallback, that.statusCallback)
            && Objects.equals(this.smsContent, that.smsContent) && Objects.equals(this.extend, that.extend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, statusCallback, smsContent, extend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSendDiffSmsRequestBody {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    statusCallback: ").append(toIndentedString(statusCallback)).append("\n");
        sb.append("    smsContent: ").append(toIndentedString(smsContent)).append("\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
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
