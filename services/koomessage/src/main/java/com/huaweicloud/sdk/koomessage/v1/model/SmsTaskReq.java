package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmsTaskReq
 */
public class SmsTaskReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_num")

    private String channelNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature")

    private String signature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private List<String> to = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_params")

    private List<String> templateParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend")

    private String extend;

    public SmsTaskReq withChannelNum(String channelNum) {
        this.channelNum = channelNum;
        return this;
    }

    /**
     * 短信通道号。  > 模板所属签名的通道号，可以从“云消息服务KooMessage-管理控制台-短消息配置（国内）-短消息签名管理-通道号”中获取。未填写时默认取模板所属签名通道号。
     * @return channelNum
     */
    public String getChannelNum() {
        return channelNum;
    }

    public void setChannelNum(String channelNum) {
        this.channelNum = channelNum;
    }

    public SmsTaskReq withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 短信模板ID。  > 可以从“云消息服务KooMessage-管理控制台-短消息配置（国内）-短消息模板管理-模板ID”中获取。
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public SmsTaskReq withSignature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * 短信签名名称(暂不支持)。  > 签名名称，必须是已审核通过的，与模板类型一致的签名名称。 仅在template_id指定的模板类型为通用模板时生效且必填，用于指定在通用模板短信内容前面补充的签名。
     * @return signature
     */
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public SmsTaskReq withTaskName(String taskName) {
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

    public SmsTaskReq withTo(List<String> to) {
        this.to = to;
        return this;
    }

    public SmsTaskReq addToItem(String toItem) {
        if (this.to == null) {
            this.to = new ArrayList<>();
        }
        this.to.add(toItem);
        return this;
    }

    public SmsTaskReq withTo(Consumer<List<String>> toSetter) {
        if (this.to == null) {
            this.to = new ArrayList<>();
        }
        toSetter.accept(this.to);
        return this;
    }

    /**
     * 短信接收方的号码。  所填号码可以不带+86，系统默认添加+86，最多允许携带500个号码。  示例：131****5678，+86155****6666。
     * @return to
     */
    public List<String> getTo() {
        return to;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public SmsTaskReq withTemplateParams(List<String> templateParams) {
        this.templateParams = templateParams;
        return this;
    }

    public SmsTaskReq addTemplateParamsItem(String templateParamsItem) {
        if (this.templateParams == null) {
            this.templateParams = new ArrayList<>();
        }
        this.templateParams.add(templateParamsItem);
        return this;
    }

    public SmsTaskReq withTemplateParams(Consumer<List<String>> templateParamsSetter) {
        if (this.templateParams == null) {
            this.templateParams = new ArrayList<>();
        }
        templateParamsSetter.accept(this.templateParams);
        return this;
    }

    /**
     * 短信模板参数，字符串数组，最多20个。  短信模板中的变量类型可以是：短链、电话号码、其他号码（验证码、订单号、密码等）、日期时间、金额、其他（名称、账号、地址等）。   数组中参数按短信模板中的变量顺序进行匹配，比如短信模板内容中按顺序有3个变量：${1}、${2}、${3}，其中${1}表示手机号码，${2}表示短链，${3}表示日期，则sms_params传的是：[手机号码, 短链, 日期]。  - 电话号码：长度限制1-15个字符，可以传入手机号、座机号、95或400、800电话等。 - 其他号码：长度限制1-20个字符，不允许出现手机号、QQ号、微信号、URL等联系方式，仅支持大小写字母和数字组合。 - 时间：长度限制1-20个字符，日期格式：yyyyMMdd、yyyy-MM-dd、yyyy/MM/dd、yyyy年mm月dd日，时间格式：HH:mm:ss、HH:mm、HH点mm分、HH点mm。如果需要同时指定日期和时间，请在模板中填充两个变量，一个变量传入日期，另一个变量传入时间。 - 金额：长度限制1-20个字符，仅支持传入能够正常表达金额的数字、小数点或中文，例如壹、贰、叁、肆等，支持传入IP地址，例如：10.1.1.10。￥$等货币符号需要放在模板中，不支持变量传入。 - 其他：长度限制1-20个字符，可以设置为公司/产品/地址/姓名/内容/账号/会员名等。不允许出现QQ号/微信号（公众号）/手机号/网址/座机号等联系方式。如果确有需要，请将联系方式放入模板中，不允许在传入值中携带“.”（短链参数除外）、“。”、“'”、“<”、“>”、“{”或“}”。否则，可能导致模板变量解析异常。不允许在传入值中携带“.”，即不支持传入IP地址，如变量取值为IP地址，请申请模板时选择变量属性为“金额”。
     * @return templateParams
     */
    public List<String> getTemplateParams() {
        return templateParams;
    }

    public void setTemplateParams(List<String> templateParams) {
        this.templateParams = templateParams;
    }

    public SmsTaskReq withExtend(String extend) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmsTaskReq that = (SmsTaskReq) obj;
        return Objects.equals(this.channelNum, that.channelNum) && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.signature, that.signature) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.to, that.to) && Objects.equals(this.templateParams, that.templateParams)
            && Objects.equals(this.extend, that.extend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelNum, templateId, signature, taskName, to, templateParams, extend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmsTaskReq {\n");
        sb.append("    channelNum: ").append(toIndentedString(channelNum)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    templateParams: ").append(toIndentedString(templateParams)).append("\n");
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
