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
public class CheckSysprepInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sysprep_infos")

    private List<DesktopSysprepInfo> sysprepInfos = null;

    public CheckSysprepInfoResponse withSysprepInfos(List<DesktopSysprepInfo> sysprepInfos) {
        this.sysprepInfos = sysprepInfos;
        return this;
    }

    public CheckSysprepInfoResponse addSysprepInfosItem(DesktopSysprepInfo sysprepInfosItem) {
        if (this.sysprepInfos == null) {
            this.sysprepInfos = new ArrayList<>();
        }
        this.sysprepInfos.add(sysprepInfosItem);
        return this;
    }

    public CheckSysprepInfoResponse withSysprepInfos(Consumer<List<DesktopSysprepInfo>> sysprepInfosSetter) {
        if (this.sysprepInfos == null) {
            this.sysprepInfos = new ArrayList<>();
        }
        sysprepInfosSetter.accept(this.sysprepInfos);
        return this;
    }

    /**
     * 桌面Sysprep信息。
     * @return sysprepInfos
     */
    public List<DesktopSysprepInfo> getSysprepInfos() {
        return sysprepInfos;
    }

    public void setSysprepInfos(List<DesktopSysprepInfo> sysprepInfos) {
        this.sysprepInfos = sysprepInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckSysprepInfoResponse that = (CheckSysprepInfoResponse) obj;
        return Objects.equals(this.sysprepInfos, that.sysprepInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sysprepInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckSysprepInfoResponse {\n");
        sb.append("    sysprepInfos: ").append(toIndentedString(sysprepInfos)).append("\n");
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
