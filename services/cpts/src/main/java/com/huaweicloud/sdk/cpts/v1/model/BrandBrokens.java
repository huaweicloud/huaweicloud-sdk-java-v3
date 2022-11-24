package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BrandBrokens
 */
public class BrandBrokens {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recBytes")

    private List<Double> recBytes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sentBytes")

    private List<Double> sentBytes = null;

    public BrandBrokens withRecBytes(List<Double> recBytes) {
        this.recBytes = recBytes;
        return this;
    }

    public BrandBrokens addRecBytesItem(Double recBytesItem) {
        if (this.recBytes == null) {
            this.recBytes = new ArrayList<>();
        }
        this.recBytes.add(recBytesItem);
        return this;
    }

    public BrandBrokens withRecBytes(Consumer<List<Double>> recBytesSetter) {
        if (this.recBytes == null) {
            this.recBytes = new ArrayList<>();
        }
        recBytesSetter.accept(this.recBytes);
        return this;
    }

    /**
     * 接收字节数
     * @return recBytes
     */
    public List<Double> getRecBytes() {
        return recBytes;
    }

    public void setRecBytes(List<Double> recBytes) {
        this.recBytes = recBytes;
    }

    public BrandBrokens withSentBytes(List<Double> sentBytes) {
        this.sentBytes = sentBytes;
        return this;
    }

    public BrandBrokens addSentBytesItem(Double sentBytesItem) {
        if (this.sentBytes == null) {
            this.sentBytes = new ArrayList<>();
        }
        this.sentBytes.add(sentBytesItem);
        return this;
    }

    public BrandBrokens withSentBytes(Consumer<List<Double>> sentBytesSetter) {
        if (this.sentBytes == null) {
            this.sentBytes = new ArrayList<>();
        }
        sentBytesSetter.accept(this.sentBytes);
        return this;
    }

    /**
     * 发送字节数
     * @return sentBytes
     */
    public List<Double> getSentBytes() {
        return sentBytes;
    }

    public void setSentBytes(List<Double> sentBytes) {
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
