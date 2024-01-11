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
public class ListDesktopNamePolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_name_policy_infos")

    private List<DesktopNamePolicyInfo> desktopNamePolicyInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListDesktopNamePolicyResponse withDesktopNamePolicyInfos(
        List<DesktopNamePolicyInfo> desktopNamePolicyInfos) {
        this.desktopNamePolicyInfos = desktopNamePolicyInfos;
        return this;
    }

    public ListDesktopNamePolicyResponse addDesktopNamePolicyInfosItem(
        DesktopNamePolicyInfo desktopNamePolicyInfosItem) {
        if (this.desktopNamePolicyInfos == null) {
            this.desktopNamePolicyInfos = new ArrayList<>();
        }
        this.desktopNamePolicyInfos.add(desktopNamePolicyInfosItem);
        return this;
    }

    public ListDesktopNamePolicyResponse withDesktopNamePolicyInfos(
        Consumer<List<DesktopNamePolicyInfo>> desktopNamePolicyInfosSetter) {
        if (this.desktopNamePolicyInfos == null) {
            this.desktopNamePolicyInfos = new ArrayList<>();
        }
        desktopNamePolicyInfosSetter.accept(this.desktopNamePolicyInfos);
        return this;
    }

    /**
     * 桌面名称策略信息。
     * @return desktopNamePolicyInfos
     */
    public List<DesktopNamePolicyInfo> getDesktopNamePolicyInfos() {
        return desktopNamePolicyInfos;
    }

    public void setDesktopNamePolicyInfos(List<DesktopNamePolicyInfo> desktopNamePolicyInfos) {
        this.desktopNamePolicyInfos = desktopNamePolicyInfos;
    }

    public ListDesktopNamePolicyResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 查询返回总条数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDesktopNamePolicyResponse that = (ListDesktopNamePolicyResponse) obj;
        return Objects.equals(this.desktopNamePolicyInfos, that.desktopNamePolicyInfos)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopNamePolicyInfos, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDesktopNamePolicyResponse {\n");
        sb.append("    desktopNamePolicyInfos: ").append(toIndentedString(desktopNamePolicyInfos)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
