package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Packet
 */
public class Packet {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hex_index")

    private String hexIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "utf8_string")

    private String utf8String;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hexs")

    private List<String> hexs = null;

    public Packet withHexIndex(String hexIndex) {
        this.hexIndex = hexIndex;
        return this;
    }

    /**
     * 十六进制码
     * @return hexIndex
     */
    public String getHexIndex() {
        return hexIndex;
    }

    public void setHexIndex(String hexIndex) {
        this.hexIndex = hexIndex;
    }

    public Packet withUtf8String(String utf8String) {
        this.utf8String = utf8String;
        return this;
    }

    /**
     * utf8字符串
     * @return utf8String
     */
    public String getUtf8String() {
        return utf8String;
    }

    public void setUtf8String(String utf8String) {
        this.utf8String = utf8String;
    }

    public Packet withHexs(List<String> hexs) {
        this.hexs = hexs;
        return this;
    }

    public Packet addHexsItem(String hexsItem) {
        if (this.hexs == null) {
            this.hexs = new ArrayList<>();
        }
        this.hexs.add(hexsItem);
        return this;
    }

    public Packet withHexs(Consumer<List<String>> hexsSetter) {
        if (this.hexs == null) {
            this.hexs = new ArrayList<>();
        }
        hexsSetter.accept(this.hexs);
        return this;
    }

    /**
     * 十六进制单个字节码数组
     * @return hexs
     */
    public List<String> getHexs() {
        return hexs;
    }

    public void setHexs(List<String> hexs) {
        this.hexs = hexs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Packet that = (Packet) obj;
        return Objects.equals(this.hexIndex, that.hexIndex) && Objects.equals(this.utf8String, that.utf8String)
            && Objects.equals(this.hexs, that.hexs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hexIndex, utf8String, hexs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Packet {\n");
        sb.append("    hexIndex: ").append(toIndentedString(hexIndex)).append("\n");
        sb.append("    utf8String: ").append(toIndentedString(utf8String)).append("\n");
        sb.append("    hexs: ").append(toIndentedString(hexs)).append("\n");
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
