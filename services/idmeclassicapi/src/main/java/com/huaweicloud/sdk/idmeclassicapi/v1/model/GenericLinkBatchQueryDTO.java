package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * GenericLinkBatchQueryDTO
 */
public class GenericLinkBatchQueryDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latestOnly")

    private Boolean latestOnly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "objectIds")

    private List<String> objectIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    public GenericLinkBatchQueryDTO withLatestOnly(Boolean latestOnly) {
        this.latestOnly = latestOnly;
        return this;
    }

    /**
     * 是否返回源模型数据实例关联的最新版本目标模型数据实例。此参数仅对源/目标模型为M-V模型实体有效。 - true：返回源模型数据实例关联的最新版本的目标模型数据实例。 - false：返回源模型数据实例关联的所有版本的目标模型数据实例。默认为false。
     * @return latestOnly
     */
    public Boolean getLatestOnly() {
        return latestOnly;
    }

    public void setLatestOnly(Boolean latestOnly) {
        this.latestOnly = latestOnly;
    }

    public GenericLinkBatchQueryDTO withObjectIds(List<String> objectIds) {
        this.objectIds = objectIds;
        return this;
    }

    public GenericLinkBatchQueryDTO addObjectIdsItem(String objectIdsItem) {
        if (this.objectIds == null) {
            this.objectIds = new ArrayList<>();
        }
        this.objectIds.add(objectIdsItem);
        return this;
    }

    public GenericLinkBatchQueryDTO withObjectIds(Consumer<List<String>> objectIdsSetter) {
        if (this.objectIds == null) {
            this.objectIds = new ArrayList<>();
        }
        objectIdsSetter.accept(this.objectIds);
        return this;
    }

    /**
     * 角色对应的数据实例ID列表。
     * @return objectIds
     */
    public List<String> getObjectIds() {
        return objectIds;
    }

    public void setObjectIds(List<String> objectIds) {
        this.objectIds = objectIds;
    }

    public GenericLinkBatchQueryDTO withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 角色。 - TARGET：目标模型。 - SOURCE：源模型。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GenericLinkBatchQueryDTO that = (GenericLinkBatchQueryDTO) obj;
        return Objects.equals(this.latestOnly, that.latestOnly) && Objects.equals(this.objectIds, that.objectIds)
            && Objects.equals(this.role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latestOnly, objectIds, role);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenericLinkBatchQueryDTO {\n");
        sb.append("    latestOnly: ").append(toIndentedString(latestOnly)).append("\n");
        sb.append("    objectIds: ").append(toIndentedString(objectIds)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
