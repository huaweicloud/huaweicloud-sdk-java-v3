package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListResolverRuleParam
 */
public class ListResolverRuleParam {

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

    public ListResolverRuleParam withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 转发规则的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListResolverRuleParam withName(String name) {
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

    public ListResolverRuleParam withDomainName(String domainName) {
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

    public ListResolverRuleParam withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * 当前规则所属的终端节点ID。
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public ListResolverRuleParam withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 资源状态。 **取值范围：** - ACTIVE：正常 - PENDING_CREATE：创建中 - PENDING_DELETE：删除中 - ERROR：失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListResolverRuleParam withRuleType(String ruleType) {
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

    public ListResolverRuleParam withIpaddressCount(Integer ipaddressCount) {
        this.ipaddressCount = ipaddressCount;
        return this;
    }

    /**
     * 当前规则下的IP地址数量。
     * @return ipaddressCount
     */
    public Integer getIpaddressCount() {
        return ipaddressCount;
    }

    public void setIpaddressCount(Integer ipaddressCount) {
        this.ipaddressCount = ipaddressCount;
    }

    public ListResolverRuleParam withRouters(List<Router> routers) {
        this.routers = routers;
        return this;
    }

    public ListResolverRuleParam addRoutersItem(Router routersItem) {
        if (this.routers == null) {
            this.routers = new ArrayList<>();
        }
        this.routers.add(routersItem);
        return this;
    }

    public ListResolverRuleParam withRouters(Consumer<List<Router>> routersSetter) {
        if (this.routers == null) {
            this.routers = new ArrayList<>();
        }
        routersSetter.accept(this.routers);
        return this;
    }

    /**
     * 关联的VPC信息。
     * @return routers
     */
    public List<Router> getRouters() {
        return routers;
    }

    public void setRouters(List<Router> routers) {
        this.routers = routers;
    }

    public ListResolverRuleParam withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。 格式：yyyy-MM-dd'T'HH:mm:ss.SSS。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ListResolverRuleParam withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。 格式：yyyy-MM-dd'T'HH:mm:ss.SSS。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListResolverRuleParam that = (ListResolverRuleParam) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.domainName, that.domainName) && Objects.equals(this.endpointId, that.endpointId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.ruleType, that.ruleType)
            && Objects.equals(this.ipaddressCount, that.ipaddressCount) && Objects.equals(this.routers, that.routers)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, domainName, endpointId, status, ruleType, ipaddressCount, routers, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResolverRuleParam {\n");
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
