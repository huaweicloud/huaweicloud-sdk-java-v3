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
public class ListDesktopDetachInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_detach_infos")

    private List<DesktopDetachInfo> desktopDetachInfos = null;

    public ListDesktopDetachInfoResponse withDesktopDetachInfos(List<DesktopDetachInfo> desktopDetachInfos) {
        this.desktopDetachInfos = desktopDetachInfos;
        return this;
    }

    public ListDesktopDetachInfoResponse addDesktopDetachInfosItem(DesktopDetachInfo desktopDetachInfosItem) {
        if (this.desktopDetachInfos == null) {
            this.desktopDetachInfos = new ArrayList<>();
        }
        this.desktopDetachInfos.add(desktopDetachInfosItem);
        return this;
    }

    public ListDesktopDetachInfoResponse withDesktopDetachInfos(
        Consumer<List<DesktopDetachInfo>> desktopDetachInfosSetter) {
        if (this.desktopDetachInfos == null) {
            this.desktopDetachInfos = new ArrayList<>();
        }
        desktopDetachInfosSetter.accept(this.desktopDetachInfos);
        return this;
    }

    /**
     * 桌面解绑信息。
     * @return desktopDetachInfos
     */
    public List<DesktopDetachInfo> getDesktopDetachInfos() {
        return desktopDetachInfos;
    }

    public void setDesktopDetachInfos(List<DesktopDetachInfo> desktopDetachInfos) {
        this.desktopDetachInfos = desktopDetachInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDesktopDetachInfoResponse that = (ListDesktopDetachInfoResponse) obj;
        return Objects.equals(this.desktopDetachInfos, that.desktopDetachInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopDetachInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDesktopDetachInfoResponse {\n");
        sb.append("    desktopDetachInfos: ").append(toIndentedString(desktopDetachInfos)).append("\n");
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
