package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** This is a auto create Body Object */
public class BatchAttachSharableVolumesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serverinfo")

    private List<BatchAttachSharableVolumesOption> serverinfo = null;

    public BatchAttachSharableVolumesRequestBody withServerinfo(List<BatchAttachSharableVolumesOption> serverinfo) {
        this.serverinfo = serverinfo;
        return this;
    }

    public BatchAttachSharableVolumesRequestBody addServerinfoItem(BatchAttachSharableVolumesOption serverinfoItem) {
        if (this.serverinfo == null) {
            this.serverinfo = new ArrayList<>();
        }
        this.serverinfo.add(serverinfoItem);
        return this;
    }

    public BatchAttachSharableVolumesRequestBody withServerinfo(
        Consumer<List<BatchAttachSharableVolumesOption>> serverinfoSetter) {
        if (this.serverinfo == null) {
            this.serverinfo = new ArrayList<>();
        }
        serverinfoSetter.accept(this.serverinfo);
        return this;
    }

    /** 共享磁盘需要挂载的弹性云服务器列表。
     * 
     * @return serverinfo */
    public List<BatchAttachSharableVolumesOption> getServerinfo() {
        return serverinfo;
    }

    public void setServerinfo(List<BatchAttachSharableVolumesOption> serverinfo) {
        this.serverinfo = serverinfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchAttachSharableVolumesRequestBody batchAttachSharableVolumesRequestBody =
            (BatchAttachSharableVolumesRequestBody) o;
        return Objects.equals(this.serverinfo, batchAttachSharableVolumesRequestBody.serverinfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverinfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAttachSharableVolumesRequestBody {\n");
        sb.append("    serverinfo: ").append(toIndentedString(serverinfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
