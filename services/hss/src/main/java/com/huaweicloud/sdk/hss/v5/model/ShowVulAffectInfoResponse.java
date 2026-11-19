package com.huaweicloud.sdk.hss.v5.model;

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
public class ShowVulAffectInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affect_host_ids")

    private List<String> affectHostIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affect_vul_ids")

    private List<String> affectVulIds = null;

    public ShowVulAffectInfoResponse withAffectHostIds(List<String> affectHostIds) {
        this.affectHostIds = affectHostIds;
        return this;
    }

    public ShowVulAffectInfoResponse addAffectHostIdsItem(String affectHostIdsItem) {
        if (this.affectHostIds == null) {
            this.affectHostIds = new ArrayList<>();
        }
        this.affectHostIds.add(affectHostIdsItem);
        return this;
    }

    public ShowVulAffectInfoResponse withAffectHostIds(Consumer<List<String>> affectHostIdsSetter) {
        if (this.affectHostIds == null) {
            this.affectHostIds = new ArrayList<>();
        }
        affectHostIdsSetter.accept(this.affectHostIds);
        return this;
    }

    /**
     * **参数解释**: 漏洞影响的主机ID列表 **取值范围**: 最小值0，最大值65535 
     * @return affectHostIds
     */
    public List<String> getAffectHostIds() {
        return affectHostIds;
    }

    public void setAffectHostIds(List<String> affectHostIds) {
        this.affectHostIds = affectHostIds;
    }

    public ShowVulAffectInfoResponse withAffectVulIds(List<String> affectVulIds) {
        this.affectVulIds = affectVulIds;
        return this;
    }

    public ShowVulAffectInfoResponse addAffectVulIdsItem(String affectVulIdsItem) {
        if (this.affectVulIds == null) {
            this.affectVulIds = new ArrayList<>();
        }
        this.affectVulIds.add(affectVulIdsItem);
        return this;
    }

    public ShowVulAffectInfoResponse withAffectVulIds(Consumer<List<String>> affectVulIdsSetter) {
        if (this.affectVulIds == null) {
            this.affectVulIds = new ArrayList<>();
        }
        affectVulIdsSetter.accept(this.affectVulIds);
        return this;
    }

    /**
     * **参数解释**: 主机下的漏洞ID列表 **取值范围**: 最小值0，最大值65535 
     * @return affectVulIds
     */
    public List<String> getAffectVulIds() {
        return affectVulIds;
    }

    public void setAffectVulIds(List<String> affectVulIds) {
        this.affectVulIds = affectVulIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVulAffectInfoResponse that = (ShowVulAffectInfoResponse) obj;
        return Objects.equals(this.affectHostIds, that.affectHostIds)
            && Objects.equals(this.affectVulIds, that.affectVulIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(affectHostIds, affectVulIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVulAffectInfoResponse {\n");
        sb.append("    affectHostIds: ").append(toIndentedString(affectHostIds)).append("\n");
        sb.append("    affectVulIds: ").append(toIndentedString(affectVulIds)).append("\n");
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
