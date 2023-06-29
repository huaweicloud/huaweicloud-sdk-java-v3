package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 短链配置
 */
public class AIMResolveTaskRequestMode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_id")

    private String tplId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolve_times")

    private Integer resolveTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aim_code_type")

    private String aimCodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "generation_type")

    private String generationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_time")

    private Integer expirationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<CreateResolveTaskParam> params = null;

    public AIMResolveTaskRequestMode withTplId(String tplId) {
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

    public AIMResolveTaskRequestMode withResolveTimes(Integer resolveTimes) {
        this.resolveTimes = resolveTimes;
        return this;
    }

    /**
     * 短链的最大解析次数。 
     * @return resolveTimes
     */
    public Integer getResolveTimes() {
        return resolveTimes;
    }

    public void setResolveTimes(Integer resolveTimes) {
        this.resolveTimes = resolveTimes;
    }

    public AIMResolveTaskRequestMode withAimCodeType(String aimCodeType) {
        this.aimCodeType = aimCodeType;
        return this;
    }

    /**
     * 智能信息编码类型。 - group：群发 - individual：个性化 
     * @return aimCodeType
     */
    public String getAimCodeType() {
        return aimCodeType;
    }

    public void setAimCodeType(String aimCodeType) {
        this.aimCodeType = aimCodeType;
    }

    public AIMResolveTaskRequestMode withGenerationType(String generationType) {
        this.generationType = generationType;
        return this;
    }

    /**
     * 生成短码方式。  - 1：标准 - 2：自定义 
     * @return generationType
     */
    public String getGenerationType() {
        return generationType;
    }

    public void setGenerationType(String generationType) {
        this.generationType = generationType;
    }

    public AIMResolveTaskRequestMode withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 自定义短链域名，由大小写字母和数字组成的二级域名。  > 当生成类型为自定义生成短码时必填 
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public AIMResolveTaskRequestMode withExpirationTime(Integer expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * 失效时间（天）。
     * @return expirationTime
     */
    public Integer getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Integer expirationTime) {
        this.expirationTime = expirationTime;
    }

    public AIMResolveTaskRequestMode withParams(List<CreateResolveTaskParam> params) {
        this.params = params;
        return this;
    }

    public AIMResolveTaskRequestMode addParamsItem(CreateResolveTaskParam paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public AIMResolveTaskRequestMode withParams(Consumer<List<CreateResolveTaskParam>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 短链解析详情列表。一次请求最多100个短链。
     * @return params
     */
    public List<CreateResolveTaskParam> getParams() {
        return params;
    }

    public void setParams(List<CreateResolveTaskParam> params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AIMResolveTaskRequestMode that = (AIMResolveTaskRequestMode) obj;
        return Objects.equals(this.tplId, that.tplId) && Objects.equals(this.resolveTimes, that.resolveTimes)
            && Objects.equals(this.aimCodeType, that.aimCodeType)
            && Objects.equals(this.generationType, that.generationType) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.expirationTime, that.expirationTime) && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tplId, resolveTimes, aimCodeType, generationType, domain, expirationTime, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AIMResolveTaskRequestMode {\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    resolveTimes: ").append(toIndentedString(resolveTimes)).append("\n");
        sb.append("    aimCodeType: ").append(toIndentedString(aimCodeType)).append("\n");
        sb.append("    generationType: ").append(toIndentedString(generationType)).append("\n");
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
