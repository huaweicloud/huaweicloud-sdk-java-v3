package com.huaweicloud.sdk.workspace.v2.model;

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
public class CheckCidrResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manage_cidrs")

    private List<String> manageCidrs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conflict_cidrs")

    private List<String> conflictCidrs = null;

    public CheckCidrResponse withManageCidrs(List<String> manageCidrs) {
        this.manageCidrs = manageCidrs;
        return this;
    }

    public CheckCidrResponse addManageCidrsItem(String manageCidrsItem) {
        if (this.manageCidrs == null) {
            this.manageCidrs = new ArrayList<>();
        }
        this.manageCidrs.add(manageCidrsItem);
        return this;
    }

    public CheckCidrResponse withManageCidrs(Consumer<List<String>> manageCidrsSetter) {
        if (this.manageCidrs == null) {
            this.manageCidrs = new ArrayList<>();
        }
        manageCidrsSetter.accept(this.manageCidrs);
        return this;
    }

    /**
     * 规划的冲突网段
     * @return manageCidrs
     */
    public List<String> getManageCidrs() {
        return manageCidrs;
    }

    public void setManageCidrs(List<String> manageCidrs) {
        this.manageCidrs = manageCidrs;
    }

    public CheckCidrResponse withConflictCidrs(List<String> conflictCidrs) {
        this.conflictCidrs = conflictCidrs;
        return this;
    }

    public CheckCidrResponse addConflictCidrsItem(String conflictCidrsItem) {
        if (this.conflictCidrs == null) {
            this.conflictCidrs = new ArrayList<>();
        }
        this.conflictCidrs.add(conflictCidrsItem);
        return this;
    }

    public CheckCidrResponse withConflictCidrs(Consumer<List<String>> conflictCidrsSetter) {
        if (this.conflictCidrs == null) {
            this.conflictCidrs = new ArrayList<>();
        }
        conflictCidrsSetter.accept(this.conflictCidrs);
        return this;
    }

    /**
     * 租户网段与冲突网段的重叠部分
     * @return conflictCidrs
     */
    public List<String> getConflictCidrs() {
        return conflictCidrs;
    }

    public void setConflictCidrs(List<String> conflictCidrs) {
        this.conflictCidrs = conflictCidrs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckCidrResponse that = (CheckCidrResponse) obj;
        return Objects.equals(this.manageCidrs, that.manageCidrs)
            && Objects.equals(this.conflictCidrs, that.conflictCidrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manageCidrs, conflictCidrs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckCidrResponse {\n");
        sb.append("    manageCidrs: ").append(toIndentedString(manageCidrs)).append("\n");
        sb.append("    conflictCidrs: ").append(toIndentedString(conflictCidrs)).append("\n");
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
