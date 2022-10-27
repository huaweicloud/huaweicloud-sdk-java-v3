package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 需要解绑的网卡列表信息
 */
public class DeleteServerNicsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private List<ServerNics> nics = null;

    public DeleteServerNicsReq withNics(List<ServerNics> nics) {
        this.nics = nics;
        return this;
    }

    public DeleteServerNicsReq addNicsItem(ServerNics nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public DeleteServerNicsReq withNics(Consumer<List<ServerNics>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * 
     * @return nics
     */
    public List<ServerNics> getNics() {
        return nics;
    }

    public void setNics(List<ServerNics> nics) {
        this.nics = nics;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteServerNicsReq deleteServerNicsReq = (DeleteServerNicsReq) o;
        return Objects.equals(this.nics, deleteServerNicsReq.nics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteServerNicsReq {\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
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
