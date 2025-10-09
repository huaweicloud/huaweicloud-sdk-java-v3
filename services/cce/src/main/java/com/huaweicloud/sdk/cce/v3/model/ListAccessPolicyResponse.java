package com.huaweicloud.sdk.cce.v3.model;

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
public class ListAccessPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessPolicyList")

    private List<AccessPolicyResp> accessPolicyList = null;

    public ListAccessPolicyResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释：** API类型。 **约束限制：** 该值不可修改。 **取值范围：** 不涉及 **默认取值：** List
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ListAccessPolicyResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释：** API版本。 **约束限制：** 该值不可修改。 **取值范围：** 不涉及 **默认取值：** v3
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ListAccessPolicyResponse withAccessPolicyList(List<AccessPolicyResp> accessPolicyList) {
        this.accessPolicyList = accessPolicyList;
        return this;
    }

    public ListAccessPolicyResponse addAccessPolicyListItem(AccessPolicyResp accessPolicyListItem) {
        if (this.accessPolicyList == null) {
            this.accessPolicyList = new ArrayList<>();
        }
        this.accessPolicyList.add(accessPolicyListItem);
        return this;
    }

    public ListAccessPolicyResponse withAccessPolicyList(Consumer<List<AccessPolicyResp>> accessPolicyListSetter) {
        if (this.accessPolicyList == null) {
            this.accessPolicyList = new ArrayList<>();
        }
        accessPolicyListSetter.accept(this.accessPolicyList);
        return this;
    }

    /**
     * Get accessPolicyList
     * @return accessPolicyList
     */
    public List<AccessPolicyResp> getAccessPolicyList() {
        return accessPolicyList;
    }

    public void setAccessPolicyList(List<AccessPolicyResp> accessPolicyList) {
        this.accessPolicyList = accessPolicyList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAccessPolicyResponse that = (ListAccessPolicyResponse) obj;
        return Objects.equals(this.kind, that.kind) && Objects.equals(this.apiVersion, that.apiVersion)
            && Objects.equals(this.accessPolicyList, that.accessPolicyList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, accessPolicyList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccessPolicyResponse {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    accessPolicyList: ").append(toIndentedString(accessPolicyList)).append("\n");
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
