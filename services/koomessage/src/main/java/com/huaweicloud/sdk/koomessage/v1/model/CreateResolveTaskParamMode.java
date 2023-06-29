package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 生成短链的响应参数对象。
 */
public class CreateResolveTaskParamMode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cust_flag")

    private String custFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cust_id")

    private String custId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dync_params")

    private Map<String, String> dyncParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_url")

    private String customUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aim_url")

    private String aimUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aim_code")

    private String aimCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_data")

    private String extData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_code")

    private String resultCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "generate_date")

    private String generateDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_date")

    private String expireDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolved_date")

    private String resolvedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolved_times")

    private Integer resolvedTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_short_code")

    private String customShortCode;

    public CreateResolveTaskParamMode withCustFlag(String custFlag) {
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

    public CreateResolveTaskParamMode withCustId(String custId) {
        this.custId = custId;
        return this;
    }

    /**
     * 租户ID。
     * @return custId
     */
    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public CreateResolveTaskParamMode withDyncParams(Map<String, String> dyncParams) {
        this.dyncParams = dyncParams;
        return this;
    }

    public CreateResolveTaskParamMode putDyncParamsItem(String key, String dyncParamsItem) {
        if (this.dyncParams == null) {
            this.dyncParams = new HashMap<>();
        }
        this.dyncParams.put(key, dyncParamsItem);
        return this;
    }

    public CreateResolveTaskParamMode withDyncParams(Consumer<Map<String, String>> dyncParamsSetter) {
        if (this.dyncParams == null) {
            this.dyncParams = new HashMap<>();
        }
        dyncParamsSetter.accept(this.dyncParams);
        return this;
    }

    /**
     * 动态参数。
     * @return dyncParams
     */
    public Map<String, String> getDyncParams() {
        return dyncParams;
    }

    public void setDyncParams(Map<String, String> dyncParams) {
        this.dyncParams = dyncParams;
    }

    public CreateResolveTaskParamMode withCustomUrl(String customUrl) {
        this.customUrl = customUrl;
        return this;
    }

    /**
     * 自定义跳转地址。 > - 未填时，终端用户点击访问短信原文中的短链，跳转智能信息H5页 > - 已填时，终端用户点击访问短信原文中的短链，跳转客户填写的链接落地页，填写时必须为http或https作为前缀 
     * @return customUrl
     */
    public String getCustomUrl() {
        return customUrl;
    }

    public void setCustomUrl(String customUrl) {
        this.customUrl = customUrl;
    }

    public CreateResolveTaskParamMode withAimUrl(String aimUrl) {
        this.aimUrl = aimUrl;
        return this;
    }

    /**
     * 完整的短链连接地址，通过自己的短信渠道发送时，需要把该短链添加到短信模板中，并确保发送短信时的签名与创建短链时的签名保持一致。样例：km2g.cn/PDiWqc。
     * @return aimUrl
     */
    public String getAimUrl() {
        return aimUrl;
    }

    public void setAimUrl(String aimUrl) {
        this.aimUrl = aimUrl;
    }

    public CreateResolveTaskParamMode withAimCode(String aimCode) {
        this.aimCode = aimCode;
        return this;
    }

    /**
     * 智能信息编码，样例：PDiWqc。
     * @return aimCode
     */
    public String getAimCode() {
        return aimCode;
    }

    public void setAimCode(String aimCode) {
        this.aimCode = aimCode;
    }

    public CreateResolveTaskParamMode withExtData(String extData) {
        this.extData = extData;
        return this;
    }

    /**
     * 自定义扩展参数。  >预留字段。 
     * @return extData
     */
    public String getExtData() {
        return extData;
    }

    public void setExtData(String extData) {
        this.extData = extData;
    }

    public CreateResolveTaskParamMode withResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * 短链申请结果返回码。 - 0：成功 - 非0：失败，具体请参见错误码 
     * @return resultCode
     */
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public CreateResolveTaskParamMode withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 短链申请结果错误描述。 
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public CreateResolveTaskParamMode withGenerateDate(String generateDate) {
        this.generateDate = generateDate;
        return this;
    }

    /**
     * 短链生成时间。样例为：2019-10-12T07:20:50Z。
     * @return generateDate
     */
    public String getGenerateDate() {
        return generateDate;
    }

    public void setGenerateDate(String generateDate) {
        this.generateDate = generateDate;
    }

    public CreateResolveTaskParamMode withExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }

    /**
     * 短链到期时间。样例为：2019-10-12T07:20:50Z。
     * @return expireDate
     */
    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public CreateResolveTaskParamMode withResolvedDate(String resolvedDate) {
        this.resolvedDate = resolvedDate;
        return this;
    }

    /**
     * 解析时间。样例为：2019-10-12T07:20:50Z。  >预留字段。 
     * @return resolvedDate
     */
    public String getResolvedDate() {
        return resolvedDate;
    }

    public void setResolvedDate(String resolvedDate) {
        this.resolvedDate = resolvedDate;
    }

    public CreateResolveTaskParamMode withResolvedTimes(Integer resolvedTimes) {
        this.resolvedTimes = resolvedTimes;
        return this;
    }

    /**
     * 短链实际解析次数。  >预留字段。 
     * @return resolvedTimes
     */
    public Integer getResolvedTimes() {
        return resolvedTimes;
    }

    public void setResolvedTimes(Integer resolvedTimes) {
        this.resolvedTimes = resolvedTimes;
    }

    public CreateResolveTaskParamMode withCustomShortCode(String customShortCode) {
        this.customShortCode = customShortCode;
        return this;
    }

    /**
     * 自定义短码，支持长度为3到10位的数字或大小写字母。样例为：aDC123。
     * @return customShortCode
     */
    public String getCustomShortCode() {
        return customShortCode;
    }

    public void setCustomShortCode(String customShortCode) {
        this.customShortCode = customShortCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateResolveTaskParamMode that = (CreateResolveTaskParamMode) obj;
        return Objects.equals(this.custFlag, that.custFlag) && Objects.equals(this.custId, that.custId)
            && Objects.equals(this.dyncParams, that.dyncParams) && Objects.equals(this.customUrl, that.customUrl)
            && Objects.equals(this.aimUrl, that.aimUrl) && Objects.equals(this.aimCode, that.aimCode)
            && Objects.equals(this.extData, that.extData) && Objects.equals(this.resultCode, that.resultCode)
            && Objects.equals(this.errorMessage, that.errorMessage)
            && Objects.equals(this.generateDate, that.generateDate) && Objects.equals(this.expireDate, that.expireDate)
            && Objects.equals(this.resolvedDate, that.resolvedDate)
            && Objects.equals(this.resolvedTimes, that.resolvedTimes)
            && Objects.equals(this.customShortCode, that.customShortCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custFlag,
            custId,
            dyncParams,
            customUrl,
            aimUrl,
            aimCode,
            extData,
            resultCode,
            errorMessage,
            generateDate,
            expireDate,
            resolvedDate,
            resolvedTimes,
            customShortCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResolveTaskParamMode {\n");
        sb.append("    custFlag: ").append(toIndentedString(custFlag)).append("\n");
        sb.append("    custId: ").append(toIndentedString(custId)).append("\n");
        sb.append("    dyncParams: ").append(toIndentedString(dyncParams)).append("\n");
        sb.append("    customUrl: ").append(toIndentedString(customUrl)).append("\n");
        sb.append("    aimUrl: ").append(toIndentedString(aimUrl)).append("\n");
        sb.append("    aimCode: ").append(toIndentedString(aimCode)).append("\n");
        sb.append("    extData: ").append(toIndentedString(extData)).append("\n");
        sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    generateDate: ").append(toIndentedString(generateDate)).append("\n");
        sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
        sb.append("    resolvedDate: ").append(toIndentedString(resolvedDate)).append("\n");
        sb.append("    resolvedTimes: ").append(toIndentedString(resolvedTimes)).append("\n");
        sb.append("    customShortCode: ").append(toIndentedString(customShortCode)).append("\n");
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
