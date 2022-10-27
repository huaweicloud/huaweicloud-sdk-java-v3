package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 生成短链的参数对象。
 */
public class ResolveTaskParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cust_flag")

    private String custFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dync_params")

    private Map<String, String> dyncParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_url")

    private String customUrl;

    public ResolveTaskParam withCustFlag(String custFlag) {
        this.custFlag = custFlag;
        return this;
    }

    /**
     * 创建解析任务时填写用户唯一标识，手机号码或者任何的唯一标识，唯一标识不超过64个字符。 发送智能信息时则必须填客户的手机号码。样例为：13000000001。
     * @return custFlag
     */
    public String getCustFlag() {
        return custFlag;
    }

    public void setCustFlag(String custFlag) {
        this.custFlag = custFlag;
    }

    public ResolveTaskParam withDyncParams(Map<String, String> dyncParams) {
        this.dyncParams = dyncParams;
        return this;
    }

    public ResolveTaskParam putDyncParamsItem(String key, String dyncParamsItem) {
        if (this.dyncParams == null) {
            this.dyncParams = new HashMap<>();
        }
        this.dyncParams.put(key, dyncParamsItem);
        return this;
    }

    public ResolveTaskParam withDyncParams(Consumer<Map<String, String>> dyncParamsSetter) {
        if (this.dyncParams == null) {
            this.dyncParams = new HashMap<>();
        }
        dyncParamsSetter.accept(this.dyncParams);
        return this;
    }

    /**
     * 动态参数。 > 使用动态参数模板时，aim_code_type字段只能为individual。 
     * @return dyncParams
     */
    public Map<String, String> getDyncParams() {
        return dyncParams;
    }

    public void setDyncParams(Map<String, String> dyncParams) {
        this.dyncParams = dyncParams;
    }

    public ResolveTaskParam withCustomUrl(String customUrl) {
        this.customUrl = customUrl;
        return this;
    }

    /**
     * 自定义跳转地址。长度要求不超过256。 > - 未填时，终端用户点击短信原文中的短链后，跳转智能信息模板H5页 > - 已填时，终端用户点击短信原文中的短链后，跳转该字段对应的页面，填写时必须为http或https作为前缀 > - 使用自定义跳转链接功能请联系KooMessage运营人员进行域名备案 
     * @return customUrl
     */
    public String getCustomUrl() {
        return customUrl;
    }

    public void setCustomUrl(String customUrl) {
        this.customUrl = customUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResolveTaskParam resolveTaskParam = (ResolveTaskParam) o;
        return Objects.equals(this.custFlag, resolveTaskParam.custFlag)
            && Objects.equals(this.dyncParams, resolveTaskParam.dyncParams)
            && Objects.equals(this.customUrl, resolveTaskParam.customUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custFlag, dyncParams, customUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResolveTaskParam {\n");
        sb.append("    custFlag: ").append(toIndentedString(custFlag)).append("\n");
        sb.append("    dyncParams: ").append(toIndentedString(dyncParams)).append("\n");
        sb.append("    customUrl: ").append(toIndentedString(customUrl)).append("\n");
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
