package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新全量防护对象的请求体
 */
public class UpdatePackageIpRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_ip_list")

    private List<UpdateProtectedIpInPolicyBody> protectedIpList = null;

    public UpdatePackageIpRequestBody withProtectedIpList(List<UpdateProtectedIpInPolicyBody> protectedIpList) {
        this.protectedIpList = protectedIpList;
        return this;
    }

    public UpdatePackageIpRequestBody addProtectedIpListItem(UpdateProtectedIpInPolicyBody protectedIpListItem) {
        if (this.protectedIpList == null) {
            this.protectedIpList = new ArrayList<>();
        }
        this.protectedIpList.add(protectedIpListItem);
        return this;
    }

    public UpdatePackageIpRequestBody withProtectedIpList(
        Consumer<List<UpdateProtectedIpInPolicyBody>> protectedIpListSetter) {
        if (this.protectedIpList == null) {
            this.protectedIpList = new ArrayList<>();
        }
        protectedIpListSetter.accept(this.protectedIpList);
        return this;
    }

    /**
     * 全量防护ip列表
     * @return protectedIpList
     */
    public List<UpdateProtectedIpInPolicyBody> getProtectedIpList() {
        return protectedIpList;
    }

    public void setProtectedIpList(List<UpdateProtectedIpInPolicyBody> protectedIpList) {
        this.protectedIpList = protectedIpList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePackageIpRequestBody that = (UpdatePackageIpRequestBody) obj;
        return Objects.equals(this.protectedIpList, that.protectedIpList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectedIpList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePackageIpRequestBody {\n");
        sb.append("    protectedIpList: ").append(toIndentedString(protectedIpList)).append("\n");
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
