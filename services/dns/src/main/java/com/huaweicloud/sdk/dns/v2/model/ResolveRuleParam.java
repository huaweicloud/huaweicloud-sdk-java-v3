package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResolveRuleParam
 */
public class ResolveRuleParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    private String ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipaddress_count")

    private Integer ipaddressCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routers")

    private List<Router> routers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public ResolveRuleParam withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * endpoint的ID，uuid形式的一个资源标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ResolveRuleParam withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResolveRuleParam withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ResolveRuleParam withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * 当前规则所属的endpoint_id。
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public ResolveRuleParam withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 资源状态。 取值范围：PENDING_CREATE, ACTIVE, PENDING_DELETE, ERROR。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ResolveRuleParam withRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * 规则类型。 预留字段，当前默认为FORWARD。
     * @return ruleType
     */
    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public ResolveRuleParam withIpaddressCount(Integer ipaddressCount) {
        this.ipaddressCount = ipaddressCount;
        return this;
    }

    /**
     * 当前规则下的ip地址数量。
     * @return ipaddressCount
     */
    public Integer getIpaddressCount() {
        return ipaddressCount;
    }

    public void setIpaddressCount(Integer ipaddressCount) {
        this.ipaddressCount = ipaddressCount;
    }

    public ResolveRuleParam withRouters(List<Router> routers) {
        this.routers = routers;
        return this;
    }

    public ResolveRuleParam addRoutersItem(Router routersItem) {
        if (this.routers == null) {
            this.routers = new ArrayList<>();
        }
        this.routers.add(routersItem);
        return this;
    }

    public ResolveRuleParam withRouters(Consumer<List<Router>> routersSetter) {
        if (this.routers == null) {
            this.routers = new ArrayList<>();
        }
        routersSetter.accept(this.routers);
        return this;
    }

    /**
     * 规则关联的vpc信息。
     * @return routers
     */
    public List<Router> getRouters() {
        return routers;
    }

    public void setRouters(List<Router> routers) {
        this.routers = routers;
    }

    public ResolveRuleParam withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ResolveRuleParam withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResolveRuleParam resolveRuleParam = (ResolveRuleParam) o;
        return Objects.equals(this.id, resolveRuleParam.id) && Objects.equals(this.name, resolveRuleParam.name)
            && Objects.equals(this.domainName, resolveRuleParam.domainName)
            && Objects.equals(this.endpointId, resolveRuleParam.endpointId)
            && Objects.equals(this.status, resolveRuleParam.status)
            && Objects.equals(this.ruleType, resolveRuleParam.ruleType)
            && Objects.equals(this.ipaddressCount, resolveRuleParam.ipaddressCount)
            && Objects.equals(this.routers, resolveRuleParam.routers)
            && Objects.equals(this.createTime, resolveRuleParam.createTime)
            && Objects.equals(this.updateTime, resolveRuleParam.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, domainName, endpointId, status, ruleType, ipaddressCount, routers, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResolveRuleParam {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    ipaddressCount: ").append(toIndentedString(ipaddressCount)).append("\n");
        sb.append("    routers: ").append(toIndentedString(routers)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
