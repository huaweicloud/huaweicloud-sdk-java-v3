package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 生成短链请求体。
 */
public class CreateResolveTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_id")

    private String tplId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_signs")

    private List<String> smsSigns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolving_times")

    private Integer resolvingTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aim_code_type")

    private String aimCodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_time")

    private Integer expirationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<CreateResolveTaskParam> params = null;

    public CreateResolveTaskRequestBody withTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }

    /**
     * 智能信息模板ID，由9位数字组成。
     * @return tplId
     */
    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
    }

    public CreateResolveTaskRequestBody withSmsSigns(List<String> smsSigns) {
        this.smsSigns = smsSigns;
        return this;
    }

    public CreateResolveTaskRequestBody addSmsSignsItem(String smsSignsItem) {
        if (this.smsSigns == null) {
            this.smsSigns = new ArrayList<>();
        }
        this.smsSigns.add(smsSignsItem);
        return this;
    }

    public CreateResolveTaskRequestBody withSmsSigns(Consumer<List<String>> smsSignsSetter) {
        if (this.smsSigns == null) {
            this.smsSigns = new ArrayList<>();
        }
        smsSignsSetter.accept(this.smsSigns);
        return this;
    }

    /**
     * 短信签名列表，需要与最终发送短信的签名一致，才能解析。
     * @return smsSigns
     */
    public List<String> getSmsSigns() {
        return smsSigns;
    }

    public void setSmsSigns(List<String> smsSigns) {
        this.smsSigns = smsSigns;
    }

    public CreateResolveTaskRequestBody withResolvingTimes(Integer resolvingTimes) {
        this.resolvingTimes = resolvingTimes;
        return this;
    }

    /**
     * 短链最大解析次数。  >个性化短链只支持最大解析数为1，设置其他值无效。 
     * minimum: 1
     * maximum: 10000000
     * @return resolvingTimes
     */
    public Integer getResolvingTimes() {
        return resolvingTimes;
    }

    public void setResolvingTimes(Integer resolvingTimes) {
        this.resolvingTimes = resolvingTimes;
    }

    public CreateResolveTaskRequestBody withAimCodeType(String aimCodeType) {
        this.aimCodeType = aimCodeType;
        return this;
    }

    /**
     * 生成短链类型。  - group：群发 - individual：个性化  > 使用动态参数模板时，该字段只能为individual。 
     * @return aimCodeType
     */
    public String getAimCodeType() {
        return aimCodeType;
    }

    public void setAimCodeType(String aimCodeType) {
        this.aimCodeType = aimCodeType;
    }

    public CreateResolveTaskRequestBody withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 自定义短链域名，由大小写字母和数字组成的二级域名。  
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CreateResolveTaskRequestBody withExpirationTime(Integer expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * 失效时间（天）。aim_code_type为group时，取值范围为1~30；aim_code_type为individual个性化时，取值范围为1~7。  > 失效时间精确到秒，例如参数设置为1，创建时间为2022-07-22 21:10:12，过期时间为2022-07-23 21:10:12。 
     * @return expirationTime
     */
    public Integer getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Integer expirationTime) {
        this.expirationTime = expirationTime;
    }

    public CreateResolveTaskRequestBody withParams(List<CreateResolveTaskParam> params) {
        this.params = params;
        return this;
    }

    public CreateResolveTaskRequestBody addParamsItem(CreateResolveTaskParam paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public CreateResolveTaskRequestBody withParams(Consumer<List<CreateResolveTaskParam>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 短链参数列表。一次请求最多生成100个短链。
     * @return params
     */
    public List<CreateResolveTaskParam> getParams() {
        return params;
    }

    public void setParams(List<CreateResolveTaskParam> params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateResolveTaskRequestBody createResolveTaskRequestBody = (CreateResolveTaskRequestBody) o;
        return Objects.equals(this.tplId, createResolveTaskRequestBody.tplId)
            && Objects.equals(this.smsSigns, createResolveTaskRequestBody.smsSigns)
            && Objects.equals(this.resolvingTimes, createResolveTaskRequestBody.resolvingTimes)
            && Objects.equals(this.aimCodeType, createResolveTaskRequestBody.aimCodeType)
            && Objects.equals(this.domain, createResolveTaskRequestBody.domain)
            && Objects.equals(this.expirationTime, createResolveTaskRequestBody.expirationTime)
            && Objects.equals(this.params, createResolveTaskRequestBody.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tplId, smsSigns, resolvingTimes, aimCodeType, domain, expirationTime, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResolveTaskRequestBody {\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    smsSigns: ").append(toIndentedString(smsSigns)).append("\n");
        sb.append("    resolvingTimes: ").append(toIndentedString(resolvingTimes)).append("\n");
        sb.append("    aimCodeType: ").append(toIndentedString(aimCodeType)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
