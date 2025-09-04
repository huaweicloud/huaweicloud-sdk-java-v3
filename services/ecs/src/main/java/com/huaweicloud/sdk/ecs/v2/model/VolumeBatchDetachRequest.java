package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VolumeBatchDetachRequest
 */
public class VolumeBatchDetachRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serverinfo")

    private List<String> serverinfo = null;

    public VolumeBatchDetachRequest withServerinfo(List<String> serverinfo) {
        this.serverinfo = serverinfo;
        return this;
    }

    public VolumeBatchDetachRequest addServerinfoItem(String serverinfoItem) {
        if (this.serverinfo == null) {
            this.serverinfo = new ArrayList<>();
        }
        this.serverinfo.add(serverinfoItem);
        return this;
    }

    public VolumeBatchDetachRequest withServerinfo(Consumer<List<String>> serverinfoSetter) {
        if (this.serverinfo == null) {
            this.serverinfo = new ArrayList<>();
        }
        serverinfoSetter.accept(this.serverinfo);
        return this;
    }

    /**
     * Get serverinfo
     * @return serverinfo
     */
    public List<String> getServerinfo() {
        return serverinfo;
    }

    public void setServerinfo(List<String> serverinfo) {
        this.serverinfo = serverinfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VolumeBatchDetachRequest that = (VolumeBatchDetachRequest) obj;
        return Objects.equals(this.serverinfo, that.serverinfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverinfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeBatchDetachRequest {\n");
        sb.append("    serverinfo: ").append(toIndentedString(serverinfo)).append("\n");
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
