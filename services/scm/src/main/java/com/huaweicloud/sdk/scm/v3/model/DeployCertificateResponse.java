package com.huaweicloud.sdk.scm.v3.model;

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
public class DeployCertificateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_list")

    private List<FaiureResource> failureList = null;

    public DeployCertificateResponse withFailureList(List<FaiureResource> failureList) {
        this.failureList = failureList;
        return this;
    }

    public DeployCertificateResponse addFailureListItem(FaiureResource failureListItem) {
        if (this.failureList == null) {
            this.failureList = new ArrayList<>();
        }
        this.failureList.add(failureListItem);
        return this;
    }

    public DeployCertificateResponse withFailureList(Consumer<List<FaiureResource>> failureListSetter) {
        if (this.failureList == null) {
            this.failureList = new ArrayList<>();
        }
        failureListSetter.accept(this.failureList);
        return this;
    }

    /**
     * 部署失败的资源列表。
     * @return failureList
     */
    public List<FaiureResource> getFailureList() {
        return failureList;
    }

    public void setFailureList(List<FaiureResource> failureList) {
        this.failureList = failureList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeployCertificateResponse that = (DeployCertificateResponse) obj;
        return Objects.equals(this.failureList, that.failureList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failureList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployCertificateResponse {\n");
        sb.append("    failureList: ").append(toIndentedString(failureList)).append("\n");
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
