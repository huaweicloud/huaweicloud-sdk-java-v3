package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AccessPolicy
 */
public class AccessPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusters")

    private List<String> clusters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessScope")

    private AccessScope accessScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyType")

    private String policyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal")

    private Principal principal;

    public AccessPolicy withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释：** API类型。 **约束限制：** 该值不可修改 **取值范围：** 不涉及 **默认取值：** AccessPolicy
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public AccessPolicy withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释：** API版本。 **约束限制：** 该值不可修改 **取值范围：** 不涉及 **默认取值：** v3
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public AccessPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 访问策略名称。 **约束限制：** 以小写字母开头，由小写字母、数字、中划线(-)、点(.)组成，长度范围1-56位，且不能以中划线(-)结尾。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccessPolicy withClusters(List<String> clusters) {
        this.clusters = clusters;
        return this;
    }

    public AccessPolicy addClustersItem(String clustersItem) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        this.clusters.add(clustersItem);
        return this;
    }

    public AccessPolicy withClusters(Consumer<List<String>> clustersSetter) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        clustersSetter.accept(this.clusters);
        return this;
    }

    /**
     * **参数解释：** 集群ID的列表，允许使用通配符（“\\*”），表示所有集群。获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。 **约束限制：** 当前最多支持同时授权200个集群。 **取值范围：** \\[\"\\*\"\\]或者集群ID列表。 **默认取值：** 不涉及
     * @return clusters
     */
    public List<String> getClusters() {
        return clusters;
    }

    public void setClusters(List<String> clusters) {
        this.clusters = clusters;
    }

    public AccessPolicy withAccessScope(AccessScope accessScope) {
        this.accessScope = accessScope;
        return this;
    }

    public AccessPolicy withAccessScope(Consumer<AccessScope> accessScopeSetter) {
        if (this.accessScope == null) {
            this.accessScope = new AccessScope();
            accessScopeSetter.accept(this.accessScope);
        }

        return this;
    }

    /**
     * Get accessScope
     * @return accessScope
     */
    public AccessScope getAccessScope() {
        return accessScope;
    }

    public void setAccessScope(AccessScope accessScope) {
        this.accessScope = accessScope;
    }

    public AccessPolicy withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * **参数解释：** 权限类型。 **约束限制：** 不涉及 **取值范围：** - CCEAdminPolicy：管理员权限 - CCEClusterAdminPolicy：运维权限 - CCEEditPolicy：开发权限 - CCEViewPolicy：只读权限  **默认取值：** 不涉及
     * @return policyType
     */
    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public AccessPolicy withPrincipal(Principal principal) {
        this.principal = principal;
        return this;
    }

    public AccessPolicy withPrincipal(Consumer<Principal> principalSetter) {
        if (this.principal == null) {
            this.principal = new Principal();
            principalSetter.accept(this.principal);
        }

        return this;
    }

    /**
     * Get principal
     * @return principal
     */
    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessPolicy that = (AccessPolicy) obj;
        return Objects.equals(this.kind, that.kind) && Objects.equals(this.apiVersion, that.apiVersion)
            && Objects.equals(this.name, that.name) && Objects.equals(this.clusters, that.clusters)
            && Objects.equals(this.accessScope, that.accessScope) && Objects.equals(this.policyType, that.policyType)
            && Objects.equals(this.principal, that.principal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, name, clusters, accessScope, policyType, principal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessPolicy {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
        sb.append("    accessScope: ").append(toIndentedString(accessScope)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
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
