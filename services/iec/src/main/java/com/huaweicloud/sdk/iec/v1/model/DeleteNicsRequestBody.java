package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 删除网卡请求体。
 */
public class DeleteNicsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    @JacksonXmlProperty(localName = "nics")

    private List<NicId> nics = null;

    public DeleteNicsRequestBody withNics(List<NicId> nics) {
        this.nics = nics;
        return this;
    }

    public DeleteNicsRequestBody addNicsItem(NicId nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public DeleteNicsRequestBody withNics(Consumer<List<NicId>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * 待删除网卡信息。
     * @return nics
     */
    public List<NicId> getNics() {
        return nics;
    }

    public void setNics(List<NicId> nics) {
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
        DeleteNicsRequestBody deleteNicsRequestBody = (DeleteNicsRequestBody) o;
        return Objects.equals(this.nics, deleteNicsRequestBody.nics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteNicsRequestBody {\n");
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
