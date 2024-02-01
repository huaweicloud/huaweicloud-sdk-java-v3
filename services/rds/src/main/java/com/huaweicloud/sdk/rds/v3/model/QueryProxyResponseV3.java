package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询数据库代理详情信息返回体。
 */
public class QueryProxyResponseV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy")

    private ProxyInfo proxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_instance")

    private InstanceInfo masterInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readonly_instances")

    private List<InstanceInfo> readonlyInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_security_group_check_result")

    private Boolean proxySecurityGroupCheckResult;

    public QueryProxyResponseV3 withProxy(ProxyInfo proxy) {
        this.proxy = proxy;
        return this;
    }

    public QueryProxyResponseV3 withProxy(Consumer<ProxyInfo> proxySetter) {
        if (this.proxy == null) {
            this.proxy = new ProxyInfo();
            proxySetter.accept(this.proxy);
        }

        return this;
    }

    /**
     * Get proxy
     * @return proxy
     */
    public ProxyInfo getProxy() {
        return proxy;
    }

    public void setProxy(ProxyInfo proxy) {
        this.proxy = proxy;
    }

    public QueryProxyResponseV3 withMasterInstance(InstanceInfo masterInstance) {
        this.masterInstance = masterInstance;
        return this;
    }

    public QueryProxyResponseV3 withMasterInstance(Consumer<InstanceInfo> masterInstanceSetter) {
        if (this.masterInstance == null) {
            this.masterInstance = new InstanceInfo();
            masterInstanceSetter.accept(this.masterInstance);
        }

        return this;
    }

    /**
     * Get masterInstance
     * @return masterInstance
     */
    public InstanceInfo getMasterInstance() {
        return masterInstance;
    }

    public void setMasterInstance(InstanceInfo masterInstance) {
        this.masterInstance = masterInstance;
    }

    public QueryProxyResponseV3 withReadonlyInstances(List<InstanceInfo> readonlyInstances) {
        this.readonlyInstances = readonlyInstances;
        return this;
    }

    public QueryProxyResponseV3 addReadonlyInstancesItem(InstanceInfo readonlyInstancesItem) {
        if (this.readonlyInstances == null) {
            this.readonlyInstances = new ArrayList<>();
        }
        this.readonlyInstances.add(readonlyInstancesItem);
        return this;
    }

    public QueryProxyResponseV3 withReadonlyInstances(Consumer<List<InstanceInfo>> readonlyInstancesSetter) {
        if (this.readonlyInstances == null) {
            this.readonlyInstances = new ArrayList<>();
        }
        readonlyInstancesSetter.accept(this.readonlyInstances);
        return this;
    }

    /**
     * 数据库只读实例信息。
     * @return readonlyInstances
     */
    public List<InstanceInfo> getReadonlyInstances() {
        return readonlyInstances;
    }

    public void setReadonlyInstances(List<InstanceInfo> readonlyInstances) {
        this.readonlyInstances = readonlyInstances;
    }

    public QueryProxyResponseV3 withProxySecurityGroupCheckResult(Boolean proxySecurityGroupCheckResult) {
        this.proxySecurityGroupCheckResult = proxySecurityGroupCheckResult;
        return this;
    }

    /**
     * 安全组是否放通该数据库代理到数据库的网络地址。
     * @return proxySecurityGroupCheckResult
     */
    public Boolean getProxySecurityGroupCheckResult() {
        return proxySecurityGroupCheckResult;
    }

    public void setProxySecurityGroupCheckResult(Boolean proxySecurityGroupCheckResult) {
        this.proxySecurityGroupCheckResult = proxySecurityGroupCheckResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryProxyResponseV3 that = (QueryProxyResponseV3) obj;
        return Objects.equals(this.proxy, that.proxy) && Objects.equals(this.masterInstance, that.masterInstance)
            && Objects.equals(this.readonlyInstances, that.readonlyInstances)
            && Objects.equals(this.proxySecurityGroupCheckResult, that.proxySecurityGroupCheckResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proxy, masterInstance, readonlyInstances, proxySecurityGroupCheckResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryProxyResponseV3 {\n");
        sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
        sb.append("    masterInstance: ").append(toIndentedString(masterInstance)).append("\n");
        sb.append("    readonlyInstances: ").append(toIndentedString(readonlyInstances)).append("\n");
        sb.append("    proxySecurityGroupCheckResult: ")
            .append(toIndentedString(proxySecurityGroupCheckResult))
            .append("\n");
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
