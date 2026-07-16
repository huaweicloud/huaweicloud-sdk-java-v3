package com.huaweicloud.sdk.cce.v3.model;

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
public class UpdatePodIdentityAssociationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterId")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serviceAccount")

    private String serviceAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agencyName")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createdAt")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifiedAt")

    private String modifiedAt;

    public UpdatePodIdentityAssociationResponse withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * **参数解释：** pod-identity关联的uid。 **约束限制：** 该值不可修改 **取值范围：** 不涉及 **默认取值：** 无
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public UpdatePodIdentityAssociationResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释：** pod-identity关联所属的集群id。 **约束限制：** 该值不可修改 **取值范围：** 不涉及 **默认取值：** 无
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public UpdatePodIdentityAssociationResponse withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释：** pod-identity关联所要绑定的serviceaccount所属的命名空间。 **约束限制：** 该值不可修改 **取值范围：** 不涉及 **默认取值：** 无
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public UpdatePodIdentityAssociationResponse withServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
        return this;
    }

    /**
     * **参数解释：** pod-identity关联所要绑定的serviceaccount名称。 **约束限制：** 该值不可修改 **取值范围：** 不涉及 **默认取值：** 无
     * @return serviceAccount
     */
    public String getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    public UpdatePodIdentityAssociationResponse withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * **参数解释：** pod-identity关联所要绑定的委托名称。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 无
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public UpdatePodIdentityAssociationResponse withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public UpdatePodIdentityAssociationResponse addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdatePodIdentityAssociationResponse withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** pod-identity关联的资源标签列表。 **约束限制：** 不涉及 
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public UpdatePodIdentityAssociationResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** pod-identity关联创建时间。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 无
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public UpdatePodIdentityAssociationResponse withModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }

    /**
     * **参数解释：** pod-identity关联最近一次更新时间。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 无
     * @return modifiedAt
     */
    public String getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePodIdentityAssociationResponse that = (UpdatePodIdentityAssociationResponse) obj;
        return Objects.equals(this.uid, that.uid) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.serviceAccount, that.serviceAccount)
            && Objects.equals(this.agencyName, that.agencyName) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.modifiedAt, that.modifiedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, clusterId, namespace, serviceAccount, agencyName, tags, createdAt, modifiedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePodIdentityAssociationResponse {\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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
