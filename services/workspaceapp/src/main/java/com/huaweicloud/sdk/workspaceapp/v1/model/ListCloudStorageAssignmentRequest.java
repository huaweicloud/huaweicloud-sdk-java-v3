package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListCloudStorageAssignmentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_id")

    private String storageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "claim_mode")

    private String claimMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach")

    private String attach;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_names")

    private List<String> attachNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity_filter")

    private String capacityFilter;

    public ListCloudStorageAssignmentRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询的偏移量。
     * minimum: 0
     * maximum: 2147483646
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListCloudStorageAssignmentRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 单次查询的大小[1-100]。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListCloudStorageAssignmentRequest withStorageId(String storageId) {
        this.storageId = storageId;
        return this;
    }

    /**
     * WKS存储ID。
     * @return storageId
     */
    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId;
    }

    public ListCloudStorageAssignmentRequest withClaimMode(String claimMode) {
        this.claimMode = claimMode;
        return this;
    }

    /**
     * 存储声明的类型,目前只支持USER,后面可以拓展。 * `USER` -  个人文件夹 * `SHARE` -  共享文件夹
     * @return claimMode
     */
    public String getClaimMode() {
        return claimMode;
    }

    public void setClaimMode(String claimMode) {
        this.claimMode = claimMode;
    }

    public ListCloudStorageAssignmentRequest withAttach(String attach) {
        this.attach = attach;
        return this;
    }

    /**
     * 被分配的个体或组的名称，当传attach_names时，本字段不生效。
     * @return attach
     */
    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public ListCloudStorageAssignmentRequest withAttachNames(List<String> attachNames) {
        this.attachNames = attachNames;
        return this;
    }

    public ListCloudStorageAssignmentRequest addAttachNamesItem(String attachNamesItem) {
        if (this.attachNames == null) {
            this.attachNames = new ArrayList<>();
        }
        this.attachNames.add(attachNamesItem);
        return this;
    }

    public ListCloudStorageAssignmentRequest withAttachNames(Consumer<List<String>> attachNamesSetter) {
        if (this.attachNames == null) {
            this.attachNames = new ArrayList<>();
        }
        attachNamesSetter.accept(this.attachNames);
        return this;
    }

    /**
     * 被分配的个体或组的名称。
     * @return attachNames
     */
    public List<String> getAttachNames() {
        return attachNames;
    }

    public void setAttachNames(List<String> attachNames) {
        this.attachNames = attachNames;
    }

    public ListCloudStorageAssignmentRequest withCapacityFilter(String capacityFilter) {
        this.capacityFilter = capacityFilter;
        return this;
    }

    /**
     * 是否查询容量过滤： - true : 是。 - false: 否。
     * @return capacityFilter
     */
    public String getCapacityFilter() {
        return capacityFilter;
    }

    public void setCapacityFilter(String capacityFilter) {
        this.capacityFilter = capacityFilter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCloudStorageAssignmentRequest that = (ListCloudStorageAssignmentRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.storageId, that.storageId) && Objects.equals(this.claimMode, that.claimMode)
            && Objects.equals(this.attach, that.attach) && Objects.equals(this.attachNames, that.attachNames)
            && Objects.equals(this.capacityFilter, that.capacityFilter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, storageId, claimMode, attach, attachNames, capacityFilter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloudStorageAssignmentRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    storageId: ").append(toIndentedString(storageId)).append("\n");
        sb.append("    claimMode: ").append(toIndentedString(claimMode)).append("\n");
        sb.append("    attach: ").append(toIndentedString(attach)).append("\n");
        sb.append("    attachNames: ").append(toIndentedString(attachNames)).append("\n");
        sb.append("    capacityFilter: ").append(toIndentedString(capacityFilter)).append("\n");
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
