package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 生成短链响应实体类。
 */
public class ListResolveTaskResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

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
    @JsonProperty(value = "resolved_times")

    private Integer resolvedTimes;

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

    private List<ListResolveTaskResultParam> params = null;

    public ListResolveTaskResult withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ListResolveTaskResult withTplId(String tplId) {
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

    public ListResolveTaskResult withSmsSigns(List<String> smsSigns) {
        this.smsSigns = smsSigns;
        return this;
    }

    public ListResolveTaskResult addSmsSignsItem(String smsSignsItem) {
        if (this.smsSigns == null) {
            this.smsSigns = new ArrayList<>();
        }
        this.smsSigns.add(smsSignsItem);
        return this;
    }

    public ListResolveTaskResult withSmsSigns(Consumer<List<String>> smsSignsSetter) {
        if (this.smsSigns == null) {
            this.smsSigns = new ArrayList<>();
        }
        smsSignsSetter.accept(this.smsSigns);
        return this;
    }

    /**
     * 短信签名列表。
     * @return smsSigns
     */
    public List<String> getSmsSigns() {
        return smsSigns;
    }

    public void setSmsSigns(List<String> smsSigns) {
        this.smsSigns = smsSigns;
    }

    public ListResolveTaskResult withResolvingTimes(Integer resolvingTimes) {
        this.resolvingTimes = resolvingTimes;
        return this;
    }

    /**
     * 用户创建时提交的最大解析次数。
     * @return resolvingTimes
     */
    public Integer getResolvingTimes() {
        return resolvingTimes;
    }

    public void setResolvingTimes(Integer resolvingTimes) {
        this.resolvingTimes = resolvingTimes;
    }

    public ListResolveTaskResult withResolvedTimes(Integer resolvedTimes) {
        this.resolvedTimes = resolvedTimes;
        return this;
    }

    /**
     * 实际已解析数量统计。 
     * @return resolvedTimes
     */
    public Integer getResolvedTimes() {
        return resolvedTimes;
    }

    public void setResolvedTimes(Integer resolvedTimes) {
        this.resolvedTimes = resolvedTimes;
    }

    public ListResolveTaskResult withAimCodeType(String aimCodeType) {
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

    public ListResolveTaskResult withDomain(String domain) {
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

    public ListResolveTaskResult withExpirationTime(Integer expirationTime) {
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

    public ListResolveTaskResult withParams(List<ListResolveTaskResultParam> params) {
        this.params = params;
        return this;
    }

    public ListResolveTaskResult addParamsItem(ListResolveTaskResultParam paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public ListResolveTaskResult withParams(Consumer<List<ListResolveTaskResultParam>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 短链列表。该列表中只会有一条短链记录，如果一个任务中生成多个短链，则需要客户端基于任务ID（task_id）自己去合并。  > 建议使用查询解析明细接口查询此字段信息，未来版本有计划移除该字段。 
     * @return params
     */
    public List<ListResolveTaskResultParam> getParams() {
        return params;
    }

    public void setParams(List<ListResolveTaskResultParam> params) {
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
        ListResolveTaskResult that = (ListResolveTaskResult) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.tplId, that.tplId)
            && Objects.equals(this.smsSigns, that.smsSigns) && Objects.equals(this.resolvingTimes, that.resolvingTimes)
            && Objects.equals(this.resolvedTimes, that.resolvedTimes)
            && Objects.equals(this.aimCodeType, that.aimCodeType) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.expirationTime, that.expirationTime) && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(taskId, tplId, smsSigns, resolvingTimes, resolvedTimes, aimCodeType, domain, expirationTime, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResolveTaskResult {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    smsSigns: ").append(toIndentedString(smsSigns)).append("\n");
        sb.append("    resolvingTimes: ").append(toIndentedString(resolvingTimes)).append("\n");
        sb.append("    resolvedTimes: ").append(toIndentedString(resolvedTimes)).append("\n");
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
