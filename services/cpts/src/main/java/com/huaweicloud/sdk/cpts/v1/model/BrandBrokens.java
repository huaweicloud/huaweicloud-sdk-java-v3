package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** BrandBrokens */
public class BrandBrokens {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recBytes")

    private List<Integer> recBytes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sentBytes")

    private List<Integer> sentBytes = null;

    public BrandBrokens withRecBytes(List<Integer> recBytes) {
        this.recBytes = recBytes;
        return this;
    }

    public BrandBrokens addRecBytesItem(Integer recBytesItem) {
        if (this.recBytes == null) {
            this.recBytes = new ArrayList<>();
        }
        this.recBytes.add(recBytesItem);
        return this;
    }

    public BrandBrokens withRecBytes(Consumer<List<Integer>> recBytesSetter) {
        if (this.recBytes == null) {
            this.recBytes = new ArrayList<>();
        }
        recBytesSetter.accept(this.recBytes);
        return this;
    }

    /** Get recBytes
     * 
     * @return recBytes */
    public List<Integer> getRecBytes() {
        return recBytes;
    }

    public void setRecBytes(List<Integer> recBytes) {
        this.recBytes = recBytes;
    }

    public BrandBrokens withSentBytes(List<Integer> sentBytes) {
        this.sentBytes = sentBytes;
        return this;
    }

    public BrandBrokens addSentBytesItem(Integer sentBytesItem) {
        if (this.sentBytes == null) {
            this.sentBytes = new ArrayList<>();
        }
        this.sentBytes.add(sentBytesItem);
        return this;
    }

    public BrandBrokens withSentBytes(Consumer<List<Integer>> sentBytesSetter) {
        if (this.sentBytes == null) {
            this.sentBytes = new ArrayList<>();
        }
        sentBytesSetter.accept(this.sentBytes);
        return this;
    }

    /** Get sentBytes
     * 
     * @return sentBytes */
    public List<Integer> getSentBytes() {
        return sentBytes;
    }

    public void setSentBytes(List<Integer> sentBytes) {
        this.sentBytes = sentBytes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrandBrokens brandBrokens = (BrandBrokens) o;
        return Objects.equals(this.recBytes, brandBrokens.recBytes)
            && Objects.equals(this.sentBytes, brandBrokens.sentBytes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recBytes, sentBytes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrandBrokens {\n");
        sb.append("    recBytes: ").append(toIndentedString(recBytes)).append("\n");
        sb.append("    sentBytes: ").append(toIndentedString(sentBytes)).append("\n");
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
