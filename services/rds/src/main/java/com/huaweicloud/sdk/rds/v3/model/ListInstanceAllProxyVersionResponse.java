package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListInstanceAllProxyVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_engine_version_infos")

    private List<ProxyEngineVersionInfo> proxyEngineVersionInfos = null;

    public ListInstanceAllProxyVersionResponse withProxyEngineVersionInfos(
        List<ProxyEngineVersionInfo> proxyEngineVersionInfos) {
        this.proxyEngineVersionInfos = proxyEngineVersionInfos;
        return this;
    }

    public ListInstanceAllProxyVersionResponse addProxyEngineVersionInfosItem(
        ProxyEngineVersionInfo proxyEngineVersionInfosItem) {
        if (this.proxyEngineVersionInfos == null) {
            this.proxyEngineVersionInfos = new ArrayList<>();
        }
        this.proxyEngineVersionInfos.add(proxyEngineVersionInfosItem);
        return this;
    }

    public ListInstanceAllProxyVersionResponse withProxyEngineVersionInfos(
        Consumer<List<ProxyEngineVersionInfo>> proxyEngineVersionInfosSetter) {
        if (this.proxyEngineVersionInfos == null) {
            this.proxyEngineVersionInfos = new ArrayList<>();
        }
        proxyEngineVersionInfosSetter.accept(this.proxyEngineVersionInfos);
        return this;
    }

    /**
     * **参数解释**：  数据库代理节点引擎版本信息列表。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return proxyEngineVersionInfos
     */
    public List<ProxyEngineVersionInfo> getProxyEngineVersionInfos() {
        return proxyEngineVersionInfos;
    }

    public void setProxyEngineVersionInfos(List<ProxyEngineVersionInfo> proxyEngineVersionInfos) {
        this.proxyEngineVersionInfos = proxyEngineVersionInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceAllProxyVersionResponse that = (ListInstanceAllProxyVersionResponse) obj;
        return Objects.equals(this.proxyEngineVersionInfos, that.proxyEngineVersionInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proxyEngineVersionInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceAllProxyVersionResponse {\n");
        sb.append("    proxyEngineVersionInfos: ").append(toIndentedString(proxyEngineVersionInfos)).append("\n");
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
