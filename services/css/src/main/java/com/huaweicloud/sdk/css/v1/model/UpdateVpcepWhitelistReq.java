package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** UpdateVpcepWhitelistReq */
public class UpdateVpcepWhitelistReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcPermissions")

    private List<String> vpcPermissions = null;

    public UpdateVpcepWhitelistReq withVpcPermissions(List<String> vpcPermissions) {
        this.vpcPermissions = vpcPermissions;
        return this;
    }

    public UpdateVpcepWhitelistReq addVpcPermissionsItem(String vpcPermissionsItem) {
        if (this.vpcPermissions == null) {
            this.vpcPermissions = new ArrayList<>();
        }
        this.vpcPermissions.add(vpcPermissionsItem);
        return this;
    }

    public UpdateVpcepWhitelistReq withVpcPermissions(Consumer<List<String>> vpcPermissionsSetter) {
        if (this.vpcPermissions == null) {
            this.vpcPermissions = new ArrayList<>();
        }
        vpcPermissionsSetter.accept(this.vpcPermissions);
        return this;
    }

    /** 白名单(用户的账号ID)。
     * 
     * @return vpcPermissions */
    public List<String> getVpcPermissions() {
        return vpcPermissions;
    }

    public void setVpcPermissions(List<String> vpcPermissions) {
        this.vpcPermissions = vpcPermissions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateVpcepWhitelistReq updateVpcepWhitelistReq = (UpdateVpcepWhitelistReq) o;
        return Objects.equals(this.vpcPermissions, updateVpcepWhitelistReq.vpcPermissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcPermissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpcepWhitelistReq {\n");
        sb.append("    vpcPermissions: ").append(toIndentedString(vpcPermissions)).append("\n");
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
