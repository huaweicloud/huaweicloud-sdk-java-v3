package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AclApiBindingCreate
 */
public class AclApiBindingCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_id")

    private String aclId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_ids")

    private List<String> publishIds = null;

    public AclApiBindingCreate withAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }

    /**
     * ACL策略编号
     * @return aclId
     */
    public String getAclId() {
        return aclId;
    }

    public void setAclId(String aclId) {
        this.aclId = aclId;
    }

    public AclApiBindingCreate withPublishIds(List<String> publishIds) {
        this.publishIds = publishIds;
        return this;
    }

    public AclApiBindingCreate addPublishIdsItem(String publishIdsItem) {
        if (this.publishIds == null) {
            this.publishIds = new ArrayList<>();
        }
        this.publishIds.add(publishIdsItem);
        return this;
    }

    public AclApiBindingCreate withPublishIds(Consumer<List<String>> publishIdsSetter) {
        if (this.publishIds == null) {
            this.publishIds = new ArrayList<>();
        }
        publishIdsSetter.accept(this.publishIds);
        return this;
    }

    /**
     * API发布记录编号
     * @return publishIds
     */
    public List<String> getPublishIds() {
        return publishIds;
    }

    public void setPublishIds(List<String> publishIds) {
        this.publishIds = publishIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AclApiBindingCreate that = (AclApiBindingCreate) obj;
        return Objects.equals(this.aclId, that.aclId) && Objects.equals(this.publishIds, that.publishIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aclId, publishIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AclApiBindingCreate {\n");
        sb.append("    aclId: ").append(toIndentedString(aclId)).append("\n");
        sb.append("    publishIds: ").append(toIndentedString(publishIds)).append("\n");
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
