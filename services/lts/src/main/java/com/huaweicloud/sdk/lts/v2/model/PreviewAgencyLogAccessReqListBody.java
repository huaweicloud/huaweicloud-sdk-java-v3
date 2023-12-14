package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PreviewAgencyLogAccessReqListBody
 */
public class PreviewAgencyLogAccessReqListBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preview_agency_list")

    private List<PreviewAgencyLogAccessReqBody> previewAgencyList = null;

    public PreviewAgencyLogAccessReqListBody withPreviewAgencyList(
        List<PreviewAgencyLogAccessReqBody> previewAgencyList) {
        this.previewAgencyList = previewAgencyList;
        return this;
    }

    public PreviewAgencyLogAccessReqListBody addPreviewAgencyListItem(
        PreviewAgencyLogAccessReqBody previewAgencyListItem) {
        if (this.previewAgencyList == null) {
            this.previewAgencyList = new ArrayList<>();
        }
        this.previewAgencyList.add(previewAgencyListItem);
        return this;
    }

    public PreviewAgencyLogAccessReqListBody withPreviewAgencyList(
        Consumer<List<PreviewAgencyLogAccessReqBody>> previewAgencyListSetter) {
        if (this.previewAgencyList == null) {
            this.previewAgencyList = new ArrayList<>();
        }
        previewAgencyListSetter.accept(this.previewAgencyList);
        return this;
    }

    /**
     * 预览代理列表
     * @return previewAgencyList
     */
    public List<PreviewAgencyLogAccessReqBody> getPreviewAgencyList() {
        return previewAgencyList;
    }

    public void setPreviewAgencyList(List<PreviewAgencyLogAccessReqBody> previewAgencyList) {
        this.previewAgencyList = previewAgencyList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreviewAgencyLogAccessReqListBody that = (PreviewAgencyLogAccessReqListBody) obj;
        return Objects.equals(this.previewAgencyList, that.previewAgencyList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(previewAgencyList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreviewAgencyLogAccessReqListBody {\n");
        sb.append("    previewAgencyList: ").append(toIndentedString(previewAgencyList)).append("\n");
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
