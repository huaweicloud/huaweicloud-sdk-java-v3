package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListAkSkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_ak_sk_models")

    private List<AccessAkskVO> accessAkSkModels = null;

    public ListAkSkResponse withAccessAkSkModels(List<AccessAkskVO> accessAkSkModels) {
        this.accessAkSkModels = accessAkSkModels;
        return this;
    }

    public ListAkSkResponse addAccessAkSkModelsItem(AccessAkskVO accessAkSkModelsItem) {
        if (this.accessAkSkModels == null) {
            this.accessAkSkModels = new ArrayList<>();
        }
        this.accessAkSkModels.add(accessAkSkModelsItem);
        return this;
    }

    public ListAkSkResponse withAccessAkSkModels(Consumer<List<AccessAkskVO>> accessAkSkModelsSetter) {
        if (this.accessAkSkModels == null) {
            this.accessAkSkModels = new ArrayList<>();
        }
        accessAkSkModelsSetter.accept(this.accessAkSkModels);
        return this;
    }

    /** Get accessAkSkModels
     * 
     * @return accessAkSkModels */
    public List<AccessAkskVO> getAccessAkSkModels() {
        return accessAkSkModels;
    }

    public void setAccessAkSkModels(List<AccessAkskVO> accessAkSkModels) {
        this.accessAkSkModels = accessAkSkModels;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAkSkResponse listAkSkResponse = (ListAkSkResponse) o;
        return Objects.equals(this.accessAkSkModels, listAkSkResponse.accessAkSkModels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessAkSkModels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAkSkResponse {\n");
        sb.append("    accessAkSkModels: ").append(toIndentedString(accessAkSkModels)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
