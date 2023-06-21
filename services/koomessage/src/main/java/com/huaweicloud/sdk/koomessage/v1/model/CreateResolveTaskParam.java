package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 生成短链的参数对象。
 */
public class CreateResolveTaskParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cust_flag")

    private String custFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dync_params")

    private Map<String, String> dyncParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_url")

    private String customUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_short_code")

    private String customShortCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_params")

    private List<String> smsParams = null;

    public CreateResolveTaskParam withCustFlag(String custFlag) {
        this.custFlag = custFlag;
        return this;
    }

    /**
     * 创建解析任务时填写用户唯一标识，手机号码或者任何的唯一标识，唯一标识不超过64个字符。 发送智能信息时则必须填客户的手机号码。样例为：130****0001。
     * @return custFlag
     */
    public String getCustFlag() {
        return custFlag;
    }

    public void setCustFlag(String custFlag) {
        this.custFlag = custFlag;
    }

    public CreateResolveTaskParam withDyncParams(Map<String, String> dyncParams) {
        this.dyncParams = dyncParams;
        return this;
    }

    public CreateResolveTaskParam putDyncParamsItem(String key, String dyncParamsItem) {
        if (this.dyncParams == null) {
            this.dyncParams = new HashMap<>();
        }
        this.dyncParams.put(key, dyncParamsItem);
        return this;
    }

    public CreateResolveTaskParam withDyncParams(Consumer<Map<String, String>> dyncParamsSetter) {
        if (this.dyncParams == null) {
            this.dyncParams = new HashMap<>();
        }
        dyncParamsSetter.accept(this.dyncParams);
        return this;
    }

    /**
     * 动态参数。  > 使用动态参数模板时，aim_code_type字段只能为individual。 
     * @return dyncParams
     */
    public Map<String, String> getDyncParams() {
        return dyncParams;
    }

    public void setDyncParams(Map<String, String> dyncParams) {
        this.dyncParams = dyncParams;
    }

    public CreateResolveTaskParam withCustomUrl(String customUrl) {
        this.customUrl = customUrl;
        return this;
    }

    /**
     * 自定义跳转地址。长度要求不超过2048。 > - 未填时，终端用户点击短信原文中的短链后，跳转智能信息模板H5页 > - 已填时，终端用户点击短信原文中的短链后，跳转该字段对应的页面，填写时必须为http或https作为前缀 > - 使用自定义跳转链接功能请联系KooMessage运营人员进行域名备案 > - 自定义短码时即generation_type为2时不支持自定义跳转链接功能，传入的参数值无效 
     * @return customUrl
     */
    public String getCustomUrl() {
        return customUrl;
    }

    public void setCustomUrl(String customUrl) {
        this.customUrl = customUrl;
    }

    public CreateResolveTaskParam withCustomShortCode(String customShortCode) {
        this.customShortCode = customShortCode;
        return this;
    }

    /**
     * 自定义短码，支持长度为3到10位的数字或大小写字母。样例为：aDC123。 > 自定义短码时即generation_type为2时，此参数为必填。
     * @return customShortCode
     */
    public String getCustomShortCode() {
        return customShortCode;
    }

    public void setCustomShortCode(String customShortCode) {
        this.customShortCode = customShortCode;
    }

    public CreateResolveTaskParam withSmsParams(List<String> smsParams) {
        this.smsParams = smsParams;
        return this;
    }

    public CreateResolveTaskParam addSmsParamsItem(String smsParamsItem) {
        if (this.smsParams == null) {
            this.smsParams = new ArrayList<>();
        }
        this.smsParams.add(smsParamsItem);
        return this;
    }

    public CreateResolveTaskParam withSmsParams(Consumer<List<String>> smsParamsSetter) {
        if (this.smsParams == null) {
            this.smsParams = new ArrayList<>();
        }
        smsParamsSetter.accept(this.smsParams);
        return this;
    }

    /**
     * 短信模板参数。 - 短信模板中的变量类型可以是：短链、电话号码、其他号码（验证码、订单号、密码等）、日期时间、金额、其他（名称、帐号、地址等）。 - 字符串数组，最多19个。 - 数组中参数按短信模板中除了短链类型参数外的变量的顺序进行匹配，比如短信模板内容中按顺序有3个变量：${1}、${2}、${3}，其中${1}表示手机号码，${2}表示短链，${3}表示日期，则sms_params传的是：[手机号码, 日期]。 - 如果短信模板只包含短链1个参数，则sms_params传空数组。 - 电话号码长度限制1-15个字符，可以传入手机号、座机号、95或400、800电话等。 - 其他号码长度限制1-20个字符，不允许出现手机号、QQ号、微信号、URL等联系方式，仅支持大小写字母和数字组合。 - 时间长度限制1-20个字符，日期格式：yyyyMMdd、yyyy-MM-dd、yyyy/MM/dd、yyyy年mm月dd日，时间格式：HH:mm:ss、HH:mm、HH点mm分、HH点mm。如果需要同时指定日期和时间，请在模板中填充两个变量，一个变量传入日期，另一个变量传入时间。 - 金额长度限制1-20个字符，仅支持传入能够正常表达金额的数字、小数点或中文，例如壹、贰、叁、肆等，支持传入IP地址，例如：10.1.1.10。￥$等货币符号需要放在模板中，不支持变量传入。 - 其他长度限制1-20个字符，可以设置为公司/产品/地址/姓名/内容/帐号/会员名等。不允许出现QQ号/微信号（公众号）/手机号/网址/座机号等联系方式。如果确有需要，请将联系方式放入模板中，不允许在传入值中携带“.”、“。”、“'”、“<”、“>”、“{”或“}”。否则，可能导致模板变量解析异常。不允许在传入值中携带“.”，即不支持传入IP地址，如变量取值为IP地址，请申请模板时选择变量属性为“金额”。 
     * @return smsParams
     */
    public List<String> getSmsParams() {
        return smsParams;
    }

    public void setSmsParams(List<String> smsParams) {
        this.smsParams = smsParams;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateResolveTaskParam createResolveTaskParam = (CreateResolveTaskParam) o;
        return Objects.equals(this.custFlag, createResolveTaskParam.custFlag)
            && Objects.equals(this.dyncParams, createResolveTaskParam.dyncParams)
            && Objects.equals(this.customUrl, createResolveTaskParam.customUrl)
            && Objects.equals(this.customShortCode, createResolveTaskParam.customShortCode)
            && Objects.equals(this.smsParams, createResolveTaskParam.smsParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custFlag, dyncParams, customUrl, customShortCode, smsParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResolveTaskParam {\n");
        sb.append("    custFlag: ").append(toIndentedString(custFlag)).append("\n");
        sb.append("    dyncParams: ").append(toIndentedString(dyncParams)).append("\n");
        sb.append("    customUrl: ").append(toIndentedString(customUrl)).append("\n");
        sb.append("    customShortCode: ").append(toIndentedString(customShortCode)).append("\n");
        sb.append("    smsParams: ").append(toIndentedString(smsParams)).append("\n");
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
