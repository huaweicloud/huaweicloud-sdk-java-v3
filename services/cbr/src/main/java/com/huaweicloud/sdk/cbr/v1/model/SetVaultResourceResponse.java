package com.huaweicloud.sdk.cbr.v1.model;

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
public class SetVaultResourceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "set_resource_ids")

    private List<String> setResourceIds = null;

    public SetVaultResourceResponse withSetResourceIds(List<String> setResourceIds) {
        this.setResourceIds = setResourceIds;
        return this;
    }

    public SetVaultResourceResponse addSetResourceIdsItem(String setResourceIdsItem) {
        if (this.setResourceIds == null) {
            this.setResourceIds = new ArrayList<>();
        }
        this.setResourceIds.add(setResourceIdsItem);
        return this;
    }

    public SetVaultResourceResponse withSetResourceIds(Consumer<List<String>> setResourceIdsSetter) {
        if (this.setResourceIds == null) {
            this.setResourceIds = new ArrayList<>();
        }
        setResourceIdsSetter.accept(this.setResourceIds);
        return this;
    }

    /**
     * 本次设置的资源id列表。
     * @return setResourceIds
     */
    public List<String> getSetResourceIds() {
        return setResourceIds;
    }

    public void setSetResourceIds(List<String> setResourceIds) {
        this.setResourceIds = setResourceIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetVaultResourceResponse that = (SetVaultResourceResponse) obj;
        return Objects.equals(this.setResourceIds, that.setResourceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setResourceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetVaultResourceResponse {\n");
        sb.append("    setResourceIds: ").append(toIndentedString(setResourceIds)).append("\n");
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
