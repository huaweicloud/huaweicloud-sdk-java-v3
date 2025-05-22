package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateFactoryPendingItemsPackageBody
 */
public class CreateFactoryPendingItemsPackageBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_user_id")

    private String applyUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_name")

    private String packageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pending_item_list")

    private List<String> pendingItemList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver_ids")

    private List<String> approverIds = null;

    public CreateFactoryPendingItemsPackageBody withApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId;
        return this;
    }

    /**
     * 发包人id，可从 查询待发布包列表接口 获取。
     * @return applyUserId
     */
    public String getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId;
    }

    public CreateFactoryPendingItemsPackageBody withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * 发布包名称
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public CreateFactoryPendingItemsPackageBody withPendingItemList(List<String> pendingItemList) {
        this.pendingItemList = pendingItemList;
        return this;
    }

    public CreateFactoryPendingItemsPackageBody addPendingItemListItem(String pendingItemListItem) {
        if (this.pendingItemList == null) {
            this.pendingItemList = new ArrayList<>();
        }
        this.pendingItemList.add(pendingItemListItem);
        return this;
    }

    public CreateFactoryPendingItemsPackageBody withPendingItemList(Consumer<List<String>> pendingItemListSetter) {
        if (this.pendingItemList == null) {
            this.pendingItemList = new ArrayList<>();
        }
        pendingItemListSetter.accept(this.pendingItemList);
        return this;
    }

    /**
     * 待发布包id，可从 查询待发布包列表接口 获取。
     * @return pendingItemList
     */
    public List<String> getPendingItemList() {
        return pendingItemList;
    }

    public void setPendingItemList(List<String> pendingItemList) {
        this.pendingItemList = pendingItemList;
    }

    public CreateFactoryPendingItemsPackageBody withApproverIds(List<String> approverIds) {
        this.approverIds = approverIds;
        return this;
    }

    public CreateFactoryPendingItemsPackageBody addApproverIdsItem(String approverIdsItem) {
        if (this.approverIds == null) {
            this.approverIds = new ArrayList<>();
        }
        this.approverIds.add(approverIdsItem);
        return this;
    }

    public CreateFactoryPendingItemsPackageBody withApproverIds(Consumer<List<String>> approverIdsSetter) {
        if (this.approverIds == null) {
            this.approverIds = new ArrayList<>();
        }
        approverIdsSetter.accept(this.approverIds);
        return this;
    }

    /**
     * 审批人id，可通过管理中心-> 查询空间用户信息 接口 获取，且具有管理员或者部署者权限。
     * @return approverIds
     */
    public List<String> getApproverIds() {
        return approverIds;
    }

    public void setApproverIds(List<String> approverIds) {
        this.approverIds = approverIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFactoryPendingItemsPackageBody that = (CreateFactoryPendingItemsPackageBody) obj;
        return Objects.equals(this.applyUserId, that.applyUserId) && Objects.equals(this.packageName, that.packageName)
            && Objects.equals(this.pendingItemList, that.pendingItemList)
            && Objects.equals(this.approverIds, that.approverIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applyUserId, packageName, pendingItemList, approverIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFactoryPendingItemsPackageBody {\n");
        sb.append("    applyUserId: ").append(toIndentedString(applyUserId)).append("\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    pendingItemList: ").append(toIndentedString(pendingItemList)).append("\n");
        sb.append("    approverIds: ").append(toIndentedString(approverIds)).append("\n");
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
