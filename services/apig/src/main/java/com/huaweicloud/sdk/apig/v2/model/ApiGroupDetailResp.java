package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** ApiGroupDetailResp */
public class ApiGroupDetailResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_domains")

    private List<UrlDomainsResp> urlDomains = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "call_limits")

    private Integer callLimits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_unit")

    private String timeUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "on_sell_status")

    private Integer onSellStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sl_domain")

    private String slDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sl_domains")

    private List<String> slDomains = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_interval")

    private Integer timeInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_time")

    private OffsetDateTime registerTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Integer isDefault;

    public ApiGroupDetailResp withUrlDomains(List<UrlDomainsResp> urlDomains) {
        this.urlDomains = urlDomains;
        return this;
    }

    public ApiGroupDetailResp addUrlDomainsItem(UrlDomainsResp urlDomainsItem) {
        if (this.urlDomains == null) {
            this.urlDomains = new ArrayList<>();
        }
        this.urlDomains.add(urlDomainsItem);
        return this;
    }

    public ApiGroupDetailResp withUrlDomains(Consumer<List<UrlDomainsResp>> urlDomainsSetter) {
        if (this.urlDomains == null) {
            this.urlDomains = new ArrayList<>();
        }
        urlDomainsSetter.accept(this.urlDomains);
        return this;
    }

    /** 分组上绑定的独立域名列表
     * 
     * @return urlDomains */
    public List<UrlDomainsResp> getUrlDomains() {
        return urlDomains;
    }

    public void setUrlDomains(List<UrlDomainsResp> urlDomains) {
        this.urlDomains = urlDomains;
    }

    public ApiGroupDetailResp withCallLimits(Integer callLimits) {
        this.callLimits = callLimits;
        return this;
    }

    /** 流控时长内分组下的API的总访问次数限制，默认不限，请根据服务的负载能力自行设置 暂不支持
     * 
     * @return callLimits */
    public Integer getCallLimits() {
        return callLimits;
    }

    public void setCallLimits(Integer callLimits) {
        this.callLimits = callLimits;
    }

    public ApiGroupDetailResp withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /** 最近修改时间
     * 
     * @return updateTime */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public ApiGroupDetailResp withName(String name) {
        this.name = name;
        return this;
    }

    /** API分组名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApiGroupDetailResp withTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /** 流控的时间单位 暂不支持
     * 
     * @return timeUnit */
    public String getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    public ApiGroupDetailResp withOnSellStatus(Integer onSellStatus) {
        this.onSellStatus = onSellStatus;
        return this;
    }

    /** 是否已上架云市场： - 1：已上架 - 2：未上架 - 3：审核中
     * 
     * @return onSellStatus */
    public Integer getOnSellStatus() {
        return onSellStatus;
    }

    public void setOnSellStatus(Integer onSellStatus) {
        this.onSellStatus = onSellStatus;
    }

    public ApiGroupDetailResp withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /** 描述
     * 
     * @return remark */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public ApiGroupDetailResp withSlDomain(String slDomain) {
        this.slDomain = slDomain;
        return this;
    }

    /** 系统默认分配的子域名
     * 
     * @return slDomain */
    public String getSlDomain() {
        return slDomain;
    }

    public void setSlDomain(String slDomain) {
        this.slDomain = slDomain;
    }

    public ApiGroupDetailResp withSlDomains(List<String> slDomains) {
        this.slDomains = slDomains;
        return this;
    }

    public ApiGroupDetailResp addSlDomainsItem(String slDomainsItem) {
        if (this.slDomains == null) {
            this.slDomains = new ArrayList<>();
        }
        this.slDomains.add(slDomainsItem);
        return this;
    }

    public ApiGroupDetailResp withSlDomains(Consumer<List<String>> slDomainsSetter) {
        if (this.slDomains == null) {
            this.slDomains = new ArrayList<>();
        }
        slDomainsSetter.accept(this.slDomains);
        return this;
    }

    /** 系统默认分配的子域名列表
     * 
     * @return slDomains */
    public List<String> getSlDomains() {
        return slDomains;
    }

    public void setSlDomains(List<String> slDomains) {
        this.slDomains = slDomains;
    }

    public ApiGroupDetailResp withId(String id) {
        this.id = id;
        return this;
    }

    /** 编号
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApiGroupDetailResp withTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    /** 流控时长 暂不支持
     * 
     * @return timeInterval */
    public Integer getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
    }

    public ApiGroupDetailResp withRegisterTime(OffsetDateTime registerTime) {
        this.registerTime = registerTime;
        return this;
    }

    /** 创建时间
     * 
     * @return registerTime */
    public OffsetDateTime getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(OffsetDateTime registerTime) {
        this.registerTime = registerTime;
    }

    public ApiGroupDetailResp withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 状态 - 1： 有效
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ApiGroupDetailResp withIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /** 是否为默认分组
     * 
     * @return isDefault */
    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiGroupDetailResp apiGroupDetailResp = (ApiGroupDetailResp) o;
        return Objects.equals(this.urlDomains, apiGroupDetailResp.urlDomains)
            && Objects.equals(this.callLimits, apiGroupDetailResp.callLimits)
            && Objects.equals(this.updateTime, apiGroupDetailResp.updateTime)
            && Objects.equals(this.name, apiGroupDetailResp.name)
            && Objects.equals(this.timeUnit, apiGroupDetailResp.timeUnit)
            && Objects.equals(this.onSellStatus, apiGroupDetailResp.onSellStatus)
            && Objects.equals(this.remark, apiGroupDetailResp.remark)
            && Objects.equals(this.slDomain, apiGroupDetailResp.slDomain)
            && Objects.equals(this.slDomains, apiGroupDetailResp.slDomains)
            && Objects.equals(this.id, apiGroupDetailResp.id)
            && Objects.equals(this.timeInterval, apiGroupDetailResp.timeInterval)
            && Objects.equals(this.registerTime, apiGroupDetailResp.registerTime)
            && Objects.equals(this.status, apiGroupDetailResp.status)
            && Objects.equals(this.isDefault, apiGroupDetailResp.isDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urlDomains,
            callLimits,
            updateTime,
            name,
            timeUnit,
            onSellStatus,
            remark,
            slDomain,
            slDomains,
            id,
            timeInterval,
            registerTime,
            status,
            isDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiGroupDetailResp {\n");
        sb.append("    urlDomains: ").append(toIndentedString(urlDomains)).append("\n");
        sb.append("    callLimits: ").append(toIndentedString(callLimits)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
        sb.append("    onSellStatus: ").append(toIndentedString(onSellStatus)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    slDomain: ").append(toIndentedString(slDomain)).append("\n");
        sb.append("    slDomains: ").append(toIndentedString(slDomains)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
        sb.append("    registerTime: ").append(toIndentedString(registerTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
