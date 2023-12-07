package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ChannelCreateReqPrincipal
 */
public class ChannelCreateReqPrincipal {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "IAM")

    private List<String> iam = null;

    public ChannelCreateReqPrincipal withIam(List<String> iam) {
        this.iam = iam;
        return this;
    }

    public ChannelCreateReqPrincipal addIamItem(String iamItem) {
        if (this.iam == null) {
            this.iam = new ArrayList<>();
        }
        this.iam.add(iamItem);
        return this;
    }

    public ChannelCreateReqPrincipal withIam(Consumer<List<String>> iamSetter) {
        if (this.iam == null) {
            this.iam = new ArrayList<>();
        }
        iamSetter.accept(this.iam);
        return this;
    }

    /**
     * Get iam
     * @return iam
     */
    public List<String> getIam() {
        return iam;
    }

    public void setIam(List<String> iam) {
        this.iam = iam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChannelCreateReqPrincipal that = (ChannelCreateReqPrincipal) obj;
        return Objects.equals(this.iam, that.iam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChannelCreateReqPrincipal {\n");
        sb.append("    iam: ").append(toIndentedString(iam)).append("\n");
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
