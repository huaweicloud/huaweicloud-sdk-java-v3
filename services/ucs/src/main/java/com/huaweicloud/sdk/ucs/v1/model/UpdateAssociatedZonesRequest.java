package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateAssociatedZonesRequest
 */
public class UpdateAssociatedZonesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dnsSuffix")

    private List<String> dnsSuffix = null;

    public UpdateAssociatedZonesRequest withDnsSuffix(List<String> dnsSuffix) {
        this.dnsSuffix = dnsSuffix;
        return this;
    }

    public UpdateAssociatedZonesRequest addDnsSuffixItem(String dnsSuffixItem) {
        if (this.dnsSuffix == null) {
            this.dnsSuffix = new ArrayList<>();
        }
        this.dnsSuffix.add(dnsSuffixItem);
        return this;
    }

    public UpdateAssociatedZonesRequest withDnsSuffix(Consumer<List<String>> dnsSuffixSetter) {
        if (this.dnsSuffix == null) {
            this.dnsSuffix = new ArrayList<>();
        }
        dnsSuffixSetter.accept(this.dnsSuffix);
        return this;
    }

    /**
     * 在联邦管理的域名访问功能中，用于更改根域名
     * @return dnsSuffix
     */
    public List<String> getDnsSuffix() {
        return dnsSuffix;
    }

    public void setDnsSuffix(List<String> dnsSuffix) {
        this.dnsSuffix = dnsSuffix;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAssociatedZonesRequest that = (UpdateAssociatedZonesRequest) obj;
        return Objects.equals(this.dnsSuffix, that.dnsSuffix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnsSuffix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAssociatedZonesRequest {\n");
        sb.append("    dnsSuffix: ").append(toIndentedString(dnsSuffix)).append("\n");
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
