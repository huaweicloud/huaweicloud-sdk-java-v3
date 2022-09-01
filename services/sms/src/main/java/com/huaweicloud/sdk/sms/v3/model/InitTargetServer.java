package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 推荐的目的端服务器配置
 */
public class InitTargetServer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disks")

    @JacksonXmlProperty(localName = "disks")

    private List<DiskIntargetServer> disks = null;

    public InitTargetServer withDisks(List<DiskIntargetServer> disks) {
        this.disks = disks;
        return this;
    }

    public InitTargetServer addDisksItem(DiskIntargetServer disksItem) {
        if (this.disks == null) {
            this.disks = new ArrayList<>();
        }
        this.disks.add(disksItem);
        return this;
    }

    public InitTargetServer withDisks(Consumer<List<DiskIntargetServer>> disksSetter) {
        if (this.disks == null) {
            this.disks = new ArrayList<>();
        }
        disksSetter.accept(this.disks);
        return this;
    }

    /**
     * 推荐的目的端服务器的磁盘信息
     * @return disks
     */
    public List<DiskIntargetServer> getDisks() {
        return disks;
    }

    public void setDisks(List<DiskIntargetServer> disks) {
        this.disks = disks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InitTargetServer initTargetServer = (InitTargetServer) o;
        return Objects.equals(this.disks, initTargetServer.disks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InitTargetServer {\n");
        sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
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
