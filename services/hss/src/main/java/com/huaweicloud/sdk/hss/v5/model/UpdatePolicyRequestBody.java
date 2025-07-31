package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdatePolicyRequestBody
 */
public class UpdatePolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_list")

    private List<ChkFeatureInfo> featureList = null;

    public UpdatePolicyRequestBody withFeatureList(List<ChkFeatureInfo> featureList) {
        this.featureList = featureList;
        return this;
    }

    public UpdatePolicyRequestBody addFeatureListItem(ChkFeatureInfo featureListItem) {
        if (this.featureList == null) {
            this.featureList = new ArrayList<>();
        }
        this.featureList.add(featureListItem);
        return this;
    }

    public UpdatePolicyRequestBody withFeatureList(Consumer<List<ChkFeatureInfo>> featureListSetter) {
        if (this.featureList == null) {
            this.featureList = new ArrayList<>();
        }
        featureListSetter.accept(this.featureList);
        return this;
    }

    /**
     * 检测特性规则列表
     * @return featureList
     */
    public List<ChkFeatureInfo> getFeatureList() {
        return featureList;
    }

    public void setFeatureList(List<ChkFeatureInfo> featureList) {
        this.featureList = featureList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePolicyRequestBody that = (UpdatePolicyRequestBody) obj;
        return Objects.equals(this.featureList, that.featureList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(featureList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePolicyRequestBody {\n");
        sb.append("    featureList: ").append(toIndentedString(featureList)).append("\n");
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
