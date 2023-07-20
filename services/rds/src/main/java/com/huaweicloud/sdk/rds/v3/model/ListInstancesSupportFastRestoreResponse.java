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
public class ListInstancesSupportFastRestoreResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_fast_restore_list")

    private List<SupportFastRestoreList> supportFastRestoreList = null;

    public ListInstancesSupportFastRestoreResponse withSupportFastRestoreList(
        List<SupportFastRestoreList> supportFastRestoreList) {
        this.supportFastRestoreList = supportFastRestoreList;
        return this;
    }

    public ListInstancesSupportFastRestoreResponse addSupportFastRestoreListItem(
        SupportFastRestoreList supportFastRestoreListItem) {
        if (this.supportFastRestoreList == null) {
            this.supportFastRestoreList = new ArrayList<>();
        }
        this.supportFastRestoreList.add(supportFastRestoreListItem);
        return this;
    }

    public ListInstancesSupportFastRestoreResponse withSupportFastRestoreList(
        Consumer<List<SupportFastRestoreList>> supportFastRestoreListSetter) {
        if (this.supportFastRestoreList == null) {
            this.supportFastRestoreList = new ArrayList<>();
        }
        supportFastRestoreListSetter.accept(this.supportFastRestoreList);
        return this;
    }

    /**
     * 实例的极速恢复支持情况。
     * @return supportFastRestoreList
     */
    public List<SupportFastRestoreList> getSupportFastRestoreList() {
        return supportFastRestoreList;
    }

    public void setSupportFastRestoreList(List<SupportFastRestoreList> supportFastRestoreList) {
        this.supportFastRestoreList = supportFastRestoreList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancesSupportFastRestoreResponse that = (ListInstancesSupportFastRestoreResponse) obj;
        return Objects.equals(this.supportFastRestoreList, that.supportFastRestoreList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportFastRestoreList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesSupportFastRestoreResponse {\n");
        sb.append("    supportFastRestoreList: ").append(toIndentedString(supportFastRestoreList)).append("\n");
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
