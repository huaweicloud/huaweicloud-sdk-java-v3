package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmsMultiTemplateTaskRequestBody
 */
public class SmsMultiTemplateTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_content")

    private List<MsgContent> smsContent = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_num")

    private String channelNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend")

    private String extend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    public SmsMultiTemplateTaskRequestBody withSmsContent(List<MsgContent> smsContent) {
        this.smsContent = smsContent;
        return this;
    }

    public SmsMultiTemplateTaskRequestBody addSmsContentItem(MsgContent smsContentItem) {
        if (this.smsContent == null) {
            this.smsContent = new ArrayList<>();
        }
        this.smsContent.add(smsContentItem);
        return this;
    }

    public SmsMultiTemplateTaskRequestBody withSmsContent(Consumer<List<MsgContent>> smsContentSetter) {
        if (this.smsContent == null) {
            this.smsContent = new ArrayList<>();
        }
        smsContentSetter.accept(this.smsContent);
        return this;
    }

    /**
     * 短信内容。
     * @return smsContent
     */
    public List<MsgContent> getSmsContent() {
        return smsContent;
    }

    public void setSmsContent(List<MsgContent> smsContent) {
        this.smsContent = smsContent;
    }

    public SmsMultiTemplateTaskRequestBody withChannelNum(String channelNum) {
        this.channelNum = channelNum;
        return this;
    }

    /**
     * 短信通道号。  > 模板所属签名的通道号，可以从“云消息服务KooMessage-管理控制台-短消息配置（国内）-短消息签名管理-通道号”中获取。 > 签名和模板为对应关系，模板所属签名可在“短消息模板管理”查看。未填写时默认取sms_content第一条数据模板所属签名的通道号。
     * @return channelNum
     */
    public String getChannelNum() {
        return channelNum;
    }

    public void setChannelNum(String channelNum) {
        this.channelNum = channelNum;
    }

    public SmsMultiTemplateTaskRequestBody withExtend(String extend) {
        this.extend = extend;
        return this;
    }

    /**
     * 扩展参数。  在状态报告中会原样返回。  不允许赋空值，不允许携带以下字符：“{”，“}”（即大括号）。
     * @return extend
     */
    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public SmsMultiTemplateTaskRequestBody withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 发送任务名称。  > 不能为空白字符串，允许重复，为空时默认为Task_拼接当前时间值。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmsMultiTemplateTaskRequestBody that = (SmsMultiTemplateTaskRequestBody) obj;
        return Objects.equals(this.smsContent, that.smsContent) && Objects.equals(this.channelNum, that.channelNum)
            && Objects.equals(this.extend, that.extend) && Objects.equals(this.taskName, that.taskName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(smsContent, channelNum, extend, taskName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmsMultiTemplateTaskRequestBody {\n");
        sb.append("    smsContent: ").append(toIndentedString(smsContent)).append("\n");
        sb.append("    channelNum: ").append(toIndentedString(channelNum)).append("\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
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
