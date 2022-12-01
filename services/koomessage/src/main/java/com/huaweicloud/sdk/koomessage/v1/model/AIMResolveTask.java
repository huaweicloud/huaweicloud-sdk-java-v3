package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 生成发送任务短链配置信息
 */
public class AIMResolveTask {

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

    public AIMResolveTask withTplId(String tplId) {
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

    public AIMResolveTask withResolveTimes(Integer resolveTimes) {
        this.resolveTimes = resolveTimes;
        return this;
    }

    /**
     * 短链的最大解析次数。  > 个性化短链只支持最大解析数为1，设置其他值无效 
     * minimum: 1
     * maximum: 10000000
     * @return resolveTimes
     */
    public Integer getResolveTimes() {
        return resolveTimes;
    }

    public void setResolveTimes(Integer resolveTimes) {
        this.resolveTimes = resolveTimes;
    }

    public AIMResolveTask withAimCodeType(String aimCodeType) {
        this.aimCodeType = aimCodeType;
        return this;
    }

    /**
     * 智能信息编码类型。 - group：群发 - individual：个性化  > 智能信息编码类型选择群发时，所有发送使用同一个短链，无法获取到单个手机号码的解析情况。 
     * @return aimCodeType
     */
    public String getAimCodeType() {
        return aimCodeType;
    }

    public void setAimCodeType(String aimCodeType) {
        this.aimCodeType = aimCodeType;
    }

    public AIMResolveTask withGenerationType(String generationType) {
        this.generationType = generationType;
        return this;
    }

    /**
     * 生成短码方式。  - 1：标准 - 2：自定义  > 默认1，即标准生成短码。 
     * @return generationType
     */
    public String getGenerationType() {
        return generationType;
    }

    public void setGenerationType(String generationType) {
        this.generationType = generationType;
    }

    public AIMResolveTask withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 自定义短链域名，由大小写字母和数字组成的二级域名。   > 自定义短码即generation_type为2时，此参数为必填。域名需要提前报备，请联系KooMessage运营人员进行域名报备，域名区分生成短码方式，如报备的是标准生成短码方式，则在自定义生成短码时不能使用此域名。 
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public AIMResolveTask withExpirationTime(Integer expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * 失效时间（天）。aim_code_type为group时，取值范围为1~100；aim_code_type为individual个性化时，取值范围为1~7。  > 失效时间精确到秒，例如参数设置为1，创建时间为2022-07-22 21:10:12，过期时间为2022-07-23 21:10:12。 
     * @return expirationTime
     */
    public Integer getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Integer expirationTime) {
        this.expirationTime = expirationTime;
    }

    public AIMResolveTask withParams(List<CreateResolveTaskParam> params) {
        this.params = params;
        return this;
    }

    public AIMResolveTask addParamsItem(CreateResolveTaskParam paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public AIMResolveTask withParams(Consumer<List<CreateResolveTaskParam>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 短链解析详情列表。一次请求最多100个短链。  > OPPO模板一次最多申请10个短链。 
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
        AIMResolveTask aiMResolveTask = (AIMResolveTask) o;
        return Objects.equals(this.tplId, aiMResolveTask.tplId)
            && Objects.equals(this.resolveTimes, aiMResolveTask.resolveTimes)
            && Objects.equals(this.aimCodeType, aiMResolveTask.aimCodeType)
            && Objects.equals(this.generationType, aiMResolveTask.generationType)
            && Objects.equals(this.domain, aiMResolveTask.domain)
            && Objects.equals(this.expirationTime, aiMResolveTask.expirationTime)
            && Objects.equals(this.params, aiMResolveTask.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tplId, resolveTimes, aimCodeType, generationType, domain, expirationTime, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AIMResolveTask {\n");
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
