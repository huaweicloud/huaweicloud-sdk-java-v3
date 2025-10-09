package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class GetAccessPolicyResponse extends SdkResponse {

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
    @JsonProperty(value = "policyId")

    private String policyId;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTime")

    private OffsetDateTime updateTime;

    public GetAccessPolicyResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释：** API类型。 **约束限制：** 该值不可修改。 **取值范围：** 不涉及 **默认取值：** AccessPolicy
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public GetAccessPolicyResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释：** API版本。 **约束限制：** 该值不可修改。 **取值范围：** 不涉及 **默认取值：** v3
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public GetAccessPolicyResponse withName(String name) {
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

    public GetAccessPolicyResponse withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数解释：** 权限ID。 **约束限制：** 系统自动生成，该值不可修改。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public GetAccessPolicyResponse withClusters(List<String> clusters) {
        this.clusters = clusters;
        return this;
    }

    public GetAccessPolicyResponse addClustersItem(String clustersItem) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        this.clusters.add(clustersItem);
        return this;
    }

    public GetAccessPolicyResponse withClusters(Consumer<List<String>> clustersSetter) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        clustersSetter.accept(this.clusters);
        return this;
    }

    /**
     * **参数解释：** 集群ID的列表，允许使用通配符（“\\*”），表示所有集群。 **约束限制：** 当前最多支持同时授权200个集群。 **取值范围：** \\[\"\\*\"\\]或者集群ID列表。 **默认取值：** 不涉及
     * @return clusters
     */
    public List<String> getClusters() {
        return clusters;
    }

    public void setClusters(List<String> clusters) {
        this.clusters = clusters;
    }

    public GetAccessPolicyResponse withAccessScope(AccessScope accessScope) {
        this.accessScope = accessScope;
        return this;
    }

    public GetAccessPolicyResponse withAccessScope(Consumer<AccessScope> accessScopeSetter) {
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

    public GetAccessPolicyResponse withPolicyType(String policyType) {
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

    public GetAccessPolicyResponse withPrincipal(Principal principal) {
        this.principal = principal;
        return this;
    }

    public GetAccessPolicyResponse withPrincipal(Consumer<Principal> principalSetter) {
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

    public GetAccessPolicyResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public GetAccessPolicyResponse withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释：** 更新时间。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
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
        GetAccessPolicyResponse that = (GetAccessPolicyResponse) obj;
        return Objects.equals(this.kind, that.kind) && Objects.equals(this.apiVersion, that.apiVersion)
            && Objects.equals(this.name, that.name) && Objects.equals(this.policyId, that.policyId)
            && Objects.equals(this.clusters, that.clusters) && Objects.equals(this.accessScope, that.accessScope)
            && Objects.equals(this.policyType, that.policyType) && Objects.equals(this.principal, that.principal)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind,
            apiVersion,
            name,
            policyId,
            clusters,
            accessScope,
            policyType,
            principal,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAccessPolicyResponse {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
        sb.append("    accessScope: ").append(toIndentedString(accessScope)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
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
